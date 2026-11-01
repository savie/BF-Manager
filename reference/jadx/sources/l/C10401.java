package l;

/* JADX INFO: renamed from: l.ۤܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C59K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10401 extends AbstractC4300 implements InterfaceC21940 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3468 f35577 = new C8990();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f35578;

    public C10401(EnumC0772 enumC0772, int i) {
        super(enumC0772);
        this.f35578 = i;
        if (i == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead.");
        }
    }

    public C10401(EnumC0772 enumC0772, byte[] bArr, int i) {
        super(enumC0772);
        this.f35578 = C14611.m35089(i + 2, bArr);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        int i2 = this.f35578;
        if (i2 == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead");
        }
        if (i2 < -32768 || i2 > 32767) {
            throw new RuntimeException("The address offset is out of range. It must be in [-32768,-1] or [1, 32768]");
        }
        c4651.m12841(this.f15468.f3346);
        c4651.m12841(0);
        c4651.m12833(i2);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.Format20t;
    }

    @Override // l.InterfaceC21940
    /* JADX INFO: renamed from: ۖ */
    public final int mo11553() {
        return this.f35578;
    }
}
