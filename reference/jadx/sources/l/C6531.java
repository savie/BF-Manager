package l;

/* JADX INFO: renamed from: l.ۜۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6531 extends AbstractC6738 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f21999;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6531(C20145 c20145) {
        super(c20145);
        this.f21999 = c20145;
    }

    @Override // l.AbstractC6738
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8150 mo17750(C8150 c8150) {
        if (!c8150.m21463() || c8150.m21462(EnumC18733.NON_STATIC)) {
            return c8150;
        }
        return C8150.m21460(new C4683(this.f21999, c8150.f28503, false));
    }

    @Override // l.AbstractC6738
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8150 mo17751(C8150 c8150, C8150 c8151) {
        boolean zM21463 = c8150.m21463();
        AbstractC23903 abstractC23903 = c8150.f28503;
        if (!zM21463 || !abstractC23903.mo22992() || (c8151.m21463() && !c8151.m21462(EnumC18733.STATIC))) {
            boolean zM21464 = c8151.m21463();
            AbstractC23903 abstractC23904 = c8151.f28503;
            if (!zM21464 || abstractC23904.mo22992() || (c8150.m21463() && !c8150.m21462(EnumC18733.NON_STATIC))) {
                boolean zM21465 = c8150.m21463();
                C20145 c20145 = this.f21999;
                if (zM21465 && c8151.m21463()) {
                    return C8150.m21460(c20145.m45548(abstractC23903, abstractC23904));
                }
                if (c8150.m21463() || c8151.m21463()) {
                    if (!c8150.m21463()) {
                        abstractC23903 = abstractC23904;
                    }
                    return C8150.m21460(new C4683(c20145, abstractC23903, true));
                }
                if (!c8150.m21461() || c8151.m21461()) {
                }
            }
            return c8151;
        }
        return c8150;
    }
}
