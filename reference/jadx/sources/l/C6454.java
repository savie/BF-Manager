package l;

import android.view.Window;

/* JADX INFO: renamed from: l.ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C6454 implements InterfaceC12772 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f21701;

    public C6454(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        this.f21701 = layoutInflaterFactory2C24354;
    }

    @Override // l.InterfaceC12772
    public final void onCloseMenu(C9898 c9898, boolean z) {
        C9898 rootMenu = c9898.getRootMenu();
        boolean z2 = rootMenu != c9898;
        if (z2) {
            c9898 = rootMenu;
        }
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f21701;
        C12419 c12419M54424 = layoutInflaterFactory2C24354.m54424(c9898);
        if (c12419M54424 != null) {
            if (z2) {
                layoutInflaterFactory2C24354.m54413(c12419M54424.f39933, c12419M54424, rootMenu);
                layoutInflaterFactory2C24354.m54415(c12419M54424, true);
            } else {
                layoutInflaterFactory2C24354.m54415(c12419M54424, z);
            }
        }
    }

    @Override // l.InterfaceC12772
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6418(C9898 c9898) {
        Window.Callback callback;
        if (c9898 != c9898.getRootMenu()) {
            return true;
        }
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f21701;
        if (!layoutInflaterFactory2C24354.f79014 || (callback = layoutInflaterFactory2C24354.f79006.getCallback()) == null || layoutInflaterFactory2C24354.f79019) {
            return true;
        }
        callback.onMenuOpened(108, c9898);
        return true;
    }
}
