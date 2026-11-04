package l;

/* JADX INFO: renamed from: l.ۢۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67N */
/* JADX INFO: loaded from: classes4.dex */
public final class C10037 extends AbstractC24188 implements InterfaceC0321 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f32169 = new C18988();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f32170;

    public C10037(EnumC7779 enumC7779, int i) {
        super(enumC7779);
        this.f32170 = i;
        if (i == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead.");
        }
    }

    public C10037(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f32170 = bArr[i + 1];
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        int i2 = this.f32170;
        if (i2 == 0) {
            throw new RuntimeException("The address offset cannot be 0. Use goto/32 instead");
        }
        if (i2 < -128 || i2 > 127) {
            throw new RuntimeException("The address offset is out of range. It must be in [-128,-1] or [1, 127]");
        }
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(i2);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format10t;
    }

    @Override // l.InterfaceC0321
    /* JADX INFO: renamed from: ۤ */
    public final int mo2015() {
        return this.f32170;
    }
}
