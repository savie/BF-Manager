package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩶ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20288 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f65743;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f65744;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Drawable f65745;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f65746;

    public C20288(int i, int i2, CharSequence charSequence, Drawable drawable) {
        this.f65746 = i;
        this.f65744 = i2;
        this.f65743 = charSequence == null ? null : charSequence.toString();
        this.f65745 = drawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20288 m45781(MenuItem menuItem) {
        return new C20288(menuItem.getItemId(), menuItem.getGroupId(), menuItem.getTitle(), menuItem.getIcon());
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f65746), Integer.valueOf(this.f65744), this.f65743, this.f65745);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20288)) {
            return false;
        }
        C20288 c20288 = (C20288) obj;
        return this.f65746 == c20288.f65746 && this.f65744 == c20288.f65744 && TextUtils.equals(this.f65743, c20288.f65743) && C13638.equals(this.f65745, c20288.f65745);
    }
}
