package l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.ۗ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9VM */
/* JADX INFO: loaded from: classes3.dex */
public final class C3750 extends AbstractC6209 implements InterfaceC7128 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public String f12857;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f12858;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f12859;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12860;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        return 0;
    }

    public C3750(InterfaceC5878 interfaceC5878, AbstractC3971 abstractC3971) {
        super(interfaceC5878, abstractC3971);
        this.f12857 = "";
    }

    @Override // l.InterfaceC7128
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String mo12184() {
        return this.f12858;
    }

    @Override // l.InterfaceC7128
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo12183() {
        return this.f12860;
    }

    @Override // l.InterfaceC7128
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean mo12182() {
        return m12776() != 65535;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        byte b = bArr[i];
        this.f12859 = (b & 1) == 1;
        this.f12860 = (b & 2) == 2;
        return 2;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComTreeConnectAndXResponse[");
        sb.append(super.toString());
        sb.append(",supportSearchBits=");
        sb.append(this.f12859);
        sb.append(",shareIsInDfs=");
        sb.append(this.f12860);
        sb.append(",service=");
        sb.append(this.f12858);
        sb.append(",nativeFileSystem=");
        return new String(C8947.m23910(sb, this.f12857, "]"));
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        int i2 = 0;
        while (bArr[i + i2] != 0) {
            int i3 = i2 + 1;
            if (i2 > 32) {
                throw new C3640("zero termination not found: " + this);
            }
            i2 = i3;
        }
        try {
            this.f12858 = new String(bArr, i, i2, "ASCII");
            return ((i2 + 1) + i) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }
}
