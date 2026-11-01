package l;

import android.content.Context;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.File;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 35B7 */
/* JADX INFO: loaded from: classes2.dex */
public class C1791 implements InterfaceC17888 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static Context f6942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5861(int i, int i2, int[] iArr) {
        int length = iArr.length;
        int length2 = iArr.length - 2;
        int i3 = i;
        while (i3 >= i2 && iArr[i3] % length > i) {
            length2 = i3;
            i3 -= (i - i3) + 1;
        }
        int iMax = Math.max(i2 - 1, i3);
        while (length2 > iMax + 1) {
            int i4 = (iMax + length2) >> 1;
            if (iArr[i4] % length > i) {
                length2 = i4;
            } else {
                iMax = i4;
            }
        }
        return length2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Context m5862() {
        Context context = f6942;
        if (context == null) {
            return null;
        }
        return context;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static File m5870() {
        File[] externalFilesDirs;
        Context context = f6942;
        if (context == null) {
            context = null;
        }
        if (context == null) {
            return null;
        }
        try {
            externalFilesDirs = context.getExternalFilesDirs(null);
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.Util", "getExternalFilesDirs exception", th);
            externalFilesDirs = null;
        }
        if (externalFilesDirs == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m5872() {
        Context context = f6942;
        if ((context == null ? null : context) == null) {
            return "";
        }
        if (context == null) {
            context = null;
        }
        return context.getPackageName();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5867(Context context) {
        f6942 = context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5863(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j < 1048576) {
            return m5865("K", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m5865("M", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m5865("G", j / 1.073741824E9d);
        }
        return m5865("T", j / 1.099511627776E12d);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m5873(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + " B";
        }
        if (j < 1048576) {
            return m5865(" KB", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m5865(" MB", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m5865(" GB", j / 1.073741824E9d);
        }
        return m5865(" TB", j / 1.099511627776E12d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5865(String str, double d) {
        long jRound = Math.round(d * 100.0d);
        boolean z = jRound < 0;
        if (z) {
            jRound = -jRound;
        }
        long j = jRound / 100;
        long j2 = jRound % 100;
        StringBuilder sb = new StringBuilder(str.length() + 7);
        if (z) {
            sb.append('-');
        }
        sb.append(j);
        sb.append('.');
        if (j2 < 10) {
            sb.append('0');
        }
        return C15037.m36023(sb, j2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17329 m5866(C17329 c17329, C17329 c173210) {
        if (c17329 == c173210) {
            return c17329;
        }
        int size = c17329.size();
        if (c173210.size() != size) {
            throw new C21293("mismatched stack depths", null);
        }
        C17329 c17329M40299 = null;
        for (int i = 0; i < size; i++) {
            InterfaceC4919 interfaceC4919M40293 = c17329.m40293(i);
            InterfaceC4919 interfaceC4919M40294 = c173210.m40293(i);
            InterfaceC4919 interfaceC4919M5875 = m5875(interfaceC4919M40293, interfaceC4919M40294);
            if (interfaceC4919M5875 != interfaceC4919M40293) {
                if (c17329M40299 == null) {
                    c17329M40299 = c17329.m40299();
                }
                if (interfaceC4919M5875 == null) {
                    throw new C21293("incompatible: " + interfaceC4919M40293 + ", " + interfaceC4919M40294, null);
                }
                try {
                    c17329M40299.m40294(i, interfaceC4919M5875);
                } catch (C21293 e) {
                    e.m20021("...while merging stack[" + C22475.m49982(i) + "]");
                    throw e;
                }
                e.m20021("...while merging stack[" + C22475.m49982(i) + "]");
                throw e;
            }
        }
        if (c17329M40299 == null) {
            return c17329;
        }
        c17329M40299.mo9637();
        return c17329M40299;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m5874(String str) {
        String strReplace;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        if (i > 0) {
            str = str.substring(i);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'V') {
            strReplace = ClassTransform.VOID;
        } else if (cCharAt == 'Z') {
            strReplace = ClassTransform.BOOLEAN;
        } else if (cCharAt == 'B') {
            strReplace = ClassTransform.BYTE;
        } else if (cCharAt == 'C') {
            strReplace = ClassTransform.CHARACTER;
        } else if (cCharAt == 'S') {
            strReplace = ClassTransform.SHORT;
        } else if (cCharAt == 'I') {
            strReplace = ClassTransform.INTEGER;
        } else if (cCharAt == 'F') {
            strReplace = ClassTransform.FLOAT;
        } else if (cCharAt == 'J') {
            strReplace = ClassTransform.LONG;
        } else if (cCharAt == 'D') {
            strReplace = ClassTransform.DOUBLE;
        } else if (cCharAt == '%') {
            strReplace = "%";
        } else {
            strReplace = cCharAt == 'L' ? str.substring(1, str.indexOf(59)).replace('/', '.') : null;
        }
        if (strReplace == null) {
            throw new IllegalArgumentException(C16523.m38890("Unknown type [", str, "]"));
        }
        for (int i2 = 0; i2 < i; i2++) {
            strReplace = C15489.m37076(strReplace, "[]");
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4919 m5875(InterfaceC4919 interfaceC4919, InterfaceC4919 interfaceC49110) {
        if (interfaceC4919 == null || interfaceC4919.equals(interfaceC49110)) {
            return interfaceC4919;
        }
        if (interfaceC49110 == null) {
            return null;
        }
        C3320 type = interfaceC4919.getType();
        C3320 type2 = interfaceC49110.getType();
        if (type == type2) {
            return type;
        }
        if (type.m9829() && type2.m9829()) {
            C3320 c3320 = C3320.f12286;
            if (type == c3320) {
                return type2;
            }
            if (type2 == c3320) {
                return type;
            }
            if (type.m9838() && type2.m9838()) {
                InterfaceC4919 interfaceC4919M5875 = m5875(type.m9843(), type2.m9843());
                if (interfaceC4919M5875 == null) {
                    return C3320.f12289;
                }
                return ((C3320) interfaceC4919M5875).m9839();
            }
            return C3320.f12289;
        }
        if (type.m9841() && type2.m9841()) {
            return C3320.f12281;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5868(int[] iArr) {
        int iMin;
        int i;
        int i2;
        int length = iArr.length;
        int i3 = 1;
        if (length != 1) {
            int i4 = 2;
            if (length != 2) {
                int length2 = iArr.length;
                iArr[0] = iArr[0] + iArr[1];
                int i5 = 2;
                int i6 = 0;
                for (int i7 = 1; i7 < length2 - 1; i7++) {
                    if (i5 < length2) {
                        int i8 = iArr[i6];
                        i = iArr[i5];
                        if (i8 < i) {
                            i = iArr[i6];
                            iArr[i6] = i7;
                            i6++;
                        } else {
                            i5++;
                        }
                    } else {
                        i = iArr[i6];
                        iArr[i6] = i7;
                        i6++;
                    }
                    if (i5 >= length2 || (i6 < i7 && iArr[i6] < iArr[i5])) {
                        i2 = i + iArr[i6];
                        iArr[i6] = i7 + length2;
                        i6++;
                    } else {
                        i2 = i + iArr[i5];
                        i5++;
                    }
                    iArr[i7] = i2;
                }
                int length3 = iArr.length - 2;
                for (int i9 = 1; i9 < 19 && length3 > 1; i9++) {
                    length3 = m5861(length3 - 1, 0, iArr);
                }
                if (iArr[0] % iArr.length >= length3) {
                    int length4 = iArr.length - 2;
                    int length5 = iArr.length - 1;
                    while (i4 > 0) {
                        int iM5861 = m5861(length4 - 1, 0, iArr);
                        int i10 = length4 - iM5861;
                        int i11 = i4 - i10;
                        while (i11 > 0) {
                            iArr[length5] = i3;
                            i11--;
                            length5--;
                        }
                        i4 = i10 << 1;
                        i3++;
                        length4 = iM5861;
                    }
                    return;
                }
                int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length3 - 1);
                int i12 = 20 - iNumberOfLeadingZeros;
                int length6 = iArr.length - 2;
                int length7 = iArr.length - 1;
                i4 = i12 != 1 ? 1 : 2;
                int i13 = i12 == 1 ? length3 - 2 : length3;
                int i14 = i4 << 1;
                while (i14 > 0) {
                    int iM5862 = length6 <= length3 ? length6 : m5861(length6 - 1, length3, iArr);
                    if (i4 >= i12) {
                        iMin = Math.min(i13, 1 << (i4 - i12));
                    } else if (i4 == 19 - iNumberOfLeadingZeros) {
                        if (iArr[iM5862] == length6) {
                            iM5862++;
                        }
                        iMin = 1;
                    } else {
                        iMin = 0;
                    }
                    int i15 = (length6 - iM5862) + iMin;
                    int i16 = i14 - i15;
                    while (i16 > 0) {
                        iArr[length7] = i4;
                        i16--;
                        length7--;
                    }
                    i13 -= iMin;
                    i14 = i15 << 1;
                    i4++;
                    length6 = iM5862;
                }
                return;
            }
            iArr[1] = 1;
        }
        iArr[0] = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5869(InterfaceC4919 interfaceC4919, InterfaceC4919 interfaceC49110) {
        C3320 type = interfaceC4919.getType();
        C3320 type2 = interfaceC49110.getType();
        if (type.equals(type2)) {
            return true;
        }
        int iMo9834 = type.mo9834();
        int iMo9835 = type2.mo9834();
        if (iMo9834 == 10) {
            type = C3320.f12289;
            iMo9834 = 9;
        }
        if (iMo9835 == 10) {
            type2 = C3320.f12289;
            iMo9835 = 9;
        }
        if (iMo9834 != 9 || iMo9835 != 9) {
            return type.m9841() && type2.m9841();
        }
        C3320 c3320 = C3320.f12286;
        if (type == c3320) {
            return false;
        }
        if (type2 == c3320 || type == C3320.f12289) {
            return true;
        }
        if (!type.m9838()) {
            return !type2.m9838() || type == C3320.f12256 || type == C3320.f12264;
        }
        if (!type2.m9838()) {
            return false;
        }
        do {
            type = type.m9843();
            type2 = type2.m9843();
            if (!type.m9838()) {
                break;
            }
        } while (type2.m9838());
        return m5869(type, type2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5871(String str) {
        return str.equals("<clinit>") || str.equals("<init>");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5864(String str) {
        StringBuilder sb = new StringBuilder();
        C2682 c2682 = new C2682(str);
        while (c2682.m8220()) {
            sb.append(m5874(c2682.m8221()));
            if (c2682.m8220()) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
}
