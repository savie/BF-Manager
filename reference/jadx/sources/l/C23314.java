package l;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩹ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RIRZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23314 implements InterfaceC22808, InterfaceC22062 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final File f75522;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f75523 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1442 f75524;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13111 f75525;

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۠᩷ */
    public final /* bridge */ /* synthetic */ InterfaceC22808 mo2791() throws IOException {
        m52457();
        return this;
    }

    public C23314(C13111 c13111, C1442 c1442, File file) {
        this.f75525 = c13111;
        this.f75524 = c1442;
        this.f75522 = file;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23314 m52455(AbstractC22044 abstractC22044, File file, BooleanSupplier booleanSupplier, C16028 c16028) throws Exception {
        File file2;
        C1442 c1442M5187 = C1442.m5187(abstractC22044);
        if (c1442M5187.m5194().m18524() > 2147483647L) {
            throw new C12562();
        }
        AbstractC22044 abstractC22044M5193 = c1442M5187.m5193();
        C13111 c13111 = null;
        if (abstractC22044M5193 instanceof C1161) {
            C13111 c13111M32574 = C13111.m32574((C1161) abstractC22044M5193);
            try {
                c1442M5187.m5191();
                return new C23314(c13111M32574, c1442M5187, null);
            } catch (IOException | RuntimeException e) {
                c13111M32574.close();
                throw e;
            }
        }
        if (c16028 == null) {
            file2 = File.createTempFile("hex-compare-", ".bin", file);
        } else {
            file2 = new File(c16028.m38189().mo4294());
        }
        try {
            BufferedInputStream bufferedInputStreamM49875 = abstractC22044M5193.m49875();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[65536];
                    long j = 0;
                    while (true) {
                        int i = bufferedInputStreamM49875.read(bArr);
                        if (i != -1) {
                            if (booleanSupplier.getAsBoolean()) {
                                throw new C9446();
                            }
                            j += (long) i;
                            if (j > 2147483647L) {
                                throw new C12562();
                            }
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            fileOutputStream.close();
                            bufferedInputStreamM49875.close();
                            c1442M5187.m5191();
                            C13111 c13111M32575 = C13111.m32574(new C1161(file2));
                            try {
                                return new C23314(c13111M32575, c1442M5187, c16028 == null ? file2 : null);
                            } catch (Throwable th) {
                                th = th;
                                c13111 = c13111M32575;
                                if (c13111 != null) {
                                    try {
                                        c13111.close();
                                    } finally {
                                        if (!file2.delete() && file2.exists()) {
                                            file2.deleteOnExit();
                                        }
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    bufferedInputStreamM49875.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            th = th6;
            if (c13111 != null) {
                c13111.close();
            }
            throw th;
        }
    }

    @Override // l.InterfaceC22808
    public final int length() {
        return this.f75525.length();
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۙ */
    public final void mo2790(int i, byte[] bArr, int i2, int i3) throws IOException {
        this.f75525.mo2790(i, bArr, i2, i3);
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo2792() {
        return this.f75525.mo2792();
    }

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public final void m52457() throws IOException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f75523;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new IOException("Hex comparison source is closed");
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zDelete;
        File file = this.f75522;
        if (this.f75523.decrementAndGet() != 0) {
            return;
        }
        try {
            this.f75525.close();
            if (file != null) {
                if (zDelete) {
                    return;
                }
            }
        } finally {
            if (file != null && !file.delete() && file.exists()) {
                file.deleteOnExit();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1442 m52459() {
        return this.f75524;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52456() {
        return this.f75524.m5193().mo4295();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m52458() throws IOException {
        this.f75524.m5191();
        if (!this.f75525.mo2792()) {
            throw new C12893();
        }
    }
}
