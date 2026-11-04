package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۢᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10306 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f32882;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Drawable f32883;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f32884;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f32885;

    public C10306(int i, int i2, CharSequence charSequence, Drawable drawable) {
        this.f32884 = i;
        this.f32882 = i2;
        this.f32885 = charSequence == null ? null : charSequence.toString();
        this.f32883 = drawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10306 m26554(MenuItem menuItem) {
        return new C10306(menuItem.getItemId(), menuItem.getGroupId(), menuItem.getTitle(), menuItem.getIcon());
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f32884), Integer.valueOf(this.f32882), this.f32885, this.f32883);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10306)) {
            return false;
        }
        C10306 c10306 = (C10306) obj;
        return this.f32884 == c10306.f32884 && this.f32882 == c10306.f32882 && TextUtils.equals(this.f32885, c10306.f32885) && C17359.equals(this.f32883, c10306.f32883);
    }
}
