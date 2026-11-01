package l;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14K2 */
/* JADX INFO: loaded from: classes2.dex */
public class C5185 extends ImageButton {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f17989;

    public C5185(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8714 c8714M19452 = C7302.m19452(this, attributeSet, 0);
        this.f17989 = c8714M19452.f34614;
        int i = c8714M19452.f29956;
        if (i > 0) {
            super.setImageResource(i);
        }
        int i2 = c8714M19452.f29957;
        if (i2 > 0) {
            super.setBackgroundResource(i2);
        }
    }

    public C5185(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8714 c8714M19452 = C7302.m19452(this, attributeSet, i);
        this.f17989 = c8714M19452.f34614;
        int i2 = c8714M19452.f29956;
        if (i2 > 0) {
            super.setImageResource(i2);
        }
        int i3 = c8714M19452.f29957;
        if (i3 > 0) {
            super.setBackgroundResource(i3);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        List list = C7302.f24237;
        if (uri != null) {
            try {
                setImageDrawable(new C4479(getContext().getContentResolver(), uri));
                return;
            } catch (IOException unused) {
            }
        }
        super.setImageURI(uri);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        if (C7302.m19454((ImageView) this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        if (C7302.m19454((ImageView) this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z = this.f17989;
        return new C19297(super.onSaveInstanceState(), z ? getDrawable() : null, z ? getBackground() : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C19297)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19297 c19297 = (C19297) parcelable;
        super.onRestoreInstanceState(c19297.getSuperState());
        c19297.m44284(getDrawable(), 0);
        c19297.m44284(getBackground(), 1);
    }
}
