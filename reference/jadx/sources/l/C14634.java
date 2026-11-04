package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VR */
/* JADX INFO: loaded from: classes5.dex */
public class C14634 extends C11651 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public float f47882;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f47883;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public float f47884;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public float f47885;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public float f47886;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f47887;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public float f47888;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public float f47889;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public float f47890;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public float f47891;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public float f47892;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public float f47893;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public float f47894;

    public C14634() {
        super(-2);
        this.f47883 = 1.0f;
        this.f47887 = false;
        this.f47886 = 0.0f;
        this.f47890 = 0.0f;
        this.f47884 = 0.0f;
        this.f47893 = 0.0f;
        this.f47888 = 1.0f;
        this.f47894 = 1.0f;
        this.f47892 = 0.0f;
        this.f47891 = 0.0f;
        this.f47889 = 0.0f;
        this.f47885 = 0.0f;
        this.f47882 = 0.0f;
    }

    public C14634(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47883 = 1.0f;
        this.f47887 = false;
        this.f47886 = 0.0f;
        this.f47890 = 0.0f;
        this.f47884 = 0.0f;
        this.f47893 = 0.0f;
        this.f47888 = 1.0f;
        this.f47894 = 1.0f;
        this.f47892 = 0.0f;
        this.f47891 = 0.0f;
        this.f47889 = 0.0f;
        this.f47885 = 0.0f;
        this.f47882 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1211.f4440);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                this.f47883 = typedArrayObtainStyledAttributes.getFloat(index, this.f47883);
            } else if (index == 28) {
                this.f47886 = typedArrayObtainStyledAttributes.getFloat(index, this.f47886);
                this.f47887 = true;
            } else if (index == 23) {
                this.f47884 = typedArrayObtainStyledAttributes.getFloat(index, this.f47884);
            } else if (index == 24) {
                this.f47893 = typedArrayObtainStyledAttributes.getFloat(index, this.f47893);
            } else if (index == 22) {
                this.f47890 = typedArrayObtainStyledAttributes.getFloat(index, this.f47890);
            } else if (index == 20) {
                this.f47888 = typedArrayObtainStyledAttributes.getFloat(index, this.f47888);
            } else if (index == 21) {
                this.f47894 = typedArrayObtainStyledAttributes.getFloat(index, this.f47894);
            } else if (index == 16) {
                this.f47892 = typedArrayObtainStyledAttributes.getFloat(index, this.f47892);
            } else if (index == 17) {
                this.f47891 = typedArrayObtainStyledAttributes.getFloat(index, this.f47891);
            } else if (index == 18) {
                this.f47889 = typedArrayObtainStyledAttributes.getFloat(index, this.f47889);
            } else if (index == 19) {
                this.f47885 = typedArrayObtainStyledAttributes.getFloat(index, this.f47885);
            } else if (index == 27) {
                this.f47882 = typedArrayObtainStyledAttributes.getFloat(index, this.f47882);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
