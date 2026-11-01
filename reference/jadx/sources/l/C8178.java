package l;

import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۠۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V91O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8178 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f28526;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static TextView m21476(Spanned spanned) {
        C8178[] c8178Arr = (C8178[]) spanned.getSpans(0, spanned.length(), C8178.class);
        if (c8178Arr == null || c8178Arr.length <= 0) {
            return null;
        }
        return (TextView) c8178Arr[0].f28526.get();
    }

    public C8178(TextView textView) {
        this.f28526 = new WeakReference(textView);
    }
}
