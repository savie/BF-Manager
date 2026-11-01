package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7302 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f24237 = Arrays.asList("raw", "drawable", "mipmap");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8714 m19452(ImageView imageView, AttributeSet attributeSet, int i) {
        if (attributeSet != null && !imageView.isInEditMode()) {
            C8714 c8714 = new C8714(imageView, attributeSet, i);
            int i2 = c8714.f34615;
            if (i2 >= 0) {
                m19453(imageView.getDrawable(), i2);
                m19453(imageView.getBackground(), i2);
            }
            return c8714;
        }
        return new C8714();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19453(Drawable drawable, int i) {
        if (drawable instanceof C4479) {
            ((C4479) drawable).f15939.m52904(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19454(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources == null) {
            return false;
        }
        try {
            if (!f24237.contains(resources.getResourceTypeName(i))) {
                return false;
            }
            C4479 c4479 = new C4479(resources, i);
            if (z) {
                imageView.setImageDrawable(c4479);
                return true;
            }
            imageView.setBackground(c4479);
            return true;
        } catch (Resources.NotFoundException | IOException unused) {
            return false;
        }
    }
}
