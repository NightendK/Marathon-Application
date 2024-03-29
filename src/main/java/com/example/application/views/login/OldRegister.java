package com.example.application.views.login;

import com.example.application.views.SignIn.SignInView42;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Section;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.lineawesome.LineAwesomeIcon;

//@Route("/register")
@CssImport("./styles/views/register/register-view.css")
public class OldRegister extends Section {

    private final Scroller scroller = new Scroller();
    private final Button button42 = new Button("42Km Race" + "\n" + " 45$");
    private final Button button21 = new Button("21Km Race");
    private final Button button10 = new Button("10Km Race");
    private final Button buttonCopii = new Button("Children Race");

    public final VerticalLayout buttons = new VerticalLayout(button42, button21, button10, buttonCopii);

    public OldRegister() {
        setId("register-view");
        setMaxWidth("100%");
        setWidth("360px");

        H2 createNewTitle = new H2("Register");
        createNewTitle.getStyle().set("margin-left", "var(--lumo-space-m)")
                .set("margin-right", "var(--lumo-space-m)");
        createNewTitle.setId("title");
        createNewTitle.getStyle().set("text-align", "center");
        add(createNewTitle);

        scroller.setScrollDirection(Scroller.ScrollDirection.VERTICAL);

        button42.setIcon(LineAwesomeIcon.RUNNING_SOLID.create());
        button42.setHeight("100px");
        button42.setWidth("250px");
        button42.setId("button42Km");
        button42.addClickListener(e -> {
            UI.getCurrent().navigate(SignInView42.class);
        });

        button21.setIcon(LineAwesomeIcon.RUNNING_SOLID.create());
        button21.setHeight("100px");
        button21.setWidth("250px");
        button21.setId("button21Km");

        button10.setIcon(LineAwesomeIcon.RUNNING_SOLID.create());
        button10.setHeight("100px");
        button10.setWidth("250px");
        button10.setId("button10Km");

        buttonCopii.setIcon(LineAwesomeIcon.RUNNING_SOLID.create());
        buttonCopii.setHeight("100px");
        buttonCopii.setWidth("250px");
        buttonCopii.setId("buttonCopii");

        buttons.setPadding(true);
        buttons.getStyle().set("display", "flex");
        scroller.setContent(buttons);
        add(scroller);

    }
}
