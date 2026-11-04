package l;

/* JADX INFO: renamed from: l.ܽܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E1RG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17682 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f58097;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f58098;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f58099;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58100;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f58101;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f58102;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58103;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f58096 = {262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f58095 = {4, 8, 24, 48};

    public C17682() {
        try {
            m41354(6);
        } catch (C4258 unused) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41354(int i) throws C4258 {
        int i2;
        if (i < 0 || i > 9) {
            throw new C4258(C13645.m33382(i, "Unsupported preset: "));
        }
        this.f58101 = 3;
        this.f58099 = 2;
        this.f58103 = f58096[i];
        if (i <= 3) {
            this.f58098 = 1;
            this.f58097 = 4;
            this.f58102 = i <= 1 ? 128 : 273;
            this.f58100 = f58095[i];
            return;
        }
        this.f58098 = 2;
        this.f58097 = 20;
        if (i == 4) {
            i2 = 16;
        } else {
            i2 = i == 5 ? 32 : 64;
        }
        this.f58102 = i2;
        this.f58100 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41351(int i) throws C4258 {
        if (i < 4096) {
            throw new C4258(C14442.m34864(i, "LZMA2 dictionary size must be at least 4 KiB: ", " B"));
        }
        if (i > 805306368) {
            throw new C4258(C14442.m34864(i, "LZMA2 dictionary size must not exceed 768 MiB: ", " B"));
        }
        this.f58103 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41357() {
        return this.f58103;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m41353() {
        return this.f58101;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41348() {
        return this.f58099;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m41355() {
        return this.f58098;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m41352() {
        return this.f58102;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m41356() {
        return this.f58097;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41349() {
        return this.f58100;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13207 m41350(AbstractC13207 abstractC13207, C0573 c0573) {
        if (this.f58098 == 0) {
            return new C24396(abstractC13207, c0573);
        }
        return new C16190(abstractC13207, this, c0573);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
