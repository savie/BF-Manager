package l;

/* JADX INFO: renamed from: l.᩻ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P5T3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23414 extends C22085 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f75820;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f75821;

    public C23414(C17063 c17063, String str, String str2) {
        super(c17063);
        this.f75821 = str;
        this.f75820 = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("FailedPredicateException(");
        sb.append(this.f75821);
        sb.append(",{");
        return C22697.m50267(sb, this.f75820, "}?)");
    }
}
