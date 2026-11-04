package l;

import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ۡۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes4.dex */
public final class C9106 extends C2395 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f29576;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f29577;

    public C9106(ImageView imageView, AttributeSet attributeSet, int i) {
        super(imageView, attributeSet, i);
        this.f29577 = m24257(imageView, attributeSet, true);
        this.f29576 = m24257(imageView, attributeSet, false);
    }

    public C9106() {
        this.f29577 = 0;
        this.f29576 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24257(ImageView imageView, AttributeSet attributeSet, boolean z) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, z ? "src" : "background", 0);
        if (attributeResourceValue > 0) {
            if (C8361.f27427.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !C8361.m22500(imageView, z, attributeResourceValue)) {
                return attributeResourceValue;
            }
        }
        return 0;
    }
}
