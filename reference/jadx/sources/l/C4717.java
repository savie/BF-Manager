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

/* JADX INFO: renamed from: l.ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4717 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23851 f16637;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23851 f16638;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23851 f16639;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16640;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23851 f16641;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Typeface f16642;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23851 f16643;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23851 f16644;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23063 f16645;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f16647;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23851 f16648;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f16646 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f16649 = -1;

    public C4717(TextView textView) {
        this.f16647 = textView;
        this.f16645 = new C23063(textView);
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
    public final void m13067(AttributeSet attributeSet, int i) {
        boolean z;
        String strM6388;
        boolean zM6376;
        boolean z2;
        ColorStateList colorStateListM6385;
        ColorStateList colorStateListM6386;
        ColorStateList colorStateListM6387;
        String strM6389;
        C23521 c23521;
        C23521 c23522;
        Drawable drawableM51804;
        float fM6384;
        int i2;
        int i3;
        int i4;
        TextView textView = this.f16647;
        Context context = textView.getContext();
        C23521 c23521M51803 = C23521.m51803();
        int[] iArr = C12108.f40514;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        C5031.m13983(textView, textView.getContext(), iArr, attributeSet, c1977M6353.m6382(), i);
        int iM6387 = c1977M6353.m6387(0, -1);
        if (c1977M6353.m6383(3)) {
            this.f16641 = m13054(context, c23521M51803, c1977M6353.m6387(3, 0));
        }
        if (c1977M6353.m6383(1)) {
            this.f16639 = m13054(context, c23521M51803, c1977M6353.m6387(1, 0));
        }
        if (c1977M6353.m6383(4)) {
            this.f16648 = m13054(context, c23521M51803, c1977M6353.m6387(4, 0));
        }
        if (c1977M6353.m6383(2)) {
            this.f16643 = m13054(context, c23521M51803, c1977M6353.m6387(2, 0));
        }
        if (c1977M6353.m6383(5)) {
            this.f16637 = m13054(context, c23521M51803, c1977M6353.m6387(5, 0));
        }
        if (c1977M6353.m6383(6)) {
            z = true;
            this.f16638 = m13054(context, c23521M51803, c1977M6353.m6387(6, 0));
        } else {
            z = true;
        }
        c1977M6353.m6379();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C12108.f40525;
        if (iM6387 != -1) {
            C1977 c1977M6351 = C1977.m6351(context, iM6387, iArr2);
            if (z3 || !c1977M6351.m6383(14)) {
                zM6376 = false;
                z2 = false;
            } else {
                zM6376 = c1977M6351.m6376(14, false);
                z2 = true;
            }
            m13055(context, c1977M6351);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 23) {
                colorStateListM6385 = c1977M6351.m6383(3) ? c1977M6351.m6385(3) : null;
                colorStateListM6386 = c1977M6351.m6383(4) ? c1977M6351.m6385(4) : null;
                if (c1977M6351.m6383(5)) {
                    colorStateListM6387 = c1977M6351.m6385(5);
                    i4 = 15;
                }
                if (c1977M6351.m6383(i4)) {
                    strM6389 = c1977M6351.m6388(i4);
                } else {
                    strM6389 = null;
                }
                if (i5 >= 26 || !c1977M6351.m6383(13)) {
                    strM6388 = null;
                } else {
                    strM6388 = c1977M6351.m6388(13);
                }
                c1977M6351.m6379();
            } else {
                colorStateListM6385 = null;
                colorStateListM6386 = null;
            }
            colorStateListM6387 = null;
            i4 = 15;
            if (c1977M6351.m6383(i4)) {
                strM6389 = c1977M6351.m6388(i4);
            } else {
                strM6389 = null;
            }
            if (i5 >= 26) {
                strM6388 = null;
            } else {
                strM6388 = null;
            }
            c1977M6351.m6379();
        } else {
            strM6388 = null;
            zM6376 = false;
            z2 = false;
            colorStateListM6385 = null;
            colorStateListM6386 = null;
            colorStateListM6387 = null;
            strM6389 = null;
        }
        C1977 c1977M6354 = C1977.m6353(context, attributeSet, iArr2, i, 0);
        if (!z3 && c1977M6354.m6383(14)) {
            zM6376 = c1977M6354.m6376(14, false);
            z2 = true;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 23) {
            if (c1977M6354.m6383(3)) {
                colorStateListM6385 = c1977M6354.m6385(3);
            }
            if (c1977M6354.m6383(4)) {
                colorStateListM6386 = c1977M6354.m6385(4);
            }
            if (c1977M6354.m6383(5)) {
                colorStateListM6387 = c1977M6354.m6385(5);
            }
        }
        ColorStateList colorStateList = colorStateListM6385;
        ColorStateList colorStateList2 = colorStateListM6386;
        String strM63810 = c1977M6354.m6383(15) ? c1977M6354.m6388(15) : strM6389;
        String strM63811 = (i6 < 26 || !c1977M6354.m6383(13)) ? strM6388 : c1977M6354.m6388(13);
        boolean z4 = z;
        if (i6 < 28 || !c1977M6354.m6383(0)) {
            c23521 = c23521M51803;
        } else {
            c23521 = c23521M51803;
            if (c1977M6354.m6384(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        m13055(context, c1977M6354);
        c1977M6354.m6379();
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView.setHintTextColor(colorStateList2);
        }
        if (colorStateListM6387 != null) {
            textView.setLinkTextColor(colorStateListM6387);
        }
        if (!z3 && z2) {
            m13069(zM6376);
        }
        Typeface typeface = this.f16642;
        if (typeface != null) {
            if (this.f16649 == -1) {
                textView.setTypeface(typeface, this.f16646);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (strM63811 != null) {
            C9887.m25029(textView, strM63811);
        }
        if (strM63810 != null) {
            if (i6 >= 24) {
                C2124.m6679(textView, C2124.m6678(strM63810));
            } else {
                textView.setTextLocale(C14826.m35508(strM63810.split(",")[0]));
            }
        }
        C23063 c23063 = this.f16645;
        c23063.m51027(attributeSet, i);
        if (C20344.f65888 && c23063.m51032() != 0) {
            int[] iArrM51029 = c23063.m51029();
            if (iArrM51029.length > 0) {
                if (C9887.m25026(textView) != -1.0f) {
                    C9887.m25027(textView, c23063.m51030(), c23063.m51031(), c23063.m51022(), 0);
                } else {
                    C9887.m25028(textView, iArrM51029, 0);
                }
            }
        }
        C1977 c1977M6352 = C1977.m6352(context, attributeSet, C12108.f40518);
        int iM6388 = c1977M6352.m6387(8, -1);
        if (iM6388 != -1) {
            c23522 = c23521;
            drawableM51804 = c23522.m51804(context, iM6388);
        } else {
            c23522 = c23521;
            drawableM51804 = null;
        }
        int iM6389 = c1977M6352.m6387(13, -1);
        Drawable drawableM51805 = iM6389 != -1 ? c23522.m51804(context, iM6389) : null;
        int iM63810 = c1977M6352.m6387(9, -1);
        Drawable drawableM51806 = iM63810 != -1 ? c23522.m51804(context, iM63810) : null;
        int iM63811 = c1977M6352.m6387(6, -1);
        Drawable drawableM51807 = iM63811 != -1 ? c23522.m51804(context, iM63811) : null;
        int iM63812 = c1977M6352.m6387(10, -1);
        Drawable drawableM51808 = iM63812 != -1 ? c23522.m51804(context, iM63812) : null;
        int iM63813 = c1977M6352.m6387(7, -1);
        Drawable drawableM51809 = iM63813 != -1 ? c23522.m51804(context, iM63813) : null;
        if (drawableM51808 != null || drawableM51809 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM51808 == null) {
                drawableM51808 = compoundDrawablesRelative[0];
            }
            if (drawableM51805 == null) {
                drawableM51805 = compoundDrawablesRelative[z4 ? 1 : 0];
            }
            if (drawableM51809 == null) {
                drawableM51809 = compoundDrawablesRelative[2];
            }
            if (drawableM51807 == null) {
                drawableM51807 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM51808, drawableM51805, drawableM51809, drawableM51807);
        } else if (drawableM51804 != null || drawableM51805 != null || drawableM51806 != null || drawableM51807 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable != null || compoundDrawablesRelative2[2] != null) {
                if (drawableM51805 == null) {
                    drawableM51805 = compoundDrawablesRelative2[z4 ? 1 : 0];
                }
                if (drawableM51807 == null) {
                    drawableM51807 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM51805, compoundDrawablesRelative2[2], drawableM51807);
            } else {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM51804 == null) {
                    drawableM51804 = compoundDrawables[0];
                }
                if (drawableM51805 == null) {
                    drawableM51805 = compoundDrawables[z4 ? 1 : 0];
                }
                if (drawableM51806 == null) {
                    drawableM51806 = compoundDrawables[2];
                }
                if (drawableM51807 == null) {
                    drawableM51807 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM51804, drawableM51805, drawableM51806, drawableM51807);
            }
        }
        if (c1977M6352.m6383(11)) {
            C16407.m38623(textView, c1977M6352.m6385(11));
        }
        if (c1977M6352.m6383(12)) {
            C16407.m38624(textView, C20946.m47119(c1977M6352.m6381(12, -1), null));
        }
        int iM6384 = c1977M6352.m6384(15, -1);
        int iM6385 = c1977M6352.m6384(18, -1);
        if (c1977M6352.m6383(19)) {
            TypedValue typedValueM6371 = c1977M6352.m6371();
            if (typedValueM6371 != null && typedValueM6371.type == 5) {
                int i7 = typedValueM6371.data;
                i3 = i7 & 15;
                fM6384 = TypedValue.complexToFloat(i7);
                i2 = -1;
            } else {
                fM6384 = c1977M6352.m6384(19, -1);
            }
            c1977M6352.m6379();
            if (iM6384 != i2) {
                C16407.m38621(textView, iM6384);
            }
            if (iM6385 != i2) {
                C16407.m38628(textView, iM6385);
            }
            if (fM6384 != -1.0f) {
                if (i3 == i2) {
                    C16407.m38627(textView, (int) fM6384);
                } else {
                    C16407.m38622(textView, i3, fM6384);
                }
            }
        }
        fM6384 = -1.0f;
        i2 = -1;
        i3 = -1;
        c1977M6352.m6379();
        if (iM6384 != i2) {
            C16407.m38621(textView, iM6384);
        }
        if (iM6385 != i2) {
            C16407.m38628(textView, iM6385);
        }
        if (fM6384 != -1.0f) {
            if (i3 == i2) {
                C16407.m38627(textView, (int) fM6384);
            } else {
                C16407.m38622(textView, i3, fM6384);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13055(Context context, C1977 c1977) {
        String strM6388;
        this.f16646 = c1977.m6381(2, this.f16646);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM6381 = c1977.m6381(11, -1);
            this.f16649 = iM6381;
            if (iM6381 != -1) {
                this.f16646 &= 2;
            }
        }
        if (c1977.m6383(10) || c1977.m6383(12)) {
            this.f16642 = null;
            int i2 = c1977.m6383(12) ? 12 : 10;
            int i3 = this.f16649;
            int i4 = this.f16646;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceM6375 = c1977.m6375(i2, this.f16646, new C11298(this, i3, i4, new WeakReference(this.f16647)));
                    if (typefaceM6375 != null) {
                        if (i >= 28 && this.f16649 != -1) {
                            this.f16642 = C3535.m10418(Typeface.create(typefaceM6375, 0), this.f16649, (this.f16646 & 2) != 0);
                        } else {
                            this.f16642 = typefaceM6375;
                        }
                    }
                    this.f16640 = this.f16642 == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f16642 != null || (strM6388 = c1977.m6388(i2)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f16649 != -1) {
                this.f16642 = C3535.m10418(Typeface.create(strM6388, 0), this.f16649, (this.f16646 & 2) != 0);
                return;
            } else {
                this.f16642 = Typeface.create(strM6388, this.f16646);
                return;
            }
        }
        if (c1977.m6383(1)) {
            this.f16640 = false;
            int iM6382 = c1977.m6381(1, 1);
            if (iM6382 == 1) {
                this.f16642 = Typeface.SANS_SERIF;
            } else if (iM6382 == 2) {
                this.f16642 = Typeface.SERIF;
            } else {
                if (iM6382 != 3) {
                    return;
                }
                this.f16642 = Typeface.MONOSPACE;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13068(WeakReference weakReference, Typeface typeface) {
        if (this.f16640) {
            this.f16642 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC23998(textView, typeface, this.f16646));
                } else {
                    textView.setTypeface(typeface, this.f16646);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13064(Context context, int i) {
        String strM6388;
        ColorStateList colorStateListM6385;
        ColorStateList colorStateListM6386;
        ColorStateList colorStateListM6387;
        C1977 c1977M6351 = C1977.m6351(context, i, C12108.f40525);
        if (c1977M6351.m6383(14)) {
            m13069(c1977M6351.m6376(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        TextView textView = this.f16647;
        if (i2 < 23) {
            if (c1977M6351.m6383(3) && (colorStateListM6387 = c1977M6351.m6385(3)) != null) {
                textView.setTextColor(colorStateListM6387);
            }
            if (c1977M6351.m6383(5) && (colorStateListM6386 = c1977M6351.m6385(5)) != null) {
                textView.setLinkTextColor(colorStateListM6386);
            }
            if (c1977M6351.m6383(4) && (colorStateListM6385 = c1977M6351.m6385(4)) != null) {
                textView.setHintTextColor(colorStateListM6385);
            }
        }
        if (c1977M6351.m6383(0) && c1977M6351.m6384(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m13055(context, c1977M6351);
        if (i2 >= 26 && c1977M6351.m6383(13) && (strM6388 = c1977M6351.m6388(13)) != null) {
            C9887.m25029(textView, strM6388);
        }
        c1977M6351.m6379();
        Typeface typeface = this.f16642;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f16646);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13069(boolean z) {
        this.f16647.setAllCaps(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13060() {
        C23851 c23851 = this.f16641;
        TextView textView = this.f16647;
        if (c23851 != null || this.f16639 != null || this.f16648 != null || this.f16643 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m13056(compoundDrawables[0], this.f16641);
            m13056(compoundDrawables[1], this.f16639);
            m13056(compoundDrawables[2], this.f16648);
            m13056(compoundDrawables[3], this.f16643);
        }
        if (this.f16637 == null && this.f16638 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m13056(compoundDrawablesRelative[0], this.f16637);
        m13056(compoundDrawablesRelative[2], this.f16638);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13056(Drawable drawable, C23851 c23851) {
        if (drawable == null || c23851 == null) {
            return;
        }
        int[] drawableState = this.f16647.getDrawableState();
        int i = C23521.f76123;
        C4800.m13325(drawable, c23851, drawableState);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23851 m13054(Context context, C23521 c23521, int i) {
        ColorStateList colorStateListM51806 = c23521.m51806(context, i);
        if (colorStateListM51806 == null) {
            return null;
        }
        C23851 c23851 = new C23851();
        c23851.f77106 = true;
        c23851.f77107 = colorStateListM51806;
        return c23851;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13062(int i, float f) {
        if (C20344.f65888) {
            return;
        }
        C23063 c23063 = this.f16645;
        if (c23063.m51021()) {
            return;
        }
        c23063.m51024(f, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13075() {
        this.f16645.m51023();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m13072() {
        return this.f16645.m51021();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13061(int i) {
        this.f16645.m51025(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13063(int i, int i2, int i3, int i4) {
        this.f16645.m51026(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13070(int[] iArr, int i) {
        this.f16645.m51028(iArr, i);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m13057() {
        return this.f16645.m51032();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m13071() {
        return this.f16645.m51022();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m13058() {
        return this.f16645.m51030();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m13073() {
        return this.f16645.m51031();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] m13076() {
        return this.f16645.m51029();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ColorStateList m13074() {
        C23851 c23851 = this.f16644;
        if (c23851 != null) {
            return c23851.f77107;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13065(ColorStateList colorStateList) {
        if (this.f16644 == null) {
            this.f16644 = new C23851();
        }
        C23851 c23851 = this.f16644;
        c23851.f77107 = colorStateList;
        c23851.f77106 = colorStateList != null;
        this.f16641 = c23851;
        this.f16639 = c23851;
        this.f16648 = c23851;
        this.f16643 = c23851;
        this.f16637 = c23851;
        this.f16638 = c23851;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m13059() {
        C23851 c23851 = this.f16644;
        if (c23851 != null) {
            return c23851.f77105;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13066(PorterDuff.Mode mode) {
        if (this.f16644 == null) {
            this.f16644 = new C23851();
        }
        C23851 c23851 = this.f16644;
        c23851.f77105 = mode;
        c23851.f77108 = mode != null;
        this.f16641 = c23851;
        this.f16639 = c23851;
        this.f16648 = c23851;
        this.f16643 = c23851;
        this.f16637 = c23851;
        this.f16638 = c23851;
    }
}
