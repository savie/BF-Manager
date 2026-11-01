package l;

/* JADX INFO: renamed from: l.ܰܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13953 extends AbstractC11836 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11836 f45909 = new C13953("");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f45910;

    public C13953(String str) {
        this.f45910 = str;
    }

    @Override // l.AbstractC11836
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13953.class != obj.getClass()) {
            throw new RuntimeException();
        }
        return C13638.equals(this.f45910, ((C13953) obj).f45910);
    }

    @Override // l.AbstractC11836
    public final int hashCode() {
        return this.f45910.hashCode();
    }

    @Override // l.AbstractC11836
    /* JADX INFO: renamed from: ۙ */
    public final String mo13250() {
        return this.f45910;
    }
}
