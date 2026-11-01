package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23189 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f75246;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f75247;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f75248;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f75249;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f75250;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Throwable f75251;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13311 f75253;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile EnumC15428 f75252 = EnumC15428.UNKNOWN;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f75254 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15428 m51216() {
        return this.f75252;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51217() {
        synchronized (this.f75254) {
            this.f75252 = EnumC15428.UNKNOWN;
            this.f75253 = null;
            this.f75251 = null;
            this.f75250++;
            this.f75246 = false;
            this.f75248 = 0L;
            this.f75254.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6960 m51215(C10489 c10489, C7666 c7666) {
        Throwable th;
        C13311 c13311M26610;
        boolean z;
        while (c7666.f25356.m40820(c7666.f25357)) {
            EnumC15428 enumC15428 = this.f75252;
            EnumC15428 enumC15429 = EnumC15428.UNKNOWN;
            if (enumC15428 != enumC15429) {
                return new C6960(enumC15428, false);
            }
            synchronized (this.f75254) {
                if (!c7666.f25356.m40820(c7666.f25357)) {
                    return new C6960(enumC15429, true);
                }
                EnumC15428 enumC154210 = this.f75252;
                if (enumC154210 != enumC15429) {
                    return new C6960(enumC154210, false);
                }
                if (this.f75246) {
                    long j = this.f75248;
                    while (this.f75246 && this.f75248 == j) {
                        try {
                            this.f75254.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB protocol probing", e);
                        }
                    }
                    if (!c7666.f25356.m40820(c7666.f25357)) {
                        return new C6960(EnumC15428.UNKNOWN, true);
                    }
                    EnumC15428 enumC154211 = this.f75252;
                    EnumC15428 enumC154212 = EnumC15428.UNKNOWN;
                    if (enumC154211 != enumC154212) {
                        return new C6960(enumC154211, false);
                    }
                    C13311 c13311 = this.f75253;
                    if (c13311 != null && this.f75249 == j) {
                        if (c13311.m32817() != null) {
                            m51214(this.f75253.m32817());
                            throw null;
                        }
                        if (this.f75253.m32816() != enumC154212) {
                            return new C6960(this.f75253.m32816(), false);
                        }
                    }
                    Throwable th2 = this.f75251;
                    if (th2 != null && this.f75247 == j) {
                        m51214(th2);
                        throw null;
                    }
                    return new C6960(enumC154212, true);
                }
                this.f75246 = true;
                long j2 = this.f75250 + 1;
                this.f75250 = j2;
                this.f75248 = j2;
                try {
                    c13311M26610 = c10489.m26610();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                    c13311M26610 = null;
                }
                synchronized (this.f75254) {
                    z = this.f75250 != j2;
                    if (!z) {
                        this.f75253 = c13311M26610;
                        this.f75249 = j2;
                        this.f75251 = th;
                        this.f75247 = j2;
                        if (th == null && c13311M26610 != null && c13311M26610.m32816() != EnumC15428.UNKNOWN) {
                            this.f75252 = c13311M26610.m32816();
                        }
                    }
                    if (this.f75248 == j2) {
                        this.f75246 = false;
                        this.f75248 = 0L;
                    }
                    this.f75254.notifyAll();
                }
                if (z) {
                    return new C6960(EnumC15428.UNKNOWN, true);
                }
                if (th != null) {
                    m51214(th);
                    throw null;
                }
                if (c13311M26610.m32817() != null) {
                    m51214(c13311M26610.m32817());
                    throw null;
                }
                if (c13311M26610.m32816() != EnumC15428.UNKNOWN) {
                    return new C6960(c13311M26610.m32816(), false);
                }
            }
        }
        return new C6960(EnumC15428.UNKNOWN, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51214(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IOException("SMB protocol probing failed", th);
    }
}
