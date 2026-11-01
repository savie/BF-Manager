package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C9369 extends C10336 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f31737;

    public C9369(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        this.f31737 = layoutInflaterFactory2C9161;
    }

    @Override // l.C10336, l.InterfaceC15616
    /* JADX INFO: renamed from: ۙ */
    public final void mo12847() {
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f31737;
        layoutInflaterFactory2C9161.f31181.setVisibility(0);
        if (layoutInflaterFactory2C9161.f31181.getParent() instanceof View) {
            C5031.m14002((View) layoutInflaterFactory2C9161.f31181.getParent());
        }
    }

    @Override // l.InterfaceC15616
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f31737;
        layoutInflaterFactory2C9161.f31181.setAlpha(1.0f);
        layoutInflaterFactory2C9161.f31169.m46326((InterfaceC15616) null);
        layoutInflaterFactory2C9161.f31169 = null;
    }
}
