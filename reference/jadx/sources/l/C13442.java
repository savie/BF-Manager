package l;

/* JADX INFO: renamed from: l.۫᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB9P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13442 extends AbstractC4493 {
    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final String mo18812() {
        return null;
    }

    public C13442(C9012 c9012) {
        super(c9012, C0063.f947);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8331() {
        return m43804() & 1;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final void mo8329(C15000 c15000) {
        if (mo8331() != 0) {
            c15000.m36123(AbstractC6951.m19237(0, 0));
        }
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo18813(C0063 c0063) {
        return new C13442(m43799());
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ܺ */
    public final String mo8330() {
        if (mo8331() == 0) {
            return null;
        }
        return "nop // spacer";
    }
}
