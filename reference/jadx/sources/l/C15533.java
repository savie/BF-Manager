package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15533 extends AbstractC11026 {
    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo6053() {
        return true;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        boolean zM23622 = C9183.m23622();
        ApplicationC0716.f2988.edit().putBoolean("show_hidden_file", !zM23622).apply();
        if (!zM23622) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
        C21094.m47529((String) null);
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo6054() {
        return C9183.m23622();
    }
}
