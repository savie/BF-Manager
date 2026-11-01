package l;

import com.umeng.analytics.pro.cb;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J68J */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC4100 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f15024;

    public RunnableC4100(C0572 c0572, String str) {
        super(c0572);
        this.f15024 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        long j;
        int i;
        String strM38120 = AbstractRunnableC16096.m38120(this.f15024);
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
        if (m38128(abstractC20745M38126)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC20745M38126.mo33974()) {
            str = "550 Can't RETR a directory\r\n";
        } else if (!abstractC20745M38126.mo33975()) {
            str = "550 File does not exist\r\n";
        } else if (abstractC20745M38126.mo8449()) {
            try {
                BufferedInputStream bufferedInputStreamM46719 = abstractC20745M38126.m46719();
                try {
                    byte[] bArr = new byte[65536];
                    if (c0572.m2716()) {
                        c0572.m2708("150 Sending file\r\n");
                        if (c0572.m2714()) {
                            long jMo33964 = abstractC20745M38126.mo33964() - 1;
                            long j2 = c0572.f2371;
                            if (j2 >= 0) {
                                long j3 = c0572.f2372;
                                j = j3 >= j2 ? j3 : jMo33964;
                                c0572.f2371 = -1L;
                                c0572.f2372 = -1L;
                            } else {
                                j2 = 0;
                                j = jMo33964;
                            }
                            long j4 = (j - j2) + 1;
                            C20010.m45305(j2, bufferedInputStreamM46719);
                            while (true) {
                                if (j4 > 0 && (i = bufferedInputStreamM46719.read(bArr)) != -1) {
                                    int iMin = (int) Math.min(i, j4);
                                    if (c0572.m2704(0, iMin, bArr)) {
                                        j4 -= (long) iMin;
                                    } else {
                                        str = "426 Data socket error\r\n";
                                    }
                                } else {
                                    bufferedInputStreamM46719.close();
                                    str = null;
                                }
                            }
                        } else if (c0572.f2371 >= 0) {
                            str = "550 Unable to seek to requested position in ASCII mode";
                        } else {
                            loop1: while (true) {
                                while (true) {
                                    int i2 = bufferedInputStreamM46719.read(bArr);
                                    if (i2 == -1) {
                                        break loop1;
                                    }
                                    byte[] bArr2 = {cb.k, 10};
                                    int i3 = 0;
                                    int i4 = 0;
                                    while (i3 < i2) {
                                        if (bArr[i3] == 10) {
                                            c0572.m2704(i4, i3 - i4, bArr);
                                            if (i3 == 0) {
                                                if (!z) {
                                                    c0572.m2704(0, 1, bArr2);
                                                }
                                            } else if (bArr[i3 - 1] != 13) {
                                                c0572.m2704(0, 1, bArr2);
                                            }
                                            i4 = i3;
                                        }
                                        i3++;
                                    }
                                    c0572.m2704(i4, i3 - i4, bArr);
                                    z = bArr[i2 + (-1)] == 13;
                                }
                            }
                            bufferedInputStreamM46719.close();
                            str = null;
                        }
                    } else {
                        str = "425 Error opening socket\r\n";
                    }
                    bufferedInputStreamM46719.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStreamM46719.close();
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
        c0572.m2698();
        if (str != null) {
            c0572.m2708(str);
        } else {
            c0572.m2708("226 Transmission finished\r\n");
        }
    }
}
