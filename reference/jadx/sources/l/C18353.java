package l;

/* JADX INFO: renamed from: l.ᩳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18353 extends AbstractViewOnTouchListenerC9658 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16237 f58555;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12709 f58556;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18353(C12709 c12709, C12709 c127010, C16237 c16237) {
        super(c127010);
        this.f58556 = c12709;
        this.f58555 = c16237;
    }

    @Override // l.AbstractViewOnTouchListenerC9658
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6503 mo23973() {
        return this.f58555;
    }

    @Override // l.AbstractViewOnTouchListenerC9658
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo23975() {
        C12709 c12709 = this.f58556;
        if (c12709.m31554().isShowing()) {
            return true;
        }
        c12709.m31555();
        return true;
    }
}
