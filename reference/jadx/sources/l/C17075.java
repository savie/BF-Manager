package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17075 extends AbstractC9315 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54494;

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 2;
    }

    public C17075(EnumC2300 enumC2300, int i) {
        super(enumC2300);
        this.f54494 = i;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        ((C23509) interfaceC19275).m51770(this.f54494);
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۙ */
    public final String mo5332() {
        return String.valueOf(this.f54494);
    }

    @Override // l.AbstractC9315
    /* JADX INFO: renamed from: ۨ */
    public final String mo5333() {
        return String.format("{ offset: %d; }", Integer.valueOf(this.f54494));
    }
}
