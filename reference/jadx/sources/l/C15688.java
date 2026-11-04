package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A4X8 */
/* JADX INFO: loaded from: classes4.dex */
public class C15688 extends ImageView {
    public final C0378 mBackgroundTintHelper;
    public boolean mHasLevel;
    public final C20164 mImageHelper;

    public C15688(Context context) {
        this(context, null);
    }

    public C15688(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15688(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8712.m23406(context);
        this.mHasLevel = false;
        C9457.m24831(getContext(), this);
        C0378 c0378 = new C0378(this);
        this.mBackgroundTintHelper = c0378;
        c0378.m2178(attributeSet, i);
        C20164 c20164 = new C20164(this);
        this.mImageHelper = c20164;
        c20164.m46380(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null) {
            c20164.m46376(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null && drawable != null && !this.mHasLevel) {
            c20164.m46379(drawable);
        }
        super.setImageDrawable(drawable);
        C20164 c20165 = this.mImageHelper;
        if (c20165 != null) {
            c20165.m46383();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.m46375();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null) {
            c20164.m46383();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null) {
            c20164.m46383();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2175(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2182();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2181(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            return c0378.m2180();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2177(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            return c0378.m2179();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null) {
            c20164.m46377(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null) {
            return c20164.m46381();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null) {
            c20164.m46378(mode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null) {
            return c20164.m46384();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0378 c0378 = this.mBackgroundTintHelper;
        if (c0378 != null) {
            c0378.m2174();
        }
        C20164 c20164 = this.mImageHelper;
        if (c20164 != null) {
            c20164.m46383();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m46382() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }
}
