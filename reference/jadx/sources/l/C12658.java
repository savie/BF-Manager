package l;

import com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import javax.xml.namespace.QName;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.ۨ᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ACF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12658 implements Converter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Class f40582;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Persister f40583;

    @Override // org.simpleframework.xml.convert.Converter
    public final void write(OutputNode outputNode, Object obj) throws IllegalAccessException, InvocationTargetException {
        EntityWithAnyElement entityWithAnyElement = (EntityWithAnyElement) obj;
        for (Element element : entityWithAnyElement.getAny()) {
            OutputNode child = outputNode.getChild(element.getNodeName());
            child.getNamespaces().setReference(element.getNamespaceURI(), element.getPrefix());
            child.setValue(element.getTextContent());
            child.commit();
        }
        HashMap mapM31430 = m31430();
        for (String str : mapM31430.keySet()) {
            String name = ((Field) mapM31430.get(str)).getName();
            Object objInvoke = this.f40582.getMethod("get" + (name.substring(0, 1).toUpperCase() + name.substring(1)), null).invoke(entityWithAnyElement, null);
            if (objInvoke != null) {
                if (objInvoke instanceof String) {
                    OutputNode child2 = outputNode.getChild(str);
                    child2.setReference("DAV:");
                    child2.setValue((String) objInvoke);
                } else {
                    this.f40583.write(objInvoke, outputNode);
                }
            }
        }
    }

    public C12658(Persister persister, Class cls) {
        this.f40583 = persister;
        this.f40582 = cls;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private HashMap m31430() {
        HashMap map = new HashMap();
        for (Field field : this.f40582.getDeclaredFields()) {
            org.simpleframework.xml.Element element = (org.simpleframework.xml.Element) field.getAnnotation(org.simpleframework.xml.Element.class);
            if (element != null) {
                map.put(element.name().equals("") ? field.getName() : element.name(), field);
            }
        }
        return map;
    }

    @Override // org.simpleframework.xml.convert.Converter
    public final Object read(InputNode inputNode) throws IllegalAccessException, InvocationTargetException {
        HashMap mapM31430 = m31430();
        Class cls = this.f40582;
        EntityWithAnyElement entityWithAnyElement = (EntityWithAnyElement) cls.newInstance();
        List any = entityWithAnyElement.getAny();
        while (true) {
            InputNode next = inputNode.getNext();
            if (next == null) {
                return entityWithAnyElement;
            }
            if (mapM31430.containsKey(next.getName())) {
                Field field = (Field) mapM31430.get(next.getName());
                String name = field.getName();
                cls.getMethod(C25272.m56409("set", name.substring(0, 1).toUpperCase() + name.substring(1)), field.getType()).invoke(entityWithAnyElement, this.f40583.read((Class) field.getType(), next));
            } else if (next.getPrefix() == null || next.getPrefix().isEmpty()) {
                while (next.getNext() != null) {
                }
            } else {
                Element elementM18716 = C6693.m18716(new QName(next.getReference(), next.getName(), next.getPrefix()));
                elementM18716.setTextContent(next.getValue());
                any.add(elementM18716);
            }
        }
    }
}
