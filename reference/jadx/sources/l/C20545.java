package l;

import android.text.TextUtils;
import com.alipay.sdk.m.p.a;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4IW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20545 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C18415 f65778 = C18415.m42925("\\n *\\.(end +)?([afm][a-z]+)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24132 f65779;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f65780;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f65781;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20545 m47096(CharSequence charSequence) {
        return new C20545(charSequence);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    public C20545(CharSequence charSequence) {
        this.f65780 = charSequence;
        C4245 c4245Matcher = f65778.matcher(charSequence);
        LinkedList<C3391> linkedList = new LinkedList();
        while (true) {
            if (c4245Matcher.find()) {
                int i = c4245Matcher.start(1) != -1 ? 1 : 0;
                String strGroup = c4245Matcher.group(2);
                strGroup.getClass();
                switch (strGroup) {
                    case "annotation":
                        linkedList.addFirst(new C3391(i, c4245Matcher.start(2)));
                        break;
                    case "method":
                        linkedList.addFirst(new C3391(i != 0 ? 5 : 4, c4245Matcher.start(2)));
                        break;
                    case "field":
                        linkedList.addFirst(new C3391(i == 0 ? 2 : 3, c4245Matcher.start(2)));
                        break;
                }
            } else {
                LinkedList linkedList2 = new LinkedList();
                boolean z = false;
                for (C3391 c3391 : linkedList) {
                    int i2 = c3391.f11040;
                    if (i2 == 2) {
                        if (z) {
                            z = false;
                        } else {
                            linkedList2.addFirst(new C3391(3, c3391.f11039));
                        }
                        linkedList2.addFirst(c3391);
                    } else if (i2 == 3) {
                        linkedList2.addFirst(c3391);
                        z = true;
                    } else {
                        linkedList2.addFirst(c3391);
                    }
                }
                this.f65781 = C4681.unmodifiableList(linkedList2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47105(C24132 c24132) {
        this.f65779 = c24132;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47103(String str, int i, int i2, String str2) {
        C4245 c4245Matcher = C25021.f80969.matcher(this.f65780);
        int i3 = -1;
        int iStart = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C3391 c3391 : this.f65781) {
            int i5 = c3391.f11040;
            int i6 = c3391.f11039;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        i4++;
                        if (c4245Matcher.lookingAt(i6) && str.equals(c4245Matcher.m13551("name")) && str2.equals(c4245Matcher.m13551("type"))) {
                            iStart = c4245Matcher.start();
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
                    m47098(i2, iStart, i6);
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
        m47097(iStart);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47104(String str, int i, String str2, String str3, int i2) {
        C4245 c4245Matcher = C25021.f80965.matcher(this.f65780);
        int i3 = -1;
        int iStart = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C3391 c3391 : this.f65781) {
            int i5 = c3391.f11040;
            int i6 = c3391.f11039;
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
                    m47098(i2, iStart, i6);
                    return;
                }
                i4--;
            } else if (i5 == 2) {
                i4++;
            } else if (i5 == 3) {
                i4--;
            } else if (i5 == 4) {
                i4++;
                if (c4245Matcher.lookingAt(i6)) {
                    if (str.equals(c4245Matcher.m13551("name"))) {
                        if (str2.equals(c4245Matcher.m13551("parameters"))) {
                            if (str3.equals(c4245Matcher.m13551("type"))) {
                                iStart = c4245Matcher.start();
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
        m47097(iStart);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47102(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = -1;
        for (C3391 c3391 : this.f65781) {
            int i6 = c3391.f11040;
            int i7 = c3391.f11039;
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
                    m47098(i2, i3, i7);
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
        m47097(i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47097(int i) {
        this.f65779.mo52339(i);
        this.f65779.invalidate();
        this.f65779.m54007();
        this.f65779.m54074(i, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m47099(int i, int i2) {
        this.f65779.mo52316(i, i2);
        this.f65779.invalidate();
        this.f65779.m54007();
        this.f65779.m54074(i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47098(int i, int i2, int i3) {
        char cM35176;
        boolean z;
        CharSequence charSequence = this.f65780;
        C14577 c14577 = new C14577(i2, i3, charSequence);
        if (c14577.m35171(a.h) && (i = i - 1) < 0) {
            z = true;
            break;
        }
        loop0: while (true) {
            int i4 = i - 1;
            if (i < 0) {
                z = true;
                break;
            }
            while (!c14577.m35177() && (cM35176 = c14577.m35176()) != '=') {
                z = false;
                if (cM35176 == '\"') {
                    if (!c14577.m35174()) {
                        break loop0;
                    }
                } else if (cM35176 == '\'' && !c14577.m35169()) {
                    break loop0;
                }
            }
            i = i4;
        }
        c14577.m35172();
        if (z) {
            m47099(c14577.m35178(), new C14577(c14577.m35178(), charSequence.length(), charSequence).m35170());
        } else {
            m47097(c14577.m35178());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23529 m47101(String str, String str2, String str3) {
        C4245 c4245Matcher = C25021.f80965.matcher(this.f65780);
        for (C3391 c3391 : this.f65781) {
            if (c3391.f11040 == 4 && c4245Matcher.lookingAt(c3391.f11039) && str.equals(c4245Matcher.m13551("name")) && str2.equals(c4245Matcher.m13551("parameters")) && str3.equals(c4245Matcher.m13551("type"))) {
                return new C23529(c4245Matcher);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] m47107(String str, String str2, String str3) {
        C18415 c18415 = C25021.f80965;
        CharSequence charSequence = this.f65780;
        C4245 c4245Matcher = c18415.matcher(charSequence);
        boolean z = true;
        int iEnd = 0;
        for (C3391 c3391 : this.f65781) {
            if (z) {
                if (c3391.f11040 == 4 && c4245Matcher.lookingAt(c3391.f11039) && str.equals(c4245Matcher.m13551("name")) && str2.equals(c4245Matcher.m13551("parameters")) && str3.equals(c4245Matcher.m13551("type"))) {
                    iEnd = c4245Matcher.end();
                    z = false;
                }
            } else if (c3391.f11040 == 5) {
                return new int[]{iEnd + 1, TextUtils.lastIndexOf(charSequence, '\n', c3391.f11039)};
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47106(String str, int i, String str2, String str3, int i2) {
        int i3;
        char cCharAt;
        C18415 c18415 = C25021.f80965;
        CharSequence charSequence = this.f65780;
        C4245 c4245Matcher = c18415.matcher(charSequence);
        int iEnd = -1;
        boolean z = false;
        for (C3391 c3391 : this.f65781) {
            int i4 = c3391.f11040;
            int i5 = c3391.f11039;
            if (i4 == 4) {
                if (c4245Matcher.lookingAt(i5) && str.equals(c4245Matcher.m13551("name")) && str2.equals(c4245Matcher.m13551("parameters"))) {
                    if (str3.equals(c4245Matcher.m13551("type"))) {
                        iEnd = c4245Matcher.end();
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
        C14577 c14577 = new C14577(iEnd, charSequence.length(), charSequence);
        int i7 = i;
        while (!c14577.m35177()) {
            String strM35175 = c14577.m35175();
            if (strM35175.length() > 0 && !strM35175.startsWith(":") && !strM35175.startsWith("#") && !strM35175.equals("nop")) {
                char cCharAt3 = strM35175.charAt(0);
                if ('a' <= cCharAt3 && cCharAt3 <= 'z') {
                    i3 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    i7 = i3;
                } else if (cCharAt3 == '.' && (strM35175.startsWith(".array-data") || strM35175.startsWith(".packed-switch") || strM35175.startsWith(".sparse-switch"))) {
                    i3 = i7 - 1;
                    if (i7 == 0) {
                        break;
                    }
                    i7 = i3;
                }
            }
        }
        int i8 = i2;
        while (!c14577.m35177() && i8 >= 0) {
            if (!c14577.m35175().isEmpty()) {
                i8--;
            }
        }
        int iM35179 = c14577.m35179();
        int iM35173 = c14577.m35173();
        C14577 c14578 = new C14577(iM35179, iM35173, charSequence);
        if (c14578.m35171('\"')) {
            int iM35178 = c14578.m35178();
            if (c14578.m35174()) {
                m47099(iM35178, c14578.m35178() - 1);
                return;
            }
        }
        m47099(iM35179, iM35173);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23529 m47100(String str, String str2) {
        C4245 c4245Matcher = C25021.f80969.matcher(this.f65780);
        for (C3391 c3391 : this.f65781) {
            if (c3391.f11040 == 2 && c4245Matcher.lookingAt(c3391.f11039) && str.equals(c4245Matcher.m13551("name")) && str2.equals(c4245Matcher.m13551("type"))) {
                return new C23529(c4245Matcher);
            }
        }
        return null;
    }
}
