package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܶ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15450 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14744 f50345;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f50347;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f50348;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23211 f50350;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50351;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f50349 = new Object();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Thread f50344 = Thread.currentThread();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50346 = true;

    public C15450(C14744 c14744, InterfaceC23211 interfaceC23211) {
        this.f50345 = c14744;
        this.f50350 = interfaceC23211;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36967() {
        if (this.f50344 != Thread.currentThread() || !this.f50346) {
            throw new IllegalStateException("Text transaction is not active on this thread");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m36973() {
        m36967();
        return this.f50345.m35339();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36972(int i, int i2, CharBuffer charBuffer) {
        m36965(i, i2, charBuffer, 0, 0, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36971(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m36965(i, i2, charSequence, i3, i4, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36965(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        m36967();
        if (this.f50351) {
            throw new IllegalStateException("Recursive text source edit");
        }
        this.f50351 = true;
        try {
            C14744.m35328(i, i2, this.f50345.m35339());
            int length = charSequence.length();
            int i5 = z ? length : i4;
            C14744.m35328(i3, i5, length);
            C14744.m35329(this.f50345.m35339(), i2 - i, i5 - i3);
            C11216 c11216M35333 = this.f50345.m35333(i3, i5, charSequence);
            try {
                if (this.f50350 == null || (i == i2 && c11216M35333.f37948 == 0)) {
                    this.f50345 = this.f50345.m35336(i, i2, c11216M35333, this.f50349);
                } else {
                    Object obj = new Object();
                    this.f50349 = obj;
                    C14744 c14744M35336 = this.f50345.m35336(i, i2, c11216M35333, obj);
                    this.f50349 = new Object();
                    this.f50350.mo4432(i, i2, this.f50345, c14744M35336, c11216M35333.f37948);
                    this.f50345 = c14744M35336;
                }
                c11216M35333.close();
                long j = (((((long) i2) - ((long) i)) + ((long) i5)) - ((long) i3)) * 2;
                long j2 = this.f50347;
                long j3 = C17492.FOREVER_NS;
                if (j <= C17492.FOREVER_NS - j2) {
                    j3 = j2 + j;
                }
                this.f50347 = j3;
                if (i != i2 || i3 != i5) {
                    this.f50348 = true;
                }
                this.f50351 = false;
            } catch (Throwable th) {
                try {
                    c11216M35333.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.f50351 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m36970() {
        m36967();
        return this.f50347;
    }
}
