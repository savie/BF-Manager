package l;

/* JADX INFO: renamed from: l.᩺ۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C22760 extends AbstractC6738 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f74140;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22760(C20145 c20145) {
        super(c20145);
        this.f74140 = c20145;
    }

    @Override // l.AbstractC6738
    /* JADX INFO: renamed from: ۙ */
    public final C8150 mo17750(C8150 c8150) {
        if (!c8150.m21463() || !c8150.m21462(EnumC18733.STATIC)) {
            return c8150;
        }
        return C8150.m21460(new C4683(this.f74140, c8150.f28503, false));
    }

    @Override // l.AbstractC6738
    /* JADX INFO: renamed from: ۙ */
    public final C8150 mo17751(C8150 c8150, C8150 c8151) {
        if (!c8150.m21463() || c8150.m21462(EnumC18733.NON_STATIC)) {
            if (!c8151.m21463() || c8151.m21462(EnumC18733.STATIC)) {
                if (c8150.m21463() || c8151.m21463()) {
                    return C8150.m21460(new C4683(this.f74140, c8150.m21463() ? c8150.f28503 : c8151.f28503, true));
                }
                if (!c8150.m21461() || c8151.m21461()) {
                }
            }
            return c8151;
        }
        return c8150;
    }
}
