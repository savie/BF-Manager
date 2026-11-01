package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5110 extends AbstractC13578 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final OutputStream f17803;

    public C5110(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f17803 = outputStream;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo14249(int i, int i2) {
        mo14248((i << 3) | i2);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14252(int i, int i2) throws IOException {
        m14230(20);
        m33188(i, 0);
        if (i2 >= 0) {
            m33185(i2);
        } else {
            m33186(i2);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo14231(int i, int i2) throws IOException {
        m14230(20);
        m33188(i, 0);
        m33185(i2);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14234(int i, int i2) throws IOException {
        m14230(14);
        m33188(i, 5);
        m33187(i2);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14253(int i, long j) throws IOException {
        m14230(20);
        m33188(i, 0);
        m33186(j);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14236(int i, long j) throws IOException {
        m14230(18);
        m33188(i, 1);
        m33184(j);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14240(int i, boolean z) throws IOException {
        m14230(11);
        m33188(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f44771;
        this.f44771 = i2 + 1;
        this.f44772[i2] = b;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14237(int i, String str) throws IOException {
        mo14249(i, 2);
        mo14243(str);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14239(int i, AbstractC23725 abstractC23725) {
        mo14249(i, 2);
        mo14245(abstractC23725);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14245(AbstractC23725 abstractC23725) {
        mo14248(abstractC23725.size());
        abstractC23725.mo16490(this);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14241(int i, byte[] bArr) throws IOException {
        mo14248(i);
        m14246(bArr, 0, i);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14254(int i, InterfaceC23206 interfaceC23206) {
        mo14249(i, 2);
        mo14244(interfaceC23206);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14238(int i, InterfaceC23206 interfaceC23206, InterfaceC6667 interfaceC6667) {
        mo14249(i, 2);
        mo14248(((AbstractC18079) interfaceC23206).getSerializedSize(interfaceC6667));
        interfaceC6667.mo18057((Object) interfaceC23206, (InterfaceC12976) this.f71448);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo14250(int i, InterfaceC23206 interfaceC23206) throws IOException {
        mo14249(1, 3);
        mo14231(2, i);
        mo14254(3, interfaceC23206);
        mo14249(1, 4);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14255(int i, AbstractC23725 abstractC23725) throws IOException {
        mo14249(1, 3);
        mo14231(2, i);
        mo14239(3, abstractC23725);
        mo14249(1, 4);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14244(InterfaceC23206 interfaceC23206) {
        mo14248(interfaceC23206.getSerializedSize());
        interfaceC23206.writeTo(this);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14232(byte b) throws IOException {
        if (this.f44771 == this.f44773) {
            m14229();
        }
        int i = this.f44771;
        this.f44771 = i + 1;
        this.f44772[i] = b;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14251(int i) throws IOException {
        if (i >= 0) {
            mo14248(i);
        } else {
            mo14256(i);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo14248(int i) {
        m14230(5);
        m33185(i);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14233(int i) throws IOException {
        m14230(4);
        m33187(i);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14256(long j) throws IOException {
        m14230(10);
        m33186(j);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14242(long j) throws IOException {
        m14230(8);
        m33184(j);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14243(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM48959 = AbstractC22044.m48959(length);
            int i = iM48959 + length;
            int i2 = this.f44773;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM16289 = C6003.m16289(0, length, str, bArr);
                mo14248(iM16289);
                m14246(bArr, 0, iM16289);
                return;
            }
            if (i > i2 - this.f44771) {
                m14229();
            }
            int iM489510 = AbstractC22044.m48959(str.length());
            int i3 = this.f44771;
            byte[] bArr2 = this.f44772;
            try {
                if (iM489510 == iM48959) {
                    int i4 = i3 + iM489510;
                    this.f44771 = i4;
                    int iM162810 = C6003.m16289(i4, i2 - i4, str, bArr2);
                    this.f44771 = i3;
                    m33185((iM162810 - i3) - iM489510);
                    this.f44771 = iM162810;
                } else {
                    int iM16291 = C6003.m16291(str);
                    m33185(iM16291);
                    this.f44771 = C6003.m16289(this.f44771, iM16291, str, bArr2);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C2287(e);
            } catch (C12354 e2) {
                this.f44771 = i3;
                throw e2;
            }
        } catch (C12354 e3) {
            m48976(str, e3);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14247() {
        if (this.f44771 > 0) {
            m14229();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14246(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f44771;
        int i4 = this.f44773;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f44772;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f44771 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f44771 = i4;
        m14229();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f44771 = i7;
        } else {
            this.f17803.write(bArr, i6, i7);
        }
    }

    @Override // l.AbstractC10319
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14235(int i, int i2, byte[] bArr) throws IOException {
        m14246(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m14230(int i) throws IOException {
        if (this.f44773 - this.f44771 < i) {
            m14229();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m14229() throws IOException {
        this.f17803.write(this.f44772, 0, this.f44771);
        this.f44771 = 0;
    }
}
