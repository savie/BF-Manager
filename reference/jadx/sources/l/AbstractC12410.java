package l;

/* JADX INFO: renamed from: l.ۨܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBCF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12410 extends AbstractC17631 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC14451 f39906;

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo6778(C10918 c10918);

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13418() {
        return 8;
    }

    /* JADX INFO: renamed from: ᩻ */
    public abstract String mo6779();

    public AbstractC12410(AbstractC14451 abstractC14451) {
        super(abstractC14451.m34884());
        this.f39906 = abstractC14451;
    }

    @Override // l.AbstractC17631, l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public void mo1455(C10918 c10918) {
        super.mo1455(c10918);
        c10918.m27714().m28068(this.f39906.m34885().getName());
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        C20067 c20067M27694 = c10918.m27694();
        C11116 c11116M27714 = c10918.m27714();
        AbstractC14451 abstractC14451 = this.f39906;
        C0282 c0282M34885 = abstractC14451.m34885();
        int iM46183 = c20067M27694.m46183(m41281());
        int iM28065 = c11116M27714.m28065(c0282M34885.getName());
        int iMo6778 = mo6778(c10918);
        if (c15000.m36116()) {
            c15000.m36111(0, m38318() + ' ' + abstractC14451.mo1843());
            c15000.m36111(2, "  class_idx: ".concat(C5306.m15934(iM46183)));
            c15000.m36111(2, String.format("  %-10s %s", mo6779().concat(":"), C5306.m15934(iMo6778)));
            c15000.m36111(4, "  name_idx:  ".concat(C5306.m15938(iM28065)));
        }
        c15000.m36123(iM46183);
        c15000.m36123(iMo6778);
        c15000.m36124(iM28065);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14451 m30882() {
        return this.f39906;
    }
}
