package l;

/* JADX INFO: renamed from: l.᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes.dex */
public final class C22753 implements InterfaceC12772 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13056 f73827;

    public C22753(C13056 c13056) {
        this.f73827 = c13056;
    }

    @Override // l.InterfaceC12772
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6418(C9898 c9898) {
        C13056 c13056 = this.f73827;
        if (c9898 == c13056.f56497) {
            return false;
        }
        c13056.f41791 = ((SubMenuC12026) c9898).getItem().getItemId();
        InterfaceC12772 interfaceC12772M40780 = c13056.m40780();
        if (interfaceC12772M40780 != null) {
            return interfaceC12772M40780.mo6418(c9898);
        }
        return false;
    }

    @Override // l.InterfaceC12772
    public final void onCloseMenu(C9898 c9898, boolean z) {
        if (c9898 instanceof SubMenuC12026) {
            c9898.getRootMenu().close(false);
        }
        InterfaceC12772 interfaceC12772M40780 = this.f73827.m40780();
        if (interfaceC12772M40780 != null) {
            interfaceC12772M40780.onCloseMenu(c9898, z);
        }
    }
}
