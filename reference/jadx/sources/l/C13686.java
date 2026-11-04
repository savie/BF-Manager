package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۬ۜ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C13686 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC11449 m33476(InterfaceC9211 interfaceC9211, AbstractC22088 abstractC22088, int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) != 0;
        return interfaceC9211 instanceof C15374 ? ((C15374) interfaceC9211).m36819(z, z2, abstractC22088) : interfaceC9211.mo24380(z, z2, new C4934(1, abstractC22088, InterfaceC7721.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m33478(InterfaceC11536 interfaceC11536, CancellationException cancellationException) {
        C1009 c1009 = InterfaceC9211.f30029;
        InterfaceC9211 interfaceC9211 = (InterfaceC9211) interfaceC11536.mo5005(C1009.f3674);
        if (interfaceC9211 != null) {
            interfaceC9211.mo24382(cancellationException);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m33477(InterfaceC11536 interfaceC11536) {
        C1009 c1009 = InterfaceC9211.f30029;
        InterfaceC9211 interfaceC9211 = (InterfaceC9211) interfaceC11536.mo5005(C1009.f3674);
        if (interfaceC9211 != null && !interfaceC9211.mo24383()) {
            throw interfaceC9211.mo24384();
        }
    }
}
