package l;

/* JADX INFO: renamed from: l.۫۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBAF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12432 extends AbstractC21603 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f41485;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C16665 f41486;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41487;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f41488;

    /* JADX INFO: renamed from: ۜ */
    public abstract String mo6991();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo6992(C4669 c4669, C2718 c2718);

    /* JADX INFO: renamed from: ܰ */
    public void mo19042(C16665 c16665, int i) {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC12432 abstractC12432 = (AbstractC12432) obj;
        if (this == abstractC12432) {
            return 0;
        }
        EnumC18075 enumC18075Mo4170 = mo4170();
        EnumC18075 enumC18075Mo4171 = abstractC12432.mo4170();
        if (enumC18075Mo4170 != enumC18075Mo4171) {
            return enumC18075Mo4170.compareTo(enumC18075Mo4171);
        }
        return mo6990(abstractC12432);
    }

    public AbstractC12432(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f41488 = i;
        this.f41487 = i2;
        this.f41486 = null;
        this.f41485 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC12432 abstractC12432 = (AbstractC12432) obj;
        return mo4170() == abstractC12432.mo4170() && mo6990(abstractC12432) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30903(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f41487 >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f41487 = i;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ */
    public final int mo9739() {
        int i = this.f41487;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        c2718.m8282(this.f41488);
        try {
            if (this.f41487 < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            c2718.m8295(m30904());
            mo6992(c4669, c2718);
        } catch (RuntimeException e) {
            throw C7513.m20020("...while writing " + this, e);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m30904() {
        int i = this.f41485;
        if (i < 0) {
            throw new RuntimeException("offset not yet known");
        }
        return this.f41486.m52245(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30902(C16665 c16665, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f41486 != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f41488 - 1;
        int i3 = (i + i2) & (~i2);
        this.f41486 = c16665;
        this.f41485 = i3;
        mo19042(c16665, i3);
        return i3;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m30900() {
        return this.f41488;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m30901() {
        return "[" + Integer.toHexString(m30904()) + ']';
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo6990(AbstractC12432 abstractC12432) {
        throw new UnsupportedOperationException("unsupported");
    }
}
