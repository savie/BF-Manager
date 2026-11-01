package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.function.IntConsumer;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/* JADX INFO: renamed from: l.ۘ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4240 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ErrorHandler f15328 = new C23500();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7063 f15329;

    public C4240(C7063 c7063) {
        this.f15329 = c7063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11894(StringReader stringReader, C9389 c9389) throws IOException {
        AbstractC4946 abstractC4946M50094 = C22586.m50094(stringReader);
        c9389.f31780 += abstractC4946M50094.mo13736();
        if (!c9389.f31782) {
            boolean z = abstractC4946M50094 instanceof C1418;
            if (!z && c9389.f31781.lastIndexOf("\n") != c9389.f31781.length() - 1 && c9389.f31781.lastIndexOf("\r") != c9389.f31781.length() - 1) {
                c9389.f31781.append("\n");
            }
            if (!z) {
                int i = c9389.f31780;
                final StringBuilder sb = c9389.f31781;
                C9653.range(0, i).forEach(new IntConsumer() { // from class: l.ۧۚ᩺
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i2) {
                        sb.append(this.f36771.f15329.m18930());
                    }

                    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                        return C7100.$default$andThen(this, intConsumer);
                    }
                });
            }
        }
        if (abstractC4946M50094 instanceof C13414) {
            final StringBuilder sb2 = new StringBuilder(30);
            C9653.range(0, c9389.f31780).forEach(new IntConsumer() { // from class: l.ۧۚ᩺
                @Override // java.util.function.IntConsumer
                public final void accept(int i2) {
                    sb2.append(this.f36771.f15329.m18930());
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return C7100.$default$andThen(this, intConsumer);
                }
            });
            StringBuilder sb3 = c9389.f31781;
            String strM13734 = abstractC4946M50094.m13734();
            String string = sb2.toString();
            if (!strM13734.startsWith("</") && !strM13734.startsWith("<%") && !strM13734.startsWith("<?") && !strM13734.startsWith("<[")) {
                try {
                    strM13734 = new C18352(this.f15329).m42610(new C8475().m22138(strM13734), string);
                } catch (C15531 unused) {
                }
            }
            sb3.append(strM13734);
        } else {
            c9389.f31781.append(abstractC4946M50094.m13734());
        }
        c9389.f31780 += abstractC4946M50094.mo13737();
        c9389.f31782 = abstractC4946M50094.mo4960();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m11896(String str) {
        StringReader stringReader;
        C9389 c9389;
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setValidating(false);
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(f15328);
            xMLReader.parse(new InputSource(new StringReader(str)));
            while (true) {
                try {
                    stringReader.mark(1);
                    int i = stringReader.read();
                    stringReader.reset();
                    if (i == -1) {
                        break;
                    }
                    m11894(stringReader, c9389);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e2) {
            if (e2 instanceof SAXParseException) {
                System.err.println("WARN: " + e2.getMessage());
            } else {
                throw new IllegalArgumentException(e2);
            }
        }
        stringReader = new StringReader(str);
        c9389 = new C9389();
        stringReader.close();
        return c9389.f31781.toString();
    }
}
