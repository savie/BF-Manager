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

/* JADX INFO: renamed from: l.ܶۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15210 implements XmlPullParser {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f49609 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C18031 f49611;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f49612;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f49614;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22971[] f49616;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49615 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f49610 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f49613 = 0;

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
        this.f49611 = new C18031(inputStream);
        this.f49615 = 0;
        this.f49610 = 0;
        this.f49614 = null;
        this.f49612 = null;
        this.f49613 = 0;
        this.f49616 = new C22971[8];
        int i = 0;
        while (true) {
            C22971[] c22971Arr = this.f49616;
            if (i >= c22971Arr.length) {
                break;
            }
            c22971Arr[i] = new C22971(0);
            i++;
        }
        try {
            byte[] bArr = new byte[4];
            C18031 c18031 = this.f49611;
            c18031.getClass();
            c18031.readFully(bArr, 0, 4);
            if (!Arrays.equals(bArr, C21559.f69997)) {
                throw new IOException("Unexpected magic " + m36414(bArr));
            }
            if (m36417() == 0) {
                m36415();
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
                String string = this.f49612;
                while (true) {
                    int iM36417 = m36417();
                    if (iM36417 != 4 && iM36417 != 5 && iM36417 != 6) {
                        if (iM36417 != 8 && iM36417 != 9) {
                            break;
                        }
                        m36415();
                    } else {
                        m36415();
                        StringBuilder sbM23356 = C9023.m23356(string);
                        sbM23356.append(this.f49612);
                        string = sbM23356.toString();
                    }
                }
                this.f49615 = 4;
                this.f49614 = null;
                this.f49612 = string;
                if (string != null && string.length() != 0) {
                    return 4;
                }
            }
        }
        return iNextToken;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() throws XmlPullParserException, IOException {
        int iM36417;
        if (this.f49615 == 3) {
            this.f49610--;
        }
        try {
            iM36417 = m36417();
            m36415();
        } catch (EOFException unused) {
            iM36417 = 1;
        }
        if (iM36417 == 2) {
            m36417();
            this.f49610++;
        }
        this.f49615 = iM36417;
        return iM36417;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m36417() throws XmlPullParserException, IOException {
        while (true) {
            int iM41982 = this.f49611.m41982() & 15;
            if (iM41982 != 15) {
                return iM41982;
            }
            m36415();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36415() throws XmlPullParserException, IOException {
        String str;
        byte b = this.f49611.readByte();
        int i = b & 15;
        int i2 = b & 240;
        if (i == 15) {
            int i3 = this.f49613;
            C22971[] c22971Arr = this.f49616;
            if (i3 == c22971Arr.length) {
                int length = c22971Arr.length;
                int i4 = (length >> 1) + length;
                this.f49616 = (C22971[]) Arrays.copyOf(c22971Arr, i4);
                while (length < i4) {
                    this.f49616[length] = new C22971(0);
                    length++;
                }
            }
            C22971[] c22971Arr2 = this.f49616;
            int i5 = this.f49613;
            this.f49613 = i5 + 1;
            C22971 c22971 = c22971Arr2[i5];
            c22971.f74656 = this.f49611.m41983();
            c22971.f74660 = i2;
            switch (i2) {
                case 16:
                case 192:
                case 208:
                    return;
                case 32:
                    c22971.f74659 = this.f49611.readUTF();
                    return;
                case 48:
                    c22971.f74659 = this.f49611.m41983();
                    return;
                case 64:
                case 80:
                    int unsignedShort = this.f49611.readUnsignedShort();
                    byte[] bArr = new byte[unsignedShort];
                    C18031 c18031 = this.f49611;
                    c18031.getClass();
                    c18031.readFully(bArr, 0, unsignedShort);
                    c22971.f74658 = bArr;
                    return;
                case 96:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    c22971.f74661 = this.f49611.readInt();
                    return;
                case 128:
                case 144:
                    c22971.f74654 = this.f49611.readLong();
                    return;
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                    c22971.f74657 = this.f49611.readFloat();
                    return;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    c22971.f74655 = this.f49611.readDouble();
                    return;
                default:
                    throw new IOException(C8479.m22141(i2, "Unexpected data type "));
            }
        }
        switch (i) {
            case 0:
                this.f49614 = null;
                this.f49612 = null;
                if (this.f49613 > 0) {
                    m36416();
                    return;
                }
                return;
            case 1:
                this.f49614 = null;
                this.f49612 = null;
                if (this.f49613 > 0) {
                    m36416();
                    return;
                }
                return;
            case 2:
                this.f49614 = this.f49611.m41983();
                this.f49612 = null;
                if (this.f49613 > 0) {
                    m36416();
                    return;
                }
                return;
            case 3:
                this.f49614 = this.f49611.m41983();
                this.f49612 = null;
                if (this.f49613 > 0) {
                    m36416();
                    return;
                }
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f49614 = null;
                this.f49612 = this.f49611.readUTF();
                if (this.f49613 > 0) {
                    m36416();
                    return;
                }
                return;
            case 6:
                String utf = this.f49611.readUTF();
                this.f49614 = utf;
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
                this.f49612 = str;
                if (this.f49613 > 0) {
                    m36416();
                    return;
                }
                return;
            default:
                throw new IOException(C2271.m6967("Unknown token ", i, i2, " with type "));
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) throws XmlPullParserException {
        if (str == null || str.isEmpty()) {
            if (this.f49615 != i || !C13638.equals(this.f49614, str2)) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36416() {
        for (int i = 0; i < this.f49613; i++) {
            C22971 c22971 = this.f49616[i];
            c22971.f74656 = null;
            c22971.f74659 = null;
            c22971.f74658 = null;
        }
        this.f49613 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[RETURN] */
    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeValue(String str, String str2) {
        if (str == null || str.isEmpty()) {
            int i = 0;
            while (i < this.f49613) {
                if (C13638.equals(this.f49616[i].f74656, str2)) {
                    if (i != -1) {
                        return this.f49616[i].m50813();
                    }
                    return null;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return this.f49616[i].m50813();
            }
            return null;
        }
        throw new IllegalArgumentException("Namespaces are not supported");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36418(int i) {
        return this.f49616[i].f74660;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeValue(int i) {
        return this.f49616[i].m50813();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        return this.f49612;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        char[] charArray = this.f49612.toCharArray();
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
        return this.f49610;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPositionDescription() {
        return "Token " + this.f49615 + " at depth " + this.f49610;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() throws XmlPullParserException {
        int i = this.f49615;
        if (i == 4 || i == 5) {
            return !TextUtils.isGraphic(this.f49612);
        }
        if (i == 7) {
            return true;
        }
        throw new XmlPullParserException("Not applicable for token " + this.f49615);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        int i = this.f49615;
        if (i == 2 || i == 3) {
            return "";
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        return this.f49614;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.f49615 == 2) {
            try {
                return m36417() == 3;
            } catch (IOException e) {
                throw new XmlPullParserException(e.toString());
            }
        }
        throw new XmlPullParserException("Not at START_TAG");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getAttributeCount() {
        return this.f49613;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeName(int i) {
        return this.f49616[i].f74656;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.f49615;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() throws XmlPullParserException, IOException {
        if (this.f49615 != 2) {
            throw new XmlPullParserException(getPositionDescription());
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException(getPositionDescription());
        }
        String str = this.f49612;
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
    public static String m36414(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f49609;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
