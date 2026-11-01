package l;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes.dex */
public final class C23555 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f76274;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f76275;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f76276;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76277;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float[] f76278;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f76279;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f76280;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f76281;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f76282;

    public C23555(int i, int i2) {
        this.f76274 = Color.red(i);
        this.f76275 = Color.green(i);
        this.f76277 = Color.blue(i);
        this.f76280 = i;
        this.f76282 = i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m51919() {
        return this.f76280;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] m51918() {
        if (this.f76278 == null) {
            this.f76278 = new float[3];
        }
        C3224.m9666(this.f76274, this.f76275, this.f76277, this.f76278);
        return this.f76278;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m51920() {
        return this.f76282;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m51917() {
        int iM9668;
        int iM9669;
        if (this.f76279) {
            return;
        }
        int i = this.f76280;
        int iM9661 = C3224.m9661(-1, 4.5f, i);
        int iM9662 = C3224.m9661(-1, 3.0f, i);
        if (iM9661 != -1 && iM9662 != -1) {
            this.f76281 = C3224.m9668(-1, iM9661);
            this.f76276 = C3224.m9668(-1, iM9662);
            this.f76279 = true;
            return;
        }
        int iM9663 = C3224.m9661(-16777216, 4.5f, i);
        int iM9664 = C3224.m9661(-16777216, 3.0f, i);
        if (iM9663 != -1 && iM9664 != -1) {
            this.f76281 = C3224.m9668(-16777216, iM9663);
            this.f76276 = C3224.m9668(-16777216, iM9664);
            this.f76279 = true;
            return;
        }
        if (iM9661 != -1) {
            iM9668 = C3224.m9668(-1, iM9661);
        } else {
            iM9668 = C3224.m9668(-16777216, iM9663);
        }
        this.f76281 = iM9668;
        if (iM9662 != -1) {
            iM9669 = C3224.m9668(-1, iM9662);
        } else {
            iM9669 = C3224.m9668(-16777216, iM9664);
        }
        this.f76276 = iM9669;
        this.f76279 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C23555.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f76280));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(m51918()));
        sb.append("] [Population: ");
        sb.append(this.f76282);
        sb.append("] [Title Text: #");
        m51917();
        sb.append(Integer.toHexString(this.f76276));
        sb.append("] [Body Text: #");
        m51917();
        sb.append(Integer.toHexString(this.f76281));
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23555.class == obj.getClass()) {
            C23555 c23555 = (C23555) obj;
            if (this.f76282 == c23555.f76282 && this.f76280 == c23555.f76280) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f76280 * 31) + this.f76282;
    }
}
