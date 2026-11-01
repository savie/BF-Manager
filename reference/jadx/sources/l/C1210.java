package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1210 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f5330;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5331;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f5332;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f5333;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18144 f5334;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f5335;

    public C1210(Context context, XmlResourceParser xmlResourceParser) {
        this.f5335 = Float.NaN;
        this.f5332 = Float.NaN;
        this.f5330 = Float.NaN;
        this.f5333 = Float.NaN;
        this.f5331 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C16029.f51888);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5331);
                this.f5331 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C18144 c18144 = new C18144();
                    this.f5334 = c18144;
                    c18144.m42253((C5444) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f5333 = typedArrayObtainStyledAttributes.getDimension(index, this.f5333);
            } else if (index == 2) {
                this.f5332 = typedArrayObtainStyledAttributes.getDimension(index, this.f5332);
            } else if (index == 3) {
                this.f5330 = typedArrayObtainStyledAttributes.getDimension(index, this.f5330);
            } else if (index == 4) {
                this.f5335 = typedArrayObtainStyledAttributes.getDimension(index, this.f5335);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4403(float f, float f2) {
        float f3 = this.f5335;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f5332;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f5330;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f5333;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
