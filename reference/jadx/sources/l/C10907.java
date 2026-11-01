package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6T5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10907 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f37098;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f37099;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19103 f37101;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6276 f37103;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f37104;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean[] f37102 = new boolean[261];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23607 f37100 = new C23607();

    public C10907(C6276 c6276, int i, int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Invalid app state limit");
        }
        this.f37103 = c6276;
        this.f37098 = i3;
        this.f37101 = new C19103(c6276, i, i2);
        this.f37099 = i == 0 && i2 == c6276.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27338(int i, long j, InputStream inputStream) {
        if (i != 1 && i != 2 && i != 4 && i != 7 && i != 259 && i != 260) {
            m27336();
            return;
        }
        try {
            try {
                m27336();
                boolean[] zArr = this.f37102;
                if (!zArr[i] && j >= 0) {
                    int i2 = this.f37098;
                    if (j <= i2) {
                        zArr[i] = true;
                        C5967 c5967 = new C5967(inputStream);
                        if (i == 4) {
                            this.f37100.f76477 = new byte[(int) j];
                            int i3 = 0;
                            while (true) {
                                C23607 c23607 = this.f37100;
                                byte[] bArr = c23607.f76477;
                                if (i3 >= bArr.length) {
                                    c23607.f76481 = C17256.m40217(new ByteArrayInputStream(this.f37100.f76477), j, i2);
                                    break;
                                }
                                int i4 = c5967.read(bArr, i3, bArr.length - i3);
                                if (i4 <= 0) {
                                    throw new IOException("Truncated legacy text config");
                                }
                                i3 += i4;
                            }
                        } else {
                            C19103 c19103 = this.f37101;
                            if (i == 259 || i == 260) {
                                ArrayList arrayList = new ArrayList();
                                c19103.m43868(c5967, j, new C16471(this, arrayList));
                                if (i == 259) {
                                    this.f37100.f76483 = arrayList;
                                } else {
                                    this.f37100.f76489 = arrayList;
                                }
                            } else {
                                C0757 c0757M3260 = C0757.m3260(j, c5967);
                                try {
                                    if (i == 1) {
                                        this.f37100.f76490 = c0757M3260.readInt();
                                        this.f37100.f76485 = c0757M3260.readInt();
                                        this.f37100.f76474 = c0757M3260.readInt();
                                        C23607 c23608 = this.f37100;
                                        if (Integer.compare(c23608.f76474 ^ Integer.MIN_VALUE, c23608.f76490 ^ Integer.MIN_VALUE) > 0) {
                                            throw new IOException("Invalid legacy edit marks");
                                        }
                                        this.f37100.f76473 = true;
                                    } else if (i == 2) {
                                        C23607 c23609 = this.f37100;
                                        c19103.m43867(c0757M3260.readInt());
                                        c23609.getClass();
                                        C23607 c236010 = this.f37100;
                                        c19103.m43867(c0757M3260.readInt());
                                        c236010.getClass();
                                        this.f37100.f76486 = c0757M3260.readInt();
                                        this.f37100.f76479 = c0757M3260.readInt();
                                        this.f37100.f76480 = c0757M3260.readByte();
                                        this.f37100.f76487 = c0757M3260.m3267();
                                        this.f37100.f76476 = c0757M3260.m3267();
                                        this.f37100.f76478 = c0757M3260.m3267();
                                        this.f37100.f76482 = true;
                                    } else {
                                        this.f37100.f76488 = c19103.m43867(c0757M3260.readInt());
                                        this.f37100.f76484 = c19103.m43867(c0757M3260.readInt());
                                        this.f37100.f76475 = true;
                                    }
                                    c0757M3260.m3263();
                                    c0757M3260.close();
                                } catch (Throwable th) {
                                    try {
                                        c0757M3260.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }
                        inputStream.close();
                        return;
                    }
                }
                throw new IOException("Invalid or repeated legacy view field");
            } catch (Throwable th3) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | Error | RuntimeException e) {
            this.f37104 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27337(C10907 c10907, ArrayList arrayList, int i, int i2, int i3) {
        C6276 c6276 = c10907.f37103;
        if (!c10907.f37099 && i3 >= 0) {
            i = c6276.m40839(i3);
            i2 = i3 - c6276.m40837(i);
        }
        arrayList.add(new C15659(i, i2));
    }

    public final C23607 finish() {
        m27336();
        C23607 c23607 = this.f37100;
        close();
        return c23607;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27336() {
        if (this.f37100 == null || this.f37104) {
            throw new IllegalStateException("Legacy view reader is closed or failed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f37100 = null;
        this.f37101.close();
    }
}
