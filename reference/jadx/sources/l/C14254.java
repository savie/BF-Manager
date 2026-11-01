package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14254 extends AbstractC9315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f46664;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f46665;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 2;
    }

    public C14254(EnumC2300 enumC2300, int i, int i2) {
        super(enumC2300);
        this.f46664 = i;
        this.f46665 = i2;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765(this.f46664);
        c23509.m51765(this.f46665);
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۙ */
    public final String mo5332() {
        return this.f46664 + " " + this.f46665;
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۨ */
    public final String mo5333() {
        return String.format("{ type_parameter_index: %d; bound_index: %d; }", Integer.valueOf(this.f46664), Integer.valueOf(this.f46665));
    }
}
