package l;

/* JADX INFO: renamed from: l.ܶ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14906 extends C20466 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f48682;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7850 f48683;

    public C14906(AbstractC2120 abstractC2120, int i, AbstractC11729 abstractC11729) {
        super(abstractC2120, i, abstractC11729, C21606.f70083);
        this.f48682 = false;
        this.f48683 = null;
    }

    public C14906(C14906 c14906, AbstractC2120 abstractC2120) {
        super(c14906, abstractC2120, c14906.f66408, c14906.f66404);
        this.f48683 = c14906.f48683;
        this.f48682 = m35652(c14906, abstractC2120);
    }

    public C14906(C14906 c14906, AbstractC2120 abstractC2120, C7850 c7850) {
        super(c14906, abstractC2120, c14906.f66408, c14906.f66404);
        this.f48683 = c7850;
        this.f48682 = m35652(c14906, abstractC2120);
    }

    public C14906(C14906 c14906, AbstractC2120 abstractC2120, AbstractC11729 abstractC11729) {
        super(c14906, abstractC2120, abstractC11729, c14906.f66404);
        this.f48683 = c14906.f48683;
        this.f48682 = m35652(c14906, abstractC2120);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7850 m35653() {
        return this.f48683;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m35655() {
        return this.f48682;
    }

    @Override // l.C20466
    public final int hashCode() {
        return C4758.m13213(C4758.m13214(C4758.m13217(C4758.m13214(C4758.m13214(C4758.m13217(C4758.m13217(7, this.f66406.f7775), this.f66405), this.f66408), this.f66404), this.f48682 ? 1 : 0), this.f48683), 6);
    }

    @Override // l.C20466
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo35654(C20466 c20466) {
        boolean zEquals = true;
        if (this == c20466) {
            return true;
        }
        if (!(c20466 instanceof C14906)) {
            return false;
        }
        C14906 c14906 = (C14906) c20466;
        if (this.f48682 != c14906.f48682) {
            return false;
        }
        C7850 c7850 = c14906.f48683;
        C7850 c7851 = this.f48683;
        if (c7851 != null) {
            zEquals = c7851.equals(c7850);
        } else if (c7850 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.mo35654(c20466);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35652(C14906 c14906, AbstractC2120 abstractC2120) {
        if (c14906.f48682) {
            return true;
        }
        return (abstractC2120 instanceof AbstractC12789) && ((AbstractC12789) abstractC2120).f42610;
    }
}
