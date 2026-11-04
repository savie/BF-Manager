package l;

/* JADX INFO: renamed from: l.ۙۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 32SL */
/* JADX INFO: loaded from: classes2.dex */
public class C4866 extends Exception {
    public C4866(int i) {
        super(C21576.m49088(i));
    }

    @Override // java.lang.Throwable
    public synchronized C4866 initCause(Throwable th) {
        super.initCause(th);
        return this;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String name = Exception.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C20196.m46451(name, ": ", localizedMessage) : name;
    }
}
