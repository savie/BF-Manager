package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩶ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes5.dex */
public final class C19959 extends C15091 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19003 f63919;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0202 f63920;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f63921;

    public C19959(C0202 c0202, Set set, C19003 c19003) {
        this.f63920 = c0202;
        this.f63921 = set;
        this.f63919 = c19003;
    }

    @Override // l.C15091, l.InterfaceC2389
    public final EnumC11563 preVisitDirectory(Object obj, InterfaceC20735 interfaceC20735) {
        if (C0202.m1511(this.f63920, ((InterfaceC3800) obj).getFileName())) {
            return EnumC11563.CONTINUE;
        }
        return EnumC11563.SKIP_SUBTREE;
    }

    @Override // l.C15091, l.InterfaceC2389
    public final EnumC11563 visitFile(Object obj, InterfaceC20735 interfaceC20735) {
        InterfaceC3800 interfaceC3800 = (InterfaceC3800) obj;
        if (interfaceC20735.isRegularFile()) {
            if (this.f63921.contains(AbstractC3729.m10910(interfaceC3800.getFileName().toString()))) {
                C0202 c0202 = this.f63920;
                C14315 c14315 = c0202.f1358;
                InterfaceC3800 interfaceC3801 = c0202.f1359;
                int i = AbstractC6344.f21400;
                this.f63919.m43723(new C12695(c14315, interfaceC3800, interfaceC3801, 0));
            }
        }
        return EnumC11563.CONTINUE;
    }
}
