package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes.dex */
public final class C23729 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11672 f76785;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23729(C11672 c11672) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f76785 = c11672;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        boolean zM28762 = c11545.m28762();
        ApplicationC0716.f2992.edit().putString(zM28762 ? "home_path_left" : "home_path_right", this.f76785.m28629()).apply();
        ApplicationC0716.f2988.edit().putString(zM28762 ? "load_path_left" : "load_path_right", "0").apply();
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo6292() {
        return !this.f76785.mo28638();
    }
}
