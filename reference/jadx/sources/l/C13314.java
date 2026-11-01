package l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.۬᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8OG */
/* JADX INFO: loaded from: classes3.dex */
public final class C13314 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C13314 f44192 = new C13314(0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44193;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f44194;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f44195;

    static {
        C17983.m41806(0);
        C17983.m41806(1);
        C17983.m41806(3);
    }

    public C13314(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public C13314(int i, int i2, float f) {
        this.f44194 = i;
        this.f44193 = i2;
        this.f44195 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13314) {
            C13314 c13314 = (C13314) obj;
            if (this.f44194 == c13314.f44194 && this.f44193 == c13314.f44193 && this.f44195 == c13314.f44195) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f44195) + ((((this.f44194 + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + this.f44193) * 31);
    }
}
