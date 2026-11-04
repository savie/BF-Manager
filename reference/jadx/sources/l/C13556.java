package l;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: l.۬ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E4MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13556 implements TypeEvaluator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13556 f43046 = new C13556();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13556 m33267() {
        return f43046;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM45884 = C19967.m45884(f3, f2, f, f2);
        float fM45885 = C19967.m45884(fPow4, fPow, f, fPow);
        float fM45886 = C19967.m45884(fPow5, fPow2, f, fPow2);
        float fM45887 = C19967.m45884(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fM45885, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM45886, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM45887, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM45884 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
