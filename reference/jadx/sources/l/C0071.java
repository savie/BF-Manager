package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 05T5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0071 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Context f972;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0071 m993(Context context) {
        C0071 c0071 = new C0071();
        c0071.f972 = context;
        return c0071;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m997() {
        Configuration configuration = this.f972.getResources().getConfiguration();
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m998() {
        return this.f972.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m999() {
        return this.f972.getResources().getBoolean(R.bool.MT_Protector);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m996() {
        Context context = this.f972;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C12108.f40515, R.attr.MT_Protector, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!m999()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m995() {
        return this.f972.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m994() {
        return this.f972.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
    }
}
