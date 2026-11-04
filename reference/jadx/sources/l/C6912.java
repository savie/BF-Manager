package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 150C */
/* JADX INFO: loaded from: classes3.dex */
public final class C6912 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m19190() {
        AbstractC22044 abstractC22044M49876 = C6382.m18134().m49876("dictionary");
        if (!abstractC22044M49876.mo2934() || !C18978.m44079()) {
            return Collections.EMPTY_LIST;
        }
        final String strM49088 = C21576.m49088(R.string.MT_Protector);
        int i = 1;
        List list = (List) C1170.stream(abstractC22044M49876.mo4299(true)).filter(new C15165(i)).map(new C22493(i)).sorted(new Comparator() { // from class: l.۠ۙ᩸
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String strM42221 = ((C18099) obj).m42221();
                String strM42222 = ((C18099) obj2).m42221();
                String str = strM49088;
                if (strM42221.equalsIgnoreCase(str)) {
                    return -1;
                }
                if (strM42222.equalsIgnoreCase(str)) {
                    return 1;
                }
                return strM42221.compareToIgnoreCase(strM42222);
            }
        }).collect(C2025.toList());
        if (!list.isEmpty()) {
            return list;
        }
        AbstractC22044 abstractC22044M19191 = m19191(strM49088);
        if (abstractC22044M19191.mo2934() || abstractC22044M19191.mo4283()) {
            return Collections.singletonList(new C18099(strM49088));
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m19191(String str) {
        return C6382.m18134().m49876("dictionary").m49876(str + ".mtd");
    }
}
