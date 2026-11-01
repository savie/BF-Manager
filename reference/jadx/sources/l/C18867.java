package l;

/* JADX INFO: renamed from: l.ᩴܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B5L5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18867 extends AbstractC4300 implements InterfaceC3594 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f61097 = new C18161();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f61098;

    public C18867(EnumC0772 enumC0772, short s) {
        super(enumC0772);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        this.f61098 = (byte) s;
    }

    public C18867(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f61098 = (byte) (bArr[i + 1] & 255);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f61098);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format11x;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f61098 & 255;
    }
}
