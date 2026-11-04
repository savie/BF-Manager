package l;

/* JADX INFO: renamed from: l.᩸ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6ZV */
/* JADX INFO: loaded from: classes.dex */
public final class C22768 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73872;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f73873;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18415[] f73874;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73875;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18415 m51342(C15703 c15703, CharSequence charSequence, int[] iArr, int[] iArr2) {
        for (int i = 0; i < this.f73875; i++) {
            C18415 c18415 = this.f73874[i];
            if (this.f73873[i] == c15703.m37488() && c15703.m37492(c18415.pattern(), charSequence, iArr, iArr2)) {
                int i2 = this.f73873[i];
                if (i == 0) {
                    return c18415;
                }
                C18415[] c18415Arr = this.f73874;
                System.arraycopy(c18415Arr, 0, c18415Arr, 1, i);
                int[] iArr3 = this.f73873;
                System.arraycopy(iArr3, 0, iArr3, 1, i);
                this.f73874[0] = c18415;
                this.f73873[0] = i2;
                return c18415;
            }
        }
        C18415 c18415M42924 = C18415.m42924(c15703.m37488(), c15703.m37489(charSequence, iArr, iArr2));
        int iM37488 = c15703.m37488();
        if (this.f73874 == null) {
            this.f73874 = new C18415[8];
            this.f73873 = new int[8];
        }
        int length = c18415M42924.pattern().length();
        while (true) {
            int i3 = this.f73875;
            if (i3 == 8 || this.f73872 + length > 16384) {
                C18415[] c18415Arr2 = this.f73874;
                int i4 = i3 - 1;
                this.f73875 = i4;
                C18415 c18416 = c18415Arr2[i4];
                c18415Arr2[i4] = null;
                this.f73872 -= c18416.pattern().length();
            } else {
                C18415[] c18415Arr3 = this.f73874;
                System.arraycopy(c18415Arr3, 0, c18415Arr3, 1, i3);
                int[] iArr4 = this.f73873;
                System.arraycopy(iArr4, 0, iArr4, 1, this.f73875);
                this.f73874[0] = c18415M42924;
                this.f73873[0] = iM37488;
                this.f73875++;
                this.f73872 += length;
                return c18415M42924;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51343() {
        this.f73874 = null;
        this.f73873 = null;
        this.f73875 = 0;
        this.f73872 = 0;
    }
}
