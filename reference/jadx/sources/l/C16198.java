package l;

/* JADX INFO: renamed from: l.ܶܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes5.dex */
public class C16198 implements InterfaceC10650, InterfaceC15125 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC10650 f52580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12469 f52581;

    public C16198(C12469 c12469, InterfaceC10650 interfaceC10650) {
        this.f52581 = c12469;
        this.f52580 = interfaceC10650;
    }

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ۤ */
    public final int mo4171() {
        return this.f52580.mo4171();
    }

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ᩸ */
    public final int mo15046() {
        return this.f52580.mo15046();
    }

    @Override // l.InterfaceC15125
    public final String getName() {
        return ((InterfaceC15125) this.f52580).getName();
    }

    @Override // l.InterfaceC15125
    public final String getType() {
        return (String) C19906.m45835(this.f52581.f40053.m54589(), ((InterfaceC15125) this.f52580).getType());
    }

    @Override // l.InterfaceC15125
    public final String getSignature() {
        return ((InterfaceC15125) this.f52580).getSignature();
    }
}
