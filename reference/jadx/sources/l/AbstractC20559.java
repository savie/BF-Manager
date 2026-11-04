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

/* JADX INFO: renamed from: l.᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20559 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f65801;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14591 f65802;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f65803;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ColorStateList f65804;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f65805;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f65806;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65807;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f65808;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public SparseArray f65809;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f65810;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f65811;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f65812;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Resources f65813;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f65814;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f65815;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ColorFilter f65816;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f65817;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f65818;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65819;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f65820;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Rect f65821;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f65822;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f65823;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f65824;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f65825;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f65826;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f65827;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65828;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f65829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f65830;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f65831;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Drawable[] f65832;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f65833;

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo6582();

    public AbstractC20559(C4151 c4151, C14591 c14591, Resources resources) {
        Resources resources2;
        this.f65810 = false;
        this.f65831 = false;
        this.f65817 = true;
        this.f65806 = 0;
        this.f65819 = 0;
        this.f65802 = c14591;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = c4151 != null ? c4151.f65813 : null;
        }
        this.f65813 = resources2;
        int i = c4151 != null ? c4151.f65827 : 0;
        int i2 = C12354.f39671;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? DHParameters.DEFAULT_MINIMUM_LENGTH : i;
        this.f65827 = i;
        if (c4151 != null) {
            this.f65815 = c4151.f65815;
            this.f65803 = c4151.f65803;
            this.f65826 = true;
            this.f65829 = true;
            this.f65810 = c4151.f65810;
            this.f65831 = c4151.f65831;
            this.f65817 = c4151.f65817;
            this.f65811 = c4151.f65811;
            this.f65806 = c4151.f65806;
            this.f65819 = c4151.f65819;
            this.f65807 = c4151.f65807;
            this.f65816 = c4151.f65816;
            this.f65828 = c4151.f65828;
            this.f65804 = c4151.f65804;
            this.f65812 = c4151.f65812;
            this.f65824 = c4151.f65824;
            this.f65801 = c4151.f65801;
            if (c4151.f65827 == i) {
                if (c4151.f65818) {
                    this.f65821 = c4151.f65821 != null ? new Rect(c4151.f65821) : null;
                    this.f65818 = true;
                }
                if (c4151.f65830) {
                    this.f65805 = c4151.f65805;
                    this.f65833 = c4151.f65833;
                    this.f65823 = c4151.f65823;
                    this.f65822 = c4151.f65822;
                    this.f65830 = true;
                }
            }
            if (c4151.f65820) {
                this.f65814 = c4151.f65814;
                this.f65820 = true;
            }
            if (c4151.f65808) {
                this.f65808 = true;
            }
            Drawable[] drawableArr = c4151.f65832;
            this.f65832 = new Drawable[drawableArr.length];
            this.f65825 = c4151.f65825;
            SparseArray sparseArray = c4151.f65809;
            if (sparseArray != null) {
                this.f65809 = sparseArray.clone();
            } else {
                this.f65809 = new SparseArray(this.f65825);
            }
            int i3 = this.f65825;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f65809.put(i4, constantState);
                    } else {
                        this.f65832[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.f65832 = new Drawable[10];
        this.f65825 = 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f65815 | this.f65803;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47127(Drawable drawable) {
        int i = this.f65825;
        if (i >= this.f65832.length) {
            int i2 = i + 10;
            C4151 c4151 = (C4151) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = c4151.f65832;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            c4151.f65832 = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(c4151.f14105, 0, iArr, 0, i);
            c4151.f14105 = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f65802);
        this.f65832[i] = drawable;
        this.f65825++;
        this.f65803 = drawable.getChangingConfigurations() | this.f65803;
        this.f65820 = false;
        this.f65808 = false;
        this.f65821 = null;
        this.f65818 = false;
        this.f65830 = false;
        this.f65826 = false;
        return i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47126() {
        SparseArray sparseArray = this.f65809;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f65809.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f65809.valueAt(i);
                Drawable[] drawableArr = this.f65832;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f65813);
                if (Build.VERSION.SDK_INT >= 23) {
                    C0597.m2695(drawableNewDrawable, this.f65811);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f65802);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f65809 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m47128(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f65832[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f65809;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f65809.valueAt(iIndexOfKey)).newDrawable(this.f65813);
        if (Build.VERSION.SDK_INT >= 23) {
            C0597.m2695(drawableNewDrawable, this.f65811);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f65802);
        this.f65832[i] = drawableMutate;
        this.f65809.removeAt(iIndexOfKey);
        if (this.f65809.size() == 0) {
            this.f65809 = null;
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47129(Resources.Theme theme) {
        if (theme != null) {
            m47126();
            int i = this.f65825;
            Drawable[] drawableArr = this.f65832;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && C0597.m2694(drawable)) {
                    C0597.m2691(drawableArr[i2], theme);
                    this.f65803 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                this.f65813 = resources;
                int i3 = C12354.f39671;
                int i4 = resources.getDisplayMetrics().densityDpi;
                if (i4 == 0) {
                    i4 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                }
                int i5 = this.f65827;
                this.f65827 = i4;
                if (i5 != i4) {
                    this.f65830 = false;
                    this.f65818 = false;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f65825;
        Drawable[] drawableArr = this.f65832;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (C0597.m2694(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f65809.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect m47131() {
        Rect rect = null;
        if (this.f65810) {
            return null;
        }
        Rect rect2 = this.f65821;
        if (rect2 != null || this.f65818) {
            return rect2;
        }
        m47126();
        Rect rect3 = new Rect();
        int i = this.f65825;
        Drawable[] drawableArr = this.f65832;
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
        this.f65818 = true;
        this.f65821 = rect;
        return rect;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47132() {
        this.f65830 = true;
        m47126();
        int i = this.f65825;
        Drawable[] drawableArr = this.f65832;
        this.f65833 = -1;
        this.f65805 = -1;
        this.f65822 = 0;
        this.f65823 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f65805) {
                this.f65805 = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f65833) {
                this.f65833 = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f65823) {
                this.f65823 = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f65822) {
                this.f65822 = minimumHeight;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m47133() {
        if (this.f65820) {
            return this.f65814;
        }
        m47126();
        int i = this.f65825;
        Drawable[] drawableArr = this.f65832;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        this.f65814 = opacity;
        this.f65820 = true;
        return opacity;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47130() {
        if (this.f65826) {
            return this.f65829;
        }
        m47126();
        this.f65826 = true;
        int i = this.f65825;
        Drawable[] drawableArr = this.f65832;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getConstantState() == null) {
                this.f65829 = false;
                return false;
            }
        }
        this.f65829 = true;
        return true;
    }
}
