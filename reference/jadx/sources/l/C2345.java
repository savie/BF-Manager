package l;

import com.alipay.sdk.m.p.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۖ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C2345 implements InterfaceC9801 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C9056 f7560 = new C9056(0, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile CRC32 f7561;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File f7562;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f7563;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f7564;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f7565;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized CRC32 m7898() {
        if (this.f7561 == null) {
            return new CRC32();
        }
        CRC32 crc32 = this.f7561;
        this.f7561 = null;
        return crc32;
    }

    public C2345(File file) {
        int iHashCode = file.getName().hashCode() ^ C21576.m49056().uid;
        this.f7563 = new HashMap();
        this.f7564 = new ConcurrentMapC17249();
        this.f7561 = new CRC32();
        this.f7562 = file;
        this.f7565 = iHashCode;
    }

    @Override // l.InterfaceC9801
    public final boolean contains(String str) {
        C9056 c9056 = (C9056) this.f7564.get(str);
        if (c9056 == null) {
            synchronized (this) {
                c9056 = (C9056) this.f7564.get(str);
                if (c9056 == null) {
                    if (m7899(str).m53641()) {
                        return true;
                    }
                    this.f7564.putIfAbsent(str, f7560);
                    return false;
                }
            }
        }
        return c9056 != f7560;
    }

    @Override // l.InterfaceC9801
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7902(int i, String str) {
        return m7900(i, str) != null;
    }

    @Override // l.InterfaceC9801
    public final InterfaceC18752 edit() {
        return new C0853(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24084 m7899(String str) {
        HashMap map = this.f7563;
        C24084 c24084 = (C24084) map.get(str);
        if (c24084 != null) {
            return c24084;
        }
        byte[] bytes = str.getBytes();
        int length = this.f7565 ^ bytes.length;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ ((byte) (i ^ length)));
        }
        String strReplace = AbstractC7499.m20548().m20550(bytes).replace(a.h, '1');
        if (strReplace.length() > 255) {
            throw new RuntimeException("Key too long: ".concat(strReplace));
        }
        C24084 c24085 = new C24084(new File(this.f7562, strReplace));
        map.put(strReplace, c24085);
        return c24085;
    }

    @Override // l.InterfaceC9801
    public final boolean getBoolean(String str, boolean z) {
        byte[] bArrM7900 = m7900(17, str);
        if (bArrM7900 != null && bArrM7900.length == 1) {
            z = false;
            if (bArrM7900[0] != 0) {
                return true;
            }
        }
        return z;
    }

    @Override // l.InterfaceC9801
    public final float getFloat(String str, float f) {
        byte[] bArrM7900 = m7900(23, str);
        return (bArrM7900 == null || bArrM7900.length != 4) ? f : Float.intBitsToFloat(C6929.m19208(0, bArrM7900));
    }

    @Override // l.InterfaceC9801
    public final int getInt(String str, int i) {
        byte[] bArrM7900 = m7900(21, str);
        return (bArrM7900 == null || bArrM7900.length != 4) ? i : C6929.m19208(0, bArrM7900);
    }

    @Override // l.InterfaceC9801
    public final long getLong(String str, long j) {
        byte[] bArrM7900 = m7900(22, str);
        return (bArrM7900 == null || bArrM7900.length != 8) ? j : C6929.m19214(0, bArrM7900);
    }

    @Override // l.InterfaceC9801
    public final String getString(String str, String str2) {
        byte[] bArrM7900 = m7900(16, str);
        return bArrM7900 == null ? str2 : new String(bArrM7900, Charset.defaultCharset());
    }

    @Override // l.InterfaceC9801
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte mo7901(byte b, String str) {
        byte[] bArrM7900 = m7900(18, str);
        return (bArrM7900 == null || bArrM7900.length != 1) ? b : bArrM7900[0];
    }

    @Override // l.InterfaceC9801
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo7903(String str, byte[] bArr) {
        byte[] bArrM7900 = m7900(25, str);
        return bArrM7900 == null ? bArr : (byte[]) bArrM7900.clone();
    }

    @Override // l.InterfaceC9801
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] mo7904(String str) {
        byte[] bArrM7900 = m7900(26, str);
        if (bArrM7900 == null || bArrM7900.length % 4 != 0) {
            return null;
        }
        int length = bArrM7900.length / 4;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = C6929.m19208(i * 4, bArrM7900);
        }
        return iArr;
    }

    @Override // l.InterfaceC9801
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] mo7905(String str, String[] strArr) {
        byte[] bArrM7900 = m7900(27, str);
        if (bArrM7900 == null) {
            return strArr;
        }
        C20348 c20348 = new C20348(bArrM7900);
        int iM46749 = c20348.m46749();
        String[] strArr2 = new String[iM46749];
        for (int i = 0; i < iM46749; i++) {
            strArr2[i] = c20348.m46758();
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private byte[] m7900(int i, String str) {
        C9056 c9056 = (C9056) this.f7564.get(str);
        if (c9056 == null) {
            synchronized (this) {
                c9056 = (C9056) this.f7564.get(str);
                if (c9056 == null) {
                    return m7896(i, str);
                }
            }
        }
        if (c9056 != f7560 && c9056.f29454 == i) {
            return c9056.f29453;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private byte[] m7896(int i, String str) {
        int iHashCode = this.f7565 ^ str.hashCode();
        try {
            byte[] bArrM53637 = m7899(str).m53637();
            if (bArrM53637.length < 3) {
                return null;
            }
            int i2 = (bArrM53637[2] ^ iHashCode) & 255;
            int length = bArrM53637.length - 3;
            byte[] bArr = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                bArr[i3] = (byte) (bArrM53637[i3 + 3] ^ iHashCode);
            }
            int iM19212 = C6929.m19212(0, bArrM53637);
            CRC32 crc32M7898 = m7898();
            crc32M7898.update(i2);
            crc32M7898.update(bArr);
            int value = (int) (crc32M7898.getValue() & 255);
            synchronized (this) {
                if (this.f7561 == null) {
                    crc32M7898.reset();
                    this.f7561 = crc32M7898;
                }
            }
            if (iM19212 != value) {
                return null;
            }
            if (length < 10240) {
                this.f7564.putIfAbsent(str, new C9056(i2, bArr));
            }
            if (i2 == i) {
                return bArr;
            }
            return null;
        } catch (FileNotFoundException unused) {
            this.f7564.putIfAbsent(str, f7560);
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7895(C2345 c2345, String str, C9056 c9056, byte[] bArr, CRC32 crc32) throws Exception {
        FileOutputStream fileOutputStreamM53636;
        int i = c9056.f29454;
        byte[] bArr2 = c9056.f29453;
        int length = bArr2.length + 3;
        if (bArr.length < length) {
            bArr = new byte[length];
        }
        int iHashCode = c2345.f7565 ^ str.hashCode();
        crc32.reset();
        crc32.update(i);
        crc32.update(bArr2);
        int value = (int) (crc32.getValue() & 255);
        bArr[2] = (byte) (i ^ iHashCode);
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i2 + 3] = (byte) (bArr2[i2] ^ iHashCode);
        }
        C6929.m19215(0, value, bArr);
        C24084 c24084M7899 = c2345.m7899(str);
        try {
            fileOutputStreamM53636 = c24084M7899.m53636();
            try {
                fileOutputStreamM53636.write(bArr, 0, length);
                fileOutputStreamM53636.flush();
                c24084M7899.m53639(fileOutputStreamM53636);
            } catch (Exception e) {
                e = e;
                c24084M7899.m53634(fileOutputStreamM53636);
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStreamM53636 = null;
        }
    }
}
