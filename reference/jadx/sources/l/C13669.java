package l;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.view.View;

/* JADX INFO: renamed from: l.ܰ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C13669 implements InterfaceC15080 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21696 f45088;

    public C13669(C21696 c21696) {
        this.f45088 = c21696;
    }

    @Override // l.InterfaceC15080
    /* JADX INFO: renamed from: ۙ */
    public final void mo9566(C23630 c23630, InterfaceC23898 interfaceC23898, C6695 c6695) {
        PackageManager packageManagerM39292 = C16737.m39292();
        ComponentName componentNameMo16277 = interfaceC23898.mo16277();
        if (componentNameMo16277.equals(C21696.m48444(packageManagerM39292))) {
            ApplicationC0716.f2992.edit().remove("dsai").apply();
        } else {
            ApplicationC0716.f2992.edit().putString("dsai", componentNameMo16277.flattenToString()).apply();
        }
        this.f45088.mo8453();
    }

    @Override // l.InterfaceC15080
    /* JADX INFO: renamed from: ۙ */
    public final void mo9565(View view, C23630 c23630, InterfaceC23898 interfaceC23898, C6695 c6695) {
        c23630.m52099(interfaceC23898);
    }
}
