package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ASD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15528 implements InterfaceC5857 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection f50539;

    public C15528(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("delegates");
        }
        this.f50539 = collection;
    }

    @Override // l.InterfaceC5857
    /* JADX INFO: renamed from: ۙ */
    public final void mo11174(AbstractC19055 abstractC19055, Object obj, int i, int i2, String str, C21877 c21877) {
        Iterator it = this.f50539.iterator();
        while (it.hasNext()) {
            ((InterfaceC5857) it.next()).mo11174(abstractC19055, obj, i, i2, str, c21877);
        }
    }

    @Override // l.InterfaceC5857
    /* JADX INFO: renamed from: ۙ */
    public final void mo16071(AbstractC7060 abstractC7060, C23724 c23724, int i, int i2, boolean z, BitSet bitSet, C17643 c17643) {
        Iterator it = this.f50539.iterator();
        while (it.hasNext()) {
            ((InterfaceC5857) it.next()).mo16071(abstractC7060, c23724, i, i2, z, bitSet, c17643);
        }
    }

    @Override // l.InterfaceC5857
    /* JADX INFO: renamed from: ۙ */
    public final void mo16070(AbstractC7060 abstractC7060, C23724 c23724, int i, int i2, BitSet bitSet, C17643 c17643) {
        Iterator it = this.f50539.iterator();
        while (it.hasNext()) {
            ((InterfaceC5857) it.next()).mo16070(abstractC7060, c23724, i, i2, bitSet, c17643);
        }
    }

    @Override // l.InterfaceC5857
    /* JADX INFO: renamed from: ۙ */
    public final void mo16069(AbstractC7060 abstractC7060, C23724 c23724, int i, int i2, int i3, C17643 c17643) {
        Iterator it = this.f50539.iterator();
        while (it.hasNext()) {
            ((InterfaceC5857) it.next()).mo16069(abstractC7060, c23724, i, i2, i3, c17643);
        }
    }
}
