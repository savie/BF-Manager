package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7ON */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24390 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C2346 f79112 = C2346.m7914((Integer) (-1), (Integer) (-1));

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AbstractC6468 f79113 = AbstractC6468.m18293();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f79114 = AbstractC1928.of();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f79115 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54504(AbstractC1928 abstractC1928) {
        this.f79114 = abstractC1928;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54500() {
        return this.f79114.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54501(int i) {
        return (String) this.f79114.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54502(AbstractC1928 abstractC1928) {
        ArrayList arrayList;
        Iterator it = abstractC1928.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC20660 interfaceC20660 = (InterfaceC20660) it.next();
            String strMo18733 = interfaceC20660.mo18733();
            int i2 = C21406.f68189;
            int iM20915 = (C7676.m20915(new C14692(strMo18733)) - 1) + i;
            int index = interfaceC20660.getIndex();
            if (index >= 0) {
                while (i <= iM20915) {
                    while (true) {
                        arrayList = this.f79115;
                        if (arrayList.size() > i) {
                            break;
                        } else {
                            arrayList.add(f79112);
                        }
                    }
                    C2346 c2346 = (C2346) arrayList.get(i);
                    arrayList.set(i, C2346.m7914(Integer.valueOf(c2346.m7917() ? index : ((Integer) c2346.m7922()).intValue()), Integer.valueOf(index + 1)));
                    i++;
                }
            }
            i = iM20915;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m54499(C11338 c11338) {
        HashMap map = new HashMap();
        int size = c11338.f79114.size();
        for (int i = 0; i <= size; i++) {
            C2346 c2346M7916 = c11338.m54503(i).m7916(f79113);
            for (int iIntValue = ((Integer) c2346M7916.m7922()).intValue(); iIntValue < ((Integer) c2346M7916.m7920()).intValue(); iIntValue++) {
                if (map.containsKey(Integer.valueOf(iIntValue))) {
                    map.put(Integer.valueOf(iIntValue), C2346.m7914((Integer) ((C2346) map.get(Integer.valueOf(iIntValue))).m7922(), Integer.valueOf(i + 1)));
                } else {
                    map.put(Integer.valueOf(iIntValue), C2346.m7914(Integer.valueOf(i), Integer.valueOf(i + 1)));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2346 m54503(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f79115;
            if (i < arrayList.size()) {
                return (C2346) arrayList.get(i);
            }
        }
        return f79112;
    }

    public String toString() {
        return "InputOutput{lines=" + this.f79114 + ", ranges=" + this.f79115 + '}';
    }
}
