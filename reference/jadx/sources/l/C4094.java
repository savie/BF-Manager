package l;

/* JADX INFO: renamed from: l.ۘۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAYC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4094 extends AbstractRunnableC12297 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Runnable f13954;

    public C4094(Runnable runnable, long j, InterfaceC6332 interfaceC6332) {
        super(j, interfaceC6332);
        this.f13954 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f13954.run();
        } finally {
            this.f39532.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f13954;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C21892.m49586(runnable));
        sb.append(", ");
        sb.append(this.f39531);
        sb.append(", ");
        sb.append(this.f39532);
        sb.append(']');
        return sb.toString();
    }
}
