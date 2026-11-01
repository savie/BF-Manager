package l;

/* JADX INFO: renamed from: l.ۙ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: E43E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4311 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15485;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f15486;

    public C4311() {
        this.f15486 = -1;
        this.f15485 = -1;
    }

    public C4311(int i, int i2) {
        this.f15486 = i;
        this.f15485 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12112(C4311 c4311) {
        if (c4311 == null) {
            return;
        }
        int i = this.f15486;
        if (i == -1) {
            this.f15486 = c4311.f15486;
        } else {
            int i2 = c4311.f15486;
            if (i2 != -1) {
                if (i >= i2) {
                    i = i2;
                }
                this.f15486 = i;
            }
        }
        int i3 = this.f15485;
        if (i3 == -1) {
            this.f15485 = c4311.f15485;
            return;
        }
        int i4 = c4311.f15485;
        if (i4 != -1) {
            if (i3 <= i4) {
                i3 = i4;
            }
            this.f15485 = i3;
        }
    }
}
