package l;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18761 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f60817;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Layout m43319(Spanned spanned) {
        C18761[] c18761Arr = (C18761[]) spanned.getSpans(0, spanned.length(), C18761.class);
        if (c18761Arr == null || c18761Arr.length <= 0) {
            return null;
        }
        return (Layout) c18761Arr[0].f60817.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43320(Spannable spannable, StaticLayout staticLayout) {
        C18761[] c18761Arr = (C18761[]) spannable.getSpans(0, spannable.length(), C18761.class);
        if (c18761Arr != null) {
            for (C18761 c18761 : c18761Arr) {
                spannable.removeSpan(c18761);
            }
        }
        spannable.setSpan(new C18761(staticLayout), 0, spannable.length(), 18);
    }

    public C18761(StaticLayout staticLayout) {
        this.f60817 = new WeakReference(staticLayout);
    }
}
