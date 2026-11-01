package l;

/* JADX INFO: renamed from: l.۟ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99EG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7245 implements InterfaceC8805 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19240 f24139;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8657 f24140;

    public AbstractC7245(InterfaceC8657 interfaceC8657, byte[] bArr) {
        this(interfaceC8657, new C19240(bArr));
    }

    public AbstractC7245(InterfaceC8657 interfaceC8657, C19240 c19240) {
        this.f24140 = interfaceC8657;
        this.f24139 = c19240;
        interfaceC8657.mo4333(c19240);
    }

    public AbstractC7245(InterfaceC8657 interfaceC8657) {
        this.f24140 = interfaceC8657;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8657 m19360() {
        return this.f24140;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19240 m19359() {
        return this.f24139;
    }
}
