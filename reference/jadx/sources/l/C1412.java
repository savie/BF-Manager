package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBGP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1412 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f5833;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f5834;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6559 f5835;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f5836;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f5838;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f5840 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f5837 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f5839 = false;

    public C1412(C6559 c6559, int i, int i2, int i3) {
        this.f5835 = c6559;
        this.f5838 = i2;
        this.f5834 = new ArrayList(i);
        this.f5836 = i3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m4931() {
        return this.f5837;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m4938() {
        return this.f5839;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet m4939() {
        HashSet hashSet = new HashSet(20);
        for (AbstractC16438 abstractC16438 : this.f5834) {
            if (abstractC16438 instanceof C15733) {
                hashSet.add(((C15733) abstractC16438).m37458());
            } else {
                int i = 0;
                if (abstractC16438 instanceof C2823) {
                    C2823 c2823 = (C2823) abstractC16438;
                    while (i < c2823.m8575()) {
                        hashSet.add(c2823.m8574(i));
                        i++;
                    }
                } else if (abstractC16438 instanceof C14114) {
                    C16956 c16956M34152 = ((C14114) abstractC16438).m34152();
                    int size = c16956M34152.size();
                    while (i < size) {
                        m4927(hashSet, c16956M34152.get(i));
                        i++;
                    }
                } else if (abstractC16438 instanceof C11997) {
                    m4927(hashSet, ((C11997) abstractC16438).m29884());
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4927(HashSet hashSet, C16251 c16251) {
        if (c16251 == null) {
            return;
        }
        C19073 c19073M38386 = c16251.m38386();
        C17432 name = c19073M38386.getName();
        C17432 signature = c19073M38386.getSignature();
        C3320 type = c16251.getType();
        if (type != C3320.f12286) {
            hashSet.add(C6143.m17126(type));
        } else {
            hashSet.add(C6143.m17126(C3320.f12289));
        }
        if (name != null) {
            hashSet.add(name);
        }
        if (signature != null) {
            hashSet.add(signature);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4934(AbstractC16438 abstractC16438) {
        C16251 c16251M29884;
        this.f5834.add(abstractC16438);
        if (!this.f5837 && abstractC16438.m38701().m28312() >= 0) {
            this.f5837 = true;
        }
        if (this.f5839) {
            return;
        }
        if (abstractC16438 instanceof C14114) {
            C16956 c16956M34152 = ((C14114) abstractC16438).m34152();
            int size = c16956M34152.size();
            for (int i = 0; i < size; i++) {
                C16251 c16251 = c16956M34152.get(i);
                if (c16251 == null || c16251.m38386().getName() == null) {
                }
            }
            return;
        }
        if (!(abstractC16438 instanceof C11997) || (c16251M29884 = ((C11997) abstractC16438).m29884()) == null || c16251M29884.m38386().getName() == null) {
            return;
        }
        this.f5839 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16438 m4933(int i) {
        return (AbstractC16438) this.f5834.get(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m4937() {
        return this.f5834.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4936(C20671 c20671) {
        int size = this.f5834.size() - 2;
        try {
            C9175 c9175 = (C9175) this.f5834.get(size);
            this.f5834.set(size, new C9175(c9175.m38693().m40074(), c9175.m38701(), c9175.m38695(), c20671));
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException unused2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4935(InterfaceC19966 interfaceC19966) {
        int iMo15783;
        for (AbstractC16438 abstractC16438 : this.f5834) {
            if (abstractC16438 instanceof C15733) {
                C15733 c15733 = (C15733) abstractC16438;
                AbstractC9901 abstractC9901M37458 = c15733.m37458();
                int iMo15784 = interfaceC19966.mo15783(abstractC9901M37458);
                if (iMo15784 >= 0) {
                    c15733.m37455(iMo15784);
                }
                if ((abstractC9901M37458 instanceof AbstractC20960) && (iMo15783 = interfaceC19966.mo15783(((AbstractC20960) abstractC9901M37458).m47134())) >= 0) {
                    c15733.m37456(iMo15783);
                }
            } else if (abstractC16438 instanceof C2823) {
                C2823 c2823 = (C2823) abstractC16438;
                for (int i = 0; i < c2823.m8575(); i++) {
                    AbstractC9901 abstractC9901M8574 = c2823.m8574(i);
                    c2823.m8571(i, interfaceC19966.mo15783(abstractC9901M8574));
                    if (abstractC9901M8574 instanceof AbstractC20960) {
                        c2823.m8572(interfaceC19966.mo15783(((AbstractC20960) abstractC9901M8574).m47134()));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133 A[LOOP:9: B:67:0x012d->B:69:0x0133, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12205 m4932() {
        int i;
        C19052 c19052M38702;
        C23494 c23494;
        Iterator it;
        boolean z;
        if (this.f5840 >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = this.f5834.size();
        C17143[] c17143Arr = new C17143[size];
        for (int i2 = 0; i2 < size; i2++) {
            c17143Arr[i2] = ((AbstractC16438) this.f5834.get(i2)).m38693();
        }
        m4928(c17143Arr);
        this.f5835.getClass();
        do {
            int i3 = this.f5840;
            i = this.f5838;
            int i4 = i3 + i + this.f5833;
            int i5 = this.f5836;
            int i6 = i4 - i5;
            Iterator it2 = this.f5834.iterator();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it2.hasNext()) {
                C0727 c0727M38695 = ((AbstractC16438) it2.next()).m38695();
                for (int i11 = 0; i11 < c0727M38695.size(); i11++) {
                    C16251 c16251M15275get = c0727M38695.m15275get(i11);
                    if (c16251M15275get.m38393()) {
                        boolean z2 = c16251M15275get.m38400() >= i6;
                        if (c16251M15275get.m38394()) {
                            if (z2) {
                                i8++;
                            } else {
                                i10++;
                            }
                        } else if (z2) {
                            i7++;
                        } else {
                            i9++;
                        }
                    }
                }
            }
            if (i7 > i8 && i9 > i10) {
                m4925();
            } else if (i7 > i8) {
                m4930();
            } else {
                if (i9 <= i10) {
                    break;
                }
                m4925();
                if (i5 != 0 && i8 > i7) {
                    m4930();
                }
            }
        } while (m4928(c17143Arr));
        if (this.f5840 == 0) {
            int size2 = this.f5834.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC16438 abstractC16438 = (AbstractC16438) this.f5834.get(i12);
                C17143 c17143M38693 = abstractC16438.m38693();
                C17143 c17143 = c17143Arr[i12];
                if (c17143M38693 != c17143) {
                    this.f5834.set(i12, abstractC16438.mo8570(c17143));
                }
            }
        } else {
            int size3 = this.f5834.size();
            ArrayList arrayList = new ArrayList(size3 * 2);
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < size3; i13++) {
                AbstractC16438 abstractC16438M38700 = (AbstractC16438) this.f5834.get(i13);
                C17143 c17143M38694 = abstractC16438M38700.m38693();
                C17143 c17143M4929 = c17143Arr[i13];
                if (c17143M4929 != null) {
                    c23494 = null;
                    c19052M38702 = null;
                } else {
                    c17143M4929 = m4929(abstractC16438M38700);
                    BitSet bitSetMo3098 = c17143M4929.m40073().mo3098(abstractC16438M38700);
                    C23494 c23494M38696 = abstractC16438M38700.m38696(bitSetMo3098);
                    c19052M38702 = abstractC16438M38700.m38702(bitSetMo3098);
                    abstractC16438M38700 = abstractC16438M38700.m38700(bitSetMo3098);
                    c23494 = c23494M38696;
                }
                if (abstractC16438M38700 instanceof C20671) {
                    C20671 c20671 = (C20671) abstractC16438M38700;
                    if (c20671.m46516()) {
                        arrayList2.add(c20671);
                    } else {
                        if (c23494 != null) {
                            arrayList.add(c23494);
                        }
                        if (!(abstractC16438M38700 instanceof AbstractC7763) && arrayList2.size() > 0) {
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((C20671) it.next());
                            }
                            arrayList2.clear();
                        }
                        if (c17143M4929 != c17143M38694) {
                            abstractC16438M38700 = abstractC16438M38700.mo8570(c17143M4929);
                        }
                        arrayList.add(abstractC16438M38700);
                        if (c19052M38702 != null) {
                            arrayList.add(c19052M38702);
                        }
                    }
                } else {
                    if (c23494 != null) {
                        arrayList.add(c23494);
                    }
                    if (!(abstractC16438M38700 instanceof AbstractC7763)) {
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C20671) it.next());
                        }
                        arrayList2.clear();
                    }
                    if (c17143M4929 != c17143M38694) {
                        abstractC16438M38700 = abstractC16438M38700.mo8570(c17143M4929);
                    }
                    arrayList.add(abstractC16438M38700);
                    if (c19052M38702 != null) {
                        arrayList.add(c19052M38702);
                    }
                }
            }
            this.f5834 = arrayList;
        }
        do {
            int size4 = this.f5834.size();
            int iMo15536 = 0;
            for (int i14 = 0; i14 < size4; i14++) {
                AbstractC16438 abstractC16439 = (AbstractC16438) this.f5834.get(i14);
                abstractC16439.m38697(iMo15536);
                iMo15536 += abstractC16439.mo15536();
            }
            int size5 = this.f5834.size();
            int i15 = 0;
            z = false;
            while (i15 < size5) {
                AbstractC16438 abstractC164310 = (AbstractC16438) this.f5834.get(i15);
                if (abstractC164310 instanceof C9175) {
                    C17143 c17143M38695 = abstractC164310.m38693();
                    C9175 c9175 = (C9175) abstractC164310;
                    if (c17143M38695.m40073().mo10389(c9175)) {
                        continue;
                    } else {
                        if (c17143M38695.m40070() == 40) {
                            C17143 c17143M4926 = m4926(abstractC164310, c17143M38695);
                            if (c17143M4926 == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            this.f5834.set(i15, abstractC164310.mo8570(c17143M4926));
                        } else {
                            try {
                                int i16 = i15 + 1;
                                C20671 c20672 = (C20671) this.f5834.get(i16);
                                this.f5834.set(i15, new C9175(C5854.f19885, c9175.m38701(), C0727.f3015, c9175.m23590()));
                                this.f5834.add(i15, new C9175(c9175.m38693().m40074(), c9175.m38701(), c9175.m38695(), c20672));
                                size5++;
                                i15 = i16;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("unpaired TargetInsn");
                            } catch (IndexOutOfBoundsException unused2) {
                                throw new IllegalStateException("unpaired TargetInsn (dangling)");
                            }
                        }
                        z = true;
                    }
                }
                i15++;
            }
        } while (z);
        return C12205.m30303(this.f5834, this.f5840 + i + this.f5833);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m4928(C17143[] c17143Arr) {
        int i = this.f5840;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f5834.size();
            int i2 = this.f5840;
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC16438 abstractC16438 = (AbstractC16438) this.f5834.get(i3);
                C17143 c17143 = c17143Arr[i3];
                C17143 c17143M4926 = m4926(abstractC16438, c17143);
                if (c17143M4926 == null) {
                    int iM38694 = abstractC16438.m38694(m4929(abstractC16438).m40073().mo3098(abstractC16438));
                    if (iM38694 > i2) {
                        i2 = iM38694;
                    }
                } else {
                    if (c17143 == c17143M4926) {
                    }
                }
                c17143Arr[i3] = c17143M4926;
            }
            if (i < i2) {
                int i4 = i2 - i;
                int size2 = this.f5834.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AbstractC16438 abstractC16439 = (AbstractC16438) this.f5834.get(i5);
                    if (!(abstractC16439 instanceof C20671)) {
                        this.f5834.set(i5, abstractC16439.mo20431(i4));
                    }
                }
                z = true;
                i = i2;
            } else {
                this.f5840 = i;
                return z;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17143 m4926(AbstractC16438 abstractC16438, C17143 c17143) {
        while (c17143 != null) {
            if (c17143.m40073().mo3101(abstractC16438)) {
                this.f5835.getClass();
                return c17143;
            }
            c17143 = C5854.m16067(c17143);
        }
        return c17143;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C17143 m4929(AbstractC16438 abstractC16438) {
        C17143 c17143M4926 = m4926(abstractC16438.m38703(), abstractC16438.m38693());
        if (c17143M4926 != null) {
            return c17143M4926;
        }
        throw new C19508("No expanded opcode for " + abstractC16438, null);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m4925() {
        int size = this.f5834.size();
        for (int i = 0; i < size; i++) {
            AbstractC16438 abstractC16438 = (AbstractC16438) this.f5834.get(i);
            if (!(abstractC16438 instanceof C20671)) {
                this.f5834.set(i, abstractC16438.mo20431(1));
            }
        }
        this.f5840++;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m4930() {
        int size = this.f5834.size();
        int i = this.f5838 + this.f5840 + this.f5833;
        int i2 = i - this.f5836;
        C11976 c11976 = new C11976(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c11976.mo20392(i3, i3 + 1, 1);
            } else {
                c11976.mo20392(i3, i3, 1);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC16438 abstractC16438 = (AbstractC16438) this.f5834.get(i4);
            if (!(abstractC16438 instanceof C20671)) {
                this.f5834.set(i4, abstractC16438.mo29883(c11976));
            }
        }
        this.f5833++;
    }
}
