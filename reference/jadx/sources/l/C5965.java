package l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5965 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17254 f20319;

    @Deprecated
    public C5965(WindowInsetsController windowInsetsController) {
        this.f20319 = new C12316(windowInsetsController, new C21631(windowInsetsController));
    }

    public C5965(Window window, View view) {
        C21631 c21631 = new C21631(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f20319 = new C12316(window, c21631);
            return;
        }
        if (i >= 26) {
            this.f20319 = new C16549(window, c21631);
        } else if (i >= 23) {
            this.f20319 = new C0320(window, c21631);
        } else {
            this.f20319 = new C20077(window, c21631);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5965 m16252(WindowInsetsController windowInsetsController) {
        return new C5965(windowInsetsController);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16256(int i) {
        this.f20319.mo30576(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16253(int i) {
        this.f20319.mo30574(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16255() {
        return this.f20319.mo1963();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16258(boolean z) {
        this.f20319.mo1964(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16254(boolean z) {
        this.f20319.mo30575(z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16257(int i) {
        this.f20319.mo30577(i);
    }
}
