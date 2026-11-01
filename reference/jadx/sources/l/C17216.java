package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17216 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f54864;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648[] f54865;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f54866;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f54867;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f54868;

    public C17216(String str, C7648... c7648Arr) {
        C2023.m6507(c7648Arr.length > 0);
        this.f54867 = str;
        this.f54865 = c7648Arr;
        this.f54864 = c7648Arr.length;
        int iM17981 = C6632.m17981(c7648Arr[0].f25265);
        this.f54866 = iM17981 == -1 ? C6632.m17981(c7648Arr[0].f25262) : iM17981;
        String str2 = c7648Arr[0].f25269;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = c7648Arr[0].f25244 | 16384;
        for (int i2 = 1; i2 < c7648Arr.length; i2++) {
            String str3 = c7648Arr[i2].f25269;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m40157("languages", i2, c7648Arr[0].f25269, c7648Arr[i2].f25269);
                return;
            } else {
                if (i != (c7648Arr[i2].f25244 | 16384)) {
                    m40157("role flags", i2, Integer.toBinaryString(c7648Arr[0].f25244), Integer.toBinaryString(c7648Arr[i2].f25244));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 m40159(int i) {
        return this.f54865[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40158(C7648 c7648) {
        int i = 0;
        while (true) {
            C7648[] c7648Arr = this.f54865;
            if (i >= c7648Arr.length) {
                return -1;
            }
            if (c7648 == c7648Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f54868 == 0) {
            this.f54868 = Arrays.hashCode(this.f54865) + C13958.m33812(527, 31, this.f54867);
        }
        return this.f54868;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17216.class == obj.getClass()) {
            C17216 c17216 = (C17216) obj;
            if (this.f54867.equals(c17216.f54867) && Arrays.equals(this.f54865, c17216.f54865)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f54867 + ": " + Arrays.toString(this.f54865);
    }

    static {
        C17983.m41806(0);
        C17983.m41806(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40157(String str, int i, String str2, String str3) {
        StringBuilder sbM30515 = C12278.m30515("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM30515.append(str3);
        sbM30515.append("' (track ");
        sbM30515.append(i);
        sbM30515.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C0303.m1854("", new IllegalStateException(sbM30515.toString()));
    }
}
