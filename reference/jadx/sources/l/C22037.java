package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩹ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22037 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f71418;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int f71419;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int f71420;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f71421;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int f71422;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f71423;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int f71424;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final List f71425;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f71426;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final List f71427;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int f71428;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f71429;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int f71430;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int f71431;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int f71432;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int f71433;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f71434;

    static {
        int iM48952;
        int iM48953;
        int iM48954;
        int iM48955;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f71424 = m48952(a.D, a.D, arrayList, arrayList2);
        f71431 = m48952(a.D, "UTF-8-BOM", arrayList, arrayList2);
        f71428 = m48952("UTF-16BE", "UTF-16BE", arrayList, arrayList2);
        f71432 = m48952("UTF-16LE", "UTF-16LE", arrayList, arrayList2);
        f71429 = m48952("UTF-32BE", "UTF-32BE", arrayList, arrayList2);
        f71430 = m48952("UTF-32LE", "UTF-32LE", arrayList, arrayList2);
        f71422 = m48952("GB2312", "GB2312", arrayList, arrayList2);
        f71419 = m48952("GB18030", "GB18030", arrayList, arrayList2);
        f71433 = m48952("GBK", "GBK", arrayList, arrayList2);
        int iM48956 = -1;
        try {
            iM48952 = m48952("Big5", "Big5", arrayList, arrayList2);
        } catch (Exception unused) {
            iM48952 = -1;
        }
        f71421 = iM48952;
        try {
            m48952("Big5-HKSCS", "Big5-HKSCS", arrayList, arrayList2);
        } catch (Exception unused2) {
        }
        try {
            m48952("CESU-8", "CESU-8", arrayList, arrayList2);
        } catch (Exception unused3) {
        }
        try {
            m48952("EUC-JP", "EUC-JP", arrayList, arrayList2);
        } catch (Exception unused4) {
        }
        try {
            m48952("EUC-KR", "EUC-KR", arrayList, arrayList2);
        } catch (Exception unused5) {
        }
        try {
            m48952("IBM866", "IBM866", arrayList, arrayList2);
        } catch (Exception unused6) {
        }
        try {
            m48952("IBM850", "IBM850", arrayList, arrayList2);
        } catch (Exception unused7) {
        }
        try {
            iM48953 = m48952("ISO-2022-CN", "ISO-2022-CN", arrayList, arrayList2);
        } catch (Exception unused8) {
            iM48953 = -1;
        }
        f71418 = iM48953;
        try {
            iM48954 = m48952("ISO-2022-JP", "ISO-2022-JP", arrayList, arrayList2);
        } catch (Exception unused9) {
            iM48954 = -1;
        }
        f71426 = iM48954;
        try {
            iM48955 = m48952("ISO-2022-KR", "ISO-2022-KR", arrayList, arrayList2);
        } catch (Exception unused10) {
            iM48955 = -1;
        }
        f71420 = iM48955;
        try {
            m48952(LocalizedMessage.DEFAULT_ENCODING, LocalizedMessage.DEFAULT_ENCODING, arrayList, arrayList2);
        } catch (Exception unused11) {
        }
        try {
            m48952("ISO-8859-2", "ISO-8859-2", arrayList, arrayList2);
        } catch (Exception unused12) {
        }
        try {
            m48952("ISO-8859-3", "ISO-8859-3", arrayList, arrayList2);
        } catch (Exception unused13) {
        }
        try {
            m48952("ISO-8859-4", "ISO-8859-4", arrayList, arrayList2);
        } catch (Exception unused14) {
        }
        try {
            m48952("ISO-8859-5", "ISO-8859-5", arrayList, arrayList2);
        } catch (Exception unused15) {
        }
        try {
            m48952("ISO-8859-6", "ISO-8859-6", arrayList, arrayList2);
        } catch (Exception unused16) {
        }
        try {
            m48952("ISO-8859-7", "ISO-8859-7", arrayList, arrayList2);
        } catch (Exception unused17) {
        }
        try {
            m48952("ISO-8859-8", "ISO-8859-8", arrayList, arrayList2);
        } catch (Exception unused18) {
        }
        try {
            m48952("ISO-8859-9", "ISO-8859-9", arrayList, arrayList2);
        } catch (Exception unused19) {
        }
        try {
            m48952("ISO-8859-10", "ISO-8859-10", arrayList, arrayList2);
        } catch (Exception unused20) {
        }
        try {
            m48952("ISO-8859-13", "ISO-8859-13", arrayList, arrayList2);
        } catch (Exception unused21) {
        }
        try {
            m48952("ISO-8859-14", "ISO-8859-14", arrayList, arrayList2);
        } catch (Exception unused22) {
        }
        try {
            m48952("ISO-8859-15", "ISO-8859-15", arrayList, arrayList2);
        } catch (Exception unused23) {
        }
        try {
            m48952("KOI8-R", "KOI8-R", arrayList, arrayList2);
        } catch (Exception unused24) {
        }
        try {
            m48952("KOI8-U", "KOI8-U", arrayList, arrayList2);
        } catch (Exception unused25) {
        }
        try {
            iM48956 = m48952("ShiftJIS", "ShiftJIS", arrayList, arrayList2);
        } catch (Exception unused26) {
        }
        f71423 = iM48956;
        try {
            m48952("Windows-1250", "Windows-1250", arrayList, arrayList2);
        } catch (Exception unused27) {
        }
        try {
            m48952("Windows-1251", "Windows-1251", arrayList, arrayList2);
        } catch (Exception unused28) {
        }
        try {
            m48952("Windows-1252", "Windows-1252", arrayList, arrayList2);
        } catch (Exception unused29) {
        }
        try {
            m48952("Windows-1253", "Windows-1253", arrayList, arrayList2);
        } catch (Exception unused30) {
        }
        try {
            m48952("Windows-1254", "Windows-1254", arrayList, arrayList2);
        } catch (Exception unused31) {
        }
        try {
            m48952("Windows-1255", "Windows-1255", arrayList, arrayList2);
        } catch (Exception unused32) {
        }
        try {
            m48952("Windows-1256", "Windows-1256", arrayList, arrayList2);
        } catch (Exception unused33) {
        }
        try {
            m48952("Windows-1257", "Windows-1257", arrayList, arrayList2);
        } catch (Exception unused34) {
        }
        try {
            m48952("Windows-1258", "Windows-1258", arrayList, arrayList2);
        } catch (Exception unused35) {
        }
        arrayList.trimToSize();
        arrayList2.trimToSize();
        f71434 = arrayList.size();
        f71427 = C0561.unmodifiableList(arrayList);
        f71425 = C0561.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48952(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Charset.forName(str));
        arrayList2.add(str2);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Charset m48953(int i) {
        return (Charset) f71427.get(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m48955(int i) {
        return (String) f71425.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48951(String str) {
        List list = f71425;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((String) list.get(i)).equals(str)) {
                return i;
            }
        }
        List list2 = f71427;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((Charset) list2.get(i2)).name().equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m48954(int i, byte[] bArr) {
        int iM48950 = m48950(i, bArr);
        return iM48950 == -1 ? f71424 : iM48950;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48950(int i, byte[] bArr) {
        Character.UnicodeBlock unicodeBlockOf;
        int i2;
        char cCharAt;
        InterfaceC17803[] interfaceC17803Arr = InterfaceC17803.f56421;
        ArrayList<C5103> arrayList = new ArrayList(14);
        for (int i3 = 0; i3 < 14; i3++) {
            InterfaceC17803 interfaceC17803 = interfaceC17803Arr[i3];
            if (interfaceC17803.mo3480() != -1) {
                int iMo3481 = interfaceC17803.mo3481(i, bArr);
                if (iMo3481 == 100) {
                    return interfaceC17803.mo3480();
                }
                if (iMo3481 >= 50) {
                    int iMo3480 = interfaceC17803.mo3480();
                    C5103 c5103 = new C5103();
                    c5103.f17790 = iMo3481;
                    c5103.f17789 = iMo3480;
                    arrayList.add(c5103);
                }
            }
        }
        Collections.sort(arrayList);
        for (C5103 c5104 : arrayList) {
            String str = new String(bArr, 0, i, m48953(c5104.f17789));
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
            return c5104.f17789;
        }
        return -1;
    }
}
