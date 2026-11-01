package l;

/* JADX INFO: renamed from: l.ۚ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5001 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17408;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17409;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17410;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13689 f17411;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17412;

    public /* synthetic */ RunnableC5001(Object obj, int i, C13689 c13689, Object obj2, int i2) {
        this.f17410 = i2;
        this.f17412 = obj;
        this.f17408 = i;
        this.f17411 = c13689;
        this.f17409 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17410) {
            case 0:
                C12763.m31720((C12763) this.f17412, this.f17408, this.f17411, (C7573) this.f17409);
                break;
            default:
                C16186.m38277((C16186) this.f17412, this.f17408, this.f17411, (Exception) this.f17409);
                break;
        }
    }
}
