package l;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: l.ۛᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes3.dex */
public class C6580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14782 f22064;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f22065;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f22066;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f22067;

    public C6580(C14782 c14782) {
        C15243.m36590(c14782, "map");
        this.f22064 = c14782;
        this.f22066 = -1;
        this.f22065 = c14782.f48371;
        m18502();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14782 m18505() {
        return this.f22064;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m18503() {
        return this.f22067;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18504(int i) {
        this.f22067 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m18500() {
        return this.f22066;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18501(int i) {
        this.f22066 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m18502() {
        while (true) {
            int i = this.f22067;
            C14782 c14782 = this.f22064;
            if (i >= c14782.f48372) {
                return;
            }
            int[] iArr = c14782.f48367;
            int i2 = this.f22067;
            if (iArr[i2] >= 0) {
                return;
            } else {
                this.f22067 = i2 + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.f22067 < this.f22064.f48372;
    }

    public final void remove() {
        m18499();
        if (this.f22066 == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C14782 c14782 = this.f22064;
        c14782.m35607();
        c14782.m35596(this.f22066);
        this.f22066 = -1;
        this.f22065 = c14782.f48371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18499() {
        if (this.f22064.f48371 != this.f22065) {
            throw new ConcurrentModificationException();
        }
    }
}
