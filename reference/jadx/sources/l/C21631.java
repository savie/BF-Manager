package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C21631 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3991 f70151;

    public C21631(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f70151 = new C23043(view);
        } else {
            this.f70151 = new C3991(view);
        }
    }

    @Deprecated
    public C21631(WindowInsetsController windowInsetsController) {
        this.f70151 = new C23043(windowInsetsController);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48346() {
        this.f70151.mo11493();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48345() {
        this.f70151.mo11492();
    }
}
