package l;

/* JADX INFO: renamed from: l.۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7364 extends EnumC1719 {
    public /* synthetic */ C7364() {
        this("AfterAfterFrameset", 22);
    }

    public C7364(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.m48235()) {
            c5247.m14471((C22222) abstractC21516);
            return true;
        }
        if (abstractC21516.m48232() || EnumC1719.m5736(abstractC21516) || (abstractC21516.m48236() && ((C6699) abstractC21516).f74529.equals("html"))) {
            EnumC1719 enumC1719 = EnumC1719.f6813;
            c5247.f63277 = abstractC21516;
            return enumC1719.mo1923(abstractC21516, c5247);
        }
        if (abstractC21516.m48228()) {
            return true;
        }
        if (abstractC21516.m48236() && ((C6699) abstractC21516).f74529.equals("noframes")) {
            EnumC1719 enumC17110 = EnumC1719.f6812;
            c5247.f63277 = abstractC21516;
            return enumC17110.mo1923(abstractC21516, c5247);
        }
        c5247.m14466(this);
        return false;
    }
}
