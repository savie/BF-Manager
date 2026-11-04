package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۚ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5320 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f18704;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f18705;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f18706;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f18707;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f18708;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f18709;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f18710;

    public C5320(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f18704 = i;
        this.f18706 = i2;
        this.f18707 = i3;
        this.f18705 = i4;
        this.f18710 = i5;
        this.f18709 = i6;
        this.f18708 = i7;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5320 m15974(int i) {
        return new C5320(i, 0, 0, 0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5320 m15972(String str, byte[] bArr) throws IOException {
        int i;
        if (bArr.length < 112) {
            throw new IOException(C25272.m56409("Invalid dex header: ", str));
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        C5320 c5320M15970 = m15970(str, byteBufferOrder, bArr.length);
        int length = bArr.length;
        int i2 = byteBufferOrder.getInt(52);
        if (i2 == 0) {
            return c5320M15970;
        }
        if (i2 < 112 || (i = i2 + 4) > length) {
            throw new IOException(C25272.m56409("Invalid dex map_off: ", str));
        }
        int i3 = byteBufferOrder.getInt(i2);
        long j = (((long) i3) * 12) + ((long) i2) + 4;
        if (i3 < 0 || j > length) {
            throw new IOException(C25272.m56409("Invalid dex map_list: ", str));
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = byteBufferOrder.getShort(i) & HPKE.aead_EXPORT_ONLY;
            int i8 = byteBufferOrder.getInt(i + 4);
            if (i8 < 0) {
                throw new IOException(C25272.m56409("Invalid dex map item: ", str));
            }
            if (i7 == 7) {
                i4 = i8;
            } else if (i7 == 8) {
                i5 = i8;
            }
            i += 12;
        }
        return new C5320(c5320M15970.f18704, c5320M15970.f18706, c5320M15970.f18707, c5320M15970.f18705, c5320M15970.f18710, i4, i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5320 m15973(AbstractC22044 abstractC22044, String str) {
        C13961 c13961M49855 = abstractC22044.m49855("r");
        try {
            long length = c13961M49855.length();
            if (length < 112 || length > 2147483647L) {
                throw new IOException("Invalid dex header: " + str);
            }
            byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
            c13961M49855.seek(0L);
            c13961M49855.readFully(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            C5320 c5320M15971 = m15971(str, c13961M49855, length, m15970(str, ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN), (int) length));
            c13961M49855.close();
            return c5320M15971;
        } catch (Throwable th) {
            try {
                c13961M49855.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5320 m15970(String str, ByteBuffer byteBuffer, int i) throws IOException {
        if (byteBuffer.get(0) != 100 || byteBuffer.get(1) != 101 || byteBuffer.get(2) != 120 || byteBuffer.get(3) != 10 || byteBuffer.get(7) != 0) {
            throw new IOException(C25272.m56409("Invalid dex header: ", str));
        }
        int i2 = (byteBuffer.get(6) + (((byteBuffer.get(5) - 48) * 10) + ((byteBuffer.get(4) - 48) * 100))) - 48;
        int iM43755 = C18856.m43755(i2);
        if (iM43755 == -1) {
            throw new IOException(C13645.m33382(i2, "Unsupported dex version: "));
        }
        int i3 = byteBuffer.getInt(32);
        int i4 = byteBuffer.getInt(36);
        int i5 = byteBuffer.getInt(40);
        if (i3 < 112 || i3 > i || i4 != 112 || i5 != 305419896) {
            throw new IOException(C25272.m56409("Invalid dex header: ", str));
        }
        return new C5320(iM43755, byteBuffer.getInt(64), byteBuffer.getInt(72), byteBuffer.getInt(80), byteBuffer.getInt(88), 0, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5320 m15971(String str, C13961 c13961, long j, C5320 c5320) throws IOException {
        c13961.seek(52L);
        int i = c13961.readInt();
        if (i == 0) {
            return c5320;
        }
        if (i >= 112) {
            long j2 = i;
            long j3 = 4 + j2;
            if (j3 <= j) {
                c13961.seek(j2);
                int i2 = c13961.readInt();
                long j4 = (((long) i2) * 12) + j3;
                if (i2 < 0 || j4 > j) {
                    throw new IOException(C25272.m56409("Invalid dex map_list: ", str));
                }
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int iMo34029 = c13961.mo34029();
                    c13961.mo34029();
                    int i6 = c13961.readInt();
                    c13961.readInt();
                    if (i6 < 0) {
                        throw new IOException(C25272.m56409("Invalid dex map item: ", str));
                    }
                    if (iMo34029 == 7) {
                        i3 = i6;
                    } else if (iMo34029 == 8) {
                        i4 = i6;
                    }
                }
                return new C5320(c5320.f18704, c5320.f18706, c5320.f18707, c5320.f18705, c5320.f18710, i3, i4);
            }
        }
        throw new IOException(C25272.m56409("Invalid dex map_off: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15975(int i) {
        return this.f18706 <= i && this.f18707 <= i && this.f18705 <= i && this.f18710 <= i && this.f18709 <= i && this.f18708 <= i;
    }
}
