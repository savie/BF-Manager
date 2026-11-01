package l;

/* JADX INFO: renamed from: l.۠᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8513 extends AbstractC15673 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f29490;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8513(C10630 c10630, C17684 c17684, int i, int i2) {
        super(c17684, i, i2);
        this.f29490 = c10630;
    }

    @Override // l.AbstractC15673
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1249(C18825 c18825, int i) {
        return Integer.valueOf(c18825.m43449());
    }

    @Override // l.AbstractC15673, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int iNextIndex = nextIndex();
        C10630 c10630 = this.f29490;
        if (iNextIndex == c10630.f36289.f25685) {
            c10630.f36290 = m37344();
        }
        return (Integer) super.next();
    }
}
