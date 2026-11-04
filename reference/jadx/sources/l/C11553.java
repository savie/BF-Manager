package l;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ۧۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C11553 implements InterfaceC9578 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LongSupplier f36329;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f36330;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f36331;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36332 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1859 f36333;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f36334;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17520 f36335;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f36336;

    public C11553(AbstractC22044 abstractC22044, LongSupplier longSupplier) throws Throwable {
        C17359.requireNonNull(abstractC22044, "file");
        this.f36329 = longSupplier;
        this.f36331 = Integer.MAX_VALUE;
        C10192 c10192M4496 = C1244.m4496();
        FileChannel fileChannel = null;
        try {
            FileChannel fileChannelMo4280 = abstractC22044.mo4280();
            C17359.requireNonNull(fileChannelMo4280, "checkpoint channel");
            try {
                this.f36335 = new C17520(fileChannelMo4280, c10192M4496);
            } catch (IOException | Error | RuntimeException e) {
                fileChannel = fileChannelMo4280;
                e = e;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable th) {
                        e.addSuppressed(th);
                    }
                }
                try {
                    c10192M4496.close();
                    throw e;
                } catch (Throwable th2) {
                    e.addSuppressed(th2);
                    throw e;
                }
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Error e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29066(C11553 c11553, C1859 c1859) {
        if (c11553.f36333 != c1859) {
            throw new IllegalStateException("Hex restore delta entry is not active");
        }
        c11553.f36333 = null;
    }

    @Override // l.InterfaceC9578
    public final void finish() throws IOException {
        if (this.f36336) {
            throw new IllegalStateException("Hex restore delta store is closed");
        }
        if (this.f36333 != null) {
            throw new IOException("Hex restore delta entry is incomplete");
        }
        this.f36334 = true;
    }

    @Override // l.InterfaceC9578
    /* JADX INFO: renamed from: ۤۙ */
    public final void mo25016() {
        if (this.f36336 || this.f36330 || !this.f36334 || this.f36333 != null) {
            throw new IllegalStateException("Hex restore delta store is not transferable");
        }
        this.f36330 = true;
        this.f36336 = true;
        this.f36332.clear();
        this.f36335.m41139();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f36336) {
            return;
        }
        this.f36336 = true;
        ArrayList arrayList = this.f36332;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C5588) arrayList.get(size)).close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    th.addSuppressed(th2);
                }
            }
        }
        arrayList.clear();
        try {
            this.f36335.m41139();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            } else {
                th.addSuppressed(th3);
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new IOException("Unable to close hex restore delta store", th);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m29067(C11553 c11553) {
        if (c11553.f36336 || c11553.f36334 || c11553.f36330) {
            throw new IllegalStateException("Hex restore delta store is not writable");
        }
    }

    @Override // l.InterfaceC9578
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC10324 mo25017(int i) throws Throwable {
        if (!this.f36336 && !this.f36334 && !this.f36330) {
            if (this.f36333 != null) {
                throw new IllegalStateException("Previous hex restore delta entry is unfinished");
            }
            if (i <= 0 || i > this.f36331) {
                throw new IOException("Invalid hex restore delta entry length");
            }
            C5588 c5588 = null;
            try {
                C5588 c5589 = new C5588(this.f36335, i);
                try {
                    C1859 c1859 = new C1859(this, c5589, this.f36329, i);
                    this.f36332.add(c5589);
                    this.f36333 = c1859;
                    return c1859;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c5588 = c5589;
                    if (c5588 != null) {
                        try {
                            c5588.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new IllegalStateException("Hex restore delta store is not writable");
        }
    }
}
