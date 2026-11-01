package l;

/* JADX INFO: renamed from: l.ܰ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1RG */
/* JADX INFO: loaded from: classes3.dex */
public final class C13839 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f45661;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f45662;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f45663;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f45664;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f45665;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f45666;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45667;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f45660 = {262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f45659 = {4, 8, 24, 48};

    public C13839() {
        try {
            m33667(6);
        } catch (C6782 unused) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m33667(int i) throws C6782 {
        int i2;
        if (i < 0 || i > 9) {
            throw new C6782(C8479.m22141(i, "Unsupported preset: "));
        }
        this.f45661 = 3;
        this.f45662 = 2;
        this.f45667 = f45660[i];
        if (i <= 3) {
            this.f45663 = 1;
            this.f45665 = 4;
            this.f45666 = i <= 1 ? 128 : 273;
            this.f45664 = f45659[i];
            return;
        }
        this.f45663 = 2;
        this.f45665 = 20;
        if (i == 4) {
            i2 = 16;
        } else {
            i2 = i == 5 ? 32 : 64;
        }
        this.f45666 = i2;
        this.f45664 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33664(int i) throws C6782 {
        if (i < 4096) {
            throw new C6782(C2271.m6966(i, "LZMA2 dictionary size must be at least 4 KiB: ", " B"));
        }
        if (i > 805306368) {
            throw new C6782(C2271.m6966(i, "LZMA2 dictionary size must not exceed 768 MiB: ", " B"));
        }
        this.f45667 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m33666() {
        return this.f45667;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m33660() {
        return this.f45661;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m33661() {
        return this.f45662;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m33669() {
        return this.f45663;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m33668() {
        return this.f45666;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m33665() {
        return this.f45665;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33662() {
        return this.f45664;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23366 m33663(AbstractC23366 abstractC23366, C17720 c17720) {
        if (this.f45663 == 0) {
            return new C3959(abstractC23366, c17720);
        }
        return new C11722(abstractC23366, this, c17720);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
