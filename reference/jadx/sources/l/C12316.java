package l;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12316 extends C17254 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WindowInsetsController f41146;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Window f41147;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21631 f41148;

    public C12316(WindowInsetsController windowInsetsController, C21631 c21631) {
        new C12274();
        this.f41146 = windowInsetsController;
        this.f41148 = c21631;
    }

    public C12316(Window window, C21631 c21631) {
        this(window.getInsetsController(), c21631);
        this.f41147 = window;
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo30576(int i) {
        if ((i & 8) != 0) {
            this.f41148.m48346();
        }
        this.f41146.show(i & (-9));
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30574(int i) {
        if ((i & 8) != 0) {
            this.f41148.m48345();
        }
        this.f41146.hide(i & (-9));
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1963() {
        this.f41146.setSystemBarsAppearance(0, 0);
        return (this.f41146.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ܰ */
    public final void mo1964(boolean z) {
        Window window = this.f41147;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f41146.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f41146.setSystemBarsAppearance(0, 8);
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30575(boolean z) {
        Window window = this.f41147;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f41146.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f41146.setSystemBarsAppearance(0, 16);
    }

    @Override // l.C17254
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo30577(int i) {
        this.f41146.setSystemBarsBehavior(i);
    }
}
