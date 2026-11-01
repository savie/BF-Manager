package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩺֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes.dex */
public final class C22631 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f73732;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9017 f73733;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6402 f73734;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f73736;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f73737;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6402 f73738;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final FileChannel f73739;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C6402 f73740;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C6402 f73742;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f73743;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6402 f73744;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f73745;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C6402 f73746;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6402[] f73741 = new C6402[255];

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C8872 f73735 = new C8872(-1, -1);

    public C22631(InterfaceC3800 interfaceC3800, FileChannel fileChannel, C9017 c9017) {
        this.f73737 = interfaceC3800;
        this.f73739 = fileChannel;
        this.f73733 = c9017;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22631 m50162(InputStream inputStream, InterfaceC3800 interfaceC3800, C10428 c10428, long j) throws Throwable {
        boolean z;
        Throwable e;
        FileChannel fileChannelOpen;
        boolean z2 = false;
        C22631 c22631 = null;
        try {
            if (j < 0 || j > 2147483647L) {
                throw new IllegalArgumentException("Invalid legacy state size limit");
            }
            C9017 c9017M26333 = c10428.m26333(65536L);
            try {
                try {
                    z = true;
                    OutputStream outputStreamNewOutputStream = C5212.newOutputStream(interfaceC3800, EnumC17912.CREATE_NEW, EnumC17912.WRITE);
                    try {
                        C15576.m37224(inputStream, j, outputStreamNewOutputStream);
                        if (outputStreamNewOutputStream != null) {
                            outputStreamNewOutputStream.close();
                        }
                        try {
                            c9017M26333.close();
                            C9017 c9017M26334 = c10428.m26333(24576L);
                            try {
                                fileChannelOpen = C6001.open(interfaceC3800, EnumC17912.READ);
                                try {
                                    C22631 c22632 = new C22631(interfaceC3800, fileChannelOpen, c9017M26334);
                                    try {
                                        c22632.m50164();
                                        if (inputStream == null) {
                                            return c22632;
                                        }
                                        try {
                                            inputStream.close();
                                            return c22632;
                                        } catch (IOException e2) {
                                            e = e2;
                                            if (c22632 == null) {
                                                try {
                                                    c22632.close();
                                                } catch (IOException e3) {
                                                    e.addSuppressed(e3);
                                                }
                                            } else if (z) {
                                                try {
                                                    C5212.delete(interfaceC3800);
                                                } catch (IOException e4) {
                                                    e.addSuppressed(e4);
                                                }
                                            }
                                            throw e;
                                        } catch (Error e5) {
                                            e = e5;
                                            if (c22632 == null) {
                                                c22632.close();
                                            } else if (z) {
                                                C5212.delete(interfaceC3800);
                                            }
                                            throw e;
                                        } catch (RuntimeException e6) {
                                            e = e6;
                                            if (c22632 == null) {
                                                c22632.close();
                                            } else if (z) {
                                                C5212.delete(interfaceC3800);
                                            }
                                            throw e;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        c22631 = c22632;
                                        z = true;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    th.addSuppressed(th2);
                                                } catch (IOException | Error | RuntimeException e7) {
                                                    e = e7;
                                                    c22632 = c22631;
                                                    if (c22632 == null) {
                                                        c22632.close();
                                                    } else if (z) {
                                                        C5212.delete(interfaceC3800);
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
                                    c9017M26334.close();
                                    throw e;
                                } catch (Error e10) {
                                    e = e10;
                                    if (fileChannelOpen != null) {
                                        fileChannelOpen.close();
                                    }
                                    c9017M26334.close();
                                    throw e;
                                } catch (RuntimeException e11) {
                                    e = e11;
                                    if (fileChannelOpen != null) {
                                        fileChannelOpen.close();
                                    }
                                    c9017M26334.close();
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
                        c9017M26333.close();
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                    }
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                z2 = true;
                c9017M26333.close();
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

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6402 m50171() {
        return this.f73738;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C6402 m50169() {
        return this.f73740;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6402 m50167() {
        return this.f73742;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6402 m50175() {
        return this.f73744;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6402 m50172() {
        return this.f73734;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6402 m50174() {
        return this.f73746;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8872 m50173() {
        return this.f73735;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m50166() {
        return this.f73743;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m50165() {
        return this.f73736;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m50170() {
        return this.f73732;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6402 m50168(int i) {
        if (i >= 0) {
            C6402[] c6402Arr = this.f73741;
            if (i < c6402Arr.length) {
                return c6402Arr[i];
            }
        }
        throw new IllegalArgumentException("Invalid legacy state record type");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m50164() throws IOException {
        long j;
        C12753 c12753 = new C12753(this, this.f73739.size());
        c12753.m31702(1382224737);
        long j2 = c12753.f42505;
        if (c12753.m31695() != 0) {
            c12753.m31703(9L);
            if (c12753.m31695() != 0) {
                while (c12753.m31695() != 0) {
                }
            }
            c12753.m31703(1L);
            int iM31696 = c12753.m31696(20);
            for (int i = 0; i < iM31696; i++) {
                c12753.m31699();
                c12753.m31703(8L);
                c12753.m31699();
                int iM31697 = c12753.m31696(12);
                for (int i2 = 0; i2 < iM31697; i2++) {
                    c12753.m31703(8L);
                    c12753.m31699();
                }
            }
        }
        this.f73738 = m50160(j2, c12753.f42505);
        c12753.m31702(1382224738);
        c12753.m31702(-249340294);
        long jM31697 = c12753.m31697(c12753.m31701());
        long j3 = c12753.f42503;
        c12753.f42503 = jM31697;
        while (true) {
            int iM31695 = c12753.m31695();
            if (iM31695 == 255) {
                c12753.m31694();
                c12753.f42503 = j3;
                c12753.m31702(-249340294);
                if (this.f73740 == null) {
                    throw new IOException("Legacy editor state has no text record");
                }
                if (Integer.compare(this.f73732 ^ Integer.MIN_VALUE, this.f73736 ^ Integer.MIN_VALUE) > 0) {
                    throw new IOException("Invalid legacy current mark");
                }
                c12753.m31702(1382224739);
                long j4 = c12753.f42505;
                c12753.m31703(2L);
                c12753.m31699();
                c12753.m31699();
                long j5 = c12753.f42505;
                int iM31698 = c12753.m31695() | (c12753.m31695() << 8);
                c12753.f42505 = j5;
                if (iM31698 == 29298) {
                    c12753.m31703(3L);
                }
                this.f73734 = m50160(j4, c12753.f42505);
                c12753.m31702(1382224740);
                long j6 = c12753.f42505;
                int iM31701 = c12753.m31701();
                c12753.f42505 = j6;
                if (iM31701 < 388441878 || iM31701 > 388441882) {
                    iM31701 = 0;
                } else {
                    c12753.m31703(4L);
                }
                c12753.m31699();
                c12753.m31703(10L);
                if (iM31701 >= 388441879) {
                    j = 1;
                    c12753.m31703(1L);
                } else {
                    j = 1;
                }
                c12753.m31703(j);
                if (iM31701 >= 388441878) {
                    c12753.m31703(4L);
                }
                c12753.m31703(4L);
                if (iM31701 >= 388441880) {
                    while (c12753.m31695() != 0) {
                    }
                }
                if (iM31701 >= 388441881) {
                    c12753.m31703(1L);
                }
                if (iM31701 >= 388441882) {
                    c12753.m31703(1L);
                }
                c12753.m31694();
                this.f73746 = m50160(j6, c12753.f42505);
                return;
            }
            C6402[] c6402Arr = this.f73741;
            if (c6402Arr[iM31695] != null) {
                throw new IOException("Duplicate legacy editor record");
            }
            int iM31702 = c12753.m31701();
            long j7 = c12753.f42505;
            long j8 = jM31697;
            long jM31698 = c12753.m31697(iM31702);
            c6402Arr[iM31695] = m50160(j7, jM31698);
            c12753.f42503 = jM31698;
            if (iM31695 == 0) {
                if (iM31702 < 8) {
                    throw new IOException("Invalid legacy text record");
                }
                long j9 = jM31698 - 4;
                this.f73740 = m50160(j7, j9);
                c12753.f42505 = j9;
                this.f73743 = c12753.m31701();
            } else if (iM31695 == 1) {
                this.f73736 = c12753.m31701();
                c12753.m31701();
                this.f73732 = c12753.m31701();
            } else if (iM31695 == 2) {
                int iM31703 = c12753.m31701();
                int iM31704 = c12753.m31701();
                if (iM31703 < -1 || iM31704 < -1) {
                    throw new IOException("Invalid legacy selection");
                }
                this.f73735 = new C8872(iM31703, iM31704);
                c12753.m31703(12L);
            } else if (iM31695 != 3) {
                c12753.f42505 = jM31698;
            } else {
                int[] iArr = new int[2];
                c12753.m31698(iArr);
                c12753.m31698(iArr);
                this.f73742 = c12753.m31700();
                this.f73744 = c12753.m31700();
            }
            c12753.m31694();
            c12753.f42503 = j8;
            jM31697 = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6402 m50160(long j, long j2) {
        return new C6402(this, j, j2 - j);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50163(C22631 c22631) throws IOException {
        if (c22631.f73745) {
            throw new IOException("Legacy state index is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C9017 c9017 = this.f73733;
        InterfaceC3800 interfaceC3800 = this.f73737;
        if (this.f73745) {
            return;
        }
        this.f73745 = true;
        try {
            try {
                this.f73739.close();
                C5212.delete(interfaceC3800);
                c9017.close();
            } catch (Throwable th) {
                C5212.delete(interfaceC3800);
                throw th;
            }
        } catch (Throwable th2) {
            c9017.close();
            throw th2;
        }
    }
}
