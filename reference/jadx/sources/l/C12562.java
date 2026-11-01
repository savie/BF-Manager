package l;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V51X */
/* JADX INFO: loaded from: classes3.dex */
public class C12562 extends CompoundButton {
    public static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    public static final int MONOSPACE = 3;
    public static final int SANS = 1;
    public static final int SERIF = 2;
    public static final int THUMB_ANIMATION_DURATION = 250;
    public static final int TOUCH_MODE_DOWN = 1;
    public static final int TOUCH_MODE_DRAGGING = 2;
    public static final int TOUCH_MODE_IDLE = 0;
    public C3058 mAppCompatEmojiTextHelper;
    public C16795 mEmojiCompatInitCallback;
    public boolean mEnforceSwitchWidth;
    public boolean mHasThumbTint;
    public boolean mHasThumbTintMode;
    public boolean mHasTrackTint;
    public boolean mHasTrackTintMode;
    public int mMinFlingVelocity;
    public Layout mOffLayout;
    public Layout mOnLayout;
    public ObjectAnimator mPositionAnimator;
    public boolean mShowText;
    public boolean mSplitTrack;
    public int mSwitchBottom;
    public int mSwitchHeight;
    public int mSwitchLeft;
    public int mSwitchMinWidth;
    public int mSwitchPadding;
    public int mSwitchRight;
    public int mSwitchTop;
    public TransformationMethod mSwitchTransformationMethod;
    public int mSwitchWidth;
    public final Rect mTempRect;
    public ColorStateList mTextColors;
    public final C4717 mTextHelper;
    public CharSequence mTextOff;
    public CharSequence mTextOffTransformed;
    public CharSequence mTextOn;
    public CharSequence mTextOnTransformed;
    public final TextPaint mTextPaint;
    public Drawable mThumbDrawable;
    public float mThumbPosition;
    public int mThumbTextPadding;
    public ColorStateList mThumbTintList;
    public PorterDuff.Mode mThumbTintMode;
    public int mThumbWidth;
    public int mTouchMode;
    public int mTouchSlop;
    public float mTouchX;
    public float mTouchY;
    public Drawable mTrackDrawable;
    public ColorStateList mTrackTintList;
    public PorterDuff.Mode mTrackTintMode;
    public VelocityTracker mVelocityTracker;
    public static final Property THUMB_POS = new C0566(Float.class, "thumbPos");
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m31252(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public C12562(Context context) {
        this(context, null);
    }

    public C12562(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public C12562(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        C17500.m40762(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C12108.f40530;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        C5031.m13983(this, context, iArr, attributeSet, c1977M6353.m6382(), i);
        Drawable drawableM6370 = c1977M6353.m6370(2);
        this.mThumbDrawable = drawableM6370;
        if (drawableM6370 != null) {
            drawableM6370.setCallback(this);
        }
        Drawable drawableM6371 = c1977M6353.m6370(11);
        this.mTrackDrawable = drawableM6371;
        if (drawableM6371 != null) {
            drawableM6371.setCallback(this);
        }
        m31250(c1977M6353.m6368(0));
        m31262(c1977M6353.m6368(1));
        this.mShowText = c1977M6353.m6376(3, true);
        this.mThumbTextPadding = c1977M6353.m6384(8, 0);
        this.mSwitchMinWidth = c1977M6353.m6384(5, 0);
        this.mSwitchPadding = c1977M6353.m6384(6, 0);
        this.mSplitTrack = c1977M6353.m6376(4, false);
        ColorStateList colorStateListM6385 = c1977M6353.m6385(9);
        if (colorStateListM6385 != null) {
            this.mThumbTintList = colorStateListM6385;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode modeM47119 = C20946.m47119(c1977M6353.m6381(10, -1), null);
        if (this.mThumbTintMode != modeM47119) {
            this.mThumbTintMode = modeM47119;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            m31254();
        }
        ColorStateList colorStateListM6386 = c1977M6353.m6385(12);
        if (colorStateListM6386 != null) {
            this.mTrackTintList = colorStateListM6386;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode modeM471110 = C20946.m47119(c1977M6353.m6381(13, -1), null);
        if (this.mTrackTintMode != modeM471110) {
            this.mTrackTintMode = modeM471110;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            m31265();
        }
        int iM6387 = c1977M6353.m6387(7, 0);
        if (iM6387 != 0) {
            setSwitchTextAppearance(context, iM6387);
        }
        C4717 c4717 = new C4717(this);
        this.mTextHelper = c4717;
        c4717.m13067(attributeSet, i);
        c1977M6353.m6379();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        m31249().m9165(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTextAppearance(Context context, int i) {
        C1977 c1977M6351 = C1977.m6351(context, i, C12108.f40525);
        ColorStateList colorStateListM6385 = c1977M6351.m6385(3);
        if (colorStateListM6385 != null) {
            this.mTextColors = colorStateListM6385;
        } else {
            this.mTextColors = getTextColors();
        }
        int iM6384 = c1977M6351.m6384(0, 0);
        if (iM6384 != 0) {
            float f = iM6384;
            if (f != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f);
                requestLayout();
            }
        }
        m31255(c1977M6351.m6381(1, -1), c1977M6351.m6381(2, -1));
        if (c1977M6351.m6376(14, false)) {
            this.mSwitchTransformationMethod = new C19828(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        m31250(this.mTextOn);
        m31262(this.mTextOff);
        c1977M6351.m6379();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31255(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i2);
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (i > 0) {
            if (typeface == null) {
                typefaceCreate = Typeface.defaultFromStyle(i);
            } else {
                typefaceCreate = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typefaceCreate);
            int i2 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & i;
            this.mTextPaint.setFakeBoldText((i2 & 1) != 0);
            this.mTextPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public void setSwitchMinWidth(int i) {
        this.mSwitchMinWidth = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public void setThumbTextPadding(int i) {
        this.mThumbTextPadding = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C15945.m37904(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        m31265();
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        m31265();
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m31265() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable drawableMutate = C7603.m20139(drawable).mutate();
                this.mTrackDrawable = drawableMutate;
                if (this.mHasTrackTint) {
                    C7603.m20129(drawableMutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    C7603.m20132(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C15945.m37904(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        m31254();
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        m31254();
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31254() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable drawableMutate = C7603.m20139(drawable).mutate();
                this.mThumbDrawable = drawableMutate;
                if (this.mHasThumbTint) {
                    C7603.m20129(drawableMutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    C7603.m20132(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m31250(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = m31253(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            m31260();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        m31250(charSequence);
        requestLayout();
        if (isChecked()) {
            m31251();
        }
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m31262(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = m31253(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            m31260();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        m31262(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m31263();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private CharSequence m31253(CharSequence charSequence) {
        TransformationMethod transformationMethodM9164 = m31249().m9164(this.mSwitchTransformationMethod);
        return transformationMethodM9164 != null ? transformationMethodM9164.getTransformation(charSequence, this) : charSequence;
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
            if (z) {
                m31260();
            }
        }
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int iMax2;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = m31264(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = m31264(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.mShowText) {
            iMax = (this.mThumbTextPadding * 2) + Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth());
        } else {
            iMax = 0;
        }
        this.mThumbWidth = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax3 = rect.left;
        int iMax4 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect rectM47121 = C20946.m47121(drawable3);
            iMax3 = Math.max(iMax3, rectM47121.left);
            iMax4 = Math.max(iMax4, rectM47121.right);
        }
        if (this.mEnforceSwitchWidth) {
            iMax2 = Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + iMax3 + iMax4);
        } else {
            iMax2 = this.mSwitchMinWidth;
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.mSwitchWidth = iMax2;
        this.mSwitchHeight = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Layout m31264(CharSequence charSequence) {
        TextPaint textPaint = this.mTextPaint;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m31258(float f, float f2) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int iM31267 = m31267();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = this.mSwitchTop;
        int i2 = this.mTouchSlop;
        int i3 = i - i2;
        int i4 = (this.mSwitchLeft + iM31267) - i2;
        int i5 = this.mThumbWidth + i4;
        Rect rect = this.mTempRect;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.mSwitchBottom + i2));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (isEnabled() && m31258(x, y)) {
                this.mTouchMode = 1;
                this.mTouchX = x;
                this.mTouchY = y;
            }
        } else if (actionMasked == 1) {
            if (this.mTouchMode == 2) {
                m31266(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            this.mVelocityTracker.clear();
        } else if (actionMasked == 2) {
            int i = this.mTouchMode;
            if (i == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.mTouchX) > this.mTouchSlop || Math.abs(y2 - this.mTouchY) > this.mTouchSlop) {
                    this.mTouchMode = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.mTouchX = x2;
                    this.mTouchY = y2;
                    return true;
                }
            } else if (i == 2) {
                float x3 = motionEvent.getX();
                int iM31248 = m31248();
                float f2 = x3 - this.mTouchX;
                if (iM31248 != 0) {
                    f = f2 / iM31248;
                } else {
                    f = f2 > 0.0f ? 1.0f : -1.0f;
                }
                int i2 = C20344.f65886;
                if (getLayoutDirection() == 1) {
                    f = -f;
                }
                float fM31252 = m31252(this.mThumbPosition + f, 0.0f, 1.0f);
                if (fM31252 != this.mThumbPosition) {
                    this.mTouchX = x3;
                    setThumbPosition(fM31252);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.mTouchMode == 2) {
                m31266(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            this.mVelocityTracker.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31256(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m31266(MotionEvent motionEvent) {
        this.mTouchMode = 0;
        boolean zM31259 = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) > this.mMinFlingVelocity) {
                int i = C20344.f65886;
                if (getLayoutDirection() != 1 ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    zM31259 = false;
                }
            } else {
                zM31259 = m31259();
            }
        } else {
            zM31259 = zIsChecked;
        }
        if (zM31259 != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(zM31259);
        m31256(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31257(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C12562, Float>) THUMB_POS, z ? 1.0f : 0.0f);
        this.mPositionAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m31261() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m31259() {
        return this.mThumbPosition > 0.5f;
    }

    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            m31251();
        } else {
            m31263();
        }
        if (getWindowToken() != null && isLaidOut()) {
            m31257(zIsChecked);
        } else {
            m31261();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM47121 = C20946.m47121(this.mThumbDrawable);
            iMax = Math.max(0, rectM47121.left - rect.left);
            iMax2 = Math.max(0, rectM47121.right - rect.right);
        } else {
            iMax = 0;
        }
        int i5 = C20344.f65886;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.mSwitchWidth + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.mSwitchWidth) + iMax + iMax2;
        }
        int gravity = getGravity() & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i6 = this.mSwitchHeight;
            int i7 = height2 - (i6 / 2);
            height = i6 + i7;
            paddingTop = i7;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.mSwitchHeight + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.mSwitchHeight;
        }
        this.mSwitchLeft = paddingLeft;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = height;
        this.mSwitchRight = width;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rectM47121;
        int i;
        int i2;
        Rect rect = this.mTempRect;
        int i3 = this.mSwitchLeft;
        int i4 = this.mSwitchTop;
        int i5 = this.mSwitchRight;
        int i6 = this.mSwitchBottom;
        int iM31267 = m31267() + i3;
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            rectM47121 = C20946.m47121(drawable);
        } else {
            rectM47121 = C20946.f68271;
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            iM31267 += i7;
            if (rectM47121 != null) {
                int i8 = rectM47121.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM47121.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM47121.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM47121.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.mTrackDrawable.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.mTrackDrawable.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = iM31267 - rect.left;
            int i16 = iM31267 + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C7603.m20128(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.mSwitchTop;
        int i2 = this.mSwitchBottom;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mSplitTrack && drawable2 != null) {
                Rect rectM47121 = C20946.m47121(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM47121.left;
                rect.right -= rectM47121.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                drawable.draw(canvas);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = m31259() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int i = C20344.f65886;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        int i = C20344.f65886;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m31267() {
        float f;
        int i = C20344.f65886;
        if (getLayoutDirection() == 1) {
            f = 1.0f - this.mThumbPosition;
        } else {
            f = this.mThumbPosition;
        }
        return (int) ((f * m31248()) + 0.5f);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m31248() {
        Rect rectM47121;
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            rectM47121 = C20946.m47121(drawable2);
        } else {
            rectM47121 = C20946.f68271;
        }
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - rectM47121.left) - rectM47121.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            C7603.m20127(drawable, f, f2);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            C7603.m20127(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C16407.m38619(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C16407.m38618(super.getCustomSelectionActionModeCallback());
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.mEnforceSwitchWidth = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m31251() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.mTextOn;
            if (string == null) {
                string = getResources().getString(bin.mt.plus.R.string.MT_Protector);
            }
            C5031.m13997(this, string);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m31263() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.mTextOff;
            if (string == null) {
                string = getResources().getString(bin.mt.plus.R.string.MT_Protector);
            }
            C5031.m13997(this, string);
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m31249().m9166(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m31249().m9168(inputFilterArr));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C3058 m31249() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C3058(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    public void setEmojiCompatEnabled(boolean z) {
        m31249().m9169(z);
        m31250(this.mTextOn);
        m31262(this.mTextOff);
        requestLayout();
    }

    public boolean isEmojiCompatEnabled() {
        return m31249().m9167();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m31260() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.m9167() && C12817.m31812()) {
            C12817 c12817M31807 = C12817.m31807();
            int iM31814 = c12817M31807.m31814();
            if (iM31814 == 3 || iM31814 == 0) {
                C16795 c16795 = new C16795(this);
                this.mEmojiCompatInitCallback = c16795;
                c12817M31807.m31818(c16795);
            }
        }
    }

    public void onEmojiCompatInitializedForSwitchText() {
        m31250(this.mTextOn);
        m31262(this.mTextOff);
        requestLayout();
    }
}
