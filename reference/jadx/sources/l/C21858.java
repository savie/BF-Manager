package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes.dex */
public final enum C21858 extends EnumC7687 {
    public /* synthetic */ C21858(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("ADD_MODULES", 76, "--add-modules", "opt.arg.addmods", "opt.addmods", enumC18128, enumC21112);
    }

    public C21858(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
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
        EnumC7687 enumC7687 = EnumC7687.f25323;
        String strMo12199 = abstractC9923.mo12199(enumC7687);
        String str3 = enumC7687.f25368;
        if (strMo12199 != null) {
            str2 = C8008.m21875(',', strMo12199, str2);
        }
        abstractC9923.mo12200(str3, str2);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ᩴ */
    public Pattern mo10552() {
        return Pattern.compile(",*[^,].*");
    }
}
