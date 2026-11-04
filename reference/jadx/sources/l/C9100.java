package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۡۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9100 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f29569;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f29570;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24250(String str) {
        if (!this.f29569.startsWith(str)) {
            return false;
        }
        this.f29570 = str.length();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24251(Pattern pattern) {
        Matcher matcher = pattern.matcher(this.f29569);
        if (!matcher.find()) {
            return false;
        }
        C12128.m30309(matcher.start() == 0);
        this.f29570 = matcher.end();
        return true;
    }
}
