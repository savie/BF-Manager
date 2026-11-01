package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۙ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4344 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5050 f15540;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6037 f15541;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4105 f15542;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5062 f15543;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Map f15545;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f15544 = new HashMap();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f15539 = true;

    public C4344(C6037 c6037) {
        this.f15541 = c6037;
        this.f15543 = c6037.m16376();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12182(boolean z) {
        this.f15539 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12180(Map map) {
        this.f15545 = map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x0290  */
    /* JADX WARN: Code duplicated, block: B:128:0x029d  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ac A[LOOP:4: B:127:0x029b->B:131:0x02ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:207:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0400  */
    /* JADX WARN: Code duplicated, block: B:214:0x0403  */
    /* JADX WARN: Code duplicated, block: B:220:0x0422  */
    /* JADX WARN: Code duplicated, block: B:222:0x0425  */
    /* JADX WARN: Code duplicated, block: B:230:0x0448  */
    /* JADX WARN: Code duplicated, block: B:232:0x0452  */
    /* JADX WARN: Code duplicated, block: B:233:0x0459  */
    /* JADX WARN: Code duplicated, block: B:235:0x0461  */
    /* JADX WARN: Code duplicated, block: B:236:0x0468  */
    /* JADX WARN: Code duplicated, block: B:238:0x0470  */
    /* JADX WARN: Code duplicated, block: B:243:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:245:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:248:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:251:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:253:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:255:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:257:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:259:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:261:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:262:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:263:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:264:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:265:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:273:0x0558  */
    /* JADX WARN: Code duplicated, block: B:284:0x051d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x050d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0153  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12179(CharSequence charSequence) {
        C5050 c5050;
        C11413 c11413M28513;
        C11413 c11413M14106;
        C5050 c5051;
        int i;
        int i2;
        int i3;
        int i4;
        StringBuilder sb;
        int i5;
        char cCharAt;
        char cCharAt2;
        boolean z;
        C21996[] c21996Arr;
        boolean z2;
        int iM17654;
        int length;
        int i6;
        int i7;
        C4105 c4105M11650 = C4105.m11650(charSequence);
        this.f15542 = c4105M11650;
        C5050 c5052 = new C5050();
        this.f15540 = c5052;
        int i8 = 0;
        while (i8 < c4105M11650.m11652()) {
            C0816 c0816 = new C0816();
            int iM11651 = c4105M11650.m11651(i8);
            if (iM11651 != 0) {
                int i9 = 1;
                if (iM11651 != 1) {
                    if (iM11651 == 2) {
                        C22451 c22451M11653 = c4105M11650.m11653(i8);
                        String strM49936 = c22451M11653.m49936();
                        if (!TextUtils.isEmpty(strM49936)) {
                            c0816.f3441 = c5052.m14064(strM49936);
                        }
                        c0816.f3442 = c5052.m14064(c22451M11653.m49937());
                        c22451M11653.m49935(c0816);
                    } else if (iM11651 == 3) {
                        C5050 c5053 = c5052;
                        C1283 c1283M11656 = c4105M11650.m11656(i8);
                        c5050 = c5053;
                        c0816.f3441 = c5050.m14064(c1283M11656.m4611());
                        c0816.f3442 = c5050.m14064(c1283M11656.m4607());
                        c1283M11656.m4609(c0816);
                    } else if (iM11651 == 4) {
                        C13279 c13279M11655 = c4105M11650.m11655(i8);
                        c0816.f3441 = c5052.m14064(c13279M11655.m32764());
                        c13279M11655.m32763(c0816);
                    }
                    c5050 = c5052;
                } else {
                    C22451 c22451M11654 = c4105M11650.m11653(i8);
                    String strM49937 = c22451M11654.m49936();
                    if (!TextUtils.isEmpty(strM49937)) {
                        c0816.f3441 = c5052.m14064(strM49937);
                    }
                    c0816.f3442 = c5052.m14064(c22451M11654.m49937());
                    c22451M11654.m49935(c0816);
                    Iterator it = ((ArrayList) c22451M11654.m49934()).iterator();
                    while (it.hasNext()) {
                        C5517 c5517 = (C5517) it.next();
                        C5050 c5054 = this.f15540;
                        C21984 c21984 = new C21984();
                        String strM15218 = c5517.m15218();
                        if (!TextUtils.isEmpty(strM15218)) {
                            c21984.f71304 = c5054.m14064(strM15218);
                        }
                        String strM15215 = c5517.m15215();
                        String strM15219 = c5517.m15218();
                        if (strM15219.isEmpty()) {
                            strM15215.getClass();
                            switch (strM15215) {
                                case "platformBuildVersionCode":
                                    c11413M28513 = C11413.f38422;
                                    break;
                                case "platformBuildVersionName":
                                    c11413M28513 = C11413.f38423;
                                    break;
                                case "layout":
                                    c11413M28513 = C11413.f38421;
                                    break;
                                case "package":
                                    c11413M28513 = C11413.f38424;
                                    break;
                                case "style":
                                    c11413M28513 = C11413.f38426;
                                    break;
                                case "coreApp":
                                    c11413M28513 = C11413.f38425;
                                    break;
                                default:
                                    c11413M28513 = C11413.m28513(65535, Integer.MAX_VALUE, strM15215);
                                    break;
                            }
                            c11413M14106 = c11413M28513;
                            c21984.f71305 = this.f15540.m14064(strM15215);
                        } else {
                            String strM5594 = C1679.m5594(strM15219, ":", strM15215);
                            HashMap map = this.f15544;
                            c11413M14106 = (C11413) map.get(strM5594);
                            if (c11413M14106 == null) {
                                c11413M14106 = this.f15543.m14106(strM15219, strM15215, this.f15545);
                                if (c11413M14106 == null) {
                                    throw new C4811("Unknown attr " + c5517.m15214(), c5517.m15219());
                                }
                                map.put(strM5594, c11413M14106);
                            }
                            c21984.f71305 = this.f15540.m14063(c11413M14106.f38428, strM15215);
                        }
                        C12812 c12812 = new C12812();
                        c21984.f71301 = c12812;
                        String strM15220 = c5517.m15220();
                        if (strM15220.contains("###")) {
                            System.out.println(i9);
                        }
                        boolean zStartsWith = strM15220.startsWith("@");
                        C6037 c6037 = this.f15541;
                        Iterator it2 = it;
                        if (zStartsWith) {
                            c12812.f42661 = i9;
                            String strSubstring = strM15220.substring(i9);
                            if (strSubstring.length() == 8 && C6461.m17648(strSubstring)) {
                                c12812.f42662 = C6461.m17654(strSubstring);
                            } else if (strSubstring.equals("null")) {
                                c12812.f42662 = 0;
                            } else {
                                int iM16374 = c6037.m16374(strSubstring);
                                if (iM16374 == -1) {
                                    throw new C4811(C0242.m1617("Resource not found: ", c5517.m15214(), "=\"", c5517.m15220(), "\""), c5517.m15213());
                                }
                                c12812.f42662 = iM16374;
                            }
                        } else {
                            if (strM15220.startsWith("?")) {
                                c12812.f42661 = 2;
                                String strSubstring2 = strM15220.substring(1);
                                if (strSubstring2.length() == 8 && C6461.m17648(strSubstring2)) {
                                    c12812.f42662 = C6461.m17654(strSubstring2);
                                } else {
                                    int iM16375 = c6037.m16374(strSubstring2);
                                    if (iM16375 == -1) {
                                        throw new C4811(C0242.m1617("Resource not found: ", c5517.m15214(), "=\"", c5517.m15220(), "\""), c5517.m15213());
                                    }
                                    c12812.f42662 = iM16375;
                                }
                            } else {
                                int i10 = c11413M14106.f38427;
                                C21996[] c21996Arr2 = c11413M14106.f38429;
                                if ((65536 & i10) != 0) {
                                    int length2 = c21996Arr2.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            int i12 = length2;
                                            C21996 c21996 = c21996Arr2[i11];
                                            c5051 = c5052;
                                            if (c21996.f71327.equals(strM15220)) {
                                                c12812.f42662 = c21996.f71329;
                                                c12812.f42661 = c21996.f71328;
                                            } else {
                                                i11++;
                                                length2 = i12;
                                                c5052 = c5051;
                                            }
                                        } else {
                                            c5051 = c5052;
                                            if (C6461.m17645(strM15220)) {
                                                int i13 = Integer.parseInt(strM15220);
                                                int length3 = c21996Arr2.length;
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 < length3) {
                                                        int i15 = length3;
                                                        if (c21996Arr2[i14].f71329 == i13) {
                                                            c12812.f42661 = 16;
                                                            c12812.f42662 = i13;
                                                        } else {
                                                            i14++;
                                                            length3 = i15;
                                                        }
                                                    } else if (C6461.m17655(strM15220)) {
                                                        iM17654 = C6461.m17654(strM15220.substring(2));
                                                        length = c21996Arr2.length;
                                                        i6 = 0;
                                                        while (true) {
                                                            if (i6 < length) {
                                                                i7 = length;
                                                                if (c21996Arr2[i6].f71329 == iM17654) {
                                                                    c12812.f42661 = 16;
                                                                    c12812.f42662 = iM17654;
                                                                } else {
                                                                    i6++;
                                                                    length = i7;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (C6461.m17655(strM15220)) {
                                                iM17654 = C6461.m17654(strM15220.substring(2));
                                                length = c21996Arr2.length;
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 < length) {
                                                        i7 = length;
                                                        if (c21996Arr2[i6].f71329 == iM17654) {
                                                            c12812.f42661 = 16;
                                                            c12812.f42662 = iM17654;
                                                        } else {
                                                            i6++;
                                                            length = i7;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i = i8;
                                    }
                                } else {
                                    c5051 = c5052;
                                }
                                if ((131072 & i10) != 0) {
                                    c12812.f42661 = 17;
                                    String[] strArrSplit = strM15220.split("\\|");
                                    int length4 = strArrSplit.length;
                                    int i16 = 0;
                                    int iM17655 = 0;
                                    boolean z3 = false;
                                    while (true) {
                                        if (i16 < length4) {
                                            int i17 = length4;
                                            String strTrim = strArrSplit[i16].trim();
                                            c4105M11650 = c4105M11650;
                                            int length5 = c21996Arr2.length;
                                            i = i8;
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 < length5) {
                                                    int i19 = length5;
                                                    C21996 c21997 = c21996Arr2[i18];
                                                    c21996Arr = c21996Arr2;
                                                    if (c21997.f71327.equals(strTrim)) {
                                                        iM17655 |= c21997.f71329;
                                                        z2 = true;
                                                        z3 = true;
                                                    } else {
                                                        i18++;
                                                        length5 = i19;
                                                        c21996Arr2 = c21996Arr;
                                                    }
                                                } else {
                                                    c21996Arr = c21996Arr2;
                                                    z2 = false;
                                                }
                                            }
                                            if (!z2 && strArrSplit.length > 1 && C6461.m17655(strTrim)) {
                                                iM17655 |= C6461.m17654(strTrim.substring(2));
                                                z2 = true;
                                                z3 = true;
                                            }
                                            if (z2) {
                                                i16++;
                                                c4105M11650 = c4105M11650;
                                                length4 = i17;
                                                i8 = i;
                                                c21996Arr2 = c21996Arr;
                                            } else {
                                                z = true;
                                            }
                                        } else {
                                            c4105M11650 = c4105M11650;
                                            i = i8;
                                            z = false;
                                        }
                                    }
                                    int i20 = iM17655;
                                    if (!z && z3) {
                                        c12812.f42662 = i20;
                                    } else if (!z3 && C6461.m17645(strM15220)) {
                                        c12812.f42662 = Integer.parseInt(strM15220);
                                    } else if (!z3 && C6461.m17655(strM15220)) {
                                        c12812.f42662 = C6461.m17654(strM15220.substring(2));
                                    }
                                } else {
                                    c4105M11650 = c4105M11650;
                                    i = i8;
                                }
                                if ((i10 & 16) != 0 && strM15220.startsWith("#")) {
                                    String strM1617 = (strM15220.length() == 1 || !C6461.m17648(strM15220.substring(1))) ? C0242.m1617("Color value invalid: ", c5517.m15214(), "=\"", c5517.m15220(), "\"") : null;
                                    if (!C6461.m17649(strM15220, c12812)) {
                                        strM1617 = C0242.m1617("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ", c5517.m15214(), "=\"", c5517.m15220(), "\"");
                                    }
                                    if (strM1617 != null) {
                                        if ((i10 & 2) == 0) {
                                            throw new C4811(strM1617, c5517.m15213());
                                        }
                                        if ((i10 & 4) != 0) {
                                            i2 = i10 & 32;
                                            if (i2 != 0) {
                                                i4 = c12812.f42661;
                                                if (i4 == 4) {
                                                    if (i4 == 6) {
                                                        if (i4 != 5) {
                                                            continue;
                                                        }
                                                    } else if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 == 6) {
                                                    if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 != 5) {
                                                    continue;
                                                }
                                            } else {
                                                i4 = c12812.f42661;
                                                if (i4 == 4) {
                                                    if (i4 == 6) {
                                                        if (i4 != 5) {
                                                            continue;
                                                        }
                                                    } else if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 == 6) {
                                                    if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 != 5) {
                                                    continue;
                                                }
                                            }
                                        } else {
                                            i2 = i10 & 32;
                                            if (i2 != 0) {
                                                i4 = c12812.f42661;
                                                if (i4 == 4) {
                                                    if (i4 == 6) {
                                                        if (i4 != 5) {
                                                            continue;
                                                        }
                                                    } else if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 == 6) {
                                                    if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 != 5) {
                                                    continue;
                                                }
                                            } else {
                                                i4 = c12812.f42661;
                                                if (i4 == 4) {
                                                    if (i4 == 6) {
                                                        if (i4 != 5) {
                                                            continue;
                                                        }
                                                    } else if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 == 6) {
                                                    if (i4 != 5) {
                                                        continue;
                                                    }
                                                } else if (i4 != 5) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if ((i10 & 4) != 0 || !C6461.m17653(strM15220, c12812)) {
                                    i2 = i10 & 32;
                                    if (!(i2 != 0 && (i10 & 64) == 0 && (i10 & 128) == 0) && C6461.m17656(strM15220, c12812) && ((i3 = i10 & 2) == 0 || C6461.m17650(c12812))) {
                                        i4 = c12812.f42661;
                                        if (i4 == 4 || i2 != 0) {
                                            if (i4 == 6 || (i10 & 128) != 0) {
                                                if (i4 != 5 && (i10 & 64) == 0) {
                                                    if (i3 == 0) {
                                                        throw new C4811(C0242.m1617("Dimension value is not allowed here: ", c5517.m15214(), "=\"", c5517.m15220(), "\""), c5517.m15213());
                                                    }
                                                }
                                            } else if (i3 == 0) {
                                                throw new C4811(C0242.m1617("Fraction value is not allowed here: ", c5517.m15214(), "=\"", c5517.m15220(), "\""), c5517.m15213());
                                            }
                                        } else if (i3 == 0) {
                                            throw new C4811(C0242.m1617("Float value is not allowed here: ", c5517.m15214(), "=\"", c5517.m15220(), "\""), c5517.m15213());
                                        }
                                        if ((i10 & 8) == 0) {
                                            if (!strM15220.startsWith("<") && strM15220.endsWith(">")) {
                                                Matcher matcher = Pattern.compile("<0x([0-9a-f]{1,8}), type 0x([0-9a-f]{2})>").matcher(strM15220.toLowerCase());
                                                if (matcher.matches()) {
                                                    String strGroup = matcher.group(1);
                                                    C13638.requireNonNull(strGroup);
                                                    c12812.f42662 = C6461.m17654(strGroup);
                                                    String strGroup2 = matcher.group(2);
                                                    C13638.requireNonNull(strGroup2);
                                                    c12812.f42661 = C6461.m17654(strGroup2);
                                                } else {
                                                    if ((i10 & 2) != 0) {
                                                        throw new C4811(C22697.m50267(C12278.m30515("Error: ", c5517.m15214(), "=\"", c5517.m15220(), "\" ["), c11413M14106.m28517(), "]"), c5517.m15213());
                                                    }
                                                    c12812.f42661 = 3;
                                                    C5050 c5055 = this.f15540;
                                                    if (strM15220.indexOf(92) != -1) {
                                                        sb = new StringBuilder(strM15220.length() + 10);
                                                        i5 = 0;
                                                        while (i5 < strM15220.length()) {
                                                            cCharAt = strM15220.charAt(i5);
                                                            if (cCharAt == '\\') {
                                                                i5++;
                                                                if (i5 >= strM15220.length()) {
                                                                    cCharAt2 = strM15220.charAt(i5);
                                                                    if (cCharAt2 != '\\') {
                                                                        sb.append('\\');
                                                                    } else if (cCharAt2 != 'n') {
                                                                        sb.append('\n');
                                                                    } else if (cCharAt2 != 't') {
                                                                        sb.append(cCharAt2);
                                                                    } else {
                                                                        sb.append('\t');
                                                                    }
                                                                }
                                                            } else {
                                                                sb.append(cCharAt);
                                                            }
                                                            i5++;
                                                        }
                                                        strM15220 = sb.toString();
                                                    }
                                                    c21984.f71303 = c5055.m14064(strM15220);
                                                }
                                            } else {
                                                if ((i10 & 2) != 0) {
                                                    throw new C4811(C22697.m50267(C12278.m30515("Error: ", c5517.m15214(), "=\"", c5517.m15220(), "\" ["), c11413M14106.m28517(), "]"), c5517.m15213());
                                                }
                                                c12812.f42661 = 3;
                                                C5050 c5056 = this.f15540;
                                                if (strM15220.indexOf(92) != -1) {
                                                    sb = new StringBuilder(strM15220.length() + 10);
                                                    i5 = 0;
                                                    while (i5 < strM15220.length()) {
                                                        cCharAt = strM15220.charAt(i5);
                                                        if (cCharAt == '\\') {
                                                            i5++;
                                                            if (i5 >= strM15220.length()) {
                                                                cCharAt2 = strM15220.charAt(i5);
                                                                if (cCharAt2 != '\\') {
                                                                    sb.append('\\');
                                                                } else if (cCharAt2 != 'n') {
                                                                    sb.append('\n');
                                                                } else if (cCharAt2 != 't') {
                                                                    sb.append(cCharAt2);
                                                                } else {
                                                                    sb.append('\t');
                                                                }
                                                            }
                                                        } else {
                                                            sb.append(cCharAt);
                                                        }
                                                        i5++;
                                                    }
                                                    strM15220 = sb.toString();
                                                }
                                                c21984.f71303 = c5056.m14064(strM15220);
                                            }
                                        } else if (strM15220.equals("true")) {
                                            c12812.f42662 = -1;
                                            c12812.f42661 = 18;
                                        } else if (strM15220.equals("false")) {
                                            c12812.f42662 = 0;
                                            c12812.f42661 = 18;
                                        } else if (!strM15220.startsWith("<")) {
                                            if ((i10 & 2) != 0) {
                                                throw new C4811(C22697.m50267(C12278.m30515("Error: ", c5517.m15214(), "=\"", c5517.m15220(), "\" ["), c11413M14106.m28517(), "]"), c5517.m15213());
                                            }
                                            c12812.f42661 = 3;
                                            C5050 c5057 = this.f15540;
                                            if (strM15220.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM15220.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM15220.length()) {
                                                    cCharAt = strM15220.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM15220.length()) {
                                                            cCharAt2 = strM15220.charAt(i5);
                                                            if (cCharAt2 != '\\') {
                                                                sb.append('\\');
                                                            } else if (cCharAt2 != 'n') {
                                                                sb.append('\n');
                                                            } else if (cCharAt2 != 't') {
                                                                sb.append(cCharAt2);
                                                            } else {
                                                                sb.append('\t');
                                                            }
                                                        }
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i5++;
                                                }
                                                strM15220 = sb.toString();
                                            }
                                            c21984.f71303 = c5057.m14064(strM15220);
                                        } else {
                                            if ((i10 & 2) != 0) {
                                                throw new C4811(C22697.m50267(C12278.m30515("Error: ", c5517.m15214(), "=\"", c5517.m15220(), "\" ["), c11413M14106.m28517(), "]"), c5517.m15213());
                                            }
                                            c12812.f42661 = 3;
                                            C5050 c5058 = this.f15540;
                                            if (strM15220.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM15220.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM15220.length()) {
                                                    cCharAt = strM15220.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM15220.length()) {
                                                            cCharAt2 = strM15220.charAt(i5);
                                                            if (cCharAt2 != '\\') {
                                                                sb.append('\\');
                                                            } else if (cCharAt2 != 'n') {
                                                                sb.append('\n');
                                                            } else if (cCharAt2 != 't') {
                                                                sb.append(cCharAt2);
                                                            } else {
                                                                sb.append('\t');
                                                            }
                                                        }
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i5++;
                                                }
                                                strM15220 = sb.toString();
                                            }
                                            c21984.f71303 = c5058.m14064(strM15220);
                                        }
                                    } else if ((i10 & 8) == 0) {
                                        if (!strM15220.startsWith("<")) {
                                            if ((i10 & 2) != 0) {
                                                throw new C4811(C22697.m50267(C12278.m30515("Error: ", c5517.m15214(), "=\"", c5517.m15220(), "\" ["), c11413M14106.m28517(), "]"), c5517.m15213());
                                            }
                                            c12812.f42661 = 3;
                                            C5050 c5059 = this.f15540;
                                            if (strM15220.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM15220.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM15220.length()) {
                                                    cCharAt = strM15220.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM15220.length()) {
                                                            cCharAt2 = strM15220.charAt(i5);
                                                            if (cCharAt2 != '\\') {
                                                                sb.append('\\');
                                                            } else if (cCharAt2 != 'n') {
                                                                sb.append('\n');
                                                            } else if (cCharAt2 != 't') {
                                                                sb.append(cCharAt2);
                                                            } else {
                                                                sb.append('\t');
                                                            }
                                                        }
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i5++;
                                                }
                                                strM15220 = sb.toString();
                                            }
                                            c21984.f71303 = c5059.m14064(strM15220);
                                        } else {
                                            if ((i10 & 2) != 0) {
                                                throw new C4811(C22697.m50267(C12278.m30515("Error: ", c5517.m15214(), "=\"", c5517.m15220(), "\" ["), c11413M14106.m28517(), "]"), c5517.m15213());
                                            }
                                            c12812.f42661 = 3;
                                            C5050 c50510 = this.f15540;
                                            if (strM15220.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM15220.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM15220.length()) {
                                                    cCharAt = strM15220.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM15220.length()) {
                                                            cCharAt2 = strM15220.charAt(i5);
                                                            if (cCharAt2 != '\\') {
                                                                sb.append('\\');
                                                            } else if (cCharAt2 != 'n') {
                                                                sb.append('\n');
                                                            } else if (cCharAt2 != 't') {
                                                                sb.append(cCharAt2);
                                                            } else {
                                                                sb.append('\t');
                                                            }
                                                        }
                                                    } else {
                                                        sb.append(cCharAt);
                                                    }
                                                    i5++;
                                                }
                                                strM15220 = sb.toString();
                                            }
                                            c21984.f71303 = c50510.m14064(strM15220);
                                        }
                                    } else if (strM15220.equals("true")) {
                                        c12812.f42662 = -1;
                                        c12812.f42661 = 18;
                                    } else if (strM15220.equals("false")) {
                                        c12812.f42662 = 0;
                                        c12812.f42661 = 18;
                                    } else if (!strM15220.startsWith("<")) {
                                        if ((i10 & 2) != 0) {
                                            throw new C4811(C22697.m50267(C12278.m30515("Error: ", c5517.m15214(), "=\"", c5517.m15220(), "\" ["), c11413M14106.m28517(), "]"), c5517.m15213());
                                        }
                                        c12812.f42661 = 3;
                                        C5050 c50511 = this.f15540;
                                        if (strM15220.indexOf(92) != -1) {
                                            sb = new StringBuilder(strM15220.length() + 10);
                                            i5 = 0;
                                            while (i5 < strM15220.length()) {
                                                cCharAt = strM15220.charAt(i5);
                                                if (cCharAt == '\\') {
                                                    i5++;
                                                    if (i5 >= strM15220.length()) {
                                                        cCharAt2 = strM15220.charAt(i5);
                                                        if (cCharAt2 != '\\') {
                                                            sb.append('\\');
                                                        } else if (cCharAt2 != 'n') {
                                                            sb.append('\n');
                                                        } else if (cCharAt2 != 't') {
                                                            sb.append(cCharAt2);
                                                        } else {
                                                            sb.append('\t');
                                                        }
                                                    }
                                                } else {
                                                    sb.append(cCharAt);
                                                }
                                                i5++;
                                            }
                                            strM15220 = sb.toString();
                                        }
                                        c21984.f71303 = c50511.m14064(strM15220);
                                    } else {
                                        if ((i10 & 2) != 0) {
                                            throw new C4811(C22697.m50267(C12278.m30515("Error: ", c5517.m15214(), "=\"", c5517.m15220(), "\" ["), c11413M14106.m28517(), "]"), c5517.m15213());
                                        }
                                        c12812.f42661 = 3;
                                        C5050 c50512 = this.f15540;
                                        if (strM15220.indexOf(92) != -1) {
                                            sb = new StringBuilder(strM15220.length() + 10);
                                            i5 = 0;
                                            while (i5 < strM15220.length()) {
                                                cCharAt = strM15220.charAt(i5);
                                                if (cCharAt == '\\') {
                                                    i5++;
                                                    if (i5 >= strM15220.length()) {
                                                        cCharAt2 = strM15220.charAt(i5);
                                                        if (cCharAt2 != '\\') {
                                                            sb.append('\\');
                                                        } else if (cCharAt2 != 'n') {
                                                            sb.append('\n');
                                                        } else if (cCharAt2 != 't') {
                                                            sb.append(cCharAt2);
                                                        } else {
                                                            sb.append('\t');
                                                        }
                                                    }
                                                } else {
                                                    sb.append(cCharAt);
                                                }
                                                i5++;
                                            }
                                            strM15220 = sb.toString();
                                        }
                                        c21984.f71303 = c50512.m14064(strM15220);
                                    }
                                }
                            }
                            c21984.f71302 = c11413M14106;
                            c5517.m15216(c21984);
                            i9 = 1;
                            it = it2;
                            c5052 = c5051;
                            c4105M11650 = c4105M11650;
                            i8 = i;
                        }
                        c5051 = c5052;
                        i = i8;
                        c21984.f71302 = c11413M14106;
                        c5517.m15216(c21984);
                        i9 = 1;
                        it = it2;
                        c5052 = c5051;
                        c4105M11650 = c4105M11650;
                        i8 = i;
                    }
                    Collections.sort(c22451M11654.m49934(), new C3305());
                    c5050 = c5052;
                    c4105M11650 = c4105M11650;
                }
            } else {
                C5050 c50513 = c5052;
                C1283 c1283M11657 = c4105M11650.m11656(i8);
                c5050 = c50513;
                c0816.f3441 = c5050.m14064(c1283M11657.m4611());
                c0816.f3442 = c5050.m14064(c1283M11657.m4607());
                c1283M11657.m4609(c0816);
            }
            i8++;
            c5052 = c5050;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12181(C11018 c11018) {
        C4105 c4105 = this.f15542;
        c11018.mo24505((short) 3);
        int i = 8;
        c11018.mo24505((short) 8);
        long position = c11018.getPosition();
        int i2 = 4;
        c11018.skipBytes(4);
        int i3 = 0;
        this.f15540.m14065(this.f15539).m40059((InterfaceC16662) c11018, false, (C8516) null);
        int[] iArrM14066 = this.f15540.m14066();
        if (iArrM14066.length > 0) {
            c11018.mo24508(MLKEMEngine.KyberPolyBytes);
            c11018.mo24508(8);
            c11018.writeInt((iArrM14066.length * 4) + 8);
            c11018.mo24506(iArrM14066);
        }
        int i4 = 0;
        while (i4 < c4105.m11652()) {
            int iM11651 = c4105.m11651(i4);
            if (iM11651 == 0) {
                C1283 c1283M11656 = c4105.m11656(i4);
                C0816 c0816 = (C0816) c1283M11656.m4610();
                c11018.writeInt(1048832);
                c11018.writeInt(24);
                c11018.writeInt(c1283M11656.m4608());
                c11018.writeInt(-1);
                c11018.writeInt(c0816.f3441.m6852());
                c11018.writeInt(c0816.f3442.m6852());
            } else if (iM11651 == 1) {
                C22451 c22451M11653 = c4105.m11653(i4);
                C0816 c0817 = (C0816) c22451M11653.m49933();
                List listM49934 = c22451M11653.m49934();
                c11018.writeInt(1048834);
                int size = ((ArrayList) listM49934).size();
                c11018.writeInt((size * 20) + 36);
                c11018.writeInt(c22451M11653.m49938());
                c11018.writeInt(-1);
                C2227 c2227 = c0817.f3441;
                c11018.writeInt(c2227 == null ? -1 : c2227.m6852());
                c11018.writeInt(c0817.f3442.m6852());
                c11018.mo24508(20);
                c11018.mo24508(20);
                if (size == 0) {
                    c11018.m27791(0L);
                } else {
                    c11018.mo24505((short) size);
                    int i5 = 0;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) listM49934;
                        if (i5 < arrayList.size()) {
                            String strM15215 = ((C5517) arrayList.get(i5)).m15215();
                            strM15215.getClass();
                            switch (strM15215) {
                                case "id":
                                    s = (short) (i5 + 1);
                                    break;
                                case "class":
                                    s2 = (short) (i5 + 1);
                                    break;
                                case "style":
                                    s3 = (short) (i5 + 1);
                                    break;
                            }
                            i5++;
                        } else {
                            c11018.mo24505(s);
                            c11018.mo24505(s2);
                            c11018.mo24505(s3);
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                C21984 c21984 = (C21984) ((C5517) arrayList.get(i6)).m15217();
                                C2227 c2228 = c21984.f71304;
                                c11018.writeInt(c2228 == null ? -1 : c2228.m6852());
                                c11018.writeInt(c21984.f71305.m6852());
                                C12812 c12812 = c21984.f71301;
                                if (c12812.f42661 == 3) {
                                    int iM6852 = c21984.f71303.m6852();
                                    c12812.f42662 = iM6852;
                                    c12812.f42659 = iM6852;
                                }
                                c11018.writeInt(c12812.f42659);
                                c11018.writeInt((c12812.f42661 << 24) | 8);
                                c11018.writeInt(c12812.f42662);
                            }
                        }
                    }
                }
            } else if (iM11651 == 2) {
                C22451 c22451M11654 = c4105.m11653(i4);
                C0816 c0818 = (C0816) c22451M11654.m49933();
                c11018.writeInt(1048835);
                c11018.writeInt(24);
                c11018.writeInt(c22451M11654.m49938());
                c11018.writeInt(-1);
                C2227 c2229 = c0818.f3441;
                c11018.writeInt(c2229 != null ? c2229.m6852() : -1);
                c11018.writeInt(c0818.f3442.m6852());
            } else if (iM11651 == 3) {
                C1283 c1283M11657 = c4105.m11656(i4);
                C0816 c0819 = (C0816) c1283M11657.m4610();
                c11018.writeInt(1048833);
                c11018.writeInt(24);
                c11018.writeInt(c1283M11657.m4608());
                c11018.writeInt(-1);
                c11018.writeInt(c0819.f3441.m6852());
                c11018.writeInt(c0819.f3442.m6852());
            } else if (iM11651 == i2) {
                C13279 c13279M11655 = c4105.m11655(i4);
                C0816 c08110 = (C0816) c13279M11655.m32765();
                c11018.writeInt(1048836);
                c11018.writeInt(28);
                c11018.writeInt(c13279M11655.m32762());
                c11018.writeInt(-1);
                c11018.writeInt(c08110.f3441.m6852());
                c11018.writeInt(i);
                c11018.writeInt(i3);
            }
            i4++;
            i = 8;
            i2 = 4;
            i3 = 0;
        }
        long position2 = c11018.getPosition();
        c11018.seek(position);
        c11018.writeInt((int) ((position2 - position) + 4));
        c11018.seek(position2);
    }
}
