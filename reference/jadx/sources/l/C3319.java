package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۗܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TF */
/* JADX INFO: loaded from: classes2.dex */
public final class C3319 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12254;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f12255 = new C2460(8);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9825(C14984 c14984) throws EOFException, InterruptedIOException {
        long length = c14984.getLength();
        long j = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            j = length;
        }
        int i = (int) j;
        C2460 c2460 = this.f12255;
        c14984.mo19219(false, 0, 4, c2460.m7518());
        this.f12254 = 4;
        for (long jM7532 = c2460.m7532(); jM7532 != 440786851; jM7532 = ((jM7532 << 8) & (-256)) | ((long) (c2460.m7518()[0] & 255))) {
            int i2 = this.f12254 + 1;
            this.f12254 = i2;
            if (i2 == i) {
                return false;
            }
            c14984.mo19219(false, 0, 1, c2460.m7518());
        }
        long jM9824 = m9824(c14984);
        long j2 = this.f12254;
        if (jM9824 != Long.MIN_VALUE && (length == -1 || j2 + jM9824 < length)) {
            while (true) {
                long j3 = this.f12254;
                long j4 = j2 + jM9824;
                if (j3 < j4) {
                    if (m9824(c14984) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM9825 = m9824(c14984);
                    if (jM9825 < 0 || jM9825 > 2147483647L) {
                        break;
                    }
                    if (jM9825 != 0) {
                        int i3 = (int) jM9825;
                        c14984.mo19218(i3, false);
                        this.f12254 += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private long m9824(C14984 c14984) {
        C2460 c2460 = this.f12255;
        int i = 0;
        c14984.mo19219(false, 0, 1, c2460.m7518());
        int i2 = c2460.m7518()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c14984.mo19219(false, 1, i4, c2460.m7518());
        while (i < i4) {
            i++;
            i5 = (c2460.m7518()[i] & 255) + (i5 << 8);
        }
        this.f12254 = i4 + 1 + this.f12254;
        return i5;
    }
}
