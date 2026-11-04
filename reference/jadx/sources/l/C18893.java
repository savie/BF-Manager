package l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18893 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7706 f61310;

    @Deprecated
    public C18893(WindowInsetsController windowInsetsController) {
        this.f61310 = new C0248(windowInsetsController, new C15777(windowInsetsController));
    }

    public C18893(Window window, View view) {
        C15777 c15777 = new C15777(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f61310 = new C0248(window, c15777);
            return;
        }
        if (i >= 26) {
            this.f61310 = new C18147(window, c15777);
        } else if (i >= 23) {
            this.f61310 = new C21131(window, c15777);
        } else {
            this.f61310 = new C14417(window, c15777);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18893 m43810(WindowInsetsController windowInsetsController) {
        return new C18893(windowInsetsController);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43814(int i) {
        this.f61310.mo1731(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43811(int i) {
        this.f61310.mo1728(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43813() {
        return this.f61310.mo1730();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43816(boolean z) {
        this.f61310.mo1733(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43812(boolean z) {
        this.f61310.mo1729(z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43815(int i) {
        this.f61310.mo1732(i);
    }
}
