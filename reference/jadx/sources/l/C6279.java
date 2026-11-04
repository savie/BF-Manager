package l;

import android.os.Build;
import android.view.DisplayCutout;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51AH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6279 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DisplayCutout f21317;

    public C6279(DisplayCutout displayCutout) {
        this.f21317 = displayCutout;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m17955() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C12244.m30579(this.f21317);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17952() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C12244.m30576(this.f21317);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m17954() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C12244.m30578(this.f21317);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m17953() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C12244.m30577(this.f21317);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6279.class != obj.getClass()) {
            return false;
        }
        return C17359.equals(this.f21317, ((C6279) obj).f21317);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f21317;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f21317 + l.d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6279 m17951(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C6279(displayCutout);
    }
}
