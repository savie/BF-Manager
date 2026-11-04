package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: l.᩻ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFP */
/* JADX INFO: loaded from: classes.dex */
public final class C24960 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f80823;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80824 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f80825;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f80826;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f80827;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f80828;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f80829;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList[] f80830;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f80831;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f80832;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC5568[] f80833;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List[] f80834;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24960 m55721(C9757 c9757, int i) {
        C24960 c24960 = new C24960(c9757, i);
        int size = c9757.m25432().size();
        c24960.f80832 = new ArrayList(size + 2);
        for (int i2 = 0; i2 < size; i2++) {
            c24960.f80832.add(C19738.m45444(c9757, i2, c24960));
        }
        c24960.f80831 = ((C19738) c24960.f80832.get(c9757.m25432().m37669(c9757.m25434()))).m45478().m45472();
        c24960.f80829 = -1;
        return c24960;
    }

    public C24960(C9757 c9757, int i) {
        this.f80825 = i;
        this.f80828 = c9757.m25432().m37668();
        int iM36043 = c9757.m25432().m36043();
        this.f80823 = iM36043;
        this.f80827 = iM36043;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BitSet m55720(C14978 c14978, C24698 c24698) {
        BitSet bitSet = new BitSet(c14978.size());
        int size = c24698.size();
        for (int i = 0; i < size; i++) {
            bitSet.set(c14978.m37669(c24698.get(i)));
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m55740() {
        if (this.f80829 >= 0) {
            throw new RuntimeException("must be called at most once");
        }
        int size = this.f80832.size();
        this.f80829 = size;
        int i = this.f80828;
        this.f80828 = i + 1;
        C19738 c19738 = new C19738(size, i, this);
        this.f80832.add(c19738);
        Iterator it = this.f80832.iterator();
        while (it.hasNext()) {
            ((C19738) it.next()).m45475(c19738);
        }
        if (c19738.m45465().cardinality() == 0) {
            this.f80832.remove(this.f80829);
            this.f80829 = -1;
            this.f80828--;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19738 m55754() {
        int size = this.f80832.size();
        int i = this.f80828;
        this.f80828 = i + 1;
        C19738 c19738 = new C19738(size, i, this);
        c19738.m45460().add(new C1356(new C23930(C0809.f3062, C9012.f29360, (C20946) null, C0063.f947), c19738));
        this.f80832.add(c19738);
        return c19738;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m55751() {
        return this.f80831;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19738 m55739() {
        return (C19738) this.f80832.get(this.f80831);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m55742() {
        return this.f80829;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19738 m55746() {
        int i = this.f80829;
        if (i < 0) {
            return null;
        }
        return (C19738) this.f80832.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55726(int i) {
        if (i < 0) {
            return -1;
        }
        return ((C19738) this.f80832.get(i)).m45479();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m55737() {
        return this.f80823;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m55741() {
        return this.f80825;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m55748(int i) {
        int i2 = this.f80827;
        int i3 = this.f80826;
        int i4 = i2 + i3;
        this.f80826 = i3 + i;
        this.f80823 = Math.max(this.f80823, i + i4);
        return i4;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m55743() {
        this.f80826 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55735(C22985 c22985) {
        Iterator it = this.f80832.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C19738) it.next()).m45460().iterator();
            while (it2.hasNext()) {
                ((AbstractC5568) it2.next()).m16505(c22985);
            }
        }
        int iM51867 = c22985.m51867();
        this.f80823 = iM51867;
        this.f80827 = iM51867;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m55749() {
        return this.f80832;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m55727() {
        int size = this.f80832.size();
        BitSet bitSet = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        bitSet.set(m55739().m45472());
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit == -1) {
                return bitSet2;
            }
            bitSet2.set(iNextSetBit);
            bitSet.or(((C19738) this.f80832.get(iNextSetBit)).m45467());
            bitSet.andNot(bitSet2);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC5568 m55738(int i) {
        if (this.f80824) {
            throw new RuntimeException("No def list in back mode");
        }
        AbstractC5568[] abstractC5568Arr = this.f80833;
        if (abstractC5568Arr != null) {
            return abstractC5568Arr[i];
        }
        this.f80833 = new AbstractC5568[this.f80823];
        m55733(new C1839(this));
        return this.f80833[i];
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m55719() {
        if (this.f80824) {
            throw new RuntimeException("No use list in back mode");
        }
        this.f80830 = new ArrayList[this.f80823];
        for (int i = 0; i < this.f80823; i++) {
            this.f80830[i] = new ArrayList();
        }
        m55733(new C11533(this));
        this.f80834 = new List[this.f80823];
        for (int i2 = 0; i2 < this.f80823; i2++) {
            this.f80834[i2] = C4681.unmodifiableList(this.f80830[i2]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55732(AbstractC5568 abstractC5568, C20946 c20946, C20946 c20947) {
        if (this.f80830 == null) {
            return;
        }
        if (c20946 != null) {
            this.f80830[c20946.m47903()].remove(abstractC5568);
        }
        int iM47903 = c20947.m47903();
        ArrayList[] arrayListArr = this.f80830;
        if (arrayListArr.length <= iM47903) {
            this.f80830 = null;
        } else {
            arrayListArr[iM47903].add(abstractC5568);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55729(C1356 c1356, C0063 c0063) {
        if (this.f80830 == null) {
            return;
        }
        if (c0063 != null) {
            m55722((AbstractC5568) c1356, c0063);
        }
        C0063 c0063Mo4992 = c1356.mo4992();
        int size = c0063Mo4992.size();
        for (int i = 0; i < size; i++) {
            this.f80830[c0063Mo4992.m31619get(i).m47903()].add(c1356);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55722(AbstractC5568 abstractC5568, C0063 c0063) {
        if (c0063 == null) {
            return;
        }
        int size = c0063.size();
        for (int i = 0; i < size; i++) {
            if (!this.f80830[c0063.m31619get(i).m47903()].remove(abstractC5568)) {
                throw new RuntimeException("use not found");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55730(AbstractC5568 abstractC5568) {
        if (this.f80830 != null) {
            m55722(abstractC5568, abstractC5568.mo4992());
        }
        C20946 c20946M16508 = abstractC5568.m16508();
        AbstractC5568[] abstractC5568Arr = this.f80833;
        if (abstractC5568Arr == null || c20946M16508 == null) {
            return;
        }
        abstractC5568Arr[c20946M16508.m47903()] = null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m55745() {
        this.f80833 = null;
        this.f80830 = null;
        this.f80834 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55731(AbstractC5568 abstractC5568, C20946 c20946) {
        if (this.f80833 == null) {
            return;
        }
        if (c20946 != null) {
            this.f80833[c20946.m47903()] = null;
        }
        C20946 c20946M16508 = abstractC5568.m16508();
        if (c20946M16508 != null) {
            int iM47903 = c20946M16508.m47903();
            AbstractC5568[] abstractC5568Arr = this.f80833;
            if (abstractC5568Arr[iM47903] != null) {
                throw new RuntimeException("Duplicate add of insn");
            }
            abstractC5568Arr[c20946M16508.m47903()] = abstractC5568;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m55752(int i) {
        if (this.f80834 == null) {
            m55719();
        }
        return this.f80834[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList[] m55725() {
        if (this.f80830 == null) {
            m55719();
        }
        ArrayList[] arrayListArr = new ArrayList[this.f80823];
        for (int i = 0; i < this.f80823; i++) {
            arrayListArr[i] = new ArrayList(this.f80830[i]);
        }
        return arrayListArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55736(C20946 c20946) {
        AbstractC5568 abstractC5568M55738 = m55738(c20946.m47903());
        if (abstractC5568M55738 == null) {
            return false;
        }
        if (abstractC5568M55738.mo4991() != null) {
            return true;
        }
        Iterator it = m55752(c20946.m47903()).iterator();
        while (it.hasNext()) {
            AbstractC17216 abstractC17216Mo4993 = ((AbstractC5568) it.next()).mo4993();
            if (abstractC17216Mo4993 != null && abstractC17216Mo4993.m40434().m43509() == 54) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m55747(int i) {
        this.f80823 = i;
        this.f80827 = i;
        m55745();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m55744() {
        int i = this.f80823;
        int i2 = i + 1;
        this.f80823 = i2;
        this.f80827 = i2;
        m55745();
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55733(InterfaceC13025 interfaceC13025) {
        Iterator it = this.f80832.iterator();
        while (it.hasNext()) {
            ((C19738) it.next()).m45454(interfaceC13025);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55734(InterfaceC22722 interfaceC22722) {
        BitSet bitSet = new BitSet(this.f80832.size());
        Stack stack = new Stack();
        C19738 c19738M55739 = m55739();
        if (c19738M55739 == null) {
            return;
        }
        stack.add(null);
        stack.add(c19738M55739);
        while (stack.size() > 0) {
            C19738 c19738 = (C19738) stack.pop();
            C19738 c19739 = (C19738) stack.pop();
            if (!bitSet.get(c19738.m45472())) {
                BitSet bitSetM45467 = c19738.m45467();
                for (int iNextSetBit = bitSetM45467.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM45467.nextSetBit(iNextSetBit + 1)) {
                    stack.add(c19738);
                    stack.add((C19738) this.f80832.get(iNextSetBit));
                }
                bitSet.set(c19738.m45472());
                interfaceC22722.mo4093(c19738, c19739);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55750(InterfaceC22722 interfaceC22722) {
        BitSet bitSet = new BitSet(this.f80832.size());
        Stack stack = new Stack();
        stack.add(m55739());
        while (stack.size() > 0) {
            C19738 c19738 = (C19738) stack.pop();
            ArrayList arrayListM45450 = c19738.m45450();
            if (!bitSet.get(c19738.m45472())) {
                int size = arrayListM45450.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        stack.add((C19738) arrayListM45450.get(size));
                    }
                }
                bitSet.set(c19738.m45472());
                interfaceC22722.mo4093(c19738, null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55728(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC5568 abstractC5568 = (AbstractC5568) it.next();
            C19738 c19738M16506 = abstractC5568.m16506();
            ArrayList arrayListM45460 = c19738M16506.m45460();
            for (int size = arrayListM45460.size() - 1; size >= 0; size--) {
                AbstractC5568 abstractC5569 = (AbstractC5568) arrayListM45460.get(size);
                if (abstractC5568 == abstractC5569) {
                    m55730(abstractC5569);
                    arrayListM45460.remove(size);
                    break;
                }
            }
            int size2 = arrayListM45460.size();
            AbstractC5568 abstractC55610 = size2 == 0 ? null : (AbstractC5568) arrayListM45460.get(size2 - 1);
            if (c19738M16506 != m55746() && (size2 == 0 || abstractC55610.mo4993() == null || abstractC55610.mo4993().m40434().m43508() == 1)) {
                arrayListM45460.add(new C1356(new C23930(C0809.f3062, C9012.f29360, (C20946) null, C0063.f947), c19738M16506));
                BitSet bitSetM45467 = c19738M16506.m45467();
                for (int iNextSetBit = bitSetM45467.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM45467.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != c19738M16506.m45448()) {
                        c19738M16506.m45477(iNextSetBit);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m55753() {
        this.f80824 = true;
        this.f80830 = null;
        this.f80833 = null;
    }
}
