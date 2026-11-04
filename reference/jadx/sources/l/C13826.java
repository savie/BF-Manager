package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۬ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13826 extends EnumC7687 {
    public /* synthetic */ C13826(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("ADD_EXPORTS", 72, "--add-exports", "opt.arg.addExports", "opt.addExports", enumC18128, enumC21112);
    }

    public C13826(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) throws C14398 {
        if (str2.isEmpty()) {
            throw abstractC9923.m25755(C22843.m51546(str));
        }
        if (!mo10552().matcher(str2).matches()) {
            throw abstractC9923.m25755(C22843.m51547(str, str2));
        }
        EnumC7687 enumC7687 = EnumC7687.f25300;
        String strMo12199 = abstractC9923.mo12199(enumC7687);
        String str3 = enumC7687.f25368;
        if (strMo12199 != null) {
            str2 = C8008.m21875((char) 0, strMo12199, str2);
        }
        abstractC9923.mo12200(str3, str2);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ᩴ */
    public Pattern mo10552() {
        return Pattern.compile("([^/]+)/([^=]+)=(,*[^,].*)");
    }
}
