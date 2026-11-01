package l;

import android.text.TextUtils;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩺۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8QU */
/* JADX INFO: loaded from: classes.dex */
public final class C22870 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f74390;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f74391;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f74392;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f74388 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f74385 = AbstractC23844.of((Object) "auto", (Object) "none");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f74387 = AbstractC23844.m52567("dot", "sesame", "circle");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f74386 = AbstractC23844.of((Object) "filled", (Object) "open");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f74389 = AbstractC23844.m52567("after", "before", "outside");

    public C22870(int i, int i2, int i3) {
        this.f74392 = i;
        this.f74390 = i2;
        this.f74391 = i3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22870 m50615(String str) {
        int i;
        AbstractC7804 abstractC7804M47671;
        int i2;
        AbstractC7804 abstractC7804M47672;
        AbstractC7804 abstractC7804M47673;
        String str2;
        int iHashCode;
        String str3;
        int iHashCode2;
        String str4;
        int iHashCode3;
        if (str == null) {
            return null;
        }
        String strM46672 = C20733.m46672(str.trim());
        if (strM46672.isEmpty()) {
            return null;
        }
        AbstractC23844 abstractC23844M52571 = AbstractC23844.m52571(TextUtils.split(strM46672, f74388));
        String str5 = (String) C16458.m38718(C21209.m47671((Set) f74389, abstractC23844M52571).iterator(), "outside");
        int iHashCode4 = str5.hashCode();
        int i3 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str5.equals("after")) {
                    i = 2;
                }
            } else if (str5.equals("outside")) {
                i = -2;
            }
            abstractC7804M47671 = C21209.m47671((Set) f74385, abstractC23844M52571);
            i2 = -1;
            if (!abstractC7804M47671.isEmpty()) {
                str4 = (String) abstractC7804M47671.iterator().next();
                iHashCode3 = str4.hashCode();
                if (iHashCode3 != 3005871) {
                    str4.equals("auto");
                } else if (iHashCode3 == 3387192 && str4.equals("none")) {
                    i2 = 0;
                }
                return new C22870(i2, 0, i);
            }
            abstractC7804M47672 = C21209.m47671((Set) f74386, abstractC23844M52571);
            abstractC7804M47673 = C21209.m47671((Set) f74387, abstractC23844M52571);
            if (!abstractC7804M47672.isEmpty() && abstractC7804M47673.isEmpty()) {
                return new C22870(-1, 0, i);
            }
            str2 = (String) C16458.m38718(abstractC7804M47672.iterator(), "filled");
            iHashCode = str2.hashCode();
            if (iHashCode != -1274499742) {
                int i4 = (iHashCode != 3417674 && str2.equals("open")) ? 2 : 1;
                str3 = (String) C16458.m38718(abstractC7804M47673.iterator(), "circle");
                iHashCode2 = str3.hashCode();
                if (iHashCode2 != -1360216880) {
                    str3.equals("circle");
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str3.equals("dot")) {
                        i3 = 2;
                    }
                } else if (str3.equals("sesame")) {
                    i3 = 3;
                }
                return new C22870(i3, i4, i);
            }
            str2.equals("filled");
            str3 = (String) C16458.m38718(abstractC7804M47673.iterator(), "circle");
            iHashCode2 = str3.hashCode();
            if (iHashCode2 != -1360216880) {
                str3.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i3 = 2;
                }
            } else if (str3.equals("sesame")) {
                i3 = 3;
            }
            return new C22870(i3, i4, i);
        }
        str5.equals("before");
        i = 1;
        abstractC7804M47671 = C21209.m47671((Set) f74385, abstractC23844M52571);
        i2 = -1;
        if (!abstractC7804M47671.isEmpty()) {
            str4 = (String) abstractC7804M47671.iterator().next();
            iHashCode3 = str4.hashCode();
            if (iHashCode3 != 3005871) {
                str4.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i2 = 0;
            }
            return new C22870(i2, 0, i);
        }
        abstractC7804M47672 = C21209.m47671((Set) f74386, abstractC23844M52571);
        abstractC7804M47673 = C21209.m47671((Set) f74387, abstractC23844M52571);
        if (!abstractC7804M47672.isEmpty()) {
        }
        str2 = (String) C16458.m38718(abstractC7804M47672.iterator(), "filled");
        iHashCode = str2.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode != 3417674) {
            }
            str3 = (String) C16458.m38718(abstractC7804M47673.iterator(), "circle");
            iHashCode2 = str3.hashCode();
            if (iHashCode2 != -1360216880) {
                str3.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i3 = 2;
                }
            } else if (str3.equals("sesame")) {
                i3 = 3;
            }
            return new C22870(i3, i4, i);
        }
        str2.equals("filled");
        str3 = (String) C16458.m38718(abstractC7804M47673.iterator(), "circle");
        iHashCode2 = str3.hashCode();
        if (iHashCode2 != -1360216880) {
            str3.equals("circle");
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i3 = 2;
            }
        } else if (str3.equals("sesame")) {
            i3 = 3;
        }
        return new C22870(i3, i4, i);
    }
}
