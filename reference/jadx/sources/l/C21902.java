package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C21902 implements InterfaceC15553 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Uri f71063;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ClipData f71064;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f71065;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f71066;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle f71067;

    @Override // l.InterfaceC15553
    /* JADX INFO: renamed from: ۙ */
    public final ContentInfo mo37192() {
        return null;
    }

    public C21902(C7085 c7085) {
        ClipData clipData = c7085.f23759;
        clipData.getClass();
        this.f71064 = clipData;
        int i = c7085.f23760;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f71065 = i;
        int i2 = c7085.f23761;
        if ((i2 & 1) != i2) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
        this.f71066 = i2;
        this.f71063 = c7085.f23758;
        this.f71067 = c7085.f23762;
    }

    @Override // l.InterfaceC15553
    /* JADX INFO: renamed from: ܰ */
    public final ClipData mo37193() {
        return this.f71064;
    }

    @Override // l.InterfaceC15553
    public final int getSource() {
        return this.f71065;
    }

    @Override // l.InterfaceC15553
    /* JADX INFO: renamed from: ֨ */
    public final int mo37191() {
        return this.f71066;
    }

    public final String toString() {
        String strValueOf;
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.f71064.getDescription());
        sb.append(", source=");
        int i = this.f71065;
        if (i == 0) {
            strValueOf = "SOURCE_APP";
        } else if (i == 1) {
            strValueOf = "SOURCE_CLIPBOARD";
        } else if (i == 2) {
            strValueOf = "SOURCE_INPUT_METHOD";
        } else if (i == 3) {
            strValueOf = "SOURCE_DRAG_AND_DROP";
        } else if (i != 4) {
            strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        } else {
            strValueOf = "SOURCE_AUTOFILL";
        }
        sb.append(strValueOf);
        sb.append(", flags=");
        int i2 = this.f71066;
        sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        Uri uri = this.f71063;
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        sb.append(str);
        return C22697.m50267(sb, this.f71067 != null ? ", hasExtras" : "", l.d);
    }
}
