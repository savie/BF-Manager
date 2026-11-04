package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ᩳ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBG6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19409 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C19409 f62739 = new C19409();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 1;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return "";
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final String mo3134(AbstractC2476 abstractC2476) {
        C0063 c0063M43795 = abstractC2476.m43795();
        int size = c0063M43795.size();
        return c0063M43795.m31619get(size - 2).m47904() + ", " + c0063M43795.m31619get(size - 1).m47904();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        C20946 c20946M31619get;
        C20946 c20946M31619get2;
        if (!(abstractC18884 instanceof C20901)) {
            return false;
        }
        C0063 c0063M43795 = abstractC18884.m43795();
        int size = c0063M43795.size();
        if (size == 2) {
            c20946M31619get = c0063M43795.m31619get(0);
            c20946M31619get2 = c0063M43795.m31619get(1);
        } else {
            if (size != 3) {
                return false;
            }
            c20946M31619get = c0063M43795.m31619get(1);
            c20946M31619get2 = c0063M43795.m31619get(2);
            if (c20946M31619get.m47903() != c0063M43795.m31619get(0).m47903()) {
                return false;
            }
        }
        return AbstractC6951.m19249(c20946M31619get.m47903()) && AbstractC6951.m19249(c20946M31619get2.m47903());
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3135(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        BitSet bitSet = new BitSet(2);
        int iM47903 = c0063M43795.m31619get(0).m47903();
        int iM47904 = c0063M43795.m31619get(1).m47903();
        int size = c0063M43795.size();
        if (size == 2) {
            bitSet.set(0, AbstractC6951.m19249(iM47903));
            bitSet.set(1, AbstractC6951.m19249(iM47904));
            return bitSet;
        }
        if (size == 3) {
            if (iM47903 != iM47904) {
                bitSet.set(0, false);
                bitSet.set(1, false);
            } else {
                boolean zM19249 = AbstractC6951.m19249(iM47904);
                bitSet.set(0, zM19249);
                bitSet.set(1, zM19249);
            }
            bitSet.set(2, AbstractC6951.m19249(c0063M43795.m31619get(2).m47903()));
            return bitSet;
        }
        throw new AssertionError();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        C0063 c0063M43795 = abstractC2476.m43795();
        int size = c0063M43795.size();
        c15000.m36123(AbstractC6951.m19239(abstractC2476, AbstractC6951.m19247(c0063M43795.m31619get(size - 2).m47903(), c0063M43795.m31619get(size - 1).m47903())));
    }
}
