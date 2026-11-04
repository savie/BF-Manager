package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 05T5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7880 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Context f26218;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7880 m21413(Context context) {
        C7880 c7880 = new C7880();
        c7880.f26218 = context;
        return c7880;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m21415() {
        Configuration configuration = this.f26218.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21418() {
        return this.f26218.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m21416() {
        return this.f26218.getResources().getBoolean(R.bool.MT_Protector);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m21417() {
        Context context = this.f26218;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C10401.f33061, R.attr.MT_Protector, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!m21416()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21414() {
        return this.f26218.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m21419() {
        return this.f26218.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
    }
}
