package l;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.ܽ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANG */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC16906 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f54060;

    public RunnableC16906(C0572 c0572, String str) {
        super(c0572);
        this.f54060 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedInputStream bufferedInputStreamM46719;
        String str;
        String str2;
        String strM38120 = AbstractRunnableC16096.m38120(this.f54060);
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
        if (m38128(abstractC20745M38126)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC20745M38126.mo33974()) {
            str = "553 Can't HASH a directory\r\n";
        } else if (!abstractC20745M38126.mo33975()) {
            str = "550 File does not exist\r\n";
        } else if (abstractC20745M38126.mo8449()) {
            try {
                String strM2705 = c0572.m2705();
                MessageDigest messageDigest = MessageDigest.getInstance(strM2705);
                byte[] bArr = new byte[65536];
                bufferedInputStreamM46719 = abstractC20745M38126.m46719();
                try {
                    long jMo33964 = abstractC20745M38126.mo33964() - 1;
                    long j = c0572.f2371;
                    if (j >= 0) {
                        long j2 = c0572.f2372;
                        if (j <= j2 && j2 <= abstractC20745M38126.mo33964() - 1) {
                            jMo33964 = c0572.f2372;
                        }
                        c0572.f2371 = -1L;
                        c0572.f2372 = -1L;
                    } else {
                        j = 0;
                    }
                    long j3 = (jMo33964 - j) + 1;
                    C20010.m45305(j, bufferedInputStreamM46719);
                    while (true) {
                        int i = bufferedInputStreamM46719.read(bArr);
                        if (i == -1) {
                            str2 = strM38120;
                            break;
                        }
                        String str3 = strM38120;
                        long j4 = i;
                        if (j4 > j3) {
                            messageDigest.update(bArr, 0, (int) j3);
                            str2 = str3;
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                            j3 -= j4;
                            strM38120 = str3;
                        }
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        sb.append(String.format("%02x", Byte.valueOf(b)));
                    }
                    c0572.m2708("213 " + strM2705 + " " + j + "-" + jMo33964 + " " + ((Object) sb) + " " + str2 + "\r\n");
                    try {
                        bufferedInputStreamM46719.close();
                    } catch (IOException unused) {
                    }
                    str = null;
                } catch (FileNotFoundException unused2) {
                    str = "550 File not found\r\n";
                    if (bufferedInputStreamM46719 != null) {
                        try {
                            bufferedInputStreamM46719.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (IOException unused4) {
                    str = "425 Network error\r\n";
                    if (bufferedInputStreamM46719 != null) {
                        bufferedInputStreamM46719.close();
                    }
                } catch (NoSuchAlgorithmException unused5) {
                    str = "550 Unknown hashing algorithm\r\n";
                    if (bufferedInputStreamM46719 != null) {
                        bufferedInputStreamM46719.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStreamM46719 != null) {
                        try {
                            bufferedInputStreamM46719.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused7) {
                bufferedInputStreamM46719 = null;
            } catch (IOException unused8) {
                bufferedInputStreamM46719 = null;
            } catch (NoSuchAlgorithmException unused9) {
                bufferedInputStreamM46719 = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStreamM46719 = null;
            }
        } else {
            str = "556 No read permissions\r\n";
        }
        if (str != null) {
            c0572.m2708(str);
        }
    }
}
