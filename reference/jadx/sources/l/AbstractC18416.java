package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18416 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f58683;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f58684;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f58685;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f58686;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f58687;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f58688;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f58689;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f58690;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ColorFilter f58691;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Drawable[] f58692;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f58693;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f58694;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f58695;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public SparseArray f58696;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7127 f58697;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f58698;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f58699;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f58700;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58701;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ColorStateList f58702;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f58703;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58704;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f58705;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f58706;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Rect f58707;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f58708;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f58709;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f58710;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f58711;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f58712;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f58713;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f58714;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Resources f58715;

    /* JADX INFO: renamed from: ۚ */
    public abstract void mo3328();

    public AbstractC18416(C9950 c9950, C7127 c7127, Resources resources) {
        Resources resources2;
        this.f58695 = false;
        this.f58708 = false;
        this.f58694 = true;
        this.f58711 = 0;
        this.f58704 = 0;
        this.f58697 = c7127;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = c9950 != null ? c9950.f58715 : null;
        }
        this.f58715 = resources2;
        int i = c9950 != null ? c9950.f58709 : 0;
        int i2 = C7833.f25766;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? DHParameters.DEFAULT_MINIMUM_LENGTH : i;
        this.f58709 = i;
        if (c9950 != null) {
            this.f58698 = c9950.f58698;
            this.f58687 = c9950.f58687;
            this.f58689 = true;
            this.f58701 = true;
            this.f58695 = c9950.f58695;
            this.f58708 = c9950.f58708;
            this.f58694 = c9950.f58694;
            this.f58699 = c9950.f58699;
            this.f58711 = c9950.f58711;
            this.f58704 = c9950.f58704;
            this.f58688 = c9950.f58688;
            this.f58691 = c9950.f58691;
            this.f58710 = c9950.f58710;
            this.f58702 = c9950.f58702;
            this.f58685 = c9950.f58685;
            this.f58683 = c9950.f58683;
            this.f58705 = c9950.f58705;
            if (c9950.f58709 == i) {
                if (c9950.f58684) {
                    this.f58707 = c9950.f58707 != null ? new Rect(c9950.f58707) : null;
                    this.f58684 = true;
                }
                if (c9950.f58686) {
                    this.f58693 = c9950.f58693;
                    this.f58714 = c9950.f58714;
                    this.f58712 = c9950.f58712;
                    this.f58703 = c9950.f58703;
                    this.f58686 = true;
                }
            }
            if (c9950.f58713) {
                this.f58690 = c9950.f58690;
                this.f58713 = true;
            }
            if (c9950.f58700) {
                this.f58700 = true;
            }
            Drawable[] drawableArr = c9950.f58692;
            this.f58692 = new Drawable[drawableArr.length];
            this.f58706 = c9950.f58706;
            SparseArray sparseArray = c9950.f58696;
            if (sparseArray != null) {
                this.f58696 = sparseArray.clone();
            } else {
                this.f58696 = new SparseArray(this.f58706);
            }
            int i3 = this.f58706;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f58696.put(i4, constantState);
                    } else {
                        this.f58692[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.f58692 = new Drawable[10];
        this.f58706 = 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f58698 | this.f58687;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42702(Drawable drawable) {
        int i = this.f58706;
        if (i >= this.f58692.length) {
            int i2 = i + 10;
            C9950 c9950 = (C9950) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = c9950.f58692;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            c9950.f58692 = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(c9950.f34010, 0, iArr, 0, i);
            c9950.f34010 = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f58697);
        this.f58692[i] = drawable;
        this.f58706++;
        this.f58687 = drawable.getChangingConfigurations() | this.f58687;
        this.f58713 = false;
        this.f58700 = false;
        this.f58707 = null;
        this.f58684 = false;
        this.f58686 = false;
        this.f58689 = false;
        return i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m42700() {
        SparseArray sparseArray = this.f58696;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f58696.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f58696.valueAt(i);
                Drawable[] drawableArr = this.f58692;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f58715);
                if (Build.VERSION.SDK_INT >= 23) {
                    C7603.m20134(drawableNewDrawable, this.f58699);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f58697);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f58696 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m42703(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f58692[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f58696;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f58696.valueAt(iIndexOfKey)).newDrawable(this.f58715);
        if (Build.VERSION.SDK_INT >= 23) {
            C7603.m20134(drawableNewDrawable, this.f58699);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f58697);
        this.f58692[i] = drawableMutate;
        this.f58696.removeAt(iIndexOfKey);
        if (this.f58696.size() == 0) {
            this.f58696 = null;
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42704(Resources.Theme theme) {
        if (theme != null) {
            m42700();
            int i = this.f58706;
            Drawable[] drawableArr = this.f58692;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && C7603.m20133(drawable)) {
                    C7603.m20130(drawableArr[i2], theme);
                    this.f58687 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                this.f58715 = resources;
                int i3 = C7833.f25766;
                int i4 = resources.getDisplayMetrics().densityDpi;
                if (i4 == 0) {
                    i4 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                }
                int i5 = this.f58709;
                this.f58709 = i4;
                if (i5 != i4) {
                    this.f58686 = false;
                    this.f58684 = false;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f58706;
        Drawable[] drawableArr = this.f58692;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (C7603.m20133(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f58696.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Rect m42706() {
        Rect rect = null;
        if (this.f58695) {
            return null;
        }
        Rect rect2 = this.f58707;
        if (rect2 != null || this.f58684) {
            return rect2;
        }
        m42700();
        Rect rect3 = new Rect();
        int i = this.f58706;
        Drawable[] drawableArr = this.f58692;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getPadding(rect3)) {
                if (rect == null) {
                    rect = new Rect(0, 0, 0, 0);
                }
                int i3 = rect3.left;
                if (i3 > rect.left) {
                    rect.left = i3;
                }
                int i4 = rect3.top;
                if (i4 > rect.top) {
                    rect.top = i4;
                }
                int i5 = rect3.right;
                if (i5 > rect.right) {
                    rect.right = i5;
                }
                int i6 = rect3.bottom;
                if (i6 > rect.bottom) {
                    rect.bottom = i6;
                }
            }
        }
        this.f58684 = true;
        this.f58707 = rect;
        return rect;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42707() {
        this.f58686 = true;
        m42700();
        int i = this.f58706;
        Drawable[] drawableArr = this.f58692;
        this.f58714 = -1;
        this.f58693 = -1;
        this.f58703 = 0;
        this.f58712 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f58693) {
                this.f58693 = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f58714) {
                this.f58714 = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f58712) {
                this.f58712 = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f58703) {
                this.f58703 = minimumHeight;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m42701() {
        if (this.f58713) {
            return this.f58690;
        }
        m42700();
        int i = this.f58706;
        Drawable[] drawableArr = this.f58692;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        this.f58690 = opacity;
        this.f58713 = true;
        return opacity;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42705() {
        if (this.f58689) {
            return this.f58701;
        }
        m42700();
        this.f58689 = true;
        int i = this.f58706;
        Drawable[] drawableArr = this.f58692;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getConstantState() == null) {
                this.f58701 = false;
                return false;
            }
        }
        this.f58701 = true;
        return true;
    }
}
