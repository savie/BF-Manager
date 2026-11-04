package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18DH */
/* JADX INFO: loaded from: classes5.dex */
public class C14253 implements InterfaceC12016 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7542 f45058;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public double[] f45057 = new double[8];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f45056 = new ArrayList();

    public C14253(C7542 c7542, double d) {
        this.f45058 = c7542;
        mo17564(d);
    }

    /* JADX INFO: renamed from: ᩴ */
    public double[] mo17565() {
        return this.f45057;
    }

    /* JADX INFO: renamed from: ᩸ */
    public double mo17566() {
        return this.f45057[0];
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo17564(double d) {
        int i = 0;
        while (true) {
            double[] dArr = this.f45057;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = d;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34592(C14253 c14253, C14253 c14254) {
        ArrayList arrayList = c14253.f45056;
        if (!arrayList.contains(c14254)) {
            arrayList.add(c14254);
        }
        ArrayList arrayList2 = c14254.f45056;
        if (arrayList2.contains(c14253)) {
            return;
        }
        arrayList2.add(c14253);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m34593(C14253 c14253) {
        ArrayList arrayList = c14253.f45056;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C14253) it.next()).f45056.remove(c14253);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14253 m34594(int i) {
        return (C14253) this.f45056.get(i);
    }

    @Override // l.InterfaceC12016
    /* JADX INFO: renamed from: ۙ */
    public final void mo30206(long j) {
        for (int i = 0; i < this.f45056.size(); i++) {
            m34594(i).f45058.m49680().m13036(j);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m34597() {
        return this.f45056.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34598() {
        double[] dArr = this.f45057;
        double d = dArr[dArr.length - 1];
        for (int i = 0; i < dArr.length - 1; i++) {
            dArr[i] = d;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34596(C14253 c14253) {
        C7542 c7542 = this.f45058;
        C15745 c15745M49681 = c7542.m49681();
        C15745 c15745M49682 = c14253.f45058.m49681();
        if (c15745M49681 != c15745M49682 && c15745M49681 != null && c15745M49682 != null) {
            throw new RuntimeException("Connection between units on different synths.");
        }
        c7542.m49679(new C23951(this, c14253));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34595() {
        this.f45058.m49679(new C3813(this));
    }
}
