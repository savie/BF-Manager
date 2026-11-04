package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes.dex */
public final class C25055 extends AbstractC3425 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f81041;

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 2;
    }

    public C25055(EnumC24309 enumC24309, int i) {
        super(enumC24309);
        this.f81041 = i;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        ((C11388) interfaceC9397).m28740(this.f81041);
    }

    @Override // l.AbstractC3425
    /* JADX INFO: renamed from: ᩷ */
    public final String mo6635() {
        return String.format("{ supertype_index: %d; }", Integer.valueOf(this.f81041));
    }

    @Override // l.AbstractC3425
    /* JADX INFO: renamed from: ۙ */
    public final String mo6633() {
        return String.valueOf(this.f81041);
    }
}
