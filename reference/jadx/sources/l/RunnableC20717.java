package l;

/* JADX INFO: renamed from: l.᩷ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20717 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67363;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67364;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67365;

    public /* synthetic */ RunnableC20717(int i, Object obj, Object obj2) {
        this.f67364 = i;
        this.f67365 = obj;
        this.f67363 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67364) {
            case 0:
                ((C5900) this.f67365).m16142((String) this.f67363, true);
                break;
            case 1:
                C13479.m32980((C13479) this.f67365, (AbstractC10444) this.f67363);
                break;
            default:
                C0906.m3609((C0906) this.f67365, (ActivityC5677) this.f67363);
                break;
        }
    }
}
