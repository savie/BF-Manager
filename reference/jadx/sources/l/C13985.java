package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.ܰᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1GU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13985 implements XmlSerializer {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f45982;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f45983;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45984;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2694 f45986;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45989;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19629 f45990;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String[] f45987 = new String[12];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f45981 = new int[4];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String[] f45988 = new String[8];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean[] f45985 = new boolean[4];

    public C13985(boolean z) {
        setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        if (z) {
            this.f45990 = new C19629();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33833(boolean z) throws IOException {
        if (!this.f45983) {
            return;
        }
        int i = this.f45989;
        int i2 = i + 1;
        this.f45989 = i2;
        this.f45983 = false;
        boolean[] zArr = this.f45985;
        if (zArr.length <= i2) {
            boolean[] zArr2 = new boolean[i + 5];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f45985 = zArr2;
        }
        boolean[] zArr3 = this.f45985;
        int i3 = this.f45989;
        int i4 = i3 - 1;
        zArr3[i3] = zArr3[i4];
        int i5 = this.f45981[i4];
        while (true) {
            int[] iArr = this.f45981;
            int i6 = this.f45989;
            if (i5 < iArr[i6]) {
                this.f45986.write(32);
                this.f45986.write("xmlns");
                int i7 = i5 * 2;
                if (!"".equals(this.f45988[i7])) {
                    this.f45986.write(58);
                    this.f45986.write(this.f45988[i7]);
                } else if ("".equals(getNamespace()) && !"".equals(this.f45988[i7 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
                this.f45986.write("=\"");
                m33832(34, this.f45988[i7 + 1]);
                this.f45986.write(34);
                i5++;
            } else {
                int i8 = i6 + 1;
                if (iArr.length <= i8) {
                    int[] iArr2 = new int[i6 + 8];
                    System.arraycopy(iArr, 0, iArr2, 0, i8);
                    this.f45981 = iArr2;
                }
                int[] iArr3 = this.f45981;
                int i9 = this.f45989;
                iArr3[i9 + 1] = iArr3[i9];
                this.f45986.write(z ? " />" : ">");
                C19629 c19629 = this.f45990;
                if (c19629 != null) {
                    c19629.m44727(this.f45986.getPosition());
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33830(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\r') {
                sb.append("&#");
                sb.append((int) cCharAt);
                sb.append(';');
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0074, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33832(int i, String str) throws IOException {
        String str2;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\t' || cCharAt == '\n') {
                if (i == -1) {
                    this.f45986.write(cCharAt);
                } else {
                    this.f45986.write("&#" + ((int) cCharAt) + ';');
                }
            } else if (cCharAt == '\r') {
                this.f45986.write("&#" + ((int) cCharAt) + ';');
            } else if (cCharAt == '\"') {
                if (cCharAt == i) {
                    C2694 c2694 = this.f45986;
                    if (cCharAt == '\"') {
                        str2 = "&quot;";
                    } else {
                        str2 = "&apos;";
                    }
                    c2694.write(str2);
                } else if (cCharAt < ' ' && cCharAt < 127) {
                    this.f45986.write(cCharAt);
                } else if (m33834(cCharAt)) {
                    this.f45986.write(cCharAt);
                } else {
                    this.f45986.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (cCharAt == '<') {
                this.f45986.write("&lt;");
            } else if (cCharAt == '>') {
                this.f45986.write("&gt;");
            } else if (cCharAt == '&') {
                this.f45986.write("&amp;");
            } else if (cCharAt != '\'') {
                if (cCharAt < ' ') {
                    if (m33834(cCharAt)) {
                        this.f45986.write(cCharAt);
                    } else {
                        this.f45986.write("&#" + ((int) cCharAt) + l.b);
                    }
                } else if (m33834(cCharAt)) {
                    this.f45986.write(cCharAt);
                } else {
                    this.f45986.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (cCharAt == i) {
                C2694 c2695 = this.f45986;
                if (cCharAt == '\"') {
                    str2 = "&quot;";
                } else {
                    str2 = "&apos;";
                }
                c2695.write(str2);
            } else if (cCharAt < ' ') {
                if (m33834(cCharAt)) {
                    this.f45986.write(cCharAt);
                } else {
                    this.f45986.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (m33834(cCharAt)) {
                this.f45986.write(cCharAt);
            } else {
                this.f45986.write("&#" + ((int) cCharAt) + l.b);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33834(char c) {
        Character.UnicodeBlock unicodeBlockOf;
        if ((c < ' ' && c != '\r' && c != '\n' && c != '\t') || c == 127) {
            return false;
        }
        if (c > 127) {
            return (!Character.isValidCodePoint(c) || (unicodeBlockOf = Character.UnicodeBlock.of(c)) == Character.UnicodeBlock.PRIVATE_USE_AREA || unicodeBlockOf == Character.UnicodeBlock.SPECIALS || unicodeBlockOf == Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A || unicodeBlockOf == Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B) ? false : true;
        }
        return true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) throws IOException {
        this.f45986.write("<!DOCTYPE");
        this.f45986.write(str);
        this.f45986.write(">");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        while (true) {
            int i = this.f45989;
            if (i > 0) {
                String[] strArr = this.f45987;
                endTag(strArr[(i * 3) - 3], strArr[(i * 3) - 1]);
            } else {
                flush();
                return;
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m33833(false);
        this.f45986.write(38);
        this.f45986.write(str);
        this.f45986.write(59);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        return "http://xmlpull.org/v1/doc/features.html#indent-output".equals(str) && this.f45985[this.f45989];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        try {
            return m33831(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m33831(String str, boolean z, boolean z2) throws IOException {
        int i = this.f45981[this.f45989 + 1] * 2;
        while (true) {
            i -= 2;
            String str2 = null;
            String str3 = "";
            if (i < 0) {
                if (!z2) {
                    return null;
                }
                if (!"".equals(str)) {
                    do {
                        StringBuilder sb = new StringBuilder("n");
                        int i2 = this.f45984;
                        this.f45984 = i2 + 1;
                        sb.append(i2);
                        String string = sb.toString();
                        int i3 = this.f45981[this.f45989 + 1] * 2;
                        while (true) {
                            i3 -= 2;
                            if (i3 < 0) {
                                str3 = string;
                                break;
                            }
                            if (string.equals(this.f45988[i3])) {
                                str3 = null;
                                break;
                            }
                        }
                    } while (str3 == null);
                }
                boolean z3 = this.f45983;
                this.f45983 = false;
                setPrefix(str3, str);
                this.f45983 = z3;
                return str3;
            }
            if (this.f45988[i + 1].equals(str) && (z || !this.f45988[i].equals(""))) {
                String str4 = this.f45988[i];
                int i4 = i + 2;
                while (true) {
                    if (i4 >= this.f45981[this.f45989 + 1] * 2) {
                        str2 = str4;
                        break;
                    }
                    if (this.f45988[i4].equals(str4)) {
                        break;
                    }
                    i4++;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new RuntimeException("Unsupported property");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) throws IOException {
        text(str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            this.f45985[this.f45989] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new RuntimeException(C9023.m23354(obj, "Unsupported Property:"));
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) throws IOException {
        m33833(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(m33831(str2, true, false))) {
            return;
        }
        int[] iArr = this.f45981;
        int i = this.f45989 + 1;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        int i3 = i2 << 1;
        String[] strArr = this.f45988;
        int i4 = i3 + 1;
        if (strArr.length < i4) {
            String[] strArr2 = new String[strArr.length + 16];
            System.arraycopy(strArr, 0, strArr2, 0, i3);
            this.f45988 = strArr2;
        }
        String[] strArr3 = this.f45988;
        strArr3[i3] = str;
        strArr3[i4] = str2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f45986 = new C2694(writer);
        int[] iArr = this.f45981;
        iArr[0] = 2;
        iArr[1] = 2;
        String[] strArr = this.f45988;
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = DocumentReader.RESERVED;
        strArr[3] = "http://www.w3.org/XML/1998/namespace";
        this.f45983 = false;
        this.f45984 = 0;
        this.f45989 = 0;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) {
        OutputStreamWriter outputStreamWriter;
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        if (str == null) {
            outputStreamWriter = new OutputStreamWriter(outputStream);
        } else {
            outputStreamWriter = new OutputStreamWriter(outputStream, str);
        }
        setOutput(outputStreamWriter);
        this.f45982 = str;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        this.f45986.write("<?xml version='1.0' ");
        if (str != null) {
            this.f45982 = str;
        }
        if (this.f45982 != null) {
            this.f45986.write("encoding='");
            this.f45986.write(this.f45982);
            this.f45986.write("' ");
        }
        if (bool != null) {
            this.f45986.write("standalone='");
            this.f45986.write(bool.booleanValue() ? "yes" : "no");
            this.f45986.write("' ");
        }
        this.f45986.write("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        m33833(false);
        C19629 c19629 = this.f45990;
        if (c19629 != null) {
            c19629.mo24062(str2);
        }
        if (this.f45985[this.f45989]) {
            this.f45986.write("\n");
            for (int i = 0; i < this.f45989; i++) {
                this.f45986.write(ASN1Dump.TAB);
            }
        }
        int i2 = this.f45989 * 3;
        String[] strArr = this.f45987;
        if (strArr.length < i2 + 3) {
            String[] strArr2 = new String[strArr.length + 12];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            this.f45987 = strArr2;
        }
        String strM33831 = str == null ? "" : m33831(str, true, true);
        if (strM33831 == null) {
            strM33831 = "";
        }
        if ("".equals(str)) {
            for (int i3 = this.f45981[this.f45989]; i3 < this.f45981[this.f45989 + 1]; i3++) {
                int i4 = i3 * 2;
                if ("".equals(this.f45988[i4]) && !"".equals(this.f45988[i4 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        String[] strArr3 = this.f45987;
        strArr3[i2] = str;
        strArr3[i2 + 1] = strM33831;
        strArr3[i2 + 2] = str2;
        if (c19629 != null) {
            c19629.m44728(this.f45986.m8227(), this.f45986.m8226(), this.f45986.getPosition());
        }
        this.f45986.write(60);
        if (!"".equals(strM33831)) {
            this.f45986.write(strM33831);
            this.f45986.write(58);
        }
        this.f45986.write(str2);
        this.f45983 = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (!this.f45983) {
            throw new IllegalStateException("illegal position for attribute");
        }
        C19629 c19629 = this.f45990;
        if (c19629 != null) {
            c19629.mo24061(str2, str3);
        }
        if (str == null) {
            str = "";
        }
        String strM33831 = "".equals(str) ? "" : m33831(str, false, true);
        if (strM33831 == null) {
            strM33831 = "";
        }
        this.f45986.write(32);
        if (c19629 != null) {
            c19629.m44726(this.f45986.m8227(), this.f45986.m8226(), this.f45986.getPosition());
        }
        if (!"".equals(strM33831)) {
            this.f45986.write(strM33831);
            this.f45986.write(58);
        }
        this.f45986.write(str2);
        if (c19629 != null) {
            c19629.m44725(this.f45986.getPosition());
        }
        this.f45986.write(61);
        int i = str3.indexOf(34) != -1 ? 39 : 34;
        this.f45986.write(i);
        if (c19629 != null) {
            c19629.m44730(this.f45986.m8227(), this.f45986.m8226(), this.f45986.getPosition());
        }
        m33832(i, str3);
        if (c19629 != null) {
            c19629.m44729(this.f45986.getPosition());
        }
        this.f45986.write(i);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        m33833(false);
        this.f45986.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (!this.f45983) {
            this.f45989--;
        }
        if ((str == null && this.f45987[this.f45989 * 3] != null) || ((str != null && !str.equals(this.f45987[this.f45989 * 3])) || !this.f45987[(this.f45989 * 3) + 2].equals(str2))) {
            StringBuilder sbM30515 = C12278.m30515("</{", str, l.d, str2, "> does not match start: <{");
            sbM30515.append(this.f45987[this.f45989 * 3]);
            sbM30515.append(l.d);
            throw new IllegalArgumentException(C22697.m50267(sbM30515, this.f45987[(this.f45989 * 3) + 2], ">"));
        }
        if (this.f45983) {
            m33833(true);
            this.f45989--;
        } else {
            if (this.f45985[this.f45989 + 1]) {
                this.f45986.write("\n");
                for (int i = 0; i < this.f45989; i++) {
                    this.f45986.write(ASN1Dump.TAB);
                }
            }
            this.f45986.write("</");
            String str3 = this.f45987[(this.f45989 * 3) + 1];
            if (!"".equals(str3)) {
                this.f45986.write(str3);
                this.f45986.write(58);
            }
            this.f45986.write(str2);
            this.f45986.write(62);
        }
        int[] iArr = this.f45981;
        int i2 = this.f45989;
        iArr[i2 + 1] = iArr[i2];
        C19629 c19629 = this.f45990;
        if (c19629 != null) {
            c19629.mo24060(str2);
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f45987[(getDepth() * 3) - 3];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f45987[(getDepth() * 3) - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f45983 ? this.f45989 + 1 : this.f45989;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m33833(false);
        this.f45985[this.f45989] = false;
        C19629 c19629 = this.f45990;
        if (c19629 != null) {
            boolean zM44731 = c19629.m44731();
            c19629.text(str);
            if (!zM44731) {
                c19629.m44723(this.f45986.m8227(), this.f45986.m8226(), this.f45986.getPosition());
            }
        }
        m33832(-1, str);
        if (c19629 != null) {
            c19629.m44722(this.f45986.getPosition());
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        text(new String(cArr, i, i2));
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) throws IOException {
        m33833(false);
        this.f45986.write("<![CDATA[");
        this.f45986.write(str);
        this.f45986.write("]]>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m33833(false);
        this.f45986.write("<!--");
        this.f45986.write(str);
        this.f45986.write("-->");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m33833(false);
        this.f45986.write("<?");
        this.f45986.write(str);
        this.f45986.write("?>");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8340 m33835() {
        C19629 c19629 = this.f45990;
        C13638.requireNonNull(c19629);
        return c19629.m44724();
    }
}
