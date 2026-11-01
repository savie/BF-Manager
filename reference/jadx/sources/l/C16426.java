package l;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܽۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95DK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16426 extends AbstractC17131 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f52845;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f52846;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f52847;

    public C16426(AbstractC20745 abstractC20745) {
        this.f52845 = abstractC20745;
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩳ */
    public final String mo1456() {
        return this.f52845.m46718();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۬ */
    public final byte[] mo1454() throws IOException {
        if (this.f52847 == null) {
            m38680();
        }
        return this.f52847;
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۘ */
    public final byte[] mo1449() throws IOException {
        if (this.f52846 == null) {
            m38680();
        }
        return this.f52846;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m38680() throws IOException {
        CRC32 crc32 = new CRC32();
        AbstractC20745 abstractC20745 = this.f52845;
        DataInputStream dataInputStream = new DataInputStream(abstractC20745.mo33970());
        try {
            if (dataInputStream.readInt() != -1395514453) {
                throw new IOException("Bad file: " + abstractC20745.getName());
            }
            byte[] bArr = new byte[dataInputStream.readInt()];
            this.f52847 = bArr;
            dataInputStream.readFully(bArr);
            crc32.update(this.f52847);
            byte[] bArr2 = new byte[dataInputStream.readInt()];
            this.f52846 = bArr2;
            dataInputStream.readFully(bArr2);
            crc32.update(this.f52846);
            if (crc32.getValue() != dataInputStream.readLong()) {
                throw new IOException("Bad file: " + abstractC20745.getName());
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

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩵ */
    public final void mo1458() {
        this.f52847 = null;
        this.f52846 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m38679(AbstractC20745 abstractC20745, String str, byte[] bArr, byte[] bArr2) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        crc32.update(bArr2);
        if (!abstractC20745.mo33975()) {
            abstractC20745.m46739();
        }
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(str + ".key");
        int i = 1;
        while (abstractC20745M46690.mo33975()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            i++;
            sb.append(i);
            sb.append(").key");
            abstractC20745M46690 = abstractC20745.m46690(sb.toString());
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(abstractC20745M46690.mo33976(false));
            try {
                dataOutputStream2.writeInt(-1395514453);
                dataOutputStream2.writeInt(bArr.length);
                dataOutputStream2.write(bArr);
                dataOutputStream2.writeInt(bArr2.length);
                dataOutputStream2.write(bArr2);
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

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1459() {
        return this.f52845.getName();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۜ */
    public final String mo1453() {
        return this.f52845.getName();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1460() {
        return this.f52845.m46718();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۙ */
    public final String mo1450(String str) {
        String strConcat = str.concat(".key");
        AbstractC20745 abstractC20745 = this.f52845;
        return C5553.m15308(abstractC20745, abstractC20745.m46706(strConcat));
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ܰ */
    public final void mo1455() {
        this.f52845.mo24644();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۚ */
    public final String mo1452() {
        return this.f52845.getName();
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۖ */
    public final byte[] mo1448() throws IOException {
        m38680();
        mo1458();
        return this.f52845.m46727();
    }
}
