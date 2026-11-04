package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩴ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6C7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f63706;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22209 f63707;

    public C19818(String str, C22209 c22209) {
        this.f63707 = c22209;
        this.f63706 = C22209.m50219(str, c22209.m50227(), MotionUtils.EASING_TYPE_PATH);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45583() throws C10186 {
        this.f63707.m50227().m24268(this.f63706);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m45584() {
        C22209 c22209 = this.f63707;
        String str = this.f63706;
        C19225 c19225M50228 = c22209.m50228(str);
        try {
            m45583();
            AbstractC22044 abstractC22044M50232 = c22209.m50232(str);
            c22209.m50230(abstractC22044M50232);
            C1907 c1907M50234 = c22209.m50234(str);
            if (c1907M50234.m6567() == EnumC13093.MISSING) {
                throw C22209.m50225(str);
            }
            if (c1907M50234.m6567() != EnumC13093.REGULAR) {
                throw C22209.m50223("FILE_NOT_REGULAR", "Installation requires a regular APK file.", str, c1907M50234.m6567());
            }
            c19225M50228.close();
            return abstractC22044M50232;
        } catch (Throwable th) {
            try {
                c19225M50228.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
