package l;

/* JADX INFO: renamed from: l.᩶֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19814 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63612;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63613;

    public /* synthetic */ RunnableC19814(int i, Object obj) {
        this.f63612 = i;
        this.f63613 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63612) {
            case 0:
                ((InterfaceC5702) this.f63613).m15730();
                break;
            case 1:
                ServiceC12465.m30955((ServiceC12465) this.f63613);
                break;
            case 2:
                ((C19575) this.f63613).m44681();
                break;
            case 3:
                C17037.m39814(((C12099) this.f63613).f40468);
                break;
            default:
                C6382.m17518((C6382) this.f63613);
                break;
        }
    }
}
