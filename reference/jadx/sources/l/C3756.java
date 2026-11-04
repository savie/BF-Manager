package l;

/* JADX INFO: renamed from: l.ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3756 extends AbstractViewOnTouchListenerC5028 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10467 f12874;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18672 f12875;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3756(C10467 c10467, C10467 c10468, C18672 c18672) {
        super(c10468);
        this.f12874 = c10467;
        this.f12875 = c18672;
    }

    @Override // l.AbstractViewOnTouchListenerC5028
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16501 mo12194() {
        return this.f12875;
    }

    @Override // l.AbstractViewOnTouchListenerC5028
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo12195() {
        C10467 c10467 = this.f12874;
        if (c10467.m26891().isShowing()) {
            return true;
        }
        c10467.m26892();
        return true;
    }
}
