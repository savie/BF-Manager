package l;

/* JADX INFO: renamed from: l.ܿ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9CS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18684 implements InterfaceC14164 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f60742 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f60743 = {-2, 83, 77, 66};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60744;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f60745;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC23906 f60746;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f60747;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f60748;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f60749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f60750;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f60751;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f60752;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f60753;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public EnumC15700 f60754;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f60755 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f60756;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f60757;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f60758;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43468(C7453 c7453) {
        this.f60749 = c7453.m56019();
        c7453.m56007(4, f60743);
        c7453.m56023(64);
        int i = C21668.f69173[this.f60754.ordinal()];
        if (i == 1 || i == 2) {
            c7453.m20459(2);
        } else {
            c7453.m56023(this.f60755);
        }
        if (this.f60754.m37476()) {
            c7453.m20461();
            c7453.m20461();
        } else {
            c7453.m20460();
        }
        c7453.m56023(this.f60746.getValue());
        c7453.m56023(this.f60747 + this.f60755);
        c7453.m56025(this.f60750);
        c7453.m56025(this.f60758);
        c7453.m56008(this.f60748);
        if (C10961.m27794(this.f60750, EnumC12717.SMB2_FLAGS_ASYNC_COMMAND)) {
            c7453.m56008(this.f60745);
        } else {
            c7453.m20460();
            c7453.m56025(this.f60757);
        }
        c7453.m56008(this.f60752);
        c7453.m56007(16, f60742);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43467(long j) {
        this.f60748 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43455(EnumC23906 enumC23906) {
        this.f60746 = enumC23906;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC23906 m43462() {
        return this.f60746;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m43464() {
        return this.f60757;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m43471(long j) {
        this.f60757 = j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m43461() {
        return this.f60752;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43460(long j) {
        this.f60752 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43454(EnumC15700 enumC15700) {
        this.f60754 = enumC15700;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43456(EnumC12717 enumC12717) {
        return C10961.m27794(this.f60750, enumC12717);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43469(EnumC12717 enumC12717) {
        this.f60750 |= enumC12717.getValue();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m43457() {
        return this.f60748;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43466(int i) {
        this.f60747 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m43465() {
        return this.f60756;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43453(long j) {
        this.f60745 = j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m43458() {
        return this.f60745;
    }

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ۙ */
    public final void mo4192(C7453 c7453) throws C2013 {
        this.f60749 = c7453.m56029();
        m43448(c7453, f60743);
        c7453.m56021(2);
        c7453.m56017();
        this.f60751 = c7453.m56012();
        this.f60746 = EnumC23906.m53402(c7453.m56017());
        this.f60756 = c7453.m56017();
        this.f60750 = c7453.m56012();
        this.f60758 = c7453.m56002();
        this.f60748 = c7453.m56018();
        if (C10961.m27794(this.f60750, EnumC12717.SMB2_FLAGS_ASYNC_COMMAND)) {
            this.f60745 = c7453.m56018();
        } else {
            c7453.m56021(4);
            this.f60757 = c7453.m56012();
        }
        this.f60752 = c7453.m56018();
        byte[] bArr = this.f60753;
        if (bArr == null || bArr.length != 16) {
            this.f60753 = new byte[16];
        }
        byte[] bArr2 = this.f60753;
        c7453.m56024(bArr2.length, bArr2);
        int i = this.f60758;
        if (i != 0) {
            this.f60744 = this.f60749 + i;
        } else {
            this.f60744 = c7453.m56019();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m43472() {
        return this.f60751;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m43463() {
        return this.f60750;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43451() {
        return this.f60758;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43452(int i) {
        this.f60755 = i;
    }

    public final String toString() {
        return String.format("dialect=%s, creditCharge=%s, creditRequest=%s, creditResponse=%s, message=%s, messageId=%s, asyncId=%s, sessionId=%s, treeId=%s, status=0x%08x, flags=%s, nextCommandOffset=%s", this.f60754, Integer.valueOf(this.f60755), Integer.valueOf(this.f60747), Integer.valueOf(this.f60756), this.f60746, Long.valueOf(this.f60748), Long.valueOf(this.f60745), Long.valueOf(this.f60752), Long.valueOf(this.f60757), Long.valueOf(this.f60751), Long.valueOf(this.f60750), Integer.valueOf(this.f60758));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m43470() {
        return this.f60755;
    }

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ۙ */
    public final int mo4190() {
        return this.f60749;
    }

    @Override // l.InterfaceC14164
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4193() {
        return this.f60744;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43459(int i) {
        this.f60744 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43449(byte[] bArr) {
        return m43450(bArr, f60743);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43448(C25134 c25134, byte[] bArr) {
        for (byte b : bArr) {
            if (c25134.m56020() != b) {
                throw new IllegalArgumentException("Could not find SMB2 Packet header");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43450(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }
}
