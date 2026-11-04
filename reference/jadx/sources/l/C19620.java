package l;

import java.nio.file.InvalidPathException;

/* JADX INFO: renamed from: l.ᩴۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19620 extends EnumC7687 {
    public /* synthetic */ C19620(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("SOURCEFILE", 79, "sourcefile", null, enumC18128, enumC21112);
    }

    public C19620(String str, int i, String str2, String str3, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public boolean mo8770(String str) {
        if (str.endsWith(".java")) {
            return true;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return EnumC21704.m49269(str.substring(0, iIndexOf)) && EnumC21704.m49269(str.substring(iIndexOf + 1));
        }
        return EnumC21704.m49269(str);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo2207(AbstractC9923 abstractC9923, String str) throws C14398 {
        if (str.endsWith(".java")) {
            try {
                InterfaceC24329 interfaceC24329 = C14631.get(str, new String[0]);
                if (!C3445.exists(interfaceC24329, new EnumC20599[0])) {
                    String string = interfaceC24329.toString();
                    C11040 c11040 = C22843.f74058;
                    throw abstractC9923.m25755(new C11040("compiler", "file.not.found", string));
                }
                if (!C3445.isRegularFile(interfaceC24329, new EnumC20599[0])) {
                    C11040 c11041 = C22843.f74058;
                    throw abstractC9923.m25755(new C11040("compiler", "file.not.file", interfaceC24329));
                }
                abstractC9923.mo25757(interfaceC24329);
                return;
            } catch (InvalidPathException unused) {
                C11040 c11042 = C22843.f74058;
                throw abstractC9923.m25755(new C11040("compiler", "invalid.path", str));
            }
        }
        abstractC9923.mo25756(str);
    }
}
