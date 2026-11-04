package l;

import bin.mt.json.JSON;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6547 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f21983;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f21984;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f21985;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0580 f21986;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f21987;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f21988;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f21989;

    public C6547(C0580 c0580, String str, AbstractC22044 abstractC22044, C1907 c1907) {
        this.f21986 = c0580;
        this.f21987 = str;
        this.f21989 = abstractC22044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18441(OutputStream outputStream) throws Throwable {
        Throwable th;
        String str = this.f21987;
        C0580 c0580 = this.f21986;
        if (this.f21983) {
            if (this.f21988) {
                throw new IllegalStateException("The stable source can only be copied once");
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f21989.mo4290(), 65536);
                try {
                    long jM18437 = m18437(bufferedInputStream, outputStream);
                    try {
                        bufferedInputStream.close();
                        this.f21984 = jM18437;
                        this.f21988 = true;
                        this.f21985 = false;
                        return jM18437;
                    } catch (IOException e) {
                        c0580.f2343.getClass();
                        throw C22209.m50221(str, e);
                    } catch (RuntimeException e2) {
                        if (C0580.m2652(e2)) {
                            c0580.f2343.getClass();
                            throw C22209.m50220(e2, str);
                        }
                        throw e2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    th = e;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                            if (th != null) {
                                th.addSuppressed(e4);
                            } else {
                                c0580.f2343.getClass();
                                throw C22209.m50221(str, e4);
                            }
                        } catch (RuntimeException e5) {
                            if (th != null) {
                                th.addSuppressed(e5);
                            } else {
                                if (C0580.m2652(e5)) {
                                    c0580.f2343.getClass();
                                    throw C22209.m50220(e5, str);
                                }
                                throw e5;
                            }
                        }
                        throw th;
                    }
                } catch (Error e6) {
                    e = e6;
                    th = e;
                    throw th;
                } catch (RuntimeException e7) {
                    e = e7;
                    th = e;
                    throw th;
                } catch (C10186 e8) {
                    e = e8;
                    th = e;
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    th = null;
                    bufferedInputStream.close();
                    throw th;
                }
            } catch (IOException e9) {
                c0580.f2343.getClass();
                throw C22209.m50221(str, e9);
            } catch (RuntimeException e10) {
                if (!C0580.m2652(e10)) {
                    throw e10;
                }
                c0580.f2343.getClass();
                throw C22209.m50220(e10, str);
            }
        }
        throw new IllegalStateException("The stable source is only valid during its action");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m18437(BufferedInputStream bufferedInputStream, OutputStream outputStream) throws C10186, IOException {
        long j;
        String str = this.f21987;
        C0580 c0580 = this.f21986;
        byte[] bArr = new byte[65536];
        long j2 = 0;
        while (true) {
            try {
                int i = bufferedInputStream.read(bArr);
                if (i < 0) {
                    break;
                }
                if (i == 0) {
                    try {
                        int i2 = bufferedInputStream.read();
                        if (i2 < 0) {
                            break;
                        }
                        m18438(1, j2);
                        outputStream.write(i2);
                        j = 1;
                    } catch (IOException e) {
                        c0580.f2343.getClass();
                        throw C22209.m50221(str, e);
                    } catch (RuntimeException e2) {
                        if (!C0580.m2652(e2)) {
                            throw e2;
                        }
                        c0580.f2343.getClass();
                        throw C22209.m50220(e2, str);
                    }
                } else {
                    m18438(i, j2);
                    outputStream.write(bArr, 0, i);
                    j = i;
                }
                j2 += j;
            } catch (IOException e3) {
                c0580.f2343.getClass();
                throw C22209.m50221(str, e3);
            } catch (RuntimeException e4) {
                if (!C0580.m2652(e4)) {
                    throw e4;
                }
                c0580.f2343.getClass();
                throw C22209.m50220(e4, str);
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18438(int i, long j) throws C10186 {
        if (j <= 9007199254740991L - ((long) i)) {
            return;
        }
        throw C0580.m2621(JSON.array(), "The local source size exceeds the supported JSON integer range.", this.f21987, this.f21986.f2343.m50227().f29602, "copy_source");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18442(long j) throws C10186 {
        if (this.f21983) {
            if (!this.f21988) {
                throw new IllegalStateException("The stable source must be copied before it can be validated");
            }
            this.f21985 = false;
            if (j != this.f21984) {
                throw new IllegalStateException("The copied byte count does not match the source result");
            }
            this.f21986.f2343.m50227().m24268(this.f21987);
            this.f21985 = true;
            return;
        }
        throw new IllegalStateException("The stable source is only valid during its action");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18439(C6547 c6547) {
        if (!c6547.f21988 || !c6547.f21985) {
            throw new IllegalStateException("The stable source must be copied and validated before the action returns");
        }
    }
}
