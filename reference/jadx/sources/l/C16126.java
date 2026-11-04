package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52403;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f52404;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f52405;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f52406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4194 f52407;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f52408;

    public C16126(Context context, XmlResourceParser xmlResourceParser) {
        this.f52405 = Float.NaN;
        this.f52406 = Float.NaN;
        this.f52408 = Float.NaN;
        this.f52404 = Float.NaN;
        this.f52403 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1211.f4425);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f52403);
                this.f52403 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C4194 c4194 = new C4194();
                    this.f52407 = c4194;
                    c4194.m13397((C16872) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f52404 = typedArrayObtainStyledAttributes.getDimension(index, this.f52404);
            } else if (index == 2) {
                this.f52406 = typedArrayObtainStyledAttributes.getDimension(index, this.f52406);
            } else if (index == 3) {
                this.f52408 = typedArrayObtainStyledAttributes.getDimension(index, this.f52408);
            } else if (index == 4) {
                this.f52405 = typedArrayObtainStyledAttributes.getDimension(index, this.f52405);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38285(float f, float f2) {
        float f3 = this.f52405;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f52406;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f52408;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f52404;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
