package l;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes2.dex */
public final class C3908 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C6731 f14599;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f14600 = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f14598 = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m11364(AbstractActivityC12483 abstractActivityC12483) {
        C9555 c9555 = C9555.f32254;
        C4345 c4345 = new C4345(0, 0, c9555);
        C4345 c4346 = new C4345(f14600, f14598, c9555);
        View decorView = abstractActivityC12483.getWindow().getDecorView();
        C13465.m32967(decorView, "window.decorView");
        InterfaceC15456 interfaceC15456M12185 = c4345.m12185();
        Resources resources = decorView.getResources();
        C13465.m32967(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) interfaceC15456M12185.invoke(resources)).booleanValue();
        InterfaceC15456 interfaceC15456M12186 = c4346.m12185();
        Resources resources2 = decorView.getResources();
        C13465.m32967(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) interfaceC15456M12186.invoke(resources2)).booleanValue();
        C6731 c6731 = f14599;
        InterfaceC18020 c22960 = c6731;
        if (c6731 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                c22960 = new C21548();
            } else if (i >= 26) {
                c22960 = new C15199();
            } else if (i < 23) {
                C6731 c6732 = new C6731();
                f14599 = c6732;
                c22960 = c6732;
            } else {
                c22960 = new C22960();
            }
        }
        Window window = abstractActivityC12483.getWindow();
        C13465.m32967(window, "window");
        c22960.mo18177(c4345, c4346, window, decorView, zBooleanValue, zBooleanValue2);
    }
}
