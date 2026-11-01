package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15309 extends EnumC19730 {
    public /* synthetic */ C15309(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("DEFAULT_MODULE_FOR_CREATED_FILES", 45, "--default-module-for-created-files", "opt.arg.default.module.for.created.files", "opt.default.module.for.created.files", enumC19024, enumC18318);
    }

    public C15309(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) throws C21846 {
        EnumC19730 enumC19730 = EnumC19730.f63344;
        if (abstractC10558.mo12003(enumC19730) != null) {
            String str3 = enumC19730.f63414;
            C5909 c5909 = C23879.f77204;
            throw abstractC10558.m26710(new C5909("compiler", "option.too.many", str3));
        }
        if (str2.isEmpty()) {
            throw abstractC10558.m26710(C23879.m52614(str));
        }
        if (mo4848().matcher(str2).matches()) {
            abstractC10558.mo12006(enumC19730.f63414, str2);
            return;
        }
        throw abstractC10558.m26710(C23879.m52615(str, str2));
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۚ */
    public Pattern mo4848() {
        return Pattern.compile("[^,].*");
    }
}
