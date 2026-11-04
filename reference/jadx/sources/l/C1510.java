package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.֨᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB9X */
/* JADX INFO: loaded from: classes3.dex */
public final class C1510 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C1510 f5250 = new C1510();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 2;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final String mo3134(AbstractC2476 abstractC2476) {
        return abstractC2476.m43795().m31619get(0).m47904() + ", " + abstractC2476.mo37455();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return abstractC2476.mo37450();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        C20946 c20946M31619get;
        if (!(abstractC18884 instanceof C18138)) {
            return false;
        }
        C0063 c0063M43795 = abstractC18884.m43795();
        int size = c0063M43795.size();
        if (size == 1) {
            c20946M31619get = c0063M43795.m31619get(0);
        } else {
            if (size != 2) {
                return false;
            }
            c20946M31619get = c0063M43795.m31619get(0);
            if (c20946M31619get.m47903() != c0063M43795.m31619get(1).m47903()) {
                return false;
            }
        }
        if (!AbstractC6951.m19242(c20946M31619get.m47903())) {
            return false;
        }
        C18138 c18138 = (C18138) abstractC18884;
        int iM42254 = c18138.m42254();
        AbstractC13487 abstractC13487M42255 = c18138.m42255();
        if (AbstractC6951.m19246(iM42254)) {
            return (abstractC13487M42255 instanceof C1028) || (abstractC13487M42255 instanceof C16689) || (abstractC13487M42255 instanceof C9976) || (abstractC13487M42255 instanceof C21165) || (abstractC13487M42255 instanceof C7740);
        }
        return false;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3135(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        int size = c0063M43795.size();
        BitSet bitSet = new BitSet(size);
        boolean zM19242 = AbstractC6951.m19242(c0063M43795.m31619get(0).m47903());
        if (size == 1) {
            bitSet.set(0, zM19242);
            return bitSet;
        }
        if (c0063M43795.m31619get(0).m47903() == c0063M43795.m31619get(1).m47903()) {
            bitSet.set(0, zM19242);
            bitSet.set(1, zM19242);
        }
        return bitSet;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        AbstractC6951.m19240((InterfaceC8550) c15000, AbstractC6951.m19239(abstractC2476, abstractC2476.m43795().m31619get(0).m47903()), (short) ((C18138) abstractC2476).m42254());
    }
}
