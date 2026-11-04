package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16103 extends AbstractC3425 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52169;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52170;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 2;
    }

    public C16103(EnumC24309 enumC24309, int i, int i2) {
        super(enumC24309);
        this.f52169 = i;
        this.f52170 = i2;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735(this.f52169);
        c11388.m28735(this.f52170);
    }

    @Override // l.AbstractC3425
    /* JADX INFO: renamed from: ۙ */
    public final String mo6633() {
        return this.f52169 + " " + this.f52170;
    }

    @Override // l.AbstractC3425
    /* JADX INFO: renamed from: ᩷ */
    public final String mo6635() {
        return String.format("{ type_parameter_index: %d; bound_index: %d; }", Integer.valueOf(this.f52169), Integer.valueOf(this.f52170));
    }
}
