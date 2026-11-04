package l;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8976 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29270;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Typeface f29271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f29272;

    public RunnableC8976(TextView textView, Typeface typeface, int i) {
        this.f29272 = textView;
        this.f29271 = typeface;
        this.f29270 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29272.setTypeface(this.f29271, this.f29270);
    }
}
