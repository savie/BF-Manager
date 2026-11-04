package l;

/* JADX INFO: renamed from: l.۫ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13161 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f42087;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11555 f42088;

    public RunnableC13161(C7941 c7941, C11555 c11555) {
        this.f42087 = c7941;
        this.f42088 = c11555;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f42088.m29071()) {
            C7941 c7941 = this.f42087;
            if (c7941.m19927()) {
                return;
            }
            if (c7941.f26408) {
                c7941.m21571();
            } else {
                C21576.m49069(this, 100L);
            }
        }
    }
}
