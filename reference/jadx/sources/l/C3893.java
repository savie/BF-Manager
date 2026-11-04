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

/* JADX INFO: renamed from: l.ۘۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3893 implements InterfaceC14333 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6612 f13263;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f13264;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9112 f13266;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Cipher f13267 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SecretKeySpec f13265 = null;

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12530(long j) {
    }

    public C3893(File file) {
        this.f13263 = new C6612(file);
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo12535() {
        return this.f13263.m18546();
    }

    @Override // l.InterfaceC14333
    public final void delete() {
        this.f13263.m18543();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[Catch: all -> 0x0095, IOException -> 0x0098, LOOP:0: B:28:0x0063->B:29:0x0065, LOOP_END, TryCatch #5 {IOException -> 0x0098, all -> 0x0095, blocks: (B:7:0x001f, B:12:0x0029, B:19:0x0037, B:20:0x0041, B:21:0x0048, B:25:0x0057, B:26:0x005c, B:27:0x005d, B:29:0x0065, B:30:0x007b), top: B:55:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12532(HashMap map, SparseArray sparseArray) throws Throwable {
        int i;
        int i2;
        int iM12528;
        int i3;
        C20782.m47568(!this.f13264);
        C6612 c6612 = this.f13263;
        if (c6612.m18546()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(c6612.m18545());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i4 = dataInputStream2.readInt();
                    if (i4 >= 0 && i4 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            Cipher cipher = this.f13267;
                            if (cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    SecretKeySpec secretKeySpec = this.f13265;
                                    String str = C7116.f23455;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    i = dataInputStream2.readInt();
                                    iM12528 = 0;
                                    for (i2 = 0; i2 < i; i2++) {
                                        C6131 c6131M12529 = m12529(i4, dataInputStream2);
                                        String str2 = c6131M12529.f20939;
                                        map.put(str2, c6131M12529);
                                        sparseArray.put(c6131M12529.f20941, str2);
                                        iM12528 += m12528(c6131M12529, i4);
                                    }
                                    i3 = dataInputStream2.readInt();
                                    if (dataInputStream2.read() == -1) {
                                    }
                                    if (i3 == iM12528) {
                                        C7116.m19484(dataInputStream2);
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
                            iM12528 = 0;
                            while (i2 < i) {
                                C6131 c6131M125210 = m12529(i4, dataInputStream2);
                                String str3 = c6131M125210.f20939;
                                map.put(str3, c6131M125210);
                                sparseArray.put(c6131M125210.f20941, str3);
                                iM12528 += m12528(c6131M125210, i4);
                            }
                            i3 = dataInputStream2.readInt();
                            boolean z = dataInputStream2.read() == -1;
                            if (i3 == iM12528 && z) {
                                C7116.m19484(dataInputStream2);
                                return;
                            }
                        }
                    }
                    C7116.m19484(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C7116.m19484(dataInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C7116.m19484(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            map.clear();
            sparseArray.clear();
            c6612.m18543();
        }
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12531(HashMap map) throws Throwable {
        if (this.f13264) {
            mo12536(map);
        }
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12533(C6131 c6131) {
        this.f13264 = true;
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12534(C6131 c6131, boolean z) {
        this.f13264 = true;
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo12536(HashMap map) throws Throwable {
        C6612 c6612 = this.f13263;
        DataOutputStream dataOutputStream = null;
        try {
            OutputStream outputStreamM18547 = c6612.m18547();
            C9112 c9112 = this.f13266;
            if (c9112 == null) {
                this.f13266 = new C9112(outputStreamM18547);
            } else {
                c9112.m24265(outputStreamM18547);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.f13266);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iM12528 = 0;
                for (C6131 c6131 : map.values()) {
                    dataOutputStream2.writeInt(c6131.f20941);
                    dataOutputStream2.writeUTF(c6131.f20939);
                    C21047.m48097(c6131.m17726(), dataOutputStream2);
                    iM12528 += m12528(c6131, 2);
                }
                dataOutputStream2.writeInt(iM12528);
                c6612.m18544(dataOutputStream2);
                String str = C7116.f23455;
                this.f13264 = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C7116.m19484(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12528(C6131 c6131, int i) {
        int iHashCode = c6131.f20939.hashCode() + (c6131.f20941 * 31);
        if (i < 2) {
            long jM42087 = C18063.m42087(c6131.m17726());
            return (iHashCode * 31) + ((int) (jM42087 ^ (jM42087 >>> 32)));
        }
        return c6131.m17726().hashCode() + (iHashCode * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6131 m12529(int i, DataInputStream dataInputStream) throws IOException {
        C18809 c18809M48096;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            C7622 c7622 = new C7622();
            C7622.m20818(c7622, j);
            c18809M48096 = C18809.f61123.m43652(c7622);
        } else {
            c18809M48096 = C21047.m48096(dataInputStream);
        }
        return new C6131(i2, utf, c18809M48096);
    }
}
