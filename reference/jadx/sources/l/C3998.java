package l;

/* JADX INFO: renamed from: l.ۘܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: LAYC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3998 extends AbstractRunnableC22344 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Runnable f14837;

    public C3998(Runnable runnable, long j, InterfaceC1176 interfaceC1176) {
        super(j, interfaceC1176);
        this.f14837 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14837.run();
        } finally {
            this.f72949.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f14837;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C13961.m33816(runnable));
        sb.append(", ");
        sb.append(this.f72948);
        sb.append(", ");
        sb.append(this.f72949);
        sb.append(']');
        return sb.toString();
    }
}
