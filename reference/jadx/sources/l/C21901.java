package l;

import com.umeng.analytics.pro.bo;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.᩷۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F411 */
/* JADX INFO: loaded from: classes.dex */
public final class C21901 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49591(int i, int i2, byte[] bArr) {
        char[] cArr = new char[i2];
        int i3 = i2 + i;
        int i4 = 0;
        while (i < i3) {
            int i5 = i + 1;
            byte b = bArr[i];
            int i6 = b & 255;
            if (i6 >= 224) {
                int i7 = i + 2;
                i += 3;
                i6 = ((bArr[i5] & 63) << 6) | ((b & 15) << 12) | (bArr[i7] & 63);
            } else if (i6 >= 192) {
                i += 2;
                i6 = ((b & bo.j) << 6) | (bArr[i5] & 63);
            } else {
                i = i5;
            }
            cArr[i4] = (char) i6;
            i4++;
        }
        return new String(cArr, 0, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49589(byte[] bArr, int i, int i2, char[] cArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3];
            if (1 <= c && c <= 127) {
                bArr[i] = (byte) c;
                i++;
            } else if (c <= 2047) {
                int i4 = i + 1;
                bArr[i] = (byte) ((c >> 6) | 192);
                i += 2;
                bArr[i4] = (byte) ((c & '?') | 128);
            } else {
                bArr[i] = (byte) ((c >> '\f') | BERTags.FLAGS);
                int i5 = i + 2;
                bArr[i + 1] = (byte) (((c >> 6) & 63) | 128);
                i += 3;
                bArr[i5] = (byte) ((c & '?') | 128);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49592(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(m49590(str.charAt(i)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49590(char c) {
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\"') {
            return "\\\"";
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c == '\\') {
            return "\\\\";
        }
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            default:
                return (c < ' ' || c > '~') ? String.format("\\u%04x", Integer.valueOf(c)) : String.valueOf(c);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC19728 m49594(AbstractC19728 abstractC19728) {
        return (abstractC19728.m45427((byte) 46) + 1 == 0 && abstractC19728.mo42395() == abstractC19728.length()) ? abstractC19728 : abstractC19728.m45429(abstractC19728.m45427((byte) 46) + 1, abstractC19728.mo42395());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14769 m49595(AbstractC19728 abstractC19728) {
        C14769 c14769M35543 = C14769.m35543();
        while (true) {
            int iM45427 = abstractC19728.m45427((byte) 36);
            if (iM45427 <= 0) {
                return c14769M35543;
            }
            abstractC19728 = abstractC19728.m45429(0, iM45427);
            c14769M35543.getClass();
            c14769M35543 = new C14769(abstractC19728, c14769M35543);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m49593(AbstractC19728 abstractC19728) {
        C14769 c14769M35543 = C14769.m35543();
        String string = abstractC19728.toString();
        int iIndexOf = -1;
        while (true) {
            iIndexOf = string.indexOf(46, iIndexOf + 1);
            if (iIndexOf <= 0) {
                return c14769M35543.m35554();
            }
            int i = iIndexOf + 1;
            String strSubstring = string.substring(0, i);
            String strReplace = string.substring(i).replace('.', '$');
            C15252 c15252 = abstractC19728.f63499.f73707;
            AbstractC19728 abstractC19728M51194 = c15252.f49864.m51194(C14483.m34972(strSubstring, strReplace));
            c14769M35543.getClass();
            c14769M35543 = new C14769(abstractC19728M51194, c14769M35543);
        }
    }
}
