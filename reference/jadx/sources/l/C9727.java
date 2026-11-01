package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۢܿ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C9727 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m24682(InterfaceC22386 interfaceC22386, CancellationException cancellationException) {
        C6198 c6198 = InterfaceC11138.f37788;
        InterfaceC11138 interfaceC11138 = (InterfaceC11138) interfaceC22386.mo4416(C6198.f21082);
        if (interfaceC11138 != null) {
            interfaceC11138.mo7114(cancellationException);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m24681(InterfaceC22386 interfaceC22386) {
        C6198 c6198 = InterfaceC11138.f37788;
        InterfaceC11138 interfaceC11138 = (InterfaceC11138) interfaceC22386.mo4416(C6198.f21082);
        if (interfaceC11138 != null && !interfaceC11138.mo7120()) {
            throw interfaceC11138.mo7109();
        }
    }
}
