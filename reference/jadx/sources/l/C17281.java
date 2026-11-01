package l;

import com.umeng.analytics.pro.bo;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܿۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: F411 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17281 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40240(int i, int i2, byte[] bArr) {
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
    public static int m40238(byte[] bArr, int i, int i2, char[] cArr) {
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
    public static String m40241(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(m40239(str.charAt(i)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40239(char c) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC11242 m40243(AbstractC11242 abstractC11242) {
        return (abstractC11242.m28208((byte) 46) + 1 == 0 && abstractC11242.mo28217() == abstractC11242.length()) ? abstractC11242 : abstractC11242.m28210(abstractC11242.m28208((byte) 46) + 1, abstractC11242.mo28217());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21825 m40244(AbstractC11242 abstractC11242) {
        C21825 c21825M48588 = C21825.m48588();
        while (true) {
            int iM28208 = abstractC11242.m28208((byte) 36);
            if (iM28208 <= 0) {
                return c21825M48588;
            }
            abstractC11242 = abstractC11242.m28210(0, iM28208);
            c21825M48588.getClass();
            c21825M48588 = new C21825(abstractC11242, c21825M48588);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m40242(AbstractC11242 abstractC11242) {
        C21825 c21825M48588 = C21825.m48588();
        String string = abstractC11242.toString();
        int iIndexOf = -1;
        while (true) {
            iIndexOf = string.indexOf(46, iIndexOf + 1);
            if (iIndexOf <= 0) {
                return c21825M48588.m48589();
            }
            int i = iIndexOf + 1;
            String strSubstring = string.substring(0, i);
            String strReplace = string.substring(i).replace('.', '$');
            C23942 c23942 = abstractC11242.f38032.f21322;
            AbstractC11242 abstractC11242M17389 = c23942.f77631.m17389(C15489.m37076(strSubstring, strReplace));
            c21825M48588.getClass();
            c21825M48588 = new C21825(abstractC11242M17389, c21825M48588);
        }
    }
}
