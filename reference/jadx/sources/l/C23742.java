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

/* JADX INFO: renamed from: l.᩹ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23742 {
    public static final C23742 f;
    public static final C23742 g;
    public static final C23742 h;
    public final C21504 a;
    public final Locale b;
    public final C24488 c;
    public final EnumC18520 d;
    public final InterfaceC8912 e;

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
    public static C23742 ofPattern(String str, Locale locale) {
        String strSubstring;
        int i;
        int i2;
        C1981 c1981;
        boolean z;
        C11675 c11675 = new C11675();
        C17359.requireNonNull(str, "pattern");
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
                    C11675 c11676 = c11675.a;
                    c11676.e = i5;
                    c11676.f = ' ';
                    c11676.g = -1;
                } else {
                    i = i4;
                    i2 = i5;
                }
                InterfaceC16831 interfaceC16831 = (InterfaceC16831) ((HashMap) C11675.i).get(Character.valueOf(cCharAt));
                if (interfaceC16831 != null) {
                    if (cCharAt == 'A') {
                        c11675.m(interfaceC16831, i2, 19, EnumC8079.NOT_NEGATIVE);
                    } else if (cCharAt == 'Q') {
                        z = false;
                        if (i2 == 1 || i2 == 2) {
                            if (cCharAt == 'e') {
                                c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                            } else if (cCharAt == 'E') {
                                c11675.i(interfaceC16831, EnumC10315.SHORT);
                            } else if (i2 == 1) {
                                c11675.k(interfaceC16831);
                            } else {
                                c11675.l(interfaceC16831, 2);
                            }
                        } else if (i2 == 3) {
                            c11675.i(interfaceC16831, z ? EnumC10315.SHORT_STANDALONE : EnumC10315.SHORT);
                        } else if (i2 == 4) {
                            c11675.i(interfaceC16831, z ? EnumC10315.FULL_STANDALONE : EnumC10315.FULL);
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c11675.i(interfaceC16831, z ? EnumC10315.NARROW_STANDALONE : EnumC10315.NARROW);
                        }
                    } else if (cCharAt == 'S') {
                        c11675.b(EnumC8692.NANO_OF_SECOND, i2, i2, false);
                    } else if (cCharAt == 'a') {
                        if (i2 != 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c11675.i(interfaceC16831, EnumC10315.SHORT);
                    } else if (cCharAt != 'k') {
                        if (cCharAt != 'q') {
                            if (cCharAt == 's') {
                                if (i2 == 1) {
                                    c11675.k(interfaceC16831);
                                } else {
                                    if (i2 == 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    c11675.l(interfaceC16831, i2);
                                }
                            } else if (cCharAt == 'u' || cCharAt == 'y') {
                                if (i2 == 2) {
                                    C7816 c7816 = C22864.h;
                                    C17359.requireNonNull(interfaceC16831, "field");
                                    C17359.requireNonNull(c7816, "baseDate");
                                    C22864 c22864 = new C22864(interfaceC16831, 2, 2, c7816, 0);
                                    if (c7816 == null) {
                                        long j = 0;
                                        if (!interfaceC16831.p().e(j)) {
                                            throw new IllegalArgumentException("The base value must be within the range of the field");
                                        }
                                        if (j + C8824.f[2] > 2147483647L) {
                                            throw new C21241("Unable to add printer-parser as the range exceeds the capacity of an int");
                                        }
                                    }
                                    c11675.j(c22864);
                                } else if (i2 < 4) {
                                    c11675.m(interfaceC16831, i2, 19, EnumC8079.NORMAL);
                                } else {
                                    c11675.m(interfaceC16831, i2, 19, EnumC8079.EXCEEDS_PAD);
                                }
                            } else if (cCharAt == 'g') {
                                c11675.m(interfaceC16831, i2, 19, EnumC8079.NORMAL);
                            } else if (cCharAt == 'h' || cCharAt == 'm') {
                                if (i2 == 1) {
                                    c11675.k(interfaceC16831);
                                } else {
                                    if (i2 == 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    c11675.l(interfaceC16831, i2);
                                }
                            } else if (cCharAt != 'n') {
                                switch (cCharAt) {
                                    case 'D':
                                        if (i2 == 1) {
                                            c11675.k(interfaceC16831);
                                        } else {
                                            if (i2 != 2 && i2 != 3) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c11675.m(interfaceC16831, i2, 3, EnumC8079.NOT_NEGATIVE);
                                        }
                                        break;
                                    case 'E':
                                        z = false;
                                        if (i2 == 1) {
                                            if (cCharAt == 'e') {
                                                c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                                            } else if (cCharAt == 'E') {
                                                c11675.i(interfaceC16831, EnumC10315.SHORT);
                                            } else if (i2 == 1) {
                                                c11675.l(interfaceC16831, 2);
                                            } else {
                                                c11675.k(interfaceC16831);
                                            }
                                        } else if (cCharAt == 'e') {
                                            c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                                        } else if (cCharAt == 'E') {
                                            c11675.i(interfaceC16831, EnumC10315.SHORT);
                                        } else if (i2 == 1) {
                                            c11675.l(interfaceC16831, 2);
                                        } else {
                                            c11675.k(interfaceC16831);
                                        }
                                        break;
                                    case 'F':
                                        if (i2 != 1) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        c11675.k(interfaceC16831);
                                        break;
                                        break;
                                    case 'G':
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            c11675.i(interfaceC16831, EnumC10315.SHORT);
                                        } else if (i2 == 4) {
                                            c11675.i(interfaceC16831, EnumC10315.FULL);
                                        } else {
                                            if (i2 != 5) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c11675.i(interfaceC16831, EnumC10315.NARROW);
                                        }
                                        break;
                                    case 'H':
                                        if (i2 == 1) {
                                            c11675.k(interfaceC16831);
                                        } else {
                                            if (i2 == 2) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c11675.l(interfaceC16831, i2);
                                        }
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case 'K':
                                                if (i2 == 1) {
                                                    c11675.k(interfaceC16831);
                                                } else {
                                                    if (i2 == 2) {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    c11675.l(interfaceC16831, i2);
                                                }
                                                break;
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                break;
                                            case 'M':
                                                z = false;
                                                if (i2 == 1) {
                                                    if (cCharAt == 'e') {
                                                        c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                                                    } else if (cCharAt == 'E') {
                                                        c11675.i(interfaceC16831, EnumC10315.SHORT);
                                                    } else if (i2 == 1) {
                                                        c11675.l(interfaceC16831, 2);
                                                    } else {
                                                        c11675.k(interfaceC16831);
                                                    }
                                                } else if (cCharAt == 'e') {
                                                    c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                                                } else if (cCharAt == 'E') {
                                                    c11675.i(interfaceC16831, EnumC10315.SHORT);
                                                } else if (i2 == 1) {
                                                    c11675.l(interfaceC16831, 2);
                                                } else {
                                                    c11675.k(interfaceC16831);
                                                }
                                                break;
                                            case 'N':
                                                c11675.m(interfaceC16831, i2, 19, EnumC8079.NOT_NEGATIVE);
                                                break;
                                            default:
                                                switch (cCharAt) {
                                                    case q.f /* 99 */:
                                                        if (i2 == 1) {
                                                            c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                                                        } else if (i2 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        break;
                                                    case 'd':
                                                        if (i2 == 1) {
                                                            c11675.k(interfaceC16831);
                                                        } else {
                                                            if (i2 == 2) {
                                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                            }
                                                            c11675.l(interfaceC16831, i2);
                                                        }
                                                        break;
                                                    case 'e':
                                                        z = false;
                                                        if (i2 == 1) {
                                                            if (cCharAt == 'e') {
                                                                c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                                                            } else if (cCharAt == 'E') {
                                                                c11675.i(interfaceC16831, EnumC10315.SHORT);
                                                            } else if (i2 == 1) {
                                                                c11675.l(interfaceC16831, 2);
                                                            } else {
                                                                c11675.k(interfaceC16831);
                                                            }
                                                        } else if (cCharAt == 'e') {
                                                            c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                                                        } else if (cCharAt == 'E') {
                                                            c11675.i(interfaceC16831, EnumC10315.SHORT);
                                                        } else if (i2 == 1) {
                                                            c11675.l(interfaceC16831, 2);
                                                        } else {
                                                            c11675.k(interfaceC16831);
                                                        }
                                                        break;
                                                    default:
                                                        if (i2 != 1) {
                                                            c11675.l(interfaceC16831, i2);
                                                        } else {
                                                            c11675.k(interfaceC16831);
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                c11675.m(interfaceC16831, i2, 19, EnumC8079.NOT_NEGATIVE);
                            }
                        }
                        z = true;
                        if (i2 == 1) {
                            if (cCharAt == 'e') {
                                c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                            } else if (cCharAt == 'E') {
                                c11675.i(interfaceC16831, EnumC10315.SHORT);
                            } else if (i2 == 1) {
                                c11675.k(interfaceC16831);
                            } else {
                                c11675.l(interfaceC16831, 2);
                            }
                        } else if (cCharAt == 'e') {
                            c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                        } else if (cCharAt == 'E') {
                            c11675.i(interfaceC16831, EnumC10315.SHORT);
                        } else if (i2 == 1) {
                            c11675.k(interfaceC16831);
                        } else {
                            c11675.l(interfaceC16831, 2);
                        }
                    } else if (i2 == 1) {
                        c11675.k(interfaceC16831);
                    } else {
                        if (i2 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c11675.l(interfaceC16831, i2);
                    }
                } else if (cCharAt == 'z') {
                    if (i2 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    c11675.c(i2 == 4 ? new C1981(EnumC10315.FULL, false) : new C1981(EnumC10315.SHORT, false));
                } else if (cCharAt == 'V') {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    c11675.c(new C5710(AbstractC17577.a, "ZoneId()"));
                } else if (cCharAt == 'v') {
                    if (i2 == 1) {
                        c1981 = new C1981(EnumC10315.SHORT, true);
                    } else {
                        if (i2 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                        }
                        c1981 = new C1981(EnumC10315.FULL, true);
                    }
                    c11675.c(c1981);
                } else {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i2 < 4) {
                            c11675.g("+HHMM", "+0000");
                        } else if (i2 == 4) {
                            c11675.f(EnumC10315.FULL);
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c11675.g("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i2 == 1) {
                            c11675.f(EnumC10315.SHORT);
                        } else {
                            if (i2 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            c11675.f(EnumC10315.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i2 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c11675.g(C7333.d[i2 + (i2 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i2 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i2 == 1) {
                            str2 = "+00";
                        } else if (i2 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        c11675.g(C7333.d[i2 + (i2 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i2 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c11675.j(new C13167(cCharAt, i2, i2, i2, 0));
                    } else if (cCharAt == 'w') {
                        if (i2 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c11675.j(new C13167(cCharAt, i2, i2, 2, 0));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        if (i2 == 2) {
                            c11675.j(new C13167(cCharAt, i2, i2, 2, 0));
                        } else {
                            c11675.j(new C13167(cCharAt, i2, i2, 19, 0));
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
                                c11675.d('\'');
                            } else {
                                c11675.e(strSubstring.replace("''", "'"));
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
                    c11675.d('\'');
                } else {
                    c11675.e(strSubstring.replace("''", "'"));
                }
                i3 = i7;
            } else if (cCharAt == '[') {
                c11675.o();
            } else if (cCharAt == ']') {
                if (c11675.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                c11675.n();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                c11675.d(cCharAt);
            }
            i3++;
        }
        return c11675.q(locale, EnumC18520.SMART, null);
    }

    static {
        C11675 c11675 = new C11675();
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        EnumC8079 enumC8079 = EnumC8079.EXCEEDS_PAD;
        c11675.m(enumC8692, 4, 10, enumC8079);
        c11675.d('-');
        EnumC8692 enumC8693 = EnumC8692.MONTH_OF_YEAR;
        c11675.l(enumC8693, 2);
        c11675.d('-');
        EnumC8692 enumC8694 = EnumC8692.DAY_OF_MONTH;
        c11675.l(enumC8694, 2);
        EnumC18520 enumC18520 = EnumC18520.STRICT;
        C20012 c20012 = C20012.c;
        C23742 c23742P = c11675.p(enumC18520, c20012);
        f = c23742P;
        C11675 c11676 = new C11675();
        EnumC19880 enumC19880 = EnumC19880.INSENSITIVE;
        c11676.c(enumC19880);
        c11676.a(c23742P);
        C7333 c7333 = C7333.e;
        c11676.c(c7333);
        c11676.p(enumC18520, c20012);
        C11675 c11677 = new C11675();
        c11677.c(enumC19880);
        c11677.a(c23742P);
        c11677.o();
        c11677.c(c7333);
        c11677.p(enumC18520, c20012);
        C11675 c11678 = new C11675();
        EnumC8692 enumC8695 = EnumC8692.HOUR_OF_DAY;
        c11678.l(enumC8695, 2);
        c11678.d(':');
        EnumC8692 enumC8696 = EnumC8692.MINUTE_OF_HOUR;
        c11678.l(enumC8696, 2);
        c11678.o();
        c11678.d(':');
        EnumC8692 enumC8697 = EnumC8692.SECOND_OF_MINUTE;
        c11678.l(enumC8697, 2);
        c11678.o();
        c11678.b(EnumC8692.NANO_OF_SECOND, 0, 9, true);
        C23742 c23742P2 = c11678.p(enumC18520, null);
        C11675 c11679 = new C11675();
        c11679.c(enumC19880);
        c11679.a(c23742P2);
        c11679.c(c7333);
        c11679.p(enumC18520, null);
        C11675 c116710 = new C11675();
        c116710.c(enumC19880);
        c116710.a(c23742P2);
        c116710.o();
        c116710.c(c7333);
        c116710.p(enumC18520, null);
        C11675 c116711 = new C11675();
        c116711.c(enumC19880);
        c116711.a(c23742P);
        c116711.d('T');
        c116711.a(c23742P2);
        C23742 c23742P3 = c116711.p(enumC18520, c20012);
        C11675 c116712 = new C11675();
        c116712.c(enumC19880);
        c116712.a(c23742P3);
        EnumC19880 enumC19881 = EnumC19880.LENIENT;
        c116712.c(enumC19881);
        c116712.c(c7333);
        EnumC19880 enumC19882 = EnumC19880.STRICT;
        c116712.c(enumC19882);
        C23742 c23742P4 = c116712.p(enumC18520, c20012);
        g = c23742P4;
        C11675 c116713 = new C11675();
        c116713.a(c23742P4);
        c116713.o();
        c116713.d('[');
        EnumC19880 enumC19883 = EnumC19880.SENSITIVE;
        c116713.c(enumC19883);
        C14435 c14435 = C11675.h;
        c116713.c(new C5710(c14435, "ZoneRegionId()"));
        c116713.d(']');
        c116713.p(enumC18520, c20012);
        C11675 c116714 = new C11675();
        c116714.a(c23742P3);
        c116714.o();
        c116714.c(c7333);
        c116714.o();
        c116714.d('[');
        c116714.c(enumC19883);
        c116714.c(new C5710(c14435, "ZoneRegionId()"));
        c116714.d(']');
        c116714.p(enumC18520, c20012);
        C11675 c116715 = new C11675();
        c116715.c(enumC19880);
        c116715.m(enumC8692, 4, 10, enumC8079);
        c116715.d('-');
        c116715.l(EnumC8692.DAY_OF_YEAR, 3);
        c116715.o();
        c116715.c(c7333);
        c116715.p(enumC18520, c20012);
        C11675 c116716 = new C11675();
        c116716.c(enumC19880);
        c116716.m(AbstractC15339.c, 4, 10, enumC8079);
        c116716.e("-W");
        c116716.l(AbstractC15339.b, 2);
        c116716.d('-');
        EnumC8692 enumC8698 = EnumC8692.DAY_OF_WEEK;
        c116716.l(enumC8698, 1);
        c116716.o();
        c116716.c(c7333);
        c116716.p(enumC18520, c20012);
        C11675 c116717 = new C11675();
        c116717.c(enumC19880);
        c116717.c(new C1367());
        h = c116717.p(enumC18520, null);
        C11675 c116718 = new C11675();
        c116718.c(enumC19880);
        c116718.l(enumC8692, 4);
        c116718.l(enumC8693, 2);
        c116718.l(enumC8694, 2);
        c116718.o();
        c116718.c(enumC19881);
        c116718.g("+HHMMss", "Z");
        c116718.c(enumC19882);
        c116718.p(enumC18520, c20012);
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
        C11675 c116719 = new C11675();
        c116719.c(enumC19880);
        c116719.c(enumC19881);
        c116719.o();
        c116719.h(enumC8698, map);
        c116719.e(", ");
        c116719.n();
        c116719.m(enumC8694, 1, 2, EnumC8079.NOT_NEGATIVE);
        c116719.d(' ');
        c116719.h(enumC8693, map2);
        c116719.d(' ');
        c116719.l(enumC8692, 4);
        c116719.d(' ');
        c116719.l(enumC8695, 2);
        c116719.d(':');
        c116719.l(enumC8696, 2);
        c116719.o();
        c116719.d(':');
        c116719.l(enumC8697, 2);
        c116719.n();
        c116719.d(' ');
        c116719.g("+HHMM", "GMT");
        c116719.p(EnumC18520.SMART, c20012);
    }

    public C23742(C21504 c21504, Locale locale, EnumC18520 enumC18520, InterfaceC8912 interfaceC8912) {
        C24488 c24488 = C24488.a;
        this.a = (C21504) C17359.requireNonNull(c21504, "printerParser");
        this.b = (Locale) C17359.requireNonNull(locale, "locale");
        this.c = (C24488) C17359.requireNonNull(c24488, "decimalStyle");
        this.d = (EnumC18520) C17359.requireNonNull(enumC18520, "resolverStyle");
        this.e = interfaceC8912;
    }

    public String format(InterfaceC9437 interfaceC9437) {
        StringBuilder sb = new StringBuilder(32);
        C21504 c21504 = this.a;
        C17359.requireNonNull(interfaceC9437, "temporal");
        C17359.requireNonNull(sb, "appendable");
        try {
            c21504.i(new C16150(interfaceC9437, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C21241(e.getMessage(), e);
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
    public final C14790 a(CharSequence charSequence) {
        String string;
        InterfaceC16831 interfaceC16831;
        EnumC8692 enumC8692;
        Map map;
        EnumC8692 enumC8693;
        InterfaceC16831 interfaceC16832;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        C17359.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C17359.requireNonNull(parsePosition, "position");
        C25102 c25102 = new C25102(this);
        int iJ = this.a.j(c25102, charSequence, parsePosition.getIndex());
        AbstractC22338 abstractC22338 = null;
        if (iJ < 0) {
            parsePosition.setErrorIndex(~iJ);
            c25102 = null;
        } else {
            parsePosition.setIndex(iJ);
        }
        if (c25102 != null) {
            C23742 c23742 = c25102.a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                C14790 c14790C = c25102.c();
                InterfaceC8912 interfaceC8912 = c25102.c().c;
                if (interfaceC8912 == null && (interfaceC8912 = c23742.e) == null) {
                    interfaceC8912 = C20012.c;
                }
                c14790C.c = interfaceC8912;
                AbstractC22338 abstractC22339 = c14790C.b;
                if (abstractC22339 != null) {
                    abstractC22338 = abstractC22339;
                } else {
                    c23742.getClass();
                }
                c14790C.b = abstractC22338;
                c14790C.e = this.d;
                c14790C.l();
                c14790C.u(c14790C.c.K(c14790C.a, c14790C.e));
                c14790C.p();
                if (((HashMap) c14790C.a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) c14790C.a).entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            interfaceC16832 = (InterfaceC16831) ((Map.Entry) it.next()).getKey();
                            InterfaceC9437 interfaceC9437K = interfaceC16832.k(c14790C.a, c14790C, c14790C.e);
                            if (interfaceC9437K != null) {
                                if (interfaceC9437K instanceof InterfaceC5930) {
                                    InterfaceC5930 interfaceC5930 = (InterfaceC5930) interfaceC9437K;
                                    AbstractC22338 abstractC223310 = c14790C.b;
                                    if (abstractC223310 == null) {
                                        c14790C.b = interfaceC5930.getZone();
                                    } else if (!abstractC223310.equals(interfaceC5930.getZone())) {
                                        throw new C21241("ChronoZonedDateTime must use the effective parsed zone: " + c14790C.b);
                                    }
                                    interfaceC9437K = interfaceC5930.q();
                                }
                                if (interfaceC9437K instanceof InterfaceC12641) {
                                    InterfaceC12641 interfaceC12641 = (InterfaceC12641) interfaceC9437K;
                                    c14790C.s(interfaceC12641.toLocalTime(), C8561.d);
                                    c14790C.u(interfaceC12641.e());
                                    break;
                                }
                                if (interfaceC9437K instanceof InterfaceC17116) {
                                    c14790C.u((InterfaceC17116) interfaceC9437K);
                                    break;
                                }
                                if (interfaceC9437K instanceof C10052) {
                                    c14790C.s((C10052) interfaceC9437K, C8561.d);
                                    break;
                                }
                                throw new C21241("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } while (((HashMap) c14790C.a).containsKey(interfaceC16832));
                        i++;
                    }
                    if (i == 50) {
                        throw new C21241("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i > 0) {
                        c14790C.l();
                        c14790C.u(c14790C.c.K(c14790C.a, c14790C.e));
                        c14790C.p();
                    }
                }
                if (c14790C.g == null) {
                    Map map2 = c14790C.a;
                    EnumC8692 enumC8694 = EnumC8692.MILLI_OF_SECOND;
                    if (((HashMap) map2).containsKey(enumC8694)) {
                        long jLongValue = ((Long) ((HashMap) c14790C.a).remove(enumC8694)).longValue();
                        Map map3 = c14790C.a;
                        EnumC8692 enumC8695 = EnumC8692.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(enumC8695)) {
                            long jLongValue2 = (((Long) ((HashMap) c14790C.a).get(enumC8695)).longValue() % 1000) + (jLongValue * 1000);
                            c14790C.v(enumC8694, enumC8695, Long.valueOf(jLongValue2));
                            ((HashMap) c14790C.a).remove(enumC8695);
                            ((HashMap) c14790C.a).put(EnumC8692.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) c14790C.a).put(EnumC8692.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map4 = c14790C.a;
                        EnumC8692 enumC8696 = EnumC8692.MICRO_OF_SECOND;
                        if (((HashMap) map4).containsKey(enumC8696)) {
                            ((HashMap) c14790C.a).put(EnumC8692.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c14790C.a).remove(enumC8696)).longValue() * 1000));
                        }
                    }
                    Map map5 = c14790C.a;
                    EnumC8692 enumC8697 = EnumC8692.HOUR_OF_DAY;
                    Long l2 = (Long) ((HashMap) map5).get(enumC8697);
                    if (l2 != null) {
                        Map map6 = c14790C.a;
                        EnumC8692 enumC8698 = EnumC8692.MINUTE_OF_HOUR;
                        Long l3 = (Long) ((HashMap) map6).get(enumC8698);
                        Map map7 = c14790C.a;
                        EnumC8692 enumC8699 = EnumC8692.SECOND_OF_MINUTE;
                        Long l4 = (Long) ((HashMap) map7).get(enumC8699);
                        Map map8 = c14790C.a;
                        EnumC8692 enumC86910 = EnumC8692.NANO_OF_SECOND;
                        Long l5 = (Long) ((HashMap) map8).get(enumC86910);
                        if ((l3 != null || (l4 == null && l5 == null)) && (l3 == null || l4 != null || l5 == null)) {
                            c14790C.n(l2.longValue(), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L, l5 != null ? l5.longValue() : 0L);
                            ((HashMap) c14790C.a).remove(enumC8697);
                            ((HashMap) c14790C.a).remove(enumC8698);
                            ((HashMap) c14790C.a).remove(enumC8699);
                            ((HashMap) c14790C.a).remove(enumC86910);
                            if (c14790C.e != EnumC18520.LENIENT && ((HashMap) c14790C.a).size() > 0) {
                                for (Map.Entry entry : ((HashMap) c14790C.a).entrySet()) {
                                    interfaceC16831 = (InterfaceC16831) entry.getKey();
                                    if (interfaceC16831 instanceof EnumC8692) {
                                        enumC8692 = (EnumC8692) interfaceC16831;
                                        if (enumC8692.R()) {
                                            enumC8692.P(((Long) entry.getValue()).longValue());
                                        }
                                    }
                                }
                            }
                        }
                    } else if (c14790C.e != EnumC18520.LENIENT) {
                        while (r2.hasNext()) {
                            interfaceC16831 = (InterfaceC16831) entry.getKey();
                            if (interfaceC16831 instanceof EnumC8692) {
                                enumC8692 = (EnumC8692) interfaceC16831;
                                if (enumC8692.R()) {
                                    enumC8692.P(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else if (c14790C.e != EnumC18520.LENIENT) {
                    while (r2.hasNext()) {
                        interfaceC16831 = (InterfaceC16831) entry.getKey();
                        if (interfaceC16831 instanceof EnumC8692) {
                            enumC8692 = (EnumC8692) interfaceC16831;
                            if (enumC8692.R()) {
                                enumC8692.P(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
                InterfaceC17116 interfaceC17116 = c14790C.f;
                if (interfaceC17116 != null) {
                    c14790C.h(interfaceC17116);
                }
                C10052 c10052 = c14790C.g;
                if (c10052 != null) {
                    c14790C.h(c10052);
                    if (c14790C.f != null && ((HashMap) c14790C.a).size() > 0) {
                        c14790C.h(c14790C.f.E(c14790C.g));
                    }
                }
                if (c14790C.f != null && c14790C.g != null) {
                    C8561 c8561 = c14790C.h;
                    c8561.getClass();
                    C8561 c8562 = C8561.d;
                    if (c8561 != c8562) {
                        c14790C.f = c14790C.f.J(c14790C.h);
                        c14790C.h = c8562;
                    }
                }
                if (c14790C.g == null) {
                    if (((HashMap) c14790C.a).containsKey(EnumC8692.INSTANT_SECONDS)) {
                        map = c14790C.a;
                        enumC8693 = EnumC8692.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC8693)) {
                            long jLongValue3 = ((Long) ((HashMap) c14790C.a).get(enumC8693)).longValue();
                            ((HashMap) c14790C.a).put(EnumC8692.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                            ((HashMap) c14790C.a).put(EnumC8692.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / 1000000));
                        } else {
                            ((HashMap) c14790C.a).put(enumC8693, 0L);
                            ((HashMap) c14790C.a).put(EnumC8692.MICRO_OF_SECOND, 0L);
                            ((HashMap) c14790C.a).put(EnumC8692.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c14790C.a).containsKey(EnumC8692.SECOND_OF_DAY)) {
                        map = c14790C.a;
                        enumC8693 = EnumC8692.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC8693)) {
                            long jLongValue4 = ((Long) ((HashMap) c14790C.a).get(enumC8693)).longValue();
                            ((HashMap) c14790C.a).put(EnumC8692.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                            ((HashMap) c14790C.a).put(EnumC8692.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / 1000000));
                        } else {
                            ((HashMap) c14790C.a).put(enumC8693, 0L);
                            ((HashMap) c14790C.a).put(EnumC8692.MICRO_OF_SECOND, 0L);
                            ((HashMap) c14790C.a).put(EnumC8692.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c14790C.a).containsKey(EnumC8692.SECOND_OF_MINUTE)) {
                        map = c14790C.a;
                        enumC8693 = EnumC8692.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC8693)) {
                            long jLongValue5 = ((Long) ((HashMap) c14790C.a).get(enumC8693)).longValue();
                            ((HashMap) c14790C.a).put(EnumC8692.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                            ((HashMap) c14790C.a).put(EnumC8692.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / 1000000));
                        } else {
                            ((HashMap) c14790C.a).put(enumC8693, 0L);
                            ((HashMap) c14790C.a).put(EnumC8692.MICRO_OF_SECOND, 0L);
                            ((HashMap) c14790C.a).put(EnumC8692.MILLI_OF_SECOND, 0L);
                        }
                    }
                }
                if (c14790C.f != null && c14790C.g != null) {
                    Long l6 = (Long) ((HashMap) c14790C.a).get(EnumC8692.OFFSET_SECONDS);
                    if (l6 != null) {
                        ((HashMap) c14790C.a).put(EnumC8692.INSTANT_SECONDS, Long.valueOf(c14790C.f.E(c14790C.g).A(C11149.ofTotalSeconds(l6.intValue())).Q()));
                        return c14790C;
                    }
                    if (c14790C.b != null) {
                        ((HashMap) c14790C.a).put(EnumC8692.INSTANT_SECONDS, Long.valueOf(c14790C.f.E(c14790C.g).A(c14790C.b).Q()));
                    }
                }
                return c14790C;
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
            throw new C16896(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new C16896(str2, charSequence);
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
