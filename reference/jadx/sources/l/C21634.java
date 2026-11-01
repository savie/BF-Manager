package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.᩸ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C21634 extends SpannableString implements CharSequence, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f70160;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8500 f70161;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f70162;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str = ((C21634) obj).f70162;
        String str2 = this.f70162;
        if (str2.equalsIgnoreCase(str)) {
            return 0;
        }
        if (str2.equalsIgnoreCase("type-info")) {
            return -1;
        }
        if (str.equalsIgnoreCase("type-info")) {
            return 1;
        }
        return str2.compareToIgnoreCase(str);
    }

    public C21634(String str, String str2, C8500 c8500) {
        super(C12441.m30911(c8500.f29470, "]", C3012.m8976(str2, " [line: ")));
        int length = str2.length() + 1;
        int length2 = length();
        setSpan(new ForegroundColorSpan(C20368.f66007 & (-2130706433)), length, length2, 33);
        setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
        this.f70162 = str;
        this.f70160 = str2;
        this.f70161 = c8500;
    }
}
