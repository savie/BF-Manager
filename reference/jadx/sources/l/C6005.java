package l;

import com.alipay.sdk.m.w.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6005 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f20551 = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f20552 = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f20553 = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20554;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f20555;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20556;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f20557;

    public C6005(String str) {
        this.f20555 = str;
        if (str == null) {
            this.f20556 = "";
            this.f20557 = a.D;
        } else {
            Matcher matcher = f20551.matcher(str);
            this.f20556 = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f20552.matcher(str);
            this.f20557 = matcher2.find() ? matcher2.group(2) : null;
        }
        if (!"multipart/form-data".equalsIgnoreCase(this.f20556)) {
            this.f20554 = null;
        } else {
            Matcher matcher3 = f20553.matcher(str);
            this.f20554 = matcher3.find() ? matcher3.group(2) : null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m17454() {
        return this.f20555;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17457() {
        return this.f20556;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m17458() {
        String str = this.f20557;
        return str != null ? str : a.D;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17453() {
        return this.f20554;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m17456() {
        return "multipart/form-data".equalsIgnoreCase(this.f20556);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6005 m17455() {
        return this.f20557 == null ? new C6005(C8947.m23910(new StringBuilder(), this.f20555, "; charset=UTF-8")) : this;
    }
}
