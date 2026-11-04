package l;

/* JADX INFO: renamed from: l.ۢ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T590 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9775 extends AbstractC24188 implements InterfaceC0321 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6288 f31512 = new C18726();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31513;

    public C9775(EnumC7779 enumC7779, int i) {
        super(enumC7779);
        this.f31513 = i;
    }

    public C9775(EnumC7779 enumC7779, byte[] bArr, int i) {
        super(enumC7779);
        this.f31513 = C12556.m31233(i + 2, bArr);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54138(this.f78334.f25844);
        c24166.m54138(0);
        c24166.m54134(this.f31513);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ */
    public final EnumC7801 mo2083() {
        return EnumC7801.Format30t;
    }

    @Override // l.InterfaceC0321
    /* JADX INFO: renamed from: ۤ */
    public final int mo2015() {
        return this.f31513;
    }
}
