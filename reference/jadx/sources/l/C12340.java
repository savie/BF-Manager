package l;

import com.alipay.sdk.m.u0.b;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۨۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5A5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12340 extends AbstractC20874 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public List f39623;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public List f39624;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public List f39625;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f39626;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public List f39627;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f39628;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9051 f39629;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f39630;

    public C12340() {
        List list = Collections.EMPTY_LIST;
        this.f39625 = list;
        this.f39624 = list;
        this.f39623 = list;
        this.f39627 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30761(String str) {
        C4245 c4245Matcher = C25021.f80967.matcher((CharSequence) str);
        return C25021.m55851(c4245Matcher, 0) ? c4245Matcher.m13551("modifiers") : "";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m30764(CharSequence charSequence) {
        C4245 c4245Matcher = C25021.f80962.matcher(charSequence);
        try {
            return C25021.m55851(c4245Matcher, 0) ? c4245Matcher.m13551("modifiers") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30760(CharSequence charSequence, C9685 c9685) {
        C4245 c4245Matcher = C25021.f80967.matcher(charSequence);
        try {
            String str = c9685.f31271;
            String str2 = c9685.f31265;
            String str3 = c9685.f31269;
            for (int iEnd = 0; C25021.m55851(c4245Matcher, iEnd); iEnd = c4245Matcher.end()) {
                if (str.equals(c4245Matcher.m13551("name")) && str2.equals(c4245Matcher.m13551("parameters")) && str3.equals(c4245Matcher.m13551("type"))) {
                    return c4245Matcher.m13551("modifiers");
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30759(CharSequence charSequence, C1483 c1483) {
        C4245 c4245Matcher = C25021.f80968.matcher(charSequence);
        try {
            String str = c1483.f5157;
            String str2 = c1483.f5154;
            for (int iEnd = 0; C25021.m55851(c4245Matcher, iEnd); iEnd = c4245Matcher.end()) {
                if (str.equals(c4245Matcher.m13551("name")) && str2.equals(c4245Matcher.m13551("type"))) {
                    return c4245Matcher.m13551("modifiers");
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final void mo14428(C20283 c20283, CharSequence charSequence) {
        m47706(charSequence, new InterfaceC23858() { // from class: l.ܽۨۧ
            @Override // l.InterfaceC23858
            /* JADX INFO: renamed from: ۙ */
            public final Runnable mo19062(CharSequence charSequence2, InterfaceC7509 interfaceC7509) {
                int i;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                try {
                    C4245 c4245Matcher = C25021.f80962.matcher(charSequence2);
                    if (C25021.m55851(c4245Matcher, 0)) {
                        C14160 c14160 = new C14160();
                        String strM13551 = c4245Matcher.m13551("type");
                        int iLastIndexOf = strM13551.lastIndexOf(47);
                        int i2 = iLastIndexOf + 1;
                        if (i2 == 0) {
                            i2 = iLastIndexOf + 2;
                        }
                        c14160.f44772 = strM13551;
                        c14160.f44771 = strM13551.substring(i2, strM13551.length() - 1);
                        c14160.f44770 = c4245Matcher.m13563("directive");
                        c14160.f44769 = c4245Matcher.end();
                        arrayList.add(c14160);
                    }
                } catch (Throwable unused) {
                }
                C4245 c4245Matcher2 = C25021.f80967.matcher(charSequence2);
                C4245 c4245Matcher3 = C25021.f80966.matcher(charSequence2);
                int iStart = -1;
                for (int iEnd = 0; C25021.m55851(c4245Matcher2, iEnd); iEnd = c4245Matcher2.end()) {
                    try {
                        if (!interfaceC7509.mo924()) {
                            if (iStart < c4245Matcher2.end() && !C25021.m55851(c4245Matcher3, c4245Matcher2.end())) {
                                break;
                            }
                            iStart = c4245Matcher3.start();
                            C9685 c9685 = new C9685();
                            c9685.f31268 = c4245Matcher2.m13563("directive");
                            c9685.f31270 = c4245Matcher3.end();
                            String strM13552 = c4245Matcher2.m13551("modifiers");
                            c9685.f31267 = (strM13552.contains("private") || strM13552.contains("static") || strM13552.contains("constructor")) ? false : true;
                            c9685.f31271 = c4245Matcher2.m13551("name");
                            c9685.f31265 = c4245Matcher2.m13551("parameters");
                            c9685.f31269 = c4245Matcher2.m13551("type");
                            if (!arrayList.isEmpty()) {
                                c9685.f31266 = ((C14160) arrayList.get(0)).f44772;
                            }
                            arrayList2.add(c9685);
                        }
                    } catch (Exception unused2) {
                    }
                    return null;
                }
                C4245 c4245Matcher4 = C25021.f80968.matcher(charSequence2);
                C4245 c4245Matcher5 = C25021.f80964.matcher(charSequence2);
                for (int iEnd2 = 0; C25021.m55851(c4245Matcher4, iEnd2); iEnd2 = c4245Matcher4.end()) {
                    try {
                        if (interfaceC7509.mo924()) {
                            return null;
                        }
                        C1483 c1483 = new C1483();
                        c1483.f5155 = c4245Matcher4.m13563("directive");
                        c1483.f5151 = c4245Matcher4.end();
                        c1483.f5157 = c4245Matcher4.m13551("name");
                        c1483.f5154 = c4245Matcher4.m13551("type");
                        c1483.f5153 = c4245Matcher4.m13551(b.d);
                        if (!arrayList.isEmpty()) {
                            c1483.f5156 = ((C14160) arrayList.get(0)).f44772;
                        }
                        c1483.f5152 = c4245Matcher4.m13551("modifiers").contains("static");
                        arrayList3.add(c1483);
                    } catch (Exception unused3) {
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C1483 c1484 = (C1483) j$$ExternalSyntheticOutline0.m(arrayList3, 1);
                    C14763 c14763 = new C14763();
                    for (int iEnd3 = 0; C25021.m55851(c4245Matcher5, iEnd3); iEnd3 = c4245Matcher5.end()) {
                        try {
                            c14763.add(c4245Matcher5.end());
                            if (c4245Matcher5.end() > c1484.f5151) {
                                break;
                            }
                        } catch (Exception unused4) {
                        }
                    }
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (c14763.isEmpty() || size < 0) {
                            break;
                        }
                        C1483 c1485 = (C1483) arrayList3.get(size);
                        int i3 = c1485.f5151;
                        while (!c14763.isEmpty()) {
                            if (c14763.isEmpty()) {
                                throw new NoSuchElementException();
                            }
                            if (i3 >= c14763.getInt(c14763.size() - 1)) {
                                break;
                            }
                            c1485.f5151 = c14763.m37463();
                        }
                    }
                }
                C4245 c4245Matcher6 = C25021.f80963.matcher(charSequence2);
                int iEnd4 = 0;
                while (C25021.m55851(c4245Matcher6, iEnd4)) {
                    try {
                        if (interfaceC7509.mo924()) {
                            return null;
                        }
                        iEnd4 = c4245Matcher6.end();
                        int length = charSequence2.length();
                        int i4 = iEnd4;
                        while (true) {
                            if (i4 < length) {
                                char cCharAt = charSequence2.charAt(i4);
                                if (cCharAt == '\r' || cCharAt == '\n') {
                                    break;
                                }
                                if (cCharAt == '\"') {
                                    i = -1;
                                    break;
                                }
                                if (cCharAt == '\\') {
                                    i4++;
                                }
                                i4++;
                            }
                            i = -1;
                            i4 = -1;
                            break;
                        }
                        if (i4 != i) {
                            int i5 = i4 + 1;
                            C7449 c7449 = new C7449();
                            c7449.f24518 = iEnd4;
                            c7449.f24517 = i4;
                            String string = charSequence2.subSequence(iEnd4, i4).toString();
                            c7449.f24519 = string;
                            try {
                                c7449.f24520 = C15830.f51499.m10291(string);
                            } catch (RuntimeException unused5) {
                                c7449.f24520 = c7449.f24519;
                            }
                            arrayList4.add(c7449);
                            iEnd4 = i5;
                        }
                    } catch (Exception unused6) {
                    }
                }
                final C12340 c12340 = this.f57064;
                return new Runnable() { // from class: l.ܶۨۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12340.m30762(c12340, arrayList, arrayList2, arrayList3, arrayList4);
                    }
                };
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.۠᩹ۧ, l.ۡ֫ۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30762(C12340 c12340, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c12340.f39625 = C4681.unmodifiableList(arrayList);
        c12340.f39624 = C4681.unmodifiableList(arrayList2);
        c12340.f39623 = C4681.unmodifiableList(arrayList3);
        c12340.f39627 = C4681.unmodifiableList(arrayList4);
        ?? r1 = c12340.f39629;
        if (r1 != 0) {
            c12340.m30765(c12340.f39630, c12340.f39628, r1);
        }
        InterfaceC2974 interfaceC2974 = c12340.f69427;
        if (interfaceC2974 != null) {
            interfaceC2974.mo9690(c12340.f39625, c12340.f39624, c12340.f39623, c12340.f39627);
        }
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14424() {
        if (m47708()) {
            return this.f39626;
        }
        return null;
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final void mo14425(final int i, final int i2, final InterfaceC8940 interfaceC8940) {
        m47707(new Runnable(interfaceC8940, i, i2) { // from class: l.ܺۨۧ

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f54253;

            /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f54255;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC9051 f54256;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f54256 = (AbstractC9051) interfaceC8940;
                this.f54255 = i;
                this.f54253 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.۠᩹ۧ, l.ۡ֫ۧ] */
            @Override // java.lang.Runnable
            public final void run() {
                C12340.m30763(this.f54254, this.f54256, this.f54255, this.f54253);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30763(C12340 c12340, InterfaceC8940 interfaceC8940, int i, int i2) {
        c12340.f39629 = (AbstractC9051) interfaceC8940;
        c12340.f39630 = i;
        c12340.f39628 = i2;
        if (c12340.m47708()) {
            c12340.m30765(i, i2, interfaceC8940);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m30765(int i, int i2, InterfaceC8940 interfaceC8940) {
        int i3;
        int i4;
        int i5;
        this.f39626 = null;
        for (C14160 c14160 : this.f39625) {
            int i6 = c14160.f44770;
            if (i >= i6 && i <= (i5 = c14160.f44769)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC8940.mo1434(0, 0, null);
                    return;
                } else {
                    this.f39626 = c14160;
                    interfaceC8940.mo1434(-1, -1, c14160.f44771);
                    return;
                }
            }
        }
        for (C1483 c1483 : this.f39623) {
            int i7 = c1483.f5155;
            if (i >= i7 && i <= (i4 = c1483.f5151)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC8940.mo1434(0, 0, null);
                    return;
                } else {
                    this.f39626 = c1483;
                    interfaceC8940.mo1434(-1, -1, c1483.f5157);
                    return;
                }
            }
        }
        for (C9685 c9685 : this.f39624) {
            int i8 = c9685.f31268;
            if (i >= i8 && i <= (i3 = c9685.f31270)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC8940.mo1434(0, 0, null);
                    return;
                } else {
                    this.f39626 = c9685;
                    interfaceC8940.mo1434(c9685.f31268, c9685.f31270, C8947.m23910(new StringBuilder(), c9685.f31271, "()"));
                    return;
                }
            }
        }
        interfaceC8940.mo1434(0, 0, null);
    }
}
