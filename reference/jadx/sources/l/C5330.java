package l;

/* JADX INFO: renamed from: l.ۚۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7DO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5330 extends C3006 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f18399;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5330(C3980 c3980) {
        super(c3980);
        EnumC20934 enumC20934 = EnumC20934.f68198;
        this.f11255 = enumC20934;
        this.f18399 = -1;
        this.f22696 = EnumC10020.EXCEPTIONS;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m14808(int i) {
        this.f18399 = i;
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int mo14807() {
        int i = this.f18399;
        return i == -1 ? super.mo14807() : i;
    }
}
