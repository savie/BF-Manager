package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13937 extends AbstractC14883 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC15344 f44179;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f44180;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44181;

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۧۙ */
    public final void mo4333() {
    }

    public C13937(InterfaceC10869 interfaceC10869, InterfaceC15344 interfaceC15344, int i, ArrayList arrayList) throws C10186 {
        super((AbstractC16375) interfaceC10869, i);
        this.f44181 = new ArrayList();
        this.f44179 = interfaceC15344;
        this.f44180 = interfaceC15344 == null ? 0 : interfaceC15344.mo4328();
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1260 c1260 = (C1260) it.next();
            boolean zM4579 = c1260.m4579();
            String str = c1260.f4549;
            if (zM4579) {
                hashSet.add(str);
                this.f44180 = Math.max(this.f44180, c1260.f4546);
            } else if (c1260.m4580()) {
                BitSet bitSet = (BitSet) map.get(str);
                if (bitSet == null) {
                    bitSet = new BitSet();
                    map.put(str, bitSet);
                }
                bitSet.set(c1260.f4547 & 65535);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1260 c1261 = (C1260) it2.next();
            String typeName = getTypeName();
            String str2 = c1261.f4553;
            String str3 = c1261.f4551;
            if (!typeName.equals(str2)) {
                throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch type name differs.");
            }
            if (!c1261.m4579()) {
                int i2 = c1261.f4547 & 65535;
                this.f44180 = Math.max(this.f44180, i2 + 1);
                if (c1261.m4580()) {
                    continue;
                } else {
                    String str4 = (String) map2.put(Integer.valueOf(i2), str3);
                    if (str4 != null && !str4.equals(str3)) {
                        throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch entry names differ.");
                    }
                    if (interfaceC15344 != null) {
                        for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo33925()) {
                            String strM26337 = C10208.m26337(interfaceC2731);
                            BitSet bitSet2 = (BitSet) map.get(strM26337);
                            if (!hashSet.contains(strM26337) && (bitSet2 == null || !bitSet2.get(i2))) {
                                if (interfaceC2731.mo9075(i2) && !str3.equals(interfaceC2731.mo9070(i2))) {
                                    throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch entry name differs from existing variants.");
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        HashSet hashSet2 = new HashSet();
        if (interfaceC15344 != null) {
            for (InterfaceC2731 interfaceC2732 : interfaceC15344.mo33925()) {
                String strM26338 = C10208.m26337(interfaceC2732);
                ArrayList arrayListM33923 = m33923(strM26338, arrayList);
                if (!hashSet2.add(strM26338) || arrayListM33923.isEmpty()) {
                    this.f44181.add(interfaceC2732);
                } else if (arrayListM33923.size() != 1 || !((C1260) arrayListM33923.get(0)).m4579()) {
                    this.f44181.add(new C8717(this, interfaceC2732, strM26338, arrayListM33923));
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            String str5 = ((C1260) it3.next()).f4549;
            if (hashSet2.add(str5)) {
                ArrayList arrayListM33924 = m33923(str5, arrayList);
                if (arrayListM33924.size() != 1 || !((C1260) arrayListM33924.get(0)).m4579()) {
                    this.f44181.add(new C8717(this, null, str5, arrayListM33924));
                }
            }
        }
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo33926(int i) {
        InterfaceC15344 interfaceC15344 = this.f44179;
        return interfaceC15344 != null && interfaceC15344.mo33926(i);
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo33924(int i) {
        InterfaceC15344 interfaceC15344 = this.f44179;
        if (interfaceC15344 == null) {
            return 0;
        }
        return interfaceC15344.mo33924(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m33923(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1260 c1260 = (C1260) it.next();
            if (c1260.f4549.equals(str)) {
                arrayList2.add(c1260);
            }
        }
        return arrayList2;
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ֫ */
    public final int mo4328() {
        return this.f44180;
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۚۙ */
    public final int mo4331() {
        return this.f44181.size();
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC2731 mo4334(int i) {
        return (InterfaceC2731) this.f44181.get(i);
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Iterable mo33925() {
        return this.f44181;
    }
}
