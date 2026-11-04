package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܺۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BBQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16580 extends AbstractC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C16580 f53660 = new C16580();

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final int mo3133() {
        return 4;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final String mo3134(AbstractC2476 abstractC2476) {
        return AbstractC6951.m19248(m39249(abstractC2476.m43795())) + ", " + abstractC2476.mo37455();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3137(AbstractC2476 abstractC2476) {
        return abstractC2476.mo37450();
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3138(AbstractC18884 abstractC18884) {
        if (!(abstractC18884 instanceof C15679)) {
            return false;
        }
        C15679 c15679 = (C15679) abstractC18884;
        if (c15679.m37452() != 2) {
            return false;
        }
        return AbstractC6951.m19246(c15679.m37454(0)) && AbstractC6951.m19246(c15679.m37454(1)) && (c15679.m37451(0) instanceof C18181) && (c15679.m37451(1) instanceof C7740) && m39248(c15679.m43795()) >= 0;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3135(AbstractC18884 abstractC18884) {
        C0063 c0063M43795 = abstractC18884.m43795();
        int size = c0063M43795.size();
        BitSet bitSet = new BitSet(size);
        for (int i = 0; i < size; i++) {
            C20946 c20946M31619get = c0063M43795.m31619get(i);
            bitSet.set(i, AbstractC6951.m19249((c20946M31619get.m47901() + c20946M31619get.m47903()) - 1));
        }
        return bitSet;
    }

    @Override // l.AbstractC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo3136(C15000 c15000, AbstractC2476 abstractC2476) {
        C15679 c15679 = (C15679) abstractC2476;
        short sM37454 = (short) c15679.m37454(0);
        short sM37455 = (short) c15679.m37454(1);
        C0063 c0063M39249 = m39249(abstractC2476.m43795());
        int size = c0063M39249.size();
        int iM47903 = size > 0 ? c0063M39249.m31619get(0).m47903() : 0;
        int iM47904 = size > 1 ? c0063M39249.m31619get(1).m47903() : 0;
        int iM47905 = size > 2 ? c0063M39249.m31619get(2).m47903() : 0;
        int iM47906 = size > 3 ? c0063M39249.m31619get(3).m47903() : 0;
        short sM19239 = AbstractC6951.m19239(abstractC2476, AbstractC6951.m19247(size > 4 ? c0063M39249.m31619get(4).m47903() : 0, size));
        short sM19238 = AbstractC6951.m19238(iM47903, iM47904, iM47905, iM47906);
        c15000.m36123(sM19239);
        c15000.m36123(sM37454);
        c15000.m36123(sM19238);
        c15000.m36123(sM37455);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m39248(C0063 c0063) {
        int size = c0063.size();
        if (size > 5) {
            return -1;
        }
        int iM47901 = 0;
        for (int i = 0; i < size; i++) {
            C20946 c20946M31619get = c0063.m31619get(i);
            iM47901 += c20946M31619get.m47901();
            if (!AbstractC6951.m19249((c20946M31619get.m47901() + c20946M31619get.m47903()) - 1)) {
                return -1;
            }
        }
        if (iM47901 <= 5) {
            return iM47901;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C0063 m39249(C0063 c0063) {
        int iM39248 = m39248(c0063);
        int size = c0063.size();
        if (iM39248 == size) {
            return c0063;
        }
        C0063 c0064 = new C0063(iM39248);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C20946 c20946M31619get = c0063.m31619get(i2);
            c0064.m31604(i, c20946M31619get);
            if (c20946M31619get.m47901() == 2) {
                c0064.m31604(i + 1, C20946.m47883(c20946M31619get.m47903() + 1, C5085.f17731));
                i += 2;
            } else {
                i++;
            }
        }
        c0064.mo15005();
        return c0064;
    }
}
