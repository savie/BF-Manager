package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C15973 implements InterfaceC17465 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ClipData f51852;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f51853;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f51854;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bundle f51855;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Uri f51856;

    @Override // l.InterfaceC17465
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentInfo mo38085() {
        return null;
    }

    public C15973(C24925 c24925) {
        ClipData clipData = c24925.f80666;
        clipData.getClass();
        this.f51852 = clipData;
        int i = c24925.f80668;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f51854 = i;
        int i2 = c24925.f80667;
        if ((i2 & 1) != i2) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
        this.f51853 = i2;
        this.f51856 = c24925.f80670;
        this.f51855 = c24925.f80669;
    }

    @Override // l.InterfaceC17465
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ClipData mo38087() {
        return this.f51852;
    }

    @Override // l.InterfaceC17465
    public final int getSource() {
        return this.f51854;
    }

    @Override // l.InterfaceC17465
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo38086() {
        return this.f51853;
    }

    public final String toString() {
        String strValueOf;
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.f51852.getDescription());
        sb.append(", source=");
        int i = this.f51854;
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
        int i2 = this.f51853;
        sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        Uri uri = this.f51856;
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        sb.append(str);
        return C8947.m23910(sb, this.f51855 != null ? ", hasExtras" : "", l.d);
    }
}
