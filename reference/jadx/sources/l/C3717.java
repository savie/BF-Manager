package l;

/* JADX INFO: renamed from: l.ۗ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3717 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23855 f12775;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f12776;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f12777;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f12778;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f12779;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f12780;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f12781;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f12782;

    public C3717(String str, int i, int i2, CharSequence charSequence) {
        this.f12776 = str;
        this.f12778 = i;
        this.f12781 = i2;
        this.f12779 = charSequence;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m12101() {
        m12098();
        return this.f12782;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12099() {
        m12098();
        return this.f12777;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m12100() {
        m12098();
        return this.f12780;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m12098() {
        int iCodePointCount;
        if (this.f12782 != null) {
            return;
        }
        C23855 c23855M53205 = this.f12775;
        int i = this.f12778;
        if (c23855M53205 == null) {
            c23855M53205 = C23855.m53205(i, this.f12781, this.f12779);
            this.f12775 = c23855M53205;
        }
        if (c23855M53205.f77241) {
            iCodePointCount = 0;
        } else {
            String str = c23855M53205.f77240;
            iCodePointCount = (240 - str.codePointCount(0, str.length())) / 2;
        }
        int iM4324 = C1173.m4324(i, -iCodePointCount, this.f12779);
        this.f12777 = iM4324;
        String strM4317 = C1173.m4317(iM4324, 240, this.f12779);
        this.f12782 = strM4317;
        int i2 = this.f12777;
        this.f12780 = i2 > 0 || strM4317.length() + i2 < this.f12779.length();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m12102() {
        if (this.f12775 == null) {
            this.f12775 = C23855.m53205(this.f12778, this.f12781, this.f12779);
        }
        m12098();
        this.f12779 = "";
    }
}
