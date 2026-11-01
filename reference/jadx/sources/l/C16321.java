package l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 63SN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16321 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38489(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0092.m1048(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | Params.POLY_BYTES);
    }
}
