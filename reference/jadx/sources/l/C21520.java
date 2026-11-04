package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩶ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H1VX */
/* JADX INFO: loaded from: classes.dex */
public final class C21520 extends AbstractC14806 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f68760;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f68761;

    public C21520(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) {
        this.f68761 = abstractC22044;
        this.f68760 = abstractC22045;
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܶ */
    public final String mo11753() {
        return this.f68760.m49874();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۚ */
    public final byte[] mo11752() {
        return this.f68761.m49865();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo11751() {
        return this.f68760.m49865();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܽ */
    public final String mo18533() {
        return this.f68760.getName() + "\n" + this.f68761.getName();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۧ */
    public final String mo18531() {
        return this.f68760.getName();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܳ */
    public final String mo18532() {
        return this.f68760.m49874();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۙ */
    public final String mo18529(String str) {
        String strConcat = str.concat(".pk8");
        AbstractC22044 abstractC22044 = this.f68760;
        AbstractC22044 abstractC22044M49868 = abstractC22044.m49868(strConcat);
        String strConcat2 = str.concat(".x509.pem");
        AbstractC22044 abstractC22045 = this.f68761;
        AbstractC22044 abstractC22044M49869 = abstractC22045.m49868(strConcat2);
        String strM35188 = C14584.m35188(abstractC22044, abstractC22044M49868);
        if (strM35188 != null) {
            return strM35188;
        }
        String strM35189 = C14584.m35188(abstractC22045, abstractC22044M49869);
        if (strM35189 == null) {
            return null;
        }
        C14584.m35188(abstractC22044M49868, abstractC22044);
        return strM35189;
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18536() {
        this.f68760.mo4287();
        this.f68761.mo4287();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩴ */
    public final String mo18534() {
        return this.f68760.m49874() + ".key";
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩸ */
    public final byte[] mo18537() throws IOException, CertificateEncodingException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] encoded = m35652().getEncoded();
        byte[] encoded2 = m35653().getEncoded();
        CRC32 crc32 = new CRC32();
        crc32.update(encoded);
        crc32.update(encoded2);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(-1395514453);
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
            dataOutputStream.writeInt(encoded2.length);
            dataOutputStream.write(encoded2);
            dataOutputStream.writeLong(crc32.getValue());
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
