package l;

import com.alipay.sdk.m.y.q;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩻֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23351 {
    public static final C23351 f;
    public static final C23351 g;
    public static final C23351 h;
    public final C2658 a;
    public final Locale b;
    public final C4775 c;
    public final EnumC5481 d;
    public final InterfaceC21233 e;

    /* JADX WARN: Code duplicated, block: B:120:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x022b  */
    /* JADX WARN: Code duplicated, block: B:133:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x026c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0270  */
    /* JADX WARN: Code duplicated, block: B:154:0x027f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0283  */
    /* JADX WARN: Code duplicated, block: B:157:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0291  */
    /* JADX WARN: Code duplicated, block: B:160:0x0296  */
    /* JADX WARN: Code duplicated, block: B:263:0x048a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0494  */
    /* JADX WARN: Code duplicated, block: B:266:0x0498  */
    /* JADX WARN: Code duplicated, block: B:301:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x04a3 A[SYNTHETIC] */
    public static C23351 ofPattern(String str, Locale locale) {
        String strSubstring;
        int i;
        int i2;
        C0541 c0541;
        boolean z;
        C16770 c16770 = new C16770();
        C13638.requireNonNull(str, "pattern");
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == cCharAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (cCharAt == 'p') {
                    if (i4 >= str.length() || (((cCharAt = str.charAt(i4)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i = i4;
                        i2 = i5;
                        i5 = 0;
                    } else {
                        i = i4 + 1;
                        while (i < str.length() && str.charAt(i) == cCharAt) {
                            i++;
                        }
                        i2 = i - i4;
                    }
                    if (i5 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i5 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i5);
                    }
                    C16770 c16771 = c16770.a;
                    c16771.e = i5;
                    c16771.f = ' ';
                    c16771.g = -1;
                } else {
                    i = i4;
                    i2 = i5;
                }
                InterfaceC11002 interfaceC11002 = (InterfaceC11002) ((HashMap) C16770.i).get(Character.valueOf(cCharAt));
                if (interfaceC11002 != null) {
                    if (cCharAt == 'A') {
                        c16770.m(interfaceC11002, i2, 19, EnumC1247.NOT_NEGATIVE);
                    } else if (cCharAt == 'Q') {
                        z = false;
                        if (i2 == 1 || i2 == 2) {
                            if (cCharAt == 'e') {
                                c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                            } else if (cCharAt == 'E') {
                                c16770.i(interfaceC11002, EnumC4069.SHORT);
                            } else if (i2 == 1) {
                                c16770.k(interfaceC11002);
                            } else {
                                c16770.l(interfaceC11002, 2);
                            }
                        } else if (i2 == 3) {
                            c16770.i(interfaceC11002, z ? EnumC4069.SHORT_STANDALONE : EnumC4069.SHORT);
                        } else if (i2 == 4) {
                            c16770.i(interfaceC11002, z ? EnumC4069.FULL_STANDALONE : EnumC4069.FULL);
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c16770.i(interfaceC11002, z ? EnumC4069.NARROW_STANDALONE : EnumC4069.NARROW);
                        }
                    } else if (cCharAt == 'S') {
                        c16770.b(EnumC18762.NANO_OF_SECOND, i2, i2, false);
                    } else if (cCharAt == 'a') {
                        if (i2 != 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c16770.i(interfaceC11002, EnumC4069.SHORT);
                    } else if (cCharAt != 'k') {
                        if (cCharAt != 'q') {
                            if (cCharAt == 's') {
                                if (i2 == 1) {
                                    c16770.k(interfaceC11002);
                                } else {
                                    if (i2 == 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    c16770.l(interfaceC11002, i2);
                                }
                            } else if (cCharAt == 'u' || cCharAt == 'y') {
                                if (i2 == 2) {
                                    C18991 c18991 = C10421.h;
                                    C13638.requireNonNull(interfaceC11002, "field");
                                    C13638.requireNonNull(c18991, "baseDate");
                                    C10421 c10421 = new C10421(interfaceC11002, 2, 2, c18991, 0);
                                    if (c18991 == null) {
                                        long j = 0;
                                        if (!interfaceC11002.s().e(j)) {
                                            throw new IllegalArgumentException("The base value must be within the range of the field");
                                        }
                                        if (j + C21709.f[2] > 2147483647L) {
                                            throw new C15464("Unable to add printer-parser as the range exceeds the capacity of an int");
                                        }
                                    }
                                    c16770.j(c10421);
                                } else if (i2 < 4) {
                                    c16770.m(interfaceC11002, i2, 19, EnumC1247.NORMAL);
                                } else {
                                    c16770.m(interfaceC11002, i2, 19, EnumC1247.EXCEEDS_PAD);
                                }
                            } else if (cCharAt == 'g') {
                                c16770.m(interfaceC11002, i2, 19, EnumC1247.NORMAL);
                            } else if (cCharAt == 'h' || cCharAt == 'm') {
                                if (i2 == 1) {
                                    c16770.k(interfaceC11002);
                                } else {
                                    if (i2 == 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    c16770.l(interfaceC11002, i2);
                                }
                            } else if (cCharAt != 'n') {
                                switch (cCharAt) {
                                    case 'D':
                                        if (i2 == 1) {
                                            c16770.k(interfaceC11002);
                                        } else {
                                            if (i2 != 2 && i2 != 3) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c16770.m(interfaceC11002, i2, 3, EnumC1247.NOT_NEGATIVE);
                                        }
                                        break;
                                    case 'E':
                                        z = false;
                                        if (i2 == 1) {
                                            if (cCharAt == 'e') {
                                                c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                                            } else if (cCharAt == 'E') {
                                                c16770.i(interfaceC11002, EnumC4069.SHORT);
                                            } else if (i2 == 1) {
                                                c16770.l(interfaceC11002, 2);
                                            } else {
                                                c16770.k(interfaceC11002);
                                            }
                                        } else if (cCharAt == 'e') {
                                            c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                                        } else if (cCharAt == 'E') {
                                            c16770.i(interfaceC11002, EnumC4069.SHORT);
                                        } else if (i2 == 1) {
                                            c16770.l(interfaceC11002, 2);
                                        } else {
                                            c16770.k(interfaceC11002);
                                        }
                                        break;
                                    case 'F':
                                        if (i2 != 1) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        c16770.k(interfaceC11002);
                                        break;
                                        break;
                                    case 'G':
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            c16770.i(interfaceC11002, EnumC4069.SHORT);
                                        } else if (i2 == 4) {
                                            c16770.i(interfaceC11002, EnumC4069.FULL);
                                        } else {
                                            if (i2 != 5) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c16770.i(interfaceC11002, EnumC4069.NARROW);
                                        }
                                        break;
                                    case 'H':
                                        if (i2 == 1) {
                                            c16770.k(interfaceC11002);
                                        } else {
                                            if (i2 == 2) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c16770.l(interfaceC11002, i2);
                                        }
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case 'K':
                                                if (i2 == 1) {
                                                    c16770.k(interfaceC11002);
                                                } else {
                                                    if (i2 == 2) {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    c16770.l(interfaceC11002, i2);
                                                }
                                                break;
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                break;
                                            case 'M':
                                                z = false;
                                                if (i2 == 1) {
                                                    if (cCharAt == 'e') {
                                                        c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                                                    } else if (cCharAt == 'E') {
                                                        c16770.i(interfaceC11002, EnumC4069.SHORT);
                                                    } else if (i2 == 1) {
                                                        c16770.l(interfaceC11002, 2);
                                                    } else {
                                                        c16770.k(interfaceC11002);
                                                    }
                                                } else if (cCharAt == 'e') {
                                                    c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                                                } else if (cCharAt == 'E') {
                                                    c16770.i(interfaceC11002, EnumC4069.SHORT);
                                                } else if (i2 == 1) {
                                                    c16770.l(interfaceC11002, 2);
                                                } else {
                                                    c16770.k(interfaceC11002);
                                                }
                                                break;
                                            case 'N':
                                                c16770.m(interfaceC11002, i2, 19, EnumC1247.NOT_NEGATIVE);
                                                break;
                                            default:
                                                switch (cCharAt) {
                                                    case q.f /* 99 */:
                                                        if (i2 == 1) {
                                                            c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                                                        } else if (i2 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        break;
                                                    case 'd':
                                                        if (i2 == 1) {
                                                            c16770.k(interfaceC11002);
                                                        } else {
                                                            if (i2 == 2) {
                                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                            }
                                                            c16770.l(interfaceC11002, i2);
                                                        }
                                                        break;
                                                    case 'e':
                                                        z = false;
                                                        if (i2 == 1) {
                                                            if (cCharAt == 'e') {
                                                                c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                                                            } else if (cCharAt == 'E') {
                                                                c16770.i(interfaceC11002, EnumC4069.SHORT);
                                                            } else if (i2 == 1) {
                                                                c16770.l(interfaceC11002, 2);
                                                            } else {
                                                                c16770.k(interfaceC11002);
                                                            }
                                                        } else if (cCharAt == 'e') {
                                                            c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                                                        } else if (cCharAt == 'E') {
                                                            c16770.i(interfaceC11002, EnumC4069.SHORT);
                                                        } else if (i2 == 1) {
                                                            c16770.l(interfaceC11002, 2);
                                                        } else {
                                                            c16770.k(interfaceC11002);
                                                        }
                                                        break;
                                                    default:
                                                        if (i2 != 1) {
                                                            c16770.l(interfaceC11002, i2);
                                                        } else {
                                                            c16770.k(interfaceC11002);
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                c16770.m(interfaceC11002, i2, 19, EnumC1247.NOT_NEGATIVE);
                            }
                        }
                        z = true;
                        if (i2 == 1) {
                            if (cCharAt == 'e') {
                                c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                            } else if (cCharAt == 'E') {
                                c16770.i(interfaceC11002, EnumC4069.SHORT);
                            } else if (i2 == 1) {
                                c16770.k(interfaceC11002);
                            } else {
                                c16770.l(interfaceC11002, 2);
                            }
                        } else if (cCharAt == 'e') {
                            c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                        } else if (cCharAt == 'E') {
                            c16770.i(interfaceC11002, EnumC4069.SHORT);
                        } else if (i2 == 1) {
                            c16770.k(interfaceC11002);
                        } else {
                            c16770.l(interfaceC11002, 2);
                        }
                    } else if (i2 == 1) {
                        c16770.k(interfaceC11002);
                    } else {
                        if (i2 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c16770.l(interfaceC11002, i2);
                    }
                } else if (cCharAt == 'z') {
                    if (i2 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    c16770.c(i2 == 4 ? new C0541(EnumC4069.FULL, false) : new C0541(EnumC4069.SHORT, false));
                } else if (cCharAt == 'V') {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    c16770.c(new C20298(AbstractC23702.a, "ZoneId()"));
                } else if (cCharAt == 'v') {
                    if (i2 == 1) {
                        c0541 = new C0541(EnumC4069.SHORT, true);
                    } else {
                        if (i2 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                        }
                        c0541 = new C0541(EnumC4069.FULL, true);
                    }
                    c16770.c(c0541);
                } else {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i2 < 4) {
                            c16770.g("+HHMM", "+0000");
                        } else if (i2 == 4) {
                            c16770.f(EnumC4069.FULL);
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c16770.g("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i2 == 1) {
                            c16770.f(EnumC4069.SHORT);
                        } else {
                            if (i2 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            c16770.f(EnumC4069.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i2 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c16770.g(C18181.d[i2 + (i2 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i2 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i2 == 1) {
                            str2 = "+00";
                        } else if (i2 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        c16770.g(C18181.d[i2 + (i2 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i2 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c16770.j(new C16065(cCharAt, i2, i2, i2, 0));
                    } else if (cCharAt == 'w') {
                        if (i2 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c16770.j(new C16065(cCharAt, i2, i2, 2, 0));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        if (i2 == 2) {
                            c16770.j(new C16065(cCharAt, i2, i2, 2, 0));
                        } else {
                            c16770.j(new C16065(cCharAt, i2, i2, 19, 0));
                        }
                    }
                }
                i3 = i - 1;
            } else if (cCharAt == '\'') {
                int i6 = i3 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 < str.length() && str.charAt(i8) == '\'') {
                            i7 = i8;
                        } else {
                            if (i7 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i6, i7);
                            if (strSubstring.isEmpty()) {
                                c16770.d('\'');
                            } else {
                                c16770.e(strSubstring.replace("''", "'"));
                            }
                            i3 = i7;
                        }
                    }
                    i7++;
                }
                if (i7 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i6, i7);
                if (strSubstring.isEmpty()) {
                    c16770.d('\'');
                } else {
                    c16770.e(strSubstring.replace("''", "'"));
                }
                i3 = i7;
            } else if (cCharAt == '[') {
                c16770.o();
            } else if (cCharAt == ']') {
                if (c16770.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                c16770.n();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                c16770.d(cCharAt);
            }
            i3++;
        }
        return c16770.q(locale, EnumC5481.SMART, null);
    }

    static {
        C16770 c16770 = new C16770();
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        EnumC1247 enumC1247 = EnumC1247.EXCEEDS_PAD;
        c16770.m(enumC18762, 4, 10, enumC1247);
        c16770.d('-');
        EnumC18762 enumC18763 = EnumC18762.MONTH_OF_YEAR;
        c16770.l(enumC18763, 2);
        c16770.d('-');
        EnumC18762 enumC18764 = EnumC18762.DAY_OF_MONTH;
        c16770.l(enumC18764, 2);
        EnumC5481 enumC5481 = EnumC5481.STRICT;
        C7122 c7122 = C7122.c;
        C23351 c23351P = c16770.p(enumC5481, c7122);
        f = c23351P;
        C16770 c16771 = new C16770();
        EnumC7598 enumC7598 = EnumC7598.INSENSITIVE;
        c16771.c(enumC7598);
        c16771.a(c23351P);
        C18181 c18181 = C18181.e;
        c16771.c(c18181);
        c16771.p(enumC5481, c7122);
        C16770 c16772 = new C16770();
        c16772.c(enumC7598);
        c16772.a(c23351P);
        c16772.o();
        c16772.c(c18181);
        c16772.p(enumC5481, c7122);
        C16770 c16773 = new C16770();
        EnumC18762 enumC18765 = EnumC18762.HOUR_OF_DAY;
        c16773.l(enumC18765, 2);
        c16773.d(':');
        EnumC18762 enumC18766 = EnumC18762.MINUTE_OF_HOUR;
        c16773.l(enumC18766, 2);
        c16773.o();
        c16773.d(':');
        EnumC18762 enumC18767 = EnumC18762.SECOND_OF_MINUTE;
        c16773.l(enumC18767, 2);
        c16773.o();
        c16773.b(EnumC18762.NANO_OF_SECOND, 0, 9, true);
        C23351 c23351P2 = c16773.p(enumC5481, null);
        C16770 c16774 = new C16770();
        c16774.c(enumC7598);
        c16774.a(c23351P2);
        c16774.c(c18181);
        c16774.p(enumC5481, null);
        C16770 c16775 = new C16770();
        c16775.c(enumC7598);
        c16775.a(c23351P2);
        c16775.o();
        c16775.c(c18181);
        c16775.p(enumC5481, null);
        C16770 c16776 = new C16770();
        c16776.c(enumC7598);
        c16776.a(c23351P);
        c16776.d('T');
        c16776.a(c23351P2);
        C23351 c23351P3 = c16776.p(enumC5481, c7122);
        C16770 c16777 = new C16770();
        c16777.c(enumC7598);
        c16777.a(c23351P3);
        EnumC7598 enumC7599 = EnumC7598.LENIENT;
        c16777.c(enumC7599);
        c16777.c(c18181);
        EnumC7598 enumC75910 = EnumC7598.STRICT;
        c16777.c(enumC75910);
        C23351 c23351P4 = c16777.p(enumC5481, c7122);
        g = c23351P4;
        C16770 c16778 = new C16770();
        c16778.a(c23351P4);
        c16778.o();
        c16778.d('[');
        EnumC7598 enumC75911 = EnumC7598.SENSITIVE;
        c16778.c(enumC75911);
        C22935 c22935 = C16770.h;
        c16778.c(new C20298(c22935, "ZoneRegionId()"));
        c16778.d(']');
        c16778.p(enumC5481, c7122);
        C16770 c16779 = new C16770();
        c16779.a(c23351P3);
        c16779.o();
        c16779.c(c18181);
        c16779.o();
        c16779.d('[');
        c16779.c(enumC75911);
        c16779.c(new C20298(c22935, "ZoneRegionId()"));
        c16779.d(']');
        c16779.p(enumC5481, c7122);
        C16770 c167710 = new C16770();
        c167710.c(enumC7598);
        c167710.m(enumC18762, 4, 10, enumC1247);
        c167710.d('-');
        c167710.l(EnumC18762.DAY_OF_YEAR, 3);
        c167710.o();
        c167710.c(c18181);
        c167710.p(enumC5481, c7122);
        C16770 c167711 = new C16770();
        c167711.c(enumC7598);
        c167711.m(AbstractC20174.c, 4, 10, enumC1247);
        c167711.e("-W");
        c167711.l(AbstractC20174.b, 2);
        c167711.d('-');
        EnumC18762 enumC18768 = EnumC18762.DAY_OF_WEEK;
        c167711.l(enumC18768, 1);
        c167711.o();
        c167711.c(c18181);
        c167711.p(enumC5481, c7122);
        C16770 c167712 = new C16770();
        c167712.c(enumC7598);
        c167712.c(new C6892());
        h = c167712.p(enumC5481, null);
        C16770 c167713 = new C16770();
        c167713.c(enumC7598);
        c167713.l(enumC18762, 4);
        c167713.l(enumC18763, 2);
        c167713.l(enumC18764, 2);
        c167713.o();
        c167713.c(enumC7599);
        c167713.g("+HHMMss", "Z");
        c167713.c(enumC75910);
        c167713.p(enumC5481, c7122);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        C16770 c167714 = new C16770();
        c167714.c(enumC7598);
        c167714.c(enumC7599);
        c167714.o();
        c167714.h(enumC18768, map);
        c167714.e(", ");
        c167714.n();
        c167714.m(enumC18764, 1, 2, EnumC1247.NOT_NEGATIVE);
        c167714.d(' ');
        c167714.h(enumC18763, map2);
        c167714.d(' ');
        c167714.l(enumC18762, 4);
        c167714.d(' ');
        c167714.l(enumC18765, 2);
        c167714.d(':');
        c167714.l(enumC18766, 2);
        c167714.o();
        c167714.d(':');
        c167714.l(enumC18767, 2);
        c167714.n();
        c167714.d(' ');
        c167714.g("+HHMM", "GMT");
        c167714.p(EnumC5481.SMART, c7122);
    }

    public C23351(C2658 c2658, Locale locale, EnumC5481 enumC5481, InterfaceC21233 interfaceC21233) {
        C4775 c4775 = C4775.a;
        this.a = (C2658) C13638.requireNonNull(c2658, "printerParser");
        this.b = (Locale) C13638.requireNonNull(locale, "locale");
        this.c = (C4775) C13638.requireNonNull(c4775, "decimalStyle");
        this.d = (EnumC5481) C13638.requireNonNull(enumC5481, "resolverStyle");
        this.e = interfaceC21233;
    }

    public String format(InterfaceC21584 interfaceC21584) {
        StringBuilder sb = new StringBuilder(32);
        C2658 c2658 = this.a;
        C13638.requireNonNull(interfaceC21584, "temporal");
        C13638.requireNonNull(sb, "appendable");
        try {
            c2658.l(new C11126(interfaceC21584, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C15464(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x032a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0336  */
    /* JADX WARN: Code duplicated, block: B:131:0x0367  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0271  */
    /* JADX WARN: Code duplicated, block: B:92:0x0277  */
    /* JADX WARN: Code duplicated, block: B:97:0x0293  */
    public final C11832 a(CharSequence charSequence) {
        String string;
        InterfaceC11002 interfaceC11002;
        EnumC18762 enumC18762;
        Map map;
        EnumC18762 enumC18763;
        InterfaceC11002 interfaceC11003;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C13638.requireNonNull(parsePosition, "position");
        C12537 c12537 = new C12537(this);
        int iM = this.a.m(c12537, charSequence, parsePosition.getIndex());
        AbstractC9114 abstractC9114 = null;
        if (iM < 0) {
            parsePosition.setErrorIndex(~iM);
            c12537 = null;
        } else {
            parsePosition.setIndex(iM);
        }
        if (c12537 != null) {
            C23351 c23351 = c12537.a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                C11832 c11832C = c12537.c();
                InterfaceC21233 interfaceC21233 = c12537.c().c;
                if (interfaceC21233 == null && (interfaceC21233 = c23351.e) == null) {
                    interfaceC21233 = C7122.c;
                }
                c11832C.c = interfaceC21233;
                AbstractC9114 abstractC9115 = c11832C.b;
                if (abstractC9115 != null) {
                    abstractC9114 = abstractC9115;
                } else {
                    c23351.getClass();
                }
                c11832C.b = abstractC9114;
                c11832C.e = this.d;
                c11832C.k();
                c11832C.v(c11832C.c.O(c11832C.a, c11832C.e));
                c11832C.q();
                if (((HashMap) c11832C.a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) c11832C.a).entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            interfaceC11003 = (InterfaceC11002) ((Map.Entry) it.next()).getKey();
                            InterfaceC21584 interfaceC21584N = interfaceC11003.n(c11832C.a, c11832C, c11832C.e);
                            if (interfaceC21584N != null) {
                                if (interfaceC21584N instanceof InterfaceC20402) {
                                    InterfaceC20402 interfaceC20402 = (InterfaceC20402) interfaceC21584N;
                                    AbstractC9114 abstractC9116 = c11832C.b;
                                    if (abstractC9116 == null) {
                                        c11832C.b = interfaceC20402.F();
                                    } else if (!abstractC9116.equals(interfaceC20402.F())) {
                                        throw new C15464("ChronoZonedDateTime must use the effective parsed zone: " + c11832C.b);
                                    }
                                    interfaceC21584N = interfaceC20402.t();
                                }
                                if (interfaceC21584N instanceof InterfaceC9819) {
                                    InterfaceC9819 interfaceC9819 = (InterfaceC9819) interfaceC21584N;
                                    c11832C.s(interfaceC9819.b(), C13118.d);
                                    c11832C.v(interfaceC9819.f());
                                    break;
                                }
                                if (interfaceC21584N instanceof InterfaceC17579) {
                                    c11832C.v((InterfaceC17579) interfaceC21584N);
                                    break;
                                }
                                if (interfaceC21584N instanceof C3363) {
                                    c11832C.s((C3363) interfaceC21584N, C13118.d);
                                    break;
                                }
                                throw new C15464("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } while (((HashMap) c11832C.a).containsKey(interfaceC11003));
                        i++;
                    }
                    if (i == 50) {
                        throw new C15464("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i > 0) {
                        c11832C.k();
                        c11832C.v(c11832C.c.O(c11832C.a, c11832C.e));
                        c11832C.q();
                    }
                }
                if (c11832C.g == null) {
                    Map map2 = c11832C.a;
                    EnumC18762 enumC18764 = EnumC18762.MILLI_OF_SECOND;
                    if (((HashMap) map2).containsKey(enumC18764)) {
                        long jLongValue = ((Long) ((HashMap) c11832C.a).remove(enumC18764)).longValue();
                        Map map3 = c11832C.a;
                        EnumC18762 enumC18765 = EnumC18762.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(enumC18765)) {
                            long jLongValue2 = (((Long) ((HashMap) c11832C.a).get(enumC18765)).longValue() % 1000) + (jLongValue * 1000);
                            c11832C.x(enumC18764, enumC18765, Long.valueOf(jLongValue2));
                            ((HashMap) c11832C.a).remove(enumC18765);
                            ((HashMap) c11832C.a).put(EnumC18762.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) c11832C.a).put(EnumC18762.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map4 = c11832C.a;
                        EnumC18762 enumC18766 = EnumC18762.MICRO_OF_SECOND;
                        if (((HashMap) map4).containsKey(enumC18766)) {
                            ((HashMap) c11832C.a).put(EnumC18762.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c11832C.a).remove(enumC18766)).longValue() * 1000));
                        }
                    }
                    Map map5 = c11832C.a;
                    EnumC18762 enumC18767 = EnumC18762.HOUR_OF_DAY;
                    Long l2 = (Long) ((HashMap) map5).get(enumC18767);
                    if (l2 != null) {
                        Map map6 = c11832C.a;
                        EnumC18762 enumC18768 = EnumC18762.MINUTE_OF_HOUR;
                        Long l3 = (Long) ((HashMap) map6).get(enumC18768);
                        Map map7 = c11832C.a;
                        EnumC18762 enumC18769 = EnumC18762.SECOND_OF_MINUTE;
                        Long l4 = (Long) ((HashMap) map7).get(enumC18769);
                        Map map8 = c11832C.a;
                        EnumC18762 enumC187610 = EnumC18762.NANO_OF_SECOND;
                        Long l5 = (Long) ((HashMap) map8).get(enumC187610);
                        if ((l3 != null || (l4 == null && l5 == null)) && (l3 == null || l4 != null || l5 == null)) {
                            c11832C.p(l2.longValue(), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L, l5 != null ? l5.longValue() : 0L);
                            ((HashMap) c11832C.a).remove(enumC18767);
                            ((HashMap) c11832C.a).remove(enumC18768);
                            ((HashMap) c11832C.a).remove(enumC18769);
                            ((HashMap) c11832C.a).remove(enumC187610);
                            if (c11832C.e != EnumC5481.LENIENT && ((HashMap) c11832C.a).size() > 0) {
                                for (Map.Entry entry : ((HashMap) c11832C.a).entrySet()) {
                                    interfaceC11002 = (InterfaceC11002) entry.getKey();
                                    if (interfaceC11002 instanceof EnumC18762) {
                                        enumC18762 = (EnumC18762) interfaceC11002;
                                        if (enumC18762.V()) {
                                            enumC18762.T(((Long) entry.getValue()).longValue());
                                        }
                                    }
                                }
                            }
                        }
                    } else if (c11832C.e != EnumC5481.LENIENT) {
                        while (r2.hasNext()) {
                            interfaceC11002 = (InterfaceC11002) entry.getKey();
                            if (interfaceC11002 instanceof EnumC18762) {
                                enumC18762 = (EnumC18762) interfaceC11002;
                                if (enumC18762.V()) {
                                    enumC18762.T(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else if (c11832C.e != EnumC5481.LENIENT) {
                    while (r2.hasNext()) {
                        interfaceC11002 = (InterfaceC11002) entry.getKey();
                        if (interfaceC11002 instanceof EnumC18762) {
                            enumC18762 = (EnumC18762) interfaceC11002;
                            if (enumC18762.V()) {
                                enumC18762.T(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
                InterfaceC17579 interfaceC17579 = c11832C.f;
                if (interfaceC17579 != null) {
                    c11832C.j(interfaceC17579);
                }
                C3363 c3363 = c11832C.g;
                if (c3363 != null) {
                    c11832C.j(c3363);
                    if (c11832C.f != null && ((HashMap) c11832C.a).size() > 0) {
                        c11832C.j(c11832C.f.I(c11832C.g));
                    }
                }
                if (c11832C.f != null && c11832C.g != null) {
                    C13118 c13118 = c11832C.h;
                    c13118.getClass();
                    C13118 c13119 = C13118.d;
                    if (c13118 != c13119) {
                        c11832C.f = c11832C.f.N(c11832C.h);
                        c11832C.h = c13119;
                    }
                }
                if (c11832C.g == null) {
                    if (((HashMap) c11832C.a).containsKey(EnumC18762.INSTANT_SECONDS)) {
                        map = c11832C.a;
                        enumC18763 = EnumC18762.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC18763)) {
                            long jLongValue3 = ((Long) ((HashMap) c11832C.a).get(enumC18763)).longValue();
                            ((HashMap) c11832C.a).put(EnumC18762.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                            ((HashMap) c11832C.a).put(EnumC18762.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / 1000000));
                        } else {
                            ((HashMap) c11832C.a).put(enumC18763, 0L);
                            ((HashMap) c11832C.a).put(EnumC18762.MICRO_OF_SECOND, 0L);
                            ((HashMap) c11832C.a).put(EnumC18762.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c11832C.a).containsKey(EnumC18762.SECOND_OF_DAY)) {
                        map = c11832C.a;
                        enumC18763 = EnumC18762.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC18763)) {
                            long jLongValue4 = ((Long) ((HashMap) c11832C.a).get(enumC18763)).longValue();
                            ((HashMap) c11832C.a).put(EnumC18762.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                            ((HashMap) c11832C.a).put(EnumC18762.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / 1000000));
                        } else {
                            ((HashMap) c11832C.a).put(enumC18763, 0L);
                            ((HashMap) c11832C.a).put(EnumC18762.MICRO_OF_SECOND, 0L);
                            ((HashMap) c11832C.a).put(EnumC18762.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c11832C.a).containsKey(EnumC18762.SECOND_OF_MINUTE)) {
                        map = c11832C.a;
                        enumC18763 = EnumC18762.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC18763)) {
                            long jLongValue5 = ((Long) ((HashMap) c11832C.a).get(enumC18763)).longValue();
                            ((HashMap) c11832C.a).put(EnumC18762.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                            ((HashMap) c11832C.a).put(EnumC18762.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / 1000000));
                        } else {
                            ((HashMap) c11832C.a).put(enumC18763, 0L);
                            ((HashMap) c11832C.a).put(EnumC18762.MICRO_OF_SECOND, 0L);
                            ((HashMap) c11832C.a).put(EnumC18762.MILLI_OF_SECOND, 0L);
                        }
                    }
                }
                if (c11832C.f != null && c11832C.g != null) {
                    Long l6 = (Long) ((HashMap) c11832C.a).get(EnumC18762.OFFSET_SECONDS);
                    if (l6 != null) {
                        ((HashMap) c11832C.a).put(EnumC18762.INSTANT_SECONDS, Long.valueOf(c11832C.f.I(c11832C.g).D(C2678.e0(l6.intValue())).U()));
                        return c11832C;
                    }
                    if (c11832C.b != null) {
                        ((HashMap) c11832C.a).put(EnumC18762.INSTANT_SECONDS, Long.valueOf(c11832C.f.I(c11832C.g).D(c11832C.b).U()));
                    }
                }
                return c11832C;
            }
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new C17475(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new C17475(str2, charSequence);
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
