package l;

/* JADX INFO: renamed from: l.᩹ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: DAIW */
/* JADX INFO: loaded from: classes.dex */
public final class C22356 extends Exception {
    public C22356(int i) {
        super(C16737.m39288(i));
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
        return localizedMessage != null ? C1679.m5594(name, ": ", localizedMessage) : name;
    }
}
