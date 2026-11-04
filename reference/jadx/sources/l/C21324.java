package l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 491A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21324 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f67935;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18340 f67936;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67938;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19086 f67939 = new C19086();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f67937 = new StringBuilder();

    public C21324(C18340 c18340) {
        this.f67936 = c18340;
        this.f67935 = c18340.f59809.length();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C19086 c19086 = this.f67939;
        c19086.m44198("", "");
        StringBuilder sb = this.f67937;
        sb.setLength(0);
        int i = this.f67938;
        String strTrim = null;
        String strTrim2 = null;
        boolean z = false;
        while (true) {
            int i2 = this.f67935;
            if (i < i2) {
                char cCharAt = this.f67936.f59809.charAt(i);
                if (strTrim == null) {
                    if (':' == cCharAt) {
                        if (sb.length() > 0) {
                            strTrim = sb.toString().trim();
                        }
                        sb.setLength(0);
                    } else if (';' == cCharAt) {
                        sb.setLength(0);
                    } else if (Character.isWhitespace(cCharAt)) {
                        if (sb.length() > 0) {
                            z = true;
                        }
                    } else if (z) {
                        sb.setLength(0);
                        sb.append(cCharAt);
                        z = false;
                    } else {
                        sb.append(cCharAt);
                    }
                } else if (strTrim2 != null) {
                    continue;
                } else if (Character.isWhitespace(cCharAt)) {
                    if (sb.length() > 0) {
                        sb.append(cCharAt);
                    }
                } else if (';' == cCharAt) {
                    strTrim2 = sb.toString().trim();
                    sb.setLength(0);
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                        this.f67938 = i + 1;
                        c19086.m44198(strTrim, strTrim2);
                        break;
                    }
                } else {
                    sb.append(cCharAt);
                }
                i++;
            } else {
                if (strTrim == null || sb.length() <= 0) {
                    break;
                    break;
                }
                c19086.m44198(strTrim, sb.toString().trim());
                this.f67938 = i2;
                break;
            }
        }
        return (TextUtils.isEmpty(c19086.m44197()) || TextUtils.isEmpty(c19086.m44199())) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C19086 c19086 = this.f67939;
        String strM44197 = c19086.m44197();
        String strM44199 = c19086.m44199();
        if (TextUtils.isEmpty(strM44197) || TextUtils.isEmpty(strM44199)) {
            throw new NoSuchElementException();
        }
        return c19086;
    }
}
