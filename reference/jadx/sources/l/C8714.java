package l;

import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ۡۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8714 extends C10125 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f29956;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f29957;

    public C8714(ImageView imageView, AttributeSet attributeSet, int i) {
        super(imageView, attributeSet, i);
        this.f29956 = m22546(imageView, attributeSet, true);
        this.f29957 = m22546(imageView, attributeSet, false);
    }

    public C8714() {
        this.f29956 = 0;
        this.f29957 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22546(ImageView imageView, AttributeSet attributeSet, boolean z) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(Chip.NAMESPACE_ANDROID, z ? "src" : "background", 0);
        if (attributeResourceValue > 0) {
            if (C7302.f24237.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !C7302.m19454(imageView, z, attributeResourceValue)) {
                return attributeResourceValue;
            }
        }
        return 0;
    }
}
