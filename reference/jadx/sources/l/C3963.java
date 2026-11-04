package l;

import java.io.InputStream;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3963 implements InterfaceC15319, InterfaceC2385, InterfaceC18133 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13545;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13546;

    public /* synthetic */ C3963(Object obj, Object obj2) {
        this.f13545 = obj;
        this.f13546 = obj2;
    }

    @Override // l.InterfaceC15319
    /* JADX INFO: renamed from: ۙ */
    public void mo8292(Object obj, C23108 c23108) {
        InterfaceC19992 interfaceC19992 = (InterfaceC19992) obj;
        interfaceC19992.mo45988((InterfaceC19533) this.f13546, new C22976(c23108, ((C2093) this.f13545).f6948));
    }

    @Override // l.InterfaceC18133
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo12699(String str, String str2, boolean z, boolean z2, boolean z3) {
        ViewOnClickListenerC0234.m1707((ViewOnClickListenerC0234) this.f13545, (Set) this.f13546, str, str2, z, z2, z3);
    }

    @Override // l.InterfaceC2385
    /* JADX INFO: renamed from: ۙ */
    public InputStream mo8088(long j) {
        return ((AbstractC18881) this.f13545).mo35570(j, ((InterfaceC2386) this.f13546).getPath());
    }
}
