package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16549 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648[] f53563;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f53564;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f53565;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f53566;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f53567;

    public C16549(String str, C15648... c15648Arr) {
        C20782.m47565(c15648Arr.length > 0);
        this.f53564 = str;
        this.f53563 = c15648Arr;
        this.f53567 = c15648Arr.length;
        int iM25260 = C9681.m25260(c15648Arr[0].f50848);
        this.f53565 = iM25260 == -1 ? C9681.m25260(c15648Arr[0].f50820) : iM25260;
        String str2 = c15648Arr[0].f50811;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = c15648Arr[0].f50834 | 16384;
        for (int i2 = 1; i2 < c15648Arr.length; i2++) {
            String str3 = c15648Arr[i2].f50811;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m39192("languages", i2, c15648Arr[0].f50811, c15648Arr[i2].f50811);
                return;
            } else {
                if (i != (c15648Arr[i2].f50834 | 16384)) {
                    m39192("role flags", i2, Integer.toBinaryString(c15648Arr[0].f50834), Integer.toBinaryString(c15648Arr[i2].f50834));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 m39194(int i) {
        return this.f53563[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39193(C15648 c15648) {
        int i = 0;
        while (true) {
            C15648[] c15648Arr = this.f53563;
            if (i >= c15648Arr.length) {
                return -1;
            }
            if (c15648 == c15648Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f53566 == 0) {
            this.f53566 = Arrays.hashCode(this.f53563) + C12351.m30817(527, 31, this.f53564);
        }
        return this.f53566;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16549.class == obj.getClass()) {
            C16549 c16549 = (C16549) obj;
            if (this.f53564.equals(c16549.f53564) && Arrays.equals(this.f53563, c16549.f53563)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f53564 + ": " + Arrays.toString(this.f53563);
    }

    static {
        C7116.m19499(0);
        C7116.m19499(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39192(String str, int i, String str2, String str3) {
        StringBuilder sbM10406 = C3188.m10406("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM10406.append(str3);
        sbM10406.append("' (track ");
        sbM10406.append(i);
        sbM10406.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C1896.m6516("", new IllegalStateException(sbM10406.toString()));
    }
}
