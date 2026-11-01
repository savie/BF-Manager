package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9UN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6925 extends AbstractC14792 implements InterfaceC13381 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final boolean f23294;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public String[] f23295;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C6925(InterfaceC10601 interfaceC10601, boolean z) {
        super(interfaceC10601, (byte) 114);
        this.f23294 = z;
        C9895 c9895 = (C9895) interfaceC10601;
        m35451(c9895.m25040());
        if (c9895.m25058().m38367()) {
            this.f23295 = new String[]{"SMB 2.???", "SMB 2.002"};
        } else if (c9895.m25076().m38367()) {
            this.f23295 = new String[]{"NT LM 0.12", "SMB 2.???", "SMB 2.002"};
        } else {
            this.f23295 = new String[]{"NT LM 0.12"};
        }
    }

    @Override // l.InterfaceC13381
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean mo18580() {
        return this.f23294;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : this.f23295) {
            byteArrayOutputStream.write(2);
            try {
                byteArrayOutputStream.write(C10933.m27417(str));
                byteArrayOutputStream.write(0);
            } catch (IOException e) {
                throw new C17655(e);
            }
        }
        System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i, byteArrayOutputStream.size());
        return byteArrayOutputStream.size();
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNegotiate[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        return new String(C12441.m30911(this.f48376, ",dialects=NT LM 0.12]", sb));
    }
}
