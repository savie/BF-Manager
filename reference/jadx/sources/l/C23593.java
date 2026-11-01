package l;

import com.alipay.sdk.m.n.c;

/* JADX INFO: renamed from: l.᩻ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes.dex */
public final enum C23593 extends EnumC1719 {
    public /* synthetic */ C23593() {
        this("InTable", 8);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.f69910 == EnumC15167.Character && C4145.m11787(c5247.m44834().m2833(), C14421.f47264)) {
            c5247.m14482();
            c5247.m14503();
            c5247.m14486(EnumC1719.f6802);
            return c5247.mo14473(abstractC21516);
        }
        if (abstractC21516.m48235()) {
            c5247.m14471((C22222) abstractC21516);
            return true;
        }
        if (abstractC21516.m48232()) {
            c5247.m14466(this);
            return false;
        }
        if (abstractC21516.m48236()) {
            C6699 c6699 = (C6699) abstractC21516;
            String str = c6699.f74529;
            if (str.equals("caption")) {
                c5247.m14510();
                c5247.m14507();
                c5247.m14462(c6699);
                c5247.m14486(EnumC1719.f6799);
                return true;
            }
            if (str.equals("colgroup")) {
                c5247.m14510();
                c5247.m14462(c6699);
                c5247.m14486(EnumC1719.f6801);
                return true;
            }
            if (str.equals("col")) {
                c5247.m14510();
                c5247.m44833("colgroup");
                return c5247.mo14473(abstractC21516);
            }
            if (C4145.m11787(str, C14421.f47267)) {
                c5247.m14510();
                c5247.m14462(c6699);
                c5247.m14486(EnumC1719.f6811);
                return true;
            }
            if (C4145.m11787(str, C14421.f47276)) {
                c5247.m14510();
                c5247.m44833("tbody");
                return c5247.mo14473(abstractC21516);
            }
            if (str.equals("table")) {
                c5247.m14466(this);
                if (c5247.m14498(str)) {
                    c5247.m14501(str);
                    if (!c5247.m14499()) {
                        c5247.m14462(c6699);
                        return true;
                    }
                    return c5247.mo14473(abstractC21516);
                }
            } else {
                if (C4145.m11787(str, C14421.f47282)) {
                    EnumC1719 enumC1719 = EnumC1719.f6812;
                    c5247.f63277 = abstractC21516;
                    return enumC1719.mo1923(abstractC21516, c5247);
                }
                if (str.equals("input")) {
                    if (!c6699.m50749() || !c6699.f74528.get("type").equalsIgnoreCase("hidden")) {
                        return m52020(abstractC21516, c5247);
                    }
                    c5247.m14491(c6699);
                    return true;
                }
                if (str.equals(c.c)) {
                    c5247.m14466(this);
                    if (c5247.m14478() == null && !c5247.m14508("template")) {
                        c5247.m14468(c6699, false, false);
                        return true;
                    }
                } else {
                    return m52020(abstractC21516, c5247);
                }
            }
            return false;
        }
        if (abstractC21516.m48231()) {
            String str2 = ((C3876) abstractC21516).f74529;
            if (str2.equals("table")) {
                if (!c5247.m14498(str2)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14501("table");
                c5247.m14499();
                return true;
            }
            if (C4145.m11787(str2, C14421.f47261)) {
                c5247.m14466(this);
                return false;
            }
            if (str2.equals("template")) {
                c5247.m14470(abstractC21516, EnumC1719.f6812);
                return true;
            }
            return m52020(abstractC21516, c5247);
        }
        if (abstractC21516.m48228()) {
            if (c5247.m44838("html")) {
                c5247.m14466(this);
            }
            return true;
        }
        return m52020(abstractC21516, c5247);
    }

    public C23593(String str, int i) {
        super(str, i, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m52020(AbstractC21516 abstractC21516, C5247 c5247) {
        c5247.m14466(this);
        c5247.m14487(true);
        c5247.m14470(abstractC21516, EnumC1719.f6813);
        c5247.m14487(false);
        return true;
    }
}
