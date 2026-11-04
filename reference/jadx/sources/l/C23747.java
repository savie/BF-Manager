package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84S9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23747 extends AbstractC14883 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f76956;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f76957;

    public C23747(C25239 c25239, int i) {
        super(c25239, i);
        this.f76956 = new ArrayList();
        this.f76957 = new ArrayList();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53027(int i, boolean z) {
        m53014(i);
        m35831(i, z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53026(int i, int i2) {
        m53014(i);
        m35830(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20017 m53013(C20500 c20500) {
        ArrayList<C20017> arrayList = this.f76956;
        for (C20017 c20017 : arrayList) {
            if (c20017.mo9073().equals(c20500)) {
                return c20017;
            }
        }
        C20017 c20018 = new C20017(this, c20500);
        arrayList.add(c20018);
        return c20018;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53018(C20017 c20017, C20500 c20500) {
        if (c20017.getType() != this) {
            throw new RuntimeException("The entry being copied must belong to this type");
        }
        ArrayList arrayList = this.f76956;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C20017) it.next()).mo9073().equals(c20500)) {
                throw new RuntimeException("Config flags exists: " + c20500.toString());
            }
        }
        C20017 c20018 = new C20017(this, c20500);
        c20018.m46055(c20017.mo9072());
        c20018.m46053(c20017.mo9067());
        arrayList.add(c20018);
        for (InterfaceC8697 interfaceC8697 : c20017.mo9078()) {
            c20018.m46050(interfaceC8697.mo23383()).m32853(interfaceC8697);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m53028(int i) {
        if (i > 65536) {
            i = 65536;
        }
        ArrayList arrayList = this.f76957;
        if (i < arrayList.size()) {
            return;
        }
        arrayList.ensureCapacity(i);
        for (int size = i - arrayList.size(); size > 0; size--) {
            arrayList.add(null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m53012(String str) {
        ArrayList arrayList = this.f76957;
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53016(int i, String str, boolean z) {
        if (i >= 65536) {
            throw new IllegalArgumentException("id > 0xFFFF");
        }
        ArrayList arrayList = this.f76957;
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m53023(int i) {
        this.f76956.remove(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53017(C20017 c20017) {
        this.f76956.remove(c20017);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m53024() {
        this.f76956.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53015(int i, String str) {
        ArrayList arrayList = this.f76957;
        if (i >= arrayList.size()) {
            throw new RuntimeException(C14442.m34864(i, "Please add entry with id of ", " first"));
        }
        arrayList.set(i, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m53021(int i) {
        return (String) this.f76957.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53014(int i) {
        ArrayList arrayList = this.f76957;
        if (i >= arrayList.size() || arrayList.get(i) == null) {
            throw new RuntimeException(C14442.m34864(i, "Please add entry with id of ", " first"));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6593 m53020() {
        ArrayList arrayList = this.f76957;
        C6593 c6593 = new C6593(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (str != null) {
                c6593.put(str, Integer.valueOf(i));
            }
        }
        return c6593;
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۙ */
    public final int mo35827(InterfaceC11615 interfaceC11615) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f76957;
            if (i >= arrayList.size()) {
                return -1;
            }
            String str = (String) arrayList.get(i);
            if (str != null && interfaceC11615.mo13186(str)) {
                return i;
            }
            i++;
        }
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ֫ */
    public final int mo4328() {
        return this.f76957.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53019(InterfaceC23332 interfaceC23332, C6593 c6593, C3374 c3374) {
        int size = this.f76957.size();
        interfaceC23332.mo17788(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC);
        interfaceC23332.mo17788((short) 16);
        interfaceC23332.writeInt((size * 4) + 16);
        interfaceC23332.writeByte(mo35833());
        interfaceC23332.writeByte(0);
        ArrayList arrayList = this.f76956;
        interfaceC23332.mo17812(Math.min(arrayList.size(), 65535));
        interfaceC23332.writeInt(size);
        if (c3374 != null) {
            c3374.m11079(1);
        }
        int[] iArr = new int[size];
        C20500[] c20500Arr = new C20500[size];
        for (InterfaceC2731 interfaceC2731 : m35834()) {
            C20500 c20500Mo9073 = interfaceC2731.mo9073();
            for (InterfaceC8697 interfaceC8697 : interfaceC2731.mo9078()) {
                int iMo23383 = interfaceC8697.mo23383();
                C20500 c20500 = c20500Arr[iMo23383];
                if (c20500 == null) {
                    c20500Arr[iMo23383] = c20500Mo9073;
                } else {
                    iArr[iMo23383] = c20500.m47026(c20500Mo9073) | iArr[iMo23383];
                }
                if (interfaceC8697.mo18152()) {
                    iArr[iMo23383] = iArr[iMo23383] | 1073741824;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (c20500Arr[i] != null) {
                if ((iArr[i] & 1073741824) != 0 && mo33926(i)) {
                    iArr[i] = iArr[i] | 536870912;
                }
                iArr[i] = iArr[i] | mo33924(i);
            }
        }
        interfaceC23332.mo17790(iArr);
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new C16287(0));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((C20017) it.next()).m46052(interfaceC23332, c6593, c3374);
        }
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۚۙ */
    public final int mo4331() {
        return this.f76956.size();
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ᩴ */
    public final C20017 mo4334(int i) {
        return (C20017) this.f76956.get(i);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m53010() {
        Iterator it = m35834().iterator();
        int iM46054 = 1;
        while (it.hasNext()) {
            iM46054 += ((C20017) it.next()).m46054();
        }
        return iM46054;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m53011() {
        Iterator it = m35834().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C20017) it.next()).mo9078().iterator();
            while (it2.hasNext()) {
                for (C3609 c3609 : ((C13304) it2.next()).values()) {
                    if (c3609.f12368 != null) {
                        if (c3609.mo16636()) {
                            c3609.f12368.f66506 = true;
                        } else {
                            c3609.f12368 = null;
                        }
                    }
                }
            }
        }
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۧۙ */
    public final void mo4333() {
        Collections.sort(this.f76956, new C4443());
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7206 mo4329() {
        return (C23001) super.mo4329();
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC10869 mo4332() {
        return (C25239) super.mo4332();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53022(String str) {
        ((ArrayList) ((C25239) super.mo4332()).mo19818()).set(mo35833() - 1, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20017 m53025(String str) {
        return m53013(C20500.m47000(str, ((C25239) super.mo4332()).mo27606()));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C25239 m53029() {
        return (C25239) super.mo4332();
    }
}
