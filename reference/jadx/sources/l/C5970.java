package l;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5970 implements InterfaceC13163 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f20326;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20327 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f20328;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f20329;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C17259 f20330;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20559 f20331;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14438 f20332;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20333;

    public C5970(AbstractC20745 abstractC20745, C20559 c20559) throws Throwable {
        C13638.requireNonNull(abstractC20745, "file");
        this.f20331 = c20559;
        this.f20329 = Integer.MAX_VALUE;
        C5339 c5339M49439 = C22273.m49439();
        FileChannel fileChannel = null;
        try {
            FileChannel fileChannelMo33982 = abstractC20745.mo33982();
            C13638.requireNonNull(fileChannelMo33982, "checkpoint channel");
            try {
                this.f20332 = new C14438(fileChannelMo33982, c5339M49439);
            } catch (IOException | Error | RuntimeException e) {
                fileChannel = fileChannelMo33982;
                e = e;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable th) {
                        e.addSuppressed(th);
                    }
                }
                try {
                    c5339M49439.close();
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
    public static void m16261(C5970 c5970, C17259 c17259) {
        if (c5970.f20330 != c17259) {
            throw new IllegalStateException("Hex restore delta entry is not active");
        }
        c5970.f20330 = null;
    }

    @Override // l.InterfaceC13163
    public final void finish() throws IOException {
        if (this.f20333) {
            throw new IllegalStateException("Hex restore delta store is closed");
        }
        if (this.f20330 != null) {
            throw new IOException("Hex restore delta entry is incomplete");
        }
        this.f20326 = true;
    }

    @Override // l.InterfaceC13163
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final void mo16264() {
        if (this.f20333 || this.f20328 || !this.f20326 || this.f20330 != null) {
            throw new IllegalStateException("Hex restore delta store is not transferable");
        }
        this.f20328 = true;
        this.f20333 = true;
        this.f20327.clear();
        this.f20332.m34725();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f20333) {
            return;
        }
        this.f20333 = true;
        ArrayList arrayList = this.f20327;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C12321) arrayList.get(size)).close();
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
            this.f20332.m34725();
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m16262(C5970 c5970) {
        if (c5970.f20333 || c5970.f20326 || c5970.f20328) {
            throw new IllegalStateException("Hex restore delta store is not writable");
        }
    }

    @Override // l.InterfaceC13163
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22335 mo16263(int i) throws Throwable {
        if (!this.f20333 && !this.f20326 && !this.f20328) {
            if (this.f20330 != null) {
                throw new IllegalStateException("Previous hex restore delta entry is unfinished");
            }
            if (i <= 0 || i > this.f20329) {
                throw new IOException("Invalid hex restore delta entry length");
            }
            C12321 c12321 = null;
            try {
                C12321 c12322 = new C12321(this.f20332, i);
                try {
                    C17259 c17259 = new C17259(this, c12322, this.f20331, i);
                    this.f20327.add(c12322);
                    this.f20330 = c17259;
                    return c17259;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c12321 = c12322;
                    if (c12321 != null) {
                        try {
                            c12321.close();
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
