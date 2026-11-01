package l;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23998 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Typeface f77771;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77772;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f77773;

    public RunnableC23998(TextView textView, Typeface typeface, int i) {
        this.f77773 = textView;
        this.f77771 = typeface;
        this.f77772 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77773.setTypeface(this.f77771, this.f77772);
    }
}
