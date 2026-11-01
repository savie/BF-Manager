package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes.dex */
public final class C22960 implements InterfaceC18020 {
    @Override // l.InterfaceC18020
    /* JADX INFO: renamed from: ۙ */
    public void mo18177(C4345 c4345, C4345 c4346, Window window, View view, boolean z, boolean z2) {
        C13465.m32966(c4345, "statusBarStyle");
        C13465.m32966(c4346, "navigationBarStyle");
        C13465.m32966(window, "window");
        C13465.m32966(view, "view");
        C16321.m38489(window, false);
        window.setStatusBarColor(c4345.m12184(z));
        window.setNavigationBarColor(c4346.m12183());
        new C5965(window, view).m16258(!z);
    }
}
