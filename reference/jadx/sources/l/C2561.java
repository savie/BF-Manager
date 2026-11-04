package l;

/* JADX INFO: renamed from: l.ۖۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2561 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1070[] f8230 = new C1070[16];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC19475 f8231;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20461 f8232;

    public C2561() {
        int i = 0;
        while (true) {
            C1070[] c1070Arr = this.f8230;
            if (i >= c1070Arr.length) {
                return;
            }
            c1070Arr[i] = new C1070(this, i);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8602(C15745 c15745, AbstractC10568 abstractC10568) {
        this.f8231 = c15745;
        if (this.f8232 == null) {
            C20461 c20461 = new C20461();
            C13508 c13508 = new C13508("InputA");
            c20461.f65558 = c13508;
            c20461.m13040(c13508);
            C13508 c13509 = new C13508("InputB");
            c20461.f65557 = c13509;
            c20461.m13040(c13509);
            C4799 c4799 = new C4799("OutputB");
            c20461.f65556 = c4799;
            c20461.m13040(c4799);
            this.f8232 = c20461;
            c15745.m37655(c20461);
        }
        C9272 c9272 = new C9272(this, 64, abstractC10568);
        for (int i = 0; i < 16; i++) {
            this.f8230[i].m4014(c9272);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8600(int i, int i2) {
        this.f8230[i].m4020(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8601(int i, int i2, int i3) {
        this.f8230[i].m4012(i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8608(int i, int i2, int i3) {
        this.f8230[i].m4013(i2, ((double) i3) * 0.007874015748031496d * 0.25d);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8603(int i, double d) {
        this.f8230[i].m4015(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8599(int i, double d) {
        this.f8230[i].m4011(d);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m8609(int i, double d) {
        this.f8230[i].m4021(d);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m8605(int i, double d) {
        this.f8230[i].m4017(d);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m8606(int i, double d) {
        this.f8230[i].m4018(d);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m8604(int i, double d) {
        this.f8230[i].m4016(d);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8607(int i, double d) {
        this.f8230[i].m4019(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4799 m8598() {
        return this.f8232.f65556;
    }
}
