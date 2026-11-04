package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: VIWQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C21943 extends AbstractC16678 implements InterfaceC23435, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f70818;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21943 f70819;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f70821;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public BitSet f70822;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public BitSet f70823;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f70824;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21943 f70825;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public BitSet f70826;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f70828;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f70829;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f70820 = new ArrayList(2);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f70827 = new ArrayList(1);

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public List f70830 = new ArrayList(1);

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) {
        C15975.m38093(this, c13476, interfaceC3145);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f70828, ((C21943) obj).f70828);
    }

    public C21943(int i, int i2, int i3) {
        C20247 c20247 = C20247.f65032;
        this.f70826 = c20247;
        this.f70822 = c20247;
        this.f70829 = new ArrayList(3);
        this.f70828 = i;
        this.f70824 = i2;
        this.f70821 = i3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m49633() {
        return this.f70828;
    }

    @Deprecated
    public final int getId() {
        return this.f70824;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final int m49644() {
        return this.f70824;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final List m49643() {
        return this.f70827;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final List m49646() {
        return this.f70830;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m49653() {
        List<C21943> list = this.f70830;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C21943 c21943 : list) {
                if (C23231.m52191(c21943)) {
                    arrayList.add(c21943);
                }
            }
            if (mo17865(EnumC1763.LOOP_END)) {
                Iterator it = mo17861(C11457.f36019).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C11785) it.next()).m29616());
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.removeAll(arrayList);
                list = arrayList2;
            }
        }
        this.f70818 = list;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final List m49639() {
        return this.f70818;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49632(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C21943) list.get(i)).f70824 = i;
        }
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m49645() {
        try {
            List list = this.f70830;
            List listM13230 = C4123.m13230(list);
            this.f70830 = listM13230;
            List list2 = this.f70818;
            if (list != list2) {
                listM13230 = C4123.m13230(list2);
            }
            this.f70818 = listM13230;
            this.f70827 = C4123.m13230(this.f70827);
            this.f70829 = C4123.m13230(this.f70829);
            if (this.f70823 != null) {
                return;
            }
            throw new C8597("Dominance frontier not set for block: " + this);
        } catch (Exception e) {
            throw new C8597("Failed to lock block: " + this, e);
        }
    }

    @Override // l.InterfaceC23435
    /* JADX INFO: renamed from: ۙ */
    public final List mo1986() {
        return this.f70820;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int m49654() {
        return this.f70821;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49650(C21943 c21943) {
        return this.f70826.get(c21943.f70824);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m49651() {
        return this.f70826;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49649(BitSet bitSet) {
        this.f70826 = bitSet;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m49637() {
        return this.f70822;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49640(BitSet bitSet) {
        this.f70822 = bitSet;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final BitSet m49638() {
        return this.f70823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49634(BitSet bitSet) {
        this.f70823 = bitSet;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m49642() {
        return this.f70825;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49641(C21943 c21943) {
        this.f70825 = c21943;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m49648() {
        return this.f70819;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m49652(C21943 c21943) {
        this.f70819 = c21943;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final List m49636() {
        return this.f70829;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49635(C21943 c21943) {
        this.f70829.add(c21943);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49647() {
        return this.f70820.isEmpty();
    }

    public final int hashCode() {
        return this.f70828;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21943) && this.f70828 == ((C21943) obj).f70828;
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ᩻ */
    public final String mo1988() {
        return Integer.toString(this.f70828);
    }

    public final String toString() {
        return "B:" + this.f70828 + ':' + C8314.m22396(this.f70821);
    }
}
