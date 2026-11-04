package l;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.۫۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4W4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13107 implements InterfaceC19795, InterfaceC22615, InterfaceC1396 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32571(int i) {
        if (i >= 0 && i <= 8) {
            return true;
        }
        if (i < 16 || i > 18) {
            return i >= 28 && i <= 31;
        }
        return true;
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        return new LinkedHashSet();
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }
}
