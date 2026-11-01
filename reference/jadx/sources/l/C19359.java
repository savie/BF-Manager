package l;

/* JADX INFO: renamed from: l.᩵ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19359 extends EnumC1719 {
    public /* synthetic */ C19359() {
        this("InFrameset", 19);
    }

    public C19359(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        EnumC1719 enumC1719;
        if (EnumC1719.m5736(abstractC21516)) {
            abstractC21516.getClass();
            c5247.m14467((C5288) abstractC21516);
            return true;
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
            str.getClass();
            switch (str) {
                case "frameset":
                    c5247.m14462(c6699);
                    return true;
                case "html":
                    enumC1719 = EnumC1719.f6813;
                    break;
                case "frame":
                    c5247.m14491(c6699);
                    return true;
                case "noframes":
                    enumC1719 = EnumC1719.f6812;
                    break;
                default:
                    c5247.m14466(this);
                    return false;
            }
            c5247.f63277 = c6699;
            return enumC1719.mo1923((AbstractC21516) c6699, c5247);
        }
        if (abstractC21516.m48231() && ((C3876) abstractC21516).f74529.equals("frameset")) {
            if (c5247.m44838("html")) {
                c5247.m14466(this);
                return false;
            }
            c5247.m14483();
            if (!c5247.m14502() && !c5247.m44838("frameset")) {
                c5247.m14486(EnumC1719.f6810);
                return true;
            }
        } else if (abstractC21516.m48228()) {
            if (!c5247.m44838("html")) {
                c5247.m14466(this);
            }
        } else {
            c5247.m14466(this);
            return false;
        }
        return true;
    }
}
