package l;

/* JADX INFO: renamed from: l.ۚ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5927 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20273;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f20274;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20275;

    public /* synthetic */ RunnableC5927(int i, String str, Object obj) {
        this.f20273 = i;
        this.f20275 = obj;
        this.f20274 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20273) {
            case 0:
                ViewOnLayoutChangeListenerC6673.m18664((ViewOnLayoutChangeListenerC6673) this.f20275, this.f20274);
                break;
            default:
                C15829.m37775((C15829) this.f20275, this.f20274);
                break;
        }
    }
}
