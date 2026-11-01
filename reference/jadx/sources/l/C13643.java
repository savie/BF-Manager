package l;

/* JADX INFO: renamed from: l.ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C13643 implements InterfaceC5092 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5175 f44999;

    public C13643(C5175 c5175) {
        this.f44999 = c5175;
    }

    @Override // l.InterfaceC5092
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3701(C12418 c12418) {
        C5175 c5175 = this.f44999;
        if (c12418 == c5175.f74749) {
            return false;
        }
        c5175.f17961 = ((SubMenuC7915) c12418).getItem().getItemId();
        InterfaceC5092 interfaceC5092M50863 = c5175.m50863();
        if (interfaceC5092M50863 != null) {
            return interfaceC5092M50863.mo3701(c12418);
        }
        return false;
    }

    @Override // l.InterfaceC5092
    public final void onCloseMenu(C12418 c12418, boolean z) {
        if (c12418 instanceof SubMenuC7915) {
            c12418.getRootMenu().close(false);
        }
        InterfaceC5092 interfaceC5092M50863 = this.f44999.m50863();
        if (interfaceC5092M50863 != null) {
            interfaceC5092M50863.onCloseMenu(c12418, z);
        }
    }
}
