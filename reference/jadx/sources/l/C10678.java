package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۧ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10678 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f36429;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f36430;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f36431;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f36432;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f36433;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f36434;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f36435;

    public C10678(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f36431 = i;
        this.f36429 = i2;
        this.f36435 = i3;
        this.f36433 = i4;
        this.f36430 = i5;
        this.f36434 = i6;
        this.f36432 = i7;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C10678 m26888(int i) {
        return new C10678(i, 0, 0, 0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10678 m26886(String str, byte[] bArr) throws IOException {
        int i;
        if (bArr.length < 112) {
            throw new IOException(C0252.m1693("Invalid dex header: ", str));
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        C10678 c10678M26884 = m26884(str, byteBufferOrder, bArr.length);
        int length = bArr.length;
        int i2 = byteBufferOrder.getInt(52);
        if (i2 == 0) {
            return c10678M26884;
        }
        if (i2 < 112 || (i = i2 + 4) > length) {
            throw new IOException(C0252.m1693("Invalid dex map_off: ", str));
        }
        int i3 = byteBufferOrder.getInt(i2);
        long j = (((long) i3) * 12) + ((long) i2) + 4;
        if (i3 < 0 || j > length) {
            throw new IOException(C0252.m1693("Invalid dex map_list: ", str));
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = byteBufferOrder.getShort(i) & HPKE.aead_EXPORT_ONLY;
            int i8 = byteBufferOrder.getInt(i + 4);
            if (i8 < 0) {
                throw new IOException(C0252.m1693("Invalid dex map item: ", str));
            }
            if (i7 == 7) {
                i4 = i8;
            } else if (i7 == 8) {
                i5 = i8;
            }
            i += 12;
        }
        return new C10678(c10678M26884.f36431, c10678M26884.f36429, c10678M26884.f36435, c10678M26884.f36433, c10678M26884.f36430, i4, i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10678 m26887(AbstractC20745 abstractC20745, String str) throws IOException {
        C1388 c1388M46710 = abstractC20745.m46710("r");
        try {
            long length = c1388M46710.length();
            if (length < 112 || length > 2147483647L) {
                throw new IOException("Invalid dex header: " + str);
            }
            byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
            c1388M46710.seek(0L);
            c1388M46710.m4864(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            C10678 c10678M26885 = m26885(str, c1388M46710, length, m26884(str, ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN), (int) length));
            c1388M46710.close();
            return c10678M26885;
        } catch (Throwable th) {
            try {
                c1388M46710.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10678 m26884(String str, ByteBuffer byteBuffer, int i) throws IOException {
        if (byteBuffer.get(0) != 100 || byteBuffer.get(1) != 101 || byteBuffer.get(2) != 120 || byteBuffer.get(3) != 10 || byteBuffer.get(7) != 0) {
            throw new IOException(C0252.m1693("Invalid dex header: ", str));
        }
        int i2 = (byteBuffer.get(6) + (((byteBuffer.get(5) - 48) * 10) + ((byteBuffer.get(4) - 48) * 100))) - 48;
        int iM2176 = C0418.m2176(i2);
        if (iM2176 == -1) {
            throw new IOException(C8479.m22141(i2, "Unsupported dex version: "));
        }
        int i3 = byteBuffer.getInt(32);
        int i4 = byteBuffer.getInt(36);
        int i5 = byteBuffer.getInt(40);
        if (i3 < 112 || i3 > i || i4 != 112 || i5 != 305419896) {
            throw new IOException(C0252.m1693("Invalid dex header: ", str));
        }
        return new C10678(iM2176, byteBuffer.getInt(64), byteBuffer.getInt(72), byteBuffer.getInt(80), byteBuffer.getInt(88), 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10678 m26885(String str, C1388 c1388, long j, C10678 c10678) throws IOException {
        c1388.seek(52L);
        int i = c1388.readInt();
        if (i == 0) {
            return c10678;
        }
        if (i >= 112) {
            long j2 = i;
            long j3 = 4 + j2;
            if (j3 <= j) {
                c1388.seek(j2);
                int i2 = c1388.readInt();
                long j4 = (((long) i2) * 12) + j3;
                if (i2 < 0 || j4 > j) {
                    throw new IOException(C0252.m1693("Invalid dex map_list: ", str));
                }
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int iMo4872 = c1388.mo4872();
                    c1388.mo4872();
                    int i6 = c1388.readInt();
                    c1388.readInt();
                    if (i6 < 0) {
                        throw new IOException(C0252.m1693("Invalid dex map item: ", str));
                    }
                    if (iMo4872 == 7) {
                        i3 = i6;
                    } else if (iMo4872 == 8) {
                        i4 = i6;
                    }
                }
                return new C10678(c10678.f36431, c10678.f36429, c10678.f36435, c10678.f36433, c10678.f36430, i3, i4);
            }
        }
        throw new IOException(C0252.m1693("Invalid dex map_off: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26889(int i) {
        return this.f36429 <= i && this.f36435 <= i && this.f36433 <= i && this.f36430 <= i && this.f36434 <= i && this.f36432 <= i;
    }
}
