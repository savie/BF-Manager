package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1FC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18343 extends C8466 {
    @Override // l.C8466
    /* JADX INFO: renamed from: ۙ */
    public final String mo13720(InterfaceC9961 interfaceC9961) {
        int iMo25192 = interfaceC9961.mo25192();
        return (iMo25192 == 1 || iMo25192 == 2 || iMo25192 == 3) ? MotionUtils.EASING_TYPE_PATH : C7054.m18902(interfaceC9961);
    }
}
