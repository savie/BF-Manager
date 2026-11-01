package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;

/* JADX INFO: renamed from: l.֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0505 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f2194;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f2195;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f2196;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f2197;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f2198;

    public C0505(Context context, XmlResourceParser xmlResourceParser) {
        this.f2196 = Float.NaN;
        this.f2194 = Float.NaN;
        this.f2197 = Float.NaN;
        this.f2198 = Float.NaN;
        this.f2195 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C16029.f51888);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2195);
                this.f2195 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f2198 = typedArrayObtainStyledAttributes.getDimension(index, this.f2198);
            } else if (index == 2) {
                this.f2194 = typedArrayObtainStyledAttributes.getDimension(index, this.f2194);
            } else if (index == 3) {
                this.f2197 = typedArrayObtainStyledAttributes.getDimension(index, this.f2197);
            } else if (index == 4) {
                this.f2196 = typedArrayObtainStyledAttributes.getDimension(index, this.f2196);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2393(float f, float f2) {
        float f3 = this.f2196;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f2194;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f2197;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f2198;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
