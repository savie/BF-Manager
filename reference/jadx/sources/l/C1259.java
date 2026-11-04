package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.֨ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1259 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C1259 f4534;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4535;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f4536;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f4537;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f4538;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f4539;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f4540;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4541;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4556(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? C13645.m33382(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m4558(int i) {
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
            return i != 7 ? C13645.m33382(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    @Pure
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m4559(int i) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m4560(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? C13645.m33382(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    @Pure
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m4561(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    static {
        C10207 c10207 = new C10207();
        c10207.m26332(1);
        c10207.m26334(2);
        c10207.m26335(3);
        f4534 = c10207.m26329();
        C10207 c10208 = new C10207();
        c10208.m26332(1);
        c10208.m26334(1);
        c10208.m26335(2);
        c10208.m26329();
        C7116.m19499(0);
        C7116.m19499(1);
        C7116.m19499(2);
        C7116.m19499(3);
        C7116.m19499(4);
        C7116.m19499(5);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4557(C1259 c1259) {
        if (c1259 == null) {
            return true;
        }
        int i = c1259.f4536;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c1259.f4540;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c1259.f4541;
        if ((i3 != -1 && i3 != 3) || c1259.f4538 != null) {
            return false;
        }
        int i4 = c1259.f4535;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c1259.f4537;
        return i5 == -1 || i5 == 8;
    }

    public C1259(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f4536 = i;
        this.f4540 = i2;
        this.f4541 = i3;
        this.f4538 = bArr;
        this.f4537 = i4;
        this.f4535 = i5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10207 m4562() {
        return new C10207(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4564() {
        return (this.f4536 == -1 || this.f4540 == -1 || this.f4541 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m4563() {
        String str;
        String str2;
        int i;
        if (m4564()) {
            String strM4560 = m4560(this.f4536);
            String strM4556 = m4556(this.f4540);
            String strM4558 = m4558(this.f4541);
            Locale locale = Locale.US;
            str = strM4560 + "/" + strM4556 + "/" + strM4558;
        } else {
            str = "NA/NA/NA";
        }
        int i2 = this.f4537;
        if (i2 == -1 || (i = this.f4535) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i2 + "/" + i;
        }
        return C20196.m46451(str, "/", str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1259.class == obj.getClass()) {
            C1259 c1259 = (C1259) obj;
            if (this.f4536 == c1259.f4536 && this.f4540 == c1259.f4540 && this.f4541 == c1259.f4541 && Arrays.equals(this.f4538, c1259.f4538) && this.f4537 == c1259.f4537 && this.f4535 == c1259.f4535) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4539 == 0) {
            this.f4539 = ((((Arrays.hashCode(this.f4538) + ((((((this.f4536 + 527) * 31) + this.f4540) * 31) + this.f4541) * 31)) * 31) + this.f4537) * 31) + this.f4535;
        }
        return this.f4539;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m4560(this.f4536));
        sb.append(", ");
        sb.append(m4556(this.f4540));
        sb.append(", ");
        sb.append(m4558(this.f4541));
        sb.append(", ");
        sb.append(this.f4538 != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f4537;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f4535;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return C8947.m23910(sb, str2, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
