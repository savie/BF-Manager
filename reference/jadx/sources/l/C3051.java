package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۗ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3051 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f9882;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23189 f9883;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23189[] f9884 = new C23189[255];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C21498 f9885 = new C21498(-1, -1);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f9886;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final FileChannel f9887;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C18251 f9888;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C23189 f9889;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f9890;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23189 f9891;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23189 f9892;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f9893;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23189 f9894;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f9895;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C23189 f9896;

    public C3051(InterfaceC24329 interfaceC24329, FileChannel fileChannel, C18251 c18251) {
        this.f9886 = interfaceC24329;
        this.f9887 = fileChannel;
        this.f9888 = c18251;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3051 m9910(InputStream inputStream, InterfaceC24329 interfaceC24329, C0352 c0352, long j) throws Throwable {
        boolean z;
        Throwable e;
        FileChannel fileChannelOpen;
        boolean z2 = false;
        C3051 c3051 = null;
        try {
            if (j < 0 || j > 2147483647L) {
                throw new IllegalArgumentException("Invalid legacy state size limit");
            }
            C18251 c18251M2112 = c0352.m2112(65536L);
            try {
                try {
                    z = true;
                    OutputStream outputStreamNewOutputStream = C3445.newOutputStream(interfaceC24329, EnumC0462.CREATE_NEW, EnumC0462.WRITE);
                    try {
                        C18713.m43521(inputStream, j, outputStreamNewOutputStream);
                        if (outputStreamNewOutputStream != null) {
                            outputStreamNewOutputStream.close();
                        }
                        try {
                            c18251M2112.close();
                            C18251 c18251M2113 = c0352.m2112(24576L);
                            try {
                                fileChannelOpen = C19853.open(interfaceC24329, EnumC0462.READ);
                                try {
                                    C3051 c3052 = new C3051(interfaceC24329, fileChannelOpen, c18251M2113);
                                    try {
                                        c3052.m9913();
                                        if (inputStream == null) {
                                            return c3052;
                                        }
                                        try {
                                            inputStream.close();
                                            return c3052;
                                        } catch (IOException e2) {
                                            e = e2;
                                            if (c3052 == null) {
                                                try {
                                                    c3052.close();
                                                } catch (IOException e3) {
                                                    e.addSuppressed(e3);
                                                }
                                            } else if (z) {
                                                try {
                                                    C3445.delete(interfaceC24329);
                                                } catch (IOException e4) {
                                                    e.addSuppressed(e4);
                                                }
                                            }
                                            throw e;
                                        } catch (Error e5) {
                                            e = e5;
                                            if (c3052 == null) {
                                                c3052.close();
                                            } else if (z) {
                                                C3445.delete(interfaceC24329);
                                            }
                                            throw e;
                                        } catch (RuntimeException e6) {
                                            e = e6;
                                            if (c3052 == null) {
                                                c3052.close();
                                            } else if (z) {
                                                C3445.delete(interfaceC24329);
                                            }
                                            throw e;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        c3051 = c3052;
                                        z = true;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    th.addSuppressed(th2);
                                                } catch (IOException | Error | RuntimeException e7) {
                                                    e = e7;
                                                    c3052 = c3051;
                                                    if (c3052 == null) {
                                                        c3052.close();
                                                    } else if (z) {
                                                        C3445.delete(interfaceC24329);
                                                    }
                                                    throw e;
                                                }
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    if (fileChannelOpen != null) {
                                        try {
                                            fileChannelOpen.close();
                                        } catch (IOException e9) {
                                            e.addSuppressed(e9);
                                        }
                                    }
                                    c18251M2113.close();
                                    throw e;
                                } catch (Error e10) {
                                    e = e10;
                                    if (fileChannelOpen != null) {
                                        fileChannelOpen.close();
                                    }
                                    c18251M2113.close();
                                    throw e;
                                } catch (RuntimeException e11) {
                                    e = e11;
                                    if (fileChannelOpen != null) {
                                        fileChannelOpen.close();
                                    }
                                    c18251M2113.close();
                                    throw e;
                                }
                            } catch (IOException | Error | RuntimeException e12) {
                                e = e12;
                                fileChannelOpen = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z = true;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        if (outputStreamNewOutputStream != null) {
                            try {
                                outputStreamNewOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        c18251M2112.close();
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                    }
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                z2 = true;
                c18251M2112.close();
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            z = z2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23189 m9918() {
        return this.f9883;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23189 m9915() {
        return this.f9896;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23189 m9916() {
        return this.f9892;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23189 m9921() {
        return this.f9894;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23189 m9922() {
        return this.f9891;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23189 m9923() {
        return this.f9889;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21498 m9925() {
        return this.f9885;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m9919() {
        return this.f9882;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m9920() {
        return this.f9890;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m9924() {
        return this.f9893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23189 m9917(int i) {
        if (i >= 0) {
            C23189[] c23189Arr = this.f9884;
            if (i < c23189Arr.length) {
                return c23189Arr[i];
            }
        }
        throw new IllegalArgumentException("Invalid legacy state record type");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m9913() throws IOException {
        long j;
        C17221 c17221 = new C17221(this, this.f9887.size());
        c17221.m40448(1382224737);
        long j2 = c17221.f56119;
        if (c17221.m40441() != 0) {
            c17221.m40449(9L);
            if (c17221.m40441() != 0) {
                while (c17221.m40441() != 0) {
                }
            }
            c17221.m40449(1L);
            int iM40442 = c17221.m40442(20);
            for (int i = 0; i < iM40442; i++) {
                c17221.m40446();
                c17221.m40449(8L);
                c17221.m40446();
                int iM40443 = c17221.m40442(12);
                for (int i2 = 0; i2 < iM40443; i2++) {
                    c17221.m40449(8L);
                    c17221.m40446();
                }
            }
        }
        this.f9883 = m9911(j2, c17221.f56119);
        c17221.m40448(1382224738);
        c17221.m40448(-249340294);
        long jM40443 = c17221.m40443(c17221.m40447());
        long j3 = c17221.f56121;
        c17221.f56121 = jM40443;
        while (true) {
            int iM40441 = c17221.m40441();
            if (iM40441 == 255) {
                c17221.m40450();
                c17221.f56121 = j3;
                c17221.m40448(-249340294);
                if (this.f9896 == null) {
                    throw new IOException("Legacy editor state has no text record");
                }
                if (Integer.compare(this.f9893 ^ Integer.MIN_VALUE, this.f9890 ^ Integer.MIN_VALUE) > 0) {
                    throw new IOException("Invalid legacy current mark");
                }
                c17221.m40448(1382224739);
                long j4 = c17221.f56119;
                c17221.m40449(2L);
                c17221.m40446();
                c17221.m40446();
                long j5 = c17221.f56119;
                int iM40444 = c17221.m40441() | (c17221.m40441() << 8);
                c17221.f56119 = j5;
                if (iM40444 == 29298) {
                    c17221.m40449(3L);
                }
                this.f9891 = m9911(j4, c17221.f56119);
                c17221.m40448(1382224740);
                long j6 = c17221.f56119;
                int iM40447 = c17221.m40447();
                c17221.f56119 = j6;
                if (iM40447 < 388441878 || iM40447 > 388441882) {
                    iM40447 = 0;
                } else {
                    c17221.m40449(4L);
                }
                c17221.m40446();
                c17221.m40449(10L);
                if (iM40447 >= 388441879) {
                    j = 1;
                    c17221.m40449(1L);
                } else {
                    j = 1;
                }
                c17221.m40449(j);
                if (iM40447 >= 388441878) {
                    c17221.m40449(4L);
                }
                c17221.m40449(4L);
                if (iM40447 >= 388441880) {
                    while (c17221.m40441() != 0) {
                    }
                }
                if (iM40447 >= 388441881) {
                    c17221.m40449(1L);
                }
                if (iM40447 >= 388441882) {
                    c17221.m40449(1L);
                }
                c17221.m40450();
                this.f9889 = m9911(j6, c17221.f56119);
                return;
            }
            C23189[] c23189Arr = this.f9884;
            if (c23189Arr[iM40441] != null) {
                throw new IOException("Duplicate legacy editor record");
            }
            int iM40448 = c17221.m40447();
            long j7 = c17221.f56119;
            long j8 = jM40443;
            long jM40444 = c17221.m40443(iM40448);
            c23189Arr[iM40441] = m9911(j7, jM40444);
            c17221.f56121 = jM40444;
            if (iM40441 == 0) {
                if (iM40448 < 8) {
                    throw new IOException("Invalid legacy text record");
                }
                long j9 = jM40444 - 4;
                this.f9896 = m9911(j7, j9);
                c17221.f56119 = j9;
                this.f9882 = c17221.m40447();
            } else if (iM40441 == 1) {
                this.f9890 = c17221.m40447();
                c17221.m40447();
                this.f9893 = c17221.m40447();
            } else if (iM40441 == 2) {
                int iM40449 = c17221.m40447();
                int iM404410 = c17221.m40447();
                if (iM40449 < -1 || iM404410 < -1) {
                    throw new IOException("Invalid legacy selection");
                }
                this.f9885 = new C21498(iM40449, iM404410);
                c17221.m40449(12L);
            } else if (iM40441 != 3) {
                c17221.f56119 = jM40444;
            } else {
                int[] iArr = new int[2];
                c17221.m40444(iArr);
                c17221.m40444(iArr);
                this.f9892 = c17221.m40445();
                this.f9894 = c17221.m40445();
            }
            c17221.m40450();
            c17221.f56121 = j8;
            jM40443 = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23189 m9911(long j, long j2) {
        return new C23189(this, j, j2 - j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m9914(C3051 c3051) throws IOException {
        if (c3051.f9895) {
            throw new IOException("Legacy state index is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C18251 c18251 = this.f9888;
        InterfaceC24329 interfaceC24329 = this.f9886;
        if (this.f9895) {
            return;
        }
        this.f9895 = true;
        try {
            try {
                this.f9887.close();
                C3445.delete(interfaceC24329);
                c18251.close();
            } catch (Throwable th) {
                C3445.delete(interfaceC24329);
                throw th;
            }
        } catch (Throwable th2) {
            c18251.close();
            throw th2;
        }
    }
}
