package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13900 extends AbstractC6913 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45795;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f45796;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C13900 f45794 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13900 f45797 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f45798 = new ArrayList();

    public C13900(int i, int i2) {
        this.f45796 = i;
        this.f45795 = i2;
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ۙ */
    public final int mo18941() {
        return this.f45796;
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ۨ */
    public final int mo18942() {
        return this.f45795 - this.f45796;
    }

    @Override // l.InterfaceC8651
    /* JADX INFO: renamed from: ܰ */
    public final List mo18943() {
        return this.f45798;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13900 m33735(int i) {
        int i2 = this.f45795;
        ArrayList arrayList = this.f45798;
        C13900 c13900 = new C13900();
        c13900.f45794 = null;
        c13900.f45797 = null;
        c13900.f45798 = new ArrayList();
        c13900.f45796 = i;
        c13900.f45795 = i2;
        arrayList.getClass();
        c13900.f45798 = new ArrayList(arrayList);
        this.f45795 = i;
        C13900 c13901 = this.f45797;
        c13901.f45794 = c13900;
        c13900.f45797 = c13901;
        c13900.f45794 = this;
        this.f45797 = c13900;
        return c13900;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33736(C13900 c13900) {
        C13900 c13901 = this.f45794;
        c13901.f45797 = c13900;
        c13900.f45794 = c13901;
        c13900.f45797 = this;
        this.f45794 = c13900;
    }
}
