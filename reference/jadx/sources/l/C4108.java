package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: l.ۘᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4108 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f15057;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC22454[] f15058;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f15059;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f15060 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f15061;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f15062;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f15063;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f15064;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f15065;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList[] f15066;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f15067;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public List[] f15068;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4108 m11660(C17661 c17661, int i) {
        C4108 c4108 = new C4108(c17661, i);
        int size = c17661.m41141().size();
        c4108.f15065 = new ArrayList(size + 2);
        for (int i2 = 0; i2 < size; i2++) {
            c4108.f15065.add(C11871.m29592(c17661, i2, c4108));
        }
        c4108.f15061 = ((C11871) c4108.f15065.get(c17661.m41141().m36887(c17661.m41142()))).m29623().m29617();
        c4108.f15067 = -1;
        return c4108;
    }

    public C4108(C17661 c17661, int i) {
        this.f15064 = i;
        this.f15057 = c17661.m41141().m36890();
        int iM15555 = c17661.m41141().m15555();
        this.f15059 = iM15555;
        this.f15062 = iM15555;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BitSet m11659(C5667 c5667, C4129 c4129) {
        BitSet bitSet = new BitSet(c5667.size());
        int size = c4129.size();
        for (int i = 0; i < size; i++) {
            bitSet.set(c5667.m36887(c4129.get(i)));
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m11682() {
        if (this.f15067 >= 0) {
            throw new RuntimeException("must be called at most once");
        }
        int size = this.f15065.size();
        this.f15067 = size;
        int i = this.f15057;
        this.f15057 = i + 1;
        C11871 c11871 = new C11871(size, i, this);
        this.f15065.add(c11871);
        Iterator it = this.f15065.iterator();
        while (it.hasNext()) {
            ((C11871) it.next()).m29619(c11871);
        }
        if (c11871.m29596().cardinality() == 0) {
            this.f15065.remove(this.f15067);
            this.f15067 = -1;
            this.f15057--;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C11871 m11694() {
        int size = this.f15065.size();
        int i = this.f15057;
        this.f15057 = i + 1;
        C11871 c11871 = new C11871(size, i, this);
        c11871.m29613().add(new C6330(new C10607(C6372.f21606, C11312.f38175, (C16251) null, C0727.f3015), c11871));
        this.f15065.add(c11871);
        return c11871;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m11666() {
        return this.f15061;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11871 m11683() {
        return (C11871) this.f15065.get(this.f15061);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m11693() {
        return this.f15067;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11871 m11680() {
        int i = this.f15067;
        if (i < 0) {
            return null;
        }
        return (C11871) this.f15065.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11669(int i) {
        if (i < 0) {
            return -1;
        }
        return ((C11871) this.f15065.get(i)).m29627();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m11685() {
        return this.f15059;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m11665() {
        return this.f15064;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m11686(int i) {
        int i2 = this.f15062;
        int i3 = this.f15063;
        int i4 = i2 + i3;
        this.f15063 = i3 + i;
        this.f15059 = Math.max(this.f15059, i + i4);
        return i4;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m11690() {
        this.f15063 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11674(C11976 c11976) {
        Iterator it = this.f15065.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C11871) it.next()).m29613().iterator();
            while (it2.hasNext()) {
                ((AbstractC22454) it2.next()).m49951(c11976);
            }
        }
        int iM29784 = c11976.m29784();
        this.f15059 = iM29784;
        this.f15062 = iM29784;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m11687() {
        return this.f15065;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m11670() {
        int size = this.f15065.size();
        BitSet bitSet = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        bitSet.set(m11683().m29617());
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit == -1) {
                return bitSet2;
            }
            bitSet2.set(iNextSetBit);
            bitSet.or(((C11871) this.f15065.get(iNextSetBit)).m29622());
            bitSet.andNot(bitSet2);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22454 m11684(int i) {
        if (this.f15060) {
            throw new RuntimeException("No def list in back mode");
        }
        AbstractC22454[] abstractC22454Arr = this.f15058;
        if (abstractC22454Arr != null) {
            return abstractC22454Arr[i];
        }
        this.f15058 = new AbstractC22454[this.f15059];
        m11672(new C1286(this));
        return this.f15058[i];
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m11663() {
        if (this.f15060) {
            throw new RuntimeException("No use list in back mode");
        }
        this.f15066 = new ArrayList[this.f15059];
        for (int i = 0; i < this.f15059; i++) {
            this.f15066[i] = new ArrayList();
        }
        m11672(new C13282(this));
        this.f15068 = new List[this.f15059];
        for (int i2 = 0; i2 < this.f15059; i2++) {
            this.f15068[i2] = C0561.unmodifiableList(this.f15066[i2]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11678(AbstractC22454 abstractC22454, C16251 c16251, C16251 c16252) {
        if (this.f15066 == null) {
            return;
        }
        if (c16251 != null) {
            this.f15066[c16251.m38400()].remove(abstractC22454);
        }
        int iM38400 = c16252.m38400();
        ArrayList[] arrayListArr = this.f15066;
        if (arrayListArr.length <= iM38400) {
            this.f15066 = null;
        } else {
            arrayListArr[iM38400].add(abstractC22454);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11673(C6330 c6330, C0727 c0727) {
        if (this.f15066 == null) {
            return;
        }
        if (c0727 != null) {
            m11661((AbstractC22454) c6330, c0727);
        }
        C0727 c0727Mo17429 = c6330.mo17429();
        int size = c0727Mo17429.size();
        for (int i = 0; i < size; i++) {
            this.f15066[c0727Mo17429.m15275get(i).m38400()].add(c6330);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11661(AbstractC22454 abstractC22454, C0727 c0727) {
        if (c0727 == null) {
            return;
        }
        int size = c0727.size();
        for (int i = 0; i < size; i++) {
            if (!this.f15066[c0727.m15275get(i).m38400()].remove(abstractC22454)) {
                throw new RuntimeException("use not found");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11676(AbstractC22454 abstractC22454) {
        if (this.f15066 != null) {
            m11661(abstractC22454, abstractC22454.mo17429());
        }
        C16251 c16251M49955 = abstractC22454.m49955();
        AbstractC22454[] abstractC22454Arr = this.f15058;
        if (abstractC22454Arr == null || c16251M49955 == null) {
            return;
        }
        abstractC22454Arr[c16251M49955.m38400()] = null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m11692() {
        this.f15058 = null;
        this.f15066 = null;
        this.f15068 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11677(AbstractC22454 abstractC22454, C16251 c16251) {
        if (this.f15058 == null) {
            return;
        }
        if (c16251 != null) {
            this.f15058[c16251.m38400()] = null;
        }
        C16251 c16251M49955 = abstractC22454.m49955();
        if (c16251M49955 != null) {
            int iM38400 = c16251M49955.m38400();
            AbstractC22454[] abstractC22454Arr = this.f15058;
            if (abstractC22454Arr[iM38400] != null) {
                throw new RuntimeException("Duplicate add of insn");
            }
            abstractC22454Arr[c16251M49955.m38400()] = abstractC22454;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m11667(int i) {
        if (this.f15068 == null) {
            m11663();
        }
        return this.f15068[i];
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList[] m11668() {
        if (this.f15066 == null) {
            m11663();
        }
        ArrayList[] arrayListArr = new ArrayList[this.f15059];
        for (int i = 0; i < this.f15059; i++) {
            arrayListArr[i] = new ArrayList(this.f15066[i]);
        }
        return arrayListArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11679(C16251 c16251) {
        AbstractC22454 abstractC22454M11684 = m11684(c16251.m38400());
        if (abstractC22454M11684 == null) {
            return false;
        }
        if (abstractC22454M11684.mo17432() != null) {
            return true;
        }
        Iterator it = m11667(c16251.m38400()).iterator();
        while (it.hasNext()) {
            AbstractC15546 abstractC15546Mo17428 = ((AbstractC22454) it.next()).mo17428();
            if (abstractC15546Mo17428 != null && abstractC15546Mo17428.m37181().m31572() == 54) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m11681(int i) {
        this.f15059 = i;
        this.f15062 = i;
        m11692();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m11689() {
        int i = this.f15059;
        int i2 = i + 1;
        this.f15059 = i2;
        this.f15062 = i2;
        m11692();
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11672(InterfaceC5520 interfaceC5520) {
        Iterator it = this.f15065.iterator();
        while (it.hasNext()) {
            ((C11871) it.next()).m29604(interfaceC5520);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11675(InterfaceC13988 interfaceC13988) {
        BitSet bitSet = new BitSet(this.f15065.size());
        Stack stack = new Stack();
        C11871 c11871M11683 = m11683();
        if (c11871M11683 == null) {
            return;
        }
        stack.add(null);
        stack.add(c11871M11683);
        while (stack.size() > 0) {
            C11871 c11871 = (C11871) stack.pop();
            C11871 c11872 = (C11871) stack.pop();
            if (!bitSet.get(c11871.m29617())) {
                BitSet bitSetM29622 = c11871.m29622();
                for (int iNextSetBit = bitSetM29622.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM29622.nextSetBit(iNextSetBit + 1)) {
                    stack.add(c11871);
                    stack.add((C11871) this.f15065.get(iNextSetBit));
                }
                bitSet.set(c11871.m29617());
                interfaceC13988.mo18588(c11871, c11872);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11688(InterfaceC13988 interfaceC13988) {
        BitSet bitSet = new BitSet(this.f15065.size());
        Stack stack = new Stack();
        stack.add(m11683());
        while (stack.size() > 0) {
            C11871 c11871 = (C11871) stack.pop();
            ArrayList arrayListM29600 = c11871.m29600();
            if (!bitSet.get(c11871.m29617())) {
                int size = arrayListM29600.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        stack.add((C11871) arrayListM29600.get(size));
                    }
                }
                bitSet.set(c11871.m29617());
                interfaceC13988.mo18588(c11871, null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11671(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC22454 abstractC22454 = (AbstractC22454) it.next();
            C11871 c11871M49949 = abstractC22454.m49949();
            ArrayList arrayListM29613 = c11871M49949.m29613();
            for (int size = arrayListM29613.size() - 1; size >= 0; size--) {
                AbstractC22454 abstractC22455 = (AbstractC22454) arrayListM29613.get(size);
                if (abstractC22454 == abstractC22455) {
                    m11676(abstractC22455);
                    arrayListM29613.remove(size);
                    break;
                }
            }
            int size2 = arrayListM29613.size();
            AbstractC22454 abstractC22456 = size2 == 0 ? null : (AbstractC22454) arrayListM29613.get(size2 - 1);
            if (c11871M49949 != m11680() && (size2 == 0 || abstractC22456.mo17428() == null || abstractC22456.mo17428().m37181().m31577() == 1)) {
                arrayListM29613.add(new C6330(new C10607(C6372.f21606, C11312.f38175, (C16251) null, C0727.f3015), c11871M49949));
                BitSet bitSetM29622 = c11871M49949.m29622();
                for (int iNextSetBit = bitSetM29622.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM29622.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != c11871M49949.m29599()) {
                        c11871M49949.m29598(iNextSetBit);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m11691() {
        this.f15060 = true;
        this.f15066 = null;
        this.f15058 = null;
    }
}
