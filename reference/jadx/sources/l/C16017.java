package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16017 implements InterfaceC3339 {
    @Override // l.InterfaceC3339
    /* JADX INFO: renamed from: ۙ */
    public void mo10992(C11147 c11147, C11147 c11148, Window window, View view, boolean z, boolean z2) {
        C15243.m36590(c11147, "statusBarStyle");
        C15243.m36590(c11148, "navigationBarStyle");
        C15243.m36590(window, "window");
        C15243.m36590(view, "view");
        C18190.m42352(window, false);
        window.setStatusBarColor(c11147.m28100(z));
        window.setNavigationBarColor(c11148.m28100(z2));
        C18893 c18893 = new C18893(window, view);
        c18893.m43816(!z);
        c18893.m43812(!z2);
    }
}
