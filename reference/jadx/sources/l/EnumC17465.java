package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59CN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC17465 {
    PREFER_SHOW_ALL(true, true, R.string.MT_Protector),
    PREFER_SHOW_TITLE_ONLY(true, false, R.string.MT_Protector),
    PREFER_SHOW_ICON_ONLY(false, true, R.string.MT_Protector);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f55576;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f55577;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f55578;

    EnumC17465(boolean z, boolean z2, int i) {
        this.f55576 = z;
        this.f55578 = z2;
        this.f55577 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C16737.m39288(this.f55577);
    }
}
