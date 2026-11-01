package l;

/* JADX INFO: renamed from: l.᩻᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAKC */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23941 extends AbstractC17902 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77530 = 0;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final DialogInterfaceC19356 mo2981(AbstractActivityC12483 abstractActivityC12483) {
        final C1777 c1777 = new C1777(abstractActivityC12483);
        c1777.mo5828(new RunnableC7448(4, this));
        if (mo12168()) {
            c1777.mo5827(new ViewOnClickListenerC22734(3, c1777));
        } else {
            m41556(abstractActivityC12483);
        }
        m41568().m44959(c1777.m5834(), new InterfaceC10597() { // from class: l.ۧ᩷ۜ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                AbstractC23941.m52775(this.f38030, c1777);
            }
        });
        c1777.mo5843();
        return c1777.m5834();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52775(AbstractC23941 abstractC23941, C1777 c1777) {
        if (abstractC23941.m41582()) {
            c1777.m5841(abstractC23941.m41586());
        }
        if (abstractC23941.m41589()) {
            c1777.m5832(abstractC23941.m41576());
        }
        c1777.m5840(abstractC23941.m41564());
    }
}
