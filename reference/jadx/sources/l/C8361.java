package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8361 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f27427 = Arrays.asList("raw", "drawable", "mipmap");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9106 m22498(ImageView imageView, AttributeSet attributeSet, int i) {
        if (attributeSet != null && !imageView.isInEditMode()) {
            C9106 c9106 = new C9106(imageView, attributeSet, i);
            int i2 = c9106.f7707;
            if (i2 >= 0) {
                m22499(imageView.getDrawable(), i2);
                m22499(imageView.getBackground(), i2);
            }
            return c9106;
        }
        return new C9106();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22499(Drawable drawable, int i) {
        if (drawable instanceof C17311) {
            ((C17311) drawable).f56376.m56801(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22500(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources == null) {
            return false;
        }
        try {
            if (!f27427.contains(resources.getResourceTypeName(i))) {
                return false;
            }
            C17311 c17311 = new C17311(i, resources);
            if (z) {
                imageView.setImageDrawable(c17311);
                return true;
            }
            imageView.setBackground(c17311);
            return true;
        } catch (Resources.NotFoundException | IOException unused) {
            return false;
        }
    }
}
