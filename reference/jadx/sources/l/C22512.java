package l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩹᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes.dex */
public final class C22512 extends AbstractC4166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pattern f73473;

    public C22512(Pattern pattern) {
        this.f73473 = pattern;
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        return this.f73473.matcher(c0618.m2865()).find();
    }

    public final String toString() {
        return ":matchesWholeText(" + this.f73473 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
