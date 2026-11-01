package l;

import android.text.TextUtils;
import com.alipay.sdk.m.p.a;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4IW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0118 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C14690 f1101 = C14690.m35219("\\n *\\.(end +)?([afm][a-z]+)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6111 f1102;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f1103;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f1104;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0118 m1165(CharSequence charSequence) {
        return new C0118(charSequence);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    public C0118(CharSequence charSequence) {
        this.f1103 = charSequence;
        C6222 c6222Matcher = f1101.matcher(charSequence);
        LinkedList<C19875> linkedList = new LinkedList();
        while (true) {
            if (c6222Matcher.find()) {
                int i = c6222Matcher.start(1) != -1 ? 1 : 0;
                String strGroup = c6222Matcher.group(2);
                strGroup.getClass();
                switch (strGroup) {
                    case "annotation":
                        linkedList.addFirst(new C19875(i, c6222Matcher.start(2)));
                        break;
                    case "method":
                        linkedList.addFirst(new C19875(i != 0 ? 5 : 4, c6222Matcher.start(2)));
                        break;
                    case "field":
                        linkedList.addFirst(new C19875(i == 0 ? 2 : 3, c6222Matcher.start(2)));
                        break;
                }
            } else {
                LinkedList linkedList2 = new LinkedList();
                boolean z = false;
                for (C19875 c19875 : linkedList) {
                    int i2 = c19875.f63725;
                    if (i2 == 2) {
                        if (z) {
                            z = false;
                        } else {
                            linkedList2.addFirst(new C19875(3, c19875.f63724));
                        }
                        linkedList2.addFirst(c19875);
                    } else if (i2 == 3) {
                        linkedList2.addFirst(c19875);
                        z = true;
                    } else {
                        linkedList2.addFirst(c19875);
                    }
                }
                this.f1104 = C0561.unmodifiableList(linkedList2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1174(C6111 c6111) {
        this.f1102 = c6111;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1172(String str, int i, int i2, String str2) {
        C6222 c6222Matcher = C8586.f29686.matcher(this.f1103);
        int i3 = -1;
        int iStart = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C19875 c19875 : this.f1104) {
            int i5 = c19875.f63725;
            int i6 = c19875.f63724;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        i4++;
                        if (c6222Matcher.lookingAt(i6) && str.equals(c6222Matcher.m17261("name")) && str2.equals(c6222Matcher.m17261("type"))) {
                            iStart = c6222Matcher.start();
                            z = true;
                        }
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            i4++;
                        } else if (i5 != 5) {
                        }
                    } else if (z) {
                        z = false;
                    }
                } else if (z && z2 && i4 == 2) {
                    m1167(i2, iStart, i6);
                    return;
                }
                i4--;
            } else {
                i4++;
                if (z && !z2 && i4 == 2) {
                    i3++;
                    if (i3 == i) {
                        z2 = true;
                    }
                    iStart = i6;
                }
            }
        }
        m1166(iStart);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1173(String str, int i, String str2, String str3, int i2) {
        C6222 c6222Matcher = C8586.f29685.matcher(this.f1103);
        int i3 = -1;
        int iStart = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C19875 c19875 : this.f1104) {
            int i5 = c19875.f63725;
            int i6 = c19875.f63724;
            if (i5 == 0) {
                i4++;
                if (z && !z2 && i4 == 2) {
                    i3++;
                    if (i3 == i) {
                        z2 = true;
                    }
                    iStart = i6;
                }
            } else if (i5 == 1) {
                if (z && z2 && i4 == 2) {
                    m1167(i2, iStart, i6);
                    return;
                }
                i4--;
            } else if (i5 == 2) {
                i4++;
            } else if (i5 == 3) {
                i4--;
            } else if (i5 == 4) {
                i4++;
                if (c6222Matcher.lookingAt(i6)) {
                    if (str.equals(c6222Matcher.m17261("name"))) {
                        if (str2.equals(c6222Matcher.m17261("parameters"))) {
                            if (str3.equals(c6222Matcher.m17261("type"))) {
                                iStart = c6222Matcher.start();
                                z = true;
                            }
                        }
                    }
                }
            } else if (i5 == 5) {
                if (z) {
                    z = false;
                }
                i4--;
            }
        }
        m1166(iStart);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1171(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = -1;
        for (C19875 c19875 : this.f1104) {
            int i6 = c19875.f63725;
            int i7 = c19875.f63724;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                }
                            }
                        }
                    }
                    i4++;
                } else if (z && i4 == 1) {
                    m1167(i2, i3, i7);
                    return;
                }
                i4--;
            } else {
                i4++;
                if (!z && i4 == 1) {
                    i5++;
                    if (i5 == i) {
                        z = true;
                    }
                    i3 = i7;
                }
            }
        }
        m1166(i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1166(int i) {
        this.f1102.mo17029(i);
        this.f1102.invalidate();
        this.f1102.m16819();
        this.f1102.m16988(i, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m1168(int i, int i2) {
        this.f1102.mo16839(i, i2);
        this.f1102.invalidate();
        this.f1102.m16819();
        this.f1102.m16988(i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1167(int i, int i2, int i3) {
        char cM26935;
        boolean z;
        CharSequence charSequence = this.f1103;
        C10703 c10703 = new C10703(i2, i3, charSequence);
        if (c10703.m26929(a.h) && (i = i - 1) < 0) {
            z = true;
            break;
        }
        loop0: while (true) {
            int i4 = i - 1;
            if (i < 0) {
                z = true;
                break;
            }
            while (!c10703.m26930() && (cM26935 = c10703.m26935()) != '=') {
                z = false;
                if (cM26935 == '\"') {
                    if (!c10703.m26931()) {
                        break loop0;
                    }
                } else if (cM26935 == '\'' && !c10703.m26927()) {
                    break loop0;
                }
            }
            i = i4;
        }
        c10703.m26933();
        if (z) {
            m1168(c10703.m26934(), new C10703(c10703.m26934(), charSequence.length(), charSequence).m26928());
        } else {
            m1166(c10703.m26934());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15642 m1170(String str, String str2, String str3) {
        C6222 c6222Matcher = C8586.f29685.matcher(this.f1103);
        for (C19875 c19875 : this.f1104) {
            if (c19875.f63725 == 4 && c6222Matcher.lookingAt(c19875.f63724) && str.equals(c6222Matcher.m17261("name")) && str2.equals(c6222Matcher.m17261("parameters")) && str3.equals(c6222Matcher.m17261("type"))) {
                return new C15642(c6222Matcher);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] m1176(String str, String str2, String str3) {
        C14690 c14690 = C8586.f29685;
        CharSequence charSequence = this.f1103;
        C6222 c6222Matcher = c14690.matcher(charSequence);
        boolean z = true;
        int iEnd = 0;
        for (C19875 c19875 : this.f1104) {
            if (z) {
                if (c19875.f63725 == 4 && c6222Matcher.lookingAt(c19875.f63724) && str.equals(c6222Matcher.m17261("name")) && str2.equals(c6222Matcher.m17261("parameters")) && str3.equals(c6222Matcher.m17261("type"))) {
                    iEnd = c6222Matcher.end();
                    z = false;
                }
            } else if (c19875.f63725 == 5) {
                return new int[]{iEnd + 1, TextUtils.lastIndexOf(charSequence, '\n', c19875.f63724)};
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1175(String str, int i, String str2, String str3, int i2) {
        int i3;
        char cCharAt;
        C14690 c14690 = C8586.f29685;
        CharSequence charSequence = this.f1103;
        C6222 c6222Matcher = c14690.matcher(charSequence);
        int iEnd = -1;
        boolean z = false;
        for (C19875 c19875 : this.f1104) {
            int i4 = c19875.f63725;
            int i5 = c19875.f63724;
            if (i4 == 4) {
                if (c6222Matcher.lookingAt(i5) && str.equals(c6222Matcher.m17261("name")) && str2.equals(c6222Matcher.m17261("parameters"))) {
                    if (str3.equals(c6222Matcher.m17261("type"))) {
                        iEnd = c6222Matcher.end();
                        z = true;
                    }
                }
            } else if (!z) {
                continue;
            } else if (i4 == 5) {
                while (true) {
                    int i6 = iEnd + 1;
                    if (i6 >= charSequence.length()) {
                        iEnd = i6;
                        break;
                    }
                    char cCharAt2 = charSequence.charAt(i6);
                    if ((cCharAt2 == '\r' || cCharAt2 == '\n') && (iEnd = iEnd + 2) < charSequence.length() && ((cCharAt = charSequence.charAt(iEnd)) == '\r' || cCharAt == '\n')) {
                        break;
                    } else {
                        iEnd = i6;
                    }
                }
            } else if (i4 == 0 || i4 == 1) {
                iEnd = i5;
            }
        }
        if (iEnd == -1) {
            return;
        }
        C10703 c10703 = new C10703(iEnd, charSequence.length(), charSequence);
        int i7 = i;
        while (!c10703.m26930()) {
            String strM26925 = c10703.m26925();
            if (strM26925.length() > 0 && !strM26925.startsWith(":") && !strM26925.startsWith("#") && !strM26925.equals("nop")) {
                char cCharAt3 = strM26925.charAt(0);
                if ('a' <= cCharAt3 && cCharAt3 <= 'z') {
                    i3 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    i7 = i3;
                } else if (cCharAt3 == '.' && (strM26925.startsWith(".array-data") || strM26925.startsWith(".packed-switch") || strM26925.startsWith(".sparse-switch"))) {
                    i3 = i7 - 1;
                    if (i7 == 0) {
                        break;
                    }
                    i7 = i3;
                }
            }
        }
        int i8 = i2;
        while (!c10703.m26930() && i8 >= 0) {
            if (!c10703.m26925().isEmpty()) {
                i8--;
            }
        }
        int iM26926 = c10703.m26926();
        int iM26932 = c10703.m26932();
        C10703 c10704 = new C10703(iM26926, iM26932, charSequence);
        if (c10704.m26929('\"')) {
            int iM26934 = c10704.m26934();
            if (c10704.m26931()) {
                m1168(iM26934, c10704.m26934() - 1);
                return;
            }
        }
        m1168(iM26926, iM26932);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15642 m1169(String str, String str2) {
        C6222 c6222Matcher = C8586.f29686.matcher(this.f1103);
        for (C19875 c19875 : this.f1104) {
            if (c19875.f63725 == 2 && c6222Matcher.lookingAt(c19875.f63724) && str.equals(c6222Matcher.m17261("name")) && str2.equals(c6222Matcher.m17261("type"))) {
                return new C15642(c6222Matcher);
            }
        }
        return null;
    }
}
