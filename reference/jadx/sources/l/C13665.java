package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9UN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13665 extends AbstractC3971 implements InterfaceC2653 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean f43404;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public String[] f43405;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C13665(InterfaceC5878 interfaceC5878, boolean z) {
        super(interfaceC5878, (byte) 114);
        this.f43404 = z;
        C14826 c14826 = (C14826) interfaceC5878;
        m12772(c14826.m35721());
        if (c14826.m35720().m56408()) {
            this.f43405 = new String[]{"SMB 2.???", "SMB 2.002"};
        } else if (c14826.m35734().m56408()) {
            this.f43405 = new String[]{"NT LM 0.12", "SMB 2.???", "SMB 2.002"};
        } else {
            this.f43405 = new String[]{"NT LM 0.12"};
        }
    }

    @Override // l.InterfaceC2653
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo8797() {
        return this.f43404;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : this.f43405) {
            byteArrayOutputStream.write(2);
            try {
                byteArrayOutputStream.write(C23933.m53451(str));
                byteArrayOutputStream.write(0);
            } catch (IOException e) {
                throw new C3640(e);
            }
        }
        System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i, byteArrayOutputStream.size());
        return byteArrayOutputStream.size();
    }

    @Override // l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNegotiate[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        return new String(C12669.m31437(this.f13609, ",dialects=NT LM 0.12]", sb));
    }
}
