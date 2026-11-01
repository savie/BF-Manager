package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6731 implements InterfaceC18020 {
    @Override // l.InterfaceC18020
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo18177(C4345 c4345, C4345 c4346, Window window, View view, boolean z, boolean z2) {
        C13465.m32966(c4345, "statusBarStyle");
        C13465.m32966(c4346, "navigationBarStyle");
        C13465.m32966(window, "window");
        C13465.m32966(view, "view");
        C16321.m38489(window, false);
        window.addFlags(67108864);
        window.addFlags(134217728);
    }
}
