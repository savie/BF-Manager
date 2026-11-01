package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L1Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7872 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20771(Main main, InterfaceC2557 interfaceC2557, String str, InterfaceC18455 interfaceC18455) {
        int iLastIndexOf;
        String name = interfaceC2557.mo7989().m46693(true).getName();
        if (interfaceC2557.isDirectory() || (iLastIndexOf = name.lastIndexOf(46)) == -1) {
            iLastIndexOf = name.length();
        }
        C17749 c17749 = new C17749(main, str, interfaceC18455);
        c17749.m40376(R.string.MT_Protector);
        c17749.m40346((CharSequence) name);
        c17749.m40340();
        c17749.m40336(6);
        c17749.m40342(0, iLastIndexOf);
        c17749.m40368(true);
    }
}
