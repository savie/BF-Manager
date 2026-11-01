package l;

/* JADX INFO: renamed from: l.᩷۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47V7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20899 extends AbstractC11541 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f67908;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f67909;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f67910;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f67911;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f67912;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f67913;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f67914;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f67915;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f67916;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC22747 f67917;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f67918;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC13658 f67919;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f67920;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7307 f67921;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14904 f67922;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f67923;

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ */
    public final void mo3494(C3073 c3073, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C5813 {
        this.f67915 = bArr;
        this.f67923 = bArr2;
        this.f67909 = bArr3;
        this.f67908 = bArr4;
        try {
            InterfaceC21335 interfaceC21335 = (InterfaceC21335) Class.forName(c3073.m9231(this.f67916)).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
            this.f38781 = interfaceC21335;
            interfaceC21335.init();
            C14904 c14904 = new C14904();
            this.f67922 = c14904;
            C7307 c7307 = new C7307(c14904);
            this.f67921 = c7307;
            c7307.m19501();
            this.f67922.m35631(this.f67910 + 5 + this.f67918);
            this.f67922.m35630((byte) 30);
            try {
                InterfaceC13658 interfaceC13658 = (InterfaceC13658) Class.forName(c3073.m9231(this.f67913)).asSubclass(InterfaceC13658.class).getDeclaredConstructor(null).newInstance(null);
                this.f67919 = interfaceC13658;
                interfaceC13658.init();
                InterfaceC22747 interfaceC22747 = (InterfaceC22747) Class.forName(c3073.m9231("ecdh-sha2-nistp")).asSubclass(InterfaceC22747.class).getDeclaredConstructor(null).newInstance(null);
                this.f67917 = interfaceC22747;
                interfaceC22747.mo27932(this.f67911);
                byte[] publicKey = this.f67919.getPublicKey();
                byte[] q = this.f67917.getQ();
                int i = this.f67910;
                byte[] bArr5 = new byte[this.f67918 + i];
                this.f67914 = bArr5;
                System.arraycopy(publicKey, 0, bArr5, 0, i);
                System.arraycopy(q, 0, this.f67914, this.f67910, this.f67918);
                this.f67922.m35627(this.f67914);
                if (bArr == null) {
                    return;
                }
                c3073.m9249(this.f67921);
                c3073.f11634.m1333().getClass();
                this.f67920 = 31;
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
        if (this.f67920 == 31) {
            c14904.m35638();
            c14904.m35629();
            if (c14904.m35629() != 31) {
                this.f38778.f11634.m1333().getClass();
                return false;
            }
            this.f38779 = c14904.m35628();
            byte[] bArrM35628 = c14904.m35628();
            int length = bArrM35628.length;
            int i = this.f67912;
            int i2 = this.f67918;
            if (length == i + i2) {
                byte[] bArr = new byte[i];
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrM35628, 0, bArr, 0, i);
                System.arraycopy(bArrM35628, this.f67912, bArr2, 0, this.f67918);
                byte[][] bArrM32086 = C12952.m32086(bArr2);
                if (this.f67917.mo27934(bArrM32086[0], bArrM32086[1])) {
                    byte[] bArrMo17491 = null;
                    try {
                        bArrMo17491 = this.f67919.mo17491(bArr);
                        this.f38781.mo3065(bArrMo17491.length, bArrMo17491);
                        C8491.m22182(bArrMo17491);
                        try {
                            bArrMo17491 = this.f67917.mo27933(bArrM32086[0], bArrM32086[1]);
                            this.f38781.mo3065(bArrMo17491.length, bArrMo17491);
                            C8491.m22182(bArrMo17491);
                            this.f38780 = AbstractC11541.m28717(this.f38781.mo3066(), true);
                            byte[] bArrM35629 = c14904.m35628();
                            byte[] bArrM28717 = AbstractC11541.m28717(this.f67923, false);
                            this.f38781.mo3065(bArrM28717.length, bArrM28717);
                            byte[] bArrM28718 = AbstractC11541.m28717(this.f67915, false);
                            this.f38781.mo3065(bArrM28718.length, bArrM28718);
                            byte[] bArrM28719 = AbstractC11541.m28717(this.f67908, false);
                            this.f38781.mo3065(bArrM28719.length, bArrM28719);
                            byte[] bArrM287110 = AbstractC11541.m28717(this.f67909, false);
                            this.f38781.mo3065(bArrM287110.length, bArrM287110);
                            byte[] bArrM287111 = AbstractC11541.m28717(this.f38779, false);
                            this.f38781.mo3065(bArrM287111.length, bArrM287111);
                            byte[] bArrM287112 = AbstractC11541.m28717(this.f67914, false);
                            this.f38781.mo3065(bArrM287112.length, bArrM287112);
                            byte[] bArrM287113 = AbstractC11541.m28717(bArrM35628, false);
                            this.f38781.mo3065(bArrM287113.length, bArrM287113);
                            InterfaceC21335 interfaceC21335 = this.f38781;
                            byte[] bArr3 = this.f38780;
                            interfaceC21335.mo3065(bArr3.length, bArr3);
                            this.f38777 = this.f38781.mo3066();
                            byte[] bArr4 = this.f38779;
                            int i3 = ((bArr4[0] << 24) & (-16777216)) | ((bArr4[1] << 16) & 16711680) | ((bArr4[2] << 8) & 65280) | (bArr4[3] & 255);
                            boolean zM28719 = m28719(C8491.m22168(4, i3, bArr4), this.f38779, bArrM35629, i3 + 4);
                            this.f67920 = 0;
                            return zM28719;
                        } catch (Throwable th) {
                            C8491.m22182(bArrMo17491);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        C8491.m22182(bArrMo17491);
                        throw th2;
                    }
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۨ */
    public final int mo3496() {
        return this.f67920;
    }
}
