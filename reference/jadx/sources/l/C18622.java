package l;

/* JADX INFO: renamed from: l.ܿ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NIUZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18622 implements InterfaceC4452 {
    @Override // l.InterfaceC4452
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7322(C2551 c2551, InterfaceC18213 interfaceC18213) {
        int iM47063;
        if (!(interfaceC18213 instanceof C9067)) {
            return false;
        }
        C9067 c9067 = (C9067) interfaceC18213;
        if (c9067.m24200() == null || !C20531.m47076(c9067.m24203())) {
            return false;
        }
        if (!C8314.m22411(C20531.m47082(c9067.m24203()), EnumC24203.THROW) && c2551.m8534() && (iM47063 = C20531.m47063(c9067.m24203())) < 5) {
            int iM47064 = C20531.m47063(c9067.m24200());
            int i = c9067.m24200().mo17865(EnumC1763.ELSE_IF_CHAIN) ? 4 : 2;
            if (iM47063 == iM47064) {
                return false;
            }
            if (iM47063 * i > iM47064 && iM47063 < iM47064 * i) {
                return false;
            }
        }
        InterfaceC18213 parent = c9067.getParent();
        C12050 c12050 = new C12050(parent);
        if (!parent.mo19029(c9067, c12050)) {
            return false;
        }
        c12050.m30228((InterfaceC6281) c9067);
        c12050.m30228(c9067.m24200());
        c9067.m24199((C12050) null);
        return true;
    }
}
