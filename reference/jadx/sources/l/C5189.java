package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Y3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5189 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18099 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22343 f18100;

    public C5189(AbstractC22343 abstractC22343) {
        this.f18100 = abstractC22343;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.f18099 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f18099;
            AbstractC22343 abstractC22343 = this.f18100;
            if (i > abstractC22343.mo9069()) {
                return false;
            }
            if (abstractC22343.mo9075(this.f18099)) {
                return true;
            }
            this.f18099++;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f18099;
        this.f18099 = i + 1;
        InterfaceC8697 interfaceC8697Mo9076 = this.f18100.mo9076(i);
        C17359.requireNonNull(interfaceC8697Mo9076);
        return interfaceC8697Mo9076;
    }
}
