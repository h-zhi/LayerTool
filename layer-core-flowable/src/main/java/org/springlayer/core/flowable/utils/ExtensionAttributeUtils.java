package org.springlayer.core.flowable.utils;

import org.flowable.bpmn.model.ExtensionAttribute;
import org.flowable.editor.language.json.converter.BpmnJsonConverter;

public class ExtensionAttributeUtils {

    public static ExtensionAttribute generate(String key, String val) {
        ExtensionAttribute ea = new ExtensionAttribute();
        ea.setNamespace(BpmnJsonConverter.MODELER_NAMESPACE);
        ea.setName(key);
        ea.setNamespacePrefix("custom");
        ea.setValue(val);
        return ea;
    }

}
