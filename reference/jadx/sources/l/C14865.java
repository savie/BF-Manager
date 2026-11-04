package l;

/* JADX INFO: renamed from: l.ܰ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C14865 implements InterfaceC11379 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19341 f48590;

    public C14865(ViewOnClickListenerC19341 viewOnClickListenerC19341) {
        this.f48590 = viewOnClickListenerC19341;
    }

    @Override // l.InterfaceC11379
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28705() {
        ViewOnClickListenerC19341 viewOnClickListenerC19341 = this.f48590;
        return (viewOnClickListenerC19341.mo44756() || viewOnClickListenerC19341.f62500.f40509.m17206()) ? false : true;
    }

    @Override // l.InterfaceC11379
    /* JADX INFO: renamed from: ۙ */
    public final void mo28704(boolean z) {
        ViewOnClickListenerC19341 viewOnClickListenerC19341 = this.f48590;
        viewOnClickListenerC19341.f62492 = z;
        viewOnClickListenerC19341.f62463 = z;
        viewOnClickListenerC19341.f62478.setAlpha(z ? 1.0f : 0.3f);
    }
}
