package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩸ۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21560 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String strM47741 = C21291.m47741((InterfaceC12783) obj);
        String strM47742 = C21291.m47741((InterfaceC12783) obj2);
        if (strM47741.equals(strM47742)) {
            return 0;
        }
        if ("default".equals(strM47741)) {
            return -1;
        }
        if ("default".equals(strM47742)) {
            return 1;
        }
        return strM47741.compareTo(strM47742);
    }
}
