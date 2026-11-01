package l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.֡ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5CA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0197 extends AbstractC17131 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f1327;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f1328;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f1329;

    public C0197(AbstractC20745 abstractC20745) {
        this.f1327 = abstractC20745;
        this.f54636 = (String) AbstractC17131.f54635.get(mo1456());
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo1456() {
        return this.f1327.m46718() + '*';
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo1457() {
        if (this.f54636 == null) {
            return true;
        }
        try {
            mo1451();
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1451() throws Exception {
        AbstractC20745 abstractC20745 = this.f1327;
        CRC32 crc32 = new CRC32();
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC20745.mo33970());
            try {
                if (dataInputStream.readInt() != -1395514454) {
                    throw new C4987("Bad file: " + abstractC20745.getName());
                }
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                byte[] bArrM1446 = m1446(this.f54636, bArr);
                this.f1329 = bArrM1446;
                crc32.update(bArrM1446);
                byte[] bArr2 = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr2);
                byte[] bArrM1447 = m1446(this.f54636, bArr2);
                this.f1328 = bArrM1447;
                crc32.update(bArrM1447);
                if (crc32.getValue() != dataInputStream.readLong()) {
                    throw new C4987("Bad file: " + abstractC20745.getName());
                }
                dataInputStream.close();
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.f54636 = null;
            AbstractC17131.f54635.remove(mo1456());
            throw e;
        }
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void mo1458() {
        this.f1329 = null;
        this.f1328 = null;
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] mo1454() {
        return this.f1329;
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] mo1449() {
        return this.f1328;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m1445(AbstractC20745 abstractC20745, String str, byte[] bArr, byte[] bArr2, String str2) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        crc32.update(bArr2);
        byte[] bArrM1447 = m1447(str2, bArr);
        byte[] bArrM1448 = m1447(str2, bArr2);
        if (!abstractC20745.mo33975()) {
            abstractC20745.m46739();
        }
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(str + ".aes");
        int i = 1;
        while (abstractC20745M46690.mo33975()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            i++;
            sb.append(i);
            sb.append(").aes");
            abstractC20745M46690 = abstractC20745.m46690(sb.toString());
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(abstractC20745M46690.mo33976(false));
            try {
                dataOutputStream2.writeInt(-1395514454);
                dataOutputStream2.writeInt(bArrM1447.length);
                dataOutputStream2.write(bArrM1447);
                dataOutputStream2.writeInt(bArrM1448.length);
                dataOutputStream2.write(bArrM1448);
                dataOutputStream2.writeLong(crc32.getValue());
                C19431.m44468(dataOutputStream2);
                return abstractC20745M46690;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C19431.m44468(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m1446(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C22982 c22982 = new C22982();
        c22982.m50841(str.getBytes());
        byte[] bArrM50838 = c22982.m50838();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM50838, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c22982.m50837(bArrM50838, 0, 16);
        cipher.init(2, secretKeySpec, new IvParameterSpec(c22982.m50838()));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m1447(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C22982 c22982 = new C22982();
        c22982.m50841(str.getBytes());
        byte[] bArrM50838 = c22982.m50838();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM50838, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c22982.m50837(bArrM50838, 0, 16);
        cipher.init(1, secretKeySpec, new IvParameterSpec(c22982.m50838()));
        return cipher.doFinal(bArr);
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo1459() {
        return this.f1327.getName();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String mo1453() {
        return this.f1327.getName();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo1460() {
        return this.f1327.m46718();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo1450(String str) {
        String strConcat = str.concat(".aes");
        AbstractC20745 abstractC20745 = this.f1327;
        return C5553.m15308(abstractC20745, abstractC20745.m46706(strConcat));
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo1455() {
        this.f1327.mo24644();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m1444(AbstractC17131 abstractC17131) {
        if (abstractC17131 instanceof C0197) {
            return ((C0197) abstractC17131).f1327;
        }
        throw new AssertionError();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String mo1452() {
        return this.f1327.getName();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] mo1448() throws IOException {
        AbstractC20745 abstractC20745 = this.f1327;
        byte[] bArrM46727 = abstractC20745.m46727();
        if (new DataInputStream(new ByteArrayInputStream(bArrM46727)).readInt() == -1395514454) {
            return bArrM46727;
        }
        throw new IOException("Bad file: " + abstractC20745.getName());
    }
}
