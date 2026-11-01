package l;

/* JADX INFO: renamed from: l.ܽܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38PP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16738 extends Thread {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12505 f53616;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16738(AbstractC12505 abstractC12505) {
        super("ExoPlayer:SimpleDecoder");
        this.f53616 = abstractC12505;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AbstractC12505.m31057(this.f53616);
    }
}
