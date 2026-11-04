package l;

/* JADX INFO: renamed from: l.ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15424 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f50266 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f50265 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f50263 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50262 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50268 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f50264 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f50267 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f50269 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36941() {
        return this.f50266;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36940() {
        return this.f50265;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m36943() {
        return this.f50267 ? this.f50265 : this.f50266;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36937() {
        return this.f50267 ? this.f50266 : this.f50265;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36942(int i, int i2) {
        this.f50263 = i;
        this.f50262 = i2;
        this.f50269 = true;
        if (this.f50267) {
            if (i2 != Integer.MIN_VALUE) {
                this.f50266 = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f50265 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f50266 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f50265 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36938(int i, int i2) {
        this.f50269 = false;
        if (i != Integer.MIN_VALUE) {
            this.f50268 = i;
            this.f50266 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f50264 = i2;
            this.f50265 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36939(boolean z) {
        if (z == this.f50267) {
            return;
        }
        this.f50267 = z;
        if (!this.f50269) {
            this.f50266 = this.f50268;
            this.f50265 = this.f50264;
            return;
        }
        if (z) {
            int i = this.f50262;
            if (i == Integer.MIN_VALUE) {
                i = this.f50268;
            }
            this.f50266 = i;
            int i2 = this.f50263;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f50264;
            }
            this.f50265 = i2;
            return;
        }
        int i3 = this.f50263;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f50268;
        }
        this.f50266 = i3;
        int i4 = this.f50262;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f50264;
        }
        this.f50265 = i4;
    }
}
