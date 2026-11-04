package l;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.view.View;

/* JADX INFO: renamed from: l.ۡۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C9123 implements InterfaceC15395 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2119 f29616;

    public C9123(C2119 c2119) {
        this.f29616 = c2119;
    }

    @Override // l.InterfaceC15395
    /* JADX INFO: renamed from: ۙ */
    public final void mo3725(C20312 c20312, InterfaceC16648 interfaceC16648, C1512 c1512) {
        PackageManager packageManagerM49081 = C21576.m49081();
        ComponentName componentNameMo39358 = interfaceC16648.mo39358();
        if (componentNameMo39358.equals(C2119.m7305(packageManagerM49081))) {
            ApplicationC17729.f58258.edit().remove("dsai").apply();
        } else {
            ApplicationC17729.f58258.edit().putString("dsai", componentNameMo39358.flattenToString()).apply();
        }
        this.f29616.mo7306();
    }

    @Override // l.InterfaceC15395
    /* JADX INFO: renamed from: ۙ */
    public final void mo3724(View view, C20312 c20312, InterfaceC16648 interfaceC16648, C1512 c1512) {
        c20312.m46657(interfaceC16648);
    }
}
