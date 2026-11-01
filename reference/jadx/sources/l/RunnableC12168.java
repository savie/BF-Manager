package l;

/* JADX INFO: renamed from: l.۫ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12168 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40731;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f40732;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40733;

    public RunnableC12168(C11545 c11545, int i, int i2) {
        this.f40732 = c11545;
        this.f40731 = i;
        this.f40733 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11545 c11545 = this.f40732;
        if (this.f40731 != c11545.f38816.get()) {
            return;
        }
        if (c11545.m28800()) {
            C16737.m39273(this);
        } else {
            c11545.onItemClick(null, null, this.f40733, 0L);
        }
    }
}
