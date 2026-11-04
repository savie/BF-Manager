package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ARK */
/* JADX INFO: loaded from: classes.dex */
public class C22937 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f74512;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f74513;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC17715 f74514;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC12450 f74515;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC7230 f74516;

    public C22937(AbstractC17715 abstractC17715, int i, AbstractC12450 abstractC12450) {
        this(abstractC17715, i, abstractC12450, C10212.f32654);
    }

    public C22937(AbstractC17715 abstractC17715, int i, AbstractC12450 abstractC12450, AbstractC7230 abstractC7230) {
        this.f74514 = abstractC17715;
        this.f74512 = i;
        this.f74515 = abstractC12450;
        this.f74516 = abstractC7230;
    }

    public C22937(C22937 c22937, AbstractC17715 abstractC17715, AbstractC12450 abstractC12450, AbstractC7230 abstractC7230) {
        this.f74514 = abstractC17715;
        this.f74512 = c22937.f74512;
        this.f74515 = abstractC12450;
        this.f74516 = abstractC7230;
        this.f74513 = c22937.f74513;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22937) {
            return mo44521((C22937) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo44521(C22937 c22937) {
        if (this != c22937) {
            if (c22937 != null && this.f74514.f58209 == c22937.f74514.f58209 && this.f74512 == c22937.f74512 && C17359.equals(this.f74515, c22937.f74515) && this.f74516.equals(c22937.f74516)) {
                if (((this.f74513 & 1073741824) != 0) == ((c22937.f74513 & 1073741824) != 0)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7103.m19444(C7103.m19445(C7103.m19445(C7103.m19447(C7103.m19447(7, this.f74514.f58209), this.f74512), this.f74515), this.f74516), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(this.f74514);
        sb.append(",");
        sb.append(this.f74512);
        if (this.f74515 != null) {
            sb.append(",[");
            sb.append(this.f74515.toString());
            sb.append("]");
        }
        AbstractC7230 abstractC7230 = this.f74516;
        if (abstractC7230 != null && abstractC7230 != C10212.f32654) {
            sb.append(",");
            sb.append(abstractC7230);
        }
        if ((this.f74513 & (-1073741825)) > 0) {
            sb.append(",up=");
            sb.append(this.f74513 & (-1073741825));
        }
        sb.append(')');
        return sb.toString();
    }
}
