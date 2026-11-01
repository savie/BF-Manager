package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85PM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14071 extends C4751 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public String f46219;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public Drawable f46220;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public String f46221;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f46222;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f46223;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public String f46224;

    public AbstractC14071(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23528, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f46223 = string;
        if (string == null) {
            this.f46223 = m13158();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f46224 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f46220 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f46221 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f46219 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f46222 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC14071(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC14071(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12398.m30832(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    public AbstractC14071(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m34028() {
        return this.f46223;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final String m34031() {
        return this.f46224;
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m34027() {
        return this.f46220;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final String m34029() {
        return this.f46221;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final String m34030() {
        return this.f46219;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final int m34026() {
        return this.f46222;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ᩻ */
    public void mo8454() {
        m13176().m15452(this);
    }
}
