package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBHL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19738 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public BitSet f63516;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C24960 f63518;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public BitSet f63524;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC16492 f63525;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f63526;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC16492 f63527;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f63528;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f63520 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f63521 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f63522 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63519 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C24698 f63523 = new C24698();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63517 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45455(AbstractC17216 abstractC17216) {
        C1356 c1356 = new C1356(abstractC17216, this);
        this.f63519.add(m45447(), c1356);
        C24960 c24960 = this.f63518;
        c24960.m55729(c1356, (C0063) null);
        c24960.m55731(c1356, (C20946) null);
    }

    public C19738(int i, int i2, C24960 c24960) {
        this.f63518 = c24960;
        this.f63526 = i;
        this.f63528 = i2;
        this.f63516 = new BitSet(c24960.m55749().size());
        this.f63524 = new BitSet(c24960.m55749().size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19738 m45444(C9757 c9757, int i, C24960 c24960) {
        C14978 c14978M25432 = c9757.m25432();
        C22438 c22438M31620get = c14978M25432.m31620get(i);
        C19738 c19738 = new C19738(i, c22438M31620get.mo31292(), c24960);
        C15724 c15724M50596 = c22438M31620get.m50596();
        int size = c15724M50596.size();
        ArrayList arrayList = c19738.f63519;
        arrayList.ensureCapacity(size);
        int size2 = c15724M50596.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(new C1356(c15724M50596.m31617get(i2), c19738));
        }
        c19738.f63516 = C24960.m55720(c14978M25432, c9757.m25433(c22438M31620get.mo31292()));
        c19738.f63524 = C24960.m55720(c14978M25432, c22438M31620get.m50590());
        C24698 c24698M50590 = c22438M31620get.m50590();
        C24698 c24698 = new C24698(c24698M50590.size());
        int size3 = c24698M50590.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c24698.add(c14978M25432.m37669(c24698M50590.get(i3)));
        }
        c19738.f63523 = c24698;
        if (c24698.size() != 0) {
            int iM50593 = c22438M31620get.m50593();
            c19738.f63520 = iM50593 < 0 ? -1 : c14978M25432.m37669(iM50593);
        }
        return c19738;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45456(C19738 c19738) {
        this.f63517.add(c19738);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45450() {
        return this.f63517;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45462(int i) {
        this.f63519.add(0, new C14033(i, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45457(C20946 c20946) {
        this.f63519.add(0, new C14033(c20946, this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45474(AbstractC17216 abstractC17216) {
        if (abstractC17216.m40434().m43508() == 1) {
            throw new IllegalArgumentException("last insn must branch");
        }
        ArrayList arrayList = this.f63519;
        AbstractC5568 abstractC5568 = (AbstractC5568) j$$ExternalSyntheticOutline0.m(arrayList, 1);
        C1356 c1356 = new C1356(abstractC17216, this);
        arrayList.set(arrayList.size() - 1, c1356);
        C24960 c24960 = this.f63518;
        c24960.m55730(abstractC5568);
        c24960.m55729(c1356, (C0063) null);
        c24960.m55731(c1356, (C20946) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45453(InterfaceC7322 interfaceC7322) {
        ArrayList arrayList = this.f63519;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC5568 abstractC5568 = (AbstractC5568) arrayList.get(i);
            if (!(abstractC5568 instanceof C14033)) {
                return;
            }
            interfaceC7322.mo20078((C14033) abstractC5568);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m45471() {
        this.f63519.subList(0, m45447()).clear();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private int m45447() {
        ArrayList arrayList = this.f63519;
        int size = arrayList.size();
        int i = 0;
        while (i < size && (((AbstractC5568) arrayList.get(i)) instanceof C14033)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45460() {
        return this.f63519;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m45466() {
        return this.f63519.subList(0, m45447());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m45472() {
        return this.f63526;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m45479() {
        return this.f63528;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final BitSet m45465() {
        return this.f63516;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final BitSet m45467() {
        return this.f63524;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C24698 m45469() {
        return this.f63523;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45448() {
        return this.f63520;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45463() {
        return this.f63518.m55726(this.f63520);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19738 m45459() {
        if (this.f63520 < 0) {
            return null;
        }
        return (C19738) this.f63518.m55749().get(this.f63520);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C24698 m45468() {
        C24698 c24698 = new C24698(this.f63523.size());
        int size = this.f63523.size();
        for (int i = 0; i < size; i++) {
            c24698.add(this.f63518.m55726(this.f63523.get(i)));
        }
        return c24698;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24960 m45470() {
        return this.f63518;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19738 m45478() {
        C24960 c24960 = this.f63518;
        C19738 c19738M55754 = c24960.m55754();
        c19738M55754.f63516 = this.f63516;
        BitSet bitSet = c19738M55754.f63524;
        int i = this.f63526;
        bitSet.set(i);
        c19738M55754.f63523.add(i);
        c19738M55754.f63520 = i;
        BitSet bitSet2 = new BitSet(c24960.m55749().size());
        this.f63516 = bitSet2;
        int i2 = c19738M55754.f63526;
        bitSet2.set(i2);
        for (int iNextSetBit = c19738M55754.f63516.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = c19738M55754.f63516.nextSetBit(iNextSetBit + 1)) {
            ((C19738) c24960.m55749().get(iNextSetBit)).m45452(i, i2);
        }
        return c19738M55754;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19738 m45461(C19738 c19738) {
        C19738 c19738M55754 = this.f63518.m55754();
        int i = c19738M55754.f63526;
        BitSet bitSet = this.f63524;
        int i2 = c19738.f63526;
        int i3 = c19738.f63526;
        if (!bitSet.get(i2)) {
            throw new RuntimeException("Block " + C5306.m15934(c19738.f63528) + " not successor of " + C5306.m15934(this.f63528));
        }
        BitSet bitSet2 = c19738M55754.f63516;
        int i4 = this.f63526;
        bitSet2.set(i4);
        c19738M55754.f63524.set(i3);
        c19738M55754.f63523.add(i3);
        c19738M55754.f63520 = i3;
        int size = this.f63523.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f63523.get(size) == i3) {
                this.f63523.set(size, i);
            }
        }
        if (this.f63520 == i3) {
            this.f63520 = i;
        }
        this.f63524.clear(i3);
        this.f63524.set(i);
        c19738.f63516.set(i);
        c19738.f63516.set(i4, this.f63524.get(i3));
        return c19738M55754;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45452(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.f63524.set(i2);
        if (this.f63520 == i) {
            this.f63520 = i2;
        }
        int size = this.f63523.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.f63523.get(size) == i) {
                    this.f63523.set(size, i2);
                }
            } else {
                this.f63524.clear(i);
                C24960 c24960 = this.f63518;
                BitSet bitSet = ((C19738) c24960.m55749().get(i2)).f63516;
                int i3 = this.f63526;
                bitSet.set(i3);
                ((C19738) c24960.m55749().get(i)).f63516.clear(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m45477(int i) {
        int i2 = 0;
        for (int size = this.f63523.size() - 1; size >= 0; size--) {
            if (this.f63523.get(size) == i) {
                i2 = size;
            } else {
                this.f63520 = this.f63523.get(size);
            }
        }
        this.f63523.m55046(i2);
        this.f63524.clear(i);
        ((C19738) this.f63518.m55749().get(i)).f63516.clear(this.f63526);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45475(C19738 c19738) {
        if (this != c19738 && this.f63523.size() == 0) {
            BitSet bitSet = this.f63524;
            int i = c19738.f63526;
            bitSet.set(i);
            this.f63523.add(i);
            this.f63520 = i;
            c19738.f63516.set(this.f63526);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45458(C20946 c20946, C20946 c20947) {
        if (this.f63524.cardinality() > 1) {
            throw new IllegalStateException("Inserting a move to a block with multiple successors");
        }
        if (c20946.m47903() == c20947.m47903()) {
            return;
        }
        ArrayList arrayList = this.f63519;
        C1356 c1356 = (C1356) j$$ExternalSyntheticOutline0.m(arrayList, 1);
        if (c1356.m16508() == null && c1356.mo4992().size() <= 0) {
            arrayList.add(arrayList.size() - 1, new C1356(new C23930(C0809.m3258(c20946.getType()), C9012.f29360, c20946, C0063.m1033(c20947)), this));
            this.f63521++;
            return;
        }
        int iNextSetBit = this.f63524.nextSetBit(0);
        while (iNextSetBit >= 0) {
            C19738 c19738 = (C19738) this.f63518.m55749().get(iNextSetBit);
            c19738.getClass();
            if (c20946.m47903() != c20947.m47903()) {
                c19738.f63519.add(c19738.m45447(), new C1356(new C23930(C0809.m3258(c20946.getType()), C9012.f29360, c20946, C0063.m1033(c20947)), c19738));
                c19738.f63522++;
            }
            iNextSetBit = this.f63524.nextSetBit(iNextSetBit + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45446(BitSet bitSet, C20946 c20946) {
        int iM47903 = c20946.m47903();
        return bitSet.get(iM47903) || (c20946.m47901() == 2 && bitSet.get(iM47903 + 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45445(List list) {
        AbstractC5568 abstractC5568;
        C24960 c24960 = this.f63518;
        BitSet bitSet = new BitSet(c24960.m55737());
        BitSet bitSet2 = new BitSet(c24960.m55737());
        int size = list.size();
        int i = 0;
        while (i < size) {
            for (int i2 = i; i2 < size; i2++) {
                C20946 c20946M31619get = ((AbstractC5568) list.get(i2)).mo4992().m31619get(0);
                bitSet.set(c20946M31619get.m47903());
                if (c20946M31619get.m47901() > 1) {
                    bitSet.set(c20946M31619get.m47903() + 1);
                }
                C20946 c20946M16508 = ((AbstractC5568) list.get(i2)).m16508();
                bitSet2.set(c20946M16508.m47903());
                if (c20946M16508.m47901() > 1) {
                    bitSet2.set(c20946M16508.m47903() + 1);
                }
            }
            int i3 = i;
            int i4 = i3;
            while (i3 < size) {
                if (!m45446(bitSet, ((AbstractC5568) list.get(i3)).m16508())) {
                    Collections.swap(list, i3, i4);
                    i4++;
                }
                i3++;
            }
            if (i == i4) {
                int i5 = i4;
                while (true) {
                    if (i5 >= size) {
                        abstractC5568 = null;
                        break;
                    }
                    abstractC5568 = (AbstractC5568) list.get(i5);
                    if (m45446(bitSet, abstractC5568.m16508()) && m45446(bitSet2, abstractC5568.mo4992().m31619get(0))) {
                        Collections.swap(list, i4, i5);
                        break;
                    }
                    i5++;
                }
                C20946 c20946M16509 = abstractC5568.m16508();
                C20946 c20946M47899 = c20946M16509.m47899(c24960.m55748(c20946M16509.m47901()));
                C18708 c18708M3258 = C0809.m3258(c20946M16509.getType());
                C9012 c9012 = C9012.f29360;
                C1356 c1356 = new C1356(new C23930(c18708M3258, c9012, c20946M47899, abstractC5568.mo4992()), this);
                int i6 = i4 + 1;
                list.add(i4, c1356);
                list.set(i6, new C1356(new C23930(C0809.m3258(c20946M16509.getType()), c9012, c20946M16509, C0063.m1033(c20946M47899)), this));
                size = list.size();
                i = i6;
            } else {
                i = i4;
            }
            bitSet.clear();
            bitSet2.clear();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45473(int i) {
        InterfaceC16492 c3068;
        if (this.f63525 == null) {
            int iM55737 = this.f63518.m55737();
            if (iM55737 <= 3072) {
                c3068 = new C13770(iM55737);
            } else {
                c3068 = new C3068();
            }
            this.f63525 = c3068;
        }
        this.f63525.add(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45451(int i) {
        InterfaceC16492 c3068;
        if (this.f63527 == null) {
            int iM55737 = this.f63518.m55737();
            if (iM55737 <= 3072) {
                c3068 = new C13770(iM55737);
            } else {
                c3068 = new C3068();
            }
            this.f63527 = c3068;
        }
        this.f63527.add(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC16492 m45476() {
        InterfaceC16492 c3068;
        if (this.f63525 == null) {
            int iM55737 = this.f63518.m55737();
            if (iM55737 <= 3072) {
                c3068 = new C13770(iM55737);
            } else {
                c3068 = new C3068();
            }
            this.f63525 = c3068;
        }
        return this.f63525;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m45449() {
        return this.f63526 == this.f63518.m55742();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45464() {
        int i = this.f63522;
        ArrayList arrayList = this.f63519;
        if (i > 1) {
            m45445(arrayList.subList(0, i));
            if (((AbstractC5568) arrayList.get(this.f63522)).mo4994()) {
                throw new RuntimeException("Unexpected: moves from phis before move-exception");
            }
        }
        if (this.f63521 > 1) {
            m45445(arrayList.subList((arrayList.size() - this.f63521) - 1, arrayList.size() - 1));
        }
        this.f63518.m55743();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45454(InterfaceC13025 interfaceC13025) {
        ArrayList arrayList = this.f63519;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC5568) arrayList.get(i)).mo4987(interfaceC13025);
        }
    }

    public final String toString() {
        return "{" + this.f63526 + ":" + C5306.m15934(this.f63528) + '}';
    }
}
