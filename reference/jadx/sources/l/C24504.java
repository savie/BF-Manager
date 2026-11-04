package l;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩺ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 95DK */
/* JADX INFO: loaded from: classes.dex */
public final class C24504 extends AbstractC14806 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f79486;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f79487;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f79488;

    public C24504(AbstractC22044 abstractC22044) {
        this.f79488 = abstractC22044;
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܶ */
    public final String mo11753() {
        return this.f79488.m49874();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۚ */
    public final byte[] mo11752() throws IOException {
        if (this.f79486 == null) {
            m54767();
        }
        return this.f79486;
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo11751() throws IOException {
        if (this.f79487 == null) {
            m54767();
        }
        return this.f79487;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m54767() throws IOException {
        CRC32 crc32 = new CRC32();
        AbstractC22044 abstractC22044 = this.f79488;
        DataInputStream dataInputStream = new DataInputStream(abstractC22044.mo4290());
        try {
            if (dataInputStream.readInt() != -1395514453) {
                throw new IOException("Bad file: " + abstractC22044.getName());
            }
            byte[] bArr = new byte[dataInputStream.readInt()];
            this.f79486 = bArr;
            dataInputStream.readFully(bArr);
            crc32.update(this.f79486);
            byte[] bArr2 = new byte[dataInputStream.readInt()];
            this.f79487 = bArr2;
            dataInputStream.readFully(bArr2);
            crc32.update(this.f79487);
            if (crc32.getValue() != dataInputStream.readLong()) {
                throw new IOException("Bad file: " + abstractC22044.getName());
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
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩵ */
    public final void mo18535() {
        this.f79486 = null;
        this.f79487 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m54766(AbstractC22044 abstractC22044, String str, byte[] bArr, byte[] bArr2) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        crc32.update(bArr2);
        if (!abstractC22044.mo2934()) {
            abstractC22044.m49853();
        }
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(str + ".key");
        int i = 1;
        while (abstractC22044M49876.mo2934()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            i++;
            sb.append(i);
            sb.append(").key");
            abstractC22044M49876 = abstractC22044.m49876(sb.toString());
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(abstractC22044M49876.mo4289(false));
            try {
                dataOutputStream2.writeInt(-1395514453);
                dataOutputStream2.writeInt(bArr.length);
                dataOutputStream2.write(bArr);
                dataOutputStream2.writeInt(bArr2.length);
                dataOutputStream2.write(bArr2);
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

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܽ */
    public final String mo18533() {
        return this.f79488.getName();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۧ */
    public final String mo18531() {
        return this.f79488.getName();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܳ */
    public final String mo18532() {
        return this.f79488.m49874();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۙ */
    public final String mo18529(String str) {
        String strConcat = str.concat(".key");
        AbstractC22044 abstractC22044 = this.f79488;
        return C14584.m35188(abstractC22044, abstractC22044.m49868(strConcat));
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18536() {
        this.f79488.mo4287();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩴ */
    public final String mo18534() {
        return this.f79488.getName();
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ᩸ */
    public final byte[] mo18537() throws IOException {
        m54767();
        mo18535();
        return this.f79488.m49865();
    }
}
