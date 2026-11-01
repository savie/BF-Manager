package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0206 extends AbstractC10708 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f1364;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1365;

    public C0206(C7262 c7262, int i) {
        super(c7262, i);
        this.f1364 = new ArrayList();
        this.f1365 = new ArrayList();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1540(int i, boolean z) {
        m1524(i);
        m26939(i, z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1539(int i, int i2) {
        m1524(i);
        m26938(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21373 m1523(C15916 c15916) {
        ArrayList<C21373> arrayList = this.f1364;
        for (C21373 c21373 : arrayList) {
            if (c21373.mo31747().equals(c15916)) {
                return c21373;
            }
        }
        C21373 c21374 = new C21373(this, c15916);
        arrayList.add(c21374);
        return c21374;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1529(C21373 c21373, C15916 c15916) {
        if (c21373.getType() != this) {
            throw new RuntimeException("The entry being copied must belong to this type");
        }
        ArrayList arrayList = this.f1364;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C21373) it.next()).mo31747().equals(c15916)) {
                throw new RuntimeException("Config flags exists: " + c15916.toString());
            }
        }
        C21373 c21374 = new C21373(this, c15916);
        c21374.m47906(c21373.mo31750());
        c21374.m47905(c21373.mo31748());
        arrayList.add(c21374);
        for (InterfaceC3609 interfaceC3609 : c21373.mo31746()) {
            c21374.m47902(interfaceC3609.mo10691()).m42940(interfaceC3609);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m1518(int i) {
        if (i > 65536) {
            i = 65536;
        }
        ArrayList arrayList = this.f1365;
        if (i < arrayList.size()) {
            return;
        }
        arrayList.ensureCapacity(i);
        for (int size = i - arrayList.size(); size > 0; size--) {
            arrayList.add(null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1520(String str) {
        ArrayList arrayList = this.f1365;
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1526(int i, String str, boolean z) {
        if (i >= 65536) {
            throw new IllegalArgumentException("id > 0xFFFF");
        }
        ArrayList arrayList = this.f1365;
        if (i >= arrayList.size()) {
            for (int size = i - arrayList.size(); size > 0; size--) {
                arrayList.add(null);
            }
            arrayList.add(str);
            return;
        }
        String str2 = (String) arrayList.get(i);
        if (str2 == null) {
            arrayList.set(i, str);
        } else if (!z && !str2.equals(str)) {
            throw new RuntimeException(String.format("There is already a entry with id of 0x%04x, named \"%s\" not \"%s\". (%s)", Integer.valueOf(i), str2, str, getTypeName()));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m1517(int i) {
        this.f1364.remove(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1528(C21373 c21373) {
        this.f1364.remove(c21373);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m1542() {
        this.f1364.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1525(int i, String str) {
        ArrayList arrayList = this.f1365;
        if (i >= arrayList.size()) {
            throw new RuntimeException(C2271.m6966(i, "Please add entry with id of ", " first"));
        }
        arrayList.set(i, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m1533(int i) {
        return (String) this.f1365.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1524(int i) {
        ArrayList arrayList = this.f1365;
        if (i >= arrayList.size() || arrayList.get(i) == null) {
            throw new RuntimeException(C2271.m6966(i, "Please add entry with id of ", " first"));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5851 m1535() {
        ArrayList arrayList = this.f1365;
        C5851 c5851 = new C5851(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (str != null) {
                c5851.put(str, Integer.valueOf(i));
            }
        }
        return c5851;
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1521(InterfaceC20544 interfaceC20544) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1365;
            if (i >= arrayList.size()) {
                return -1;
            }
            String str = (String) arrayList.get(i);
            if (str != null && interfaceC20544.mo2120(str)) {
                return i;
            }
            i++;
        }
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo1519() {
        return this.f1365.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1527(InterfaceC16662 interfaceC16662, C5851 c5851, C8516 c8516) {
        int size = this.f1365.size();
        interfaceC16662.mo24505(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC);
        interfaceC16662.mo24505((short) 16);
        interfaceC16662.writeInt((size * 4) + 16);
        interfaceC16662.writeByte(mo26942());
        interfaceC16662.writeByte(0);
        ArrayList arrayList = this.f1364;
        interfaceC16662.mo24508(Math.min(arrayList.size(), 65535));
        interfaceC16662.writeInt(size);
        if (c8516 != null) {
            c8516.m22242(1);
        }
        int[] iArr = new int[size];
        C15916[] c15916Arr = new C15916[size];
        for (InterfaceC12783 interfaceC12783 : m26940()) {
            C15916 c15916Mo31747 = interfaceC12783.mo31747();
            for (InterfaceC3609 interfaceC3609 : interfaceC12783.mo31746()) {
                int iMo10691 = interfaceC3609.mo10691();
                C15916 c15916 = c15916Arr[iMo10691];
                if (c15916 == null) {
                    c15916Arr[iMo10691] = c15916Mo31747;
                } else {
                    iArr[iMo10691] = c15916.m37867(c15916Mo31747) | iArr[iMo10691];
                }
                if (interfaceC3609.mo7649()) {
                    iArr[iMo10691] = iArr[iMo10691] | 1073741824;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (c15916Arr[i] != null) {
                if ((iArr[i] & 1073741824) != 0 && mo25272(i)) {
                    iArr[i] = iArr[i] | 536870912;
                }
                iArr[i] = iArr[i] | mo25270(i);
            }
        }
        interfaceC16662.mo24506(iArr);
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new C19963());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((C21373) it.next()).m47904(interfaceC16662, c5851, c8516);
        }
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int mo1536() {
        return this.f1364.size();
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۚ */
    public final C21373 mo1530(int i) {
        return (C21373) this.f1364.get(i);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m1532() {
        Iterator it = m26940().iterator();
        int iM47907 = 1;
        while (it.hasNext()) {
            iM47907 += ((C21373) it.next()).m47907();
        }
        return iM47907;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1541() {
        Iterator it = m26940().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C21373) it.next()).mo31746().iterator();
            while (it2.hasNext()) {
                for (C16435 c16435 : ((C18551) it2.next()).values()) {
                    if (c16435.f52856 != null) {
                        if (c16435.mo25185()) {
                            c16435.f52856.f40807 = true;
                        } else {
                            c16435.f52856 = null;
                        }
                    }
                }
            }
        }
    }

    @Override // l.InterfaceC19133
    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final void mo1531() {
        Collections.sort(this.f1364, new C5768());
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 mo1522() {
        return (C22785) super.mo1522();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m1534(String str) {
        ((ArrayList) ((C7262) super.mo1537()).mo7944()).set(mo26942() - 1, str);
    }

    @Override // l.AbstractC10708, l.InterfaceC19133
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17721 mo1537() {
        return (C7262) super.mo1537();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21373 m1538(String str) {
        return m1523(C15916.m37840(str, ((C7262) super.mo1537()).mo19107()));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C7262 m1543() {
        return (C7262) super.mo1537();
    }
}
