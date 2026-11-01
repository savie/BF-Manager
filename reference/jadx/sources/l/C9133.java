package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۡ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R32H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9133 extends AbstractC21832 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f31078;

    public C9133(Object obj) {
        this.f31078 = obj;
    }

    @Override // l.AbstractC21832
    /* JADX INFO: renamed from: ۙ */
    public final Object mo22678(AbstractC15939 abstractC15939) {
        return this.f31078;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9133) {
            return this.f31078.equals(((C9133) obj).f31078);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31078.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f31078 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
