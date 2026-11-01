package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18DH */
/* JADX INFO: loaded from: classes4.dex */
public class C13304 implements InterfaceC2719 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15421 f44174;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public double[] f44173 = new double[8];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f44172 = new ArrayList();

    public C13304(C15421 c15421, double d) {
        this.f44174 = c15421;
        mo15280(d);
    }

    /* JADX INFO: renamed from: ۚ */
    public double[] mo15281() {
        return this.f44173;
    }

    /* JADX INFO: renamed from: ۖ */
    public double mo15279() {
        return this.f44173[0];
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo15280(double d) {
        int i = 0;
        while (true) {
            double[] dArr = this.f44173;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = d;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32788(C13304 c13304, C13304 c13305) {
        ArrayList arrayList = c13304.f44172;
        if (!arrayList.contains(c13305)) {
            arrayList.add(c13305);
        }
        ArrayList arrayList2 = c13305.f44172;
        if (arrayList2.contains(c13304)) {
            return;
        }
        arrayList2.add(c13304);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m32789(C13304 c13304) {
        ArrayList arrayList = c13304.f44172;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C13304) it.next()).f44172.remove(c13304);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13304 m32790(int i) {
        return (C13304) this.f44172.get(i);
    }

    @Override // l.InterfaceC2719
    /* JADX INFO: renamed from: ۙ */
    public final void mo8298(long j) {
        for (int i = 0; i < this.f44172.size(); i++) {
            m32790(i).f44174.m38176().m3815(j);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m32793() {
        return this.f44172.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32794() {
        double[] dArr = this.f44173;
        double d = dArr[dArr.length - 1];
        for (int i = 0; i < dArr.length - 1; i++) {
            dArr[i] = d;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32792(C13304 c13304) {
        C15421 c15421 = this.f44174;
        C3403 c3403M38177 = c15421.m38177();
        C3403 c3403M38178 = c13304.f44174.m38177();
        if (c3403M38177 != c3403M38178 && c3403M38177 != null && c3403M38178 != null) {
            throw new RuntimeException("Connection between units on different synths.");
        }
        c15421.m38174(new C22476(this, c13304));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32791() {
        this.f44174.m38174(new C1308(this));
    }
}
