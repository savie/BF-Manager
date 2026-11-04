package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17595 extends AbstractC3425 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f57130;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f57131;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 3;
    }

    public C17595(EnumC24309 enumC24309, int i, int i2) {
        super(enumC24309);
        this.f57131 = i;
        this.f57130 = i2;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f57131);
        c11388.m28735(this.f57130);
    }

    @Override // l.AbstractC3425
    /* JADX INFO: renamed from: ۙ */
    public final String mo6633() {
        return this.f57131 + " " + this.f57130;
    }

    @Override // l.AbstractC3425
    /* JADX INFO: renamed from: ᩷ */
    public final String mo6635() {
        return String.format("{ offset: %d; type_argument_index: %d; }", Integer.valueOf(this.f57131), Integer.valueOf(this.f57130));
    }
}
