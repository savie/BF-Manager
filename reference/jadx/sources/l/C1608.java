package l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
import com.alipay.sdk.m.t0.b;

/* JADX INFO: renamed from: l.֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14IM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1608 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PointerIcon f5529;

    public C1608(PointerIcon pointerIcon) {
        this.f5529 = pointerIcon;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m5658() {
        return this.f5529;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1608 m5657(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1608(C5337.m15995(context, b.c));
        }
        return new C1608(null);
    }
}
