package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25VK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5720 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16759(C13791 c13791) {
        C11817 c11817;
        ArrayList<C13397> arrayList = c13791.f43748;
        c13791.f43748 = new ArrayList();
        C13177 c13177 = new C13177();
        for (C13397 c13397 : arrayList) {
            C13397 c13397M33033 = c13397.m33033(c13177);
            AbstractC12563 abstractC12563M31273 = c13397.f42695.m31273();
            boolean z = false;
            while (true) {
                c11817 = c13397.f42694;
                if (abstractC12563M31273 == c11817) {
                    break;
                }
                if (C22874.m51599(abstractC12563M31273)) {
                    if (!z) {
                        AbstractC12563 abstractC12563M31272 = abstractC12563M31273.m31272();
                        if (abstractC12563M31272 == null || abstractC12563M31272.f40344 != EnumC20768.LABEL) {
                            abstractC12563M31272 = new C11817();
                            c13791.f43750.m54765(abstractC12563M31273, abstractC12563M31272);
                        }
                        c13397M33033.f42695 = (C11817) abstractC12563M31272;
                        z = true;
                    }
                } else if (z) {
                    AbstractC12563 abstractC12563M31274 = abstractC12563M31273.m31272();
                    if (abstractC12563M31274 == null || abstractC12563M31274.f40344 != EnumC20768.LABEL) {
                        abstractC12563M31274 = new C11817();
                        c13791.f43750.m54765(abstractC12563M31273, abstractC12563M31274);
                    }
                    c13397M33033.f42694 = (C11817) abstractC12563M31274;
                    c13791.f43748.add(c13397M33033);
                    c13397M33033 = c13397.m33033(c13177);
                    z = false;
                }
                abstractC12563M31273 = abstractC12563M31273.m31273();
            }
            if (z) {
                c13397M33033.f42694 = c11817;
                c13791.f43748.add(c13397M33033);
            }
        }
    }
}
