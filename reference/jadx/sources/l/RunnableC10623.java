package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10623 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f33705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f33706;

    public RunnableC10623(AbstractActivityC17204 abstractActivityC17204, TextView textView) {
        this.f33705 = abstractActivityC17204;
        this.f33706 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11369.m28687(this.f33705, this.f33706);
        C11369.m28686(this);
    }
}
