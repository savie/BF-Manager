package l;

/* JADX INFO: renamed from: l.ۙۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4886 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17078;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17079;

    public /* synthetic */ RunnableC4886(int i, Object obj) {
        this.f17078 = i;
        this.f17079 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17078) {
            case 0:
                C8614.m23154((C8614) this.f17079);
                break;
            case 1:
                ActivityC9572.m24991((ActivityC9572) this.f17079);
                break;
            default:
                C22403 c22403 = (C22403) this.f17079;
                c22403.f72575.post(new RunnableC5458(8, c22403));
                break;
        }
    }
}
