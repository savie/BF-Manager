package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes.dex */
public final class C23162 extends AbstractC6918 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f75077;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0747 f75078;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f75079;

    @Override // l.AbstractC6918, l.InterfaceC8409
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18105.$default$forEachRemaining(this, consumer);
    }

    @Override // l.AbstractC6918, l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.AbstractC6918, l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.AbstractC6918, l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23162(long j, int i, Iterator it, C0747 c0747) {
        super(j, i);
        this.f75079 = it;
        this.f75078 = c0747;
        this.f75077 = 0L;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        Iterator it = this.f75079;
        if (!it.hasNext()) {
            return false;
        }
        Object next = it.next();
        long j = this.f75077;
        this.f75077 = 1 + j;
        if (!((C14912) this.f75078.f2725).apply(next)) {
            j = -1;
        }
        consumer.accept(Long.valueOf(j));
        return true;
    }
}
