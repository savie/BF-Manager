package l;

import bin.mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.ܰᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC14793 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48402;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f48403;

    public /* synthetic */ RunnableC14793(int i, Object obj) {
        this.f48402 = i;
        this.f48403 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f48402;
        Object obj = this.f48403;
        switch (i) {
            case 0:
                int i2 = ActivityC9572.f30971;
                ((ActivityC20852) obj).m47680(false);
                break;
            case 1:
                ((ActivityC5440) obj).m16253();
                break;
            case 2:
                ((AsyncTask) obj).lambda$start$1();
                break;
            default:
                int i3 = C16332.f53020;
                ((C16332) obj).m24163(new C0293(1));
                break;
        }
    }
}
