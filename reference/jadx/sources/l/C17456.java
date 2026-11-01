package l;

/* JADX INFO: renamed from: l.ܿܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17456 extends AbstractC4300 implements InterfaceC21940, InterfaceC3594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f55555 = new C12518();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public short f55556;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f55557;

    public C17456(EnumC0772 enumC0772, short s, short s2) {
        super(enumC0772);
        if (s >= 256) {
            throw new RuntimeException("The register number must be less than v256");
        }
        if (s2 == 0) {
            throw new RuntimeException("The address offset cannot be 0.");
        }
        this.f55557 = (byte) s;
        this.f55556 = s2;
    }

    public C17456(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f55557 = bArr[i + 1];
        this.f55556 = C14611.m35089(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(this.f55557);
        c4651.m12833(this.f55556);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format21t;
    }

    @Override // l.InterfaceC3594
    /* JADX INFO: renamed from: ۙ */
    public final int mo4757() {
        return this.f55557 & 255;
    }

    @Override // l.InterfaceC21940
    /* JADX INFO: renamed from: ۖ */
    public final int mo11553() {
        return this.f55556;
    }
}
