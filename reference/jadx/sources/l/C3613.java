package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۗᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3613 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17037 f12381;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f12382;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f12383;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f12384;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f12385;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16291 f12386;

    public C3613(C17037 c17037) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f12382 = arrayDeque;
        this.f12386 = new C16291();
        this.f12384 = c17037 == null ? 0 : c17037.f55675;
        if (c17037 != null) {
            arrayDeque.push(c17037);
            this.f12381 = m11718();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m11723() {
        return this.f12383;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11726(int i) {
        try {
            m11717(i, true, null);
        } catch (C9446 e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11721(int i, InterfaceC7509 interfaceC7509) throws C9446 {
        m11717(i, true, interfaceC7509);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m11724(int i) {
        if (i >= 0) {
            int i2 = this.f12383;
            if (((long) i2) + ((long) i) <= this.f12384) {
                try {
                    m11717(i2 + i, false, null);
                    return;
                } catch (C9446 e) {
                    throw new AssertionError(e);
                }
            }
        }
        throw new IndexOutOfBoundsException("Invalid dirty stream skip length");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11720(int i) {
        this.f12386.m38650(i, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17037 m11719() {
        return this.f12386.m38648();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m11725() {
        return this.f12386.m38652();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11722(long j) {
        this.f12386.m38651(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11717(int i, boolean z, InterfaceC7509 interfaceC7509) throws C9446 {
        if (i < this.f12383 || i > this.f12384) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "Invalid dirty stream target "));
        }
        int i2 = 0;
        while (this.f12383 < i) {
            int i3 = i2 + 1;
            if ((i2 & 255) == 0 && interfaceC7509 != null && interfaceC7509.mo924()) {
                throw new C9446();
            }
            C17037 c17037 = this.f12381;
            if (c17037 == null) {
                throw new IllegalStateException("Dirty stream ended early");
            }
            int iMin = Math.min(i - this.f12383, c17037.f55675 - this.f12385);
            if (z) {
                boolean zM40147 = this.f12381.m40147();
                C16291 c16291 = this.f12386;
                if (zM40147) {
                    c16291.m38649(this.f12385, iMin, this.f12381.f55677);
                } else {
                    c16291.m38650(iMin, this.f12381.f55670);
                }
            }
            this.f12383 += iMin;
            int i4 = this.f12385 + iMin;
            this.f12385 = i4;
            if (i4 == this.f12381.f55675) {
                this.f12381 = m11718();
                this.f12385 = 0;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C17037 m11718() {
        while (true) {
            ArrayDeque arrayDeque = this.f12382;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            C17037 c17037 = (C17037) arrayDeque.pop();
            if (c17037.m40149()) {
                return c17037;
            }
            arrayDeque.push(c17037.f55672);
            arrayDeque.push(c17037.f55676);
        }
    }
}
