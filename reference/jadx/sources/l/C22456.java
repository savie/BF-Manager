package l;

/* JADX INFO: renamed from: l.᩸֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C59K */
/* JADX INFO: loaded from: classes.dex */
public final class C22456 extends AbstractC24188 implements InterfaceC0321 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f72674 = new C10521();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f72675;

    public C22456(EnumC7779 enumC7779, int i) {
        super(enumC7779);
        this.f72675 = i;
        if (i == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead.");
        }
    }

    public C22456(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f72675 = C12556.m31241(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        int i2 = this.f72675;
        if (i2 == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead");
        }
        if (i2 < -32768 || i2 > 32767) {
            throw new RuntimeException("The address offset is out of range. It must be in [-32768,-1] or [1, 32768]");
        }
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(0);
        c24166.m54139(i2);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format20t;
    }

    @Override // l.InterfaceC0321
    /* JADX INFO: renamed from: ۤ */
    public final int mo2015() {
        return this.f72675;
    }
}
