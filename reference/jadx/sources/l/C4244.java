package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4M0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4244 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f15462 = (EnumC2536.STATIC.getValue() | EnumC2536.PRIVATE.getValue()) | EnumC2536.CONSTRUCTOR.getValue();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6163 f15461 = new C6482();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC6163 f15463 = new C24382();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13549(InterfaceC8631 interfaceC8631) {
        return (interfaceC8631.mo13184() & f15462) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13548(List list, boolean z) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            char cCharAt = ((CharSequence) it.next()).charAt(0);
            i = (cCharAt == 'J' || cCharAt == 'D') ? i + 2 : i + 1;
        }
        return !z ? i + 1 : i;
    }
}
