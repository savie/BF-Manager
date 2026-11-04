package l;

/* JADX INFO: renamed from: l.۫᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAIW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13464 extends Exception {
    public C13464(int i) {
        super(C21576.m49088(i));
    }

    @Override // java.lang.Throwable
    public final Throwable initCause(Throwable th) {
        synchronized (this) {
            super.initCause(th);
        }
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String name = Exception.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C20196.m46451(name, ": ", localizedMessage) : name;
    }
}
