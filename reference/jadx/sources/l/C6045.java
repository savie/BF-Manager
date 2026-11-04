package l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۛ֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6045 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pattern f20681;

    public C6045(Pattern pattern) {
        this.f20681 = pattern;
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        return this.f20681.matcher(c15497.m37087()).find();
    }

    public final String toString() {
        return ":matches(" + this.f20681 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
