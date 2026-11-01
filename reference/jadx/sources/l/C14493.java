package l;

import com.alipay.sdk.m.p.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܳۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14493 implements InterfaceC6025 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C23665 f47474 = new C23665(0, null);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f47475;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile CRC32 f47476;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f47477;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File f47478;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f47479;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private synchronized CRC32 m34893() {
        if (this.f47476 == null) {
            return new CRC32();
        }
        CRC32 crc32 = this.f47476;
        this.f47476 = null;
        return crc32;
    }

    public C14493(File file) {
        int iHashCode = file.getName().hashCode() ^ C16737.m39261().uid;
        this.f47477 = new HashMap();
        this.f47479 = new ConcurrentMapC13783();
        this.f47476 = new CRC32();
        this.f47478 = file;
        this.f47475 = iHashCode;
    }

    @Override // l.InterfaceC6025
    public final boolean contains(String str) {
        C23665 c23665 = (C23665) this.f47479.get(str);
        if (c23665 == null) {
            synchronized (this) {
                c23665 = (C23665) this.f47479.get(str);
                if (c23665 == null) {
                    if (m34894(str).m37495()) {
                        return true;
                    }
                    this.f47479.putIfAbsent(str, f47474);
                    return false;
                }
            }
        }
        return c23665 != f47474;
    }

    @Override // l.InterfaceC6025
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16346(int i, String str) {
        return m34895(i, str) != null;
    }

    @Override // l.InterfaceC6025
    public final InterfaceC17314 edit() {
        return new C10965(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15759 m34894(String str) {
        HashMap map = this.f47477;
        C15759 c15759 = (C15759) map.get(str);
        if (c15759 != null) {
            return c15759;
        }
        byte[] bytes = str.getBytes();
        int length = this.f47475 ^ bytes.length;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ ((byte) (i ^ length)));
        }
        String strReplace = AbstractC13512.m33036().m33038(bytes).replace(a.h, '1');
        if (strReplace.length() > 255) {
            throw new RuntimeException("Key too long: ".concat(strReplace));
        }
        C15759 c157510 = new C15759(new File(this.f47478, strReplace));
        map.put(strReplace, c157510);
        return c157510;
    }

    @Override // l.InterfaceC6025
    public final boolean getBoolean(String str, boolean z) {
        byte[] bArrM34895 = m34895(17, str);
        if (bArrM34895 != null && bArrM34895.length == 1) {
            z = false;
            if (bArrM34895[0] != 0) {
                return true;
            }
        }
        return z;
    }

    @Override // l.InterfaceC6025
    public final float getFloat(String str, float f) {
        byte[] bArrM34895 = m34895(23, str);
        return (bArrM34895 == null || bArrM34895.length != 4) ? f : Float.intBitsToFloat(C15157.m36336(0, bArrM34895));
    }

    @Override // l.InterfaceC6025
    public final int getInt(String str, int i) {
        byte[] bArrM34895 = m34895(21, str);
        return (bArrM34895 == null || bArrM34895.length != 4) ? i : C15157.m36336(0, bArrM34895);
    }

    @Override // l.InterfaceC6025
    public final long getLong(String str, long j) {
        byte[] bArrM34895 = m34895(22, str);
        return (bArrM34895 == null || bArrM34895.length != 8) ? j : C15157.m36351(0, bArrM34895);
    }

    @Override // l.InterfaceC6025
    public final String getString(String str, String str2) {
        byte[] bArrM34895 = m34895(16, str);
        return bArrM34895 == null ? str2 : new String(bArrM34895, Charset.defaultCharset());
    }

    @Override // l.InterfaceC6025
    /* JADX INFO: renamed from: ۙ */
    public final byte mo16345(byte b, String str) {
        byte[] bArrM34895 = m34895(18, str);
        return (bArrM34895 == null || bArrM34895.length != 1) ? b : bArrM34895[0];
    }

    @Override // l.InterfaceC6025
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo16347(String str, byte[] bArr) {
        byte[] bArrM34895 = m34895(25, str);
        return bArrM34895 == null ? bArr : (byte[]) bArrM34895.clone();
    }

    @Override // l.InterfaceC6025
    /* JADX INFO: renamed from: ۙ */
    public final int[] mo16348(String str) {
        byte[] bArrM34895 = m34895(26, str);
        if (bArrM34895 == null || bArrM34895.length % 4 != 0) {
            return null;
        }
        int length = bArrM34895.length / 4;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = C15157.m36336(i * 4, bArrM34895);
        }
        return iArr;
    }

    @Override // l.InterfaceC6025
    /* JADX INFO: renamed from: ۙ */
    public final String[] mo16349(String str, String[] strArr) {
        byte[] bArrM34895 = m34895(27, str);
        if (bArrM34895 == null) {
            return strArr;
        }
        C17367 c17367 = new C17367(bArrM34895);
        int iM40462 = c17367.m40462();
        String[] strArr2 = new String[iM40462];
        for (int i = 0; i < iM40462; i++) {
            strArr2[i] = c17367.m40458();
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private byte[] m34895(int i, String str) {
        C23665 c23665 = (C23665) this.f47479.get(str);
        if (c23665 == null) {
            synchronized (this) {
                c23665 = (C23665) this.f47479.get(str);
                if (c23665 == null) {
                    return m34891(i, str);
                }
            }
        }
        if (c23665 != f47474 && c23665.f76593 == i) {
            return c23665.f76592;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private byte[] m34891(int i, String str) {
        int iHashCode = this.f47475 ^ str.hashCode();
        try {
            byte[] bArrM37502 = m34894(str).m37502();
            if (bArrM37502.length < 3) {
                return null;
            }
            int i2 = (bArrM37502[2] ^ iHashCode) & 255;
            int length = bArrM37502.length - 3;
            byte[] bArr = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                bArr[i3] = (byte) (bArrM37502[i3 + 3] ^ iHashCode);
            }
            int iM36347 = C15157.m36347(0, bArrM37502);
            CRC32 crc32M34893 = m34893();
            crc32M34893.update(i2);
            crc32M34893.update(bArr);
            int value = (int) (crc32M34893.getValue() & 255);
            synchronized (this) {
                if (this.f47476 == null) {
                    crc32M34893.reset();
                    this.f47476 = crc32M34893;
                }
            }
            if (iM36347 != value) {
                return null;
            }
            if (length < 10240) {
                this.f47479.putIfAbsent(str, new C23665(i2, bArr));
            }
            if (i2 == i) {
                return bArr;
            }
            return null;
        } catch (FileNotFoundException unused) {
            this.f47479.putIfAbsent(str, f47474);
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34890(C14493 c14493, String str, C23665 c23665, byte[] bArr, CRC32 crc32) throws Exception {
        FileOutputStream fileOutputStreamM37494;
        int i = c23665.f76593;
        byte[] bArr2 = c23665.f76592;
        int length = bArr2.length + 3;
        if (bArr.length < length) {
            bArr = new byte[length];
        }
        int iHashCode = c14493.f47475 ^ str.hashCode();
        crc32.reset();
        crc32.update(i);
        crc32.update(bArr2);
        int value = (int) (crc32.getValue() & 255);
        bArr[2] = (byte) (i ^ iHashCode);
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i2 + 3] = (byte) (bArr2[i2] ^ iHashCode);
        }
        C15157.m36353(0, value, bArr);
        C15759 c15759M34894 = c14493.m34894(str);
        try {
            fileOutputStreamM37494 = c15759M34894.m37494();
            try {
                fileOutputStreamM37494.write(bArr, 0, length);
                fileOutputStreamM37494.flush();
                c15759M34894.m37500(fileOutputStreamM37494);
            } catch (Exception e) {
                e = e;
                c15759M34894.m37497(fileOutputStreamM37494);
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStreamM37494 = null;
        }
    }
}
