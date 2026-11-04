package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.function.IntConsumer;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/* JADX INFO: renamed from: l.ۖۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2484 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ErrorHandler f7948 = new C12179();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8450 f7949;

    public C2484(C8450 c8450) {
        this.f7949 = c8450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8341(StringReader stringReader, C3976 c3976) throws IOException {
        AbstractC21130 abstractC21130M25772 = C9941.m25772(stringReader);
        c3976.f13620 += abstractC21130M25772.mo24355();
        if (!c3976.f13622) {
            boolean z = abstractC21130M25772 instanceof C0993;
            if (!z && c3976.f13621.lastIndexOf("\n") != c3976.f13621.length() - 1 && c3976.f13621.lastIndexOf("\r") != c3976.f13621.length() - 1) {
                c3976.f13621.append("\n");
            }
            if (!z) {
                int i = c3976.f13620;
                final StringBuilder sb = c3976.f13621;
                C11719.range(0, i).forEach(new IntConsumer() { // from class: l.᩵ۛ᩻
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i2) {
                        sb.append(this.f65357.f7949.m22633());
                    }

                    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                        return C4109.$default$andThen(this, intConsumer);
                    }
                });
            }
        }
        if (abstractC21130M25772 instanceof C9195) {
            final StringBuilder sb2 = new StringBuilder(30);
            C11719.range(0, c3976.f13620).forEach(new IntConsumer() { // from class: l.᩵ۛ᩻
                @Override // java.util.function.IntConsumer
                public final void accept(int i2) {
                    sb2.append(this.f65357.f7949.m22633());
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C4109.$default$andThen(this, intConsumer);
                }
            });
            StringBuilder sb3 = c3976.f13621;
            String strM48230 = abstractC21130M25772.m48230();
            String string = sb2.toString();
            if (!strM48230.startsWith("</") && !strM48230.startsWith("<%") && !strM48230.startsWith("<?") && !strM48230.startsWith("<[")) {
                try {
                    strM48230 = new C22401(this.f7949).m50475(new C23147().m52066(strM48230), string);
                } catch (C13670 unused) {
                }
            }
            sb3.append(strM48230);
        } else {
            c3976.f13621.append(abstractC21130M25772.m48230());
        }
        c3976.f13620 += abstractC21130M25772.mo24356();
        c3976.f13622 = abstractC21130M25772.mo3873();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m8343(String str) {
        C8450 c8450 = this.f7949;
        if (!c8450.m22636().equals("IGNORE")) {
            try {
                SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
                sAXParserFactoryNewInstance.setValidating(false);
                sAXParserFactoryNewInstance.setNamespaceAware(true);
                XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
                xMLReader.setErrorHandler(f7948);
                xMLReader.parse(new InputSource(new StringReader(str)));
            } catch (Exception e) {
                if ((e instanceof SAXParseException) && c8450.m22636().equals("WARN")) {
                    System.err.println("WARN: " + e.getMessage());
                } else {
                    throw new IllegalArgumentException(e);
                }
            }
        }
        StringReader stringReader = new StringReader(str);
        C3976 c3976 = new C3976();
        while (true) {
            try {
                stringReader.mark(1);
                int i = stringReader.read();
                stringReader.reset();
                if (i == -1) {
                    break;
                }
                m8341(stringReader, c3976);
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
        stringReader.close();
        return c3976.f13621.toString();
    }
}
