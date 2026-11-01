package l;

import android.graphics.Color;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.cb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩺۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 096Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23006 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f74764;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f74765;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f74766;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f74767;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f74762 = new AtomicInteger((int) (System.currentTimeMillis() / 1000));

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C14690 f74760 = C14690.m35218(2, "parseColor\\((\\d+|_|AUTO),(\\d+|_|AUTO),([A-Z]+)(?:,(.+))?\\)");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C6222 f74758 = C14690.m35218(2, "(?<![a-f0-9])[a-f0-9]{3,8}(?![a-z0-9])").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C6222 f74759 = C14690.m35219("-?\\d+").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C6222 f74763 = C14690.m35219("-?\\d+(\\.\\d+)?%?").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final BigDecimal f74761 = BigDecimal.valueOf(255L);

    public C23006(int i, int i2, int i3, int i4) {
        this.f74766 = i;
        this.f74765 = i2;
        this.f74764 = i3;
        this.f74767 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23006)) {
            return false;
        }
        C23006 c23006 = (C23006) obj;
        return this.f74766 == c23006.f74766 && this.f74765 == c23006.f74765 && this.f74764 == c23006.f74764 && this.f74767 == c23006.f74767;
    }

    public final int hashCode() {
        return (((((this.f74766 * 31) + this.f74765) * 31) + this.f74764) * 31) + this.f74767;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f74766), Integer.valueOf(this.f74765), Integer.valueOf(this.f74764), Integer.valueOf(this.f74767)};
        String[] strArrSplit = "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId".length() == 0 ? new String[0] : "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId".split(l.b);
        StringBuilder sb = new StringBuilder("ColorParser[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m50877() {
        return this.f74766;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50878() {
        return this.f74765;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m50880() {
        return this.f74767;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m50881() {
        return this.f74764;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23006 m50871(String str) {
        C6222 c6222Matcher = f74760.matcher((CharSequence) str);
        if (!c6222Matcher.matches()) {
            throw new RuntimeException(C0252.m1693("Parse failed: ", str));
        }
        String strGroup = c6222Matcher.group(1);
        C13638.requireNonNull(strGroup);
        int i = -2;
        byte b = -1;
        int i2 = strGroup.equals("_") ? -1 : strGroup.equalsIgnoreCase("auto") ? -2 : Integer.parseInt(strGroup);
        int i3 = 2;
        String strGroup2 = c6222Matcher.group(2);
        C13638.requireNonNull(strGroup2);
        if (strGroup2.equals("_")) {
            i = -1;
        } else if (!strGroup2.equalsIgnoreCase("auto")) {
            i = Integer.parseInt(strGroup2);
        }
        if (i2 < 0 && i < 0) {
            throw new RuntimeException(C0252.m1693("Illegal arguments: ", str));
        }
        String strGroup3 = c6222Matcher.group(3);
        C13638.requireNonNull(strGroup3);
        String upperCase = strGroup3.toUpperCase();
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case 71419:
                if (upperCase.equals("HEX")) {
                    b = 0;
                }
                break;
            case 71841:
                if (upperCase.equals("HSL")) {
                    b = 1;
                }
                break;
            case 71851:
                if (upperCase.equals("HSV")) {
                    b = 2;
                }
                break;
            case 81069:
                if (upperCase.equals("RGB")) {
                    b = 3;
                }
                break;
            case 2017484:
                if (upperCase.equals("ARGB")) {
                    b = 4;
                }
                break;
            case 2214054:
                if (upperCase.equals("HEXA")) {
                    b = 5;
                }
                break;
            case 2227136:
                if (upperCase.equals("HSLA")) {
                    b = 6;
                }
                break;
            case 2227446:
                if (upperCase.equals("HSVA")) {
                    b = 7;
                }
                break;
            case 2513204:
                if (upperCase.equals("RGBA")) {
                    b = 8;
                }
                break;
            case 2513209:
                if (upperCase.equals("RGBF")) {
                    b = 9;
                }
                break;
            case 2513227:
                if (upperCase.equals("RGBX")) {
                    b = 10;
                }
                break;
            case 2702677:
                if (upperCase.equals("XRGB")) {
                    b = 11;
                }
                break;
            case 62542074:
                if (upperCase.equals("ARGBF")) {
                    b = 12;
                }
                break;
            case 77909394:
                if (upperCase.equals("RGBAF")) {
                    b = cb.k;
                }
                break;
        }
        switch (b) {
            case 0:
                i3 = 0;
                break;
            case 1:
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 1;
                break;
            case 4:
                i3 = 10;
                break;
            case 5:
                i3 = 8;
                break;
            case 6:
                i3 = 5;
                break;
            case 7:
                i3 = 6;
                break;
            case 8:
                i3 = 4;
                break;
            case 9:
                i3 = 11;
                break;
            case 10:
                i3 = 9;
                break;
            case 11:
                i3 = 7;
                break;
            case 12:
                i3 = 12;
                break;
            case 13:
                i3 = 13;
                break;
            default:
                throw new RuntimeException(C0252.m1693("Illegal arguments: ", str));
        }
        return new C23006(i2, i, i3, C16387.m38583(c6222Matcher.group(4)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m50879(C15682 c15682, C15682 c15683, C6222 c6222, C21408 c21408) {
        try {
            return m50876(c15682, c15683, c6222, c21408);
        } catch (C6777 e) {
            throw e.f22879;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:10:0x0024, B:13:0x002c, B:20:0x003e, B:35:0x005f, B:37:0x0066, B:40:0x007c, B:44:0x0088, B:55:0x00a6, B:58:0x00ae, B:61:0x00c1, B:63:0x00d6, B:23:0x0047), top: B:66:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:10:0x0024, B:13:0x002c, B:20:0x003e, B:35:0x005f, B:37:0x0066, B:40:0x007c, B:44:0x0088, B:55:0x00a6, B:58:0x00ae, B:61:0x00c1, B:63:0x00d6, B:23:0x0047), top: B:66:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:10:0x0024, B:13:0x002c, B:20:0x003e, B:35:0x005f, B:37:0x0066, B:40:0x007c, B:44:0x0088, B:55:0x00a6, B:58:0x00ae, B:61:0x00c1, B:63:0x00d6, B:23:0x0047), top: B:66:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6 A[Catch: Exception -> 0x00e6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:10:0x0024, B:13:0x002c, B:20:0x003e, B:35:0x005f, B:37:0x0066, B:40:0x007c, B:44:0x0088, B:55:0x00a6, B:58:0x00ae, B:61:0x00c1, B:63:0x00d6, B:23:0x0047), top: B:66:0x0008 }] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C15682 m50876(C15682 c15682, C15682 c15683, C6222 c6222, C21408 c21408) {
        int iM9163;
        int iM9164;
        boolean z;
        int iM50867;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        String strConcat;
        int i6;
        C15682 c15682M31893;
        try {
            int i7 = this.f74766;
            int i8 = this.f74765;
            if (i7 > c6222.groupCount() || i8 > c6222.groupCount()) {
                return c15682;
            }
            boolean z2 = true;
            int i9 = this.f74764;
            int i10 = 0;
            if (i7 < 0) {
                iM9163 = 0;
                iM9164 = 0;
                z = false;
            } else {
                String strGroup = c6222.group(i7);
                if (strGroup == null) {
                    i7 = -1;
                    iM9163 = 0;
                    iM9164 = 0;
                    z = false;
                } else {
                    iM9163 = m50867(strGroup, i9, c21408);
                    if (iM9163 != 1447446) {
                        iM9164 = iM9163;
                        z = true;
                    } else {
                        i7 = -1;
                        iM9164 = iM9163;
                        z = false;
                    }
                }
            }
            if (i8 >= 0) {
                String strGroup2 = c6222.group(i8);
                if (strGroup2 != null) {
                    iM50867 = m50867(strGroup2, i9, c21408);
                    i = iM50867;
                    if (iM50867 != 1447446) {
                    }
                    if (i7 >= 0 && i8 < 0) {
                        return c15682;
                    }
                    if (i7 == -2) {
                        if (c15683 == null) {
                            c15682M31893 = C12859.m31893();
                        } else {
                            c15682M31893 = c15683;
                        }
                        iM9163 = C3057.m9163(iM50867, c15682M31893.m37368());
                        iM9164 = C3057.m9163(i, c15682M31893.m37374());
                        i7 = 0;
                    }
                    i2 = iM9163;
                    i3 = iM9164;
                    if (i8 == -2) {
                        if (C3057.m9159(i2) > 130) {
                            i6 = -16777216;
                        } else {
                            i6 = -1;
                        }
                        i4 = i6;
                        i5 = C3057.m9159(i3) > 130 ? -16777216 : -1;
                    } else {
                        i4 = iM50867;
                        i5 = i;
                        i10 = i8;
                    }
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    strConcat = str.concat(z2 ? "1" : "0");
                    if (i7 < 0 && i10 >= 0) {
                        return c15682.m37372(C15682.m37365(strConcat, i2, i4, i3, i5, 64));
                    }
                    if (i7 >= 0) {
                        return c15682.m37372(C15682.m37365(strConcat, i2, 1447446, i3, 1447446, 64));
                    }
                    return c15682.m37372(C15682.m37365(strConcat, 1447446, i4, 1447446, i5, 64));
                }
                iM50867 = 0;
                i = 0;
                i8 = -1;
            } else {
                iM50867 = 0;
                i = 0;
            }
            z2 = false;
            if (i7 >= 0) {
            }
            if (i7 == -2) {
                if (c15683 == null) {
                    c15682M31893 = C12859.m31893();
                } else {
                    c15682M31893 = c15683;
                }
                iM9163 = C3057.m9163(iM50867, c15682M31893.m37368());
                iM9164 = C3057.m9163(i, c15682M31893.m37374());
                i7 = 0;
            }
            i2 = iM9163;
            i3 = iM9164;
            if (i8 == -2) {
                if (C3057.m9159(i2) > 130) {
                    i6 = -16777216;
                } else {
                    i6 = -1;
                }
                i4 = i6;
                i5 = C3057.m9159(i3) > 130 ? -16777216 : -1;
            } else {
                i4 = iM50867;
                i5 = i;
                i10 = i8;
            }
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            strConcat = str.concat(z2 ? "1" : "0");
            if (i7 < 0) {
            }
            if (i7 >= 0) {
                return c15682.m37372(C15682.m37365(strConcat, i2, 1447446, i3, 1447446, 64));
            }
            return c15682.m37372(C15682.m37365(strConcat, 1447446, i4, 1447446, i5, 64));
        } catch (Exception unused) {
            return c15682;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50868(int i, int i2, String str) {
        int iEnd;
        boolean z = true;
        int i3 = 0;
        switch (i) {
            case 0:
                String str2 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%08X", Integer.valueOf(i2));
                C6222 c6222 = f74758;
                synchronized (c6222) {
                    c6222.m17276reset((CharSequence) str);
                    if (!c6222.find()) {
                        return null;
                    }
                    return str.substring(0, c6222.start()) + str2 + str.substring(c6222.end());
                }
            case 1:
                C6222 c6223 = f74759;
                synchronized (c6223) {
                    StringBuilder sb = new StringBuilder();
                    c6223.m17276reset((CharSequence) str);
                    if (c6223.find()) {
                        sb.append((CharSequence) str, 0, c6223.start());
                        sb.append(Color.red(i2));
                        int iEnd2 = c6223.end();
                        if (c6223.find()) {
                            sb.append((CharSequence) str, iEnd2, c6223.start());
                            sb.append(Color.green(i2));
                            int iEnd3 = c6223.end();
                            if (c6223.find()) {
                                sb.append((CharSequence) str, iEnd3, c6223.start());
                                sb.append(Color.blue(i2));
                                sb.append((CharSequence) str, c6223.end(), str.length());
                                return sb.toString();
                            }
                        }
                    }
                    return null;
                }
            case 2:
                float[] fArr = new float[3];
                C3224.m9667(i2, fArr);
                C6222 c6224 = f74763;
                synchronized (c6224) {
                    StringBuilder sb2 = new StringBuilder();
                    c6224.m17276reset((CharSequence) str);
                    if (c6224.find()) {
                        sb2.append((CharSequence) str, 0, c6224.start());
                        sb2.append(m50869(c6224.group(), fArr[0]));
                        int iEnd4 = c6224.end();
                        if (c6224.find()) {
                            sb2.append((CharSequence) str, iEnd4, c6224.start());
                            sb2.append(m50869(c6224.group(), fArr[1]));
                            int iEnd5 = c6224.end();
                            if (c6224.find()) {
                                sb2.append((CharSequence) str, iEnd5, c6224.start());
                                sb2.append(m50869(c6224.group(), fArr[2]));
                                sb2.append((CharSequence) str, c6224.end(), str.length());
                                return sb2.toString();
                            }
                        }
                    }
                    return null;
                }
            case 3:
                float[] fArr2 = new float[3];
                C3057.m9161(i2, fArr2);
                C6222 c6225 = f74763;
                synchronized (c6225) {
                    StringBuilder sb3 = new StringBuilder();
                    c6225.m17276reset((CharSequence) str);
                    if (c6225.find()) {
                        sb3.append((CharSequence) str, 0, c6225.start());
                        sb3.append(m50869(c6225.group(), fArr2[0]));
                        int iEnd6 = c6225.end();
                        if (c6225.find()) {
                            sb3.append((CharSequence) str, iEnd6, c6225.start());
                            sb3.append(m50869(c6225.group(), fArr2[1]));
                            int iEnd7 = c6225.end();
                            if (c6225.find()) {
                                sb3.append((CharSequence) str, iEnd7, c6225.start());
                                sb3.append(m50869(c6225.group(), fArr2[2]));
                                sb3.append((CharSequence) str, c6225.end(), str.length());
                                return sb3.toString();
                            }
                        }
                    }
                    return null;
                }
            case 4:
                StringBuilder sb4 = new StringBuilder();
                C6222 c6226 = f74759;
                synchronized (c6226) {
                    c6226.m17276reset((CharSequence) str);
                    if (c6226.find()) {
                        sb4.append((CharSequence) str, 0, c6226.start());
                        sb4.append(Color.red(i2));
                        int iEnd8 = c6226.end();
                        if (c6226.find()) {
                            sb4.append((CharSequence) str, iEnd8, c6226.start());
                            sb4.append(Color.green(i2));
                            iEnd8 = c6226.end();
                            if (c6226.find()) {
                                sb4.append((CharSequence) str, iEnd8, c6226.start());
                                sb4.append(Color.blue(i2));
                                iEnd = c6226.end();
                            }
                        }
                        i3 = iEnd8;
                        z = false;
                        iEnd = i3;
                    } else {
                        z = false;
                        iEnd = i3;
                    }
                    break;
                }
                if (z) {
                    C6222 c6227 = f74763;
                    synchronized (c6227) {
                        c6227.m17276reset((CharSequence) str);
                        if (!c6227.find(iEnd)) {
                            return null;
                        }
                        sb4.append((CharSequence) str, iEnd, c6227.start());
                        sb4.append(m50873(Color.alpha(i2), c6227.group()));
                        sb4.append((CharSequence) str, c6227.end(), str.length());
                        return sb4.toString();
                    }
                }
                return null;
            case 5:
                float[] fArr3 = new float[3];
                C3224.m9667(i2, fArr3);
                C6222 c6228 = f74763;
                synchronized (c6228) {
                    StringBuilder sb5 = new StringBuilder();
                    c6228.m17276reset((CharSequence) str);
                    if (c6228.find()) {
                        sb5.append((CharSequence) str, 0, c6228.start());
                        sb5.append(m50869(c6228.group(), fArr3[0]));
                        int iEnd9 = c6228.end();
                        if (c6228.find()) {
                            sb5.append((CharSequence) str, iEnd9, c6228.start());
                            sb5.append(m50869(c6228.group(), fArr3[1]));
                            int iEnd10 = c6228.end();
                            if (c6228.find()) {
                                sb5.append((CharSequence) str, iEnd10, c6228.start());
                                sb5.append(m50869(c6228.group(), fArr3[2]));
                                int iEnd11 = c6228.end();
                                if (c6228.find()) {
                                    sb5.append((CharSequence) str, iEnd11, c6228.start());
                                    sb5.append(m50873(Color.alpha(i2), c6228.group()));
                                    sb5.append((CharSequence) str, c6228.end(), str.length());
                                    return sb5.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 6:
                float[] fArr4 = new float[3];
                C3057.m9161(i2, fArr4);
                C6222 c6229 = f74763;
                synchronized (c6229) {
                    StringBuilder sb6 = new StringBuilder();
                    c6229.m17276reset((CharSequence) str);
                    if (c6229.find()) {
                        sb6.append((CharSequence) str, 0, c6229.start());
                        sb6.append(m50869(c6229.group(), fArr4[0]));
                        int iEnd12 = c6229.end();
                        if (c6229.find()) {
                            sb6.append((CharSequence) str, iEnd12, c6229.start());
                            sb6.append(m50869(c6229.group(), fArr4[1]));
                            int iEnd13 = c6229.end();
                            if (c6229.find()) {
                                sb6.append((CharSequence) str, iEnd13, c6229.start());
                                sb6.append(m50869(c6229.group(), fArr4[2]));
                                int iEnd14 = c6229.end();
                                if (c6229.find()) {
                                    sb6.append((CharSequence) str, iEnd14, c6229.start());
                                    sb6.append(m50873(Color.alpha(i2), c6229.group()));
                                    sb6.append((CharSequence) str, c6229.end(), str.length());
                                    return sb6.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 7:
                C6222 c62210 = f74759;
                synchronized (c62210) {
                    StringBuilder sb7 = new StringBuilder();
                    c62210.m17276reset((CharSequence) str);
                    if (c62210.find()) {
                        sb7.append((CharSequence) str, 0, c62210.start());
                        sb7.append(Color.alpha(i2));
                        int iEnd15 = c62210.end();
                        if (c62210.find()) {
                            sb7.append((CharSequence) str, iEnd15, c62210.start());
                            sb7.append(Color.red(i2));
                            int iEnd16 = c62210.end();
                            if (c62210.find()) {
                                sb7.append((CharSequence) str, iEnd16, c62210.start());
                                sb7.append(Color.green(i2));
                                int iEnd17 = c62210.end();
                                if (c62210.find()) {
                                    sb7.append((CharSequence) str, iEnd17, c62210.start());
                                    sb7.append(Color.blue(i2));
                                    sb7.append((CharSequence) str, c62210.end(), str.length());
                                    return sb7.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 8:
                String str3 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%06X%02X", Integer.valueOf(i2 & 16777215), Integer.valueOf(i2 >>> 24));
                C6222 c62211 = f74758;
                synchronized (c62211) {
                    c62211.m17276reset((CharSequence) str);
                    if (!c62211.find()) {
                        return null;
                    }
                    return str.substring(0, c62211.start()) + str3 + str.substring(c62211.end());
                }
            case 9:
                C6222 c62212 = f74759;
                synchronized (c62212) {
                    StringBuilder sb8 = new StringBuilder();
                    c62212.m17276reset((CharSequence) str);
                    if (c62212.find()) {
                        sb8.append((CharSequence) str, 0, c62212.start());
                        sb8.append(Color.red(i2));
                        int iEnd18 = c62212.end();
                        if (c62212.find()) {
                            sb8.append((CharSequence) str, iEnd18, c62212.start());
                            sb8.append(Color.green(i2));
                            int iEnd19 = c62212.end();
                            if (c62212.find()) {
                                sb8.append((CharSequence) str, iEnd19, c62212.start());
                                sb8.append(Color.blue(i2));
                                int iEnd20 = c62212.end();
                                if (c62212.find()) {
                                    sb8.append((CharSequence) str, iEnd20, c62212.start());
                                    sb8.append(Color.alpha(i2));
                                    sb8.append((CharSequence) str, c62212.end(), str.length());
                                    return sb8.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 10:
                StringBuilder sb9 = new StringBuilder();
                C6222 c62213 = f74763;
                synchronized (c62213) {
                    c62213.m17276reset((CharSequence) str);
                    if (!c62213.find()) {
                        return null;
                    }
                    sb9.append((CharSequence) str, 0, c62213.start());
                    sb9.append(m50873(Color.alpha(i2), c62213.group()));
                    int iEnd21 = c62213.end();
                    C6222 c62214 = f74759;
                    synchronized (c62214) {
                        c62214.m17276reset((CharSequence) str);
                        if (c62214.find(iEnd21)) {
                            sb9.append((CharSequence) str, iEnd21, c62214.start());
                            sb9.append(Color.red(i2));
                            int iEnd22 = c62214.end();
                            if (c62214.find()) {
                                sb9.append((CharSequence) str, iEnd22, c62214.start());
                                sb9.append(Color.green(i2));
                                int iEnd23 = c62214.end();
                                if (c62214.find()) {
                                    sb9.append((CharSequence) str, iEnd23, c62214.start());
                                    sb9.append(Color.blue(i2));
                                    sb9.append((CharSequence) str, c62214.end(), str.length());
                                    return sb9.toString();
                                }
                            }
                        }
                        return null;
                    }
                }
            case 11:
                return m50870(str, Color.red(i2), Color.green(i2), Color.blue(i2));
            case 12:
                return m50870(str, Color.alpha(i2), Color.red(i2), Color.green(i2), Color.blue(i2));
            case 13:
                return m50870(str, Color.red(i2), Color.green(i2), Color.blue(i2), Color.alpha(i2));
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50870(String str, int... iArr) {
        C6222 c6222 = f74763;
        synchronized (c6222) {
            StringBuilder sb = new StringBuilder();
            c6222.m17276reset((CharSequence) str);
            int iEnd = 0;
            for (int i : iArr) {
                if (!c6222.find()) {
                    return null;
                }
                sb.append((CharSequence) str, iEnd, c6222.start());
                sb.append(m50873(i, c6222.group()));
                iEnd = c6222.end();
            }
            sb.append((CharSequence) str, iEnd, str.length());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m50873(int i, String str) {
        boolean zEndsWith = str.endsWith("%");
        long j = i;
        if (zEndsWith) {
            j *= 100;
        }
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(j).divide(f74761, zEndsWith ? 2 : 3, RoundingMode.CEILING);
        String plainString = (bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros()).toPlainString();
        return zEndsWith ? C15489.m37076(plainString, "%") : plainString;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m50875(int i, String str) {
        return m50867(str, i, (C21408) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50867(String str, int i, C21408 c21408) {
        String strGroup;
        String strGroup2;
        String strGroup3;
        String strGroup4;
        String strGroup5;
        String strGroup6;
        String strGroup7;
        String strGroup8;
        String strGroup9;
        int iEnd;
        String strGroup10;
        String strGroup11;
        String strGroup12;
        String strGroup13;
        String strGroup14;
        String strGroup15;
        String strGroup16;
        String strGroup17;
        String strGroup18;
        String strGroup19;
        String strGroup20;
        String strGroup21;
        String strGroup22;
        String str2;
        String strGroup23;
        String strGroup24;
        int iEnd2 = -1;
        String strGroup25 = null;
        switch (i) {
            case 0:
                C6222 c6222 = f74758;
                synchronized (c6222) {
                    c6222.m17276reset((CharSequence) str);
                    boolean zFind = c6222.find();
                    m50872(c6222, zFind, c21408);
                    strGroup25 = zFind ? c6222.group() : null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() == 5 || strGroup25.length() == 7) {
                    return 1447446;
                }
                return C6461.m17646(strGroup25);
            case 1:
                C6222 c6223 = f74759;
                synchronized (c6223) {
                    c6223.m17276reset((CharSequence) str);
                    boolean zFind2 = c6223.find();
                    m50872(c6223, zFind2, c21408);
                    if (zFind2) {
                        strGroup = c6223.group();
                        boolean zFind3 = c6223.find();
                        m50872(c6223, zFind3, c21408);
                        if (zFind3) {
                            strGroup2 = c6223.group();
                            boolean zFind4 = c6223.find();
                            m50872(c6223, zFind4, c21408);
                            if (zFind4) {
                                strGroup25 = c6223.group();
                            }
                        } else {
                            strGroup2 = null;
                        }
                    } else {
                        strGroup = null;
                        strGroup2 = null;
                    }
                    break;
                }
                if (strGroup25 == null || strGroup.length() > 3 || strGroup2.length() > 3 || strGroup25.length() > 3) {
                    return 1447446;
                }
                int i2 = Integer.parseInt(strGroup);
                int i3 = Integer.parseInt(strGroup2);
                int i4 = Integer.parseInt(strGroup25);
                if (i2 < 0 || i2 > 255 || i3 < 0 || i3 > 255 || i4 < 0 || i4 > 255) {
                    return 1447446;
                }
                return Color.rgb(i2, i3, i4);
            case 2:
                C6222 c6224 = f74763;
                synchronized (c6224) {
                    c6224.m17276reset((CharSequence) str);
                    boolean zFind5 = c6224.find();
                    m50872(c6224, zFind5, c21408);
                    if (zFind5) {
                        strGroup3 = c6224.group();
                        boolean zFind6 = c6224.find();
                        m50872(c6224, zFind6, c21408);
                        if (zFind6) {
                            strGroup4 = c6224.group();
                            boolean zFind7 = c6224.find();
                            m50872(c6224, zFind7, c21408);
                            if (zFind7) {
                                strGroup25 = c6224.group();
                            }
                        } else {
                            strGroup4 = null;
                        }
                    } else {
                        strGroup3 = null;
                        strGroup4 = null;
                    }
                    break;
                }
                if (strGroup25 == null) {
                    return 1447446;
                }
                float fM50874 = m50874(strGroup3);
                float fM50875 = m50874(strGroup4);
                float fM50876 = m50874(strGroup25);
                if (fM50874 == 360.0f) {
                    fM50874 = 0.0f;
                }
                if (fM50874 < 0.0f || fM50874 > 360.0f || fM50875 < 0.0f || fM50875 > 1.0f || fM50876 < 0.0f || fM50876 > 1.0f) {
                    return 1447446;
                }
                return C3224.m9664(new float[]{fM50874, fM50875, fM50876});
            case 3:
                C6222 c6225 = f74763;
                synchronized (c6225) {
                    c6225.m17276reset((CharSequence) str);
                    boolean zFind8 = c6225.find();
                    m50872(c6225, zFind8, c21408);
                    if (zFind8) {
                        strGroup5 = c6225.group();
                        boolean zFind9 = c6225.find();
                        m50872(c6225, zFind9, c21408);
                        if (zFind9) {
                            strGroup6 = c6225.group();
                            boolean zFind10 = c6225.find();
                            m50872(c6225, zFind10, c21408);
                            if (zFind10) {
                                strGroup25 = c6225.group();
                            }
                        } else {
                            strGroup6 = null;
                        }
                    } else {
                        strGroup5 = null;
                        strGroup6 = null;
                    }
                    break;
                }
                if (strGroup25 == null) {
                    return 1447446;
                }
                float fM50877 = m50874(strGroup5);
                float fM50878 = m50874(strGroup6);
                float fM50879 = m50874(strGroup25);
                if (fM50877 == 360.0f) {
                    fM50877 = 0.0f;
                }
                if (fM50877 < 0.0f || fM50877 > 360.0f || fM50878 < 0.0f || fM50878 > 1.0f || fM50879 < 0.0f || fM50879 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(new float[]{fM50877, fM50878, fM50879});
            case 4:
                C6222 c6226 = f74759;
                synchronized (c6226) {
                    c6226.m17276reset((CharSequence) str);
                    boolean zFind11 = c6226.find();
                    m50872(c6226, zFind11, c21408);
                    if (zFind11) {
                        strGroup7 = c6226.group();
                        boolean zFind12 = c6226.find();
                        m50872(c6226, zFind12, c21408);
                        if (zFind12) {
                            strGroup8 = c6226.group();
                            boolean zFind13 = c6226.find();
                            m50872(c6226, zFind13, c21408);
                            if (zFind13) {
                                strGroup9 = c6226.group();
                                iEnd = c6226.end();
                            } else {
                                strGroup9 = null;
                            }
                        }
                        iEnd = -1;
                    } else {
                        strGroup7 = null;
                    }
                    strGroup8 = null;
                    strGroup9 = null;
                    iEnd = -1;
                    break;
                }
                if (strGroup9 != null) {
                    C6222 c6227 = f74763;
                    synchronized (c6227) {
                        c6227.m17276reset((CharSequence) str);
                        boolean zFind14 = c6227.find(iEnd);
                        m50872(c6227, zFind14, c21408);
                        strGroup25 = zFind14 ? c6227.group() : null;
                        break;
                    }
                }
                if (strGroup25 == null || strGroup7.length() > 3 || strGroup8.length() > 3 || strGroup9.length() > 3) {
                    return 1447446;
                }
                int i5 = Integer.parseInt(strGroup7);
                int i6 = Integer.parseInt(strGroup8);
                int i7 = Integer.parseInt(strGroup9);
                float fM508710 = m50874(strGroup25);
                if (i5 < 0 || i5 > 255 || i6 < 0 || i6 > 255 || i7 < 0 || i7 > 255 || fM508710 < 0.0f || fM508710 > 1.0f) {
                    return 1447446;
                }
                return Color.argb((int) (fM508710 * 255.0f), i5, i6, i7);
            case 5:
                C6222 c6228 = f74763;
                synchronized (c6228) {
                    c6228.m17276reset((CharSequence) str);
                    boolean zFind15 = c6228.find();
                    m50872(c6228, zFind15, c21408);
                    if (zFind15) {
                        strGroup10 = c6228.group();
                        boolean zFind16 = c6228.find();
                        m50872(c6228, zFind16, c21408);
                        if (zFind16) {
                            strGroup11 = c6228.group();
                            boolean zFind17 = c6228.find();
                            m50872(c6228, zFind17, c21408);
                            if (zFind17) {
                                strGroup12 = c6228.group();
                                boolean zFind18 = c6228.find();
                                m50872(c6228, zFind18, c21408);
                                if (zFind18) {
                                    strGroup25 = c6228.group();
                                }
                            } else {
                                strGroup12 = null;
                            }
                        }
                    } else {
                        strGroup10 = null;
                    }
                    strGroup11 = null;
                    strGroup12 = null;
                    break;
                }
                if (strGroup25 == null) {
                    return 1447446;
                }
                float fM508711 = m50874(strGroup10);
                float fM508712 = m50874(strGroup11);
                float fM508713 = m50874(strGroup12);
                float fM508714 = m50874(strGroup25);
                if (fM508711 == 360.0f) {
                    fM508711 = 0.0f;
                }
                if (fM508711 < 0.0f || fM508711 > 360.0f || fM508712 < 0.0f || fM508712 > 1.0f || fM508713 < 0.0f || fM508713 > 1.0f || fM508714 < 0.0f || fM508714 > 1.0f) {
                    return 1447446;
                }
                return (C3224.m9664(new float[]{fM508711, fM508712, fM508713}) & 16777215) | ((((int) (fM508714 * 255.0f)) & 255) << 24);
            case 6:
                C6222 c6229 = f74763;
                synchronized (c6229) {
                    c6229.m17276reset((CharSequence) str);
                    boolean zFind19 = c6229.find();
                    m50872(c6229, zFind19, c21408);
                    if (zFind19) {
                        strGroup13 = c6229.group();
                        boolean zFind20 = c6229.find();
                        m50872(c6229, zFind20, c21408);
                        if (zFind20) {
                            strGroup14 = c6229.group();
                            boolean zFind21 = c6229.find();
                            m50872(c6229, zFind21, c21408);
                            if (zFind21) {
                                strGroup15 = c6229.group();
                                boolean zFind22 = c6229.find();
                                m50872(c6229, zFind22, c21408);
                                if (zFind22) {
                                    strGroup25 = c6229.group();
                                }
                            } else {
                                strGroup15 = null;
                            }
                        }
                    } else {
                        strGroup13 = null;
                    }
                    strGroup14 = null;
                    strGroup15 = null;
                    break;
                }
                if (strGroup25 == null) {
                    return 1447446;
                }
                float fM508715 = m50874(strGroup13);
                float fM508716 = m50874(strGroup14);
                float fM508717 = m50874(strGroup15);
                float fM508718 = m50874(strGroup25);
                if (fM508715 == 360.0f) {
                    fM508715 = 0.0f;
                }
                if (fM508715 < 0.0f || fM508715 > 360.0f || fM508716 < 0.0f || fM508716 > 1.0f || fM508717 < 0.0f || fM508717 > 1.0f || fM508718 < 0.0f || fM508718 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(((int) (fM508718 * 255.0f)) & 255, new float[]{fM508715, fM508716, fM508717});
            case 7:
                C6222 c62210 = f74759;
                synchronized (c62210) {
                    c62210.m17276reset((CharSequence) str);
                    boolean zFind23 = c62210.find();
                    m50872(c62210, zFind23, c21408);
                    if (zFind23) {
                        strGroup16 = c62210.group();
                        boolean zFind24 = c62210.find();
                        m50872(c62210, zFind24, c21408);
                        if (zFind24) {
                            strGroup17 = c62210.group();
                            boolean zFind25 = c62210.find();
                            m50872(c62210, zFind25, c21408);
                            if (zFind25) {
                                strGroup18 = c62210.group();
                                boolean zFind26 = c62210.find();
                                m50872(c62210, zFind26, c21408);
                                if (zFind26) {
                                    strGroup25 = c62210.group();
                                }
                            } else {
                                strGroup18 = null;
                            }
                        }
                    } else {
                        strGroup16 = null;
                    }
                    strGroup17 = null;
                    strGroup18 = null;
                    break;
                }
                if (strGroup25 == null || strGroup16.length() > 3 || strGroup17.length() > 3 || strGroup18.length() > 3 || strGroup25.length() > 3) {
                    return 1447446;
                }
                int i8 = Integer.parseInt(strGroup16);
                int i9 = Integer.parseInt(strGroup17);
                int i10 = Integer.parseInt(strGroup18);
                int i11 = Integer.parseInt(strGroup25);
                if (i8 < 0 || i8 > 255 || i9 < 0 || i9 > 255 || i10 < 0 || i10 > 255 || i11 < 0 || i11 > 255) {
                    return 1447446;
                }
                return Color.argb(i8, i9, i10, i11);
            case 8:
                C6222 c62211 = f74758;
                synchronized (c62211) {
                    c62211.m17276reset((CharSequence) str);
                    boolean zFind27 = c62211.find();
                    m50872(c62211, zFind27, c21408);
                    strGroup25 = zFind27 ? c62211.group() : null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() == 5 || strGroup25.length() == 7) {
                    return 1447446;
                }
                char[] charArray = strGroup25.toCharArray();
                int length = strGroup25.length();
                if (length == 3) {
                    return C6461.m17647(charArray[2]) | (C6461.m17647(charArray[0]) << 20) | (-16777216) | (C6461.m17647(charArray[0]) << 16) | (C6461.m17647(charArray[1]) << 12) | (C6461.m17647(charArray[1]) << 8) | (C6461.m17647(charArray[2]) << 4);
                }
                if (length == 4) {
                    return C6461.m17647(charArray[2]) | (C6461.m17647(charArray[3]) << 28) | (C6461.m17647(charArray[3]) << 24) | (C6461.m17647(charArray[0]) << 20) | (C6461.m17647(charArray[0]) << 16) | (C6461.m17647(charArray[1]) << 12) | (C6461.m17647(charArray[1]) << 8) | (C6461.m17647(charArray[2]) << 4);
                }
                if (length == 6) {
                    return C6461.m17647(charArray[5]) | (C6461.m17647(charArray[0]) << 20) | (-16777216) | (C6461.m17647(charArray[1]) << 16) | (C6461.m17647(charArray[2]) << 12) | (C6461.m17647(charArray[3]) << 8) | (C6461.m17647(charArray[4]) << 4);
                }
                if (length == 8) {
                    return C6461.m17647(charArray[5]) | (C6461.m17647(charArray[6]) << 28) | (C6461.m17647(charArray[7]) << 24) | (C6461.m17647(charArray[0]) << 20) | (C6461.m17647(charArray[1]) << 16) | (C6461.m17647(charArray[2]) << 12) | (C6461.m17647(charArray[3]) << 8) | (C6461.m17647(charArray[4]) << 4);
                }
                throw new RuntimeException("Hex color format error: " + ((Object) charArray));
            case 9:
                C6222 c62212 = f74759;
                synchronized (c62212) {
                    c62212.m17276reset((CharSequence) str);
                    boolean zFind28 = c62212.find();
                    m50872(c62212, zFind28, c21408);
                    if (zFind28) {
                        strGroup19 = c62212.group();
                        boolean zFind29 = c62212.find();
                        m50872(c62212, zFind29, c21408);
                        if (zFind29) {
                            strGroup20 = c62212.group();
                            boolean zFind30 = c62212.find();
                            m50872(c62212, zFind30, c21408);
                            if (zFind30) {
                                strGroup21 = c62212.group();
                                boolean zFind31 = c62212.find();
                                m50872(c62212, zFind31, c21408);
                                if (zFind31) {
                                    strGroup25 = c62212.group();
                                }
                            } else {
                                strGroup21 = null;
                            }
                        }
                    } else {
                        strGroup19 = null;
                    }
                    strGroup20 = null;
                    strGroup21 = null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() > 3 || strGroup19.length() > 3 || strGroup20.length() > 3 || strGroup21.length() > 3) {
                    return 1447446;
                }
                int i12 = Integer.parseInt(strGroup25);
                int i13 = Integer.parseInt(strGroup19);
                int i14 = Integer.parseInt(strGroup20);
                int i15 = Integer.parseInt(strGroup21);
                if (i12 < 0 || i12 > 255 || i13 < 0 || i13 > 255 || i14 < 0 || i14 > 255 || i15 < 0 || i15 > 255) {
                    return 1447446;
                }
                return Color.argb(i12, i13, i14, i15);
            case 10:
                C6222 c62213 = f74763;
                synchronized (c62213) {
                    c62213.m17276reset((CharSequence) str);
                    boolean zFind32 = c62213.find();
                    m50872(c62213, zFind32, c21408);
                    if (zFind32) {
                        strGroup22 = c62213.group();
                        iEnd2 = c62213.end();
                    } else {
                        strGroup22 = null;
                    }
                    break;
                }
                if (strGroup22 != null) {
                    C6222 c62214 = f74759;
                    synchronized (c62214) {
                        c62214.m17276reset((CharSequence) str);
                        boolean zFind33 = c62214.find(iEnd2);
                        m50872(c62214, zFind33, c21408);
                        if (zFind33) {
                            String strGroup26 = c62214.group();
                            boolean zFind34 = c62214.find();
                            m50872(c62214, zFind34, c21408);
                            if (zFind34) {
                                strGroup23 = c62214.group();
                                boolean zFind35 = c62214.find();
                                m50872(c62214, zFind35, c21408);
                                strGroup25 = strGroup26;
                                strGroup24 = zFind35 ? c62214.group() : null;
                            } else {
                                strGroup23 = null;
                                strGroup25 = strGroup26;
                                strGroup24 = null;
                            }
                        } else {
                            strGroup24 = null;
                            strGroup23 = null;
                        }
                        break;
                    }
                    String str3 = strGroup25;
                    strGroup25 = strGroup24;
                    str2 = str3;
                } else {
                    str2 = null;
                    strGroup23 = null;
                }
                if (strGroup25 == null || str2.length() > 3 || strGroup23.length() > 3 || strGroup25.length() > 3) {
                    return 1447446;
                }
                float fM508719 = m50874(strGroup22);
                int i16 = Integer.parseInt(str2);
                int i17 = Integer.parseInt(strGroup23);
                int i18 = Integer.parseInt(strGroup25);
                if (fM508719 < 0.0f || fM508719 > 1.0f || i16 < 0 || i16 > 255 || i17 < 0 || i17 > 255 || i18 < 0 || i18 > 255) {
                    return 1447446;
                }
                return Color.argb((int) (fM508719 * 255.0f), i16, i17, i18);
            case 11:
            case 12:
            case 13:
                return m50866(str, i, (InterfaceC3954) c21408);
            default:
                return 1447446;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50866(String str, int i, InterfaceC3954 interfaceC3954) {
        int i2;
        float f;
        int i3;
        int i4 = i == 11 ? 3 : 4;
        float[] fArr = new float[i4];
        C6222 c6222 = f74763;
        synchronized (c6222) {
            c6222.m17276reset((CharSequence) str);
            while (i2 < i4) {
                boolean zFind = c6222.find();
                m50872(c6222, zFind, interfaceC3954);
                if (!zFind) {
                    return 1447446;
                }
                float fM50874 = m50874(c6222.group());
                fArr[i2] = fM50874;
                i2 = (fM50874 >= 0.0f && fM50874 <= 1.0f) ? i2 + 1 : 0;
                return 1447446;
            }
            int i5 = i == 12 ? 1 : 0;
            if (i == 12) {
                f = fArr[0];
            } else {
                if (i != 13) {
                    i3 = 255;
                } else {
                    f = fArr[3];
                }
                return Color.argb(i3, (int) (fArr[i5] * 255.0f), (int) (fArr[i5 + 1] * 255.0f), (int) (fArr[i5 + 2] * 255.0f));
            }
            i3 = (int) (f * 255.0f);
            return Color.argb(i3, (int) (fArr[i5] * 255.0f), (int) (fArr[i5 + 1] * 255.0f), (int) (fArr[i5 + 2] * 255.0f));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50872(C6222 c6222, boolean z, InterfaceC3954 interfaceC3954) {
        if (interfaceC3954 != null) {
            try {
                C12237.m30380(((C21408) interfaceC3954).f69595, c6222);
            } catch (RuntimeException e) {
                throw new C6777(e);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static float m50874(String str) {
        boolean z = false;
        if (str.endsWith("%")) {
            str = C20630.m46498(1, 0, str);
            z = true;
        }
        float f = Float.parseFloat(str);
        return z ? f / 100.0f : f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50869(String str, float f) {
        boolean zEndsWith = str.endsWith("%");
        if (zEndsWith) {
            f *= 100.0f;
        }
        BigDecimal scale = new BigDecimal(Float.toString(f)).setScale(zEndsWith ? 2 : 3, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        return zEndsWith ? C15489.m37076(plainString, "%") : plainString;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m50865() {
        return Integer.toString(f74762.getAndIncrement(), 36);
    }
}
