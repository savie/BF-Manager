package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6J0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14795 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f48404;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f48405;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25239 f48406;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f48407;

    public C14795(C25239 c25239) {
        ArrayList arrayList = new ArrayList();
        this.f48404 = arrayList;
        this.f48405 = new HashMap();
        this.f48407 = new HashMap();
        this.f48406 = c25239;
        arrayList.add(new C4355());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c25239.mo19822().iterator();
        while (it.hasNext()) {
            arrayList2.add((C23747) it.next());
        }
        Collections.sort(arrayList2, new C24493(0));
        HashMap map = new HashMap();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C23747 c23747 = (C23747) it2.next();
            String typeName = c23747.getTypeName();
            Integer num = (Integer) map.get(typeName);
            int iIntValue = num != null ? num.intValue() : 0;
            map.put(typeName, Integer.valueOf(iIntValue + 1));
            if (iIntValue == this.f48404.size()) {
                this.f48404.add(new C4355());
            }
            C4355 c4355 = (C4355) this.f48404.get(iIntValue);
            c4355.f15731.add(c23747);
            this.f48405.put(Integer.valueOf(c23747.mo35833()), c4355);
            this.f48407.put(Integer.valueOf(c23747.mo35833()), c23747);
        }
        ArrayList<C4355> arrayList3 = this.f48404;
        for (C2118 c2118 : this.f48406.mo19824()) {
            HashMap map2 = new HashMap();
            if (c2118.mo7301() == 0) {
                ((C4355) arrayList3.get(0)).f15732.add(c2118);
            } else {
                for (C11812 c11812 : c2118.mo15047()) {
                    HashMap map3 = new HashMap();
                    if (((C14763) c11812.mo7534()).isEmpty()) {
                        map3.put((C4355) arrayList3.get(0), new C14763());
                    }
                    for (int i = 0; i < ((C14763) c11812.mo7534()).size(); i++) {
                        int i2 = ((C14763) c11812.mo7534()).getInt(i);
                        C4355 c4355M35633 = m35633(i2);
                        C14763 c14763 = (C14763) map3.get(c4355M35633);
                        if (c14763 == null) {
                            c14763 = new C14763();
                            map3.put(c4355M35633, c14763);
                        }
                        c14763.add(i2);
                    }
                    for (C4355 c4356 : arrayList3) {
                        C14763 c14764 = (C14763) map3.get(c4356);
                        if (c14764 != null) {
                            C2118 c2119 = (C2118) map2.get(c4356);
                            if (c2119 == null) {
                                c2119 = new C2118(c2118.getName(), c2118.mo15048());
                                map2.put(c4356, c2119);
                                c4356.f15732.add(c2119);
                            }
                            c2119.m7298(c11812.mo7535(), c14764);
                        }
                    }
                }
            }
        }
        for (C17033 c17033 : this.f48406.mo19825()) {
            if (c17033.mo40124() == 0) {
                ((C4355) this.f48404.get(0)).f15730.add(c17033);
            } else {
                HashMap map4 = new HashMap();
                for (C17779 c17779 : c17033.mo12015()) {
                    C4355 c4355M35634 = m35633(c17779.mo45586());
                    C17033 c17034 = (C17033) map4.get(c4355M35634);
                    if (c17034 == null) {
                        c17034 = new C17033();
                        map4.put(c4355M35634, c17034);
                        c4355M35634.f15730.add(c17034);
                    }
                    c17034.m40125(c17779.mo45587(), c17779.mo45586());
                }
            }
        }
        ArrayList arrayList4 = this.f48404;
        Collections.reverse(arrayList4.subList(1, arrayList4.size()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4355 m35633(int i) {
        int i2 = (i >>> 16) & 255;
        C23747 c23747 = (C23747) this.f48407.get(Integer.valueOf(i2));
        int i3 = 65535 & i;
        if ((i >>> 24) == this.f48406.mo27607() && c23747 != null && i3 < c23747.f76957.size() && c23747.m53021(i3) != null) {
            return (C4355) this.f48405.get(Integer.valueOf(i2));
        }
        return (C4355) this.f48404.get(0);
    }
}
