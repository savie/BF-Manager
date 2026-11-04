package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۫ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13041 implements XmlPullParser {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final char[] f41729 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f41730;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f41731;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1855 f41732;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15278[] f41736;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f41735 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f41734 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f41733 = 0;

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeNamespace(int i) {
        return "";
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        return null;
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
    public final int getLineNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        this.f41732 = new C1855(inputStream);
        this.f41735 = 0;
        this.f41734 = 0;
        this.f41730 = null;
        this.f41731 = null;
        this.f41733 = 0;
        this.f41736 = new C15278[8];
        int i = 0;
        while (true) {
            C15278[] c15278Arr = this.f41736;
            if (i >= c15278Arr.length) {
                break;
            }
            c15278Arr[i] = new C15278(0);
            i++;
        }
        try {
            byte[] bArr = new byte[4];
            C1855 c1855 = this.f41732;
            c1855.getClass();
            c1855.readFully(bArr, 0, 4);
            if (!Arrays.equals(bArr, C5584.f19390)) {
                throw new IOException("Unexpected magic " + m32460(bArr));
            }
            if (m32463() == 0) {
                m32461();
            }
        } catch (IOException e) {
            throw new XmlPullParserException(e.toString());
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(Reader reader) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() throws XmlPullParserException, IOException {
        int iNextToken;
        while (true) {
            iNextToken = nextToken();
            if (iNextToken == 1 || iNextToken == 2 || iNextToken == 3) {
                break;
            }
            if (iNextToken == 4) {
                String string = this.f41731;
                while (true) {
                    int iM32463 = m32463();
                    if (iM32463 != 4 && iM32463 != 5 && iM32463 != 6) {
                        if (iM32463 != 8 && iM32463 != 9) {
                            break;
                        }
                        m32461();
                    } else {
                        m32461();
                        StringBuilder sbM27333 = C10732.m27333(string);
                        sbM27333.append(this.f41731);
                        string = sbM27333.toString();
                    }
                }
                this.f41735 = 4;
                this.f41730 = null;
                this.f41731 = string;
                if (string != null && string.length() != 0) {
                    return 4;
                }
            }
        }
        return iNextToken;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() throws XmlPullParserException, IOException {
        int iM32463;
        if (this.f41735 == 3) {
            this.f41734--;
        }
        try {
            iM32463 = m32463();
            m32461();
        } catch (EOFException unused) {
            iM32463 = 1;
        }
        if (iM32463 == 2) {
            m32463();
            this.f41734++;
        }
        this.f41735 = iM32463;
        return iM32463;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m32463() throws XmlPullParserException, IOException {
        while (true) {
            int iM6374 = this.f41732.m6374() & 15;
            if (iM6374 != 15) {
                return iM6374;
            }
            m32461();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32461() throws XmlPullParserException, IOException {
        String str;
        byte b = this.f41732.readByte();
        int i = b & 15;
        int i2 = b & 240;
        if (i == 15) {
            int i3 = this.f41733;
            C15278[] c15278Arr = this.f41736;
            if (i3 == c15278Arr.length) {
                int length = c15278Arr.length;
                int i4 = (length >> 1) + length;
                this.f41736 = (C15278[]) Arrays.copyOf(c15278Arr, i4);
                while (length < i4) {
                    this.f41736[length] = new C15278(0);
                    length++;
                }
            }
            C15278[] c15278Arr2 = this.f41736;
            int i5 = this.f41733;
            this.f41733 = i5 + 1;
            C15278 c15278 = c15278Arr2[i5];
            c15278.f49929 = this.f41732.m6375();
            c15278.f49935 = i2;
            switch (i2) {
                case 16:
                case 192:
                case 208:
                    return;
                case 32:
                    c15278.f49930 = this.f41732.readUTF();
                    return;
                case 48:
                    c15278.f49930 = this.f41732.m6375();
                    return;
                case 64:
                case 80:
                    int unsignedShort = this.f41732.readUnsignedShort();
                    byte[] bArr = new byte[unsignedShort];
                    C1855 c1855 = this.f41732;
                    c1855.getClass();
                    c1855.readFully(bArr, 0, unsignedShort);
                    c15278.f49931 = bArr;
                    return;
                case 96:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    c15278.f49933 = this.f41732.readInt();
                    return;
                case 128:
                case 144:
                    c15278.f49932 = this.f41732.readLong();
                    return;
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                    c15278.f49934 = this.f41732.readFloat();
                    return;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    c15278.f49936 = this.f41732.readDouble();
                    return;
                default:
                    throw new IOException(C13645.m33382(i2, "Unexpected data type "));
            }
        }
        switch (i) {
            case 0:
                this.f41730 = null;
                this.f41731 = null;
                if (this.f41733 > 0) {
                    m32462();
                    return;
                }
                return;
            case 1:
                this.f41730 = null;
                this.f41731 = null;
                if (this.f41733 > 0) {
                    m32462();
                    return;
                }
                return;
            case 2:
                this.f41730 = this.f41732.m6375();
                this.f41731 = null;
                if (this.f41733 > 0) {
                    m32462();
                    return;
                }
                return;
            case 3:
                this.f41730 = this.f41732.m6375();
                this.f41731 = null;
                if (this.f41733 > 0) {
                    m32462();
                    return;
                }
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f41730 = null;
                this.f41731 = this.f41732.readUTF();
                if (this.f41733 > 0) {
                    m32462();
                    return;
                }
                return;
            case 6:
                String utf = this.f41732.readUTF();
                this.f41730 = utf;
                switch (utf) {
                    case "gt":
                        str = ">";
                        break;
                    case "lt":
                        str = "<";
                        break;
                    case "amp":
                        str = a.p;
                        break;
                    case "apos":
                        str = "'";
                        break;
                    case "quot":
                        str = "\"";
                        break;
                    default:
                        if (utf.length() > 1 && utf.charAt(0) == '#') {
                            str = new String(new char[]{(char) Integer.parseInt(utf.substring(1))});
                            break;
                        } else {
                            throw new XmlPullParserException("Unknown entity ".concat(utf));
                        }
                        break;
                }
                this.f41731 = str;
                if (this.f41733 > 0) {
                    m32462();
                    return;
                }
                return;
            default:
                throw new IOException(C6934.m19217("Unknown token ", i, i2, " with type "));
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) throws XmlPullParserException {
        if (str == null || str.isEmpty()) {
            if (this.f41735 != i || !C17359.equals(this.f41730, str2)) {
                throw new XmlPullParserException(getPositionDescription());
            }
            return;
        }
        throw new IllegalArgumentException("Namespaces are not supported");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextTag() throws XmlPullParserException, IOException {
        int next = next();
        if (next == 4 && isWhitespace()) {
            next = next();
        }
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException(getPositionDescription());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m32462() {
        for (int i = 0; i < this.f41733; i++) {
            C15278 c15278 = this.f41736[i];
            c15278.f49929 = null;
            c15278.f49930 = null;
            c15278.f49931 = null;
        }
        this.f41733 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[RETURN] */
    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeValue(String str, String str2) {
        if (str == null || str.isEmpty()) {
            int i = 0;
            while (i < this.f41733) {
                if (C17359.equals(this.f41736[i].f49929, str2)) {
                    if (i != -1) {
                        return this.f41736[i].m36639();
                    }
                    return null;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return this.f41736[i].m36639();
            }
            return null;
        }
        throw new IllegalArgumentException("Namespaces are not supported");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32464(int i) {
        return this.f41736[i].f49935;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeValue(int i) {
        return this.f41736[i].m36639();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        return this.f41731;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        char[] charArray = this.f41731.toCharArray();
        iArr[0] = 0;
        iArr[1] = charArray.length;
        return charArray;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getInputEncoding() {
        return StandardCharsets.UTF_8.name();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getDepth() {
        return this.f41734;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPositionDescription() {
        return "Token " + this.f41735 + " at depth " + this.f41734;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() throws XmlPullParserException {
        int i = this.f41735;
        if (i == 4 || i == 5) {
            return !TextUtils.isGraphic(this.f41731);
        }
        if (i == 7) {
            return true;
        }
        throw new XmlPullParserException("Not applicable for token " + this.f41735);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        int i = this.f41735;
        if (i == 2 || i == 3) {
            return "";
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        return this.f41730;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.f41735 == 2) {
            try {
                return m32463() == 3;
            } catch (IOException e) {
                throw new XmlPullParserException(e.toString());
            }
        }
        throw new XmlPullParserException("Not at START_TAG");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getAttributeCount() {
        return this.f41733;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeName(int i) {
        return this.f41736[i].f49929;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f41735;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException, IOException {
        if (this.f41735 != 2) {
            throw new XmlPullParserException(getPositionDescription());
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException(getPositionDescription());
        }
        String str = this.f41731;
        if (next() == 3) {
            return str;
        }
        throw new XmlPullParserException(getPositionDescription());
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void defineEntityReplacementText(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setFeature(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32460(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f41729;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
