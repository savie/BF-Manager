package l;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۨܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11799 implements InterfaceC2625 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3434 f39665;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f39667;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6859 f39668;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Cipher f39664 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SecretKeySpec f39666 = null;

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8100(long j) {
    }

    public C11799(File file) {
        this.f39665 = new C3434(file);
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8105() {
        return this.f39665.m10144();
    }

    @Override // l.InterfaceC2625
    public final void delete() {
        this.f39665.m10141();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[Catch: all -> 0x0095, IOException -> 0x0098, LOOP:0: B:28:0x0063->B:29:0x0065, LOOP_END, TryCatch #5 {IOException -> 0x0098, all -> 0x0095, blocks: (B:7:0x001f, B:12:0x0029, B:19:0x0037, B:20:0x0041, B:21:0x0048, B:25:0x0057, B:26:0x005c, B:27:0x005d, B:29:0x0065, B:30:0x007b), top: B:55:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8102(HashMap map, SparseArray sparseArray) throws Throwable {
        int i;
        int i2;
        int iM29479;
        int i3;
        C2023.m6510(!this.f39667);
        C3434 c3434 = this.f39665;
        if (c3434.m10144()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(c3434.m10143());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i4 = dataInputStream2.readInt();
                    if (i4 >= 0 && i4 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            Cipher cipher = this.f39664;
                            if (cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    SecretKeySpec secretKeySpec = this.f39666;
                                    String str = C17983.f57504;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    i = dataInputStream2.readInt();
                                    iM29479 = 0;
                                    for (i2 = 0; i2 < i; i2++) {
                                        C4742 c4742M29480 = m29480(i4, dataInputStream2);
                                        String str2 = c4742M29480.f16688;
                                        map.put(str2, c4742M29480);
                                        sparseArray.put(c4742M29480.f16689, str2);
                                        iM29479 += m29479(c4742M29480, i4);
                                    }
                                    i3 = dataInputStream2.readInt();
                                    if (dataInputStream2.read() == -1) {
                                    }
                                    if (i3 == iM29479) {
                                        C17983.m41837(dataInputStream2);
                                        return;
                                    }
                                } catch (InvalidAlgorithmParameterException e) {
                                    e = e;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e2) {
                                    e = e2;
                                    throw new IllegalStateException(e);
                                }
                            }
                        } else {
                            i = dataInputStream2.readInt();
                            iM29479 = 0;
                            while (i2 < i) {
                                C4742 c4742M29481 = m29480(i4, dataInputStream2);
                                String str3 = c4742M29481.f16688;
                                map.put(str3, c4742M29481);
                                sparseArray.put(c4742M29481.f16689, str3);
                                iM29479 += m29479(c4742M29481, i4);
                            }
                            i3 = dataInputStream2.readInt();
                            boolean z = dataInputStream2.read() == -1;
                            if (i3 == iM29479 && z) {
                                C17983.m41837(dataInputStream2);
                                return;
                            }
                        }
                    }
                    C17983.m41837(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C17983.m41837(dataInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C17983.m41837(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            map.clear();
            sparseArray.clear();
            c3434.m10141();
        }
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8101(HashMap map) throws Throwable {
        if (this.f39667) {
            mo8106(map);
        }
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8103(C4742 c4742) {
        this.f39667 = true;
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8104(C4742 c4742, boolean z) {
        this.f39667 = true;
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ܰ */
    public final void mo8106(HashMap map) throws Throwable {
        C3434 c3434 = this.f39665;
        DataOutputStream dataOutputStream = null;
        try {
            OutputStream outputStreamM10140 = c3434.m10140();
            C6859 c6859 = this.f39668;
            if (c6859 == null) {
                this.f39668 = new C6859(outputStreamM10140);
            } else {
                c6859.m18482(outputStreamM10140);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.f39668);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iM29479 = 0;
                for (C4742 c4742 : map.values()) {
                    dataOutputStream2.writeInt(c4742.f16689);
                    dataOutputStream2.writeUTF(c4742.f16688);
                    C5448.m15100(c4742.m13109(), dataOutputStream2);
                    iM29479 += m29479(c4742, 2);
                }
                dataOutputStream2.writeInt(iM29479);
                c3434.m10142(dataOutputStream2);
                String str = C17983.f57504;
                this.f39667 = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C17983.m41837(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m29479(C4742 c4742, int i) {
        int iHashCode = c4742.f16688.hashCode() + (c4742.f16689 * 31);
        if (i < 2) {
            long jM40151 = C17214.m40151(c4742.m13109());
            return (iHashCode * 31) + ((int) (jM40151 ^ (jM40151 >>> 32)));
        }
        return c4742.m13109().hashCode() + (iHashCode * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4742 m29480(int i, DataInputStream dataInputStream) throws IOException {
        C13210 c13210M15099;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            C1214 c1214 = new C1214();
            C1214.m4405(c1214, j);
            c13210M15099 = C13210.f43962.m32697(c1214);
        } else {
            c13210M15099 = C5448.m15099(dataInputStream);
        }
        return new C4742(i2, utf, c13210M15099);
    }
}
