package l;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: renamed from: l.ۚ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5913 extends AbstractC13006 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C5913 f20231 = new C5913(0);

    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo4064() {
        return m17156();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WindowLayoutComponent m17156() {
        ClassLoader classLoader = C2184.class.getClassLoader();
        if (classLoader != null && C2184.m7489(C2184.f7187, classLoader)) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
        return null;
    }
}
