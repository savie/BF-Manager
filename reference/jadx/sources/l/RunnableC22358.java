package l;

/* JADX INFO: renamed from: l.᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22358 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72370;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72371;

    public /* synthetic */ RunnableC22358(int i, Object obj) {
        this.f72370 = i;
        this.f72371 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f72370) {
            case 0:
                ((C16390) this.f72371).invalidateMenu();
                break;
            case 1:
                ((C4059) this.f72371).m13092();
                break;
            case 2:
                C7919.m21459((C7919) this.f72371);
                break;
            case 3:
                ((C3354) this.f72371).close();
                break;
            case 4:
                C16468.m39032((C16468) this.f72371);
                break;
            default:
                AbstractC22830.m51483((AbstractC22830) this.f72371);
                break;
        }
    }
}
