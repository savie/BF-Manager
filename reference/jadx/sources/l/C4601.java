package l;

/* JADX INFO: renamed from: l.ۙۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4601 extends C13775 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22241 f16281;

    public C4601(C22241 c22241) {
        this.f16281 = c22241;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4601) {
            return this.f16281.equals(((C4601) obj).f16281);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16281.hashCode();
    }

    @Override // l.C13775
    public final String toString() {
        return "Closed(" + this.f16281 + ')';
    }
}
