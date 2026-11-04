package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L1Y0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17585 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41246(Main main, InterfaceC2386 interfaceC2386, String str, InterfaceC16839 interfaceC16839) {
        int iLastIndexOf;
        String name = interfaceC2386.mo8093().m49839(true).getName();
        if (interfaceC2386.isDirectory() || (iLastIndexOf = name.lastIndexOf(46)) == -1) {
            iLastIndexOf = name.length();
        }
        C25045 c25045 = new C25045(main, str, interfaceC16839);
        c25045.m22945(R.string.MT_Protector);
        c25045.m22924((CharSequence) name);
        c25045.m22918();
        c25045.m22957(6);
        c25045.m22920(0, iLastIndexOf);
        c25045.m22955(true);
    }
}
