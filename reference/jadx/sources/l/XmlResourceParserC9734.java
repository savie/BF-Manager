package l;

import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۡ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K50I */
/* JADX INFO: loaded from: classes3.dex */
public final class XmlResourceParserC9734 implements XmlResourceParser {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f31388;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f31389;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3412 f31391;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C20348 f31392;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f31393;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f31395;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f31396;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f31397;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f31398;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31399;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31400;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f31401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f31402;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f31403;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public Stack f31404 = new Stack();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f31394 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C10480 f31390 = new C10480();

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

    public XmlResourceParserC9734() {
        m25329();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25337(ByteArrayInputStream byteArrayInputStream, InterfaceC3412 interfaceC3412) {
        close();
        this.f31392 = new C20348(byteArrayInputStream);
        this.f31391 = interfaceC3412;
        this.f31390.m26915();
        this.f31394 = true;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public final void close() {
        if (this.f31394) {
            this.f31404.clear();
            this.f31394 = false;
            this.f31392 = null;
            this.f31391 = null;
            this.f31398 = null;
            this.f31390.m26916();
            this.f31397 = 0;
            m25329();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() {
        if (this.f31392 == null) {
            throw new XmlPullParserException("Parser is not opened.", this, null);
        }
        try {
            m25331();
            return this.f31393;
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
        return this.f31390.m26917() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f31393;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException {
        if (this.f31393 != 2) {
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
        if (i != this.f31393 || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            throw new XmlPullParserException(C8947.m23910(new StringBuilder(), XmlResourceParser.TYPES[i], " is expected."), this, null);
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getLineNumber() {
        return this.f31396;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        int i = this.f31389;
        if (i == -1) {
            return null;
        }
        int i2 = this.f31393;
        if (i2 == 2 || i2 == 3) {
            return ((AbstractC5101) this.f31391).m15441(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m25346() {
        String prefix = getPrefix();
        if (TextUtils.isEmpty(prefix)) {
            return getName();
        }
        StringBuilder sbM10405 = C3188.m10405(prefix, ":");
        sbM10405.append(getName());
        return sbM10405.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25340() {
        return this.f31389;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        int i = this.f31389;
        if (i == -1 || this.f31393 != 4) {
            return null;
        }
        return ((AbstractC5101) this.f31391).m15441(i);
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
        int i = this.f31395;
        if (i == -1) {
            return null;
        }
        return ((AbstractC5101) this.f31391).m15441(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        int iM26911 = this.f31390.m26911(this.f31395);
        if (iM26911 == -1) {
            return null;
        }
        return ((AbstractC5101) this.f31391).m15441(iM26911);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m25343() {
        return this.f31390.m26911(this.f31395);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getPositionDescription() {
        return "XML line #" + this.f31396;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return this.f31390.m26918(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        return ((AbstractC5101) this.f31391).m15441(this.f31390.m26914(i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m25338(int i) {
        return this.f31390.m26914(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        return ((AbstractC5101) this.f31391).m15441(this.f31390.m26919(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25334(int i) {
        return this.f31390.m26919(i);
    }

    @Override // android.util.AttributeSet
    public final String getClassAttribute() {
        int i = this.f31400;
        if (i == -1) {
            return null;
        }
        return ((AbstractC5101) this.f31391).m15441(this.f31402[m25332(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public final String getIdAttribute() {
        int i = this.f31401;
        if (i == -1) {
            return null;
        }
        return ((AbstractC5101) this.f31391).m15441(this.f31402[m25332(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public final int getIdAttributeResourceValue(int i) {
        int i2 = this.f31401;
        if (i2 != -1) {
            int iM25332 = m25332(i2);
            int[] iArr = this.f31402;
            if (iArr[iM25332 + 3] == 1) {
                return iArr[iM25332 + 4];
            }
        }
        return i;
    }

    @Override // android.util.AttributeSet
    public final int getStyleAttribute() {
        int i = this.f31403;
        if (i == -1) {
            return 0;
        }
        return this.f31402[m25332(i) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final int getAttributeCount() {
        if (this.f31393 != 2) {
            return -1;
        }
        return this.f31402.length / 5;
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeNamespace(int i) {
        int i2 = this.f31402[m25332(i)];
        return i2 == -1 ? "" : ((AbstractC5101) this.f31391).m15441(i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25348(int i) {
        return this.f31402[m25332(i)];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        int iM26911 = this.f31390.m26911(this.f31402[m25332(i)]);
        return iM26911 == -1 ? "" : ((AbstractC5101) this.f31391).m15441(iM26911);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25341(int i) {
        return this.f31390.m26911(this.f31402[m25332(i)]);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeName(int i) {
        int i2 = this.f31402[m25332(i) + 1];
        return i2 == -1 ? "" : ((AbstractC5101) this.f31391).m15441(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25336(int i) {
        return this.f31402[m25332(i) + 1];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m25342(int i) {
        return ((AbstractC5101) this.f31391).m15441(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeNameResource(int i) {
        int i2 = this.f31402[m25332(i) + 1];
        int[] iArr = this.f31398;
        if (iArr == null || i2 < 0 || i2 >= iArr.length) {
            return 0;
        }
        return iArr[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25335() {
        if (this.f31398 == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f31398;
            if (i >= iArr.length) {
                return -1;
            }
            if (iArr[i] == 16842755) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] m25339() {
        return this.f31398;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m25344(int i) {
        return this.f31402[m25332(i) + 3];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m25350(int i) {
        return this.f31402[m25332(i) + 4];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m25345(int i) {
        return this.f31402[m25332(i) + 2];
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(int i) {
        int iM25332 = m25332(i);
        int[] iArr = this.f31402;
        if (iArr[iM25332 + 3] != 3) {
            return "";
        }
        return ((AbstractC5101) this.f31391).m15441(iArr[iM25332 + 2]);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return getAttributeIntValue(i, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(int i, float f) {
        int iM25332 = m25332(i);
        int[] iArr = this.f31402;
        return iArr[iM25332 + 3] == 4 ? Float.intBitsToFloat(iArr[iM25332 + 4]) : f;
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(int i, int i2) {
        int iM25332 = m25332(i);
        int[] iArr = this.f31402;
        int i3 = iArr[iM25332 + 3];
        return (i3 < 16 || i3 > 31) ? i2 : iArr[iM25332 + 4];
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(int i, int i2) {
        int iM25332 = m25332(i);
        int[] iArr = this.f31402;
        return iArr[iM25332 + 3] == 1 ? iArr[iM25332 + 4] : i2;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(String str, String str2) {
        int iM25330 = m25330(str, str2);
        if (iM25330 == -1) {
            return null;
        }
        return getAttributeValue(iM25330);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int iM25330 = m25330(str, str2);
        return iM25330 == -1 ? z : getAttributeBooleanValue(iM25330, z);
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(String str, String str2, float f) {
        int iM25330 = m25330(str, str2);
        return iM25330 == -1 ? f : getAttributeFloatValue(iM25330, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(String str, String str2, int i) {
        int iM25330 = m25330(str, str2);
        return iM25330 == -1 ? i : getAttributeIntValue(iM25330, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        int iM25330 = m25330(str, str2);
        return iM25330 == -1 ? i : getAttributeIntValue(iM25330, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(String str, String str2, int i) {
        int iM25330 = m25330(str, str2);
        return iM25330 == -1 ? i : getAttributeResourceValue(iM25330, i);
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3412 m25347() {
        return this.f31391;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12558 m25349() {
        InterfaceC3412 interfaceC3412 = this.f31391;
        if (interfaceC3412 == null) {
            throw new RuntimeException();
        }
        if (interfaceC3412 instanceof C12558) {
            return (C12558) interfaceC3412;
        }
        C12558 c12558M31245 = C12558.m31245(interfaceC3412);
        this.f31391 = c12558M31245;
        return c12558M31245;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private final int m25332(int i) {
        if (this.f31393 != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 < this.f31402.length) {
            return i2;
        }
        throw new IndexOutOfBoundsException(C14442.m34864(i, "Invalid attribute index (", ")."));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final int m25330(String str, String str2) {
        int iM15436;
        InterfaceC3412 interfaceC3412 = this.f31391;
        if (interfaceC3412 == null || str2 == null || (iM15436 = ((AbstractC5101) interfaceC3412).m15436(str2)) == -1) {
            return -1;
        }
        int iM15437 = str != null ? ((AbstractC5101) this.f31391).m15436(str) : -1;
        int i = 0;
        while (true) {
            int[] iArr = this.f31402;
            if (i == iArr.length) {
                return -1;
            }
            if (iM15436 == iArr[i + 1] && (iM15437 == -1 || iM15437 == iArr[i])) {
                break;
            }
            i += 5;
        }
        return i / 5;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private final void m25329() {
        this.f31393 = -1;
        this.f31396 = -1;
        this.f31389 = -1;
        this.f31395 = -1;
        this.f31402 = null;
        this.f31401 = -1;
        this.f31400 = -1;
        this.f31403 = -1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m25333() throws IOException {
        C9311 c9311M24536 = C9311.m24536(this.f31392);
        int i = c9311M24536.f30250;
        int i2 = c9311M24536.f30252;
        int i3 = i - i2;
        if (i3 % 4 == 0) {
            this.f31392.seek(c9311M24536.f30251 + i2);
            C20348 c20348 = this.f31392;
            int i4 = i3 / 4;
            c20348.getClass();
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                iArr[i5] = c20348.readInt();
            }
            this.f31398 = iArr;
            c9311M24536.m24538(this.f31392);
            return;
        }
        throw new IOException("Invalid resource ids size.");
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m25331() throws IOException {
        short s;
        int i;
        InterfaceC3412 interfaceC3412 = this.f31391;
        short s2 = 384;
        C10480 c10480 = this.f31390;
        if (interfaceC3412 == null) {
            C9311.m24536(this.f31392).m24537(3);
            if (this.f31392.m46750() == 384) {
                m25333();
            }
            this.f31391 = C8632.m23264(this.f31392);
            c10480.m26915();
            this.f31394 = true;
        }
        int i2 = this.f31393;
        if (i2 == 1) {
            return;
        }
        m25329();
        while (true) {
            int i3 = 0;
            if (this.f31388) {
                this.f31388 = false;
                c10480.m26912();
            }
            if (i2 == 3 && this.f31397 == 0) {
                this.f31393 = 1;
                return;
            }
            long jAvailable = this.f31392.available();
            Stack stack = this.f31404;
            if (jAvailable < 8) {
                if (stack.isEmpty()) {
                    this.f31393 = 1;
                    return;
                }
                C1532 c1532 = (C1532) stack.pop();
                this.f31395 = c1532.f5327;
                this.f31389 = c1532.f5326;
                this.f31393 = 3;
                this.f31388 = true;
                this.f31397--;
                return;
            }
            C9311 c9311M24536 = C9311.m24536(this.f31392);
            int i4 = c9311M24536.f30251;
            short s3 = c9311M24536.f30253;
            if (s3 == s2) {
                this.f31392.seek(i4);
                m25333();
            } else {
                if (s3 == 258 && i2 == -1) {
                    this.f31393 = 0;
                    this.f31392.seek(i4);
                    return;
                }
                int i5 = this.f31392.readInt();
                this.f31392.seek(i4 + c9311M24536.f30252);
                while (true) {
                    s = c9311M24536.f30253;
                    if (s >= 256 && s <= 260) {
                        break;
                    }
                    int i6 = c9311M24536.f30250;
                    int i7 = 16;
                    if (i6 > 16) {
                        i7 = ((4 - (i6 % 4)) % 4) + i6;
                    }
                    this.f31392.seek(c9311M24536.f30251 + i7);
                    c9311M24536 = C9311.m24536(this.f31392);
                    i5 = this.f31392.readInt();
                    this.f31392.skipBytes(4);
                    s2 = 384;
                }
                if (s == 256) {
                    c10480.m26913(this.f31392.readInt(), this.f31392.readInt());
                    c9311M24536.m24538(this.f31392);
                } else if (s == 257) {
                    this.f31392.skipBytes(4);
                    this.f31392.skipBytes(4);
                    c10480.m26920();
                    c9311M24536.m24538(this.f31392);
                } else {
                    this.f31396 = i5;
                    if (s != 258) {
                        if (s != 259) {
                            this.f31389 = this.f31392.readInt();
                            this.f31392.skipBytes(4);
                            this.f31392.skipBytes(4);
                            this.f31393 = 4;
                            c9311M24536.m24538(this.f31392);
                            return;
                        }
                        stack.pop();
                        this.f31395 = this.f31392.readInt();
                        this.f31389 = this.f31392.readInt();
                        this.f31393 = 3;
                        this.f31388 = true;
                        this.f31397--;
                        c9311M24536.m24538(this.f31392);
                        return;
                    }
                    this.f31395 = this.f31392.readInt();
                    int i8 = this.f31392.readInt();
                    this.f31389 = i8;
                    stack.push(new C1532(this.f31395, i8));
                    int iM46749 = this.f31392.m46749();
                    int iM467410 = this.f31392.m46749();
                    int i9 = this.f31392.readInt();
                    this.f31401 = (i9 >>> 16) - 1;
                    int i10 = i9 & 65535;
                    int i11 = this.f31392.readInt();
                    this.f31403 = (i11 >>> 16) - 1;
                    this.f31400 = (65535 & i11) - 1;
                    if (iM46749 > 20) {
                        this.f31392.skipBytes(iM46749 - 20);
                    }
                    this.f31399 = this.f31392.m46744();
                    if (iM467410 <= 20) {
                        C20348 c20348 = this.f31392;
                        int i12 = i10 * 5;
                        c20348.getClass();
                        int[] iArr = new int[i12];
                        for (int i13 = 0; i13 < i12; i13++) {
                            iArr[i13] = c20348.readInt();
                        }
                        this.f31402 = iArr;
                    } else {
                        this.f31402 = new int[i10 * 5];
                        int i14 = 0;
                        while (i10 > 0) {
                            int i15 = 0;
                            while (i15 < 5) {
                                this.f31402[i14] = this.f31392.readInt();
                                i15++;
                                i14++;
                            }
                            this.f31392.skipBytes(iM467410 - 20);
                            i10--;
                        }
                    }
                    while (true) {
                        int[] iArr2 = this.f31402;
                        if (i3 >= iArr2.length) {
                            c10480.m26915();
                            this.f31393 = 2;
                            this.f31397++;
                            c9311M24536.m24538(this.f31392);
                            return;
                        }
                        int i16 = i3 + 3;
                        int i17 = iArr2[i16] >>> 24;
                        iArr2[i16] = i17;
                        if (i17 == 3) {
                            int i18 = i3 + 2;
                            if (iArr2[i18] == -1 && (i = iArr2[i3 + 4]) >= 0 && i < this.f31391.size()) {
                                this.f31402[i18] = i;
                            }
                        }
                        i3 += 5;
                    }
                }
            }
        }
    }
}
