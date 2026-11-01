package l;

/* JADX INFO: renamed from: l.ۗ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3436 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12658;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC4538 f12659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f12660;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2025 f12661;

    public /* synthetic */ RunnableC3436(ServiceC4538 serviceC4538, C2025 c2025, String str, long j) {
        this.f12659 = serviceC4538;
        this.f12661 = c2025;
        this.f12658 = str;
        this.f12660 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceC4538.m12669(this.f12659, this.f12661, this.f12658, this.f12660);
    }
}
