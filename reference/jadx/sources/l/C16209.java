package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16209 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4108 f52320;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38320(C4108 c4108) {
        c4108.m11672(new C21147(new C16209(c4108), C23970.m52814()));
    }

    public C16209(C4108 c4108) {
        this.f52320 = c4108;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38323(C16209 c16209, C6330 c6330) {
        C4108 c4108 = c16209.f52320;
        C12723 c12723M37181 = c6330.mo17428().m37181();
        C16251 c16251M49955 = c6330.m49955();
        if (c16251M49955 != null && !c4108.m11679(c16251M49955) && c12723M37181.m31572() != 5) {
            InterfaceC4919 interfaceC4919M38401 = c6330.m49955().m38401();
            if (interfaceC4919M38401.mo9847() && interfaceC4919M38401.mo9834() == 6) {
                C0727 c0727 = C0727.f3015;
                c16209.m38321(c6330, c0727, 5, (AbstractC9901) interfaceC4919M38401);
                if (c12723M37181.m31572() == 56) {
                    c16209.m38321((C6330) C19084.m43861(((C11871) c4108.m11687().get(c6330.m49949().m29596().nextSetBit(0))).m29613(), 1), c0727, 6, (AbstractC9901) null);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m38321(C6330 c6330, C0727 c0727, int i, AbstractC9901 abstractC9901) {
        AbstractC15546 c9196;
        AbstractC15546 abstractC15546Mo17428 = c6330.mo17428();
        C12723 c12723M17482 = C6372.m17482(i, c6330.m49955(), c0727, abstractC9901);
        if (abstractC9901 == null) {
            c9196 = new C10607(c12723M17482, abstractC15546Mo17428.m37183(), c6330.m49955(), c0727);
        } else {
            c9196 = new C9196(c12723M17482, abstractC15546Mo17428.m37183(), c6330.m49955(), c0727, abstractC9901);
        }
        C6330 c6331 = new C6330(c9196, c6330.m49949());
        ArrayList arrayListM29613 = c6330.m49949().m29613();
        C4108 c4108 = this.f52320;
        c4108.m11676(c6330);
        arrayListM29613.set(arrayListM29613.lastIndexOf(c6330), c6331);
        c4108.m11673(c6331, (C0727) null);
        c4108.m11677(c6331, (C16251) null);
    }
}
