package l;

import java.util.ArrayList;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.᩺ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZIUC */
/* JADX INFO: loaded from: classes.dex */
public final class C24414 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C15580 m54617(C12479 c12479, C12479 c124710) {
        int iM31002 = c12479.m31002();
        int i = iM31002 & 31;
        int i2 = (iM31002 & BERTags.FLAGS) >> 5;
        int i3 = i2 + 1;
        if (i == 0) {
            return new C15580(EnumC23040.ENCODED_BYTE, Byte.valueOf(c12479.m30996()));
        }
        if (i == 6) {
            return new C15580(EnumC23040.ENCODED_LONG, Long.valueOf(m54615(c12479, i3, true, 0)));
        }
        if (i == 2) {
            return new C15580(EnumC23040.ENCODED_SHORT, Short.valueOf((short) m54615(c12479, i3, true, 0)));
        }
        if (i == 3) {
            return new C15580(EnumC23040.ENCODED_CHAR, Character.valueOf((char) m54615(c12479, i3, false, 0)));
        }
        if (i == 4) {
            return new C15580(EnumC23040.ENCODED_INT, Integer.valueOf((int) m54615(c12479, i3, true, 0)));
        }
        if (i == 16) {
            return new C15580(EnumC23040.ENCODED_FLOAT, Float.valueOf(Float.intBitsToFloat((int) m54615(c12479, i3, false, 4))));
        }
        if (i == 17) {
            return new C15580(EnumC23040.ENCODED_DOUBLE, Double.valueOf(Double.longBitsToDouble(m54615(c12479, i3, false, 8))));
        }
        switch (i) {
            case 21:
                return new C15580(EnumC23040.ENCODED_METHOD_TYPE, c124710.m31003((int) m54615(c12479, i3, false, 0)));
            case 22:
                return new C15580(EnumC23040.ENCODED_METHOD_HANDLE, c124710.m30993((int) m54615(c12479, i3, false, 0)));
            case 23:
                return new C15580(EnumC23040.ENCODED_STRING, c124710.m30998((int) m54615(c12479, i3, false, 0)));
            case 24:
                return new C15580(EnumC23040.ENCODED_TYPE, c124710.m30997((int) m54615(c12479, i3, false, 0)));
            case 25:
            case 27:
                EnumC23040 enumC23040 = EnumC23040.ENCODED_FIELD;
                int iM54615 = (int) m54615(c12479, i3, false, 0);
                c124710.getClass();
                C16954 c16954 = new C16954(null);
                c16954.m39935(c124710.m30997(c124710.m30985(c16954, iM54615)));
                return new C15580(enumC23040, c16954);
            case 26:
                EnumC23040 enumC23041 = EnumC23040.ENCODED_METHOD;
                int iM54616 = (int) m54615(c12479, i3, false, 0);
                C20684 c20684 = new C20684();
                c124710.m30989(iM54616, c20684);
                return new C15580(enumC23041, c20684);
            case 28:
                return new C15580(EnumC23040.ENCODED_ARRAY, m54616(c12479, c124710));
            case 29:
                return new C15580(EnumC23040.ENCODED_ANNOTATION, C6514.m18377(c12479, c124710, false));
            case 30:
                return C15580.f50679;
            case 31:
                return new C15580(EnumC23040.ENCODED_BOOLEAN, Boolean.valueOf(i2 == 1));
            default:
                throw new C13817(C4791.m14766(new StringBuilder("Unknown encoded value type: 0x"), i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m54616(C12479 c12479, C12479 c124710) {
        c12479.getClass();
        int iM50647 = C22463.m50647(c12479);
        ArrayList arrayList = new ArrayList(iM50647);
        for (int i = 0; i < iM50647; i++) {
            arrayList.add(m54617(c12479, c124710));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m54615(C12479 c12479, int i, boolean z, int i2) {
        long j = 0;
        long jM31002 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            jM31002 = c12479.m31002();
            j |= jM31002 << (i3 * 8);
        }
        if (i2 != 0) {
            while (i < i2) {
                j <<= 8;
                i++;
            }
            return j;
        }
        if (z && (128 & jM31002) != 0) {
            while (i < 8) {
                j |= 255 << (i * 8);
                i++;
            }
        }
        return j;
    }
}
