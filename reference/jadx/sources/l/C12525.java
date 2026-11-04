package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ۨܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12525 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f40205;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f40207;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f40208;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC20730 f40209;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C21697 f40210;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Object f40204 = new Object();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Thread f40206 = Thread.currentThread();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40203 = true;

    public C12525(C21697 c21697, InterfaceC20730 interfaceC20730) {
        this.f40210 = c21697;
        this.f40209 = interfaceC20730;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m31109() {
        if (this.f40206 != Thread.currentThread() || !this.f40203) {
            throw new IllegalStateException("Text transaction is not active on this thread");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m31116() {
        m31109();
        return this.f40210.m49259();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31115(int i, int i2, CharBuffer charBuffer) {
        m31107(i, i2, charBuffer, 0, 0, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31114(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m31107(i, i2, charSequence, i3, i4, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31107(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        m31109();
        if (this.f40207) {
            throw new IllegalStateException("Recursive text source edit");
        }
        this.f40207 = true;
        try {
            C21697.m49248(i, i2, this.f40210.m49259());
            int length = charSequence.length();
            int i5 = z ? length : i4;
            C21697.m49248(i3, i5, length);
            C21697.m49249(this.f40210.m49259(), i2 - i, i5 - i3);
            C14016 c14016M49253 = this.f40210.m49253(i3, i5, charSequence);
            try {
                if (this.f40209 == null || (i == i2 && c14016M49253.f44409 == 0)) {
                    this.f40210 = this.f40210.m49256(i, i2, c14016M49253, this.f40204);
                } else {
                    Object obj = new Object();
                    this.f40204 = obj;
                    C21697 c21697M49256 = this.f40210.m49256(i, i2, c14016M49253, obj);
                    this.f40204 = new Object();
                    this.f40209.mo34206(i, i2, this.f40210, c21697M49256, c14016M49253.f44409);
                    this.f40210 = c21697M49256;
                }
                c14016M49253.close();
                long j = (((((long) i2) - ((long) i)) + ((long) i5)) - ((long) i3)) * 2;
                long j2 = this.f40208;
                long j3 = C25227.FOREVER_NS;
                if (j <= C25227.FOREVER_NS - j2) {
                    j3 = j2 + j;
                }
                this.f40208 = j3;
                if (i != i2 || i3 != i5) {
                    this.f40205 = true;
                }
                this.f40207 = false;
            } catch (Throwable th) {
                try {
                    c14016M49253.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.f40207 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m31113() {
        m31109();
        return this.f40208;
    }
}
