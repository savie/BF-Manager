package l;

/* JADX INFO: renamed from: l.۬ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7V1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12869 extends AbstractC11541 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f42804;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f42805;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f42806;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f42807;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C14904 f42808;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f42809;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7307 f42810;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC18076 f42811;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f42812;

    /* JADX INFO: renamed from: ۖ */
    public abstract byte[] mo6010();

    /* JADX INFO: renamed from: ۚ */
    public abstract byte[] mo6011();

    /* JADX INFO: renamed from: ᩹ */
    public abstract String mo2264();

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ */
    public final void mo3494(C3073 c3073, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C5813 {
        this.f42812 = bArr;
        this.f42805 = bArr2;
        this.f42804 = bArr3;
        this.f42807 = bArr4;
        try {
            InterfaceC21335 interfaceC21335 = (InterfaceC21335) Class.forName(c3073.m9231(mo2264())).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
            this.f38781 = interfaceC21335;
            interfaceC21335.init();
            C14904 c14904 = new C14904();
            this.f42808 = c14904;
            this.f42810 = new C7307(c14904);
            try {
                InterfaceC18076 interfaceC18076 = (InterfaceC18076) Class.forName(c3073.m9231("dh")).asSubclass(InterfaceC18076.class).getDeclaredConstructor(null).newInstance(null);
                this.f42811 = interfaceC18076;
                interfaceC18076.init();
                this.f42811.mo17132(mo6011());
                this.f42811.mo17130(mo6010());
                this.f42809 = this.f42811.mo17131();
                this.f42810.m19501();
                this.f42808.m35630((byte) 30);
                this.f42808.m35641(this.f42809);
                if (bArr == null) {
                    return;
                }
                c3073.m9249(this.f42810);
                c3073.f11634.m1333().getClass();
                this.f42806 = 31;
            } catch (Exception e) {
                throw new C5813(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C5813(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3495(C14904 c14904) throws C5813 {
        if (this.f42806 != 31) {
            return false;
        }
        c14904.m35638();
        c14904.m35629();
        if (c14904.m35629() != 31) {
            this.f38778.f11634.m1333().getClass();
            return false;
        }
        this.f38779 = c14904.m35628();
        byte[] bArrM35636 = c14904.m35636();
        byte[] bArrM35628 = c14904.m35628();
        this.f42811.mo17133(bArrM35636);
        this.f42811.getClass();
        this.f38780 = AbstractC11541.m28716(AbstractC11541.m28715(this.f42811.mo17134()), true);
        byte[] bArrM28717 = AbstractC11541.m28717(this.f42805, false);
        this.f38781.mo3065(bArrM28717.length, bArrM28717);
        byte[] bArrM28718 = AbstractC11541.m28717(this.f42812, false);
        this.f38781.mo3065(bArrM28718.length, bArrM28718);
        byte[] bArrM28719 = AbstractC11541.m28717(this.f42807, false);
        this.f38781.mo3065(bArrM28719.length, bArrM28719);
        byte[] bArrM287110 = AbstractC11541.m28717(this.f42804, false);
        this.f38781.mo3065(bArrM287110.length, bArrM287110);
        byte[] bArrM287111 = AbstractC11541.m28717(this.f38779, false);
        this.f38781.mo3065(bArrM287111.length, bArrM287111);
        byte[] bArrM28716 = AbstractC11541.m28716(this.f42809, false);
        this.f38781.mo3065(bArrM28716.length, bArrM28716);
        byte[] bArrM287112 = AbstractC11541.m28716(bArrM35636, false);
        this.f38781.mo3065(bArrM287112.length, bArrM287112);
        InterfaceC21335 interfaceC21335 = this.f38781;
        byte[] bArr = this.f38780;
        interfaceC21335.mo3065(bArr.length, bArr);
        this.f38777 = this.f38781.mo3066();
        byte[] bArr2 = this.f38779;
        int i = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        boolean zM28719 = m28719(C8491.m22168(4, i, bArr2), this.f38779, bArrM35628, i + 4);
        this.f42806 = 0;
        return zM28719;
    }

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۨ */
    public final int mo3496() {
        return this.f42806;
    }
}
