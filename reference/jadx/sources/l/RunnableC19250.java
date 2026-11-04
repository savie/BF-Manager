package l;

import com.umeng.analytics.pro.cb;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J68J */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC19250 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f62270;

    public RunnableC19250(C5563 c5563, String str) {
        super(c5563);
        this.f62270 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        long j;
        int i;
        String strM36601 = AbstractRunnableC15257.m36601(this.f62270);
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
        if (m36609(abstractC22044M36607)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC22044M36607.mo4281()) {
            str = "550 Can't RETR a directory\r\n";
        } else if (!abstractC22044M36607.mo2934()) {
            str = "550 File does not exist\r\n";
        } else if (abstractC22044M36607.mo4302()) {
            try {
                BufferedInputStream bufferedInputStreamM49875 = abstractC22044M36607.m49875();
                try {
                    byte[] bArr = new byte[65536];
                    if (c5563.m16499()) {
                        c5563.m16486("150 Sending file\r\n");
                        if (c5563.m16491()) {
                            long jMo4285 = abstractC22044M36607.mo4285() - 1;
                            long j2 = c5563.f19317;
                            if (j2 >= 0) {
                                long j3 = c5563.f19314;
                                j = j3 >= j2 ? j3 : jMo4285;
                                c5563.f19317 = -1L;
                                c5563.f19314 = -1L;
                            } else {
                                j2 = 0;
                                j = jMo4285;
                            }
                            long j4 = (j - j2) + 1;
                            C5125.m15502(j2, bufferedInputStreamM49875);
                            while (true) {
                                if (j4 > 0 && (i = bufferedInputStreamM49875.read(bArr)) != -1) {
                                    int iMin = (int) Math.min(i, j4);
                                    if (c5563.m16483(0, iMin, bArr)) {
                                        j4 -= (long) iMin;
                                    } else {
                                        str = "426 Data socket error\r\n";
                                    }
                                } else {
                                    bufferedInputStreamM49875.close();
                                    str = null;
                                }
                            }
                        } else if (c5563.f19317 >= 0) {
                            str = "550 Unable to seek to requested position in ASCII mode";
                        } else {
                            loop1: while (true) {
                                while (true) {
                                    int i2 = bufferedInputStreamM49875.read(bArr);
                                    if (i2 == -1) {
                                        break loop1;
                                    }
                                    byte[] bArr2 = {cb.k, 10};
                                    int i3 = 0;
                                    int i4 = 0;
                                    while (i3 < i2) {
                                        if (bArr[i3] == 10) {
                                            c5563.m16483(i4, i3 - i4, bArr);
                                            if (i3 == 0) {
                                                if (!z) {
                                                    c5563.m16483(0, 1, bArr2);
                                                }
                                            } else if (bArr[i3 - 1] != 13) {
                                                c5563.m16483(0, 1, bArr2);
                                            }
                                            i4 = i3;
                                        }
                                        i3++;
                                    }
                                    c5563.m16483(i4, i3 - i4, bArr);
                                    z = bArr[i2 + (-1)] == 13;
                                }
                            }
                            bufferedInputStreamM49875.close();
                            str = null;
                        }
                    } else {
                        str = "425 Error opening socket\r\n";
                    }
                    bufferedInputStreamM49875.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStreamM49875.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (FileNotFoundException unused) {
                str = "550 File not found\r\n";
            } catch (IOException unused2) {
                str = "425 Network error\r\n";
            }
        } else {
            str = "550 No read permissions\r\n";
        }
        c5563.m16477();
        if (str != null) {
            c5563.m16486(str);
        } else {
            c5563.m16486("226 Transmission finished\r\n");
        }
    }
}
