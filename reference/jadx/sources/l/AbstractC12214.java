package l;

/* JADX INFO: renamed from: l.ۨ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B8Q */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12214 extends AbstractC24149 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f39246;

    @Override // l.AbstractC24149
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo17875() {
        return true;
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return false;
    }

    public AbstractC12214(int i) {
        this.f39246 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f39246 == ((AbstractC12214) obj).f39246;
    }

    public final int hashCode() {
        return this.f39246;
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        int i = ((AbstractC12214) abstractC13487).f39246;
        int i2 = this.f39246;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // l.AbstractC24149
    /* JADX INFO: renamed from: ᩹ */
    public final int mo17877() {
        return this.f39246;
    }

    @Override // l.AbstractC24149
    /* JADX INFO: renamed from: ᩵ */
    public final long mo17876() {
        return this.f39246;
    }
}
