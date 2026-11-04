package l;

/* JADX INFO: renamed from: l.֨᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1420 extends AbstractC9781 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9622 f5007;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f5008;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420(AbstractActivityC17204 abstractActivityC17204, C9622 c9622, Runnable runnable) {
        super(abstractActivityC17204);
        this.f5007 = c9622;
        this.f5008 = runnable;
    }

    @Override // l.AbstractC9781
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo5156() {
        boolean z = false;
        String string = m25509(0).m54021().toString();
        String string2 = m25509(1).m54021().toString();
        AbstractC0148 abstractC0148 = m25514() >= 3 ? (AbstractC0148) m25509(2).getTag() : null;
        if (string2.length() > 1 && C0878.m3579(string2, "/", false)) {
            string2 = string2.substring(0, string2.length() - 1);
            C15243.m36591(string2, "substring(...)");
        }
        int length = string.length();
        C9622 c9622 = this.f5007;
        if (length > 0 && !string.equals(c9622.m25122())) {
            c9622.m25125(string);
            z = true;
        }
        if (string2.length() > 0 && !string2.equals(c9622.m25117())) {
            c9622.m25119(string2);
            z = true;
        }
        if (abstractC0148 != null) {
            C8877 c8877M25121 = c9622.m25121();
            C15243.m36586(c8877M25121);
            c9622.m25109(c8877M25121.m23753(abstractC0148));
            z = true;
        }
        if (z) {
            C22961.m51819();
            this.f5008.run();
        }
        return true;
    }
}
