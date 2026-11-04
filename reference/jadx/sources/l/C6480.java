package l;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6480 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21782;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f21783;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    @Deprecated
    public final Uri[] f21784;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f21785;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f21786;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] f21787;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14902[] f21788;

    public C6480() {
        this(-1, -1, new int[0], new C14902[0], new long[0], new String[0]);
    }

    public C6480(int i, int i2, int[] iArr, C14902[] c14902Arr, long[] jArr, String[] strArr) {
        Uri uri;
        int i3 = 0;
        C20782.m47565(iArr.length == c14902Arr.length);
        this.f21782 = i;
        this.f21786 = i2;
        this.f21785 = iArr;
        this.f21788 = c14902Arr;
        this.f21787 = jArr;
        this.f21784 = new Uri[c14902Arr.length];
        while (true) {
            Uri[] uriArr = this.f21784;
            if (i3 < uriArr.length) {
                C14902 c14902 = c14902Arr[i3];
                if (c14902 == null) {
                    uri = null;
                } else {
                    C20870 c20870 = c14902.f48681;
                    c20870.getClass();
                    uri = c20870.f66802;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.f21783 = strArr;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18312(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f21785;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6480.class != obj.getClass()) {
            return false;
        }
        C6480 c6480 = (C6480) obj;
        return this.f21782 == c6480.f21782 && this.f21786 == c6480.f21786 && Arrays.equals(this.f21788, c6480.f21788) && Arrays.equals(this.f21785, c6480.f21785) && Arrays.equals(this.f21787, c6480.f21787) && Arrays.equals(this.f21783, c6480.f21783);
    }

    public final int hashCode() {
        int i = (int) 0;
        return (((((Arrays.hashCode(this.f21787) + ((Arrays.hashCode(this.f21785) + ((Arrays.hashCode(this.f21788) + (((((this.f21782 * 31) + this.f21786) * 31) + i) * 31)) * 31)) * 31)) * 31) + i) * 961) + Arrays.hashCode(this.f21783)) * 31;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6480 m18313() {
        int[] iArr = this.f21785;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f21787;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C6480(0, this.f21786, iArrCopyOf, (C14902[]) Arrays.copyOf(this.f21788, 0), jArrCopyOf, (String[]) Arrays.copyOf(this.f21783, 0));
    }

    static {
        C4794.m14773(0, 1, 2, 3, 4);
        C4794.m14773(5, 6, 7, 8, 9);
        C7116.m19499(10);
    }
}
