package l;

/* JADX INFO: renamed from: l.֨᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1317 extends AbstractC19432 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22959 f5608;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f5609;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1317(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        super(true);
        this.f5609 = viewOnClickListenerC8374;
        this.f5608 = C22959.m50798();
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo4707() {
        if (this.f5608.m50803()) {
            return;
        }
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f5609;
        C22046 c22046 = viewOnClickListenerC8374.f29050;
        if (c22046 == null) {
            C13465.m32968("bottomSlideLayout");
            throw null;
        }
        if (!c22046.m48979()) {
            C8765 c8765 = viewOnClickListenerC8374.f29076;
            if (c8765 == null) {
                C13465.m32968("bottomDrawer");
                throw null;
            }
            if (c8765.m22815()) {
                return;
            }
            C22046 c22047 = viewOnClickListenerC8374.f29050;
            if (c22047 != null) {
                c22047.m48988();
                return;
            } else {
                C13465.m32968("bottomSlideLayout");
                throw null;
            }
        }
        viewOnClickListenerC8374.m21975();
    }
}
