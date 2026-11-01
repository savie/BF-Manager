package l;

import java.nio.file.InvalidPathException;

/* JADX INFO: renamed from: l.᩻ܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes.dex */
public final enum C23776 extends EnumC19730 {
    public /* synthetic */ C23776(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("SOURCEFILE", 79, "sourcefile", null, enumC19024, enumC18318);
    }

    public C23776(String str, int i, String str2, String str3, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2369(String str) {
        if (str.endsWith(".java")) {
            return true;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return EnumC12508.m31069(str.substring(0, iIndexOf)) && EnumC12508.m31069(str.substring(iIndexOf + 1));
        }
        return EnumC12508.m31069(str);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2367(AbstractC10558 abstractC10558, String str) throws C21846 {
        if (str.endsWith(".java")) {
            try {
                InterfaceC3800 interfaceC3800 = C22852.get(str, new String[0]);
                if (!C5212.exists(interfaceC3800, new EnumC22146[0])) {
                    String string = interfaceC3800.toString();
                    C5909 c5909 = C23879.f77204;
                    throw abstractC10558.m26710(new C5909("compiler", "file.not.found", string));
                }
                if (!C5212.isRegularFile(interfaceC3800, new EnumC22146[0])) {
                    C5909 c59010 = C23879.f77204;
                    throw abstractC10558.m26710(new C5909("compiler", "file.not.file", interfaceC3800));
                }
                abstractC10558.mo12007(interfaceC3800);
                return;
            } catch (InvalidPathException unused) {
                C5909 c59011 = C23879.f77204;
                throw abstractC10558.m26710(new C5909("compiler", "invalid.path", str));
            }
        }
        abstractC10558.mo12005(str);
    }
}
