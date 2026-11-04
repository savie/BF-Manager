package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAUA */
/* JADX INFO: loaded from: classes2.dex */
public final class C4398 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f15826;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset charsetForName = Charset.forName(a.D);
        f15826 = charsetForName;
        charsetForName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
