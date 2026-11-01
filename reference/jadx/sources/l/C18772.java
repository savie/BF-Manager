package l;

/* JADX INFO: renamed from: l.ᩴ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18772 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f60856;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f60857;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f60858;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14690[] f60859;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14690 m43333(C8626 c8626, CharSequence charSequence, int[] iArr, int[] iArr2) {
        for (int i = 0; i < this.f60856; i++) {
            C14690 c14690 = this.f60859[i];
            if (this.f60858[i] == c8626.m22408() && c8626.m22412(c14690.pattern(), charSequence, iArr, iArr2)) {
                int i2 = this.f60858[i];
                if (i == 0) {
                    return c14690;
                }
                C14690[] c14690Arr = this.f60859;
                System.arraycopy(c14690Arr, 0, c14690Arr, 1, i);
                int[] iArr3 = this.f60858;
                System.arraycopy(iArr3, 0, iArr3, 1, i);
                this.f60859[0] = c14690;
                this.f60858[0] = i2;
                return c14690;
            }
        }
        C14690 c14690M35218 = C14690.m35218(c8626.m22408(), c8626.m22409(charSequence, iArr, iArr2));
        int iM22408 = c8626.m22408();
        if (this.f60859 == null) {
            this.f60859 = new C14690[8];
            this.f60858 = new int[8];
        }
        int length = c14690M35218.pattern().length();
        while (true) {
            int i3 = this.f60856;
            if (i3 == 8 || this.f60857 + length > 16384) {
                C14690[] c14690Arr2 = this.f60859;
                int i4 = i3 - 1;
                this.f60856 = i4;
                C14690 c14691 = c14690Arr2[i4];
                c14690Arr2[i4] = null;
                this.f60857 -= c14691.pattern().length();
            } else {
                C14690[] c14690Arr3 = this.f60859;
                System.arraycopy(c14690Arr3, 0, c14690Arr3, 1, i3);
                int[] iArr4 = this.f60858;
                System.arraycopy(iArr4, 0, iArr4, 1, this.f60856);
                this.f60859[0] = c14690M35218;
                this.f60858[0] = iM22408;
                this.f60856++;
                this.f60857 += length;
                return c14690M35218;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43334() {
        this.f60859 = null;
        this.f60858 = null;
        this.f60856 = 0;
        this.f60857 = 0;
    }
}
