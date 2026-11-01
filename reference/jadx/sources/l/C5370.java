package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4M0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5370 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f18562 = (EnumC15236.STATIC.getValue() | EnumC15236.PRIVATE.getValue()) | EnumC15236.CONSTRUCTOR.getValue();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19010 f18561 = new C11721();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19010 f18563 = new C2547();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14888(InterfaceC18528 interfaceC18528) {
        return (interfaceC18528.mo25750() & f18562) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14887(List list, boolean z) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            char cCharAt = ((CharSequence) it.next()).charAt(0);
            i = (cCharAt == 'J' || cCharAt == 'D') ? i + 2 : i + 1;
        }
        return !z ? i + 1 : i;
    }
}
