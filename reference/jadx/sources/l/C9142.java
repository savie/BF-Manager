package l;

/* JADX INFO: renamed from: l.ۡۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C9142 extends AbstractC15037 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2431 f29714;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9142(C2431 c2431, AbstractC15037 abstractC15037) {
        super(589824, abstractC15037);
        this.f29714 = c2431;
    }

    @Override // l.AbstractC15037
    /* JADX INFO: renamed from: ۙ */
    public final void mo10792(int i, String str, String str2, String str3, boolean z) {
        if (!str.equals("res/Hex")) {
            super.mo10792(i, str, str2, str3, z);
        } else {
            C2431 c2431 = this.f29714;
            super.mo10792(i, c2431.f7773, C12669.m31438(new StringBuilder(), c2431.f7775, "$", str2), str3, z);
        }
    }
}
