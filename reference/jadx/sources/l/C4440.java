package l;

/* JADX INFO: renamed from: l.ۙۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4440 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f15806;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f15807;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2946 f15808;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f15809;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f15810;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f15811;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f15812;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f15813;

    public C4440(String str, int i, int i2, CharSequence charSequence) {
        this.f15811 = str;
        this.f15806 = i;
        this.f15812 = i2;
        this.f15813 = charSequence;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m12391() {
        m12387();
        return this.f15807;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12389() {
        m12387();
        return this.f15810;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m12390() {
        m12387();
        return this.f15809;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m12387() {
        int iCodePointCount;
        if (this.f15807 != null) {
            return;
        }
        C2946 c2946M8776 = this.f15808;
        int i = this.f15806;
        if (c2946M8776 == null) {
            c2946M8776 = C2946.m8776(i, this.f15812, this.f15813);
            this.f15808 = c2946M8776;
        }
        if (c2946M8776.f11052) {
            iCodePointCount = 0;
        } else {
            String str = c2946M8776.f11051;
            iCodePointCount = (240 - str.codePointCount(0, str.length())) / 2;
        }
        int iM20043 = C7521.m20043(i, -iCodePointCount, this.f15813);
        this.f15810 = iM20043;
        String strM20036 = C7521.m20036(iM20043, 240, this.f15813);
        this.f15807 = strM20036;
        int i2 = this.f15810;
        this.f15809 = i2 > 0 || strM20036.length() + i2 < this.f15813.length();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m12388() {
        if (this.f15808 == null) {
            this.f15808 = C2946.m8776(this.f15806, this.f15812, this.f15813);
        }
        m12387();
        this.f15813 = "";
    }
}
