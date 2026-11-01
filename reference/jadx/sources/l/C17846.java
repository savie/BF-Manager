package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes4.dex */
public final class C17846 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1139 f56526;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f56528;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f56529;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2323 f56531;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f56533;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f56534 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f56525 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f56527 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f56532 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f56530 = -1;

    public C17846(C1139 c1139) {
        this.f56526 = c1139;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41433(C0870 c0870) {
        this.f56534.add(c0870);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41431(String str) {
        ArrayList arrayList = this.f56525;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41432(String str, C12731 c12731) {
        this.f56527.add(str);
        this.f56532.add(new C3692(str, c12731.f42472, c12731.getMessage()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41435() {
        return this.f56534.size() >= this.f56526.f5125;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41434(C2323 c2323) {
        this.f56531 = c2323;
    }
}
