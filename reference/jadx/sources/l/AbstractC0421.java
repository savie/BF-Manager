package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E1V7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0421 implements InterfaceC18911 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f1912;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC0421 f1914;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f1915;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f1917;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1918;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20178 f1920;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f1921;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Object f1922;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C11856 f1916 = new C11856();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5505 f1913 = new C5505();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11856 f1919 = new C11856();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo2201(InterfaceC23145 interfaceC23145);

    public AbstractC0421(C20178 c20178, int i, int i2) {
        this.f1920 = c20178;
        this.f1921 = new ArrayList(i);
        this.f1918 = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m2211() {
        return this.f1912;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2208(String str) {
        this.f1912 = this.f1920.m45610(str);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m2206() {
        return this.f1917;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m2205(String str) {
        this.f1917 = this.f1920.m45610(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2209(AbstractC0421 abstractC0421) {
        this.f1914 = abstractC0421;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m2207() {
        return this.f1915;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2193(int i) {
        this.f1915 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5505 m2191() {
        return this.f1913;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2195(String str) {
        this.f1913.add(this.f1920.m45610(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2196(AbstractC0421 abstractC0421) {
        this.f1916.add(abstractC0421);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C11856 m2190() {
        return this.f1919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2198(C12417 c12417) {
        this.f1919.add(c12417);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m2203() {
        return this.f1921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2197(C11006 c11006) {
        this.f1921.add(c11006);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m2204() {
        return this.f1918;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2199(C17355 c17355) {
        this.f1918.add(c17355);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2202(boolean z, boolean z2, boolean z3, boolean z4, InterfaceC23145 interfaceC23145) {
        AbstractC0421 abstractC0421;
        AbstractC0421 abstractC0422;
        if (z) {
            mo2201(interfaceC23145);
        }
        if (z2 && (abstractC0422 = this.f1914) != null) {
            abstractC0422.m2202(true, true, z3, false, interfaceC23145);
        }
        if (z3) {
            if (!z2 && (abstractC0421 = this.f1914) != null) {
                abstractC0421.m2202(false, false, true, false, interfaceC23145);
            }
            C11856 c11856 = this.f1916;
            int size = c11856.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0421) c11856.get(i)).m2202(true, false, true, false, interfaceC23145);
            }
        }
        if (z4) {
            C11856 c11857 = this.f1919;
            int size2 = c11857.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((AbstractC0421) c11857.get(i2)).m2202(true, false, false, true, interfaceC23145);
            }
        }
    }

    @Override // l.InterfaceC18911
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo2192() {
        return this.f1922;
    }

    @Override // l.InterfaceC18911
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2194(Object obj) {
        this.f1922 = obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2210(InterfaceC21733 interfaceC21733) {
        ArrayList arrayList = this.f1921;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16650) arrayList.get(i)).mo27763(this, interfaceC21733);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2200(InterfaceC21733 interfaceC21733) {
        ArrayList arrayList = this.f1918;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16650) arrayList.get(i)).mo27763(this, interfaceC21733);
        }
    }
}
