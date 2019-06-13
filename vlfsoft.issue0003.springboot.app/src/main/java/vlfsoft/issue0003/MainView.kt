package vlfsoft.issue0003

import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.HasElement
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.formlayout.FormLayout
import com.vaadin.flow.component.grid.GridVariant
import com.vaadin.flow.component.html.Anchor
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route
import com.vaadin.flow.server.AbstractStreamResource
import com.vaadin.flow.server.InputStreamFactory
import com.vaadin.flow.server.StreamResource
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

var HasElement.tooltipsText: String?
    get() = element.getProperty("title")
    set(value) {
        element.setProperty("title", value)
    }

@Suppress("unused")
@Route
class MainView : VerticalLayout() {

    init {

        height = "100vh"

        label("issue0003")

        button("enabled with tooltips. Tooltips are displayed") {
            isEnabled = true
            tooltipsText = "Tooltips are displayed"
        }

        button("disabled with tooltips. Tooltips are not displayed") {
            isEnabled = false
            tooltipsText = "Tooltips are not displayed"
        }

    }

}

// Anchor

