package l;

import com.google.android.material.datepicker.UtcDates;
import com.thegrizzlylabs.sardineandroid.model.Prop;
import com.thegrizzlylabs.sardineandroid.model.Property;
import com.thegrizzlylabs.sardineandroid.model.Propfind;
import com.thegrizzlylabs.sardineandroid.model.Resourcetype;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.simpleframework.xml.convert.Registry;
import org.simpleframework.xml.convert.RegistryStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: l.᩹֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UA6Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C21938 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final DocumentBuilderFactory f71166 = DocumentBuilderFactory.newInstance();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71167 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f71168;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final List f71169;

    static {
        String[] strArr = {"yyyy-MM-dd'T'HH:mm:ss'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "EEE MMM dd HH:mm:ss zzz yyyy", "EEEEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMMM d HH:mm:ss yyyy"};
        f71168 = strArr;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < f71168.length; i++) {
            arrayList.add(new ThreadLocal());
        }
        f71169 = C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Date m48763(String str) {
        Date date = null;
        if (str == null) {
            return null;
        }
        int i = 0;
        while (true) {
            List list = f71169;
            if (i >= list.size()) {
                break;
            }
            ThreadLocal threadLocal = (ThreadLocal) list.get(i);
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat(f71168[i], Locale.US);
                simpleDateFormat.setTimeZone(C12557.getTimeZone(UtcDates.UTC));
                threadLocal.set(simpleDateFormat);
            }
            try {
                continue;
                date = simpleDateFormat.parse(str);
                break;
            } catch (ParseException unused) {
                i++;
            }
        }
        return date;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Persister m48765() {
        Format format = new Format("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        Registry registry = new Registry();
        Persister persister = new Persister(new RegistryStrategy(registry), format);
        registry.bind(Prop.class, new C5004(persister, Prop.class));
        registry.bind(Resourcetype.class, new C5004(persister, Resourcetype.class));
        registry.bind(Property.class, Property.PropertyConverter.class);
        return persister;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m48761(Class cls, InputStream inputStream) throws IOException {
        try {
            return m48765().read(cls, inputStream);
        } catch (SAXException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (Exception e2) {
            throw new IOException("Not a valid DAV response", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48762(Propfind propfind) {
        StringWriter stringWriter = new StringWriter();
        try {
            m48765().write(propfind, stringWriter);
            return stringWriter.toString();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Element m48766(QName qName) {
        try {
            return f71166.newDocumentBuilder().newDocument().createElementNS(qName.getNamespaceURI(), qName.getPrefix() + ":" + qName.getLocalPart());
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static QName m48764(Element element) {
        if (element.getNamespaceURI() == null) {
            return new QName("DAV:", element.getLocalName(), "D");
        }
        if (element.getPrefix() == null) {
            return new QName(element.getNamespaceURI(), element.getLocalName());
        }
        return new QName(element.getNamespaceURI(), element.getLocalName(), element.getPrefix());
    }
}
