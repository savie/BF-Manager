package l;

import android.graphics.Color;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.cb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۙۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 096Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C4868 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16975;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f16976;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f16977;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f16978;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f16970 = new AtomicInteger((int) (System.currentTimeMillis() / 1000));

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C18415 f16974 = C18415.m42924(2, "parseColor\\((\\d+|_|AUTO),(\\d+|_|AUTO),([A-Z]+)(?:,(.+))?\\)");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C4245 f16972 = C18415.m42924(2, "(?<![a-f0-9])[a-f0-9]{3,8}(?![a-z0-9])").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C4245 f16969 = C18415.m42925("-?\\d+").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C4245 f16973 = C18415.m42925("-?\\d+(\\.\\d+)?%?").matcher((CharSequence) "");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final BigDecimal f16971 = BigDecimal.valueOf(255L);

    public C4868(int i, int i2, int i3, int i4) {
        this.f16976 = i;
        this.f16975 = i2;
        this.f16978 = i3;
        this.f16977 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4868)) {
            return false;
        }
        C4868 c4868 = (C4868) obj;
        return this.f16976 == c4868.f16976 && this.f16975 == c4868.f16975 && this.f16978 == c4868.f16978 && this.f16977 == c4868.f16977;
    }

    public final int hashCode() {
        return (((((this.f16976 * 31) + this.f16975) * 31) + this.f16978) * 31) + this.f16977;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f16976), Integer.valueOf(this.f16975), Integer.valueOf(this.f16978), Integer.valueOf(this.f16977)};
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14920() {
        return this.f16975;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m14922() {
        return this.f16976;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m14923() {
        return this.f16978;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m14924() {
        return this.f16977;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4868 m14913(String str) {
        C4245 c4245Matcher = f16974.matcher((CharSequence) str);
        if (!c4245Matcher.matches()) {
            throw new RuntimeException(C25272.m56409("Parse failed: ", str));
        }
        String strGroup = c4245Matcher.group(1);
        C17359.requireNonNull(strGroup);
        int i = -2;
        byte b = -1;
        int i2 = strGroup.equals("_") ? -1 : strGroup.equalsIgnoreCase("auto") ? -2 : Integer.parseInt(strGroup);
        int i3 = 2;
        String strGroup2 = c4245Matcher.group(2);
        C17359.requireNonNull(strGroup2);
        if (strGroup2.equals("_")) {
            i = -1;
        } else if (!strGroup2.equalsIgnoreCase("auto")) {
            i = Integer.parseInt(strGroup2);
        }
        if (i2 < 0 && i < 0) {
            throw new RuntimeException(C25272.m56409("Illegal arguments: ", str));
        }
        String strGroup3 = c4245Matcher.group(3);
        C17359.requireNonNull(strGroup3);
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
                throw new RuntimeException(C25272.m56409("Illegal arguments: ", str));
        }
        return new C4868(i2, i, i3, C17941.m41877(c4245Matcher.group(4)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m14921(C11974 c11974, C11974 c11975, C4245 c4245, C5021 c5021) {
        try {
            return m14919(c11974, c11975, c4245, c5021);
        } catch (C13533 e) {
            throw e.f43002;
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C11974 m14919(C11974 c11974, C11974 c11975, C4245 c4245, C5021 c5021) {
        int iM22615;
        int iM22616;
        boolean z;
        int iM14908;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        String strConcat;
        int i6;
        C11974 c11974M24618;
        try {
            int i7 = this.f16976;
            int i8 = this.f16975;
            if (i7 > c4245.groupCount() || i8 > c4245.groupCount()) {
                return c11974;
            }
            boolean z2 = true;
            int i9 = this.f16978;
            int i10 = 0;
            if (i7 < 0) {
                iM22615 = 0;
                iM22616 = 0;
                z = false;
            } else {
                String strGroup = c4245.group(i7);
                if (strGroup == null) {
                    i7 = -1;
                    iM22615 = 0;
                    iM22616 = 0;
                    z = false;
                } else {
                    iM22615 = m14908(strGroup, i9, c5021);
                    if (iM22615 != 1447446) {
                        iM22616 = iM22615;
                        z = true;
                    } else {
                        i7 = -1;
                        iM22616 = iM22615;
                        z = false;
                    }
                }
            }
            if (i8 >= 0) {
                String strGroup2 = c4245.group(i8);
                if (strGroup2 != null) {
                    iM14908 = m14908(strGroup2, i9, c5021);
                    i = iM14908;
                    if (iM14908 != 1447446) {
                    }
                    if (i7 >= 0 && i8 < 0) {
                        return c11974;
                    }
                    if (i7 == -2) {
                        if (c11975 == null) {
                            c11974M24618 = C9341.m24618();
                        } else {
                            c11974M24618 = c11975;
                        }
                        iM22615 = C8420.m22615(iM14908, c11974M24618.m30041());
                        iM22616 = C8420.m22615(i, c11974M24618.m30034());
                        i7 = 0;
                    }
                    i2 = iM22615;
                    i3 = iM22616;
                    if (i8 == -2) {
                        if (C8420.m22611(i2) > 130) {
                            i6 = -16777216;
                        } else {
                            i6 = -1;
                        }
                        i4 = i6;
                        i5 = C8420.m22611(i3) > 130 ? -16777216 : -1;
                    } else {
                        i4 = iM14908;
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
                        return c11974.m30038(C11974.m30032(strConcat, i2, i4, i3, i5, 64));
                    }
                    if (i7 >= 0) {
                        return c11974.m30038(C11974.m30032(strConcat, i2, 1447446, i3, 1447446, 64));
                    }
                    return c11974.m30038(C11974.m30032(strConcat, 1447446, i4, 1447446, i5, 64));
                }
                iM14908 = 0;
                i = 0;
                i8 = -1;
            } else {
                iM14908 = 0;
                i = 0;
            }
            z2 = false;
            if (i7 >= 0) {
            }
            if (i7 == -2) {
                if (c11975 == null) {
                    c11974M24618 = C9341.m24618();
                } else {
                    c11974M24618 = c11975;
                }
                iM22615 = C8420.m22615(iM14908, c11974M24618.m30041());
                iM22616 = C8420.m22615(i, c11974M24618.m30034());
                i7 = 0;
            }
            i2 = iM22615;
            i3 = iM22616;
            if (i8 == -2) {
                if (C8420.m22611(i2) > 130) {
                    i6 = -16777216;
                } else {
                    i6 = -1;
                }
                i4 = i6;
                i5 = C8420.m22611(i3) > 130 ? -16777216 : -1;
            } else {
                i4 = iM14908;
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
                return c11974.m30038(C11974.m30032(strConcat, i2, 1447446, i3, 1447446, 64));
            }
            return c11974.m30038(C11974.m30032(strConcat, 1447446, i4, 1447446, i5, 64));
        } catch (Exception unused) {
            return c11974;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14910(int i, int i2, String str) {
        int iEnd;
        boolean z = true;
        int i3 = 0;
        switch (i) {
            case 0:
                String str2 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%08X", Integer.valueOf(i2));
                C4245 c4245 = f16972;
                synchronized (c4245) {
                    c4245.m13568reset((CharSequence) str);
                    if (!c4245.find()) {
                        return null;
                    }
                    return str.substring(0, c4245.start()) + str2 + str.substring(c4245.end());
                }
            case 1:
                C4245 c4246 = f16969;
                synchronized (c4246) {
                    StringBuilder sb = new StringBuilder();
                    c4246.m13568reset((CharSequence) str);
                    if (c4246.find()) {
                        sb.append((CharSequence) str, 0, c4246.start());
                        sb.append(Color.red(i2));
                        int iEnd2 = c4246.end();
                        if (c4246.find()) {
                            sb.append((CharSequence) str, iEnd2, c4246.start());
                            sb.append(Color.green(i2));
                            int iEnd3 = c4246.end();
                            if (c4246.find()) {
                                sb.append((CharSequence) str, iEnd3, c4246.start());
                                sb.append(Color.blue(i2));
                                sb.append((CharSequence) str, c4246.end(), str.length());
                                return sb.toString();
                            }
                        }
                    }
                    return null;
                }
            case 2:
                float[] fArr = new float[3];
                C19988.m45963(i2, fArr);
                C4245 c4247 = f16973;
                synchronized (c4247) {
                    StringBuilder sb2 = new StringBuilder();
                    c4247.m13568reset((CharSequence) str);
                    if (c4247.find()) {
                        sb2.append((CharSequence) str, 0, c4247.start());
                        sb2.append(m14911(c4247.group(), fArr[0]));
                        int iEnd4 = c4247.end();
                        if (c4247.find()) {
                            sb2.append((CharSequence) str, iEnd4, c4247.start());
                            sb2.append(m14911(c4247.group(), fArr[1]));
                            int iEnd5 = c4247.end();
                            if (c4247.find()) {
                                sb2.append((CharSequence) str, iEnd5, c4247.start());
                                sb2.append(m14911(c4247.group(), fArr[2]));
                                sb2.append((CharSequence) str, c4247.end(), str.length());
                                return sb2.toString();
                            }
                        }
                    }
                    return null;
                }
            case 3:
                float[] fArr2 = new float[3];
                C8420.m22613(i2, fArr2);
                C4245 c4248 = f16973;
                synchronized (c4248) {
                    StringBuilder sb3 = new StringBuilder();
                    c4248.m13568reset((CharSequence) str);
                    if (c4248.find()) {
                        sb3.append((CharSequence) str, 0, c4248.start());
                        sb3.append(m14911(c4248.group(), fArr2[0]));
                        int iEnd6 = c4248.end();
                        if (c4248.find()) {
                            sb3.append((CharSequence) str, iEnd6, c4248.start());
                            sb3.append(m14911(c4248.group(), fArr2[1]));
                            int iEnd7 = c4248.end();
                            if (c4248.find()) {
                                sb3.append((CharSequence) str, iEnd7, c4248.start());
                                sb3.append(m14911(c4248.group(), fArr2[2]));
                                sb3.append((CharSequence) str, c4248.end(), str.length());
                                return sb3.toString();
                            }
                        }
                    }
                    return null;
                }
            case 4:
                StringBuilder sb4 = new StringBuilder();
                C4245 c4249 = f16969;
                synchronized (c4249) {
                    c4249.m13568reset((CharSequence) str);
                    if (c4249.find()) {
                        sb4.append((CharSequence) str, 0, c4249.start());
                        sb4.append(Color.red(i2));
                        int iEnd8 = c4249.end();
                        if (c4249.find()) {
                            sb4.append((CharSequence) str, iEnd8, c4249.start());
                            sb4.append(Color.green(i2));
                            iEnd8 = c4249.end();
                            if (c4249.find()) {
                                sb4.append((CharSequence) str, iEnd8, c4249.start());
                                sb4.append(Color.blue(i2));
                                iEnd = c4249.end();
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
                    C4245 c42410 = f16973;
                    synchronized (c42410) {
                        c42410.m13568reset((CharSequence) str);
                        if (!c42410.find(iEnd)) {
                            return null;
                        }
                        sb4.append((CharSequence) str, iEnd, c42410.start());
                        sb4.append(m14915(Color.alpha(i2), c42410.group()));
                        sb4.append((CharSequence) str, c42410.end(), str.length());
                        return sb4.toString();
                    }
                }
                return null;
            case 5:
                float[] fArr3 = new float[3];
                C19988.m45963(i2, fArr3);
                C4245 c42411 = f16973;
                synchronized (c42411) {
                    StringBuilder sb5 = new StringBuilder();
                    c42411.m13568reset((CharSequence) str);
                    if (c42411.find()) {
                        sb5.append((CharSequence) str, 0, c42411.start());
                        sb5.append(m14911(c42411.group(), fArr3[0]));
                        int iEnd9 = c42411.end();
                        if (c42411.find()) {
                            sb5.append((CharSequence) str, iEnd9, c42411.start());
                            sb5.append(m14911(c42411.group(), fArr3[1]));
                            int iEnd10 = c42411.end();
                            if (c42411.find()) {
                                sb5.append((CharSequence) str, iEnd10, c42411.start());
                                sb5.append(m14911(c42411.group(), fArr3[2]));
                                int iEnd11 = c42411.end();
                                if (c42411.find()) {
                                    sb5.append((CharSequence) str, iEnd11, c42411.start());
                                    sb5.append(m14915(Color.alpha(i2), c42411.group()));
                                    sb5.append((CharSequence) str, c42411.end(), str.length());
                                    return sb5.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 6:
                float[] fArr4 = new float[3];
                C8420.m22613(i2, fArr4);
                C4245 c42412 = f16973;
                synchronized (c42412) {
                    StringBuilder sb6 = new StringBuilder();
                    c42412.m13568reset((CharSequence) str);
                    if (c42412.find()) {
                        sb6.append((CharSequence) str, 0, c42412.start());
                        sb6.append(m14911(c42412.group(), fArr4[0]));
                        int iEnd12 = c42412.end();
                        if (c42412.find()) {
                            sb6.append((CharSequence) str, iEnd12, c42412.start());
                            sb6.append(m14911(c42412.group(), fArr4[1]));
                            int iEnd13 = c42412.end();
                            if (c42412.find()) {
                                sb6.append((CharSequence) str, iEnd13, c42412.start());
                                sb6.append(m14911(c42412.group(), fArr4[2]));
                                int iEnd14 = c42412.end();
                                if (c42412.find()) {
                                    sb6.append((CharSequence) str, iEnd14, c42412.start());
                                    sb6.append(m14915(Color.alpha(i2), c42412.group()));
                                    sb6.append((CharSequence) str, c42412.end(), str.length());
                                    return sb6.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 7:
                C4245 c42413 = f16969;
                synchronized (c42413) {
                    StringBuilder sb7 = new StringBuilder();
                    c42413.m13568reset((CharSequence) str);
                    if (c42413.find()) {
                        sb7.append((CharSequence) str, 0, c42413.start());
                        sb7.append(Color.alpha(i2));
                        int iEnd15 = c42413.end();
                        if (c42413.find()) {
                            sb7.append((CharSequence) str, iEnd15, c42413.start());
                            sb7.append(Color.red(i2));
                            int iEnd16 = c42413.end();
                            if (c42413.find()) {
                                sb7.append((CharSequence) str, iEnd16, c42413.start());
                                sb7.append(Color.green(i2));
                                int iEnd17 = c42413.end();
                                if (c42413.find()) {
                                    sb7.append((CharSequence) str, iEnd17, c42413.start());
                                    sb7.append(Color.blue(i2));
                                    sb7.append((CharSequence) str, c42413.end(), str.length());
                                    return sb7.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 8:
                String str3 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%06X%02X", Integer.valueOf(i2 & 16777215), Integer.valueOf(i2 >>> 24));
                C4245 c42414 = f16972;
                synchronized (c42414) {
                    c42414.m13568reset((CharSequence) str);
                    if (!c42414.find()) {
                        return null;
                    }
                    return str.substring(0, c42414.start()) + str3 + str.substring(c42414.end());
                }
            case 9:
                C4245 c42415 = f16969;
                synchronized (c42415) {
                    StringBuilder sb8 = new StringBuilder();
                    c42415.m13568reset((CharSequence) str);
                    if (c42415.find()) {
                        sb8.append((CharSequence) str, 0, c42415.start());
                        sb8.append(Color.red(i2));
                        int iEnd18 = c42415.end();
                        if (c42415.find()) {
                            sb8.append((CharSequence) str, iEnd18, c42415.start());
                            sb8.append(Color.green(i2));
                            int iEnd19 = c42415.end();
                            if (c42415.find()) {
                                sb8.append((CharSequence) str, iEnd19, c42415.start());
                                sb8.append(Color.blue(i2));
                                int iEnd20 = c42415.end();
                                if (c42415.find()) {
                                    sb8.append((CharSequence) str, iEnd20, c42415.start());
                                    sb8.append(Color.alpha(i2));
                                    sb8.append((CharSequence) str, c42415.end(), str.length());
                                    return sb8.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 10:
                StringBuilder sb9 = new StringBuilder();
                C4245 c42416 = f16973;
                synchronized (c42416) {
                    c42416.m13568reset((CharSequence) str);
                    if (!c42416.find()) {
                        return null;
                    }
                    sb9.append((CharSequence) str, 0, c42416.start());
                    sb9.append(m14915(Color.alpha(i2), c42416.group()));
                    int iEnd21 = c42416.end();
                    C4245 c42417 = f16969;
                    synchronized (c42417) {
                        c42417.m13568reset((CharSequence) str);
                        if (c42417.find(iEnd21)) {
                            sb9.append((CharSequence) str, iEnd21, c42417.start());
                            sb9.append(Color.red(i2));
                            int iEnd22 = c42417.end();
                            if (c42417.find()) {
                                sb9.append((CharSequence) str, iEnd22, c42417.start());
                                sb9.append(Color.green(i2));
                                int iEnd23 = c42417.end();
                                if (c42417.find()) {
                                    sb9.append((CharSequence) str, iEnd23, c42417.start());
                                    sb9.append(Color.blue(i2));
                                    sb9.append((CharSequence) str, c42417.end(), str.length());
                                    return sb9.toString();
                                }
                            }
                        }
                        return null;
                    }
                }
            case 11:
                return m14912(str, Color.red(i2), Color.green(i2), Color.blue(i2));
            case 12:
                return m14912(str, Color.alpha(i2), Color.red(i2), Color.green(i2), Color.blue(i2));
            case 13:
                return m14912(str, Color.red(i2), Color.green(i2), Color.blue(i2), Color.alpha(i2));
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14912(String str, int... iArr) {
        C4245 c4245 = f16973;
        synchronized (c4245) {
            StringBuilder sb = new StringBuilder();
            c4245.m13568reset((CharSequence) str);
            int iEnd = 0;
            for (int i : iArr) {
                if (!c4245.find()) {
                    return null;
                }
                sb.append((CharSequence) str, iEnd, c4245.start());
                sb.append(m14915(i, c4245.group()));
                iEnd = c4245.end();
            }
            sb.append((CharSequence) str, iEnd, str.length());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m14915(int i, String str) {
        boolean zEndsWith = str.endsWith("%");
        long j = i;
        if (zEndsWith) {
            j *= 100;
        }
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(j).divide(f16971, zEndsWith ? 2 : 3, RoundingMode.CEILING);
        String plainString = (bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros()).toPlainString();
        return zEndsWith ? C14483.m34972(plainString, "%") : plainString;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m14918(int i, String str) {
        return m14908(str, i, (C5021) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14908(String str, int i, C5021 c5021) {
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
                C4245 c4245 = f16972;
                synchronized (c4245) {
                    c4245.m13568reset((CharSequence) str);
                    boolean zFind = c4245.find();
                    m14914(c4245, zFind, c5021);
                    strGroup25 = zFind ? c4245.group() : null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() == 5 || strGroup25.length() == 7) {
                    return 1447446;
                }
                return C11730.m29451(strGroup25);
            case 1:
                C4245 c4246 = f16969;
                synchronized (c4246) {
                    c4246.m13568reset((CharSequence) str);
                    boolean zFind2 = c4246.find();
                    m14914(c4246, zFind2, c5021);
                    if (zFind2) {
                        strGroup = c4246.group();
                        boolean zFind3 = c4246.find();
                        m14914(c4246, zFind3, c5021);
                        if (zFind3) {
                            strGroup2 = c4246.group();
                            boolean zFind4 = c4246.find();
                            m14914(c4246, zFind4, c5021);
                            if (zFind4) {
                                strGroup25 = c4246.group();
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
                C4245 c4247 = f16973;
                synchronized (c4247) {
                    c4247.m13568reset((CharSequence) str);
                    boolean zFind5 = c4247.find();
                    m14914(c4247, zFind5, c5021);
                    if (zFind5) {
                        strGroup3 = c4247.group();
                        boolean zFind6 = c4247.find();
                        m14914(c4247, zFind6, c5021);
                        if (zFind6) {
                            strGroup4 = c4247.group();
                            boolean zFind7 = c4247.find();
                            m14914(c4247, zFind7, c5021);
                            if (zFind7) {
                                strGroup25 = c4247.group();
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
                float fM14917 = m14917(strGroup3);
                float fM14918 = m14917(strGroup4);
                float fM14919 = m14917(strGroup25);
                if (fM14917 == 360.0f) {
                    fM14917 = 0.0f;
                }
                if (fM14917 < 0.0f || fM14917 > 360.0f || fM14918 < 0.0f || fM14918 > 1.0f || fM14919 < 0.0f || fM14919 > 1.0f) {
                    return 1447446;
                }
                return C19988.m45960(new float[]{fM14917, fM14918, fM14919});
            case 3:
                C4245 c4248 = f16973;
                synchronized (c4248) {
                    c4248.m13568reset((CharSequence) str);
                    boolean zFind8 = c4248.find();
                    m14914(c4248, zFind8, c5021);
                    if (zFind8) {
                        strGroup5 = c4248.group();
                        boolean zFind9 = c4248.find();
                        m14914(c4248, zFind9, c5021);
                        if (zFind9) {
                            strGroup6 = c4248.group();
                            boolean zFind10 = c4248.find();
                            m14914(c4248, zFind10, c5021);
                            if (zFind10) {
                                strGroup25 = c4248.group();
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
                float fM149110 = m14917(strGroup5);
                float fM149111 = m14917(strGroup6);
                float fM149112 = m14917(strGroup25);
                if (fM149110 == 360.0f) {
                    fM149110 = 0.0f;
                }
                if (fM149110 < 0.0f || fM149110 > 360.0f || fM149111 < 0.0f || fM149111 > 1.0f || fM149112 < 0.0f || fM149112 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(new float[]{fM149110, fM149111, fM149112});
            case 4:
                C4245 c4249 = f16969;
                synchronized (c4249) {
                    c4249.m13568reset((CharSequence) str);
                    boolean zFind11 = c4249.find();
                    m14914(c4249, zFind11, c5021);
                    if (zFind11) {
                        strGroup7 = c4249.group();
                        boolean zFind12 = c4249.find();
                        m14914(c4249, zFind12, c5021);
                        if (zFind12) {
                            strGroup8 = c4249.group();
                            boolean zFind13 = c4249.find();
                            m14914(c4249, zFind13, c5021);
                            if (zFind13) {
                                strGroup9 = c4249.group();
                                iEnd = c4249.end();
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
                    C4245 c42410 = f16973;
                    synchronized (c42410) {
                        c42410.m13568reset((CharSequence) str);
                        boolean zFind14 = c42410.find(iEnd);
                        m14914(c42410, zFind14, c5021);
                        strGroup25 = zFind14 ? c42410.group() : null;
                        break;
                    }
                }
                if (strGroup25 == null || strGroup7.length() > 3 || strGroup8.length() > 3 || strGroup9.length() > 3) {
                    return 1447446;
                }
                int i5 = Integer.parseInt(strGroup7);
                int i6 = Integer.parseInt(strGroup8);
                int i7 = Integer.parseInt(strGroup9);
                float fM149113 = m14917(strGroup25);
                if (i5 < 0 || i5 > 255 || i6 < 0 || i6 > 255 || i7 < 0 || i7 > 255 || fM149113 < 0.0f || fM149113 > 1.0f) {
                    return 1447446;
                }
                return Color.argb((int) (fM149113 * 255.0f), i5, i6, i7);
            case 5:
                C4245 c42411 = f16973;
                synchronized (c42411) {
                    c42411.m13568reset((CharSequence) str);
                    boolean zFind15 = c42411.find();
                    m14914(c42411, zFind15, c5021);
                    if (zFind15) {
                        strGroup10 = c42411.group();
                        boolean zFind16 = c42411.find();
                        m14914(c42411, zFind16, c5021);
                        if (zFind16) {
                            strGroup11 = c42411.group();
                            boolean zFind17 = c42411.find();
                            m14914(c42411, zFind17, c5021);
                            if (zFind17) {
                                strGroup12 = c42411.group();
                                boolean zFind18 = c42411.find();
                                m14914(c42411, zFind18, c5021);
                                if (zFind18) {
                                    strGroup25 = c42411.group();
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
                float fM149114 = m14917(strGroup10);
                float fM149115 = m14917(strGroup11);
                float fM149116 = m14917(strGroup12);
                float fM149117 = m14917(strGroup25);
                if (fM149114 == 360.0f) {
                    fM149114 = 0.0f;
                }
                if (fM149114 < 0.0f || fM149114 > 360.0f || fM149115 < 0.0f || fM149115 > 1.0f || fM149116 < 0.0f || fM149116 > 1.0f || fM149117 < 0.0f || fM149117 > 1.0f) {
                    return 1447446;
                }
                return (C19988.m45960(new float[]{fM149114, fM149115, fM149116}) & 16777215) | ((((int) (fM149117 * 255.0f)) & 255) << 24);
            case 6:
                C4245 c42412 = f16973;
                synchronized (c42412) {
                    c42412.m13568reset((CharSequence) str);
                    boolean zFind19 = c42412.find();
                    m14914(c42412, zFind19, c5021);
                    if (zFind19) {
                        strGroup13 = c42412.group();
                        boolean zFind20 = c42412.find();
                        m14914(c42412, zFind20, c5021);
                        if (zFind20) {
                            strGroup14 = c42412.group();
                            boolean zFind21 = c42412.find();
                            m14914(c42412, zFind21, c5021);
                            if (zFind21) {
                                strGroup15 = c42412.group();
                                boolean zFind22 = c42412.find();
                                m14914(c42412, zFind22, c5021);
                                if (zFind22) {
                                    strGroup25 = c42412.group();
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
                float fM149118 = m14917(strGroup13);
                float fM149119 = m14917(strGroup14);
                float fM149120 = m14917(strGroup15);
                float fM149121 = m14917(strGroup25);
                if (fM149118 == 360.0f) {
                    fM149118 = 0.0f;
                }
                if (fM149118 < 0.0f || fM149118 > 360.0f || fM149119 < 0.0f || fM149119 > 1.0f || fM149120 < 0.0f || fM149120 > 1.0f || fM149121 < 0.0f || fM149121 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(((int) (fM149121 * 255.0f)) & 255, new float[]{fM149118, fM149119, fM149120});
            case 7:
                C4245 c42413 = f16969;
                synchronized (c42413) {
                    c42413.m13568reset((CharSequence) str);
                    boolean zFind23 = c42413.find();
                    m14914(c42413, zFind23, c5021);
                    if (zFind23) {
                        strGroup16 = c42413.group();
                        boolean zFind24 = c42413.find();
                        m14914(c42413, zFind24, c5021);
                        if (zFind24) {
                            strGroup17 = c42413.group();
                            boolean zFind25 = c42413.find();
                            m14914(c42413, zFind25, c5021);
                            if (zFind25) {
                                strGroup18 = c42413.group();
                                boolean zFind26 = c42413.find();
                                m14914(c42413, zFind26, c5021);
                                if (zFind26) {
                                    strGroup25 = c42413.group();
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
                C4245 c42414 = f16972;
                synchronized (c42414) {
                    c42414.m13568reset((CharSequence) str);
                    boolean zFind27 = c42414.find();
                    m14914(c42414, zFind27, c5021);
                    strGroup25 = zFind27 ? c42414.group() : null;
                    break;
                }
                if (strGroup25 == null || strGroup25.length() == 5 || strGroup25.length() == 7) {
                    return 1447446;
                }
                char[] charArray = strGroup25.toCharArray();
                int length = strGroup25.length();
                if (length == 3) {
                    return C11730.m29452(charArray[2]) | (C11730.m29452(charArray[0]) << 20) | (-16777216) | (C11730.m29452(charArray[0]) << 16) | (C11730.m29452(charArray[1]) << 12) | (C11730.m29452(charArray[1]) << 8) | (C11730.m29452(charArray[2]) << 4);
                }
                if (length == 4) {
                    return C11730.m29452(charArray[2]) | (C11730.m29452(charArray[3]) << 28) | (C11730.m29452(charArray[3]) << 24) | (C11730.m29452(charArray[0]) << 20) | (C11730.m29452(charArray[0]) << 16) | (C11730.m29452(charArray[1]) << 12) | (C11730.m29452(charArray[1]) << 8) | (C11730.m29452(charArray[2]) << 4);
                }
                if (length == 6) {
                    return C11730.m29452(charArray[5]) | (C11730.m29452(charArray[0]) << 20) | (-16777216) | (C11730.m29452(charArray[1]) << 16) | (C11730.m29452(charArray[2]) << 12) | (C11730.m29452(charArray[3]) << 8) | (C11730.m29452(charArray[4]) << 4);
                }
                if (length == 8) {
                    return C11730.m29452(charArray[5]) | (C11730.m29452(charArray[6]) << 28) | (C11730.m29452(charArray[7]) << 24) | (C11730.m29452(charArray[0]) << 20) | (C11730.m29452(charArray[1]) << 16) | (C11730.m29452(charArray[2]) << 12) | (C11730.m29452(charArray[3]) << 8) | (C11730.m29452(charArray[4]) << 4);
                }
                throw new RuntimeException("Hex color format error: " + ((Object) charArray));
            case 9:
                C4245 c42415 = f16969;
                synchronized (c42415) {
                    c42415.m13568reset((CharSequence) str);
                    boolean zFind28 = c42415.find();
                    m14914(c42415, zFind28, c5021);
                    if (zFind28) {
                        strGroup19 = c42415.group();
                        boolean zFind29 = c42415.find();
                        m14914(c42415, zFind29, c5021);
                        if (zFind29) {
                            strGroup20 = c42415.group();
                            boolean zFind30 = c42415.find();
                            m14914(c42415, zFind30, c5021);
                            if (zFind30) {
                                strGroup21 = c42415.group();
                                boolean zFind31 = c42415.find();
                                m14914(c42415, zFind31, c5021);
                                if (zFind31) {
                                    strGroup25 = c42415.group();
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
                C4245 c42416 = f16973;
                synchronized (c42416) {
                    c42416.m13568reset((CharSequence) str);
                    boolean zFind32 = c42416.find();
                    m14914(c42416, zFind32, c5021);
                    if (zFind32) {
                        strGroup22 = c42416.group();
                        iEnd2 = c42416.end();
                    } else {
                        strGroup22 = null;
                    }
                    break;
                }
                if (strGroup22 != null) {
                    C4245 c42417 = f16969;
                    synchronized (c42417) {
                        c42417.m13568reset((CharSequence) str);
                        boolean zFind33 = c42417.find(iEnd2);
                        m14914(c42417, zFind33, c5021);
                        if (zFind33) {
                            String strGroup26 = c42417.group();
                            boolean zFind34 = c42417.find();
                            m14914(c42417, zFind34, c5021);
                            if (zFind34) {
                                strGroup23 = c42417.group();
                                boolean zFind35 = c42417.find();
                                m14914(c42417, zFind35, c5021);
                                strGroup25 = strGroup26;
                                strGroup24 = zFind35 ? c42417.group() : null;
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
                float fM149122 = m14917(strGroup22);
                int i16 = Integer.parseInt(str2);
                int i17 = Integer.parseInt(strGroup23);
                int i18 = Integer.parseInt(strGroup25);
                if (fM149122 < 0.0f || fM149122 > 1.0f || i16 < 0 || i16 > 255 || i17 < 0 || i17 > 255 || i18 < 0 || i18 > 255) {
                    return 1447446;
                }
                return Color.argb((int) (fM149122 * 255.0f), i16, i17, i18);
            case 11:
            case 12:
            case 13:
                return m14909(str, i, (InterfaceC6822) c5021);
            default:
                return 1447446;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14909(String str, int i, InterfaceC6822 interfaceC6822) {
        int i2;
        float f;
        int i3;
        int i4 = i == 11 ? 3 : 4;
        float[] fArr = new float[i4];
        C4245 c4245 = f16973;
        synchronized (c4245) {
            c4245.m13568reset((CharSequence) str);
            while (i2 < i4) {
                boolean zFind = c4245.find();
                m14914(c4245, zFind, interfaceC6822);
                if (!zFind) {
                    return 1447446;
                }
                float fM14917 = m14917(c4245.group());
                fArr[i2] = fM14917;
                i2 = (fM14917 >= 0.0f && fM14917 <= 1.0f) ? i2 + 1 : 0;
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
    public static void m14914(C4245 c4245, boolean z, InterfaceC6822 interfaceC6822) {
        if (interfaceC6822 != null) {
            try {
                C16207.m38462(((C5021) interfaceC6822).f17413, c4245);
            } catch (RuntimeException e) {
                throw new C13533(e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static float m14917(String str) {
        boolean z = false;
        if (str.endsWith("%")) {
            str = C1402.m5124(1, 0, str);
            z = true;
        }
        float f = Float.parseFloat(str);
        return z ? f / 100.0f : f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14911(String str, float f) {
        boolean zEndsWith = str.endsWith("%");
        if (zEndsWith) {
            f *= 100.0f;
        }
        BigDecimal scale = new BigDecimal(Float.toString(f)).setScale(zEndsWith ? 2 : 3, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        return zEndsWith ? C14483.m34972(plainString, "%") : plainString;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m14916() {
        return Integer.toString(f16970.getAndIncrement(), 36);
    }
}
