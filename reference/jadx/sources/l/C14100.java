package l;

import android.view.Window;

/* JADX INFO: renamed from: l.ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C14100 implements InterfaceC5092 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f46334;

    public C14100(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        this.f46334 = layoutInflaterFactory2C9161;
    }

    @Override // l.InterfaceC5092
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3701(C12418 c12418) {
        Window.Callback callback = this.f46334.f31196.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, c12418);
        return true;
    }

    @Override // l.InterfaceC5092
    public final void onCloseMenu(C12418 c12418, boolean z) {
        this.f46334.m23553(c12418);
    }
}
