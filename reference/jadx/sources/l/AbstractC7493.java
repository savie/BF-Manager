package l;

/* JADX INFO: renamed from: l.۟۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77Y0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7493 extends AbstractC11541 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f24948;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f24949;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7307 f24950;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f24951;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f24952;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f24953;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC22747 f24954;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f24955;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f24956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14904 f24957;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f24958;

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ */
    public final void mo3494(C3073 c3073, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C5813 {
        this.f24953 = bArr;
        this.f24958 = bArr2;
        this.f24948 = bArr3;
        this.f24952 = bArr4;
        try {
            InterfaceC21335 interfaceC21335 = (InterfaceC21335) Class.forName(c3073.m9231(this.f24956)).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
            this.f38781 = interfaceC21335;
            interfaceC21335.init();
            C14904 c14904 = new C14904();
            this.f24957 = c14904;
            C7307 c7307 = new C7307(c14904);
            this.f24950 = c7307;
            c7307.m19501();
            this.f24957.m35630((byte) 30);
            try {
                InterfaceC22747 interfaceC22747 = (InterfaceC22747) Class.forName(c3073.m9231("ecdh-sha2-nistp")).asSubclass(InterfaceC22747.class).getDeclaredConstructor(null).newInstance(null);
                this.f24954 = interfaceC22747;
                interfaceC22747.mo27932(this.f24955);
                byte[] q = this.f24954.getQ();
                this.f24949 = q;
                this.f24957.m35627(q);
                if (bArr == null) {
                    return;
                }
                c3073.m9249(this.f24950);
                c3073.f11634.m1333().getClass();
                this.f24951 = 31;
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
        if (this.f24951 == 31) {
            c14904.m35638();
            c14904.m35629();
            if (c14904.m35629() != 31) {
                this.f38778.f11634.m1333().getClass();
                return false;
            }
            this.f38779 = c14904.m35628();
            byte[] bArrM35628 = c14904.m35628();
            byte[][] bArrM32086 = C12952.m32086(bArrM35628);
            if (this.f24954.mo27934(bArrM32086[0], bArrM32086[1])) {
                this.f38780 = AbstractC11541.m28716(AbstractC11541.m28715(this.f24954.mo27933(bArrM32086[0], bArrM32086[1])), true);
                byte[] bArrM35629 = c14904.m35628();
                byte[] bArrM28717 = AbstractC11541.m28717(this.f24958, false);
                this.f38781.mo3065(bArrM28717.length, bArrM28717);
                byte[] bArrM28718 = AbstractC11541.m28717(this.f24953, false);
                this.f38781.mo3065(bArrM28718.length, bArrM28718);
                byte[] bArrM28719 = AbstractC11541.m28717(this.f24952, false);
                this.f38781.mo3065(bArrM28719.length, bArrM28719);
                byte[] bArrM287110 = AbstractC11541.m28717(this.f24948, false);
                this.f38781.mo3065(bArrM287110.length, bArrM287110);
                byte[] bArrM287111 = AbstractC11541.m28717(this.f38779, false);
                this.f38781.mo3065(bArrM287111.length, bArrM287111);
                byte[] bArrM287112 = AbstractC11541.m28717(this.f24949, false);
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
                this.f24951 = 0;
                return zM28719;
            }
        }
        return false;
    }

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۨ */
    public final int mo3496() {
        return this.f24951;
    }
}
