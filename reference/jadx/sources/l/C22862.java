package l;

import android.view.Window;

/* JADX INFO: renamed from: l.᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22862 implements InterfaceC12772 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f74300;

    public C22862(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        this.f74300 = layoutInflaterFactory2C24354;
    }

    @Override // l.InterfaceC12772
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6418(C9898 c9898) {
        Window.Callback callback = this.f74300.f79006.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, c9898);
        return true;
    }

    @Override // l.InterfaceC12772
    public final void onCloseMenu(C9898 c9898, boolean z) {
        this.f74300.m54414(c9898);
    }
}
