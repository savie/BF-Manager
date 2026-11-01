package l;

/* JADX INFO: renamed from: l.۠᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C8489 extends C14279 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f29416;

    public C8489(InterfaceC7222 interfaceC7222, long j) {
        super(interfaceC7222);
        C2023.m6507(interfaceC7222.getPosition() >= j);
        this.f29416 = j;
    }

    @Override // l.C14279, l.InterfaceC7222
    public final long getPosition() {
        return super.getPosition() - this.f29416;
    }

    @Override // l.C14279, l.InterfaceC7222
    /* JADX INFO: renamed from: ۨ */
    public final long mo19213() {
        return super.mo19213() - this.f29416;
    }

    @Override // l.C14279, l.InterfaceC7222
    public final long getLength() {
        return super.getLength() - this.f29416;
    }
}
