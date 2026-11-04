package l;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.֫ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANG */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC2097 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f6950;

    public RunnableC2097(C5563 c5563, String str) {
        super(c5563);
        this.f6950 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedInputStream bufferedInputStreamM49875;
        String str;
        String str2;
        String strM36601 = AbstractRunnableC15257.m36601(this.f6950);
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
        if (m36609(abstractC22044M36607)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC22044M36607.mo4281()) {
            str = "553 Can't HASH a directory\r\n";
        } else if (!abstractC22044M36607.mo2934()) {
            str = "550 File does not exist\r\n";
        } else if (abstractC22044M36607.mo4302()) {
            try {
                String strM16493 = c5563.m16493();
                MessageDigest messageDigest = MessageDigest.getInstance(strM16493);
                byte[] bArr = new byte[65536];
                bufferedInputStreamM49875 = abstractC22044M36607.m49875();
                try {
                    long jMo4285 = abstractC22044M36607.mo4285() - 1;
                    long j = c5563.f19317;
                    if (j >= 0) {
                        long j2 = c5563.f19314;
                        if (j <= j2 && j2 <= abstractC22044M36607.mo4285() - 1) {
                            jMo4285 = c5563.f19314;
                        }
                        c5563.f19317 = -1L;
                        c5563.f19314 = -1L;
                    } else {
                        j = 0;
                    }
                    long j3 = (jMo4285 - j) + 1;
                    C5125.m15502(j, bufferedInputStreamM49875);
                    while (true) {
                        int i = bufferedInputStreamM49875.read(bArr);
                        if (i == -1) {
                            str2 = strM36601;
                            break;
                        }
                        String str3 = strM36601;
                        long j4 = i;
                        if (j4 > j3) {
                            messageDigest.update(bArr, 0, (int) j3);
                            str2 = str3;
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                            j3 -= j4;
                            strM36601 = str3;
                        }
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        sb.append(String.format("%02x", Byte.valueOf(b)));
                    }
                    c5563.m16486("213 " + strM16493 + " " + j + "-" + jMo4285 + " " + ((Object) sb) + " " + str2 + "\r\n");
                    try {
                        bufferedInputStreamM49875.close();
                    } catch (IOException unused) {
                    }
                    str = null;
                } catch (FileNotFoundException unused2) {
                    str = "550 File not found\r\n";
                    if (bufferedInputStreamM49875 != null) {
                        try {
                            bufferedInputStreamM49875.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (IOException unused4) {
                    str = "425 Network error\r\n";
                    if (bufferedInputStreamM49875 != null) {
                        bufferedInputStreamM49875.close();
                    }
                } catch (NoSuchAlgorithmException unused5) {
                    str = "550 Unknown hashing algorithm\r\n";
                    if (bufferedInputStreamM49875 != null) {
                        bufferedInputStreamM49875.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStreamM49875 != null) {
                        try {
                            bufferedInputStreamM49875.close();
                        } catch (IOException unused6) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused7) {
                bufferedInputStreamM49875 = null;
            } catch (IOException unused8) {
                bufferedInputStreamM49875 = null;
            } catch (NoSuchAlgorithmException unused9) {
                bufferedInputStreamM49875 = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStreamM49875 = null;
            }
        } else {
            str = "556 No read permissions\r\n";
        }
        if (str != null) {
            c5563.m16486(str);
        }
    }
}
