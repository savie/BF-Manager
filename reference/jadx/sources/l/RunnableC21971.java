package l;

/* JADX INFO: renamed from: l.᩷ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4YV */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC21971 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f70914;

    public RunnableC21971(C5563 c5563, String str) {
        super(c5563);
        this.f70914 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM36601 = AbstractRunnableC15257.m36601(this.f70914);
        C5563 c5563 = this.f49894;
        c5563.m16486("331 Send password\r\n");
        c5563.m16495(strM36601);
    }
}
