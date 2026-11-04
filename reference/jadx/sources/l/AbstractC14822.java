package l;

/* JADX INFO: renamed from: l.ܰ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9C7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14822 implements InterfaceC6620 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f48452;

    public AbstractC14822(long j) {
        this.f48452 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long m35692() {
        return this.f48452;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f48452 == ((AbstractC14822) obj).f48452;
    }

    public int hashCode() {
        long j = this.f48452;
        return (int) (j ^ (j >>> 32));
    }
}
