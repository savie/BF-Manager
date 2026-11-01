package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21548 implements InterfaceC18020 {
    @Override // l.InterfaceC18020
    /* JADX INFO: renamed from: ۙ */
    public void mo18177(C4345 c4345, C4345 c4346, Window window, View view, boolean z, boolean z2) {
        C13465.m32966(c4345, "statusBarStyle");
        C13465.m32966(c4346, "navigationBarStyle");
        C13465.m32966(window, "window");
        C13465.m32966(view, "view");
        C16321.m38489(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        C5965 c5965 = new C5965(window, view);
        c5965.m16258(!z);
        c5965.m16254(true ^ z2);
    }
}
