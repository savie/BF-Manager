package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.۫᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13459 extends SpannableString implements CharSequence, Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15301 f42842;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f42843;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f42844;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str = ((C13459) obj).f42844;
        String str2 = this.f42844;
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

    public C13459(String str, String str2, C15301 c15301) {
        super(C12669.m31437(c15301.f50019, "]", C3188.m10405(str2, " [line: ")));
        int length = str2.length() + 1;
        int length2 = length();
        setSpan(new ForegroundColorSpan(C3296.f10758 & (-2130706433)), length, length2, 33);
        setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
        this.f42844 = str;
        this.f42843 = str2;
        this.f42842 = c15301;
    }
}
