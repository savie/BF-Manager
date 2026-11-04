package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25239 extends AbstractC16375 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f81552;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f81553;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81554;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81555;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81556;

    public C25239(C23001 c23001, int i, String str) {
        super(c23001);
        this.f81552 = new ArrayList();
        this.f81554 = new ArrayList();
        this.f81553 = new ArrayList();
        this.f81555 = new ArrayList();
        this.f81556 = new ArrayList();
        this.f53162 = i;
        this.f53160 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56369(String str) {
        this.f53160 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23747 m56375(int i, String str) {
        ArrayList<C23747> arrayList = this.f81554;
        for (C23747 c23747 : arrayList) {
            if (c23747.mo35833() == i) {
                if (c23747.getTypeName().equals(str)) {
                    return c23747;
                }
                throw new RuntimeException(String.format("There is already a type with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c23747.getTypeName(), str));
            }
        }
        int i2 = i - 1;
        ArrayList arrayList2 = this.f81552;
        if (i2 < arrayList2.size()) {
            arrayList2.set(i2, str);
        } else {
            while (i2 > arrayList2.size()) {
                arrayList2.add("?" + (arrayList2.size() + 1));
            }
            arrayList2.add(str);
        }
        C23747 c23748 = new C23747(this, i);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C23747) arrayList.get(size)).mo35833() < i) {
                arrayList.add(size + 1, c23748);
                return c23748;
            }
        }
        arrayList.add(0, c23748);
        return c23748;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23747 m56373() {
        ArrayList<C23747> arrayList = this.f81554;
        for (C23747 c23747 : arrayList) {
            if (c23747.getTypeName().equals(am.aF)) {
                return c23747;
            }
        }
        ArrayList arrayList2 = this.f81552;
        arrayList2.add(am.aF);
        C23747 c23748 = new C23747(this, arrayList2.size());
        arrayList.add(c23748);
        return c23748;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56367(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f81554;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (((C23747) arrayList.get(i2)).mo35833() == i) {
                arrayList.remove(i2);
                ArrayList arrayList2 = this.f81552;
                if (i == arrayList2.size()) {
                    arrayList2.remove(arrayList2.size() - 1);
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            return;
                        }
                        if (!((String) arrayList2.get(size)).equals("?" + (size + 1))) {
                            return;
                        } else {
                            arrayList2.remove(size);
                        }
                    }
                } else {
                    arrayList2.set(i - 1, "?" + i);
                    return;
                }
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56368(int i, String str) {
        ArrayList<C5847> arrayList = this.f81553;
        for (C5847 c5847 : arrayList) {
            if (c5847.mo33895() == i) {
                if (!c5847.getPackageName().equals(str)) {
                    throw new RuntimeException(String.format("There is already a library with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c5847.getPackageName(), str));
                }
                return;
            }
        }
        arrayList.add(new C5847(i, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2118 m56366(String str, String str2) {
        ArrayList<C2118> arrayList = this.f81556;
        for (C2118 c2118 : arrayList) {
            if (c2118.getName().equals(str)) {
                if (c2118.mo15048().equals(str2)) {
                    return c2118;
                }
                throw new RuntimeException(C8947.m23910(C3188.m10406("There is already a overlay with name \"", str, "\", whose actor is \"", c2118.mo15048(), "\" not \""), str2, "\""));
            }
        }
        C2118 c2119 = new C2118(str, str2);
        arrayList.add(c2119);
        return c2119;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17033 m56372() {
        C17033 c17033 = new C17033();
        this.f81555.add(c17033);
        return c17033;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m56376() {
        this.f81556.clear();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m56364() {
        this.f81555.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56371(InterfaceC23332 interfaceC23332, C3374 c3374, C14795 c14795) {
        for (C4355 c4355 : c14795.f48404) {
            interfaceC23332.mo17788(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE);
            interfaceC23332.mo17788(ColorResourcesTableCreator.PackageChunk.HEADER_SIZE);
            long position = interfaceC23332.getPosition();
            interfaceC23332.mo17795();
            interfaceC23332.writeInt(mo27607());
            interfaceC23332.mo17783(128, getPackageName());
            if (c3374 != null) {
                c3374.m11079(1);
            }
            interfaceC23332.writeInt(288);
            interfaceC23332.writeInt(0);
            long position2 = interfaceC23332.getPosition();
            interfaceC23332.mo17795();
            interfaceC23332.writeInt(0);
            interfaceC23332.writeInt(0);
            C12558 c12558 = new C12558();
            c12558.m31250(true);
            HashSet hashSet = new HashSet();
            ArrayList<C23747> arrayList = c4355.f15731;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C23747) it.next()).getTypeName());
            }
            for (C23747 c23747 : arrayList) {
                while (c12558.size() < c23747.mo35833() - 1) {
                    String strM34972 = "?" + (c12558.size() + 1);
                    while (hashSet.contains(strM34972)) {
                        strM34972 = C14483.m34972(strM34972, "?");
                    }
                    c12558.m31255(strM34972);
                }
                c12558.m31255(c23747.getTypeName());
            }
            c12558.m31249(interfaceC23332, false, (C3374) null);
            if (c3374 != null) {
                c3374.m11079(1);
            }
            long position3 = interfaceC23332.getPosition();
            interfaceC23332.seek(position2);
            interfaceC23332.writeInt((int) ((position3 - position) + 4));
            interfaceC23332.seek(position3);
            int i = 1;
            List<String> list = (List) C1170.stream(arrayList).flatMap(new C18980(i)).filter(new C18218(i)).distinct().collect(C2025.toList());
            C6593 c6593 = new C6593();
            C12558 c12559 = new C12558();
            c12559.m31250(true);
            int i2 = 0;
            for (String str : list) {
                c12559.m31255(str);
                c6593.put(str, Integer.valueOf(i2));
                i2++;
            }
            c12559.m31249(interfaceC23332, false, (C3374) null);
            if (c3374 != null) {
                c3374.m11079(1);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C23747) it2.next()).m53019(interfaceC23332, c6593, c3374);
            }
            ArrayList arrayList2 = this.f81553;
            if (arrayList2.size() > 0) {
                interfaceC23332.mo17788((short) 515);
                interfaceC23332.mo17788((short) 12);
                interfaceC23332.writeInt((arrayList2.size() * 260) + 12);
                interfaceC23332.writeInt(arrayList2.size());
                for (C5847 c5847 : m38865()) {
                    interfaceC23332.writeInt(c5847.mo33895());
                    interfaceC23332.mo17783(128, c5847.getPackageName());
                }
            }
            Iterator it3 = c4355.f15732.iterator();
            while (it3.hasNext()) {
                ((C2118) it3.next()).m7299(interfaceC23332);
            }
            Iterator it4 = c4355.f15730.iterator();
            while (it4.hasNext()) {
                ((C17033) it4.next()).m40126(interfaceC23332);
            }
            long position4 = interfaceC23332.getPosition();
            interfaceC23332.seek(position);
            interfaceC23332.writeInt((int) ((position4 - position) + 4));
            interfaceC23332.seek(position4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56370(EnumC18262 enumC18262) {
        if (enumC18262 != this.f53163 && this.f81554.size() != 0) {
            throw new IllegalStateException("Cannot change config layout of populated package");
        }
        C17359.requireNonNull(enumC18262);
        this.f53163 = enumC18262;
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۟ */
    public final int mo19820() {
        return this.f81554.size();
    }

    @Override // l.InterfaceC10869
    public final C23747 getType(int i) {
        return (C23747) this.f81554.get(i);
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    public final InterfaceC15344 getType(String str) {
        return (C23747) super.getType(str);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23747 m56365() {
        return (C23747) super.getType("id");
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩺ۙ */
    public final int mo19827() {
        return this.f81553.size();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC13917 mo19821(int i) {
        return (C5847) this.f81553.get(i);
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩵ */
    public final int mo19823() {
        return this.f81556.size();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC4904 mo19826(int i) {
        return (C2118) this.f81556.get(i);
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۛۙ */
    public final int mo19819() {
        return this.f81555.size();
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC22804 mo19817(int i) {
        return (C17033) this.f81555.get(i);
    }

    @Override // l.InterfaceC10869
    /* JADX INFO: renamed from: ۚ᩷ */
    public final List mo19818() {
        return this.f81552;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m56374() {
        Iterator it = m38864().iterator();
        while (it.hasNext()) {
            ((C23747) it.next()).m53011();
        }
    }

    @Override // l.AbstractC16375, l.InterfaceC10869
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7206 mo21425() {
        return (C23001) super.mo21425();
    }
}
