package l;

import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۧܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K50I */
/* JADX INFO: loaded from: classes3.dex */
public final class XmlResourceParserC11068 implements XmlResourceParser {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f37554;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f37557;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5727 f37558;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f37559;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17367 f37560;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37561;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f37562;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f37563;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f37564;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f37566;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37567;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f37568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f37569;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f37570;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public Stack f37556 = new Stack();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f37555 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17417 f37565 = new C17417();

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(int i, String[] strArr, int i2) {
        return 0;
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeType(int i) {
        return "CDATA";
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getColumnNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean getFeature(String str) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getInputEncoding() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final Object getProperty(String str) {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() {
        return false;
    }

    public XmlResourceParserC11068() {
        m27889();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27900(ByteArrayInputStream byteArrayInputStream, InterfaceC5727 interfaceC5727) {
        close();
        this.f37560 = new C17367(byteArrayInputStream);
        this.f37558 = interfaceC5727;
        this.f37565.m40589();
        this.f37555 = true;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public final void close() {
        if (this.f37555) {
            this.f37556.clear();
            this.f37555 = false;
            this.f37560 = null;
            this.f37558 = null;
            this.f37557 = null;
            this.f37565.m40587();
            this.f37562 = 0;
            m27889();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() {
        if (this.f37560 == null) {
            throw new XmlPullParserException("Parser is not opened.", this, null);
        }
        try {
            m27891();
            return this.f37563;
        } catch (IOException e) {
            close();
            throw e;
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() {
        return next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextTag() throws XmlPullParserException {
        int next = next();
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException("Expected start or end tag.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getDepth() {
        return this.f37565.m40590() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f37563;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException {
        if (this.f37563 != 2) {
            throw new XmlPullParserException("Parser must be on START_TAG to read next text.", this, null);
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException("Parser must be on START_TAG or TEXT to read text.", this, null);
        }
        String text = getText();
        if (next() == 3) {
            return text;
        }
        throw new XmlPullParserException("Event TEXT must be immediately followed by END_TAG.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) throws XmlPullParserException {
        if (i != this.f37563 || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            throw new XmlPullParserException(C22697.m50267(new StringBuilder(), XmlResourceParser.TYPES[i], " is expected."), this, null);
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getLineNumber() {
        return this.f37559;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        int i = this.f37561;
        if (i == -1) {
            return null;
        }
        int i2 = this.f37563;
        if (i2 == 2 || i2 == 3) {
            return ((AbstractC3733) this.f37558).m10939(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m27909() {
        String prefix = getPrefix();
        if (TextUtils.isEmpty(prefix)) {
            return getName();
        }
        StringBuilder sbM8976 = C3012.m8976(prefix, ":");
        sbM8976.append(getName());
        return sbM8976.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m27895() {
        return this.f37561;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        int i = this.f37561;
        if (i == -1 || this.f37563 != 4) {
            return null;
        }
        return ((AbstractC3733) this.f37558).m10939(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        String text = getText();
        if (text == null) {
            return null;
        }
        iArr[0] = 0;
        iArr[1] = text.length();
        char[] cArr = new char[text.length()];
        text.getChars(0, text.length(), cArr, 0);
        return cArr;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        int i = this.f37570;
        if (i == -1) {
            return null;
        }
        return ((AbstractC3733) this.f37558).m10939(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        int iM40584 = this.f37565.m40584(this.f37570);
        if (iM40584 == -1) {
            return null;
        }
        return ((AbstractC3733) this.f37558).m10939(iM40584);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m27893() {
        return this.f37565.m40584(this.f37570);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getPositionDescription() {
        return "XML line #" + this.f37559;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return this.f37565.m40591(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        return ((AbstractC3733) this.f37558).m10939(this.f37565.m40588(i));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m27904(int i) {
        return this.f37565.m40588(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        return ((AbstractC3733) this.f37558).m10939(this.f37565.m40582(i));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m27897(int i) {
        return this.f37565.m40582(i);
    }

    @Override // android.util.AttributeSet
    public final String getClassAttribute() {
        int i = this.f37554;
        if (i == -1) {
            return null;
        }
        return ((AbstractC3733) this.f37558).m10939(this.f37569[m27890(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public final String getIdAttribute() {
        int i = this.f37568;
        if (i == -1) {
            return null;
        }
        return ((AbstractC3733) this.f37558).m10939(this.f37569[m27890(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public final int getIdAttributeResourceValue(int i) {
        int i2 = this.f37568;
        if (i2 != -1) {
            int iM27890 = m27890(i2);
            int[] iArr = this.f37569;
            if (iArr[iM27890 + 3] == 1) {
                return iArr[iM27890 + 4];
            }
        }
        return i;
    }

    @Override // android.util.AttributeSet
    public final int getStyleAttribute() {
        int i = this.f37564;
        if (i == -1) {
            return 0;
        }
        return this.f37569[m27890(i) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final int getAttributeCount() {
        if (this.f37563 != 2) {
            return -1;
        }
        return this.f37569.length / 5;
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeNamespace(int i) {
        int i2 = this.f37569[m27890(i)];
        return i2 == -1 ? "" : ((AbstractC3733) this.f37558).m10939(i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m27906(int i) {
        return this.f37569[m27890(i)];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        int iM40584 = this.f37565.m40584(this.f37569[m27890(i)]);
        return iM40584 == -1 ? "" : ((AbstractC3733) this.f37558).m10939(iM40584);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m27902(int i) {
        return this.f37565.m40584(this.f37569[m27890(i)]);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeName(int i) {
        int i2 = this.f37569[m27890(i) + 1];
        return i2 == -1 ? "" : ((AbstractC3733) this.f37558).m10939(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27899(int i) {
        return this.f37569[m27890(i) + 1];
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m27901(int i) {
        return ((AbstractC3733) this.f37558).m10939(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeNameResource(int i) {
        int i2 = this.f37569[m27890(i) + 1];
        int[] iArr = this.f37557;
        if (iArr == null || i2 < 0 || i2 >= iArr.length) {
            return 0;
        }
        return iArr[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27898() {
        if (this.f37557 == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f37557;
            if (i >= iArr.length) {
                return -1;
            }
            if (iArr[i] == 16842755) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] m27905() {
        return this.f37557;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m27894(int i) {
        return this.f37569[m27890(i) + 3];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m27896(int i) {
        return this.f37569[m27890(i) + 4];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m27908(int i) {
        return this.f37569[m27890(i) + 2];
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(int i) {
        int iM27890 = m27890(i);
        int[] iArr = this.f37569;
        if (iArr[iM27890 + 3] != 3) {
            return "";
        }
        return ((AbstractC3733) this.f37558).m10939(iArr[iM27890 + 2]);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return getAttributeIntValue(i, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(int i, float f) {
        int iM27890 = m27890(i);
        int[] iArr = this.f37569;
        return iArr[iM27890 + 3] == 4 ? Float.intBitsToFloat(iArr[iM27890 + 4]) : f;
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(int i, int i2) {
        int iM27890 = m27890(i);
        int[] iArr = this.f37569;
        int i3 = iArr[iM27890 + 3];
        return (i3 < 16 || i3 > 31) ? i2 : iArr[iM27890 + 4];
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(int i, int i2) {
        int iM27890 = m27890(i);
        int[] iArr = this.f37569;
        return iArr[iM27890 + 3] == 1 ? iArr[iM27890 + 4] : i2;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(String str, String str2) {
        int iM27888 = m27888(str, str2);
        if (iM27888 == -1) {
            return null;
        }
        return getAttributeValue(iM27888);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int iM27888 = m27888(str, str2);
        return iM27888 == -1 ? z : getAttributeBooleanValue(iM27888, z);
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(String str, String str2, float f) {
        int iM27888 = m27888(str, str2);
        return iM27888 == -1 ? f : getAttributeFloatValue(iM27888, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(String str, String str2, int i) {
        int iM27888 = m27888(str, str2);
        return iM27888 == -1 ? i : getAttributeIntValue(iM27888, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        int iM27888 = m27888(str, str2);
        return iM27888 == -1 ? i : getAttributeIntValue(iM27888, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(String str, String str2, int i) {
        int iM27888 = m27888(str, str2);
        return iM27888 == -1 ? i : getAttributeResourceValue(iM27888, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(Reader reader) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace(String str) {
        throw new RuntimeException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setProperty(String str, Object obj) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setFeature(String str, boolean z) throws XmlPullParserException {
        throw new XmlPullParserException("Method is not supported.");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5727 m27907() {
        return this.f37558;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17140 m27903() {
        InterfaceC5727 interfaceC5727 = this.f37558;
        if (interfaceC5727 == null) {
            throw new RuntimeException();
        }
        if (interfaceC5727 instanceof C17140) {
            return (C17140) interfaceC5727;
        }
        C17140 c17140M40052 = C17140.m40052(interfaceC5727);
        this.f37558 = c17140M40052;
        return c17140M40052;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private final int m27890(int i) {
        if (this.f37563 != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 < this.f37569.length) {
            return i2;
        }
        throw new IndexOutOfBoundsException(C2271.m6966(i, "Invalid attribute index (", ")."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final int m27888(String str, String str2) {
        int iM10934;
        InterfaceC5727 interfaceC5727 = this.f37558;
        if (interfaceC5727 == null || str2 == null || (iM10934 = ((AbstractC3733) interfaceC5727).m10934(str2)) == -1) {
            return -1;
        }
        int iM10935 = str != null ? ((AbstractC3733) this.f37558).m10934(str) : -1;
        int i = 0;
        while (true) {
            int[] iArr = this.f37569;
            if (i == iArr.length) {
                return -1;
            }
            if (iM10934 == iArr[i + 1] && (iM10935 == -1 || iM10935 == iArr[i])) {
                break;
            }
            i += 5;
        }
        return i / 5;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private final void m27889() {
        this.f37563 = -1;
        this.f37559 = -1;
        this.f37561 = -1;
        this.f37570 = -1;
        this.f37569 = null;
        this.f37568 = -1;
        this.f37554 = -1;
        this.f37564 = -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m27892() throws IOException {
        C4356 c4356M12197 = C4356.m12197(this.f37560);
        int i = c4356M12197.f15585;
        int i2 = c4356M12197.f15587;
        int i3 = i - i2;
        if (i3 % 4 == 0) {
            this.f37560.seek(c4356M12197.f15586 + i2);
            C17367 c17367 = this.f37560;
            int i4 = i3 / 4;
            c17367.getClass();
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                iArr[i5] = c17367.readInt();
            }
            this.f37557 = iArr;
            c4356M12197.m12199(this.f37560);
            return;
        }
        throw new IOException("Invalid resource ids size.");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m27891() throws IOException {
        short s;
        int i;
        InterfaceC5727 interfaceC5727 = this.f37558;
        short s2 = 384;
        C17417 c17417 = this.f37565;
        if (interfaceC5727 == null) {
            C4356.m12197(this.f37560).m12198(3);
            if (this.f37560.m40444() == 384) {
                m27892();
            }
            this.f37558 = C6783.m18386(this.f37560);
            c17417.m40589();
            this.f37555 = true;
        }
        int i2 = this.f37563;
        if (i2 == 1) {
            return;
        }
        m27889();
        while (true) {
            int i3 = 0;
            if (this.f37567) {
                this.f37567 = false;
                c17417.m40585();
            }
            if (i2 == 3 && this.f37562 == 0) {
                this.f37563 = 1;
                return;
            }
            long jAvailable = this.f37560.available();
            Stack stack = this.f37556;
            if (jAvailable < 8) {
                if (stack.isEmpty()) {
                    this.f37563 = 1;
                    return;
                }
                C6128 c6128 = (C6128) stack.pop();
                this.f37570 = c6128.f20918;
                this.f37561 = c6128.f20917;
                this.f37563 = 3;
                this.f37567 = true;
                this.f37562--;
                return;
            }
            C4356 c4356M12197 = C4356.m12197(this.f37560);
            int i4 = c4356M12197.f15586;
            short s3 = c4356M12197.f15584;
            if (s3 == s2) {
                this.f37560.seek(i4);
                m27892();
            } else {
                if (s3 == 258 && i2 == -1) {
                    this.f37563 = 0;
                    this.f37560.seek(i4);
                    return;
                }
                int i5 = this.f37560.readInt();
                this.f37560.seek(i4 + c4356M12197.f15587);
                while (true) {
                    s = c4356M12197.f15584;
                    if (s >= 256 && s <= 260) {
                        break;
                    }
                    int i6 = c4356M12197.f15585;
                    int i7 = 16;
                    if (i6 > 16) {
                        i7 = ((4 - (i6 % 4)) % 4) + i6;
                    }
                    this.f37560.seek(c4356M12197.f15586 + i7);
                    c4356M12197 = C4356.m12197(this.f37560);
                    i5 = this.f37560.readInt();
                    this.f37560.skipBytes(4);
                    s2 = 384;
                }
                if (s == 256) {
                    c17417.m40586(this.f37560.readInt(), this.f37560.readInt());
                    c4356M12197.m12199(this.f37560);
                } else if (s == 257) {
                    this.f37560.skipBytes(4);
                    this.f37560.skipBytes(4);
                    c17417.m40583();
                    c4356M12197.m12199(this.f37560);
                } else {
                    this.f37559 = i5;
                    if (s != 258) {
                        if (s != 259) {
                            this.f37561 = this.f37560.readInt();
                            this.f37560.skipBytes(4);
                            this.f37560.skipBytes(4);
                            this.f37563 = 4;
                            c4356M12197.m12199(this.f37560);
                            return;
                        }
                        stack.pop();
                        this.f37570 = this.f37560.readInt();
                        this.f37561 = this.f37560.readInt();
                        this.f37563 = 3;
                        this.f37567 = true;
                        this.f37562--;
                        c4356M12197.m12199(this.f37560);
                        return;
                    }
                    this.f37570 = this.f37560.readInt();
                    int i8 = this.f37560.readInt();
                    this.f37561 = i8;
                    stack.push(new C6128(this.f37570, i8));
                    int iM40462 = this.f37560.m40462();
                    int iM40463 = this.f37560.m40462();
                    int i9 = this.f37560.readInt();
                    this.f37568 = (i9 >>> 16) - 1;
                    int i10 = i9 & 65535;
                    int i11 = this.f37560.readInt();
                    this.f37564 = (i11 >>> 16) - 1;
                    this.f37554 = (65535 & i11) - 1;
                    if (iM40462 > 20) {
                        this.f37560.skipBytes(iM40462 - 20);
                    }
                    this.f37566 = this.f37560.m40445();
                    if (iM40463 <= 20) {
                        C17367 c17367 = this.f37560;
                        int i12 = i10 * 5;
                        c17367.getClass();
                        int[] iArr = new int[i12];
                        for (int i13 = 0; i13 < i12; i13++) {
                            iArr[i13] = c17367.readInt();
                        }
                        this.f37569 = iArr;
                    } else {
                        this.f37569 = new int[i10 * 5];
                        int i14 = 0;
                        while (i10 > 0) {
                            int i15 = 0;
                            while (i15 < 5) {
                                this.f37569[i14] = this.f37560.readInt();
                                i15++;
                                i14++;
                            }
                            this.f37560.skipBytes(iM40463 - 20);
                            i10--;
                        }
                    }
                    while (true) {
                        int[] iArr2 = this.f37569;
                        if (i3 >= iArr2.length) {
                            c17417.m40589();
                            this.f37563 = 2;
                            this.f37562++;
                            c4356M12197.m12199(this.f37560);
                            return;
                        }
                        int i16 = i3 + 3;
                        int i17 = iArr2[i16] >>> 24;
                        iArr2[i16] = i17;
                        if (i17 == 3) {
                            int i18 = i3 + 2;
                            if (iArr2[i18] == -1 && (i = iArr2[i3 + 4]) >= 0 && i < this.f37558.size()) {
                                this.f37569[i18] = i;
                            }
                        }
                        i3 += 5;
                    }
                }
            }
        }
    }
}
