package l;

import android.text.Selection;

/* JADX INFO: renamed from: l.ۛܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB2D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6152 implements InterfaceC2874 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11092 f21008;

    public C6152(C11092 c11092) {
        this.f21008 = c11092;
    }

    @Override // l.InterfaceC2874
    /* JADX INFO: renamed from: ۙ */
    public final void mo8654(C8872 c8872) {
        C11092 c11092 = this.f21008;
        c11092.getClass();
        if (c8872.m23016() >= 0 && c8872.m23014() >= 0) {
            c11092.setSelection(c8872.m23016(), c8872.m23014());
            return;
        }
        if (c8872.m23016() < 0) {
            c11092.removeSpan(Selection.SELECTION_START);
        } else {
            c11092.setSpan(Selection.SELECTION_START, Math.min(c8872.m23016(), c11092.length()), Math.min(c8872.m23016(), c11092.length()), 34);
        }
        if (c8872.m23014() < 0) {
            c11092.removeSpan(Selection.SELECTION_END);
        } else {
            c11092.setSpan(Selection.SELECTION_END, Math.min(c8872.m23014(), c11092.length()), Math.min(c8872.m23014(), c11092.length()), 34);
        }
    }

    @Override // l.InterfaceC2874
    /* JADX INFO: renamed from: ۙ */
    public final void mo8655(C13935 c13935, int i, int i2, C17565 c17565) {
        this.f21008.m27982(i, i2, c17565, 0, c17565.length(), c13935);
    }
}
