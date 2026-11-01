package l;

/* JADX INFO: renamed from: l.ۤۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10201 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15846 f34840;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34841;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8790 f34842;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f34843 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f34844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34845;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f34846;

    public C10201(C15846 c15846) {
        this.f34840 = c15846;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m25993(int i) {
        if (i < 0) {
            return false;
        }
        C15846 c15846 = this.f34840;
        if (i >= c15846.f51283) {
            return false;
        }
        if (this.f34843 != c15846.f51285 || i < this.f34846 || i >= this.f34844) {
            this.f34845 = c15846.m37699(i);
            this.f34842 = (C8790) c15846.f51284.get(this.f34845);
            int iM37693 = c15846.m37693(this.f34845);
            this.f34846 = iM37693;
            this.f34844 = iM37693 + this.f34842.f30212;
            this.f34843 = c15846.f51285;
        }
        this.f34841 = i - this.f34846;
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m25992() {
        return this.f34842.f30213[this.f34841] & 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m25990() {
        return (char) (this.f34842.f30213[this.f34841] >>> 16);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m25994() {
        return this.f34842.m22865(this.f34841) - this.f34842.m22867(this.f34841);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m25995(int i) {
        C8790 c8790 = this.f34842;
        return c8790.f30215[C13638.checkIndex(i, m25994()) + c8790.m22867(this.f34841)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25991(int i) {
        int iM22865 = this.f34842.m22865(this.f34841);
        for (int iM22867 = this.f34842.m22867(this.f34841); iM22867 < iM22865; iM22867++) {
            if (this.f34842.f30215[iM22867] == i) {
                return true;
            }
        }
        return false;
    }
}
