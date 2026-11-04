package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10971 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7221 f34653;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34654;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7221 f34655;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7221 f34656;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Typeface f34657;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7221 f34658;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7221 f34659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f34661;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7221 f34662;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17684 f34663;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7221 f34664;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34660 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f34665 = -1;

    public C10971(TextView textView) {
        this.f34661 = textView;
        this.f34663 = new C17684(textView);
    }

    /* JADX WARN: Code duplicated, block: B:213:0x0356  */
    /* JADX WARN: Code duplicated, block: B:215:0x035b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0364  */
    /* JADX WARN: Code duplicated, block: B:221:0x0369  */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27810(AttributeSet attributeSet, int i) {
        boolean z;
        String strM15661;
        boolean zM15654;
        boolean z2;
        ColorStateList colorStateListM15666;
        ColorStateList colorStateListM15667;
        ColorStateList colorStateListM15668;
        String strM15662;
        C8581 c8581;
        C8581 c8582;
        Drawable drawableM23072;
        float fM15665;
        int i2;
        int i3;
        int i4;
        TextView textView = this.f34661;
        Context context = textView.getContext();
        C8581 c8581M23071 = C8581.m23071();
        int[] iArr = C10401.f33058;
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, iArr, i, 0);
        C22666.m51088(textView, textView.getContext(), iArr, attributeSet, c5204M15649.m15658(), i);
        int iM15660 = c5204M15649.m15660(0, -1);
        if (c5204M15649.m15655(3)) {
            this.f34662 = m27799(context, c8581M23071, c5204M15649.m15660(3, 0));
        }
        if (c5204M15649.m15655(1)) {
            this.f34653 = m27799(context, c8581M23071, c5204M15649.m15660(1, 0));
        }
        if (c5204M15649.m15655(4)) {
            this.f34659 = m27799(context, c8581M23071, c5204M15649.m15660(4, 0));
        }
        if (c5204M15649.m15655(2)) {
            this.f34656 = m27799(context, c8581M23071, c5204M15649.m15660(2, 0));
        }
        if (c5204M15649.m15655(5)) {
            this.f34658 = m27799(context, c8581M23071, c5204M15649.m15660(5, 0));
        }
        if (c5204M15649.m15655(6)) {
            z = true;
            this.f34664 = m27799(context, c8581M23071, c5204M15649.m15660(6, 0));
        } else {
            z = true;
        }
        c5204M15649.m15664();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C10401.f33064;
        if (iM15660 != -1) {
            C5204 c5204M15647 = C5204.m15647(context, iM15660, iArr2);
            if (z3 || !c5204M15647.m15655(14)) {
                zM15654 = false;
                z2 = false;
            } else {
                zM15654 = c5204M15647.m15654(14, false);
                z2 = true;
            }
            m27800(context, c5204M15647);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 23) {
                colorStateListM15666 = c5204M15647.m15655(3) ? c5204M15647.m15666(3) : null;
                colorStateListM15667 = c5204M15647.m15655(4) ? c5204M15647.m15666(4) : null;
                if (c5204M15647.m15655(5)) {
                    colorStateListM15668 = c5204M15647.m15666(5);
                    i4 = 15;
                }
                if (c5204M15647.m15655(i4)) {
                    strM15662 = c5204M15647.m15661(i4);
                } else {
                    strM15662 = null;
                }
                if (i5 >= 26 || !c5204M15647.m15655(13)) {
                    strM15661 = null;
                } else {
                    strM15661 = c5204M15647.m15661(13);
                }
                c5204M15647.m15664();
            } else {
                colorStateListM15666 = null;
                colorStateListM15667 = null;
            }
            colorStateListM15668 = null;
            i4 = 15;
            if (c5204M15647.m15655(i4)) {
                strM15662 = c5204M15647.m15661(i4);
            } else {
                strM15662 = null;
            }
            if (i5 >= 26) {
                strM15661 = null;
            } else {
                strM15661 = null;
            }
            c5204M15647.m15664();
        } else {
            strM15661 = null;
            zM15654 = false;
            z2 = false;
            colorStateListM15666 = null;
            colorStateListM15667 = null;
            colorStateListM15668 = null;
            strM15662 = null;
        }
        C5204 c5204M156410 = C5204.m15649(context, attributeSet, iArr2, i, 0);
        if (!z3 && c5204M156410.m15655(14)) {
            zM15654 = c5204M156410.m15654(14, false);
            z2 = true;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 23) {
            if (c5204M156410.m15655(3)) {
                colorStateListM15666 = c5204M156410.m15666(3);
            }
            if (c5204M156410.m15655(4)) {
                colorStateListM15667 = c5204M156410.m15666(4);
            }
            if (c5204M156410.m15655(5)) {
                colorStateListM15668 = c5204M156410.m15666(5);
            }
        }
        ColorStateList colorStateList = colorStateListM15666;
        ColorStateList colorStateList2 = colorStateListM15667;
        String strM15663 = c5204M156410.m15655(15) ? c5204M156410.m15661(15) : strM15662;
        String strM15664 = (i6 < 26 || !c5204M156410.m15655(13)) ? strM15661 : c5204M156410.m15661(13);
        boolean z4 = z;
        if (i6 < 28 || !c5204M156410.m15655(0)) {
            c8581 = c8581M23071;
        } else {
            c8581 = c8581M23071;
            if (c5204M156410.m15665(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        m27800(context, c5204M156410);
        c5204M156410.m15664();
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView.setHintTextColor(colorStateList2);
        }
        if (colorStateListM15668 != null) {
            textView.setLinkTextColor(colorStateListM15668);
        }
        if (!z3 && z2) {
            m27812(zM15654);
        }
        Typeface typeface = this.f34657;
        if (typeface != null) {
            if (this.f34665 == -1) {
                textView.setTypeface(typeface, this.f34660);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strM15664 != null) {
            C5006.m15235(textView, strM15664);
        }
        if (strM15663 != null) {
            if (i6 >= 24) {
                C14196.m34486(textView, C14196.m34485(strM15663));
            } else {
                textView.setTextLocale(C7485.m20534(strM15663.split(",")[0]));
            }
        }
        C17684 c17684 = this.f34663;
        c17684.m41370(attributeSet, i);
        if (C19374.f62604 && c17684.m41374() != 0) {
            int[] iArrM41375 = c17684.m41375();
            if (iArrM41375.length > 0) {
                if (C5006.m15232(textView) != -1.0f) {
                    C5006.m15233(textView, c17684.m41372(), c17684.m41376(), c17684.m41377(), 0);
                } else {
                    C5006.m15234(textView, iArrM41375, 0);
                }
            }
        }
        C5204 c5204M15648 = C5204.m15648(context, attributeSet, C10401.f33068);
        int iM15661 = c5204M15648.m15660(8, -1);
        if (iM15661 != -1) {
            c8582 = c8581;
            drawableM23072 = c8582.m23072(context, iM15661);
        } else {
            c8582 = c8581;
            drawableM23072 = null;
        }
        int iM15662 = c5204M15648.m15660(13, -1);
        Drawable drawableM23073 = iM15662 != -1 ? c8582.m23072(context, iM15662) : null;
        int iM15663 = c5204M15648.m15660(9, -1);
        Drawable drawableM23074 = iM15663 != -1 ? c8582.m23072(context, iM15663) : null;
        int iM15664 = c5204M15648.m15660(6, -1);
        Drawable drawableM23075 = iM15664 != -1 ? c8582.m23072(context, iM15664) : null;
        int iM15665 = c5204M15648.m15660(10, -1);
        Drawable drawableM23076 = iM15665 != -1 ? c8582.m23072(context, iM15665) : null;
        int iM15666 = c5204M15648.m15660(7, -1);
        Drawable drawableM23077 = iM15666 != -1 ? c8582.m23072(context, iM15666) : null;
        if (drawableM23076 != null || drawableM23077 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM23076 == null) {
                drawableM23076 = compoundDrawablesRelative[0];
            }
            if (drawableM23073 == null) {
                drawableM23073 = compoundDrawablesRelative[z4 ? 1 : 0];
            }
            if (drawableM23077 == null) {
                drawableM23077 = compoundDrawablesRelative[2];
            }
            if (drawableM23075 == null) {
                drawableM23075 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM23076, drawableM23073, drawableM23077, drawableM23075);
        } else if (drawableM23072 != null || drawableM23073 != null || drawableM23074 != null || drawableM23075 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable != null || compoundDrawablesRelative2[2] != null) {
                if (drawableM23073 == null) {
                    drawableM23073 = compoundDrawablesRelative2[z4 ? 1 : 0];
                }
                if (drawableM23075 == null) {
                    drawableM23075 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM23073, compoundDrawablesRelative2[2], drawableM23075);
            } else {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM23072 == null) {
                    drawableM23072 = compoundDrawables[0];
                }
                if (drawableM23073 == null) {
                    drawableM23073 = compoundDrawables[z4 ? 1 : 0];
                }
                if (drawableM23074 == null) {
                    drawableM23074 = compoundDrawables[2];
                }
                if (drawableM23075 == null) {
                    drawableM23075 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM23072, drawableM23073, drawableM23074, drawableM23075);
            }
        }
        if (c5204M15648.m15655(11)) {
            C18085.m42121(textView, c5204M15648.m15666(11));
        }
        if (c5204M15648.m15655(12)) {
            C18085.m42122(textView, C21414.m48720(c5204M15648.m15657(12, -1), null));
        }
        int iM15667 = c5204M15648.m15665(15, -1);
        int iM15668 = c5204M15648.m15665(18, -1);
        if (c5204M15648.m15655(19)) {
            TypedValue typedValueM15670 = c5204M15648.m15670();
            if (typedValueM15670 != null && typedValueM15670.type == 5) {
                int i7 = typedValueM15670.data;
                i3 = i7 & 15;
                fM15665 = TypedValue.complexToFloat(i7);
                i2 = -1;
            } else {
                fM15665 = c5204M15648.m15665(19, -1);
            }
            c5204M15648.m15664();
            if (iM15667 != i2) {
                C18085.m42127(textView, iM15667);
            }
            if (iM15668 != i2) {
                C18085.m42125(textView, iM15668);
            }
            if (fM15665 != -1.0f) {
                if (i3 == i2) {
                    C18085.m42128(textView, (int) fM15665);
                } else {
                    C18085.m42120(textView, i3, fM15665);
                }
            }
        }
        fM15665 = -1.0f;
        i2 = -1;
        i3 = -1;
        c5204M15648.m15664();
        if (iM15667 != i2) {
            C18085.m42127(textView, iM15667);
        }
        if (iM15668 != i2) {
            C18085.m42125(textView, iM15668);
        }
        if (fM15665 != -1.0f) {
            if (i3 == i2) {
                C18085.m42128(textView, (int) fM15665);
            } else {
                C18085.m42120(textView, i3, fM15665);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27800(Context context, C5204 c5204) {
        String strM15661;
        this.f34660 = c5204.m15657(2, this.f34660);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM15657 = c5204.m15657(11, -1);
            this.f34665 = iM15657;
            if (iM15657 != -1) {
                this.f34660 &= 2;
            }
        }
        if (c5204.m15655(10) || c5204.m15655(12)) {
            this.f34657 = null;
            int i2 = c5204.m15655(12) ? 12 : 10;
            int i3 = this.f34665;
            int i4 = this.f34660;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceM15653 = c5204.m15653(i2, this.f34660, new C3010(this, i3, i4, new WeakReference(this.f34661)));
                    if (typefaceM15653 != null) {
                        if (i >= 28 && this.f34665 != -1) {
                            this.f34657 = C22160.m50123(Typeface.create(typefaceM15653, 0), this.f34665, (this.f34660 & 2) != 0);
                        } else {
                            this.f34657 = typefaceM15653;
                        }
                    }
                    this.f34654 = this.f34657 == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f34657 != null || (strM15661 = c5204.m15661(i2)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f34665 != -1) {
                this.f34657 = C22160.m50123(Typeface.create(strM15661, 0), this.f34665, (this.f34660 & 2) != 0);
                return;
            } else {
                this.f34657 = Typeface.create(strM15661, this.f34660);
                return;
            }
        }
        if (c5204.m15655(1)) {
            this.f34654 = false;
            int iM15658 = c5204.m15657(1, 1);
            if (iM15658 == 1) {
                this.f34657 = Typeface.SANS_SERIF;
            } else if (iM15658 == 2) {
                this.f34657 = Typeface.SERIF;
            } else {
                if (iM15658 != 3) {
                    return;
                }
                this.f34657 = Typeface.MONOSPACE;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27811(WeakReference weakReference, Typeface typeface) {
        if (this.f34654) {
            this.f34657 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC8976(textView, typeface, this.f34660));
                } else {
                    textView.setTypeface(typeface, this.f34660);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27807(Context context, int i) {
        String strM15661;
        ColorStateList colorStateListM15666;
        ColorStateList colorStateListM15667;
        ColorStateList colorStateListM15668;
        C5204 c5204M15647 = C5204.m15647(context, i, C10401.f33064);
        if (c5204M15647.m15655(14)) {
            m27812(c5204M15647.m15654(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        TextView textView = this.f34661;
        if (i2 < 23) {
            if (c5204M15647.m15655(3) && (colorStateListM15668 = c5204M15647.m15666(3)) != null) {
                textView.setTextColor(colorStateListM15668);
            }
            if (c5204M15647.m15655(5) && (colorStateListM15667 = c5204M15647.m15666(5)) != null) {
                textView.setLinkTextColor(colorStateListM15667);
            }
            if (c5204M15647.m15655(4) && (colorStateListM15666 = c5204M15647.m15666(4)) != null) {
                textView.setHintTextColor(colorStateListM15666);
            }
        }
        if (c5204M15647.m15655(0) && c5204M15647.m15665(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m27800(context, c5204M15647);
        if (i2 >= 26 && c5204M15647.m15655(13) && (strM15661 = c5204M15647.m15661(13)) != null) {
            C5006.m15235(textView, strM15661);
        }
        c5204M15647.m15664();
        Typeface typeface = this.f34657;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f34660);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27812(boolean z) {
        this.f34661.setAllCaps(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27803() {
        C7221 c7221 = this.f34662;
        TextView textView = this.f34661;
        if (c7221 != null || this.f34653 != null || this.f34659 != null || this.f34656 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m27801(compoundDrawables[0], this.f34662);
            m27801(compoundDrawables[1], this.f34653);
            m27801(compoundDrawables[2], this.f34659);
            m27801(compoundDrawables[3], this.f34656);
        }
        if (this.f34658 == null && this.f34664 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m27801(compoundDrawablesRelative[0], this.f34658);
        m27801(compoundDrawablesRelative[2], this.f34664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27801(Drawable drawable, C7221 c7221) {
        if (drawable == null || c7221 == null) {
            return;
        }
        int[] drawableState = this.f34661.getDrawableState();
        int i = C8581.f28059;
        C22884.m51611(drawable, c7221, drawableState);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7221 m27799(Context context, C8581 c8581, int i) {
        ColorStateList colorStateListM23074 = c8581.m23074(context, i);
        if (colorStateListM23074 == null) {
            return null;
        }
        C7221 c7221 = new C7221();
        c7221.f23816 = true;
        c7221.f23817 = colorStateListM23074;
        return c7221;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27805(int i, float f) {
        if (C19374.f62604) {
            return;
        }
        C17684 c17684 = this.f34663;
        if (c17684.m41373()) {
            return;
        }
        c17684.m41367(f, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27820() {
        this.f34663.m41366();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27816() {
        return this.f34663.m41373();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27804(int i) {
        this.f34663.m41368(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27806(int i, int i2, int i3, int i4) {
        this.f34663.m41369(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27813(int[] iArr, int i) {
        this.f34663.m41371(iArr, i);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m27817() {
        return this.f34663.m41374();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m27819() {
        return this.f34663.m41377();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m27821() {
        return this.f34663.m41372();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m27815() {
        return this.f34663.m41376();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] m27818() {
        return this.f34663.m41375();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m27814() {
        C7221 c7221 = this.f34655;
        if (c7221 != null) {
            return c7221.f23817;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27808(ColorStateList colorStateList) {
        if (this.f34655 == null) {
            this.f34655 = new C7221();
        }
        C7221 c7221 = this.f34655;
        c7221.f23817 = colorStateList;
        c7221.f23816 = colorStateList != null;
        this.f34662 = c7221;
        this.f34653 = c7221;
        this.f34659 = c7221;
        this.f34656 = c7221;
        this.f34658 = c7221;
        this.f34664 = c7221;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m27802() {
        C7221 c7221 = this.f34655;
        if (c7221 != null) {
            return c7221.f23819;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27809(PorterDuff.Mode mode) {
        if (this.f34655 == null) {
            this.f34655 = new C7221();
        }
        C7221 c7221 = this.f34655;
        c7221.f23819 = mode;
        c7221.f23818 = mode != null;
        this.f34662 = c7221;
        this.f34653 = c7221;
        this.f34659 = c7221;
        this.f34656 = c7221;
        this.f34658 = c7221;
        this.f34664 = c7221;
    }
}
