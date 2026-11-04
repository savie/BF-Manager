package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C8241 extends AbstractC18551 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7495 f27102;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8241(C7495 c7495) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f27102 = c7495;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        boolean zM23195 = c8614.m23195();
        ApplicationC17729.f58258.edit().putString(zM23195 ? "home_path_left" : "home_path_right", this.f27102.m20218()).apply();
        ApplicationC17729.f58262.edit().putString(zM23195 ? "load_path_left" : "load_path_right", "0").apply();
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo3179() {
        return !this.f27102.mo20209();
    }
}
