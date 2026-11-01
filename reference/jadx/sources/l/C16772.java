package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25VK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16772 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39332(C9116 c9116) {
        C17002 c17002;
        ArrayList<C16876> arrayList = c9116.f31040;
        c9116.f31040 = new ArrayList();
        C0543 c0543 = new C0543();
        for (C16876 c16876 : arrayList) {
            C16876 c16876M39538 = c16876.m39538(c0543);
            AbstractC4777 abstractC4777M13247 = c16876.f53976.m13247();
            boolean z = false;
            while (true) {
                c17002 = c16876.f53975;
                if (abstractC4777M13247 == c17002) {
                    break;
                }
                if (C21005.m47171(abstractC4777M13247)) {
                    if (!z) {
                        AbstractC4777 abstractC4777M13249 = abstractC4777M13247.m13249();
                        if (abstractC4777M13249 == null || abstractC4777M13249.f16795 != EnumC2890.LABEL) {
                            abstractC4777M13249 = new C17002();
                            c9116.f31045.m29526(abstractC4777M13247, abstractC4777M13249);
                        }
                        c16876M39538.f53976 = (C17002) abstractC4777M13249;
                        z = true;
                    }
                } else if (z) {
                    AbstractC4777 abstractC4777M132410 = abstractC4777M13247.m13249();
                    if (abstractC4777M132410 == null || abstractC4777M132410.f16795 != EnumC2890.LABEL) {
                        abstractC4777M132410 = new C17002();
                        c9116.f31045.m29526(abstractC4777M13247, abstractC4777M132410);
                    }
                    c16876M39538.f53975 = (C17002) abstractC4777M132410;
                    c9116.f31040.add(c16876M39538);
                    c16876M39538 = c16876.m39538(c0543);
                    z = false;
                }
                abstractC4777M13247 = abstractC4777M13247.m13247();
            }
            if (z) {
                c16876M39538.f53975 = c17002;
                c9116.f31040.add(c16876M39538);
            }
        }
    }
}
