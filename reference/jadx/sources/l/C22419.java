package l;

/* JADX INFO: renamed from: l.᩷᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8IT */
/* JADX INFO: loaded from: classes2.dex */
public final class C22419 extends C3094 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f72606;

    public C22419(InterfaceC19502 interfaceC19502, long j) {
        super(interfaceC19502);
        C20782.m47565(interfaceC19502.getPosition() >= j);
        this.f72606 = j;
    }

    @Override // l.C3094, l.InterfaceC19502
    public final long getPosition() {
        return super.getPosition() - this.f72606;
    }

    @Override // l.C3094, l.InterfaceC19502
    /* JADX INFO: renamed from: ۤ */
    public final long mo10072() {
        return super.mo10072() - this.f72606;
    }

    @Override // l.C3094, l.InterfaceC19502
    public final long getLength() {
        return super.getLength() - this.f72606;
    }
}
