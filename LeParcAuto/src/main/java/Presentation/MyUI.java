package Presentation;

import Metier.Vehicule;
import Metier.Visiteur;
import Persistance.Init;
import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("com.mycompany.leparcauto.MyAppWidgetset")
public class MyUI extends UI {

    private Grid contactList = new Grid();
    private Grid contactList2 = new Grid();
    private Grid contactList3 = new Grid();
    private double prix = 15000;
    //private Table contactTable = new Table();

    @Override
    protected void init(VaadinRequest vaadinrequest) {
        configureComponents();  // configuration des composants
        buildLayout();          //  construction de la vue
    }
    
    private void configureComponents() {
        
        Init.initJeu();

        contactList.setContainerDataSource(Vehicule.getVehicules());
        contactList.setColumnOrder("marque", "modele", "prix");  // choisir l'ordre des colonnes
        contactList.removeColumn("id");  // masquer la colonne
        contactList.setSelectionMode(Grid.SelectionMode.SINGLE);//était en commenter
        contactList.setSizeFull();
        
        contactList3.setContainerDataSource(Vehicule.getVehiculesPrixHaut(prix));
        contactList3.setColumnOrder("marque", "modele", "prix");  // choisir l'ordre des colonnes
        contactList3.removeColumn("id");  // masquer la colonne
        contactList3.setSelectionMode(Grid.SelectionMode.SINGLE);//était en commenter
        contactList3.setSizeFull();
        
        contactList2.setContainerDataSource(Visiteur.getVisiteur()); 
        contactList2.setColumnOrder("nom","prenom","adresse","codePostal");
        contactList2.removeColumn("id");
        //contactList2.removeColumn("utilise");
        contactList2.setSelectionMode(Grid.SelectionMode.SINGLE);//était en commenter
        contactList2.setSizeFull();
    }

    private void buildLayout() {

        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        // ajouts de composants
        layout.addComponent(new Label(" Parc de véhicule"));
        layout.addComponent(contactList);
        layout.addComponent(new Label(" Vistieur"));
        layout.addComponent(contactList2);
        layout.addComponent(new Label(" Parc de véhicule coutant plus de "+ prix +" €"));
        layout.addComponent(contactList3);
        //layout.addComponent(contactTable); //était commenter
        
        setContent(layout);  // affectation de la vue
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
