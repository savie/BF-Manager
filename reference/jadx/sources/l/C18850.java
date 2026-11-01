package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VR */
/* JADX INFO: loaded from: classes5.dex */
public class C18850 extends C11795 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public float f61053;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61054;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public float f61055;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public float f61056;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public float f61057;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public float f61058;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public float f61059;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public float f61060;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public float f61061;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public float f61062;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public float f61063;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public float f61064;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public float f61065;

    public C18850() {
        super(-2);
        this.f61064 = 1.0f;
        this.f61054 = false;
        this.f61060 = 0.0f;
        this.f61056 = 0.0f;
        this.f61058 = 0.0f;
        this.f61063 = 0.0f;
        this.f61061 = 1.0f;
        this.f61055 = 1.0f;
        this.f61059 = 0.0f;
        this.f61065 = 0.0f;
        this.f61053 = 0.0f;
        this.f61062 = 0.0f;
        this.f61057 = 0.0f;
    }

    public C18850(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61064 = 1.0f;
        this.f61054 = false;
        this.f61060 = 0.0f;
        this.f61056 = 0.0f;
        this.f61058 = 0.0f;
        this.f61063 = 0.0f;
        this.f61061 = 1.0f;
        this.f61055 = 1.0f;
        this.f61059 = 0.0f;
        this.f61065 = 0.0f;
        this.f61053 = 0.0f;
        this.f61062 = 0.0f;
        this.f61057 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51878);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                this.f61064 = typedArrayObtainStyledAttributes.getFloat(index, this.f61064);
            } else if (index == 28) {
                this.f61060 = typedArrayObtainStyledAttributes.getFloat(index, this.f61060);
                this.f61054 = true;
            } else if (index == 23) {
                this.f61058 = typedArrayObtainStyledAttributes.getFloat(index, this.f61058);
            } else if (index == 24) {
                this.f61063 = typedArrayObtainStyledAttributes.getFloat(index, this.f61063);
            } else if (index == 22) {
                this.f61056 = typedArrayObtainStyledAttributes.getFloat(index, this.f61056);
            } else if (index == 20) {
                this.f61061 = typedArrayObtainStyledAttributes.getFloat(index, this.f61061);
            } else if (index == 21) {
                this.f61055 = typedArrayObtainStyledAttributes.getFloat(index, this.f61055);
            } else if (index == 16) {
                this.f61059 = typedArrayObtainStyledAttributes.getFloat(index, this.f61059);
            } else if (index == 17) {
                this.f61065 = typedArrayObtainStyledAttributes.getFloat(index, this.f61065);
            } else if (index == 18) {
                this.f61053 = typedArrayObtainStyledAttributes.getFloat(index, this.f61053);
            } else if (index == 19) {
                this.f61062 = typedArrayObtainStyledAttributes.getFloat(index, this.f61062);
            } else if (index == 27) {
                this.f61057 = typedArrayObtainStyledAttributes.getFloat(index, this.f61057);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
