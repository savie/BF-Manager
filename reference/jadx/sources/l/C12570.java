package l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.۫ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9VM */
/* JADX INFO: loaded from: classes4.dex */
public final class C12570 extends AbstractC11264 implements InterfaceC7030 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f42034;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public String f42035;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public boolean f42036;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f42037;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        return 0;
    }

    public C12570(InterfaceC10601 interfaceC10601, AbstractC14792 abstractC14792) {
        super(interfaceC10601, abstractC14792);
        this.f42037 = "";
    }

    @Override // l.InterfaceC7030
    /* JADX INFO: renamed from: ᩺ */
    public final String mo5638() {
        return this.f42035;
    }

    @Override // l.InterfaceC7030
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo5637() {
        return this.f42036;
    }

    @Override // l.InterfaceC7030
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5636() {
        return m35434() != 65535;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        byte b = bArr[i];
        this.f42034 = (b & 1) == 1;
        this.f42036 = (b & 2) == 2;
        return 2;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComTreeConnectAndXResponse[");
        sb.append(super.toString());
        sb.append(",supportSearchBits=");
        sb.append(this.f42034);
        sb.append(",shareIsInDfs=");
        sb.append(this.f42036);
        sb.append(",service=");
        sb.append(this.f42035);
        sb.append(",nativeFileSystem=");
        return new String(C22697.m50267(sb, this.f42037, "]"));
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        int i2 = 0;
        while (bArr[i + i2] != 0) {
            int i3 = i2 + 1;
            if (i2 > 32) {
                throw new C17655("zero termination not found: " + this);
            }
            i2 = i3;
        }
        try {
            this.f42035 = new String(bArr, i, i2, "ASCII");
            return ((i2 + 1) + i) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }
}
