package l;

/* JADX INFO: renamed from: l.ۘᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4098 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f15017;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f15018;

    public RunnableC4098(C19622 c19622, C10450 c10450) {
        this.f15017 = c19622;
        this.f15018 = c10450;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11260 c11260 = (C11260) this.f15017.f62983.f68499.remove(this.f15018.f35674.getBinder());
        if (c11260 != null) {
            ((C10450) c11260.f38063).f35674.getBinder().unlinkToDeath(c11260, 0);
        }
    }
}
