package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14319 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f46902;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46903;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f46904;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7262 f46905;

    public C14319(C7262 c7262) {
        ArrayList arrayList = new ArrayList();
        this.f46903 = arrayList;
        this.f46904 = new HashMap();
        this.f46902 = new HashMap();
        this.f46905 = c7262;
        arrayList.add(new C23491());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c7262.mo19112().iterator();
        while (it.hasNext()) {
            arrayList2.add((C0206) it.next());
        }
        Collections.sort(arrayList2, new C10791(0));
        HashMap map = new HashMap();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0206 c0206 = (C0206) it2.next();
            String typeName = c0206.getTypeName();
            Integer num = (Integer) map.get(typeName);
            int iIntValue = num != null ? num.intValue() : 0;
            map.put(typeName, Integer.valueOf(iIntValue + 1));
            if (iIntValue == this.f46903.size()) {
                this.f46903.add(new C23491());
            }
            C23491 c23491 = (C23491) this.f46903.get(iIntValue);
            c23491.f76057.add(c0206);
            this.f46904.put(Integer.valueOf(c0206.mo26942()), c23491);
            this.f46902.put(Integer.valueOf(c0206.mo26942()), c0206);
        }
        ArrayList<C23491> arrayList3 = this.f46903;
        for (C19257 c19257 : this.f46905.mo19110()) {
            HashMap map2 = new HashMap();
            if (c19257.mo8712() == 0) {
                ((C23491) arrayList3.get(0)).f76058.add(c19257);
            } else {
                for (C8674 c8674 : c19257.mo35623()) {
                    HashMap map3 = new HashMap();
                    if (((C15070) c8674.mo42827()).isEmpty()) {
                        map3.put((C23491) arrayList3.get(0), new C15070());
                    }
                    for (int i = 0; i < ((C15070) c8674.mo42827()).size(); i++) {
                        int i2 = ((C15070) c8674.mo42827()).getInt(i);
                        C23491 c23491M34549 = m34549(i2);
                        C15070 c15070 = (C15070) map3.get(c23491M34549);
                        if (c15070 == null) {
                            c15070 = new C15070();
                            map3.put(c23491M34549, c15070);
                        }
                        c15070.add(i2);
                    }
                    for (C23491 c23492 : arrayList3) {
                        C15070 c15071 = (C15070) map3.get(c23492);
                        if (c15071 != null) {
                            C19257 c19258 = (C19257) map2.get(c23492);
                            if (c19258 == null) {
                                c19258 = new C19257(c19257.getName(), c19257.mo35622());
                                map2.put(c23492, c19258);
                                c23492.f76058.add(c19258);
                            }
                            c19258.m44200(c8674.mo42826(), c15071);
                        }
                    }
                }
            }
        }
        for (C20668 c20668 : this.f46905.mo19111()) {
            if (c20668.mo14889() == 0) {
                ((C23491) this.f46903.get(0)).f76056.add(c20668);
            } else {
                HashMap map4 = new HashMap();
                for (C15730 c15730 : c20668.mo37321()) {
                    C23491 c23491M345410 = m34549(c15730.mo20682());
                    C20668 c20669 = (C20668) map4.get(c23491M345410);
                    if (c20669 == null) {
                        c20669 = new C20668();
                        map4.put(c23491M345410, c20669);
                        c23491M345410.f76056.add(c20669);
                    }
                    c20669.m46514(c15730.mo20683(), c15730.mo20682());
                }
            }
        }
        ArrayList arrayList4 = this.f46903;
        Collections.reverse(arrayList4.subList(1, arrayList4.size()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23491 m34549(int i) {
        int i2 = (i >>> 16) & 255;
        C0206 c0206 = (C0206) this.f46902.get(Integer.valueOf(i2));
        int i3 = 65535 & i;
        if ((i >>> 24) == this.f46905.mo19106() && c0206 != null && i3 < c0206.f1365.size() && c0206.m1533(i3) != null) {
            return (C23491) this.f46904.get(Integer.valueOf(i2));
        }
        return (C23491) this.f46903.get(0);
    }
}
