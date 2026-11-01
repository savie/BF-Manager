package l;

/* JADX INFO: renamed from: l.ᩳ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4R6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17736 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f56285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f56286;

    public C17736(String str) {
        this.f56286 = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (C7859.f25847) {
            if (this.f56285) {
                return;
            }
            this.f56285 = true;
            Integer num = (Integer) C7859.f25846.get(this.f56286);
            if (num == null || num.intValue() <= 1) {
                C7859.f25846.remove(this.f56286);
                C7859.f25847.notifyAll();
            } else {
                C7859.f25846.put(this.f56286, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
