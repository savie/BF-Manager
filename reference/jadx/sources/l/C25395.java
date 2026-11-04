package l;

/* JADX INFO: renamed from: l.᩻᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5T3 */
/* JADX INFO: loaded from: classes.dex */
public final class C25395 extends C4511 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f81972;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f81973;

    public C25395(C6003 c6003, String str, String str2) {
        super(c6003);
        this.f81972 = str;
        this.f81973 = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("FailedPredicateException(");
        sb.append(this.f81972);
        sb.append(",{");
        return C8947.m23910(sb, this.f81973, "}?)");
    }
}
