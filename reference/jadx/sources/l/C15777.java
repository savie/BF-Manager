package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11302 f51354;

    public C15777(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f51354 = new C16523(view);
        } else {
            this.f51354 = new C11302(view);
        }
    }

    @Deprecated
    public C15777(WindowInsetsController windowInsetsController) {
        this.f51354 = new C16523(windowInsetsController);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37714() {
        this.f51354.mo28564();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37713() {
        this.f51354.mo28563();
    }
}
