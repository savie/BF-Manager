package l;

/* JADX INFO: renamed from: l.ۛۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A570 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6040 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9569 f20509;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4129 f20510;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17329 f20511;

    public C6040(AbstractC9569 abstractC9569, C17329 c17329, C4129 c4129) {
        if (abstractC9569 == null) {
            throw new NullPointerException("locals == null");
        }
        if (c17329 == null) {
            throw new NullPointerException("stack == null");
        }
        c4129.m43642();
        this.f20509 = abstractC9569;
        this.f20511 = c17329;
        this.f20510 = c4129;
    }

    public C6040(int i, int i2) {
        this(new C4359(i), new C17329(i2), C4129.f15128);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6040 m16380() {
        return new C6040(this.f20509.mo9634(), this.f20511.m40299(), this.f20510);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m16388() {
        this.f20509.mo9637();
        this.f20511.mo9637();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16385(C3320 c3320) {
        this.f20509.mo9636(c3320);
        this.f20511.m40300(c3320);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6040 m16382(C6040 c6040) {
        C4129 c4129;
        AbstractC9569 abstractC9569 = c6040.f20509;
        AbstractC9569 abstractC95610 = this.f20509;
        AbstractC9569 abstractC9569Mo9630 = abstractC95610.mo9630(abstractC9569);
        C17329 c17329 = c6040.f20511;
        C17329 c173210 = this.f20511;
        c173210.getClass();
        try {
            C17329 c17329M5866 = C1791.m5866(c173210, c17329);
            C4129 c41210 = c6040.f20510;
            C4129 c41211 = this.f20510;
            if (c41211.equals(c41210)) {
                c4129 = c41211;
            } else {
                c4129 = new C4129();
                int size = c41211.size();
                int size2 = c41210.size();
                for (int i = 0; i < size && i < size2 && c41211.get(i) == c41210.get(i); i++) {
                    c4129.add(i);
                }
                c4129.mo9637();
            }
            if (abstractC9569Mo9630 instanceof C3217) {
                abstractC9569Mo9630 = (C3217) abstractC9569Mo9630;
                if (c4129.size() == 0) {
                    abstractC9569Mo9630 = abstractC9569Mo9630.mo9635();
                }
            }
            return (abstractC9569Mo9630 == abstractC95610 && c17329M5866 == c173210 && c41211 == c4129) ? this : new C6040(abstractC9569Mo9630, c17329M5866, c4129);
        } catch (C21293 e) {
            e.m20021("underlay stack:");
            c173210.m40296(e);
            e.m20021("overlay stack:");
            c17329.m40296(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6040 m16383(C6040 c6040, int i, int i2) {
        AbstractC9569 abstractC9569 = c6040.f20509;
        AbstractC9569 abstractC95610 = this.f20509;
        C3217 c3217Mo9628 = abstractC95610.mo9628(abstractC9569, i2);
        C17329 c17329 = c6040.f20511;
        C17329 c173210 = this.f20511;
        c173210.getClass();
        try {
            C17329 c17329M5866 = C1791.m5866(c173210, c17329);
            C4129 c4129M11757 = c6040.f20510.m11757();
            c4129M11757.add(i);
            c4129M11757.mo9637();
            C4129 c4129 = this.f20510;
            if (c3217Mo9628 == abstractC95610 && c17329M5866 == c173210 && c4129.equals(c4129M11757)) {
                return this;
            }
            if (!c4129.equals(c4129M11757)) {
                if (c4129.size() > c4129M11757.size()) {
                    c4129 = c4129M11757;
                    c4129M11757 = c4129;
                }
                int size = c4129M11757.size();
                int size2 = c4129.size();
                for (int i3 = size2 - 1; i3 >= 0; i3--) {
                    if (c4129.get(i3) != c4129M11757.get((size - size2) + i3)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
                c4129 = c4129M11757;
            }
            return new C6040(c3217Mo9628, c17329M5866, c4129);
        } catch (C21293 e) {
            e.m20021("underlay stack:");
            c173210.m40296(e);
            e.m20021("overlay stack:");
            c17329.m40296(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9569 m16391() {
        return this.f20509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6040 m16384(C6143 c6143) {
        C17329 c17329M40299 = this.f20511.m40299();
        c17329M40299.m40298();
        c17329M40299.m40295(c6143);
        return new C6040(this.f20509, c17329M40299, this.f20510);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17329 m16389() {
        return this.f20511;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4129 m16379() {
        return this.f20510;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16386(C9672 c9672) {
        int size = c9672.size();
        int iM9830 = 0;
        for (int i = 0; i < size; i++) {
            C3320 c3320M15264get = c9672.m15264get(i);
            this.f20509.mo9631(iM9830, c3320M15264get);
            iM9830 += c3320M15264get.m9830();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6040 m16390(int i, int i2) {
        AbstractC9569 abstractC9569 = this.f20509;
        AbstractC9569 abstractC9569M9629 = abstractC9569 instanceof C3217 ? ((C3217) abstractC9569).m9629(i2) : null;
        try {
            C4129 c4129M11757 = this.f20510.m11757();
            if (c4129M11757.m11758() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            c4129M11757.mo9637();
            if (abstractC9569M9629 == null) {
                return null;
            }
            return new C6040(abstractC9569M9629, this.f20511, c4129M11757);
        } catch (IndexOutOfBoundsException unused) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6040 m16381(int i, int i2) {
        this.f20510.m11757().add(i);
        return new C6040(this.f20509.mo9635(), this.f20511, C4129.m11753(i)).m16383(this, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16387(C21293 c21293) {
        this.f20509.mo9633(c21293);
        this.f20511.m40296(c21293);
    }
}
