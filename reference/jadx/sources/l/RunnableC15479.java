package l;

/* JADX INFO: renamed from: l.ܳܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6G9 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15479 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22193 f50399;

    public RunnableC15479(C22193 c22193, C13921 c13921) {
        this.f50399 = c22193;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final EnumC14207 enumC14207M50132 = EnumC14207.COMMAND_FAILED;
        try {
            enumC14207M50132 = C22171.m50132(C21576.m49084(), C7756.m21117());
        } catch (Throwable unused) {
        }
        C21576.m49068(new Runnable() { // from class: l.ᩴܽܳ
            @Override // java.lang.Runnable
            public final void run() {
                C2056.m7096(this.f64156.f50399, enumC14207M50132);
            }
        });
    }
}
