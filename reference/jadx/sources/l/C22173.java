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

/* JADX INFO: renamed from: l.᩷ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22173 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21246 f71398;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7075 f71399;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Map f71401;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C22145 f71402;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19935 f71404;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f71403 = new HashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f71400 = true;

    public C22173(C21246 c21246) {
        this.f71398 = c21246;
        this.f71399 = c21246.m48431();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50145(boolean z) {
        this.f71400 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50143(Map map) {
        this.f71401 = map;
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
    public final void m50142(CharSequence charSequence) {
        C19935 c19935;
        C2600 c2600M8727;
        C2600 c2600M19408;
        C19935 c19936;
        int i;
        int i2;
        int i3;
        int i4;
        StringBuilder sb;
        int i5;
        char cCharAt;
        char cCharAt2;
        boolean z;
        C13786[] c13786Arr;
        boolean z2;
        int iM29456;
        int length;
        int i6;
        int i7;
        C22145 c22145M50102 = C22145.m50102(charSequence);
        this.f71402 = c22145M50102;
        C19935 c19937 = new C19935();
        this.f71404 = c19937;
        int i8 = 0;
        while (i8 < c22145M50102.m50103()) {
            C13222 c13222 = new C13222();
            int iM50108 = c22145M50102.m50108(i8);
            if (iM50108 != 0) {
                int i9 = 1;
                if (iM50108 != 1) {
                    if (iM50108 == 2) {
                        C7272 c7272M50104 = c22145M50102.m50104(i8);
                        String strM19912 = c7272M50104.m19912();
                        if (!TextUtils.isEmpty(strM19912)) {
                            c13222.f42207 = c19937.m45861(strM19912);
                        }
                        c13222.f42208 = c19937.m45861(c7272M50104.m19911());
                        c7272M50104.m19910(c13222);
                    } else if (iM50108 == 3) {
                        C19935 c19938 = c19937;
                        C13983 c13983M50107 = c22145M50102.m50107(i8);
                        c19935 = c19938;
                        c13222.f42207 = c19935.m45861(c13983M50107.m34065());
                        c13222.f42208 = c19935.m45861(c13983M50107.m34066());
                        c13983M50107.m34063(c13222);
                    } else if (iM50108 == 4) {
                        C4991 c4991M50106 = c22145M50102.m50106(i8);
                        c13222.f42207 = c19937.m45861(c4991M50106.m15208());
                        c4991M50106.m15207(c13222);
                    }
                    c19935 = c19937;
                } else {
                    C7272 c7272M50105 = c22145M50102.m50104(i8);
                    String strM19913 = c7272M50105.m19912();
                    if (!TextUtils.isEmpty(strM19913)) {
                        c13222.f42207 = c19937.m45861(strM19913);
                    }
                    c13222.f42208 = c19937.m45861(c7272M50105.m19911());
                    c7272M50105.m19910(c13222);
                    Iterator it = ((ArrayList) c7272M50105.m19909()).iterator();
                    while (it.hasNext()) {
                        C8763 c8763 = (C8763) it.next();
                        C19935 c19939 = this.f71404;
                        C15459 c15459 = new C15459();
                        String strM23453 = c8763.m23453();
                        if (!TextUtils.isEmpty(strM23453)) {
                            c15459.f50329 = c19939.m45861(strM23453);
                        }
                        String strM23451 = c8763.m23451();
                        String strM23454 = c8763.m23453();
                        if (strM23454.isEmpty()) {
                            strM23451.getClass();
                            switch (strM23451) {
                                case "platformBuildVersionCode":
                                    c2600M8727 = C2600.f8347;
                                    break;
                                case "platformBuildVersionName":
                                    c2600M8727 = C2600.f8349;
                                    break;
                                case "layout":
                                    c2600M8727 = C2600.f8350;
                                    break;
                                case "package":
                                    c2600M8727 = C2600.f8348;
                                    break;
                                case "style":
                                    c2600M8727 = C2600.f8352;
                                    break;
                                case "coreApp":
                                    c2600M8727 = C2600.f8351;
                                    break;
                                default:
                                    c2600M8727 = C2600.m8727(65535, Integer.MAX_VALUE, strM23451);
                                    break;
                            }
                            c2600M19408 = c2600M8727;
                            c15459.f50331 = this.f71404.m45861(strM23451);
                        } else {
                            String strM46451 = C20196.m46451(strM23454, ":", strM23451);
                            HashMap map = this.f71403;
                            c2600M19408 = (C2600) map.get(strM46451);
                            if (c2600M19408 == null) {
                                c2600M19408 = this.f71399.m19408(strM23454, strM23451, this.f71401);
                                if (c2600M19408 == null) {
                                    throw new C10254("Unknown attr " + c8763.m23458(), c8763.m23457());
                                }
                                map.put(strM46451, c2600M19408);
                            }
                            c15459.f50331 = this.f71404.m45860(c2600M19408.f8353, strM23451);
                        }
                        C5765 c5765 = new C5765();
                        c15459.f50332 = c5765;
                        String strM23455 = c8763.m23455();
                        if (strM23455.contains("###")) {
                            System.out.println(i9);
                        }
                        boolean zStartsWith = strM23455.startsWith("@");
                        C21246 c21246 = this.f71398;
                        Iterator it2 = it;
                        if (zStartsWith) {
                            c5765.f19814 = i9;
                            String strSubstring = strM23455.substring(i9);
                            if (strSubstring.length() == 8 && C11730.m29453(strSubstring)) {
                                c5765.f19813 = C11730.m29456(strSubstring);
                            } else if (strSubstring.equals("null")) {
                                c5765.f19813 = 0;
                            } else {
                                int iM48429 = c21246.m48429(strSubstring);
                                if (iM48429 == -1) {
                                    throw new C10254(C3188.m10404("Resource not found: ", c8763.m23458(), "=\"", c8763.m23455(), "\""), c8763.m23454());
                                }
                                c5765.f19813 = iM48429;
                            }
                        } else {
                            if (strM23455.startsWith("?")) {
                                c5765.f19814 = 2;
                                String strSubstring2 = strM23455.substring(1);
                                if (strSubstring2.length() == 8 && C11730.m29453(strSubstring2)) {
                                    c5765.f19813 = C11730.m29456(strSubstring2);
                                } else {
                                    int iM484210 = c21246.m48429(strSubstring2);
                                    if (iM484210 == -1) {
                                        throw new C10254(C3188.m10404("Resource not found: ", c8763.m23458(), "=\"", c8763.m23455(), "\""), c8763.m23454());
                                    }
                                    c5765.f19813 = iM484210;
                                }
                            } else {
                                int i10 = c2600M19408.f8357;
                                C13786[] c13786Arr2 = c2600M19408.f8355;
                                if ((65536 & i10) != 0) {
                                    int length2 = c13786Arr2.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            int i12 = length2;
                                            C13786 c13786 = c13786Arr2[i11];
                                            c19936 = c19937;
                                            if (c13786.f43733.equals(strM23455)) {
                                                c5765.f19813 = c13786.f43735;
                                                c5765.f19814 = c13786.f43734;
                                            } else {
                                                i11++;
                                                length2 = i12;
                                                c19937 = c19936;
                                            }
                                        } else {
                                            c19936 = c19937;
                                            if (C11730.m29464(strM23455)) {
                                                int i13 = Integer.parseInt(strM23455);
                                                int length3 = c13786Arr2.length;
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 < length3) {
                                                        int i15 = length3;
                                                        if (c13786Arr2[i14].f43735 == i13) {
                                                            c5765.f19814 = 16;
                                                            c5765.f19813 = i13;
                                                        } else {
                                                            i14++;
                                                            length3 = i15;
                                                        }
                                                    } else if (C11730.m29462(strM23455)) {
                                                        iM29456 = C11730.m29456(strM23455.substring(2));
                                                        length = c13786Arr2.length;
                                                        i6 = 0;
                                                        while (true) {
                                                            if (i6 < length) {
                                                                i7 = length;
                                                                if (c13786Arr2[i6].f43735 == iM29456) {
                                                                    c5765.f19814 = 16;
                                                                    c5765.f19813 = iM29456;
                                                                } else {
                                                                    i6++;
                                                                    length = i7;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (C11730.m29462(strM23455)) {
                                                iM29456 = C11730.m29456(strM23455.substring(2));
                                                length = c13786Arr2.length;
                                                i6 = 0;
                                                while (true) {
                                                    if (i6 < length) {
                                                        i7 = length;
                                                        if (c13786Arr2[i6].f43735 == iM29456) {
                                                            c5765.f19814 = 16;
                                                            c5765.f19813 = iM29456;
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
                                    c19936 = c19937;
                                }
                                if ((131072 & i10) != 0) {
                                    c5765.f19814 = 17;
                                    String[] strArrSplit = strM23455.split("\\|");
                                    int length4 = strArrSplit.length;
                                    int i16 = 0;
                                    int iM29457 = 0;
                                    boolean z3 = false;
                                    while (true) {
                                        if (i16 < length4) {
                                            int i17 = length4;
                                            String strTrim = strArrSplit[i16].trim();
                                            c22145M50102 = c22145M50102;
                                            int length5 = c13786Arr2.length;
                                            i = i8;
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 < length5) {
                                                    int i19 = length5;
                                                    C13786 c13787 = c13786Arr2[i18];
                                                    c13786Arr = c13786Arr2;
                                                    if (c13787.f43733.equals(strTrim)) {
                                                        iM29457 |= c13787.f43735;
                                                        z2 = true;
                                                        z3 = true;
                                                    } else {
                                                        i18++;
                                                        length5 = i19;
                                                        c13786Arr2 = c13786Arr;
                                                    }
                                                } else {
                                                    c13786Arr = c13786Arr2;
                                                    z2 = false;
                                                }
                                            }
                                            if (!z2 && strArrSplit.length > 1 && C11730.m29462(strTrim)) {
                                                iM29457 |= C11730.m29456(strTrim.substring(2));
                                                z2 = true;
                                                z3 = true;
                                            }
                                            if (z2) {
                                                i16++;
                                                c22145M50102 = c22145M50102;
                                                length4 = i17;
                                                i8 = i;
                                                c13786Arr2 = c13786Arr;
                                            } else {
                                                z = true;
                                            }
                                        } else {
                                            c22145M50102 = c22145M50102;
                                            i = i8;
                                            z = false;
                                        }
                                    }
                                    int i20 = iM29457;
                                    if (!z && z3) {
                                        c5765.f19813 = i20;
                                    } else if (!z3 && C11730.m29464(strM23455)) {
                                        c5765.f19813 = Integer.parseInt(strM23455);
                                    } else if (!z3 && C11730.m29462(strM23455)) {
                                        c5765.f19813 = C11730.m29456(strM23455.substring(2));
                                    }
                                } else {
                                    c22145M50102 = c22145M50102;
                                    i = i8;
                                }
                                if ((i10 & 16) != 0 && strM23455.startsWith("#")) {
                                    String strM10404 = (strM23455.length() == 1 || !C11730.m29453(strM23455.substring(1))) ? C3188.m10404("Color value invalid: ", c8763.m23458(), "=\"", c8763.m23455(), "\"") : null;
                                    if (!C11730.m29454(strM23455, c5765)) {
                                        strM10404 = C3188.m10404("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ", c8763.m23458(), "=\"", c8763.m23455(), "\"");
                                    }
                                    if (strM10404 != null) {
                                        if ((i10 & 2) == 0) {
                                            throw new C10254(strM10404, c8763.m23454());
                                        }
                                        if ((i10 & 4) != 0) {
                                            i2 = i10 & 32;
                                            if (i2 != 0) {
                                                i4 = c5765.f19814;
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
                                                i4 = c5765.f19814;
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
                                                i4 = c5765.f19814;
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
                                                i4 = c5765.f19814;
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
                                } else if ((i10 & 4) != 0 || !C11730.m29458(strM23455, c5765)) {
                                    i2 = i10 & 32;
                                    if (!(i2 != 0 && (i10 & 64) == 0 && (i10 & 128) == 0) && C11730.m29463(strM23455, c5765) && ((i3 = i10 & 2) == 0 || C11730.m29455(c5765))) {
                                        i4 = c5765.f19814;
                                        if (i4 == 4 || i2 != 0) {
                                            if (i4 == 6 || (i10 & 128) != 0) {
                                                if (i4 != 5 && (i10 & 64) == 0) {
                                                    if (i3 == 0) {
                                                        throw new C10254(C3188.m10404("Dimension value is not allowed here: ", c8763.m23458(), "=\"", c8763.m23455(), "\""), c8763.m23454());
                                                    }
                                                }
                                            } else if (i3 == 0) {
                                                throw new C10254(C3188.m10404("Fraction value is not allowed here: ", c8763.m23458(), "=\"", c8763.m23455(), "\""), c8763.m23454());
                                            }
                                        } else if (i3 == 0) {
                                            throw new C10254(C3188.m10404("Float value is not allowed here: ", c8763.m23458(), "=\"", c8763.m23455(), "\""), c8763.m23454());
                                        }
                                        if ((i10 & 8) == 0) {
                                            if (!strM23455.startsWith("<") && strM23455.endsWith(">")) {
                                                Matcher matcher = Pattern.compile("<0x([0-9a-f]{1,8}), type 0x([0-9a-f]{2})>").matcher(strM23455.toLowerCase());
                                                if (matcher.matches()) {
                                                    String strGroup = matcher.group(1);
                                                    C17359.requireNonNull(strGroup);
                                                    c5765.f19813 = C11730.m29456(strGroup);
                                                    String strGroup2 = matcher.group(2);
                                                    C17359.requireNonNull(strGroup2);
                                                    c5765.f19814 = C11730.m29456(strGroup2);
                                                } else {
                                                    if ((i10 & 2) != 0) {
                                                        throw new C10254(C8947.m23910(C3188.m10406("Error: ", c8763.m23458(), "=\"", c8763.m23455(), "\" ["), c2600M19408.m8731(), "]"), c8763.m23454());
                                                    }
                                                    c5765.f19814 = 3;
                                                    C19935 c199310 = this.f71404;
                                                    if (strM23455.indexOf(92) != -1) {
                                                        sb = new StringBuilder(strM23455.length() + 10);
                                                        i5 = 0;
                                                        while (i5 < strM23455.length()) {
                                                            cCharAt = strM23455.charAt(i5);
                                                            if (cCharAt == '\\') {
                                                                i5++;
                                                                if (i5 >= strM23455.length()) {
                                                                    cCharAt2 = strM23455.charAt(i5);
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
                                                        strM23455 = sb.toString();
                                                    }
                                                    c15459.f50330 = c199310.m45861(strM23455);
                                                }
                                            } else {
                                                if ((i10 & 2) != 0) {
                                                    throw new C10254(C8947.m23910(C3188.m10406("Error: ", c8763.m23458(), "=\"", c8763.m23455(), "\" ["), c2600M19408.m8731(), "]"), c8763.m23454());
                                                }
                                                c5765.f19814 = 3;
                                                C19935 c199311 = this.f71404;
                                                if (strM23455.indexOf(92) != -1) {
                                                    sb = new StringBuilder(strM23455.length() + 10);
                                                    i5 = 0;
                                                    while (i5 < strM23455.length()) {
                                                        cCharAt = strM23455.charAt(i5);
                                                        if (cCharAt == '\\') {
                                                            i5++;
                                                            if (i5 >= strM23455.length()) {
                                                                cCharAt2 = strM23455.charAt(i5);
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
                                                    strM23455 = sb.toString();
                                                }
                                                c15459.f50330 = c199311.m45861(strM23455);
                                            }
                                        } else if (strM23455.equals("true")) {
                                            c5765.f19813 = -1;
                                            c5765.f19814 = 18;
                                        } else if (strM23455.equals("false")) {
                                            c5765.f19813 = 0;
                                            c5765.f19814 = 18;
                                        } else if (!strM23455.startsWith("<")) {
                                            if ((i10 & 2) != 0) {
                                                throw new C10254(C8947.m23910(C3188.m10406("Error: ", c8763.m23458(), "=\"", c8763.m23455(), "\" ["), c2600M19408.m8731(), "]"), c8763.m23454());
                                            }
                                            c5765.f19814 = 3;
                                            C19935 c199312 = this.f71404;
                                            if (strM23455.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM23455.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM23455.length()) {
                                                    cCharAt = strM23455.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM23455.length()) {
                                                            cCharAt2 = strM23455.charAt(i5);
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
                                                strM23455 = sb.toString();
                                            }
                                            c15459.f50330 = c199312.m45861(strM23455);
                                        } else {
                                            if ((i10 & 2) != 0) {
                                                throw new C10254(C8947.m23910(C3188.m10406("Error: ", c8763.m23458(), "=\"", c8763.m23455(), "\" ["), c2600M19408.m8731(), "]"), c8763.m23454());
                                            }
                                            c5765.f19814 = 3;
                                            C19935 c199313 = this.f71404;
                                            if (strM23455.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM23455.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM23455.length()) {
                                                    cCharAt = strM23455.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM23455.length()) {
                                                            cCharAt2 = strM23455.charAt(i5);
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
                                                strM23455 = sb.toString();
                                            }
                                            c15459.f50330 = c199313.m45861(strM23455);
                                        }
                                    } else if ((i10 & 8) == 0) {
                                        if (!strM23455.startsWith("<")) {
                                            if ((i10 & 2) != 0) {
                                                throw new C10254(C8947.m23910(C3188.m10406("Error: ", c8763.m23458(), "=\"", c8763.m23455(), "\" ["), c2600M19408.m8731(), "]"), c8763.m23454());
                                            }
                                            c5765.f19814 = 3;
                                            C19935 c199314 = this.f71404;
                                            if (strM23455.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM23455.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM23455.length()) {
                                                    cCharAt = strM23455.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM23455.length()) {
                                                            cCharAt2 = strM23455.charAt(i5);
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
                                                strM23455 = sb.toString();
                                            }
                                            c15459.f50330 = c199314.m45861(strM23455);
                                        } else {
                                            if ((i10 & 2) != 0) {
                                                throw new C10254(C8947.m23910(C3188.m10406("Error: ", c8763.m23458(), "=\"", c8763.m23455(), "\" ["), c2600M19408.m8731(), "]"), c8763.m23454());
                                            }
                                            c5765.f19814 = 3;
                                            C19935 c199315 = this.f71404;
                                            if (strM23455.indexOf(92) != -1) {
                                                sb = new StringBuilder(strM23455.length() + 10);
                                                i5 = 0;
                                                while (i5 < strM23455.length()) {
                                                    cCharAt = strM23455.charAt(i5);
                                                    if (cCharAt == '\\') {
                                                        i5++;
                                                        if (i5 >= strM23455.length()) {
                                                            cCharAt2 = strM23455.charAt(i5);
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
                                                strM23455 = sb.toString();
                                            }
                                            c15459.f50330 = c199315.m45861(strM23455);
                                        }
                                    } else if (strM23455.equals("true")) {
                                        c5765.f19813 = -1;
                                        c5765.f19814 = 18;
                                    } else if (strM23455.equals("false")) {
                                        c5765.f19813 = 0;
                                        c5765.f19814 = 18;
                                    } else if (!strM23455.startsWith("<")) {
                                        if ((i10 & 2) != 0) {
                                            throw new C10254(C8947.m23910(C3188.m10406("Error: ", c8763.m23458(), "=\"", c8763.m23455(), "\" ["), c2600M19408.m8731(), "]"), c8763.m23454());
                                        }
                                        c5765.f19814 = 3;
                                        C19935 c199316 = this.f71404;
                                        if (strM23455.indexOf(92) != -1) {
                                            sb = new StringBuilder(strM23455.length() + 10);
                                            i5 = 0;
                                            while (i5 < strM23455.length()) {
                                                cCharAt = strM23455.charAt(i5);
                                                if (cCharAt == '\\') {
                                                    i5++;
                                                    if (i5 >= strM23455.length()) {
                                                        cCharAt2 = strM23455.charAt(i5);
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
                                            strM23455 = sb.toString();
                                        }
                                        c15459.f50330 = c199316.m45861(strM23455);
                                    } else {
                                        if ((i10 & 2) != 0) {
                                            throw new C10254(C8947.m23910(C3188.m10406("Error: ", c8763.m23458(), "=\"", c8763.m23455(), "\" ["), c2600M19408.m8731(), "]"), c8763.m23454());
                                        }
                                        c5765.f19814 = 3;
                                        C19935 c199317 = this.f71404;
                                        if (strM23455.indexOf(92) != -1) {
                                            sb = new StringBuilder(strM23455.length() + 10);
                                            i5 = 0;
                                            while (i5 < strM23455.length()) {
                                                cCharAt = strM23455.charAt(i5);
                                                if (cCharAt == '\\') {
                                                    i5++;
                                                    if (i5 >= strM23455.length()) {
                                                        cCharAt2 = strM23455.charAt(i5);
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
                                            strM23455 = sb.toString();
                                        }
                                        c15459.f50330 = c199317.m45861(strM23455);
                                    }
                                }
                            }
                            c15459.f50328 = c2600M19408;
                            c8763.m23452(c15459);
                            i9 = 1;
                            it = it2;
                            c19937 = c19936;
                            c22145M50102 = c22145M50102;
                            i8 = i;
                        }
                        c19936 = c19937;
                        i = i8;
                        c15459.f50328 = c2600M19408;
                        c8763.m23452(c15459);
                        i9 = 1;
                        it = it2;
                        c19937 = c19936;
                        c22145M50102 = c22145M50102;
                        i8 = i;
                    }
                    Collections.sort(c7272M50105.m19909(), new C5019());
                    c19935 = c19937;
                    c22145M50102 = c22145M50102;
                }
            } else {
                C19935 c199318 = c19937;
                C13983 c13983M50108 = c22145M50102.m50107(i8);
                c19935 = c199318;
                c13222.f42207 = c19935.m45861(c13983M50108.m34065());
                c13222.f42208 = c19935.m45861(c13983M50108.m34066());
                c13983M50108.m34063(c13222);
            }
            i8++;
            c19937 = c19935;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50144(C6178 c6178) {
        C22145 c22145 = this.f71402;
        c6178.mo17788((short) 3);
        int i = 8;
        c6178.mo17788((short) 8);
        long position = c6178.getPosition();
        int i2 = 4;
        c6178.skipBytes(4);
        int i3 = 0;
        this.f71404.m45859(this.f71400).m31249((InterfaceC23332) c6178, false, (C3374) null);
        int[] iArrM45862 = this.f71404.m45862();
        if (iArrM45862.length > 0) {
            c6178.mo17812(MLKEMEngine.KyberPolyBytes);
            c6178.mo17812(8);
            c6178.writeInt((iArrM45862.length * 4) + 8);
            c6178.mo17790(iArrM45862);
        }
        int i4 = 0;
        while (i4 < c22145.m50103()) {
            int iM50108 = c22145.m50108(i4);
            if (iM50108 == 0) {
                C13983 c13983M50107 = c22145.m50107(i4);
                C13222 c13222 = (C13222) c13983M50107.m34064();
                c6178.writeInt(1048832);
                c6178.writeInt(24);
                c6178.writeInt(c13983M50107.m34062());
                c6178.writeInt(-1);
                c6178.writeInt(c13222.f42207.m51676());
                c6178.writeInt(c13222.f42208.m51676());
            } else if (iM50108 == 1) {
                C7272 c7272M50104 = c22145.m50104(i4);
                C13222 c13223 = (C13222) c7272M50104.m19914();
                List listM19909 = c7272M50104.m19909();
                c6178.writeInt(1048834);
                int size = ((ArrayList) listM19909).size();
                c6178.writeInt((size * 20) + 36);
                c6178.writeInt(c7272M50104.m19913());
                c6178.writeInt(-1);
                C22919 c22919 = c13223.f42207;
                c6178.writeInt(c22919 == null ? -1 : c22919.m51676());
                c6178.writeInt(c13223.f42208.m51676());
                c6178.mo17812(20);
                c6178.mo17812(20);
                if (size == 0) {
                    c6178.m17803(0L);
                } else {
                    c6178.mo17788((short) size);
                    int i5 = 0;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) listM19909;
                        if (i5 < arrayList.size()) {
                            String strM23451 = ((C8763) arrayList.get(i5)).m23451();
                            strM23451.getClass();
                            switch (strM23451) {
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
                            c6178.mo17788(s);
                            c6178.mo17788(s2);
                            c6178.mo17788(s3);
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                C15459 c15459 = (C15459) ((C8763) arrayList.get(i6)).m23456();
                                C22919 c229110 = c15459.f50329;
                                c6178.writeInt(c229110 == null ? -1 : c229110.m51676());
                                c6178.writeInt(c15459.f50331.m51676());
                                C5765 c5765 = c15459.f50332;
                                if (c5765.f19814 == 3) {
                                    int iM51676 = c15459.f50330.m51676();
                                    c5765.f19813 = iM51676;
                                    c5765.f19816 = iM51676;
                                }
                                c6178.writeInt(c5765.f19816);
                                c6178.writeInt((c5765.f19814 << 24) | 8);
                                c6178.writeInt(c5765.f19813);
                            }
                        }
                    }
                }
            } else if (iM50108 == 2) {
                C7272 c7272M50105 = c22145.m50104(i4);
                C13222 c13224 = (C13222) c7272M50105.m19914();
                c6178.writeInt(1048835);
                c6178.writeInt(24);
                c6178.writeInt(c7272M50105.m19913());
                c6178.writeInt(-1);
                C22919 c229111 = c13224.f42207;
                c6178.writeInt(c229111 != null ? c229111.m51676() : -1);
                c6178.writeInt(c13224.f42208.m51676());
            } else if (iM50108 == 3) {
                C13983 c13983M50108 = c22145.m50107(i4);
                C13222 c13225 = (C13222) c13983M50108.m34064();
                c6178.writeInt(1048833);
                c6178.writeInt(24);
                c6178.writeInt(c13983M50108.m34062());
                c6178.writeInt(-1);
                c6178.writeInt(c13225.f42207.m51676());
                c6178.writeInt(c13225.f42208.m51676());
            } else if (iM50108 == i2) {
                C4991 c4991M50106 = c22145.m50106(i4);
                C13222 c13226 = (C13222) c4991M50106.m15209();
                c6178.writeInt(1048836);
                c6178.writeInt(28);
                c6178.writeInt(c4991M50106.m15206());
                c6178.writeInt(-1);
                c6178.writeInt(c13226.f42207.m51676());
                c6178.writeInt(i);
                c6178.writeInt(i3);
            }
            i4++;
            i = 8;
            i2 = 4;
            i3 = 0;
        }
        long position2 = c6178.getPosition();
        c6178.seek(position);
        c6178.writeInt((int) ((position2 - position) + 4));
        c6178.seek(position2);
    }
}
