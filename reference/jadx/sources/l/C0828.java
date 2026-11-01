package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Y3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0828 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f3457 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12824 f3458;

    public C0828(AbstractC12824 abstractC12824) {
        this.f3458 = abstractC12824;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.f3457 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f3457;
            AbstractC12824 abstractC12824 = this.f3458;
            if (i > abstractC12824.mo31751()) {
                return false;
            }
            if (abstractC12824.mo31756(this.f3457)) {
                return true;
            }
            this.f3457++;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3457;
        this.f3457 = i + 1;
        InterfaceC3609 interfaceC3609Mo31753 = this.f3458.mo31753(i);
        C13638.requireNonNull(interfaceC3609Mo31753);
        return interfaceC3609Mo31753;
    }
}
