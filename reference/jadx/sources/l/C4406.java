package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4406 extends AbstractC12609 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final OutputStream f15832;

    public C4406(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f15832 = outputStream;
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo14019(int i, int i2) {
        mo14018((i << 3) | i2);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14022(int i, int i2) throws IOException {
        m14000(20);
        m31323(i, 0);
        if (i2 >= 0) {
            m31321(i2);
        } else {
            m31324(i2);
        }
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo14027(int i, int i2) throws IOException {
        m14000(20);
        m31323(i, 0);
        m31321(i2);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14004(int i, int i2) throws IOException {
        m14000(14);
        m31323(i, 5);
        m31322(i2);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14023(int i, long j) throws IOException {
        m14000(20);
        m31323(i, 0);
        m31324(j);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14006(int i, long j) throws IOException {
        m14000(18);
        m31323(i, 1);
        m31325(j);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14010(int i, boolean z) throws IOException {
        m14000(11);
        m31323(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f40464;
        this.f40464 = i2 + 1;
        this.f40466[i2] = b;
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14007(int i, String str) throws IOException {
        mo14019(i, 2);
        mo14013(str);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14008(int i, AbstractC17084 abstractC17084) {
        mo14019(i, 2);
        mo14014(abstractC17084);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14014(AbstractC17084 abstractC17084) {
        mo14018(abstractC17084.size());
        abstractC17084.mo29724(this);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14011(int i, byte[] bArr) throws IOException {
        mo14018(i);
        m14016(bArr, 0, i);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14025(int i, InterfaceC18775 interfaceC18775) {
        mo14019(i, 2);
        mo14015(interfaceC18775);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14009(int i, InterfaceC18775 interfaceC18775, InterfaceC7762 interfaceC7762) {
        mo14019(i, 2);
        mo14018(((AbstractC9427) interfaceC18775).getSerializedSize(interfaceC7762));
        interfaceC7762.mo21143((Object) interfaceC18775, (InterfaceC18356) this.f48543);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo14020(int i, InterfaceC18775 interfaceC18775) throws IOException {
        mo14019(1, 3);
        mo14027(2, i);
        mo14025(3, interfaceC18775);
        mo14019(1, 4);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14024(int i, AbstractC17084 abstractC17084) throws IOException {
        mo14019(1, 3);
        mo14027(2, i);
        mo14008(3, abstractC17084);
        mo14019(1, 4);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14015(InterfaceC18775 interfaceC18775) {
        mo14018(interfaceC18775.getSerializedSize());
        interfaceC18775.writeTo(this);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14002(byte b) throws IOException {
        if (this.f40464 == this.f40465) {
            m14001();
        }
        int i = this.f40464;
        this.f40464 = i + 1;
        this.f40466[i] = b;
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14021(int i) throws IOException {
        if (i >= 0) {
            mo14018(i);
        } else {
            mo14026(i);
        }
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo14018(int i) {
        m14000(5);
        m31321(i);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14003(int i) throws IOException {
        m14000(4);
        m31322(i);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14026(long j) throws IOException {
        m14000(10);
        m31324(j);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14012(long j) throws IOException {
        m14000(8);
        m31325(j);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14013(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM35763 = AbstractC14846.m35763(length);
            int i = iM35763 + length;
            int i2 = this.f40465;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM29254 = C11643.m29254(0, length, str, bArr);
                mo14018(iM29254);
                m14016(bArr, 0, iM29254);
                return;
            }
            if (i > i2 - this.f40464) {
                m14001();
            }
            int iM35764 = AbstractC14846.m35763(str.length());
            int i3 = this.f40464;
            byte[] bArr2 = this.f40466;
            try {
                if (iM35764 == iM35763) {
                    int i4 = i3 + iM35764;
                    this.f40464 = i4;
                    int iM29255 = C11643.m29254(i4, i2 - i4, str, bArr2);
                    this.f40464 = i3;
                    m31321((iM29255 - i3) - iM35764);
                    this.f40464 = iM29255;
                } else {
                    int iM29256 = C11643.m29256(str);
                    m31321(iM29256);
                    this.f40464 = C11643.m29254(this.f40464, iM29256, str, bArr2);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C24544(e);
            } catch (C5678 e2) {
                this.f40464 = i3;
                throw e2;
            }
        } catch (C5678 e3) {
            m35776(str, e3);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m14017() {
        if (this.f40464 > 0) {
            m14001();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14016(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f40464;
        int i4 = this.f40465;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f40466;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f40464 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f40464 = i4;
        m14001();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f40464 = i7;
        } else {
            this.f15832.write(bArr, i6, i7);
        }
    }

    @Override // l.AbstractC5152
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14005(int i, int i2, byte[] bArr) throws IOException {
        m14016(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m14000(int i) throws IOException {
        if (this.f40465 - this.f40464 < i) {
            m14001();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m14001() throws IOException {
        this.f15832.write(this.f40466, 0, this.f40464);
        this.f40464 = 0;
    }
}
