package l;

/* JADX INFO: renamed from: l.ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C9435 implements InterfaceC12772 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30610;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7199 f30611;

    public C9435(C7199 c7199) {
        this.f30611 = c7199;
    }

    @Override // l.InterfaceC12772
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6418(C9898 c9898) {
        this.f30611.f23768.onMenuOpened(108, c9898);
        return true;
    }

    @Override // l.InterfaceC12772
    public final void onCloseMenu(C9898 c9898, boolean z) {
        if (this.f30610) {
            return;
        }
        this.f30610 = true;
        C7199 c7199 = this.f30611;
        c7199.f23767.mo18342();
        c7199.f23768.onPanelClosed(108, c9898);
        this.f30610 = false;
    }
}
