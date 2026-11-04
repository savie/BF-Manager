package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10862 extends C5596 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13100 f34403;

    public C10862(C13100 c13100) {
        this.f34403 = c13100;
    }

    @Override // l.InterfaceC4020
    public final void onAnimationEnd() {
        View view;
        C13100 c13100 = this.f34403;
        if (c13100.f41866 && (view = c13100.f41880) != null) {
            view.setTranslationY(0.0f);
            c13100.f41879.setTranslationY(0.0f);
        }
        c13100.f41879.setVisibility(8);
        c13100.f41879.m47954(false);
        c13100.f41864 = null;
        InterfaceC19067 interfaceC19067 = c13100.f41883;
        if (interfaceC19067 != null) {
            ((C15402) interfaceC19067).mo23249(c13100.f41867);
            c13100.f41867 = null;
            c13100.f41883 = null;
        }
        C2332 c2332 = c13100.f41865;
        if (c2332 != null) {
            C22666.m51079(c2332);
        }
    }
}
