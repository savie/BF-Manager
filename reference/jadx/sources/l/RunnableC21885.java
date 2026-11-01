package l;

/* JADX INFO: renamed from: l.᩸᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21885 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19769 f71000;

    public RunnableC21885(AbstractC19769 abstractC19769) {
        this.f71000 = abstractC19769;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f71000.f63515) {
            obj = this.f71000.f63521;
            this.f71000.f63521 = AbstractC19769.f63513;
        }
        this.f71000.mo23642(obj);
    }
}
