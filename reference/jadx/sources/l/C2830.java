package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A4X8 */
/* JADX INFO: loaded from: classes2.dex */
public class C2830 extends ImageView {
    public final C19993 mBackgroundTintHelper;
    public boolean mHasLevel;
    public final C12004 mImageHelper;

    public C2830(Context context) {
        this(context, null);
    }

    public C2830(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2830(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11151.m28072(context);
        this.mHasLevel = false;
        C17500.m40762(getContext(), this);
        C19993 c19993 = new C19993(this);
        this.mBackgroundTintHelper = c19993;
        c19993.m45278(attributeSet, i);
        C12004 c12004 = new C12004(this);
        this.mImageHelper = c12004;
        c12004.m29900(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null) {
            c12004.m29896(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null && drawable != null && !this.mHasLevel) {
            c12004.m29899(drawable);
        }
        super.setImageDrawable(drawable);
        C12004 c12005 = this.mImageHelper;
        if (c12005 != null) {
            c12005.m29903();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.m29895();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null) {
            c12004.m29903();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null) {
            c12004.m29903();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45275(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45273();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45281(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            return c19993.m45280();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45277(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            return c19993.m45279();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null) {
            c12004.m29897(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null) {
            return c12004.m29902();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null) {
            c12004.m29898(mode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null) {
            return c12004.m29894();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C19993 c19993 = this.mBackgroundTintHelper;
        if (c19993 != null) {
            c19993.m45274();
        }
        C12004 c12004 = this.mImageHelper;
        if (c12004 != null) {
            c12004.m29903();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m29901() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }
}
