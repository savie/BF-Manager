package l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
import com.alipay.sdk.m.t0.b;

/* JADX INFO: renamed from: l.۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14IM */
/* JADX INFO: loaded from: classes3.dex */
public final class C13165 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PointerIcon f43839;

    public C13165(PointerIcon pointerIcon) {
        this.f43839 = pointerIcon;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m32554() {
        return this.f43839;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13165 m32553(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C13165(C1169.m4302(context, b.c));
        }
        return new C13165(null);
    }
}
