package l;

/* JADX INFO: renamed from: l.ۙۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4788 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f16785;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24720 f16786;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4788(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        super(true);
        this.f16785 = viewOnClickListenerC11499;
        this.f16786 = C24720.m55198();
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        if (this.f16786.m55200()) {
            return;
        }
        ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f16785;
        C7198 c7198 = viewOnClickListenerC11499.f36176;
        if (c7198 == null) {
            C15243.m36592("bottomSlideLayout");
            throw null;
        }
        if (!c7198.m19781()) {
            C16468 c16468 = viewOnClickListenerC11499.f36185;
            if (c16468 == null) {
                C15243.m36592("bottomDrawer");
                throw null;
            }
            if (c16468.m39057()) {
                return;
            }
            C7198 c7199 = viewOnClickListenerC11499.f36176;
            if (c7199 != null) {
                c7199.m19780();
                return;
            } else {
                C15243.m36592("bottomSlideLayout");
                throw null;
            }
        }
        viewOnClickListenerC11499.m28955();
    }
}
