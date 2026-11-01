package l;

import android.os.Build;
import android.view.DisplayCutout;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 51AH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9203 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DisplayCutout f31288;

    public C9203(DisplayCutout displayCutout) {
        this.f31288 = displayCutout;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m23666() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C19786.m45005(this.f31288);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23667() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C19786.m45007(this.f31288);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m23669() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C19786.m45006(this.f31288);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m23668() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C19786.m45002(this.f31288);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9203.class != obj.getClass()) {
            return false;
        }
        return C13638.equals(this.f31288, ((C9203) obj).f31288);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f31288;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f31288 + l.d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9203 m23665(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C9203(displayCutout);
    }
}
