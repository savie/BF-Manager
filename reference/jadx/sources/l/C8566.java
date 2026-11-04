package l;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBIE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8566 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11780 f27965;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f27966;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f27967;

    public C8566(InterfaceC10869 interfaceC10869) {
        Iterator it;
        Iterator it2;
        this.f27966 = interfaceC10869.mo27607();
        HashMap map = new HashMap();
        C11780 c11780 = new C11780();
        Iterator it3 = interfaceC10869.mo19822().iterator();
        while (it3.hasNext()) {
            InterfaceC15344 interfaceC15344 = (InterfaceC15344) it3.next();
            String typeName = interfaceC15344.getTypeName();
            if (typeName.equals("attr") || typeName.equals("^attr-private")) {
                if (interfaceC15344.mo4331() != 0) {
                    InterfaceC15344 type = interfaceC10869.getType("id");
                    InterfaceC2731 interfaceC2731Mo4334 = (type == null || type.mo4331() == 0) ? null : type.mo4334(0);
                    Iterator it4 = interfaceC15344.mo4334(0).mo9078().iterator();
                    while (it4.hasNext()) {
                        InterfaceC8697 interfaceC8697 = (InterfaceC8697) it4.next();
                        if (!interfaceC8697.mo18155() || interfaceC8697.mo18154() != 0) {
                            int iMo23383 = interfaceC8697.mo23383();
                            int value = interfaceC8697.getValue().getValue();
                            String strMo18156 = interfaceC8697.mo18156();
                            if (!strMo18156.startsWith("__") && !map.containsKey(strMo18156)) {
                                int iMo18154 = interfaceC8697.mo18154() - 1;
                                C13786[] c13786Arr = new C13786[iMo18154];
                                int i = 0;
                                while (true) {
                                    if (i < iMo18154) {
                                        int i2 = i + 1;
                                        InterfaceC5650 value2 = interfaceC8697.getValue(i2);
                                        it = it3;
                                        int value3 = value2.getValue();
                                        int iMo16635 = value2.mo16635();
                                        it2 = it4;
                                        InterfaceC8697 interfaceC8698 = interfaceC8697;
                                        if (((value2.mo16637() >>> 24) & 255) != interfaceC10869.mo27607()) {
                                            break;
                                        }
                                        InterfaceC8697 interfaceC8697Mo9076 = interfaceC2731Mo4334 == null ? null : interfaceC2731Mo4334.mo9076(value2.mo16637() & 65535);
                                        if (interfaceC8697Mo9076 == null) {
                                            break;
                                        }
                                        c13786Arr[i] = new C13786(value3, iMo16635, interfaceC8697Mo9076.mo18156());
                                        i = i2;
                                        it3 = it;
                                        interfaceC8697 = interfaceC8698;
                                        it4 = it2;
                                    } else {
                                        it = it3;
                                        it2 = it4;
                                        map.put(strMo18156, new C2600(value, strMo18156, c13786Arr, (interfaceC10869.mo27607() << 24) | (interfaceC15344.mo35833() << 16) | iMo23383));
                                        break;
                                    }
                                }
                                it3 = it;
                                it4 = it2;
                            }
                        }
                    }
                }
            }
        }
        for (C2600 c2600 : map.values()) {
            c11780.mo13466(c2600.f8353, c2600);
        }
        this.f27967 = map;
        this.f27965 = c11780;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m23010() {
        return this.f27966;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2600 m23009(String str) {
        return (C2600) this.f27967.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2600 m23008(int i) {
        return (C2600) this.f27965.get(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m23011() {
        return this.f27965.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m23007() {
        return this.f27967.values();
    }
}
