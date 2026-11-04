package l;

/* JADX INFO: renamed from: l.᩵֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U7DO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20251 extends C12156 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f65037;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20251(C0224 c0224) {
        super(c0224);
        EnumC5202 enumC5202 = EnumC5202.f18313;
        this.f39081 = enumC5202;
        this.f65037 = -1;
        this.f67131 = EnumC10882.EXCEPTIONS;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m46524(int i) {
        this.f65037 = i;
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo46523() {
        int i = this.f65037;
        return i == -1 ? super.mo46523() : i;
    }
}
