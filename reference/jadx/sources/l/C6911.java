package l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۜܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 491A */
/* JADX INFO: loaded from: classes2.dex */
public final class C6911 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23246;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23140 f23247;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f23249;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18200 f23250 = new C18200();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f23248 = new StringBuilder();

    public C6911(C23140 c23140) {
        this.f23247 = c23140;
        this.f23249 = c23140.f75136.length();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C18200 c18200 = this.f23250;
        c18200.m42317("", "");
        StringBuilder sb = this.f23248;
        sb.setLength(0);
        int i = this.f23246;
        String strTrim = null;
        String strTrim2 = null;
        boolean z = false;
        while (true) {
            int i2 = this.f23249;
            if (i < i2) {
                char cCharAt = this.f23247.f75136.charAt(i);
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
                        this.f23246 = i + 1;
                        c18200.m42317(strTrim, strTrim2);
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
                c18200.m42317(strTrim, sb.toString().trim());
                this.f23246 = i2;
                break;
            }
        }
        return (TextUtils.isEmpty(c18200.m42316()) || TextUtils.isEmpty(c18200.m42318())) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C18200 c18200 = this.f23250;
        String strM42316 = c18200.m42316();
        String strM42318 = c18200.m42318();
        if (TextUtils.isEmpty(strM42316) || TextUtils.isEmpty(strM42318)) {
            throw new NoSuchElementException();
        }
        return c18200;
    }
}
