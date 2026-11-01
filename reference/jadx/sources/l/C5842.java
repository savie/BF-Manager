package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۛۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5842 extends AbstractC17131 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f19810;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f19811;

    public C5842(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) {
        this.f19810 = abstractC20745;
        this.f19811 = abstractC20746;
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩳ */
    public final String mo1456() {
        return this.f19811.m46718();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۬ */
    public final byte[] mo1454() {
        return this.f19810.m46727();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۘ */
    public final byte[] mo1449() {
        return this.f19811.m46727();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1459() {
        return this.f19811.getName() + "\n" + this.f19810.getName();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۜ */
    public final String mo1453() {
        return this.f19811.getName();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1460() {
        return this.f19811.m46718();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۙ */
    public final String mo1450(String str) {
        String strConcat = str.concat(".pk8");
        AbstractC20745 abstractC20745 = this.f19811;
        AbstractC20745 abstractC20745M46706 = abstractC20745.m46706(strConcat);
        String strConcat2 = str.concat(".x509.pem");
        AbstractC20745 abstractC20746 = this.f19810;
        AbstractC20745 abstractC20745M46707 = abstractC20746.m46706(strConcat2);
        String strM15308 = C5553.m15308(abstractC20745, abstractC20745M46706);
        if (strM15308 != null) {
            return strM15308;
        }
        String strM15309 = C5553.m15308(abstractC20746, abstractC20745M46707);
        if (strM15309 == null) {
            return null;
        }
        C5553.m15308(abstractC20745M46706, abstractC20745);
        return strM15309;
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ܰ */
    public final void mo1455() {
        this.f19811.mo24644();
        this.f19810.mo24644();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۚ */
    public final String mo1452() {
        return this.f19811.m46718() + ".key";
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۖ */
    public final byte[] mo1448() throws IOException, CertificateEncodingException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] encoded = m40009().getEncoded();
        byte[] encoded2 = m40013().getEncoded();
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
