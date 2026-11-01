package l;

/* JADX INFO: renamed from: l.ۘܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G67N */
/* JADX INFO: loaded from: classes3.dex */
public final class C4049 extends AbstractC4300 implements InterfaceC21940 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f14948 = new C13223();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f14949;

    public C4049(EnumC0772 enumC0772, int i) {
        super(enumC0772);
        this.f14949 = i;
        if (i == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead.");
        }
    }

    public C4049(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f14949 = bArr[i + 1];
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        int i2 = this.f14949;
        if (i2 == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead");
        }
        if (i2 < -128 || i2 > 127) {
            throw new RuntimeException("The address offset is out of range. It must be in [-128,-1] or [1, 127]");
        }
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(i2);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format10t;
    }

    @Override // l.InterfaceC21940
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo11553() {
        return this.f14949;
    }
}
