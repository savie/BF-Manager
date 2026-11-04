package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ۖۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31R1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2448 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f7849;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final int f7850;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f7851;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int f7852;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final List f7853;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f7854;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int f7855;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f7856;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int f7857;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int f7858;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f7859;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int f7860;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int f7861;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final List f7862;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int f7863;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int f7864;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f7865;

    static {
        int iM8271;
        int iM8272;
        int iM8273;
        int iM8274;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f7850 = m8271(a.D, a.D, arrayList, arrayList2);
        f7861 = m8271(a.D, "UTF-8-BOM", arrayList, arrayList2);
        f7858 = m8271("UTF-16BE", "UTF-16BE", arrayList, arrayList2);
        f7859 = m8271("UTF-16LE", "UTF-16LE", arrayList, arrayList2);
        f7857 = m8271("UTF-32BE", "UTF-32BE", arrayList, arrayList2);
        f7864 = m8271("UTF-32LE", "UTF-32LE", arrayList, arrayList2);
        f7860 = m8271("GB2312", "GB2312", arrayList, arrayList2);
        f7863 = m8271("GB18030", "GB18030", arrayList, arrayList2);
        f7856 = m8271("GBK", "GBK", arrayList, arrayList2);
        int iM8275 = -1;
        try {
            iM8271 = m8271("Big5", "Big5", arrayList, arrayList2);
        } catch (Exception unused) {
            iM8271 = -1;
        }
        f7851 = iM8271;
        try {
            m8271("Big5-HKSCS", "Big5-HKSCS", arrayList, arrayList2);
        } catch (Exception unused2) {
        }
        try {
            m8271("CESU-8", "CESU-8", arrayList, arrayList2);
        } catch (Exception unused3) {
        }
        try {
            m8271("EUC-JP", "EUC-JP", arrayList, arrayList2);
        } catch (Exception unused4) {
        }
        try {
            m8271("EUC-KR", "EUC-KR", arrayList, arrayList2);
        } catch (Exception unused5) {
        }
        try {
            m8271("IBM866", "IBM866", arrayList, arrayList2);
        } catch (Exception unused6) {
        }
        try {
            m8271("IBM850", "IBM850", arrayList, arrayList2);
        } catch (Exception unused7) {
        }
        try {
            iM8272 = m8271("ISO-2022-CN", "ISO-2022-CN", arrayList, arrayList2);
        } catch (Exception unused8) {
            iM8272 = -1;
        }
        f7855 = iM8272;
        try {
            iM8273 = m8271("ISO-2022-JP", "ISO-2022-JP", arrayList, arrayList2);
        } catch (Exception unused9) {
            iM8273 = -1;
        }
        f7852 = iM8273;
        try {
            iM8274 = m8271("ISO-2022-KR", "ISO-2022-KR", arrayList, arrayList2);
        } catch (Exception unused10) {
            iM8274 = -1;
        }
        f7849 = iM8274;
        try {
            m8271(LocalizedMessage.DEFAULT_ENCODING, LocalizedMessage.DEFAULT_ENCODING, arrayList, arrayList2);
        } catch (Exception unused11) {
        }
        try {
            m8271("ISO-8859-2", "ISO-8859-2", arrayList, arrayList2);
        } catch (Exception unused12) {
        }
        try {
            m8271("ISO-8859-3", "ISO-8859-3", arrayList, arrayList2);
        } catch (Exception unused13) {
        }
        try {
            m8271("ISO-8859-4", "ISO-8859-4", arrayList, arrayList2);
        } catch (Exception unused14) {
        }
        try {
            m8271("ISO-8859-5", "ISO-8859-5", arrayList, arrayList2);
        } catch (Exception unused15) {
        }
        try {
            m8271("ISO-8859-6", "ISO-8859-6", arrayList, arrayList2);
        } catch (Exception unused16) {
        }
        try {
            m8271("ISO-8859-7", "ISO-8859-7", arrayList, arrayList2);
        } catch (Exception unused17) {
        }
        try {
            m8271("ISO-8859-8", "ISO-8859-8", arrayList, arrayList2);
        } catch (Exception unused18) {
        }
        try {
            m8271("ISO-8859-9", "ISO-8859-9", arrayList, arrayList2);
        } catch (Exception unused19) {
        }
        try {
            m8271("ISO-8859-10", "ISO-8859-10", arrayList, arrayList2);
        } catch (Exception unused20) {
        }
        try {
            m8271("ISO-8859-13", "ISO-8859-13", arrayList, arrayList2);
        } catch (Exception unused21) {
        }
        try {
            m8271("ISO-8859-14", "ISO-8859-14", arrayList, arrayList2);
        } catch (Exception unused22) {
        }
        try {
            m8271("ISO-8859-15", "ISO-8859-15", arrayList, arrayList2);
        } catch (Exception unused23) {
        }
        try {
            m8271("KOI8-R", "KOI8-R", arrayList, arrayList2);
        } catch (Exception unused24) {
        }
        try {
            m8271("KOI8-U", "KOI8-U", arrayList, arrayList2);
        } catch (Exception unused25) {
        }
        try {
            iM8275 = m8271("ShiftJIS", "ShiftJIS", arrayList, arrayList2);
        } catch (Exception unused26) {
        }
        f7854 = iM8275;
        try {
            m8271("Windows-1250", "Windows-1250", arrayList, arrayList2);
        } catch (Exception unused27) {
        }
        try {
            m8271("Windows-1251", "Windows-1251", arrayList, arrayList2);
        } catch (Exception unused28) {
        }
        try {
            m8271("Windows-1252", "Windows-1252", arrayList, arrayList2);
        } catch (Exception unused29) {
        }
        try {
            m8271("Windows-1253", "Windows-1253", arrayList, arrayList2);
        } catch (Exception unused30) {
        }
        try {
            m8271("Windows-1254", "Windows-1254", arrayList, arrayList2);
        } catch (Exception unused31) {
        }
        try {
            m8271("Windows-1255", "Windows-1255", arrayList, arrayList2);
        } catch (Exception unused32) {
        }
        try {
            m8271("Windows-1256", "Windows-1256", arrayList, arrayList2);
        } catch (Exception unused33) {
        }
        try {
            m8271("Windows-1257", "Windows-1257", arrayList, arrayList2);
        } catch (Exception unused34) {
        }
        try {
            m8271("Windows-1258", "Windows-1258", arrayList, arrayList2);
        } catch (Exception unused35) {
        }
        arrayList.trimToSize();
        arrayList2.trimToSize();
        f7865 = arrayList.size();
        f7862 = C4681.unmodifiableList(arrayList);
        f7853 = C4681.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8271(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Charset.forName(str));
        arrayList2.add(str2);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Charset m8272(int i) {
        return (Charset) f7862.get(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m8274(int i) {
        return (String) f7853.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8270(String str) {
        List list = f7853;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((String) list.get(i)).equals(str)) {
                return i;
            }
        }
        List list2 = f7862;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((Charset) list2.get(i2)).name().equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m8273(int i, byte[] bArr) {
        int iM8269 = m8269(i, bArr);
        return iM8269 == -1 ? f7850 : iM8269;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8269(int i, byte[] bArr) {
        Character.UnicodeBlock unicodeBlockOf;
        int i2;
        char cCharAt;
        InterfaceC19492[] interfaceC19492Arr = InterfaceC19492.f62922;
        ArrayList<C9159> arrayList = new ArrayList(14);
        for (int i3 = 0; i3 < 14; i3++) {
            InterfaceC19492 interfaceC19492 = interfaceC19492Arr[i3];
            if (interfaceC19492.mo5604() != -1) {
                int iMo5605 = interfaceC19492.mo5605(i, bArr);
                if (iMo5605 == 100) {
                    return interfaceC19492.mo5604();
                }
                if (iMo5605 >= 50) {
                    int iMo5604 = interfaceC19492.mo5604();
                    C9159 c9159 = new C9159();
                    c9159.f29739 = iMo5605;
                    c9159.f29738 = iMo5604;
                    arrayList.add(c9159);
                }
            }
        }
        Collections.sort(arrayList);
        for (C9159 c91510 : arrayList) {
            String str = new String(bArr, 0, i, m8272(c91510.f29738));
            int length = str.length();
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 >= 55296 && cCharAt2 <= 56319 && (i2 = i4 + 1) < length && (cCharAt = str.charAt(i2)) >= 56320 && cCharAt <= 57343) {
                    i4 = i2;
                } else if ((cCharAt2 >= ' ' || cCharAt2 == '\r' || cCharAt2 == '\n' || cCharAt2 == '\t') && cCharAt2 != 127 && ((cCharAt2 != 65533 || (i5 = i5 + 1) <= 10) && (cCharAt2 <= 127 || ((unicodeBlockOf = Character.UnicodeBlock.of(cCharAt2)) != Character.UnicodeBlock.PRIVATE_USE_AREA && unicodeBlockOf != Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A && unicodeBlockOf != Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B)))) {
                }
                i4++;
            }
            return c91510.f29738;
        }
        return -1;
    }
}
