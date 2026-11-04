package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.۟ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B0R */
/* JADX INFO: loaded from: classes3.dex */
public final class C7818 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Handler m21289() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0360.m2128(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}
