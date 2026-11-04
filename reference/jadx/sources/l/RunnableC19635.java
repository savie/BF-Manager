package l;

import bin.mt.plus.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ᩴۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC19635 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63263;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63264;

    public /* synthetic */ RunnableC19635(int i, Object obj) {
        this.f63263 = i;
        this.f63264 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f63263;
        Object obj = this.f63264;
        switch (i) {
            case 0:
                int i2 = ActivityC18143.f59323;
                ((ActivityC18143) obj).m42308(R.layout.MT_Protector);
                break;
            default:
                ((C13425) obj).f42756.m52937((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
                break;
        }
    }
}
