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

/* JADX INFO: renamed from: l.ۛᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C5CA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6604 extends AbstractC14806 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f22091;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f22092;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f22093;

    public C6604(AbstractC22044 abstractC22044) {
        this.f22093 = abstractC22044;
        this.f48429 = (String) AbstractC14806.f48428.get(mo11753());
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܶ */
    public final String mo11753() {
        return this.f22093.m49874() + '*';
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo18538() {
        if (this.f48429 == null) {
            return true;
        }
        try {
            mo18530();
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18530() throws Exception {
        AbstractC22044 abstractC22044 = this.f22093;
        CRC32 crc32 = new CRC32();
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC22044.mo4290());
            try {
                if (dataInputStream.readInt() != -1395514454) {
                    throw new C4866("Bad file: " + abstractC22044.getName());
                }
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                byte[] bArrM18527 = m18527(this.f48429, bArr);
                this.f22091 = bArrM18527;
                crc32.update(bArrM18527);
                byte[] bArr2 = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr2);
                byte[] bArrM18528 = m18527(this.f48429, bArr2);
                this.f22092 = bArrM18528;
                crc32.update(bArrM18528);
                if (crc32.getValue() != dataInputStream.readLong()) {
                    throw new C4866("Bad file: " + abstractC22044.getName());
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
            this.f48429 = null;
            AbstractC14806.f48428.remove(mo11753());
            throw e;
        }
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void mo18535() {
        this.f22091 = null;
        this.f22092 = null;
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۚ */
    public final byte[] mo11752() {
        return this.f22091;
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo11751() {
        return this.f22092;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m18526(AbstractC22044 abstractC22044, String str, byte[] bArr, byte[] bArr2, String str2) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        crc32.update(bArr2);
        byte[] bArrM18528 = m18528(str2, bArr);
        byte[] bArrM18529 = m18528(str2, bArr2);
        if (!abstractC22044.mo2934()) {
            abstractC22044.m49853();
        }
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(str + ".aes");
        int i = 1;
        while (abstractC22044M49876.mo2934()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            i++;
            sb.append(i);
            sb.append(").aes");
            abstractC22044M49876 = abstractC22044.m49876(sb.toString());
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(abstractC22044M49876.mo4289(false));
            try {
                dataOutputStream2.writeInt(-1395514454);
                dataOutputStream2.writeInt(bArrM18528.length);
                dataOutputStream2.write(bArrM18528);
                dataOutputStream2.writeInt(bArrM18529.length);
                dataOutputStream2.write(bArrM18529);
                dataOutputStream2.writeLong(crc32.getValue());
                C20244.m46520(dataOutputStream2);
                return abstractC22044M49876;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C20244.m46520(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m18527(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C3170 c3170 = new C3170();
        c3170.m10363(str.getBytes());
        byte[] bArrM10360 = c3170.m10360();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM10360, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c3170.m10359(bArrM10360, 0, 16);
        cipher.init(2, secretKeySpec, new IvParameterSpec(c3170.m10360()));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m18528(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C3170 c3170 = new C3170();
        c3170.m10363(str.getBytes());
        byte[] bArrM10360 = c3170.m10360();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM10360, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c3170.m10359(bArrM10360, 0, 16);
        cipher.init(1, secretKeySpec, new IvParameterSpec(c3170.m10360()));
        return cipher.doFinal(bArr);
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo18533() {
        return this.f22093.getName();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo18531() {
        return this.f22093.getName();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo18532() {
        return this.f22093.m49874();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo18529(String str) {
        String strConcat = str.concat(".aes");
        AbstractC22044 abstractC22044 = this.f22093;
        return C14584.m35188(abstractC22044, abstractC22044.m49868(strConcat));
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo18536() {
        this.f22093.mo4287();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m18525(AbstractC14806 abstractC14806) {
        if (abstractC14806 instanceof C6604) {
            return ((C6604) abstractC14806).f22093;
        }
        throw new AssertionError();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String mo18534() {
        return this.f22093.getName();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] mo18537() throws IOException {
        AbstractC22044 abstractC22044 = this.f22093;
        byte[] bArrM49865 = abstractC22044.m49865();
        if (new DataInputStream(new ByteArrayInputStream(bArrM49865)).readInt() == -1395514454) {
            return bArrM49865;
        }
        throw new IOException("Bad file: " + abstractC22044.getName());
    }
}
