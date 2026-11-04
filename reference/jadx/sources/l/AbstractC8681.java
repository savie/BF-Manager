package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۠ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4OW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8681 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28333;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f28334;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f28335;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10918 f28336;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f28337;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo23358();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo23361(AbstractC23599 abstractC23599);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract void mo23366();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo23370(C15000 c15000);

    /* JADX INFO: renamed from: ᩸ */
    public abstract Collection mo3721();

    public AbstractC8681(String str, C10918 c10918, int i) {
        if (c10918 == null) {
            throw new NullPointerException("file == null");
        }
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        this.f28337 = str;
        this.f28336 = c10918;
        this.f28333 = i;
        this.f28334 = -1;
        this.f28335 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10918 m23369() {
        return this.f28336;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23359() {
        return this.f28333;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m23364() {
        int i = this.f28334;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m23368(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.f28334 >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i2 = this.f28333 - 1;
        int i3 = (i + i2) & (~i2);
        this.f28334 = i3;
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23362(C15000 c15000) {
        m23365();
        c15000.m36110(this.f28333);
        int iM36122 = c15000.m36122();
        int i = this.f28334;
        if (i < 0) {
            this.f28334 = iM36122;
        } else if (i != iM36122) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + iM36122 + ", but expected " + this.f28334);
        }
        if (c15000.m36116()) {
            String str = this.f28337;
            if (str != null) {
                c15000.m36111(0, "\n" + str + ":");
            } else if (iM36122 != 0) {
                c15000.m36111(0, "\n");
            }
        }
        mo23370(c15000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23360(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i2 = this.f28334;
        if (i2 >= 0) {
            return i2 + i;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m23367() {
        m23363();
        mo23366();
        this.f28335 = true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m23365() {
        if (!this.f28335) {
            throw new RuntimeException("not prepared");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m23363() {
        if (this.f28335) {
            throw new RuntimeException("already prepared");
        }
    }
}
