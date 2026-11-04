package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85PM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14937 extends C3906 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f48771;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f48772;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public String f48773;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public String f48774;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public String f48775;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public Drawable f48776;

    public AbstractC14937(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30590, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f48772 = string;
        if (string == null) {
            this.f48772 = m12578();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f48775 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f48776 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f48773 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f48774 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f48771 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC14937(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC14937(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506.m8385(context, R.attr.MT_Protector, android.R.attr.dialogPreferenceStyle));
    }

    public AbstractC14937(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m35923() {
        return this.f48772;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final String m35919() {
        return this.f48775;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m35920() {
        return this.f48776;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final String m35922() {
        return this.f48773;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final String m35921() {
        return this.f48774;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int m35918() {
        return this.f48771;
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ֨ */
    public void mo12556() {
        m12590().m2332(this);
    }
}
