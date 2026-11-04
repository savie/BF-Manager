package l;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3751 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f12861;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12862;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f12863;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f12864;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f12865;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f12866;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float[] f12867;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f12868;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f12869;

    public C3751(int i, int i2) {
        this.f12865 = Color.red(i);
        this.f12869 = Color.green(i);
        this.f12862 = Color.blue(i);
        this.f12863 = i;
        this.f12866 = i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m12187() {
        return this.f12863;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] m12186() {
        if (this.f12867 == null) {
            this.f12867 = new float[3];
        }
        C19988.m45962(this.f12865, this.f12869, this.f12862, this.f12867);
        return this.f12867;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m12188() {
        return this.f12866;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m12185() {
        int iM45964;
        int iM45965;
        if (this.f12864) {
            return;
        }
        int i = this.f12863;
        int iM45957 = C19988.m45957(-1, 4.5f, i);
        int iM45958 = C19988.m45957(-1, 3.0f, i);
        if (iM45957 != -1 && iM45958 != -1) {
            this.f12868 = C19988.m45964(-1, iM45957);
            this.f12861 = C19988.m45964(-1, iM45958);
            this.f12864 = true;
            return;
        }
        int iM45959 = C19988.m45957(-16777216, 4.5f, i);
        int iM459510 = C19988.m45957(-16777216, 3.0f, i);
        if (iM45959 != -1 && iM459510 != -1) {
            this.f12868 = C19988.m45964(-16777216, iM45959);
            this.f12861 = C19988.m45964(-16777216, iM459510);
            this.f12864 = true;
            return;
        }
        if (iM45957 != -1) {
            iM45964 = C19988.m45964(-1, iM45957);
        } else {
            iM45964 = C19988.m45964(-16777216, iM45959);
        }
        this.f12868 = iM45964;
        if (iM45958 != -1) {
            iM45965 = C19988.m45964(-1, iM45958);
        } else {
            iM45965 = C19988.m45964(-16777216, iM459510);
        }
        this.f12861 = iM45965;
        this.f12864 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C3751.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f12863));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(m12186()));
        sb.append("] [Population: ");
        sb.append(this.f12866);
        sb.append("] [Title Text: #");
        m12185();
        sb.append(Integer.toHexString(this.f12861));
        sb.append("] [Body Text: #");
        m12185();
        sb.append(Integer.toHexString(this.f12868));
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3751.class == obj.getClass()) {
            C3751 c3751 = (C3751) obj;
            if (this.f12866 == c3751.f12866 && this.f12863 == c3751.f12863) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12863 * 31) + this.f12866;
    }
}
