package l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩺֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes.dex */
public final class C23945 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pattern f77510;

    public C23945(Pattern pattern) {
        this.f77510 = pattern;
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        return this.f77510.matcher(c15497.m37097()).find();
    }

    public final String toString() {
        return ":matchesOwn(" + this.f77510 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
