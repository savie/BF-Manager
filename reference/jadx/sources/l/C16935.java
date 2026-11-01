package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܽ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBG6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16935 extends AbstractC14322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C16935 f54134 = new C16935();

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final int mo3096() {
        return 1;
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final String mo3100(AbstractC10794 abstractC10794) {
        return "";
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final String mo3097(AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        int size = c0727M38695.size();
        return c0727M38695.m15275get(size - 2).m38392() + ", " + c0727M38695.m15275get(size - 1).m38392();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3101(AbstractC16438 abstractC16438) {
        C16251 c16251M15275get;
        C16251 c16251M15275get2;
        if (!(abstractC16438 instanceof C19052)) {
            return false;
        }
        C0727 c0727M38695 = abstractC16438.m38695();
        int size = c0727M38695.size();
        if (size == 2) {
            c16251M15275get = c0727M38695.m15275get(0);
            c16251M15275get2 = c0727M38695.m15275get(1);
        } else {
            if (size != 3) {
                return false;
            }
            c16251M15275get = c0727M38695.m15275get(1);
            c16251M15275get2 = c0727M38695.m15275get(2);
            if (c16251M15275get.m38400() != c0727M38695.m15275get(0).m38400()) {
                return false;
            }
        }
        return AbstractC14322.m34575(c16251M15275get.m38400()) && AbstractC14322.m34575(c16251M15275get2.m38400());
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final BitSet mo3098(AbstractC16438 abstractC16438) {
        C0727 c0727M38695 = abstractC16438.m38695();
        BitSet bitSet = new BitSet(2);
        int iM38400 = c0727M38695.m15275get(0).m38400();
        int iM38401 = c0727M38695.m15275get(1).m38400();
        int size = c0727M38695.size();
        if (size == 2) {
            bitSet.set(0, AbstractC14322.m34575(iM38400));
            bitSet.set(1, AbstractC14322.m34575(iM38401));
            return bitSet;
        }
        if (size == 3) {
            if (iM38400 != iM38401) {
                bitSet.set(0, false);
                bitSet.set(1, false);
            } else {
                boolean zM34575 = AbstractC14322.m34575(iM38401);
                bitSet.set(0, zM34575);
                bitSet.set(1, zM34575);
            }
            bitSet.set(2, AbstractC14322.m34575(c0727M38695.m15275get(2).m38400()));
            return bitSet;
        }
        throw new AssertionError();
    }

    @Override // l.AbstractC14322
    /* JADX INFO: renamed from: ۙ */
    public final void mo3099(C2718 c2718, AbstractC10794 abstractC10794) {
        C0727 c0727M38695 = abstractC10794.m38695();
        int size = c0727M38695.size();
        c2718.m8297(AbstractC14322.m34565(abstractC10794, AbstractC14322.m34573(c0727M38695.m15275get(size - 2).m38400(), c0727M38695.m15275get(size - 1).m38400())));
    }
}
