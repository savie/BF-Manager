package l;

import android.text.Selection;

/* JADX INFO: renamed from: l.۬᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: CB2D */
/* JADX INFO: loaded from: classes4.dex */
public final class C14104 implements InterfaceC19678 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5068 f44614;

    public C14104(C5068 c5068) {
        this.f44614 = c5068;
    }

    @Override // l.InterfaceC19678
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34258(C21498 c21498) {
        C5068 c5068 = this.f44614;
        c5068.getClass();
        if (c21498.m48908() >= 0 && c21498.m48906() >= 0) {
            c5068.setSelection(c21498.m48908(), c21498.m48906());
            return;
        }
        if (c21498.m48908() < 0) {
            c5068.removeSpan(Selection.SELECTION_START);
        } else {
            c5068.setSpan(Selection.SELECTION_START, Math.min(c21498.m48908(), c5068.length()), Math.min(c21498.m48908(), c5068.length()), 34);
        }
        if (c21498.m48906() < 0) {
            c5068.removeSpan(Selection.SELECTION_END);
        } else {
            c5068.setSpan(Selection.SELECTION_END, Math.min(c21498.m48906(), c5068.length()), Math.min(c21498.m48906(), c5068.length()), 34);
        }
    }

    @Override // l.InterfaceC19678
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34257(C12965 c12965, int i, int i2, C8796 c8796) {
        this.f44614.m15330(i, i2, c8796, 0, c8796.length(), c12965);
    }
}
