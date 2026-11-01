package l;

/* JADX INFO: renamed from: l.ۙ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 32SL */
/* JADX INFO: loaded from: classes2.dex */
public class C4987 extends Exception {
    public C4987(int i) {
        super(C16737.m39288(i));
    }

    @Override // java.lang.Throwable
    public synchronized C4987 initCause(Throwable th) {
        super.initCause(th);
        return this;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String name = Exception.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C1679.m5594(name, ": ", localizedMessage) : name;
    }
}
