package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۜۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7052 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f23258;

    public final String toString() {
        return C14442.m34865(":containsWholeText(", this.f23258, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C7052(String str) {
        this.f23258 = str;
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        return c15497.m37094().contains(this.f23258);
    }
}
