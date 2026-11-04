package l;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C4IM */
/* JADX INFO: loaded from: classes3.dex */
public class C12090 extends ImageView {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f38932;

    public C12090(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9106 c9106M22498 = C8361.m22498(this, attributeSet, 0);
        this.f38932 = c9106M22498.f7706;
        int i = c9106M22498.f29577;
        if (i > 0) {
            super.setImageResource(i);
        }
        int i2 = c9106M22498.f29576;
        if (i2 > 0) {
            super.setBackgroundResource(i2);
        }
    }

    public C12090(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9106 c9106M22498 = C8361.m22498(this, attributeSet, i);
        this.f38932 = c9106M22498.f7706;
        int i2 = c9106M22498.f29577;
        if (i2 > 0) {
            super.setImageResource(i2);
        }
        int i3 = c9106M22498.f29576;
        if (i3 > 0) {
            super.setBackgroundResource(i3);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        List list = C8361.f27427;
        if (uri != null) {
            try {
                setImageDrawable(new C17311(getContext().getContentResolver(), uri));
                return;
            } catch (IOException unused) {
            }
        }
        super.setImageURI(uri);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        if (C8361.m22500((ImageView) this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        if (C8361.m22500((ImageView) this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z = this.f38932;
        return new C0904(super.onSaveInstanceState(), z ? getDrawable() : null, z ? getBackground() : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0904)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0904 c0904 = (C0904) parcelable;
        super.onRestoreInstanceState(c0904.getSuperState());
        c0904.m3670(getDrawable(), 0);
        c0904.m3670(getBackground(), 1);
    }
}
