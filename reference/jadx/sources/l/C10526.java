package l;

/* JADX INFO: renamed from: l.ۤ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L58X */
/* JADX INFO: loaded from: classes4.dex */
public final class C10526 extends AbstractC11357 implements InterfaceC11812 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f36027 = new C9115();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte f36028;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte f36029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte f36030;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f36031;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f36032;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte f36033;

    public C10526(EnumC0772 enumC0772, int i, byte b, byte b2, byte b3, byte b4, byte b5, AbstractC9011 abstractC9011) {
        super(enumC0772, abstractC9011);
        if (i > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        if (b >= 16 || b2 >= 16 || b3 >= 16 || b4 >= 16 || b5 >= 16) {
            throw new RuntimeException("All register args must fit in 4 bits");
        }
        this.f36029 = (byte) i;
        this.f36031 = b5;
        this.f36030 = b;
        this.f36033 = b2;
        this.f36028 = b3;
        this.f36032 = b4;
    }

    public C10526(C12063 c12063, EnumC0772 enumC0772, byte[] bArr, int i) {
        super(c12063, enumC0772, bArr, i);
        if (this.f36029 > 5) {
            throw new RuntimeException("regCount cannot be greater than 5");
        }
        int i2 = i + 1;
        this.f36029 = C14611.m35076(bArr[i2]);
        this.f36031 = (byte) (bArr[i2] & 15);
        byte b = bArr[i + 4];
        this.f36030 = (byte) (b & 15);
        this.f36033 = C14611.m35076(b);
        byte b2 = bArr[i + 5];
        this.f36028 = (byte) (b2 & 15);
        this.f36032 = C14611.m35076(b2);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12841(this.f15468.f3346);
        c4651.m12841((this.f36029 << 4) | this.f36031);
        c4651.m12833(m28439().m23325());
        c4651.m12841((this.f36033 << 4) | this.f36030);
        c4651.m12841((this.f36032 << 4) | this.f36028);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format35c;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte mo26663() {
        return this.f36029;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte mo26664() {
        return this.f36031;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte mo26666() {
        return this.f36030;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte mo26668() {
        return this.f36033;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte mo26665() {
        return this.f36028;
    }

    @Override // l.InterfaceC11812
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte mo26667() {
        return this.f36032;
    }
}
