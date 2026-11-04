package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1FC */
/* JADX INFO: loaded from: classes.dex */
public final class C22869 extends C15409 {
    @Override // l.C15409
    /* JADX INFO: renamed from: ۙ */
    public final String mo15176(InterfaceC5650 interfaceC5650) {
        int iMo16635 = interfaceC5650.mo16635();
        return (iMo16635 == 1 || iMo16635 == 2 || iMo16635 == 3) ? MotionUtils.EASING_TYPE_PATH : C14049.m34212(interfaceC5650);
    }
}
