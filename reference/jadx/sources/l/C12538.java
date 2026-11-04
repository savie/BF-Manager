package l;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5UK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12538 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31153(C5564 c5564, C2161 c2161, InterfaceC2665 interfaceC2665, InterfaceC16791 interfaceC16791, boolean z) throws IOException {
        int iMo8823 = interfaceC2665.mo8823();
        if (z && EnumC2536.STATIC.m8459(iMo8823) && EnumC2536.FINAL.m8459(iMo8823) && interfaceC16791 != null) {
            if (C16922.m39905(interfaceC16791)) {
                interfaceC16791 = null;
            } else {
                c2161.getClass();
                c2161.write("# The value of this static final field might be set in the static constructor\n", 0, 78);
            }
        }
        c2161.getClass();
        c2161.write(".field ", 0, 7);
        int iMo8824 = interfaceC2665.mo8823();
        Set setMo8821 = interfaceC2665.mo8821();
        for (EnumC2536 enumC2536 : EnumC2536.m8453(iMo8824)) {
            c2161.write(enumC2536.toString());
            c2161.write(32);
        }
        Iterator it = setMo8821.iterator();
        while (it.hasNext()) {
            c2161.write(((EnumC13722) it.next()).toString());
            c2161.write(32);
        }
        C14684.m35311((Writer) c2161, (InterfaceC8304) interfaceC2665, true);
        if (interfaceC16791 != null) {
            c2161.write(" = ", 0, 3);
            c5564.getClass();
            AbstractC3589.m11645(c2161, interfaceC16791);
        }
        c2161.write(10);
        Set annotations = interfaceC2665.getAnnotations();
        if (annotations.size() > 0) {
            c2161.m7439();
            c5564.getClass();
            C13701.m33494(c2161, annotations);
            c2161.m7435();
            c2161.write(".end field\n", 0, 11);
        }
    }
}
