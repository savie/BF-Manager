package l;

/* JADX INFO: renamed from: l.᩶ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U707 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20328 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f65837;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f65838;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f65839;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f65840;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC16095 f65841;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65842;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65843;

    public C20328(int i) {
        m45888(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45888(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f65837 = i;
        this.f65839 = -1;
        this.f65842 = -1;
        this.f65840 = -1;
        this.f65843 = -1;
        this.f65838 = false;
        this.f65841 = EnumC16095.COMPLETE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45883(int i, int i2) {
        if (i == i2) {
            m45882(i);
            return;
        }
        if (i < 0 || i > i2 || i2 > this.f65837) {
            throw new IndexOutOfBoundsException("Invalid dependency read range");
        }
        int i3 = this.f65843;
        if (i3 == -1 || i < i3) {
            this.f65843 = i;
        }
        if (i2 > this.f65840) {
            this.f65840 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45882(int i) {
        if (i < 0 || i > this.f65837) {
            throw new IndexOutOfBoundsException("Invalid dependency boundary");
        }
        int i2 = this.f65842;
        if (i2 == -1 || i < i2) {
            this.f65842 = i;
        }
        if (i > this.f65839) {
            this.f65839 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45881() {
        this.f65838 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45886() {
        this.f65841 = EnumC16095.UNKNOWN;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45884(C0571 c0571) {
        C13638.requireNonNull(c0571);
        if (this.f65837 != c0571.f2357) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c0571.f2363;
        if (i != -1) {
            int i2 = this.f65843;
            if (i2 == -1 || i < i2) {
                this.f65843 = i;
            }
            int i3 = c0571.f2360;
            if (i3 > this.f65840) {
                this.f65840 = i3;
            }
        }
        int i4 = c0571.f2362;
        if (i4 != -1) {
            int i5 = this.f65842;
            if (i5 == -1 || i4 < i5) {
                this.f65842 = i4;
            }
            int i6 = c0571.f2359;
            if (i6 > this.f65839) {
                this.f65839 = i6;
            }
        }
        this.f65838 |= c0571.f2358;
        EnumC16095 enumC16095 = c0571.f2361;
        EnumC16095 enumC16096 = EnumC16095.UNKNOWN;
        if (enumC16095 == enumC16096) {
            this.f65841 = enumC16096;
            return;
        }
        EnumC16095 enumC16097 = EnumC16095.INCOMPLETE;
        if (enumC16095 == enumC16097 && this.f65841 == EnumC16095.COMPLETE) {
            this.f65841 = enumC16097;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45885(C20328 c20328) {
        C13638.requireNonNull(c20328);
        if (c20328 == this) {
            return;
        }
        if (this.f65837 != c20328.f65837) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c20328.f65843;
        if (i != -1) {
            int i2 = this.f65843;
            if (i2 == -1 || i < i2) {
                this.f65843 = i;
            }
            int i3 = c20328.f65840;
            if (i3 > this.f65840) {
                this.f65840 = i3;
            }
        }
        int i4 = c20328.f65842;
        if (i4 != -1) {
            int i5 = this.f65842;
            if (i5 == -1 || i4 < i5) {
                this.f65842 = i4;
            }
            int i6 = c20328.f65839;
            if (i6 > this.f65839) {
                this.f65839 = i6;
            }
        }
        this.f65838 |= c20328.f65838;
        EnumC16095 enumC16095 = c20328.f65841;
        EnumC16095 enumC16096 = EnumC16095.UNKNOWN;
        if (enumC16095 == enumC16096) {
            this.f65841 = enumC16096;
            return;
        }
        EnumC16095 enumC16097 = EnumC16095.INCOMPLETE;
        if (enumC16095 == enumC16097 && this.f65841 == EnumC16095.COMPLETE) {
            this.f65841 = enumC16097;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0571 m45887() {
        return new C0571(this, this.f65841);
    }
}
