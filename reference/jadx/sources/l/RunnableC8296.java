package l;

import android.media.metrics.PlaybackStateEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8296 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27255;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27256;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27257;

    public /* synthetic */ RunnableC8296(int i, Object obj, Object obj2) {
        this.f27255 = i;
        this.f27257 = obj;
        this.f27256 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f27255;
        Object obj = this.f27256;
        Object obj2 = this.f27257;
        switch (i) {
            case 0:
                C14769 c14769 = (C14769) obj;
                ((C11518) obj2).getClass();
                C11972.m30026(c14769.m35551() == C11518.m28981(c14769).m35551());
                break;
            case 1:
                ((C23722) obj2).f76905.reportPlaybackStateEvent((PlaybackStateEvent) obj);
                break;
            default:
                C4248 c4248 = (C4248) obj2;
                int i2 = C4248.f15466;
                c4248.m43868(R.string.MT_Protector);
                c4248.mo29447(((AbstractC22044) obj).getName());
                break;
        }
    }
}
