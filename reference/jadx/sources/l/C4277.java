package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۘܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15540;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f15541 = new C21287(8);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13633(C9169 c9169) throws EOFException, InterruptedIOException {
        long length = c9169.getLength();
        long j = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            j = length;
        }
        int i = (int) j;
        C21287 c21287 = this.f15541;
        c9169.mo10078(false, 0, 4, c21287.m48497());
        this.f15540 = 4;
        for (long jM48485 = c21287.m48485(); jM48485 != 440786851; jM48485 = ((jM48485 << 8) & (-256)) | ((long) (c21287.m48497()[0] & 255))) {
            int i2 = this.f15540 + 1;
            this.f15540 = i2;
            if (i2 == i) {
                return false;
            }
            c9169.mo10078(false, 0, 1, c21287.m48497());
        }
        long jM13632 = m13632(c9169);
        long j2 = this.f15540;
        if (jM13632 != Long.MIN_VALUE && (length == -1 || j2 + jM13632 < length)) {
            while (true) {
                long j3 = this.f15540;
                long j4 = j2 + jM13632;
                if (j3 < j4) {
                    if (m13632(c9169) == Long.MIN_VALUE) {
                        break;
                    }
                    long jM13633 = m13632(c9169);
                    if (jM13633 < 0 || jM13633 > 2147483647L) {
                        break;
                    }
                    if (jM13633 != 0) {
                        int i3 = (int) jM13633;
                        c9169.mo10077(i3, false);
                        this.f15540 += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private long m13632(C9169 c9169) {
        C21287 c21287 = this.f15541;
        int i = 0;
        c9169.mo10078(false, 0, 1, c21287.m48497());
        int i2 = c21287.m48497()[0] & 255;
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
        c9169.mo10078(false, 1, i4, c21287.m48497());
        while (i < i4) {
            i++;
            i5 = (c21287.m48497()[i] & 255) + (i5 << 8);
        }
        this.f15540 = i4 + 1 + this.f15540;
        return i5;
    }
}
