package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C4230 extends AbstractC0501 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f15439;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4230(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.f15439 = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f15439.iterator();
    }
}
