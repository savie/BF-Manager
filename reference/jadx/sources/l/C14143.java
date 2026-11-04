package l;

/* JADX INFO: renamed from: l.۬᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14143 extends AbstractC5107 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC5107 f44726 = new C14143("");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f44727;

    public C14143(String str) {
        this.f44727 = str;
    }

    @Override // l.AbstractC5107
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14143.class != obj.getClass()) {
            throw new RuntimeException();
        }
        return C17359.equals(this.f44727, ((C14143) obj).f44727);
    }

    @Override // l.AbstractC5107
    public final int hashCode() {
        return this.f44727.hashCode();
    }

    @Override // l.AbstractC5107
    /* JADX INFO: renamed from: ۙ */
    public final String mo15452() {
        return this.f44727;
    }
}
