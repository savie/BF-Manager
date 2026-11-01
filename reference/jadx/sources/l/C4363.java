package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۙۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: TAZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4363 extends AbstractC1810 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0918 f15603 = new C0918(false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12210(String str, AbstractC1810 abstractC1810) {
        if (abstractC1810 == null) {
            abstractC1810 = C3221.f12023;
        }
        this.f15603.put(str, abstractC1810);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Set m12208() {
        return this.f15603.entrySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2246 m12209(String str) {
        return (C2246) this.f15603.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C4363) && ((C4363) obj).f15603.equals(this.f15603);
        }
        return true;
    }

    public final int hashCode() {
        return this.f15603.hashCode();
    }
}
