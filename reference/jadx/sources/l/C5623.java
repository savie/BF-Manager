package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۚ᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5623 implements InterfaceC20765, InterfaceC11974, InterfaceC1483 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19251;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19252;

    public /* synthetic */ C5623(Object obj, Object obj2) {
        this.f19251 = obj;
        this.f19252 = obj2;
    }

    @Override // l.InterfaceC11974
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12731 mo15512(String str, String str2, String str3) {
        return C17617.m40954((String) this.f19251, (String) this.f19252, str, str2, str3);
    }

    @Override // l.InterfaceC20765
    /* JADX INFO: renamed from: ۙ */
    public void mo8979(Object obj, C9060 c9060) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        interfaceC10430.mo26344((InterfaceC10161) this.f19252, new C9019(c9060, ((C0550) this.f19251).f2309));
    }

    @Override // l.InterfaceC1483
    /* JADX INFO: renamed from: ۙ */
    public InputStream mo5129(long j) {
        return ((AbstractC12233) this.f19251).mo10262(j, ((InterfaceC2557) this.f19252).getPath());
    }
}
