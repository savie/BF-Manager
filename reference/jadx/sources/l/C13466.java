package l;

/* JADX INFO: renamed from: l.ܰ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C13466 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11349[] f44532 = new C11349[6];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f44533;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11349[] m32970() {
        int i = this.f44533;
        C11349[] c11349Arr = new C11349[i];
        System.arraycopy(this.f44532, 0, c11349Arr, 0, i);
        return c11349Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32969(C11349 c11349) {
        while (c11349 != null) {
            int i = 0;
            while (true) {
                int i2 = this.f44533;
                if (i < i2) {
                    if (this.f44532[i].f38289.equals(c11349.f38289)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    C11349[] c11349Arr = this.f44532;
                    if (i2 >= c11349Arr.length) {
                        C11349[] c11349Arr2 = new C11349[c11349Arr.length + 6];
                        System.arraycopy(c11349Arr, 0, c11349Arr2, 0, i2);
                        this.f44532 = c11349Arr2;
                    }
                    C11349[] c11349Arr3 = this.f44532;
                    int i3 = this.f44533;
                    this.f44533 = i3 + 1;
                    c11349Arr3[i3] = c11349;
                    break;
                }
            }
            c11349 = c11349.f38290;
        }
    }
}
