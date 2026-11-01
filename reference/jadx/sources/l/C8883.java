package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8883 extends AbstractC15939 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f30445;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8883(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.f30445 = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f30445.iterator();
    }
}
