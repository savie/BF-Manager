package l;

/* JADX INFO: renamed from: l.ۘۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7UY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3695 extends AbstractC11541 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f13483;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f13484;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7307 f13485;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f13486;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC19780 f13487;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f13488;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f13489;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f13490;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f13491;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f13492;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14904 f13493;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f13494;

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ */
    public final void mo3494(C3073 c3073, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C5813 {
        this.f13489 = bArr;
        this.f13494 = bArr2;
        this.f13483 = bArr3;
        this.f13488 = bArr4;
        try {
            InterfaceC21335 interfaceC21335 = (InterfaceC21335) Class.forName(c3073.m9231(this.f13492)).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
            this.f38781 = interfaceC21335;
            interfaceC21335.init();
            C14904 c14904 = new C14904();
            this.f13493 = c14904;
            C7307 c7307 = new C7307(c14904);
            this.f13485 = c7307;
            c7307.m19501();
            this.f13493.m35630((byte) 30);
            try {
                InterfaceC19780 interfaceC19780 = (InterfaceC19780) Class.forName(c3073.m9231("xdh")).asSubclass(InterfaceC19780.class).getDeclaredConstructor(null).newInstance(null);
                this.f13487 = interfaceC19780;
                interfaceC19780.mo44996(this.f13491, this.f13490);
                byte[] q = this.f13487.getQ();
                this.f13484 = q;
                this.f13493.m35627(q);
                if (bArr == null) {
                    return;
                }
                c3073.m9249(this.f13485);
                c3073.f11634.m1333().getClass();
                this.f13486 = 31;
            } catch (Exception | LinkageError e) {
                throw new C5813(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C5813(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3495(C14904 c14904) throws C5813 {
        if (this.f13486 == 31) {
            c14904.m35638();
            c14904.m35629();
            if (c14904.m35629() != 31) {
                this.f38778.f11634.m1333().getClass();
                return false;
            }
            this.f38779 = c14904.m35628();
            byte[] bArrM35628 = c14904.m35628();
            if (this.f13487.mo44998(bArrM35628)) {
                this.f38780 = AbstractC11541.m28716(AbstractC11541.m28715(this.f13487.mo44997(bArrM35628)), true);
                byte[] bArrM35629 = c14904.m35628();
                byte[] bArrM28717 = AbstractC11541.m28717(this.f13494, false);
                this.f38781.mo3065(bArrM28717.length, bArrM28717);
                byte[] bArrM28718 = AbstractC11541.m28717(this.f13489, false);
                this.f38781.mo3065(bArrM28718.length, bArrM28718);
                byte[] bArrM28719 = AbstractC11541.m28717(this.f13488, false);
                this.f38781.mo3065(bArrM28719.length, bArrM28719);
                byte[] bArrM287110 = AbstractC11541.m28717(this.f13483, false);
                this.f38781.mo3065(bArrM287110.length, bArrM287110);
                byte[] bArrM287111 = AbstractC11541.m28717(this.f38779, false);
                this.f38781.mo3065(bArrM287111.length, bArrM287111);
                byte[] bArrM287112 = AbstractC11541.m28717(this.f13484, false);
                this.f38781.mo3065(bArrM287112.length, bArrM287112);
                byte[] bArrM287113 = AbstractC11541.m28717(bArrM35628, false);
                this.f38781.mo3065(bArrM287113.length, bArrM287113);
                InterfaceC21335 interfaceC21335 = this.f38781;
                byte[] bArr = this.f38780;
                interfaceC21335.mo3065(bArr.length, bArr);
                this.f38777 = this.f38781.mo3066();
                byte[] bArr2 = this.f38779;
                int i = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
                boolean zM28719 = m28719(C8491.m22168(4, i, bArr2), this.f38779, bArrM35629, i + 4);
                this.f13486 = 0;
                return zM28719;
            }
        }
        return false;
    }

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۨ */
    public final int mo3496() {
        return this.f13486;
    }
}
