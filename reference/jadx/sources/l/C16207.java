package l;

import bin.mt.json.JSON;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺ᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16207 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f52312;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f52313;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f52314;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f52315;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f52316;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f52317;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17617 f52318;

    public C16207(C17617 c17617, String str, AbstractC20745 abstractC20745, C5928 c5928) {
        this.f52318 = c17617;
        this.f52315 = str;
        this.f52313 = abstractC20745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38316(OutputStream outputStream) throws Throwable {
        Throwable th;
        String str = this.f52315;
        C17617 c17617 = this.f52318;
        if (this.f52314) {
            if (this.f52317) {
                throw new IllegalStateException("The stable source can only be copied once");
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f52313.mo33970(), 65536);
                try {
                    long jM38312 = m38312(bufferedInputStream, outputStream);
                    try {
                        bufferedInputStream.close();
                        this.f52316 = jM38312;
                        this.f52317 = true;
                        this.f52312 = false;
                        return jM38312;
                    } catch (IOException e) {
                        c17617.f55980.getClass();
                        throw C2800.m8497(str, e);
                    } catch (RuntimeException e2) {
                        if (C17617.m40981(e2)) {
                            c17617.f55980.getClass();
                            throw C2800.m8496(e2, str);
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
                                c17617.f55980.getClass();
                                throw C2800.m8497(str, e4);
                            }
                        } catch (RuntimeException e5) {
                            if (th != null) {
                                th.addSuppressed(e5);
                            } else {
                                if (C17617.m40981(e5)) {
                                    c17617.f55980.getClass();
                                    throw C2800.m8496(e5, str);
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
                } catch (C12731 e8) {
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
                c17617.f55980.getClass();
                throw C2800.m8497(str, e9);
            } catch (RuntimeException e10) {
                if (!C17617.m40981(e10)) {
                    throw e10;
                }
                c17617.f55980.getClass();
                throw C2800.m8496(e10, str);
            }
        }
        throw new IllegalStateException("The stable source is only valid during its action");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m38312(BufferedInputStream bufferedInputStream, OutputStream outputStream) throws C12731, IOException {
        long j;
        String str = this.f52315;
        C17617 c17617 = this.f52318;
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
                        m38313(1, j2);
                        outputStream.write(i2);
                        j = 1;
                    } catch (IOException e) {
                        c17617.f55980.getClass();
                        throw C2800.m8497(str, e);
                    } catch (RuntimeException e2) {
                        if (!C17617.m40981(e2)) {
                            throw e2;
                        }
                        c17617.f55980.getClass();
                        throw C2800.m8496(e2, str);
                    }
                } else {
                    m38313(i, j2);
                    outputStream.write(bArr, 0, i);
                    j = i;
                }
                j2 += j;
            } catch (IOException e3) {
                c17617.f55980.getClass();
                throw C2800.m8497(str, e3);
            } catch (RuntimeException e4) {
                if (!C17617.m40981(e4)) {
                    throw e4;
                }
                c17617.f55980.getClass();
                throw C2800.m8496(e4, str);
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38313(int i, long j) throws C12731 {
        if (j <= 9007199254740991L - ((long) i)) {
            return;
        }
        throw C17617.m40953(JSON.array(), "The local source size exceeds the supported JSON integer range.", this.f52315, this.f52318.f55980.m8504().f11560, "copy_source");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38317(long j) {
        if (this.f52314) {
            if (!this.f52317) {
                throw new IllegalStateException("The stable source must be copied before it can be validated");
            }
            this.f52312 = false;
            if (j != this.f52316) {
                throw new IllegalStateException("The copied byte count does not match the source result");
            }
            this.f52318.f55980.m8504().m9209(this.f52315);
            this.f52312 = true;
            return;
        }
        throw new IllegalStateException("The stable source is only valid during its action");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38314(C16207 c16207) {
        if (!c16207.f52317 || !c16207.f52312) {
            throw new IllegalStateException("The stable source must be copied and validated before the action returns");
        }
    }
}
