package l;

import android.text.TextUtils;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۠᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8QU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8949 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29191;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f29192;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29193;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f29186 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f29187 = AbstractC8639.of((Object) "auto", (Object) "none");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f29189 = AbstractC8639.m23276("dot", "sesame", "circle");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f29190 = AbstractC8639.of((Object) "filled", (Object) "open");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f29188 = AbstractC8639.m23276("after", "before", "outside");

    public C8949(int i, int i2, int i3) {
        this.f29193 = i;
        this.f29191 = i2;
        this.f29192 = i3;
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
    public static C8949 m23917(String str) {
        int i;
        AbstractC20529 abstractC20529M30741;
        int i2;
        AbstractC20529 abstractC20529M30742;
        AbstractC20529 abstractC20529M30743;
        String str2;
        int iHashCode;
        String str3;
        int iHashCode2;
        String str4;
        int iHashCode3;
        if (str == null) {
            return null;
        }
        String strM21453 = C7914.m21453(str.trim());
        if (strM21453.isEmpty()) {
            return null;
        }
        AbstractC8639 abstractC8639M23280 = AbstractC8639.m23280(TextUtils.split(strM21453, f29186));
        String str5 = (String) C7676.m20909(C12324.m30741((Set) f29188, abstractC8639M23280).iterator(), "outside");
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
            abstractC20529M30741 = C12324.m30741((Set) f29187, abstractC8639M23280);
            i2 = -1;
            if (!abstractC20529M30741.isEmpty()) {
                str4 = (String) abstractC20529M30741.iterator().next();
                iHashCode3 = str4.hashCode();
                if (iHashCode3 != 3005871) {
                    str4.equals("auto");
                } else if (iHashCode3 == 3387192 && str4.equals("none")) {
                    i2 = 0;
                }
                return new C8949(i2, 0, i);
            }
            abstractC20529M30742 = C12324.m30741((Set) f29190, abstractC8639M23280);
            abstractC20529M30743 = C12324.m30741((Set) f29189, abstractC8639M23280);
            if (!abstractC20529M30742.isEmpty() && abstractC20529M30743.isEmpty()) {
                return new C8949(-1, 0, i);
            }
            str2 = (String) C7676.m20909(abstractC20529M30742.iterator(), "filled");
            iHashCode = str2.hashCode();
            if (iHashCode != -1274499742) {
                int i4 = (iHashCode != 3417674 && str2.equals("open")) ? 2 : 1;
                str3 = (String) C7676.m20909(abstractC20529M30743.iterator(), "circle");
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
                return new C8949(i3, i4, i);
            }
            str2.equals("filled");
            str3 = (String) C7676.m20909(abstractC20529M30743.iterator(), "circle");
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
            return new C8949(i3, i4, i);
        }
        str5.equals("before");
        i = 1;
        abstractC20529M30741 = C12324.m30741((Set) f29187, abstractC8639M23280);
        i2 = -1;
        if (!abstractC20529M30741.isEmpty()) {
            str4 = (String) abstractC20529M30741.iterator().next();
            iHashCode3 = str4.hashCode();
            if (iHashCode3 != 3005871) {
                str4.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i2 = 0;
            }
            return new C8949(i2, 0, i);
        }
        abstractC20529M30742 = C12324.m30741((Set) f29190, abstractC8639M23280);
        abstractC20529M30743 = C12324.m30741((Set) f29189, abstractC8639M23280);
        if (!abstractC20529M30742.isEmpty()) {
        }
        str2 = (String) C7676.m20909(abstractC20529M30742.iterator(), "filled");
        iHashCode = str2.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode != 3417674) {
            }
            str3 = (String) C7676.m20909(abstractC20529M30743.iterator(), "circle");
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
            return new C8949(i3, i4, i);
        }
        str2.equals("filled");
        str3 = (String) C7676.m20909(abstractC20529M30743.iterator(), "circle");
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
        return new C8949(i3, i4, i);
    }
}
