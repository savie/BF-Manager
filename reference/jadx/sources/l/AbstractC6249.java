package l;

/* JADX INFO: renamed from: l.ۛ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBIA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6249 extends AbstractC24149 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f21207;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return true;
    }

    public AbstractC6249(long j) {
        this.f21207 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f21207 == ((AbstractC6249) obj).f21207;
    }

    public final int hashCode() {
        long j = this.f21207;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        long j = ((AbstractC6249) abstractC13487).f21207;
        long j2 = this.f21207;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    @Override // l.AbstractC24149
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo17875() {
        long j = this.f21207;
        return ((long) ((int) j)) == j;
    }

    @Override // l.AbstractC24149
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo17877() {
        return (int) this.f21207;
    }

    @Override // l.AbstractC24149
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long mo17876() {
        return this.f21207;
    }
}
