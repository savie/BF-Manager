package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۜ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7445 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C7445 f24498 = new C7445(1.0f);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f24499;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f24500;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f24501;

    static {
        C7116.m19499(0);
        C7116.m19499(1);
    }

    public C7445(float f) {
        this(f, 1.0f);
    }

    public C7445(float f, float f2) {
        C20782.m47565(f > 0.0f);
        C20782.m47565(f2 > 0.0f);
        this.f24500 = f;
        this.f24499 = f2;
        this.f24501 = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m20396(long j) {
        return j * ((long) this.f24501);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7445.class == obj.getClass()) {
            C7445 c7445 = (C7445) obj;
            if (this.f24500 == c7445.f24500 && this.f24499 == c7445.f24499) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f24499) + ((Float.floatToRawIntBits(this.f24500) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f24500), Float.valueOf(this.f24499)};
        String str = C7116.f23455;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
