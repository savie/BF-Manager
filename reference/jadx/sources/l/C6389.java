package l;

import android.widget.Spinner;

/* JADX INFO: renamed from: l.ۛ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6389 implements InterfaceC1179 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6824 f21696;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f21697;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f21698;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f21699;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f21700;

    public C6389(Spinner spinner, Spinner spinner2, C12562 c12562, C12562 c12563, C6824 c6824) {
        this.f21700 = spinner;
        this.f21699 = spinner2;
        this.f21698 = c12562;
        this.f21697 = c12563;
        this.f21696 = c6824;
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۙ */
    public final C11392 mo4314() {
        String strMo1456 = ((AbstractC17131) C23053.f74904.get(this.f21700.getSelectedItemPosition())).mo1456();
        EnumC7501 enumC7501 = EnumC7501.values()[this.f21699.getSelectedItemPosition()];
        C12562 c12562 = this.f21698;
        String str = c12562.isChecked() ? (String) c12562.getTag() : null;
        String str2 = (str == null || !str.isEmpty()) ? str : null;
        C12562 c12563 = this.f21697;
        return new C11392(strMo1456, enumC7501, str2, c12563 != null && c12563.isChecked());
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4317() {
        return C6824.m18428(this.f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo4313() {
        return C6824.m18430(this.f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۚ */
    public final C15721 mo4316() {
        return C6824.m18431(this.f21696);
    }

    @Override // l.InterfaceC1179
    /* JADX INFO: renamed from: ۙ */
    public final void mo4315(Runnable runnable) {
        C6824.m18427(this.f21696, runnable);
    }
}
