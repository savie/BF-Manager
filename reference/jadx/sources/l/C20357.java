package l;

/* JADX INFO: renamed from: l.᩶ᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78QG */
/* JADX INFO: loaded from: classes5.dex */
public final class C20357 extends C2717 implements Comparable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f65931;

    public /* synthetic */ C20357(int i) {
        this();
    }

    public C20357() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C20357 c20357 = (C20357) obj;
        if (m42264() != c20357.m42264()) {
            return m42264() ? 1 : -1;
        }
        long j = this.f51910 - c20357.f51910;
        if (j == 0) {
            j = this.f65931 - c20357.f65931;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
