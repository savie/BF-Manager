package l;

/* JADX INFO: renamed from: l.ܺۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: YAKC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16610 extends AbstractC18900 {

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53718 = 0;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final DialogInterfaceC8327 mo4862(AbstractActivityC17204 abstractActivityC17204) {
        final C10745 c10745 = new C10745(abstractActivityC17204);
        c10745.mo25916(new RunnableC2068(2, this));
        if (mo2535()) {
            c10745.mo25915(new ViewOnClickListenerC3673(6, c10745));
        } else {
            m43836(abstractActivityC17204);
        }
        m43851().m40350(c10745.m27401(), new InterfaceC16438() { // from class: l.᩻ۙ᩻
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                AbstractC16610.m39299(this.f80295, c10745);
            }
        });
        c10745.mo25931();
        return c10745.m27401();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39299(AbstractC16610 abstractC16610, C10745 c10745) {
        if (abstractC16610.m43852()) {
            c10745.m27404(abstractC16610.m43866());
        }
        if (abstractC16610.m43832()) {
            c10745.m27393(abstractC16610.m43839());
        }
        c10745.m27403(abstractC16610.m43849());
    }
}
