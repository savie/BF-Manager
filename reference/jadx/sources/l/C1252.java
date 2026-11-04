package l;

import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֨ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V91O */
/* JADX INFO: loaded from: classes2.dex */
public final class C1252 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f4530;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static TextView m4534(Spanned spanned) {
        C1252[] c1252Arr = (C1252[]) spanned.getSpans(0, spanned.length(), C1252.class);
        if (c1252Arr == null || c1252Arr.length <= 0) {
            return null;
        }
        return (TextView) c1252Arr[0].f4530.get();
    }

    public C1252(TextView textView) {
        this.f4530 = new WeakReference(textView);
    }
}
