package l;

/* JADX INFO: renamed from: l.᩵ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B8Q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19549 extends AbstractC10377 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f62826;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return false;
    }

    @Override // l.AbstractC10377
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo21657() {
        return true;
    }

    public AbstractC19549(int i) {
        this.f62826 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f62826 == ((AbstractC19549) obj).f62826;
    }

    public final int hashCode() {
        return this.f62826;
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        int i = ((AbstractC19549) abstractC9901).f62826;
        int i2 = this.f62826;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // l.AbstractC10377
    /* JADX INFO: renamed from: ᩴ */
    public final int mo21658() {
        return this.f62826;
    }

    @Override // l.AbstractC10377
    /* JADX INFO: renamed from: ᩵ */
    public final long mo21659() {
        return this.f62826;
    }
}
