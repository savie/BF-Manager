package l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ᩳۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8OG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18787 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C18787 f61010 = new C18787(0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f61011;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f61012;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f61013;

    static {
        C7116.m19499(0);
        C7116.m19499(1);
        C7116.m19499(3);
    }

    public C18787(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public C18787(int i, int i2, float f) {
        this.f61012 = i;
        this.f61011 = i2;
        this.f61013 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18787) {
            C18787 c18787 = (C18787) obj;
            if (this.f61012 == c18787.f61012 && this.f61011 == c18787.f61011 && this.f61013 == c18787.f61013) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f61013) + ((((this.f61012 + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + this.f61011) * 31);
    }
}
