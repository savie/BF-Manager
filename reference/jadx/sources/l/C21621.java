package l;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: renamed from: l.᩸ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21621 extends AbstractC11348 implements InterfaceC4871 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C21621 f70127 = new C21621(0);

    @Override // l.InterfaceC4871
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo3788() {
        return m48336();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static WindowLayoutComponent m48336() {
        ClassLoader classLoader = C18093.class.getClassLoader();
        if (classLoader != null && C18093.m42081(C18093.f57858, classLoader)) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
        return null;
    }
}
