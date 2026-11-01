package l;

/* JADX INFO: renamed from: l.ᩴܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1KE */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18833 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f61022;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC1651 f61023;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4245 f61024;

    public RunnableC18833(C4245 c4245, EnumC1651 enumC1651) {
        C13465.m32966(c4245, "registry");
        C13465.m32966(enumC1651, "event");
        this.f61024 = c4245;
        this.f61023 = enumC1651;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f61022) {
            return;
        }
        this.f61024.m11902(this.f61023);
        this.f61022 = true;
    }
}
