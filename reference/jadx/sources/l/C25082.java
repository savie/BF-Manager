package l;

/* JADX INFO: renamed from: l.᩻ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38PP */
/* JADX INFO: loaded from: classes.dex */
public final class C25082 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16876 f81109;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25082(AbstractC16876 abstractC16876) {
        super("ExoPlayer:SimpleDecoder");
        this.f81109 = abstractC16876;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AbstractC16876.m39831(this.f81109);
    }
}
