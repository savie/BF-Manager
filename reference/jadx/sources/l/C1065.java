package l;

import android.widget.Spinner;

/* JADX INFO: renamed from: l.֨ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1065 implements InterfaceC5344 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f3819;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f3820;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f3821;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f3822;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24736 f3823;

    public C1065(Spinner spinner, Spinner spinner2, C1255 c1255, C1255 c1256, C24736 c24736) {
        this.f3822 = spinner;
        this.f3820 = spinner2;
        this.f3821 = c1255;
        this.f3819 = c1256;
        this.f3823 = c24736;
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10737 mo3997() {
        String strMo11753 = ((AbstractC14806) C16530.f53509.get(this.f3822.getSelectedItemPosition())).mo11753();
        EnumC6670 enumC6670 = EnumC6670.values()[this.f3820.getSelectedItemPosition()];
        C1255 c1255 = this.f3821;
        String str = c1255.isChecked() ? (String) c1255.getTag() : null;
        String str2 = (str == null || !str.isEmpty()) ? str : null;
        C1255 c1256 = this.f3819;
        return new C10737(strMo11753, enumC6670, str2, c1256 != null && c1256.isChecked());
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo3999() {
        return C24736.m55235(this.f3823);
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo4001() {
        return C24736.m55236(this.f3823);
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20774 mo4000() {
        return C24736.m55237(this.f3823);
    }

    @Override // l.InterfaceC5344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3998(Runnable runnable) {
        C24736.m55233(this.f3823, runnable);
    }
}
