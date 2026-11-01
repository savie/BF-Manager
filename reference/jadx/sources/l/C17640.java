package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܿ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB9X */
/* JADX INFO: loaded from: classes5.dex */
public final class C17640 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C17640 f56075 = new C17640();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 2;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        return abstractC10794.m38695().m15275get(0).m38392() + ", " + abstractC10794.mo8567();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return abstractC10794.mo8573();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        C16251 c16251M15275get;
        if (!(abstractC16438 instanceof C15733)) {
            return false;
        }
        C0727 c0727M38695 = abstractC16438.m38695();
        int size = c0727M38695.size();
        if (size == 1) {
            c16251M15275get = c0727M38695.m15275get(0);
        } else {
            if (size != 2) {
                return false;
            }
            c16251M15275get = c0727M38695.m15275get(0);
            if (c16251M15275get.m38400() != c0727M38695.m15275get(1).m38400()) {
                return false;
            }
        }
        if (!AbstractC14322.m34568(c16251M15275get.m38400())) {
            return false;
        }
        C15733 c15733 = (C15733) abstractC16438;
        int iM37457 = c15733.m37457();
        AbstractC9901 abstractC9901M37458 = c15733.m37458();
        if (AbstractC14322.m34572(iM37457)) {
            return (abstractC9901M37458 instanceof C6143) || (abstractC9901M37458 instanceof C23077) || (abstractC9901M37458 instanceof C17432) || (abstractC9901M37458 instanceof C16022) || (abstractC9901M37458 instanceof C16727);
        }
        return false;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3098(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        int size = c0727M38695.size();
        BitSet bitSet = new BitSet(size);
        boolean zM34568 = AbstractC14322.m34568(c0727M38695.m15275get(0).m38400());
        if (size == 1) {
            bitSet.set(0, zM34568);
            return bitSet;
        }
        if (c0727M38695.m15275get(0).m38400() == c0727M38695.m15275get(1).m38400()) {
            bitSet.set(0, zM34568);
            bitSet.set(1, zM34568);
        }
        return bitSet;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        AbstractC14322.m34567((InterfaceC23865) c2718, AbstractC14322.m34565(abstractC10794, abstractC10794.m38695().m15275get(0).m38400()), (short) ((C15733) abstractC10794).m37457());
    }
}
