package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T4T4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4632 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f16363;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16364;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12790(String str) {
        if (!this.f16363.startsWith(str)) {
            return false;
        }
        this.f16364 = str.length();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12791(Pattern pattern) {
        Matcher matcher = pattern.matcher(this.f16363);
        if (!matcher.find()) {
            return false;
        }
        C18304.m42517(matcher.start() == 0);
        this.f16364 = matcher.end();
        return true;
    }
}
