package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩶ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4JG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21015 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f67180;

    static {
        Charset charsetForName = Charset.forName(a.D);
        C15243.m36591(charsetForName, "forName(...)");
        f67180 = charsetForName;
        C15243.m36591(Charset.forName("UTF-16"), "forName(...)");
        C15243.m36591(Charset.forName("UTF-16BE"), "forName(...)");
        C15243.m36591(Charset.forName("UTF-16LE"), "forName(...)");
        C15243.m36591(Charset.forName("US-ASCII"), "forName(...)");
        C15243.m36591(Charset.forName(LocalizedMessage.DEFAULT_ENCODING), "forName(...)");
    }
}
