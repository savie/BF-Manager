package l;

/* JADX INFO: renamed from: l.ۡܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBIA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8966 extends AbstractC10377 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f30716;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return true;
    }

    public AbstractC8966(long j) {
        this.f30716 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f30716 == ((AbstractC8966) obj).f30716;
    }

    public final int hashCode() {
        long j = this.f30716;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        long j = ((AbstractC8966) abstractC9901).f30716;
        long j2 = this.f30716;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    @Override // l.AbstractC10377
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo21657() {
        long j = this.f30716;
        return ((long) ((int) j)) == j;
    }

    @Override // l.AbstractC10377
    /* JADX INFO: renamed from: ᩴ */
    public final int mo21658() {
        return (int) this.f30716;
    }

    @Override // l.AbstractC10377
    /* JADX INFO: renamed from: ᩵ */
    public final long mo21659() {
        return this.f30716;
    }
}
