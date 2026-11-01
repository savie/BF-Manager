package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ANL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1929 extends AbstractC19432 implements InterfaceC13780 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC3340 f7304;

    @Override // l.InterfaceC13780
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6262(View view) {
        C13465.m32966(view, "panel");
    }

    @Override // l.InterfaceC13780
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo6263(View view) {
        C13465.m32966(view, "panel");
        m44475(false);
    }

    @Override // l.InterfaceC13780
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo6264(View view) {
        C13465.m32966(view, "panel");
        m44475(true);
    }

    public C1929(AbstractC3340 abstractC3340) {
        super(true);
        this.f7304 = abstractC3340;
        ((C22246) abstractC3340.requireView()).m49390(this);
    }

    @Override // l.AbstractC19432
    /* JADX INFO: renamed from: ܰ */
    public final void mo4707() {
        ((C22246) this.f7304.requireView()).m49387();
    }
}
