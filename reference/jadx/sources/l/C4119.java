package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.ۘᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4119 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C4119 f15082;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f15083;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f15084;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f15085;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f15086;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f15087;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f15088;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f15089;

    @Pure
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m11700(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11701(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? C8479.m22141(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    @Pure
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m11703(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m11704(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? C8479.m22141(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m11705(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? C8479.m22141(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    static {
        C13293 c13293 = new C13293();
        c13293.m32777(1);
        c13293.m32778(2);
        c13293.m32772(3);
        f15082 = c13293.m32773();
        C13293 c13294 = new C13293();
        c13294.m32777(1);
        c13294.m32778(1);
        c13294.m32772(2);
        c13294.m32773();
        C17983.m41806(0);
        C17983.m41806(1);
        C17983.m41806(2);
        C17983.m41806(3);
        C17983.m41806(4);
        C17983.m41806(5);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11702(C4119 c4119) {
        if (c4119 == null) {
            return true;
        }
        int i = c4119.f15087;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c4119.f15088;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c4119.f15084;
        if ((i3 != -1 && i3 != 3) || c4119.f15089 != null) {
            return false;
        }
        int i4 = c4119.f15085;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c4119.f15083;
        return i5 == -1 || i5 == 8;
    }

    public C4119(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f15087 = i;
        this.f15088 = i2;
        this.f15084 = i3;
        this.f15089 = bArr;
        this.f15083 = i4;
        this.f15085 = i5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13293 m11706() {
        return new C13293(this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m11708() {
        return (this.f15087 == -1 || this.f15088 == -1 || this.f15084 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m11707() {
        String str;
        String str2;
        int i;
        if (m11708()) {
            String strM11705 = m11705(this.f15087);
            String strM11701 = m11701(this.f15088);
            String strM11704 = m11704(this.f15084);
            Locale locale = Locale.US;
            str = strM11705 + "/" + strM11701 + "/" + strM11704;
        } else {
            str = "NA/NA/NA";
        }
        int i2 = this.f15083;
        if (i2 == -1 || (i = this.f15085) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i2 + "/" + i;
        }
        return C1679.m5594(str, "/", str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4119.class == obj.getClass()) {
            C4119 c4119 = (C4119) obj;
            if (this.f15087 == c4119.f15087 && this.f15088 == c4119.f15088 && this.f15084 == c4119.f15084 && Arrays.equals(this.f15089, c4119.f15089) && this.f15083 == c4119.f15083 && this.f15085 == c4119.f15085) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f15086 == 0) {
            this.f15086 = ((((Arrays.hashCode(this.f15089) + ((((((this.f15087 + 527) * 31) + this.f15088) * 31) + this.f15084) * 31)) * 31) + this.f15083) * 31) + this.f15085;
        }
        return this.f15086;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m11705(this.f15087));
        sb.append(", ");
        sb.append(m11701(this.f15088));
        sb.append(", ");
        sb.append(m11704(this.f15084));
        sb.append(", ");
        sb.append(this.f15089 != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f15083;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f15085;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return C22697.m50267(sb, str2, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
