package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܽۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5A5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16347 extends AbstractC12176 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public List f52634;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f52635;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f52636;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public List f52637;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f52638;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public List f52639;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22611 f52640;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public List f52641;

    public C16347() {
        List list = Collections.EMPTY_LIST;
        this.f52634 = list;
        this.f52639 = list;
        this.f52637 = list;
        this.f52641 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38516(String str) {
        C6222 c6222Matcher = C8586.f29688.matcher((CharSequence) str);
        return C8586.m22367(c6222Matcher, 0) ? c6222Matcher.m17261("modifiers") : "";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m38519(CharSequence charSequence) {
        C6222 c6222Matcher = C8586.f29687.matcher(charSequence);
        try {
            return C8586.m22367(c6222Matcher, 0) ? c6222Matcher.m17261("modifiers") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38514(CharSequence charSequence, C1154 c1154) {
        C6222 c6222Matcher = C8586.f29688.matcher(charSequence);
        try {
            String str = c1154.f5175;
            String str2 = c1154.f5176;
            String str3 = c1154.f5177;
            for (int iEnd = 0; C8586.m22367(c6222Matcher, iEnd); iEnd = c6222Matcher.end()) {
                if (str.equals(c6222Matcher.m17261("name")) && str2.equals(c6222Matcher.m17261("parameters")) && str3.equals(c6222Matcher.m17261("type"))) {
                    return c6222Matcher.m17261("modifiers");
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38515(CharSequence charSequence, C22322 c22322) {
        C6222 c6222Matcher = C8586.f29691.matcher(charSequence);
        try {
            String str = c22322.f72894;
            String str2 = c22322.f72899;
            for (int iEnd = 0; C8586.m22367(c6222Matcher, iEnd); iEnd = c6222Matcher.end()) {
                if (str.equals(c6222Matcher.m17261("name")) && str2.equals(c6222Matcher.m17261("type"))) {
                    return c6222Matcher.m17261("modifiers");
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final void mo10753(C6094 c6094, CharSequence charSequence) {
        m30282(charSequence, new InterfaceC0180() { // from class: l.۟ۖۜ
            @Override // l.InterfaceC0180
            /* JADX INFO: renamed from: ۙ */
            public final Runnable mo1383(CharSequence charSequence2, InterfaceC5614 interfaceC5614) {
                int i;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                try {
                    C6222 c6222Matcher = C8586.f29687.matcher(charSequence2);
                    if (C8586.m22367(c6222Matcher, 0)) {
                        C23028 c23028 = new C23028();
                        String strM17261 = c6222Matcher.m17261("type");
                        int iLastIndexOf = strM17261.lastIndexOf(47);
                        int i2 = iLastIndexOf + 1;
                        if (i2 == 0) {
                            i2 = iLastIndexOf + 2;
                        }
                        c23028.f74834 = strM17261;
                        c23028.f74837 = strM17261.substring(i2, strM17261.length() - 1);
                        c23028.f74836 = c6222Matcher.m17271("directive");
                        c23028.f74835 = c6222Matcher.end();
                        arrayList.add(c23028);
                    }
                } catch (Throwable unused) {
                }
                C6222 c6222Matcher2 = C8586.f29688.matcher(charSequence2);
                C6222 c6222Matcher3 = C8586.f29692.matcher(charSequence2);
                int iStart = -1;
                for (int iEnd = 0; C8586.m22367(c6222Matcher2, iEnd); iEnd = c6222Matcher2.end()) {
                    try {
                        if (!interfaceC5614.mo2357()) {
                            if (iStart < c6222Matcher2.end() && !C8586.m22367(c6222Matcher3, c6222Matcher2.end())) {
                                break;
                            }
                            iStart = c6222Matcher3.start();
                            C1154 c1154 = new C1154();
                            c1154.f5180 = c6222Matcher2.m17271("directive");
                            c1154.f5179 = c6222Matcher3.end();
                            String strM17262 = c6222Matcher2.m17261("modifiers");
                            c1154.f5174 = (strM17262.contains("private") || strM17262.contains("static") || strM17262.contains("constructor")) ? false : true;
                            c1154.f5175 = c6222Matcher2.m17261("name");
                            c1154.f5176 = c6222Matcher2.m17261("parameters");
                            c1154.f5177 = c6222Matcher2.m17261("type");
                            if (!arrayList.isEmpty()) {
                                c1154.f5178 = ((C23028) arrayList.get(0)).f74834;
                            }
                            arrayList2.add(c1154);
                        }
                    } catch (Exception unused2) {
                    }
                    return null;
                }
                C6222 c6222Matcher4 = C8586.f29691.matcher(charSequence2);
                C6222 c6222Matcher5 = C8586.f29689.matcher(charSequence2);
                for (int iEnd2 = 0; C8586.m22367(c6222Matcher4, iEnd2); iEnd2 = c6222Matcher4.end()) {
                    try {
                        if (interfaceC5614.mo2357()) {
                            return null;
                        }
                        C22322 c22322 = new C22322();
                        c22322.f72896 = c6222Matcher4.m17271("directive");
                        c22322.f72895 = c6222Matcher4.end();
                        c22322.f72894 = c6222Matcher4.m17261("name");
                        c22322.f72899 = c6222Matcher4.m17261("type");
                        c22322.f72893 = c6222Matcher4.m17261(b.d);
                        if (!arrayList.isEmpty()) {
                            c22322.f72898 = ((C23028) arrayList.get(0)).f74834;
                        }
                        c22322.f72897 = c6222Matcher4.m17261("modifiers").contains("static");
                        arrayList3.add(c22322);
                    } catch (Exception unused3) {
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C22322 c22323 = (C22322) C19084.m43861(arrayList3, 1);
                    C15070 c15070 = new C15070();
                    for (int iEnd3 = 0; C8586.m22367(c6222Matcher5, iEnd3); iEnd3 = c6222Matcher5.end()) {
                        try {
                            c15070.add(c6222Matcher5.end());
                            if (c6222Matcher5.end() > c22323.f72895) {
                                break;
                            }
                        } catch (Exception unused4) {
                        }
                    }
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (c15070.isEmpty() || size < 0) {
                            break;
                        }
                        C22322 c22324 = (C22322) arrayList3.get(size);
                        int i3 = c22324.f72895;
                        while (!c15070.isEmpty()) {
                            if (c15070.isEmpty()) {
                                throw new NoSuchElementException();
                            }
                            if (i3 >= c15070.getInt(c15070.size() - 1)) {
                                break;
                            }
                            c22324.f72895 = c15070.m27092();
                        }
                    }
                }
                C6222 c6222Matcher6 = C8586.f29690.matcher(charSequence2);
                int iEnd4 = 0;
                while (C8586.m22367(c6222Matcher6, iEnd4)) {
                    try {
                        if (interfaceC5614.mo2357()) {
                            return null;
                        }
                        iEnd4 = c6222Matcher6.end();
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
                            C6799 c6799 = new C6799();
                            c6799.f22949 = iEnd4;
                            c6799.f22948 = i4;
                            String string = charSequence2.subSequence(iEnd4, i4).toString();
                            c6799.f22950 = string;
                            try {
                                c6799.f22947 = C11168.f37846.m35229(string);
                            } catch (RuntimeException unused5) {
                                c6799.f22947 = c6799.f22950;
                            }
                            arrayList4.add(c6799);
                            iEnd4 = i5;
                        }
                    } catch (Exception unused6) {
                    }
                }
                final C16347 c16347 = this.f23962;
                return new Runnable() { // from class: l.᩷ۖۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16347.m38517(c16347, arrayList, arrayList2, arrayList3, arrayList4);
                    }
                };
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ۘܰۜ, l.᩹᩻ۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38517(C16347 c16347, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c16347.f52634 = C0561.unmodifiableList(arrayList);
        c16347.f52639 = C0561.unmodifiableList(arrayList2);
        c16347.f52637 = C0561.unmodifiableList(arrayList3);
        c16347.f52641 = C0561.unmodifiableList(arrayList4);
        ?? r1 = c16347.f52640;
        if (r1 != 0) {
            c16347.m38520(c16347.f52635, c16347.f52638, r1);
        }
        InterfaceC13150 interfaceC13150 = c16347.f70111;
        if (interfaceC13150 != null) {
            interfaceC13150.mo9540(c16347.f52634, c16347.f52639, c16347.f52637, c16347.f52641);
        }
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10751() {
        if (m30285()) {
            return this.f52636;
        }
        return null;
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ */
    public final void mo10752(final int i, final int i2, final InterfaceC3976 interfaceC3976) {
        m30283(new Runnable(interfaceC3976, i, i2) { // from class: l.ۤۖۜ

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f34162;

            /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f34164;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC22611 f34165;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f34165 = (AbstractC22611) interfaceC3976;
                this.f34162 = i;
                this.f34164 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ۘܰۜ, l.᩹᩻ۘ] */
            @Override // java.lang.Runnable
            public final void run() {
                C16347.m38518(this.f34163, this.f34165, this.f34162, this.f34164);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38518(C16347 c16347, InterfaceC3976 interfaceC3976, int i, int i2) {
        c16347.f52640 = (AbstractC22611) interfaceC3976;
        c16347.f52635 = i;
        c16347.f52638 = i2;
        if (c16347.m30285()) {
            c16347.m38520(i, i2, interfaceC3976);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m38520(int i, int i2, InterfaceC3976 interfaceC3976) {
        int i3;
        int i4;
        int i5;
        this.f52636 = null;
        for (C23028 c23028 : this.f52634) {
            int i6 = c23028.f74836;
            if (i >= i6 && i <= (i5 = c23028.f74835)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC3976.mo11470(0, 0, null);
                    return;
                } else {
                    this.f52636 = c23028;
                    interfaceC3976.mo11470(-1, -1, c23028.f74837);
                    return;
                }
            }
        }
        for (C22322 c22322 : this.f52637) {
            int i7 = c22322.f72896;
            if (i >= i7 && i <= (i4 = c22322.f72895)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC3976.mo11470(0, 0, null);
                    return;
                } else {
                    this.f52636 = c22322;
                    interfaceC3976.mo11470(-1, -1, c22322.f72894);
                    return;
                }
            }
        }
        for (C1154 c1154 : this.f52639) {
            int i8 = c1154.f5180;
            if (i >= i8 && i <= (i3 = c1154.f5179)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC3976.mo11470(0, 0, null);
                    return;
                } else {
                    this.f52636 = c1154;
                    interfaceC3976.mo11470(c1154.f5180, c1154.f5179, C22697.m50267(new StringBuilder(), c1154.f5175, "()"));
                    return;
                }
            }
        }
        interfaceC3976.mo11470(0, 0, null);
    }
}
