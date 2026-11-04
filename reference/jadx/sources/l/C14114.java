package l;

/* JADX INFO: renamed from: l.۬᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14114 extends AbstractC19819 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10802 f44636;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14114(C10802 c10802, C24975 c24975, int i, int i2) {
        super(c24975, i, i2);
        this.f44636 = c10802;
    }

    @Override // l.AbstractC19819
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14867(C8565 c8565, int i) {
        return Integer.valueOf(c8565.m22996());
    }

    @Override // l.AbstractC19819, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int iNextIndex = nextIndex();
        C10802 c10802 = this.f44636;
        if (iNextIndex == c10802.f34283.f73783) {
            c10802.f34279 = m45585();
        }
        return (Integer) super.next();
    }
}
