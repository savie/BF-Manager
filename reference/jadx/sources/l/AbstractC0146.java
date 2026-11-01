package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7ON */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0146 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f1198 = AbstractC22433.of();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1199 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C9548 f1197 = C9548.m24401((Integer) (-1), (Integer) (-1));

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8177 f1196 = AbstractC8177.m21475();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1248(AbstractC22433 abstractC22433) {
        this.f1198 = abstractC22433;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1244() {
        return this.f1198.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m1245(int i) {
        return (String) this.f1198.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1246(AbstractC22433 abstractC22433) {
        ArrayList arrayList;
        Iterator it = abstractC22433.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC20608 interfaceC20608 = (InterfaceC20608) it.next();
            String strMo37426 = interfaceC20608.mo37426();
            int i2 = C17080.f54498;
            int iM38724 = (C16458.m38724(new C12142(strMo37426)) - 1) + i;
            int index = interfaceC20608.getIndex();
            if (index >= 0) {
                while (i <= iM38724) {
                    while (true) {
                        arrayList = this.f1199;
                        if (arrayList.size() > i) {
                            break;
                        } else {
                            arrayList.add(f1197);
                        }
                    }
                    C9548 c9548 = (C9548) arrayList.get(i);
                    arrayList.set(i, C9548.m24401(Integer.valueOf(c9548.m24404() ? index : ((Integer) c9548.m24409()).intValue()), Integer.valueOf(index + 1)));
                    i++;
                }
            }
            i = iM38724;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m1243(C18806 c18806) {
        HashMap map = new HashMap();
        int size = c18806.f1198.size();
        for (int i = 0; i <= size; i++) {
            C9548 c9548M24403 = c18806.m1247(i).m24403(f1196);
            for (int iIntValue = ((Integer) c9548M24403.m24409()).intValue(); iIntValue < ((Integer) c9548M24403.m24407()).intValue(); iIntValue++) {
                if (map.containsKey(Integer.valueOf(iIntValue))) {
                    map.put(Integer.valueOf(iIntValue), C9548.m24401((Integer) ((C9548) map.get(Integer.valueOf(iIntValue))).m24409(), Integer.valueOf(i + 1)));
                } else {
                    map.put(Integer.valueOf(iIntValue), C9548.m24401(Integer.valueOf(i), Integer.valueOf(i + 1)));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9548 m1247(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f1199;
            if (i < arrayList.size()) {
                return (C9548) arrayList.get(i);
            }
        }
        return f1197;
    }

    public String toString() {
        return "InputOutput{lines=" + this.f1198 + ", ranges=" + this.f1199 + '}';
    }
}
