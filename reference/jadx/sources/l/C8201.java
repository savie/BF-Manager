package l;

/* JADX INFO: renamed from: l.۠۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8201 extends AbstractC8907 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f28562;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f28562 - ((C8201) obj).f28562;
    }

    public C8201() {
        this.f28562 = 0;
    }

    public C8201(int i) {
        this.f28562 = i;
    }

    @Override // l.AbstractC8907
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo21489(AbstractC19055 abstractC19055, C8472 c8472) {
        return abstractC19055.mo18914(this.f28562);
    }

    @Override // l.AbstractC8907
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC8907 mo21490(AbstractC19055 abstractC19055, C8472 c8472) {
        if (abstractC19055.mo18914(this.f28562)) {
            return C21606.f70083;
        }
        return null;
    }

    public final int hashCode() {
        return this.f28562 + 31;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8201) {
            return this == obj || this.f28562 == ((C8201) obj).f28562;
        }
        return false;
    }

    public final String toString() {
        return C12441.m30911(this.f28562, ">=prec}?", new StringBuilder("{"));
    }
}
