package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C4962 extends C5596 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f17281;

    public C4962(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        this.f17281 = layoutInflaterFactory2C24354;
    }

    @Override // l.C5596, l.InterfaceC4020
    /* JADX INFO: renamed from: ۙ */
    public final void mo12073() {
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f17281;
        layoutInflaterFactory2C24354.f78980.setVisibility(0);
        if (layoutInflaterFactory2C24354.f78980.getParent() instanceof View) {
            C22666.m51079((View) layoutInflaterFactory2C24354.f78980.getParent());
        }
    }

    @Override // l.InterfaceC4020
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f17281;
        layoutInflaterFactory2C24354.f78980.setAlpha(1.0f);
        layoutInflaterFactory2C24354.f78984.m54123((InterfaceC4020) null);
        layoutInflaterFactory2C24354.f78984 = null;
    }
}
