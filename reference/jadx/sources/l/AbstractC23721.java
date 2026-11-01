package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩻۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4OW */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23721 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f76766;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76767;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f76768;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f76769;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4669 f76770;

    /* JADX INFO: renamed from: ۖ */
    public abstract Collection mo12263();

    /* JADX INFO: renamed from: ۘ */
    public abstract int mo14219();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo14220(AbstractC21603 abstractC21603);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo14221(C2718 c2718);

    /* JADX INFO: renamed from: ᩹ */
    public abstract void mo14222();

    public AbstractC23721(String str, C4669 c4669, int i) {
        if (c4669 == null) {
            throw new NullPointerException("file == null");
        }
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        this.f76766 = str;
        this.f76770 = c4669;
        this.f76767 = i;
        this.f76769 = -1;
        this.f76768 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4669 m52251() {
        return this.f76770;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52244() {
        return this.f76767;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m52248() {
        int i = this.f76769;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m52250(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.f76769 >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i2 = this.f76767 - 1;
        int i3 = (i + i2) & (~i2);
        this.f76769 = i3;
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52246(C2718 c2718) {
        m52243();
        c2718.m8282(this.f76767);
        int iM8296 = c2718.m8296();
        int i = this.f76769;
        if (i < 0) {
            this.f76769 = iM8296;
        } else if (i != iM8296) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + iM8296 + ", but expected " + this.f76769);
        }
        if (c2718.m8288()) {
            String str = this.f76766;
            if (str != null) {
                c2718.m8283(0, "\n" + str + ":");
            } else if (iM8296 != 0) {
                c2718.m8283(0, "\n");
            }
        }
        mo14221(c2718);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52245(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i2 = this.f76769;
        if (i2 >= 0) {
            return i2 + i;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52247() {
        m52249();
        mo14222();
        this.f76768 = true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m52243() {
        if (!this.f76768) {
            throw new RuntimeException("not prepared");
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m52249() {
        if (this.f76768) {
            throw new RuntimeException("already prepared");
        }
    }
}
