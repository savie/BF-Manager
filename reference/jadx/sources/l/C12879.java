package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.۬ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5I1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12879 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m31911(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31912(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m31914(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31913(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
