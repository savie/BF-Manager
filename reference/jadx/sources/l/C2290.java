package l;

import android.media.Rating;

/* JADX INFO: renamed from: l.ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 757I */
/* JADX INFO: loaded from: classes2.dex */
public final class C2290 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m7003(Rating rating) {
        return rating.getRatingStyle();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m7001(Rating rating) {
        return rating.isRated();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m6995(Rating rating) {
        return rating.hasHeart();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m7005(Rating rating) {
        return rating.isThumbUp();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static float m7002(Rating rating) {
        return rating.getStarRating();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m6996(Rating rating) {
        return rating.getPercentRating();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rating m7000(boolean z) {
        return Rating.newHeartRating(z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Rating m7004(boolean z) {
        return Rating.newThumbRating(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rating m6999(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rating m6997(float f) {
        return Rating.newPercentageRating(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Rating m6998(int i) {
        return Rating.newUnratedRating(i);
    }
}
