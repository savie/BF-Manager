package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBHL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11871 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC6952 f39821;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public BitSet f39822;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC6952 f39824;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4108 f39827;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f39828;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BitSet f39830;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f39832;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f39825 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f39820 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f39831 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39826 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C4129 f39829 = new C4129();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39823 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29606(AbstractC15546 abstractC15546) {
        C6330 c6330 = new C6330(abstractC15546, this);
        this.f39826.add(m29595(), c6330);
        C4108 c4108 = this.f39827;
        c4108.m11673(c6330, (C0727) null);
        c4108.m11677(c6330, (C16251) null);
    }

    public C11871(int i, int i2, C4108 c4108) {
        this.f39827 = c4108;
        this.f39828 = i;
        this.f39832 = i2;
        this.f39822 = new BitSet(c4108.m11687().size());
        this.f39830 = new BitSet(c4108.m11687().size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11871 m29592(C17661 c17661, int i, C4108 c4108) {
        C5667 c5667M41141 = c17661.m41141();
        C12018 c12018M15271get = c5667M41141.m15271get(i);
        C11871 c11871 = new C11871(i, c12018M15271get.mo29913(), c4108);
        C21895 c21895M29911 = c12018M15271get.m29911();
        int size = c21895M29911.size();
        ArrayList arrayList = c11871.f39826;
        arrayList.ensureCapacity(size);
        int size2 = c21895M29911.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(new C6330(c21895M29911.m15274get(i2), c11871));
        }
        c11871.f39822 = C4108.m11659(c5667M41141, c17661.m41140(c12018M15271get.mo29913()));
        c11871.f39830 = C4108.m11659(c5667M41141, c12018M15271get.m29916());
        C4129 c4129M29916 = c12018M15271get.m29916();
        C4129 c4129 = new C4129(c4129M29916.size());
        int size3 = c4129M29916.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c4129.add(c5667M41141.m36887(c4129M29916.get(i3)));
        }
        c11871.f39829 = c4129;
        if (c4129.size() != 0) {
            int iM29918 = c12018M15271get.m29918();
            c11871.f39825 = iM29918 < 0 ? -1 : c5667M41141.m36887(iM29918);
        }
        return c11871;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29605(C11871 c11871) {
        this.f39823.add(c11871);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m29600() {
        return this.f39823;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29615(int i) {
        this.f39826.add(0, new C9859(i, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29607(C16251 c16251) {
        this.f39826.add(0, new C9859(c16251, this));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29620(AbstractC15546 abstractC15546) {
        if (abstractC15546.m37181().m31577() == 1) {
            throw new IllegalArgumentException("last insn must branch");
        }
        ArrayList arrayList = this.f39826;
        AbstractC22454 abstractC22454 = (AbstractC22454) C19084.m43861(arrayList, 1);
        C6330 c6330 = new C6330(abstractC15546, this);
        arrayList.set(arrayList.size() - 1, c6330);
        C4108 c4108 = this.f39827;
        c4108.m11676(abstractC22454);
        c4108.m11673(c6330, (C0727) null);
        c4108.m11677(c6330, (C16251) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29603(InterfaceC2096 interfaceC2096) {
        ArrayList arrayList = this.f39826;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC22454 abstractC22454 = (AbstractC22454) arrayList.get(i);
            if (!(abstractC22454 instanceof C9859)) {
                return;
            }
            interfaceC2096.mo6637((C9859) abstractC22454);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m29624() {
        this.f39826.subList(0, m29595()).clear();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m29595() {
        ArrayList arrayList = this.f39826;
        int size = arrayList.size();
        int i = 0;
        while (i < size && (((AbstractC22454) arrayList.get(i)) instanceof C9859)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m29613() {
        return this.f39826;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m29626() {
        return this.f39826.subList(0, m29595());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29617() {
        return this.f39828;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m29627() {
        return this.f39832;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final BitSet m29596() {
        return this.f39822;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BitSet m29622() {
        return this.f39830;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4129 m29625() {
        return this.f39829;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m29599() {
        return this.f39825;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m29610() {
        return this.f39827.m11669(this.f39825);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C11871 m29616() {
        if (this.f39825 < 0) {
            return null;
        }
        return (C11871) this.f39827.m11687().get(this.f39825);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C4129 m29621() {
        C4129 c4129 = new C4129(this.f39829.size());
        int size = this.f39829.size();
        for (int i = 0; i < size; i++) {
            c4129.add(this.f39827.m11669(this.f39829.get(i)));
        }
        return c4129;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4108 m29609() {
        return this.f39827;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11871 m29623() {
        C4108 c4108 = this.f39827;
        C11871 c11871M11694 = c4108.m11694();
        c11871M11694.f39822 = this.f39822;
        BitSet bitSet = c11871M11694.f39830;
        int i = this.f39828;
        bitSet.set(i);
        c11871M11694.f39829.add(i);
        c11871M11694.f39825 = i;
        BitSet bitSet2 = new BitSet(c4108.m11687().size());
        this.f39822 = bitSet2;
        int i2 = c11871M11694.f39828;
        bitSet2.set(i2);
        for (int iNextSetBit = c11871M11694.f39822.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = c11871M11694.f39822.nextSetBit(iNextSetBit + 1)) {
            ((C11871) c4108.m11687().get(iNextSetBit)).m29602(i, i2);
        }
        return c11871M11694;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11871 m29614(C11871 c11871) {
        C11871 c11871M11694 = this.f39827.m11694();
        int i = c11871M11694.f39828;
        BitSet bitSet = this.f39830;
        int i2 = c11871.f39828;
        int i3 = c11871.f39828;
        if (!bitSet.get(i2)) {
            throw new RuntimeException("Block " + C22475.m49982(c11871.f39832) + " not successor of " + C22475.m49982(this.f39832));
        }
        BitSet bitSet2 = c11871M11694.f39822;
        int i4 = this.f39828;
        bitSet2.set(i4);
        c11871M11694.f39830.set(i3);
        c11871M11694.f39829.add(i3);
        c11871M11694.f39825 = i3;
        int size = this.f39829.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f39829.get(size) == i3) {
                this.f39829.set(size, i);
            }
        }
        if (this.f39825 == i3) {
            this.f39825 = i;
        }
        this.f39830.clear(i3);
        this.f39830.set(i);
        c11871.f39822.set(i);
        c11871.f39822.set(i4, this.f39830.get(i3));
        return c11871M11694;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29602(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.f39830.set(i2);
        if (this.f39825 == i) {
            this.f39825 = i2;
        }
        int size = this.f39829.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.f39829.get(size) == i) {
                    this.f39829.set(size, i2);
                }
            } else {
                this.f39830.clear(i);
                C4108 c4108 = this.f39827;
                BitSet bitSet = ((C11871) c4108.m11687().get(i2)).f39822;
                int i3 = this.f39828;
                bitSet.set(i3);
                ((C11871) c4108.m11687().get(i)).f39822.clear(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29598(int i) {
        int i2 = 0;
        for (int size = this.f39829.size() - 1; size >= 0; size--) {
            if (this.f39829.get(size) == i) {
                i2 = size;
            } else {
                this.f39825 = this.f39829.get(size);
            }
        }
        this.f39829.m11759(i2);
        this.f39830.clear(i);
        ((C11871) this.f39827.m11687().get(i)).f39822.clear(this.f39828);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29619(C11871 c11871) {
        if (this != c11871 && this.f39829.size() == 0) {
            BitSet bitSet = this.f39830;
            int i = c11871.f39828;
            bitSet.set(i);
            this.f39829.add(i);
            this.f39825 = i;
            c11871.f39822.set(this.f39828);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29608(C16251 c16251, C16251 c16252) {
        if (this.f39830.cardinality() > 1) {
            throw new IllegalStateException("Inserting a move to a block with multiple successors");
        }
        if (c16251.m38400() == c16252.m38400()) {
            return;
        }
        ArrayList arrayList = this.f39826;
        C6330 c6330 = (C6330) C19084.m43861(arrayList, 1);
        if (c6330.m49955() == null && c6330.mo17429().size() <= 0) {
            arrayList.add(arrayList.size() - 1, new C6330(new C10607(C6372.m17490(c16251.getType()), C11312.f38175, c16251, C0727.m3151(c16252)), this));
            this.f39820++;
            return;
        }
        int iNextSetBit = this.f39830.nextSetBit(0);
        while (iNextSetBit >= 0) {
            C11871 c11871 = (C11871) this.f39827.m11687().get(iNextSetBit);
            c11871.getClass();
            if (c16251.m38400() != c16252.m38400()) {
                c11871.f39826.add(c11871.m29595(), new C6330(new C10607(C6372.m17490(c16251.getType()), C11312.f38175, c16251, C0727.m3151(c16252)), c11871));
                c11871.f39831++;
            }
            iNextSetBit = this.f39830.nextSetBit(iNextSetBit + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29594(BitSet bitSet, C16251 c16251) {
        int iM38400 = c16251.m38400();
        return bitSet.get(iM38400) || (c16251.m38396() == 2 && bitSet.get(iM38400 + 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29593(List list) {
        AbstractC22454 abstractC22454;
        C4108 c4108 = this.f39827;
        BitSet bitSet = new BitSet(c4108.m11685());
        BitSet bitSet2 = new BitSet(c4108.m11685());
        int size = list.size();
        int i = 0;
        while (i < size) {
            for (int i2 = i; i2 < size; i2++) {
                C16251 c16251M15275get = ((AbstractC22454) list.get(i2)).mo17429().m15275get(0);
                bitSet.set(c16251M15275get.m38400());
                if (c16251M15275get.m38396() > 1) {
                    bitSet.set(c16251M15275get.m38400() + 1);
                }
                C16251 c16251M49955 = ((AbstractC22454) list.get(i2)).m49955();
                bitSet2.set(c16251M49955.m38400());
                if (c16251M49955.m38396() > 1) {
                    bitSet2.set(c16251M49955.m38400() + 1);
                }
            }
            int i3 = i;
            int i4 = i3;
            while (i3 < size) {
                if (!m29594(bitSet, ((AbstractC22454) list.get(i3)).m49955())) {
                    Collections.swap(list, i3, i4);
                    i4++;
                }
                i3++;
            }
            if (i == i4) {
                int i5 = i4;
                while (true) {
                    if (i5 >= size) {
                        abstractC22454 = null;
                        break;
                    }
                    abstractC22454 = (AbstractC22454) list.get(i5);
                    if (m29594(bitSet, abstractC22454.m49955()) && m29594(bitSet2, abstractC22454.mo17429().m15275get(0))) {
                        Collections.swap(list, i4, i5);
                        break;
                    }
                    i5++;
                }
                C16251 c16251M49956 = abstractC22454.m49955();
                C16251 c16251M38397 = c16251M49956.m38397(c4108.m11686(c16251M49956.m38396()));
                C12723 c12723M17490 = C6372.m17490(c16251M49956.getType());
                C11312 c11312 = C11312.f38175;
                C6330 c6330 = new C6330(new C10607(c12723M17490, c11312, c16251M38397, abstractC22454.mo17429()), this);
                int i6 = i4 + 1;
                list.add(i4, c6330);
                list.set(i6, new C6330(new C10607(C6372.m17490(c16251M49956.getType()), c11312, c16251M49956, C0727.m3151(c16251M38397)), this));
                size = list.size();
                i = i6;
            } else {
                i = i4;
            }
            bitSet.clear();
            bitSet2.clear();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29618(int i) {
        InterfaceC6952 c18241;
        if (this.f39824 == null) {
            int iM11685 = this.f39827.m11685();
            if (iM11685 <= 3072) {
                c18241 = new C1991(iM11685);
            } else {
                c18241 = new C18241();
            }
            this.f39824 = c18241;
        }
        this.f39824.add(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29601(int i) {
        InterfaceC6952 c18241;
        if (this.f39821 == null) {
            int iM11685 = this.f39827.m11685();
            if (iM11685 <= 3072) {
                c18241 = new C1991(iM11685);
            } else {
                c18241 = new C18241();
            }
            this.f39821 = c18241;
        }
        this.f39821.add(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6952 m29597() {
        InterfaceC6952 c18241;
        if (this.f39824 == null) {
            int iM11685 = this.f39827.m11685();
            if (iM11685 <= 3072) {
                c18241 = new C1991(iM11685);
            } else {
                c18241 = new C18241();
            }
            this.f39824 = c18241;
        }
        return this.f39824;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m29611() {
        return this.f39828 == this.f39827.m11693();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m29612() {
        int i = this.f39831;
        ArrayList arrayList = this.f39826;
        if (i > 1) {
            m29593(arrayList.subList(0, i));
            if (((AbstractC22454) arrayList.get(this.f39831)).mo17430()) {
                throw new RuntimeException("Unexpected: moves from phis before move-exception");
            }
        }
        if (this.f39820 > 1) {
            m29593(arrayList.subList((arrayList.size() - this.f39820) - 1, arrayList.size() - 1));
        }
        this.f39827.m11690();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29604(InterfaceC5520 interfaceC5520) {
        ArrayList arrayList = this.f39826;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC22454) arrayList.get(i)).mo17420(interfaceC5520);
        }
    }

    public final String toString() {
        return "{" + this.f39828 + ":" + C22475.m49982(this.f39832) + '}';
    }
}
