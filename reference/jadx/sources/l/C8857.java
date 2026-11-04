package l;

/* JADX INFO: renamed from: l.۠᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBEZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8857 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9976 f28939;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f28940;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f28941;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9976 f28942;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f28943;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9976 f28944;

    public C8857(int i, int i2, C9976 c9976, C9976 c9977, C9976 c9978, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c9976 == null) {
            throw new NullPointerException("name == null");
        }
        if (c9977 == null && c9978 == null) {
            throw new NullPointerException("(descriptor == null) && (signature == null)");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        this.f28941 = i;
        this.f28940 = i2;
        this.f28944 = c9976;
        this.f28939 = c9977;
        this.f28942 = c9978;
        this.f28943 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3046 m23735() {
        return C3046.m9896(this.f28944, this.f28942);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9976 m23734(C8857 c8857) {
        return c8857.f28942;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5085 m23739() {
        return C5085.m15362(this.f28939.getString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8857 m23736(C9976 c9976) {
        return new C8857(this.f28941, this.f28940, this.f28944, this.f28939, c9976, this.f28943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23737(int i, int i2) {
        int i3;
        return i2 == this.f28943 && i >= (i3 = this.f28941) && i < i3 + this.f28940;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23738(C8857 c8857) {
        return this.f28941 == c8857.f28941 && this.f28940 == c8857.f28940 && this.f28943 == c8857.f28943 && this.f28944.equals(c8857.f28944);
    }
}
