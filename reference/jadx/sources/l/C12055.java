package l;

/* JADX INFO: renamed from: l.۫֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9BO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12055 extends AbstractC16288 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3460 f40330;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11349 f40331;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f40332;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3460 f40333;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40334;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f40335;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3460 f40336;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3460 f40337;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C23344 f40338;

    @Override // l.AbstractC16288
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29955() {
    }

    public C12055(C23344 c23344, String str, String str2, String str3) {
        super(589824, null);
        this.f40338 = c23344;
        this.f40332 = c23344.m51441(str);
        this.f40335 = c23344.m51441(str2);
        if (str3 != null) {
            this.f40334 = c23344.m51441(str3);
        }
    }

    @Override // l.AbstractC16288
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo15143(String str, boolean z) {
        C23344 c23344 = this.f40338;
        if (z) {
            C3460 c3460M10172 = C3460.m10172(c23344, str, this.f40330);
            this.f40330 = c3460M10172;
            return c3460M10172;
        }
        C3460 c3460M10173 = C3460.m10172(c23344, str, this.f40333);
        this.f40333 = c3460M10173;
        return c3460M10173;
    }

    @Override // l.AbstractC16288
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo15142(int i, C1470 c1470, String str, boolean z) {
        C23344 c23344 = this.f40338;
        if (z) {
            C3460 c3460M10171 = C3460.m10171(c23344, i, c1470, str, this.f40336);
            this.f40336 = c3460M10171;
            return c3460M10171;
        }
        C3460 c3460M10172 = C3460.m10171(c23344, i, c1470, str, this.f40337);
        this.f40337 = c3460M10172;
        return c3460M10172;
    }

    @Override // l.AbstractC16288
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29957(C11349 c11349) {
        c11349.f38290 = this.f40331;
        this.f40331 = c11349;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29959() {
        int i = this.f40334;
        C23344 c23344 = this.f40338;
        int iM28425 = C11349.m28425(c23344, 0, i) + 6 + C3460.m10170(this.f40330, this.f40333, this.f40336, this.f40337);
        C11349 c11349 = this.f40331;
        return c11349 != null ? iM28425 + c11349.m28427(c23344) : iM28425;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29956(C2175 c2175) {
        c2175.m6771(this.f40332);
        c2175.m6771(this.f40335);
        int i = this.f40334;
        int i2 = i != 0 ? 1 : 0;
        if (this.f40330 != null) {
            i2++;
        }
        if (this.f40333 != null) {
            i2++;
        }
        if (this.f40336 != null) {
            i2++;
        }
        if (this.f40337 != null) {
            i2++;
        }
        C11349 c11349 = this.f40331;
        if (c11349 != null) {
            int i3 = 0;
            while (c11349 != null) {
                i3++;
                c11349 = c11349.f38290;
            }
            i2 += i3;
        }
        c2175.m6771(i2);
        C23344 c23344 = this.f40338;
        C11349.m28426(c23344, 0, i, c2175);
        C3460.m10174(this.f40338, this.f40330, this.f40333, this.f40336, this.f40337, c2175);
        C11349 c113410 = this.f40331;
        if (c113410 != null) {
            c113410.m28430(c23344, c2175);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29958(C13466 c13466) {
        c13466.m32969(this.f40331);
    }
}
