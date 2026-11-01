package l;

/* JADX INFO: renamed from: l.ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6337 implements InterfaceC5092 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f21390;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14805 f21391;

    public C6337(C14805 c14805) {
        this.f21391 = c14805;
    }

    @Override // l.InterfaceC5092
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3701(C12418 c12418) {
        this.f21391.f48405.onMenuOpened(108, c12418);
        return true;
    }

    @Override // l.InterfaceC5092
    public final void onCloseMenu(C12418 c12418, boolean z) {
        if (this.f21390) {
            return;
        }
        this.f21390 = true;
        C14805 c14805 = this.f21391;
        c14805.f48402.mo44632();
        c14805.f48405.onPanelClosed(108, c12418);
        this.f21390 = false;
    }
}
