package l;

/* JADX INFO: renamed from: l.᩷ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99EG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21779 implements InterfaceC13988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7453 f69454;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC14164 f69455;

    public AbstractC21779(InterfaceC14164 interfaceC14164, byte[] bArr) {
        this(interfaceC14164, new C7453(bArr));
    }

    public AbstractC21779(InterfaceC14164 interfaceC14164, C7453 c7453) {
        this.f69455 = interfaceC14164;
        this.f69454 = c7453;
        interfaceC14164.mo4192(c7453);
    }

    public AbstractC21779(InterfaceC14164 interfaceC14164) {
        this.f69455 = interfaceC14164;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC14164 m49391() {
        return this.f69455;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7453 m49390() {
        return this.f69454;
    }
}
