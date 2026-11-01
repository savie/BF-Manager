package l;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 51AH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19786 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static DisplayCutout m45003(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m45005(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m45007(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m45006(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m45002(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m45004(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }
}
