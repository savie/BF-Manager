package l;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes3.dex */
public final class C0248 extends C7706 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WindowInsetsController f1516;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Window f1517;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15777 f1518;

    public C0248(WindowInsetsController windowInsetsController, C15777 c15777) {
        new C9086();
        this.f1516 = windowInsetsController;
        this.f1518 = c15777;
    }

    public C0248(Window window, C15777 c15777) {
        this(window.getInsetsController(), c15777);
        this.f1517 = window;
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo1731(int i) {
        if ((i & 8) != 0) {
            this.f1518.m37714();
        }
        this.f1516.show(i & (-9));
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1728(int i) {
        if ((i & 8) != 0) {
            this.f1518.m37713();
        }
        this.f1516.hide(i & (-9));
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1730() {
        this.f1516.setSystemBarsAppearance(0, 0);
        return (this.f1516.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo1733(boolean z) {
        Window window = this.f1517;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f1516.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f1516.setSystemBarsAppearance(0, 8);
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1729(boolean z) {
        Window window = this.f1517;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f1516.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f1516.setSystemBarsAppearance(0, 16);
    }

    @Override // l.C7706
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo1732(int i) {
        this.f1516.setSystemBarsBehavior(i);
    }
}
