package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۘۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5I1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3705 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m10874(ImageView imageView) {
        return C12879.m31911(imageView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10875(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C12879.m31912(imageView, colorStateList);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C12879.m31911(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m10877(ImageView imageView) {
        return C12879.m31914(imageView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10876(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C12879.m31913(imageView, mode);
        if (i != 21 || (drawable = imageView.getDrawable()) == null || C12879.m31911(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
