package l;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9744 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    @Deprecated
    public final Uri[] f32784;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13689[] f32785;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f32786;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f32787;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String[] f32788;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] f32789;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f32790;

    public C9744() {
        this(-1, -1, new int[0], new C13689[0], new long[0], new String[0]);
    }

    public C9744(int i, int i2, int[] iArr, C13689[] c13689Arr, long[] jArr, String[] strArr) {
        Uri uri;
        int i3 = 0;
        C2023.m6507(iArr.length == c13689Arr.length);
        this.f32786 = i;
        this.f32787 = i2;
        this.f32790 = iArr;
        this.f32785 = c13689Arr;
        this.f32789 = jArr;
        this.f32784 = new Uri[c13689Arr.length];
        while (true) {
            Uri[] uriArr = this.f32784;
            if (i3 < uriArr.length) {
                C13689 c13689 = c13689Arr[i3];
                if (c13689 == null) {
                    uri = null;
                } else {
                    C14704 c14704 = c13689.f45157;
                    c14704.getClass();
                    uri = c14704.f48029;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.f32788 = strArr;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24724(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f32790;
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
        if (obj == null || C9744.class != obj.getClass()) {
            return false;
        }
        C9744 c9744 = (C9744) obj;
        return this.f32786 == c9744.f32786 && this.f32787 == c9744.f32787 && Arrays.equals(this.f32785, c9744.f32785) && Arrays.equals(this.f32790, c9744.f32790) && Arrays.equals(this.f32789, c9744.f32789) && Arrays.equals(this.f32788, c9744.f32788);
    }

    public final int hashCode() {
        int i = (int) 0;
        return (((((Arrays.hashCode(this.f32789) + ((Arrays.hashCode(this.f32790) + ((Arrays.hashCode(this.f32785) + (((((this.f32786 * 31) + this.f32787) * 31) + i) * 31)) * 31)) * 31)) * 31) + i) * 961) + Arrays.hashCode(this.f32788)) * 31;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9744 m24725() {
        int[] iArr = this.f32790;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f32789;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C9744(0, this.f32787, iArrCopyOf, (C13689[]) Arrays.copyOf(this.f32785, 0), jArrCopyOf, (String[]) Arrays.copyOf(this.f32788, 0));
    }

    static {
        C9023.m23358(0, 1, 2, 3, 4);
        C9023.m23358(5, 6, 7, 8, 9);
        C17983.m41806(10);
    }
}
