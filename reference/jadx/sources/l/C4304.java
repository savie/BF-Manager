package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4304 extends C10336 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5010 f15476;

    public C4304(C5010 c5010) {
        this.f15476 = c5010;
    }

    @Override // l.InterfaceC15616
    public final void onAnimationEnd() {
        View view;
        C5010 c5010 = this.f15476;
        if (c5010.f17438 && (view = c5010.f17429) != null) {
            view.setTranslationY(0.0f);
            c5010.f17440.setTranslationY(0.0f);
        }
        c5010.f17440.setVisibility(8);
        c5010.f17440.m46480(false);
        c5010.f17439 = null;
        InterfaceC16300 interfaceC16300 = c5010.f17450;
        if (interfaceC16300 != null) {
            ((C2809) interfaceC16300).mo8540(c5010.f17433);
            c5010.f17433 = null;
            c5010.f17450 = null;
        }
        C10738 c10738 = c5010.f17437;
        if (c10738 != null) {
            C5031.m14002(c10738);
        }
    }
}
