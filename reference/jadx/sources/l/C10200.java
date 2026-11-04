package l;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۢܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 88XH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10200 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f32627;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Layout m26319(Spanned spanned) {
        C10200[] c10200Arr = (C10200[]) spanned.getSpans(0, spanned.length(), C10200.class);
        if (c10200Arr == null || c10200Arr.length <= 0) {
            return null;
        }
        return (Layout) c10200Arr[0].f32627.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26320(Spannable spannable, StaticLayout staticLayout) {
        C10200[] c10200Arr = (C10200[]) spannable.getSpans(0, spannable.length(), C10200.class);
        if (c10200Arr != null) {
            for (C10200 c10200 : c10200Arr) {
                spannable.removeSpan(c10200);
            }
        }
        spannable.setSpan(new C10200(staticLayout), 0, spannable.length(), 18);
    }

    public C10200(StaticLayout staticLayout) {
        this.f32627 = new WeakReference(staticLayout);
    }
}
