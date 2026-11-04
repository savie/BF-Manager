package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.֨ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1GU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1306 implements XmlSerializer {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f4692;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f4693;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2797 f4696;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11702 f4698;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f4700;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f4701;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String[] f4695 = new String[12];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f4697 = new int[4];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String[] f4694 = new String[8];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean[] f4699 = new boolean[4];

    public C1306(boolean z) {
        setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        if (z) {
            this.f4698 = new C11702();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4760(boolean z) throws IOException {
        if (!this.f4692) {
            return;
        }
        int i = this.f4700;
        int i2 = i + 1;
        this.f4700 = i2;
        this.f4692 = false;
        boolean[] zArr = this.f4699;
        if (zArr.length <= i2) {
            boolean[] zArr2 = new boolean[i + 5];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f4699 = zArr2;
        }
        boolean[] zArr3 = this.f4699;
        int i3 = this.f4700;
        int i4 = i3 - 1;
        zArr3[i3] = zArr3[i4];
        int i5 = this.f4697[i4];
        while (true) {
            int[] iArr = this.f4697;
            int i6 = this.f4700;
            if (i5 < iArr[i6]) {
                this.f4696.write(32);
                this.f4696.write("xmlns");
                int i7 = i5 * 2;
                if (!"".equals(this.f4694[i7])) {
                    this.f4696.write(58);
                    this.f4696.write(this.f4694[i7]);
                } else if ("".equals(getNamespace()) && !"".equals(this.f4694[i7 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
                this.f4696.write("=\"");
                m4759(34, this.f4694[i7 + 1]);
                this.f4696.write(34);
                i5++;
            } else {
                int i8 = i6 + 1;
                if (iArr.length <= i8) {
                    int[] iArr2 = new int[i6 + 8];
                    System.arraycopy(iArr, 0, iArr2, 0, i8);
                    this.f4697 = iArr2;
                }
                int[] iArr3 = this.f4697;
                int i9 = this.f4700;
                iArr3[i9 + 1] = iArr3[i9];
                this.f4696.write(z ? " />" : ">");
                C11702 c11702 = this.f4698;
                if (c11702 != null) {
                    c11702.m29375(this.f4696.getPosition());
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4757(String str) {
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
    private void m4759(int i, String str) throws IOException {
        String str2;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\t' || cCharAt == '\n') {
                if (i == -1) {
                    this.f4696.write(cCharAt);
                } else {
                    this.f4696.write("&#" + ((int) cCharAt) + ';');
                }
            } else if (cCharAt == '\r') {
                this.f4696.write("&#" + ((int) cCharAt) + ';');
            } else if (cCharAt == '\"') {
                if (cCharAt == i) {
                    C2797 c2797 = this.f4696;
                    if (cCharAt == '\"') {
                        str2 = "&quot;";
                    } else {
                        str2 = "&apos;";
                    }
                    c2797.write(str2);
                } else if (cCharAt < ' ' && cCharAt < 127) {
                    this.f4696.write(cCharAt);
                } else if (m4761(cCharAt)) {
                    this.f4696.write(cCharAt);
                } else {
                    this.f4696.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (cCharAt == '<') {
                this.f4696.write("&lt;");
            } else if (cCharAt == '>') {
                this.f4696.write("&gt;");
            } else if (cCharAt == '&') {
                this.f4696.write("&amp;");
            } else if (cCharAt != '\'') {
                if (cCharAt < ' ') {
                    if (m4761(cCharAt)) {
                        this.f4696.write(cCharAt);
                    } else {
                        this.f4696.write("&#" + ((int) cCharAt) + l.b);
                    }
                } else if (m4761(cCharAt)) {
                    this.f4696.write(cCharAt);
                } else {
                    this.f4696.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (cCharAt == i) {
                C2797 c2798 = this.f4696;
                if (cCharAt == '\"') {
                    str2 = "&quot;";
                } else {
                    str2 = "&apos;";
                }
                c2798.write(str2);
            } else if (cCharAt < ' ') {
                if (m4761(cCharAt)) {
                    this.f4696.write(cCharAt);
                } else {
                    this.f4696.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (m4761(cCharAt)) {
                this.f4696.write(cCharAt);
            } else {
                this.f4696.write("&#" + ((int) cCharAt) + l.b);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4761(char c) {
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
        this.f4696.write("<!DOCTYPE");
        this.f4696.write(str);
        this.f4696.write(">");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        while (true) {
            int i = this.f4700;
            if (i > 0) {
                String[] strArr = this.f4695;
                endTag(strArr[(i * 3) - 3], strArr[(i * 3) - 1]);
            } else {
                flush();
                return;
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m4760(false);
        this.f4696.write(38);
        this.f4696.write(str);
        this.f4696.write(59);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        return "http://xmlpull.org/v1/doc/features.html#indent-output".equals(str) && this.f4699[this.f4700];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        try {
            return m4758(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m4758(String str, boolean z, boolean z2) throws IOException {
        int i = this.f4697[this.f4700 + 1] * 2;
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
                        int i2 = this.f4693;
                        this.f4693 = i2 + 1;
                        sb.append(i2);
                        String string = sb.toString();
                        int i3 = this.f4697[this.f4700 + 1] * 2;
                        while (true) {
                            i3 -= 2;
                            if (i3 < 0) {
                                str3 = string;
                                break;
                            }
                            if (string.equals(this.f4694[i3])) {
                                str3 = null;
                                break;
                            }
                        }
                    } while (str3 == null);
                }
                boolean z3 = this.f4692;
                this.f4692 = false;
                setPrefix(str3, str);
                this.f4692 = z3;
                return str3;
            }
            if (this.f4694[i + 1].equals(str) && (z || !this.f4694[i].equals(""))) {
                String str4 = this.f4694[i];
                int i4 = i + 2;
                while (true) {
                    if (i4 >= this.f4697[this.f4700 + 1] * 2) {
                        str2 = str4;
                        break;
                    }
                    if (this.f4694[i4].equals(str4)) {
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
            this.f4699[this.f4700] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new RuntimeException(C14483.m34971("Unsupported Property:", obj));
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) throws IOException {
        m4760(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(m4758(str2, true, false))) {
            return;
        }
        int[] iArr = this.f4697;
        int i = this.f4700 + 1;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        int i3 = i2 << 1;
        String[] strArr = this.f4694;
        int i4 = i3 + 1;
        if (strArr.length < i4) {
            String[] strArr2 = new String[strArr.length + 16];
            System.arraycopy(strArr, 0, strArr2, 0, i3);
            this.f4694 = strArr2;
        }
        String[] strArr3 = this.f4694;
        strArr3[i3] = str;
        strArr3[i4] = str2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f4696 = new C2797(writer);
        int[] iArr = this.f4697;
        iArr[0] = 2;
        iArr[1] = 2;
        String[] strArr = this.f4694;
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = DocumentReader.RESERVED;
        strArr[3] = "http://www.w3.org/XML/1998/namespace";
        this.f4692 = false;
        this.f4693 = 0;
        this.f4700 = 0;
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
        this.f4701 = str;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        this.f4696.write("<?xml version='1.0' ");
        if (str != null) {
            this.f4701 = str;
        }
        if (this.f4701 != null) {
            this.f4696.write("encoding='");
            this.f4696.write(this.f4701);
            this.f4696.write("' ");
        }
        if (bool != null) {
            this.f4696.write("standalone='");
            this.f4696.write(bool.booleanValue() ? "yes" : "no");
            this.f4696.write("' ");
        }
        this.f4696.write("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        m4760(false);
        C11702 c11702 = this.f4698;
        if (c11702 != null) {
            c11702.mo14234(str2);
        }
        if (this.f4699[this.f4700]) {
            this.f4696.write("\n");
            for (int i = 0; i < this.f4700; i++) {
                this.f4696.write(ASN1Dump.TAB);
            }
        }
        int i2 = this.f4700 * 3;
        String[] strArr = this.f4695;
        if (strArr.length < i2 + 3) {
            String[] strArr2 = new String[strArr.length + 12];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            this.f4695 = strArr2;
        }
        String strM4758 = str == null ? "" : m4758(str, true, true);
        if (strM4758 == null) {
            strM4758 = "";
        }
        if ("".equals(str)) {
            for (int i3 = this.f4697[this.f4700]; i3 < this.f4697[this.f4700 + 1]; i3++) {
                int i4 = i3 * 2;
                if ("".equals(this.f4694[i4]) && !"".equals(this.f4694[i4 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        String[] strArr3 = this.f4695;
        strArr3[i2] = str;
        strArr3[i2 + 1] = strM4758;
        strArr3[i2 + 2] = str2;
        if (c11702 != null) {
            c11702.m29376(this.f4696.m9259(), this.f4696.m9258(), this.f4696.getPosition());
        }
        this.f4696.write(60);
        if (!"".equals(strM4758)) {
            this.f4696.write(strM4758);
            this.f4696.write(58);
        }
        this.f4696.write(str2);
        this.f4692 = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (!this.f4692) {
            throw new IllegalStateException("illegal position for attribute");
        }
        C11702 c11702 = this.f4698;
        if (c11702 != null) {
            c11702.mo14233(str2, str3);
        }
        if (str == null) {
            str = "";
        }
        String strM4758 = "".equals(str) ? "" : m4758(str, false, true);
        if (strM4758 == null) {
            strM4758 = "";
        }
        this.f4696.write(32);
        if (c11702 != null) {
            c11702.m29374(this.f4696.m9259(), this.f4696.m9258(), this.f4696.getPosition());
        }
        if (!"".equals(strM4758)) {
            this.f4696.write(strM4758);
            this.f4696.write(58);
        }
        this.f4696.write(str2);
        if (c11702 != null) {
            c11702.m29373(this.f4696.getPosition());
        }
        this.f4696.write(61);
        int i = str3.indexOf(34) != -1 ? 39 : 34;
        this.f4696.write(i);
        if (c11702 != null) {
            c11702.m29378(this.f4696.m9259(), this.f4696.m9258(), this.f4696.getPosition());
        }
        m4759(i, str3);
        if (c11702 != null) {
            c11702.m29377(this.f4696.getPosition());
        }
        this.f4696.write(i);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        m4760(false);
        this.f4696.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (!this.f4692) {
            this.f4700--;
        }
        if ((str == null && this.f4695[this.f4700 * 3] != null) || ((str != null && !str.equals(this.f4695[this.f4700 * 3])) || !this.f4695[(this.f4700 * 3) + 2].equals(str2))) {
            StringBuilder sbM10406 = C3188.m10406("</{", str, l.d, str2, "> does not match start: <{");
            sbM10406.append(this.f4695[this.f4700 * 3]);
            sbM10406.append(l.d);
            throw new IllegalArgumentException(C8947.m23910(sbM10406, this.f4695[(this.f4700 * 3) + 2], ">"));
        }
        if (this.f4692) {
            m4760(true);
            this.f4700--;
        } else {
            if (this.f4699[this.f4700 + 1]) {
                this.f4696.write("\n");
                for (int i = 0; i < this.f4700; i++) {
                    this.f4696.write(ASN1Dump.TAB);
                }
            }
            this.f4696.write("</");
            String str3 = this.f4695[(this.f4700 * 3) + 1];
            if (!"".equals(str3)) {
                this.f4696.write(str3);
                this.f4696.write(58);
            }
            this.f4696.write(str2);
            this.f4696.write(62);
        }
        int[] iArr = this.f4697;
        int i2 = this.f4700;
        iArr[i2 + 1] = iArr[i2];
        C11702 c11702 = this.f4698;
        if (c11702 != null) {
            c11702.mo14232(str2);
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f4695[(getDepth() * 3) - 3];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f4695[(getDepth() * 3) - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f4692 ? this.f4700 + 1 : this.f4700;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m4760(false);
        this.f4699[this.f4700] = false;
        C11702 c11702 = this.f4698;
        if (c11702 != null) {
            boolean zM29379 = c11702.m29379();
            c11702.text(str);
            if (!zM29379) {
                c11702.m29381(this.f4696.m9259(), this.f4696.m9258(), this.f4696.getPosition());
            }
        }
        m4759(-1, str);
        if (c11702 != null) {
            c11702.m29380(this.f4696.getPosition());
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
        m4760(false);
        this.f4696.write("<![CDATA[");
        this.f4696.write(str);
        this.f4696.write("]]>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m4760(false);
        this.f4696.write("<!--");
        this.f4696.write(str);
        this.f4696.write("-->");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m4760(false);
        this.f4696.write("<?");
        this.f4696.write(str);
        this.f4696.write("?>");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2008 m4762() {
        C11702 c11702 = this.f4698;
        C17359.requireNonNull(c11702);
        return c11702.m29372();
    }
}
