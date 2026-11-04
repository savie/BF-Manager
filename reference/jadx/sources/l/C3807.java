package l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘ֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3807 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pattern f12996;

    public C3807(Pattern pattern) {
        this.f12996 = pattern;
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        return this.f12996.matcher(c15497.m37095()).find();
    }

    public final String toString() {
        return ":matchesWholeOwnText(" + this.f12996 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
