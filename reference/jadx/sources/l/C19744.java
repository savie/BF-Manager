package l;

import android.view.Window;

/* JADX INFO: renamed from: l.᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C19744 implements InterfaceC5092 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f63445;

    public C19744(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        this.f63445 = layoutInflaterFactory2C9161;
    }

    @Override // l.InterfaceC5092
    public final void onCloseMenu(C12418 c12418, boolean z) {
        C12418 rootMenu = c12418.getRootMenu();
        boolean z2 = rootMenu != c12418;
        if (z2) {
            c12418 = rootMenu;
        }
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f63445;
        C8455 c8455M23565 = layoutInflaterFactory2C9161.m23565(c12418);
        if (c8455M23565 != null) {
            if (z2) {
                layoutInflaterFactory2C9161.m23546(c8455M23565.f29336, c8455M23565, rootMenu);
                layoutInflaterFactory2C9161.m23552(c8455M23565, true);
            } else {
                layoutInflaterFactory2C9161.m23552(c8455M23565, z);
            }
        }
    }

    @Override // l.InterfaceC5092
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3701(C12418 c12418) {
        Window.Callback callback;
        if (c12418 != c12418.getRootMenu()) {
            return true;
        }
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f63445;
        if (!layoutInflaterFactory2C9161.f31151 || (callback = layoutInflaterFactory2C9161.f31196.getCallback()) == null || layoutInflaterFactory2C9161.f31170) {
            return true;
        }
        callback.onMenuOpened(108, c12418);
        return true;
    }
}
