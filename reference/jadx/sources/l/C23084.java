package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23084 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f75002;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f75003;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f75004;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75005;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f75006;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f75007;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f75008;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f75009;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51081(C23084 c23084) {
        this.f75008 = c23084.f75008;
        this.f75005 = c23084.f75005;
        this.f75003 = c23084.f75003;
        this.f75006 = c23084.f75006;
        this.f75007 = c23084.f75007;
        this.f75009 = c23084.f75009;
        this.f75004 = c23084.f75004;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f75002 = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51080(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51894);
        this.f75008 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f75002.get(index)) {
                case 1:
                    this.f75009 = typedArrayObtainStyledAttributes.getFloat(index, this.f75009);
                    break;
                case 2:
                    this.f75006 = typedArrayObtainStyledAttributes.getInt(index, this.f75006);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f75003 = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f75003 = C23188.f75244[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f75007 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f75005 = C18144.m42238(typedArrayObtainStyledAttributes, index, this.f75005);
                    break;
                case 6:
                    this.f75004 = typedArrayObtainStyledAttributes.getFloat(index, this.f75004);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
