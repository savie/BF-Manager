package l;

import com.alipay.sdk.m.n.c;

/* JADX INFO: renamed from: l.ܺ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C16463 extends EnumC15717 {
    public /* synthetic */ C16463() {
        this("InTable", 8);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.f2843 == EnumC9750.Character && C0669.m2903(c4310.m20060().m37100(), C17209.f56085)) {
            c4310.m13743();
            c4310.m13798();
            c4310.m13765(EnumC15717.f51052);
            return c4310.mo13758(abstractC0802);
        }
        if (abstractC0802.m3220()) {
            c4310.m13752((C14225) abstractC0802);
            return true;
        }
        if (abstractC0802.m3215()) {
            c4310.m13755(this);
            return false;
        }
        if (abstractC0802.m3217()) {
            C7514 c7514 = (C7514) abstractC0802;
            String str = c7514.f60787;
            if (str.equals("caption")) {
                c4310.m13776();
                c4310.m13782();
                c4310.m13746(c7514);
                c4310.m13765(EnumC15717.f51058);
                return true;
            }
            if (str.equals("colgroup")) {
                c4310.m13776();
                c4310.m13746(c7514);
                c4310.m13765(EnumC15717.f51064);
                return true;
            }
            if (str.equals("col")) {
                c4310.m13776();
                c4310.m20067("colgroup");
                return c4310.mo13758(abstractC0802);
            }
            if (C0669.m2903(str, C17209.f56072)) {
                c4310.m13776();
                c4310.m13746(c7514);
                c4310.m13765(EnumC15717.f51055);
                return true;
            }
            if (C0669.m2903(str, C17209.f56066)) {
                c4310.m13776();
                c4310.m20067("tbody");
                return c4310.mo13758(abstractC0802);
            }
            if (str.equals("table")) {
                c4310.m13755(this);
                if (c4310.m13781(str)) {
                    c4310.m13778(str);
                    if (!c4310.m13774()) {
                        c4310.m13746(c7514);
                        return true;
                    }
                    return c4310.mo13758(abstractC0802);
                }
            } else {
                if (C0669.m2903(str, C17209.f56097)) {
                    EnumC15717 enumC15717 = EnumC15717.f51073;
                    c4310.f24102 = abstractC0802;
                    return enumC15717.mo2666(abstractC0802, c4310);
                }
                if (str.equals("input")) {
                    if (!c7514.m43492() || !c7514.f60782.get("type").equalsIgnoreCase("hidden")) {
                        return m39011(abstractC0802, c4310);
                    }
                    c4310.m13790(c7514);
                    return true;
                }
                if (str.equals(c.c)) {
                    c4310.m13755(this);
                    if (c4310.m13767() == null && !c4310.m13783("template")) {
                        c4310.m13751(c7514, false, false);
                        return true;
                    }
                } else {
                    return m39011(abstractC0802, c4310);
                }
            }
            return false;
        }
        if (abstractC0802.m3218()) {
            String str2 = ((C0056) abstractC0802).f60787;
            if (str2.equals("table")) {
                if (!c4310.m13781(str2)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13778("table");
                c4310.m13774();
                return true;
            }
            if (C0669.m2903(str2, C17209.f56077)) {
                c4310.m13755(this);
                return false;
            }
            if (str2.equals("template")) {
                c4310.m13749(abstractC0802, EnumC15717.f51073);
                return true;
            }
            return m39011(abstractC0802, c4310);
        }
        if (abstractC0802.m3221()) {
            if (c4310.m20063("html")) {
                c4310.m13755(this);
            }
            return true;
        }
        return m39011(abstractC0802, c4310);
    }

    public C16463(String str, int i) {
        super(str, i, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m39011(AbstractC0802 abstractC0802, C4310 c4310) {
        c4310.m13755(this);
        c4310.m13766(true);
        c4310.m13749(abstractC0802, EnumC15717.f51053);
        c4310.m13766(false);
        return true;
    }
}
