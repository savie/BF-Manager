package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C22817 extends C12381 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC3425 f73947;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC24309 f73948;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20579 f73949;

    public C22817(C7660 c7660, boolean z) {
        super(c7660, z);
        this.f73949 = new C20579();
    }

    @Override // l.C12381, l.InterfaceC3359
    public final int getLength() {
        return this.f73949.getLength() + super.getLength() + 1 + this.f73947.getLength();
    }

    @Override // l.C12381, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735(this.f73948.f78690);
        this.f73947.mo1599(c11388);
        this.f73949.mo1599(c11388);
        super.mo1599(c11388);
    }

    public final String toString() {
        return this.f73948.toString() + " " + this.f73947.toString() + " " + this.f73949.toString();
    }
}
