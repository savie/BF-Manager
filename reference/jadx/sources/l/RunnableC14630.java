package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14630 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f47860;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f47861;

    public RunnableC14630(AbstractActivityC12483 abstractActivityC12483, TextView textView) {
        this.f47860 = abstractActivityC12483;
        this.f47861 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2758.m8417(this.f47860, this.f47861);
        C2758.m8416(this);
    }
}
