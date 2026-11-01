package l;

/* JADX INFO: renamed from: l.ᩴۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18600 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59175;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59176;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59177;

    public /* synthetic */ RunnableC18600(int i, int i2, Object obj) {
        this.f59176 = i2;
        this.f59177 = obj;
        this.f59175 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59176) {
            case 0:
                C5900.m16144((C5900) this.f59177, this.f59175);
                break;
            default:
                ((C21362) this.f59177).setItemChecked(this.f59175, true);
                break;
        }
    }
}
