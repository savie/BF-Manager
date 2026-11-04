package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C19878 extends C5596 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15402 f63949;

    public C19878(C15402 c15402) {
        this.f63949 = c15402;
    }

    @Override // l.InterfaceC4020
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f63949.f50215;
        layoutInflaterFactory2C24354.f78980.setVisibility(8);
        PopupWindow popupWindow = layoutInflaterFactory2C24354.f78999;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (layoutInflaterFactory2C24354.f78980.getParent() instanceof View) {
            C22666.m51079((View) layoutInflaterFactory2C24354.f78980.getParent());
        }
        layoutInflaterFactory2C24354.f78980.m1190();
        layoutInflaterFactory2C24354.f78984.m54123((InterfaceC4020) null);
        layoutInflaterFactory2C24354.f78984 = null;
        C22666.m51079(layoutInflaterFactory2C24354.f79012);
    }
}
