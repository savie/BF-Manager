package l;

/* JADX INFO: renamed from: l.ۜۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7Y0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6518 extends AbstractC11541 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f21952;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f21953;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f21954;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f21955;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f21956;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7307 f21957;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f21958;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f21959;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC19780 f21960;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f21961;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC13658 f21962;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f21963;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21964;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f21965;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14904 f21966;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f21967;

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ */
    public final void mo3494(C3073 c3073, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C5813 {
        this.f21959 = bArr;
        this.f21967 = bArr2;
        this.f21952 = bArr3;
        this.f21958 = bArr4;
        try {
            InterfaceC21335 interfaceC21335 = (InterfaceC21335) Class.forName(c3073.m9231(this.f21954)).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
            this.f38781 = interfaceC21335;
            interfaceC21335.init();
            C14904 c14904 = new C14904();
            this.f21966 = c14904;
            C7307 c7307 = new C7307(c14904);
            this.f21957 = c7307;
            c7307.m19501();
            this.f21966.m35631(this.f21956 + 5 + this.f21964);
            this.f21966.m35630((byte) 30);
            try {
                InterfaceC13658 interfaceC13658 = (InterfaceC13658) Class.forName(c3073.m9231(this.f21963)).asSubclass(InterfaceC13658.class).getDeclaredConstructor(null).newInstance(null);
                this.f21962 = interfaceC13658;
                interfaceC13658.init();
                InterfaceC19780 interfaceC19780 = (InterfaceC19780) Class.forName(c3073.m9231("xdh")).asSubclass(InterfaceC19780.class).getDeclaredConstructor(null).newInstance(null);
                this.f21960 = interfaceC19780;
                interfaceC19780.mo44996(this.f21964, this.f21961);
                byte[] publicKey = this.f21962.getPublicKey();
                byte[] q = this.f21960.getQ();
                int i = this.f21956;
                byte[] bArr5 = new byte[this.f21964 + i];
                this.f21953 = bArr5;
                System.arraycopy(publicKey, 0, bArr5, 0, i);
                System.arraycopy(q, 0, this.f21953, this.f21956, this.f21964);
                this.f21966.m35627(this.f21953);
                if (bArr == null) {
                    return;
                }
                c3073.m9249(this.f21957);
                c3073.f11634.m1333().getClass();
                this.f21965 = 31;
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
        if (this.f21965 == 31) {
            c14904.m35638();
            c14904.m35629();
            if (c14904.m35629() != 31) {
                this.f38778.f11634.m1333().getClass();
                return false;
            }
            this.f38779 = c14904.m35628();
            byte[] bArrM35628 = c14904.m35628();
            int length = bArrM35628.length;
            int i = this.f21955;
            int i2 = this.f21964;
            if (length == i + i2) {
                byte[] bArr = new byte[i];
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrM35628, 0, bArr, 0, i);
                System.arraycopy(bArrM35628, this.f21955, bArr2, 0, this.f21964);
                if (this.f21960.mo44998(bArr2)) {
                    byte[] bArrMo17491 = null;
                    try {
                        bArrMo17491 = this.f21962.mo17491(bArr);
                        this.f38781.mo3065(bArrMo17491.length, bArrMo17491);
                        C8491.m22182(bArrMo17491);
                        try {
                            bArrMo17491 = this.f21960.mo44997(bArr2);
                            this.f38781.mo3065(bArrMo17491.length, bArrMo17491);
                            C8491.m22182(bArrMo17491);
                            this.f38780 = AbstractC11541.m28717(this.f38781.mo3066(), true);
                            byte[] bArrM35629 = c14904.m35628();
                            byte[] bArrM28717 = AbstractC11541.m28717(this.f21967, false);
                            this.f38781.mo3065(bArrM28717.length, bArrM28717);
                            byte[] bArrM28718 = AbstractC11541.m28717(this.f21959, false);
                            this.f38781.mo3065(bArrM28718.length, bArrM28718);
                            byte[] bArrM28719 = AbstractC11541.m28717(this.f21958, false);
                            this.f38781.mo3065(bArrM28719.length, bArrM28719);
                            byte[] bArrM287110 = AbstractC11541.m28717(this.f21952, false);
                            this.f38781.mo3065(bArrM287110.length, bArrM287110);
                            byte[] bArrM287111 = AbstractC11541.m28717(this.f38779, false);
                            this.f38781.mo3065(bArrM287111.length, bArrM287111);
                            byte[] bArrM287112 = AbstractC11541.m28717(this.f21953, false);
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
                            this.f21965 = 0;
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
        return this.f21965;
    }
}
