package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C11983 extends C10336 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2809 f40130;

    public C11983(C2809 c2809) {
        this.f40130 = c2809;
    }

    @Override // l.InterfaceC15616
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f40130.f10679;
        layoutInflaterFactory2C9161.f31181.setVisibility(8);
        PopupWindow popupWindow = layoutInflaterFactory2C9161.f31162;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (layoutInflaterFactory2C9161.f31181.getParent() instanceof View) {
            C5031.m14002((View) layoutInflaterFactory2C9161.f31181.getParent());
        }
        layoutInflaterFactory2C9161.f31181.m45195();
        layoutInflaterFactory2C9161.f31169.m46326((InterfaceC15616) null);
        layoutInflaterFactory2C9161.f31169 = null;
        C5031.m14002(layoutInflaterFactory2C9161.f31198);
    }
}
