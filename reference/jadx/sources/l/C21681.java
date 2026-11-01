package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21681 extends AbstractC4166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f70322;

    public final String toString() {
        return C16523.m38890(":containsData(", this.f70322, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C21681(String str) {
        this.f70322 = C1323.m4722(str);
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        return C1323.m4722(c0618.m2852()).contains(this.f70322);
    }
}
