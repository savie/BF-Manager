package l;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes.dex */
public final class C24969 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C16763 f80859;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f80860 = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f80858 = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m55775(AbstractActivityC17204 abstractActivityC17204) {
        C5182 c5182 = C5182.f18087;
        C11147 c11147 = new C11147(0, 0, c5182);
        C11147 c11148 = new C11147(f80860, f80858, c5182);
        View decorView = abstractActivityC17204.getWindow().getDecorView();
        C15243.m36591(decorView, "window.decorView");
        InterfaceC3071 interfaceC3071M28101 = c11147.m28101();
        Resources resources = decorView.getResources();
        C15243.m36591(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) interfaceC3071M28101.invoke(resources)).booleanValue();
        InterfaceC3071 interfaceC3071M28102 = c11148.m28101();
        Resources resources2 = decorView.getResources();
        C15243.m36591(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) interfaceC3071M28102.invoke(resources2)).booleanValue();
        C16763 c16763 = f80859;
        InterfaceC3339 c17509 = c16763;
        if (c16763 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                c17509 = new C23477();
            } else if (i >= 26) {
                c17509 = new C16017();
            } else if (i < 23) {
                C16763 c16764 = new C16763();
                f80859 = c16764;
                c17509 = c16764;
            } else {
                c17509 = new C17509();
            }
        }
        Window window = abstractActivityC17204.getWindow();
        C15243.m36591(window, "window");
        c17509.mo10992(c11147, c11148, window, decorView, zBooleanValue, zBooleanValue2);
    }
}
