package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩶᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C20464 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f66399;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f66400;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f66401;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f66402;

    public C20464(int i, int i2, int i3, int i4) {
        this.f66401 = i;
        this.f66400 = i2;
        this.f66399 = i3;
        this.f66402 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20464.class == obj.getClass()) {
            C20464 c20464 = (C20464) obj;
            if (this.f66401 == c20464.f66401 && this.f66400 == c20464.f66400 && this.f66399 == c20464.f66399 && this.f66402 == c20464.f66402) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f66401 * 31) + this.f66400) * 31) + this.f66399) * 31) + this.f66402;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f66401);
        sb.append(", ");
        sb.append(this.f66400);
        sb.append(") - [");
        sb.append(this.f66399);
        sb.append(", ");
        return C12441.m30911(this.f66402, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46276() {
        return this.f66401 == this.f66400 && this.f66399 == this.f66402;
    }
}
