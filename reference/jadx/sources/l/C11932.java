package l;

/* JADX INFO: renamed from: l.ۧ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 78QG */
/* JADX INFO: loaded from: classes4.dex */
public final class C11932 extends C0526 implements Comparable {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f38432;

    public /* synthetic */ C11932(int i) {
        this();
    }

    public C11932() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C11932 c11932 = (C11932) obj;
        if (m33305() != c11932.m33305()) {
            return m33305() ? 1 : -1;
        }
        long j = this.f19652 - c11932.f19652;
        if (j == 0) {
            j = this.f38432 - c11932.f38432;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
