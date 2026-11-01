package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩸۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8MB */
/* JADX INFO: loaded from: classes4.dex */
public final class C21449 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C21449 f69726 = new C21449(1.0f);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f69727;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f69728;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f69729;

    static {
        C17983.m41806(0);
        C17983.m41806(1);
    }

    public C21449(float f) {
        this(f, 1.0f);
    }

    public C21449(float f, float f2) {
        C2023.m6507(f > 0.0f);
        C2023.m6507(f2 > 0.0f);
        this.f69728 = f;
        this.f69727 = f2;
        this.f69729 = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m48074(long j) {
        return j * ((long) this.f69729);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21449.class == obj.getClass()) {
            C21449 c21449 = (C21449) obj;
            if (this.f69728 == c21449.f69728 && this.f69727 == c21449.f69727) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f69727) + ((Float.floatToRawIntBits(this.f69728) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f69728), Float.valueOf(this.f69727)};
        String str = C17983.f57504;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
