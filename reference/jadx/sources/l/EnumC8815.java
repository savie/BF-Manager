package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59CN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8815 {
    PREFER_SHOW_ALL(true, true, R.string.MT_Protector),
    PREFER_SHOW_TITLE_ONLY(true, false, R.string.MT_Protector),
    PREFER_SHOW_ICON_ONLY(false, true, R.string.MT_Protector);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f28816;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f28817;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f28818;

    EnumC8815(boolean z, boolean z2, int i) {
        this.f28817 = z;
        this.f28818 = z2;
        this.f28816 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C21576.m49088(this.f28816);
    }
}
