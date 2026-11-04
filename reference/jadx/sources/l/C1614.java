package l;

/* JADX INFO: renamed from: l.֫ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9BT */
/* JADX INFO: loaded from: classes3.dex */
public final class C1614 extends AbstractC5343 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5553;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23243 f5554;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4047 f5555;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f5556;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f5557;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4047 f5558;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f5559;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f5560;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C4047 f5561;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4047 f5562;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5563;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f5564;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f5565;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4047 f5566;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5567;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f5568;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4047 f5569;

    @Override // l.AbstractC5343
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5696() {
    }

    public C1614(C23243 c23243, int i, int i2, int i3) {
        super(589824, null);
        this.f5554 = c23243;
        this.f5560 = i;
        this.f5564 = i2;
        this.f5559 = i3;
        this.f5561 = new C4047();
        this.f5566 = new C4047();
        this.f5555 = new C4047();
        this.f5558 = new C4047();
        this.f5562 = new C4047();
        this.f5569 = new C4047();
    }

    @Override // l.AbstractC5343
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5698(String str) {
        this.f5567 = this.f5554.m52248(str).f53507;
    }

    @Override // l.AbstractC5343
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo5705(String str) {
        this.f5569.m13021(this.f5554.m52256(str).f53507);
        this.f5557++;
    }

    @Override // l.AbstractC5343
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5697(int i, String str, String str2) {
        C23243 c23243 = this.f5554;
        int i2 = c23243.m52262(str).f53507;
        C4047 c4047 = this.f5561;
        c4047.m13021(i2);
        c4047.m13021(i);
        c4047.m13021(str2 == null ? 0 : c23243.m52265(str2));
        this.f5568++;
    }

    @Override // l.AbstractC5343
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5699(String str, int i, String... strArr) {
        C23243 c23243 = this.f5554;
        int i2 = c23243.m52256(str).f53507;
        C4047 c4047 = this.f5566;
        c4047.m13021(i2);
        c4047.m13021(i);
        if (strArr == null) {
            c4047.m13021(0);
        } else {
            c4047.m13021(strArr.length);
            for (String str2 : strArr) {
                c4047.m13021(c23243.m52262(str2).f53507);
            }
        }
        this.f5556++;
    }

    @Override // l.AbstractC5343
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo5706(String str, int i, String... strArr) {
        C23243 c23243 = this.f5554;
        int i2 = c23243.m52256(str).f53507;
        C4047 c4047 = this.f5555;
        c4047.m13021(i2);
        c4047.m13021(i);
        if (strArr == null) {
            c4047.m13021(0);
        } else {
            c4047.m13021(strArr.length);
            for (String str2 : strArr) {
                c4047.m13021(c23243.m52262(str2).f53507);
            }
        }
        this.f5553++;
    }

    @Override // l.AbstractC5343
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo5703(String str) {
        this.f5558.m13021(this.f5554.m52248(str).f53507);
        this.f5565++;
    }

    @Override // l.AbstractC5343
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5700(String str, String... strArr) {
        C23243 c23243 = this.f5554;
        int i = c23243.m52248(str).f53507;
        C4047 c4047 = this.f5562;
        c4047.m13021(i);
        c4047.m13021(strArr.length);
        for (String str2 : strArr) {
            c4047.m13021(c23243.m52248(str2).f53507);
        }
        this.f5563++;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m5702() {
        return (this.f5557 > 0 ? 1 : 0) + 1 + (this.f5567 > 0 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5704() {
        C23243 c23243 = this.f5554;
        c23243.m52265("Module");
        int i = this.f5561.f13788 + 22 + this.f5566.f13788 + this.f5555.f13788 + this.f5558.f13788 + this.f5562.f13788;
        if (this.f5557 > 0) {
            c23243.m52265("ModulePackages");
            i += this.f5569.f13788 + 8;
        }
        if (this.f5567 <= 0) {
            return i;
        }
        c23243.m52265("ModuleMainClass");
        return i + 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5701(C4047 c4047) {
        C4047 c4048 = this.f5561;
        int i = c4048.f13788 + 16;
        C4047 c4049 = this.f5566;
        int i2 = i + c4049.f13788;
        C4047 c40410 = this.f5555;
        int i3 = i2 + c40410.f13788;
        C4047 c40411 = this.f5558;
        int i4 = i3 + c40411.f13788;
        C4047 c40412 = this.f5562;
        int i5 = i4 + c40412.f13788;
        C23243 c23243 = this.f5554;
        c4047.m13021(c23243.m52265("Module"));
        c4047.m13023(i5);
        c4047.m13021(this.f5560);
        c4047.m13021(this.f5564);
        c4047.m13021(this.f5559);
        c4047.m13021(this.f5568);
        c4047.m13018(0, c4048.f13788, c4048.f13787);
        c4047.m13021(this.f5556);
        c4047.m13018(0, c4049.f13788, c4049.f13787);
        c4047.m13021(this.f5553);
        c4047.m13018(0, c40410.f13788, c40410.f13787);
        c4047.m13021(this.f5565);
        c4047.m13018(0, c40411.f13788, c40411.f13787);
        c4047.m13021(this.f5563);
        c4047.m13018(0, c40412.f13788, c40412.f13787);
        if (this.f5557 > 0) {
            c4047.m13021(c23243.m52265("ModulePackages"));
            C4047 c40413 = this.f5569;
            c4047.m13023(c40413.f13788 + 2);
            c4047.m13021(this.f5557);
            c4047.m13018(0, c40413.f13788, c40413.f13787);
        }
        if (this.f5567 > 0) {
            c4047.m13021(c23243.m52265("ModuleMainClass"));
            c4047.m13023(2);
            c4047.m13021(this.f5567);
        }
    }
}
