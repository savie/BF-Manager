package l;

/* JADX INFO: renamed from: l.֡֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 94VR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0068 extends AbstractC14181 implements InterfaceC12064 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C17002 f965;

    @Override // l.InterfaceC12064
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17002 mo986() {
        return this.f965;
    }

    public C0068(C17002 c17002) {
        super(EnumC2890.GOTO);
        this.f965 = c17002;
    }

    @Override // l.AbstractC4777
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4777 mo985(C10527 c10527) {
        return new C0068(c10527.mo2550(this.f965));
    }

    public final String toString() {
        return "GOTO ".concat(this.f965.m39782());
    }
}
