package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1552 extends AbstractC9315 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6279;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 1;
    }

    public C1552(EnumC2300 enumC2300, int i) {
        super(enumC2300);
        this.f6279 = i;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        ((C23509) interfaceC19275).m51765(this.f6279);
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo5333() {
        return String.format("{ type_parameter_index: %d; }", Integer.valueOf(this.f6279));
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo5332() {
        return String.valueOf(this.f6279);
    }
}
