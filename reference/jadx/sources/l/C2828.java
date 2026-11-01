package l;

import com.alipay.sdk.m.w.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۖ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2828 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f10717;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f10718;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f10719;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f10720;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f10714 = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f10716 = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f10715 = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    public C2828(String str) {
        this.f10719 = str;
        if (str == null) {
            this.f10720 = "";
            this.f10717 = a.D;
        } else {
            Matcher matcher = f10714.matcher(str);
            this.f10720 = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f10716.matcher(str);
            this.f10717 = matcher2.find() ? matcher2.group(2) : null;
        }
        if (!"multipart/form-data".equalsIgnoreCase(this.f10720)) {
            this.f10718 = null;
        } else {
            Matcher matcher3 = f10715.matcher(str);
            this.f10718 = matcher3.find() ? matcher3.group(2) : null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m8582() {
        return this.f10719;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m8583() {
        return this.f10720;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m8579() {
        String str = this.f10717;
        return str != null ? str : a.D;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m8580() {
        return this.f10718;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m8581() {
        return "multipart/form-data".equalsIgnoreCase(this.f10720);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2828 m8584() {
        return this.f10717 == null ? new C2828(C22697.m50267(new StringBuilder(), this.f10719, "; charset=UTF-8")) : this;
    }
}
