package l;

/* JADX INFO: renamed from: l.ᩴۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9CQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18534 implements InterfaceC8618 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f59002 = new byte[64];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f59003 = new byte[64];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15007 f59004;

    public C18534(C15007 c15007) {
        this.f59004 = c15007;
    }

    @Override // l.InterfaceC8618
    public final void init(byte[] bArr) throws C7206 {
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            throw new C7206("Missing key data");
        }
        int iMin = Math.min(bArr.length, 64);
        int i = 0;
        while (true) {
            bArr2 = this.f59003;
            bArr3 = this.f59002;
            if (i >= iMin) {
                break;
            }
            bArr3[i] = (byte) (54 ^ bArr[i]);
            bArr2[i] = (byte) (92 ^ bArr[i]);
            i++;
        }
        while (iMin < 64) {
            bArr3[iMin] = 54;
            bArr2[iMin] = 92;
            iMin++;
        }
        m42933();
    }

    @Override // l.InterfaceC8618
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo3570() {
        C15007 c15007 = this.f59004;
        try {
            byte[] bArrM35986 = c15007.m35986();
            c15007.m35984(this.f59003);
            c15007.m35984(bArrM35986);
            return c15007.m35986();
        } finally {
            m42933();
        }
    }

    @Override // l.InterfaceC8618
    public final void update(byte[] bArr) {
        this.f59004.m35984(bArr);
    }

    @Override // l.InterfaceC8618
    public final void update(byte[] bArr, int i, int i2) {
        this.f59004.m35985(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42933() {
        C15007 c15007 = this.f59004;
        c15007.m35987();
        byte[] bArr = this.f59002;
        c15007.m35985(bArr, 0, bArr.length);
    }
}
