package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۫ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13236 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42305;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10869 f42306;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42308;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f42307 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f42309 = new HashMap();

    public C13236(InterfaceC10869 interfaceC10869) throws C10186 {
        this.f42306 = interfaceC10869;
        this.f42305 = interfaceC10869.mo27607();
        this.f42308 = interfaceC10869.mo19818().size() + 1;
        for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
            if (this.f42309.put(Integer.valueOf(interfaceC15344.mo35833()), interfaceC15344) != null) {
                throw C25171.m56091("RESOURCE_TARGET_AMBIGUOUS", "Duplicate type IDs prevent adding resources safely.");
            }
            this.f42308 = Math.max(this.f42308, interfaceC15344.mo35833() + 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11744 m32791(int i) {
        InterfaceC15344 interfaceC15344;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f42307;
        C11744 c11744 = (C11744) map.get(numValueOf);
        if (c11744 == null && (interfaceC15344 = (InterfaceC15344) this.f42309.get(Integer.valueOf(i))) != null) {
            c11744 = new C11744(interfaceC15344.mo35833(), interfaceC15344.getTypeName());
            c11744.f37976 = interfaceC15344;
            c11744.f37980 = interfaceC15344.mo4328();
            for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo33925()) {
                c11744.f37980 = Math.max(c11744.f37980, interfaceC2731.mo9069() + 1);
                String strM26337 = C10208.m26337(interfaceC2731);
                for (InterfaceC8697 interfaceC8697 : interfaceC2731.mo9078()) {
                    int iMo23383 = interfaceC8697.mo23383();
                    String strMo18156 = interfaceC8697.mo18156();
                    String str = (String) c11744.f37975.put(Integer.valueOf(iMo23383), strMo18156);
                    if (str != null && !str.equals(strMo18156)) {
                        throw C25171.m56091("RESOURCE_TARGET_AMBIGUOUS", "Resource variants disagree about the entry name.");
                    }
                    c11744.f37982.put(strMo18156, Integer.valueOf(iMo23383));
                    if (!c11744.f37974.add(iMo23383 + "\n" + strM26337)) {
                        throw C25171.m56091("RESOURCE_TARGET_AMBIGUOUS", "Duplicate resource variants prevent adding resources safely.");
                    }
                }
            }
            map.put(Integer.valueOf(i), c11744);
        }
        return c11744;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11744 m32792(String str) {
        int iMo35833 = -1;
        for (InterfaceC15344 interfaceC15344 : this.f42309.values()) {
            if (C10208.m26336(interfaceC15344.getTypeName()).equals(str)) {
                if (iMo35833 != -1) {
                    throw C25171.m56091("RESOURCE_TARGET_AMBIGUOUS", "Multiple types have the requested resource type name.");
                }
                iMo35833 = interfaceC15344.mo35833();
            }
        }
        if (iMo35833 != -1) {
            return m32791(iMo35833);
        }
        HashMap map = this.f42307;
        for (C11744 c11744 : map.values()) {
            if (C10208.m26336(c11744.f37977).equals(str)) {
                return c11744;
            }
        }
        int i = this.f42308;
        if (i > 255) {
            throw C25171.m56091("RESOURCE_ID_EXHAUSTED", "No unused type ID remains in this package.");
        }
        this.f42308 = i + 1;
        C11744 c11745 = new C11744(i, str);
        map.put(Integer.valueOf(c11745.f37981), c11745);
        return c11745;
    }
}
