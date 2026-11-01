package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes.dex */
public final class C23426 extends AbstractC9315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f75849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75850;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 3;
    }

    public C23426(EnumC2300 enumC2300, int i, int i2) {
        super(enumC2300);
        this.f75850 = i;
        this.f75849 = i2;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f75850);
        c23509.m51765(this.f75849);
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۙ */
    public final String mo5332() {
        return this.f75850 + " " + this.f75849;
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۨ */
    public final String mo5333() {
        return String.format("{ offset: %d; type_argument_index: %d; }", Integer.valueOf(this.f75850), Integer.valueOf(this.f75849));
    }
}
