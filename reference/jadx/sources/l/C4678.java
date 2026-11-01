package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 150C */
/* JADX INFO: loaded from: classes2.dex */
public final class C4678 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m12968() {
        AbstractC20745 abstractC20745M46690 = C11904.m29695().m46690("dictionary");
        if (!abstractC20745M46690.mo33975() || !C1709.m5692()) {
            return Collections.EMPTY_LIST;
        }
        final String strM39288 = C16737.m39288(R.string.MT_Protector);
        List list = (List) C9030.stream(abstractC20745M46690.mo33983(true)).filter(new C9350(0)).map(new C13874(1)).sorted(new Comparator() { // from class: l.ۗۙۖ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String strM1373 = ((C0176) obj).m1373();
                String strM1374 = ((C0176) obj2).m1373();
                String str = strM39288;
                if (strM1373.equalsIgnoreCase(str)) {
                    return -1;
                }
                if (strM1374.equalsIgnoreCase(str)) {
                    return 1;
                }
                return strM1373.compareToIgnoreCase(strM1374);
            }
        }).collect(C1890.toList());
        if (!list.isEmpty()) {
            return list;
        }
        AbstractC20745 abstractC20745M12969 = m12969(strM39288);
        if (abstractC20745M12969.mo33975() || abstractC20745M12969.mo33978()) {
            return Collections.singletonList(new C0176(strM39288));
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m12969(String str) {
        return C11904.m29695().m46690("dictionary").m46690(str + ".mtd");
    }
}
