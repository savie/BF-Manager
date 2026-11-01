package l;

import bin.mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.᩶ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19991 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63982;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63983;

    public /* synthetic */ RunnableC19991(int i, Object obj) {
        this.f63982 = i;
        this.f63983 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63982) {
            case 0:
                C23519.m51784((C23519) this.f63983);
                break;
            case 1:
                C1777.m5820((C1777) this.f63983);
                break;
            case 2:
                C21094.m47529((String) this.f63983);
                break;
            case 3:
                ((AsyncTask) this.f63983).lambda$start$0();
                break;
            default:
                C22046.m48978((C22046) this.f63983);
                break;
        }
    }
}
