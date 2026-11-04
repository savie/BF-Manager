package l;

/* JADX INFO: renamed from: l.۟ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4R6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7720 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f25445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f25446;

    public C7720(String str) {
        this.f25446 = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (C1008.f3653) {
            if (this.f25445) {
                return;
            }
            this.f25445 = true;
            Integer num = (Integer) C1008.f3652.get(this.f25446);
            if (num == null || num.intValue() <= 1) {
                C1008.f3652.remove(this.f25446);
                C1008.f3653.notifyAll();
            } else {
                C1008.f3652.put(this.f25446, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
