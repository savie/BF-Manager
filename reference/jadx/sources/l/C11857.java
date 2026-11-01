package l;

/* JADX INFO: renamed from: l.ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64IT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11857 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f39783 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f39776 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f39781 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39778 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39782 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f39780 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f39779 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f39777 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29550() {
        return this.f39783;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m29549() {
        return this.f39776;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m29545() {
        return this.f39779 ? this.f39776 : this.f39783;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29546() {
        return this.f39779 ? this.f39783 : this.f39776;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29551(int i, int i2) {
        this.f39781 = i;
        this.f39778 = i2;
        this.f39777 = true;
        if (this.f39779) {
            if (i2 != Integer.MIN_VALUE) {
                this.f39783 = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f39776 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f39783 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f39776 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29547(int i, int i2) {
        this.f39777 = false;
        if (i != Integer.MIN_VALUE) {
            this.f39782 = i;
            this.f39783 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f39780 = i2;
            this.f39776 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29548(boolean z) {
        if (z == this.f39779) {
            return;
        }
        this.f39779 = z;
        if (!this.f39777) {
            this.f39783 = this.f39782;
            this.f39776 = this.f39780;
            return;
        }
        if (z) {
            int i = this.f39778;
            if (i == Integer.MIN_VALUE) {
                i = this.f39782;
            }
            this.f39783 = i;
            int i2 = this.f39781;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f39780;
            }
            this.f39776 = i2;
            return;
        }
        int i3 = this.f39781;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f39782;
        }
        this.f39783 = i3;
        int i4 = this.f39778;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f39780;
        }
        this.f39776 = i4;
    }
}
