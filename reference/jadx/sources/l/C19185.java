package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ASD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19185 implements InterfaceC2032 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection f62053;

    public C19185(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.f62053 = collection;
    }

    @Override // l.InterfaceC2032
    /* JADX INFO: renamed from: ۙ */
    public final void mo2202(AbstractC9488 abstractC9488, Object obj, int i, int i2, String str, C10234 c10234) {
        Iterator it = this.f62053.iterator();
        while (it.hasNext()) {
            ((InterfaceC2032) it.next()).mo2202(abstractC9488, obj, i, i2, str, c10234);
        }
    }

    @Override // l.InterfaceC2032
    /* JADX INFO: renamed from: ۙ */
    public final void mo7005(AbstractC0540 abstractC0540, C25351 c25351, int i, int i2, boolean z, BitSet bitSet, C5783 c5783) {
        Iterator it = this.f62053.iterator();
        while (it.hasNext()) {
            ((InterfaceC2032) it.next()).mo7005(abstractC0540, c25351, i, i2, z, bitSet, c5783);
        }
    }

    @Override // l.InterfaceC2032
    /* JADX INFO: renamed from: ۙ */
    public final void mo7004(AbstractC0540 abstractC0540, C25351 c25351, int i, int i2, BitSet bitSet, C5783 c5783) {
        Iterator it = this.f62053.iterator();
        while (it.hasNext()) {
            ((InterfaceC2032) it.next()).mo7004(abstractC0540, c25351, i, i2, bitSet, c5783);
        }
    }

    @Override // l.InterfaceC2032
    /* JADX INFO: renamed from: ۙ */
    public final void mo7003(AbstractC0540 abstractC0540, C25351 c25351, int i, int i2, int i3, C5783 c5783) {
        Iterator it = this.f62053.iterator();
        while (it.hasNext()) {
            ((InterfaceC2032) it.next()).mo7003(abstractC0540, c25351, i, i2, i3, c5783);
        }
    }
}
