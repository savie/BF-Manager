package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩶᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ARK */
/* JADX INFO: loaded from: classes4.dex */
public class C20466 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC8907 f66404;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f66405;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC2120 f66406;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f66407;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC11729 f66408;

    public C20466(AbstractC2120 abstractC2120, int i, AbstractC11729 abstractC11729) {
        this(abstractC2120, i, abstractC11729, C21606.f70083);
    }

    public C20466(AbstractC2120 abstractC2120, int i, AbstractC11729 abstractC11729, AbstractC8907 abstractC8907) {
        this.f66406 = abstractC2120;
        this.f66405 = i;
        this.f66408 = abstractC11729;
        this.f66404 = abstractC8907;
    }

    public C20466(C20466 c20466, AbstractC2120 abstractC2120, AbstractC11729 abstractC11729, AbstractC8907 abstractC8907) {
        this.f66406 = abstractC2120;
        this.f66405 = c20466.f66405;
        this.f66408 = abstractC11729;
        this.f66404 = abstractC8907;
        this.f66407 = c20466.f66407;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20466) {
            return mo35654((C20466) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo35654(C20466 c20466) {
        if (this != c20466) {
            if (c20466 != null && this.f66406.f7775 == c20466.f66406.f7775 && this.f66405 == c20466.f66405 && C13638.equals(this.f66408, c20466.f66408) && this.f66404.equals(c20466.f66404)) {
                if (((this.f66407 & 1073741824) != 0) == ((c20466.f66407 & 1073741824) != 0)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4758.m13213(C4758.m13214(C4758.m13214(C4758.m13217(C4758.m13217(7, this.f66406.f7775), this.f66405), this.f66408), this.f66404), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(this.f66406);
        sb.append(",");
        sb.append(this.f66405);
        if (this.f66408 != null) {
            sb.append(",[");
            sb.append(this.f66408.toString());
            sb.append("]");
        }
        AbstractC8907 abstractC8907 = this.f66404;
        if (abstractC8907 != null && abstractC8907 != C21606.f70083) {
            sb.append(",");
            sb.append(abstractC8907);
        }
        if ((this.f66407 & (-1073741825)) > 0) {
            sb.append(",up=");
            sb.append(this.f66407 & (-1073741825));
        }
        sb.append(')');
        return sb.toString();
    }
}
