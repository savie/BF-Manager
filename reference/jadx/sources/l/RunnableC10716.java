package l;

/* JADX INFO: renamed from: l.ۧۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10716 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18559 f36542;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f36543;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f36544;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f36545;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10093 f36546;

    public /* synthetic */ RunnableC10716(boolean z, C10093 c10093, C18559 c18559, String str, boolean[] zArr) {
        this.f36544 = z;
        this.f36546 = c10093;
        this.f36542 = c18559;
        this.f36545 = str;
        this.f36543 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f36544) {
            return;
        }
        this.f36546.m25505(this.f36542, this.f36545, this.f36543[0]);
    }
}
