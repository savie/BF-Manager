package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۠ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8589 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str.equalsIgnoreCase(str2)) {
            return 0;
        }
        if (str.equalsIgnoreCase("type-info")) {
            return -1;
        }
        if (str2.equalsIgnoreCase("type-info")) {
            return 1;
        }
        return str.compareToIgnoreCase(str2);
    }
}
