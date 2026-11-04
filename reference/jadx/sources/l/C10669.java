package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۤۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10669 extends EnumC7687 {
    public /* synthetic */ C10669(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("LIMIT_MODULES", 77, "--limit-modules", "opt.arg.limitmods", "opt.limitmods", enumC18128, enumC21112);
    }

    public C10669(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) throws C14398 {
        if (str2.isEmpty()) {
            throw abstractC9923.m25755(C22843.m51546(str));
        }
        if (mo10552().matcher(str2).matches()) {
            abstractC9923.mo12200(EnumC7687.f25308.f25368, str2);
            return;
        }
        throw abstractC9923.m25755(C22843.m51547(str, str2));
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ᩴ */
    public Pattern mo10552() {
        return Pattern.compile(",*[^,].*");
    }
}
