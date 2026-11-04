package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6T5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24064 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean[] f77805 = new boolean[261];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3926 f77806 = new C3926();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f77807;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14237 f77808;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f77809;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7305 f77810;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77811;

    public C24064(C7305 c7305, int i, int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Invalid app state limit");
        }
        this.f77810 = c7305;
        this.f77809 = i3;
        this.f77808 = new C14237(c7305, i, i2);
        this.f77807 = i == 0 && i2 == c7305.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53607(int i, long j, InputStream inputStream) {
        if (i != 1 && i != 2 && i != 4 && i != 7 && i != 259 && i != 260) {
            m53605();
            return;
        }
        try {
            try {
                m53605();
                boolean[] zArr = this.f77805;
                if (!zArr[i] && j >= 0) {
                    int i2 = this.f77809;
                    if (j <= i2) {
                        zArr[i] = true;
                        C6164 c6164 = new C6164(inputStream);
                        if (i == 4) {
                            this.f77806.f13402 = new byte[(int) j];
                            int i3 = 0;
                            while (true) {
                                C3926 c3926 = this.f77806;
                                byte[] bArr = c3926.f13402;
                                if (i3 >= bArr.length) {
                                    c3926.f13394 = C12129.m30316(new ByteArrayInputStream(this.f77806.f13402), j, i2);
                                    break;
                                }
                                int i4 = c6164.read(bArr, i3, bArr.length - i3);
                                if (i4 <= 0) {
                                    throw new IOException("Truncated legacy text config");
                                }
                                i3 += i4;
                            }
                        } else {
                            C14237 c14237 = this.f77808;
                            if (i == 259 || i == 260) {
                                ArrayList arrayList = new ArrayList();
                                c14237.m34560(c6164, j, new C10199(this, arrayList));
                                if (i == 259) {
                                    this.f77806.f13404 = arrayList;
                                } else {
                                    this.f77806.f13398 = arrayList;
                                }
                            } else {
                                C16475 c16475M39088 = C16475.m39088(j, c6164);
                                try {
                                    if (i == 1) {
                                        this.f77806.f13407 = c16475M39088.readInt();
                                        this.f77806.f13399 = c16475M39088.readInt();
                                        this.f77806.f13405 = c16475M39088.readInt();
                                        C3926 c3927 = this.f77806;
                                        if (Integer.compare(c3927.f13405 ^ Integer.MIN_VALUE, c3927.f13407 ^ Integer.MIN_VALUE) > 0) {
                                            throw new IOException("Invalid legacy edit marks");
                                        }
                                        this.f77806.f13397 = true;
                                    } else if (i == 2) {
                                        C3926 c3928 = this.f77806;
                                        c14237.m34559(c16475M39088.readInt());
                                        c3928.getClass();
                                        C3926 c3929 = this.f77806;
                                        c14237.m34559(c16475M39088.readInt());
                                        c3929.getClass();
                                        this.f77806.f13406 = c16475M39088.readInt();
                                        this.f77806.f13391 = c16475M39088.readInt();
                                        this.f77806.f13396 = c16475M39088.readByte();
                                        this.f77806.f13403 = c16475M39088.m39096();
                                        this.f77806.f13392 = c16475M39088.m39096();
                                        this.f77806.f13395 = c16475M39088.m39096();
                                        this.f77806.f13393 = true;
                                    } else {
                                        this.f77806.f13401 = c14237.m34559(c16475M39088.readInt());
                                        this.f77806.f13400 = c14237.m34559(c16475M39088.readInt());
                                        this.f77806.f13390 = true;
                                    }
                                    c16475M39088.m39099();
                                    c16475M39088.close();
                                } catch (Throwable th) {
                                    try {
                                        c16475M39088.close();
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
            this.f77811 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m53606(C24064 c24064, ArrayList arrayList, int i, int i2, int i3) {
        C7305 c7305 = c24064.f77810;
        if (!c24064.f77807 && i3 >= 0) {
            i = c7305.m23620(i3);
            i2 = i3 - c7305.m23623(i);
        }
        arrayList.add(new C17107(i, i2));
    }

    public final C3926 finish() {
        m53605();
        C3926 c3926 = this.f77806;
        close();
        return c3926;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53605() {
        if (this.f77806 == null || this.f77811) {
            throw new IllegalStateException("Legacy view reader is closed or failed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f77806 = null;
        this.f77808.close();
    }
}
