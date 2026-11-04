package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۢ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10349 extends AbstractC0655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21869 f32966 = new C21869(false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26625(String str, AbstractC0655 abstractC0655) {
        if (abstractC0655 == null) {
            abstractC0655 = C19300.f62377;
        }
        this.f32966.put(str, abstractC0655);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Set m26626() {
        return this.f32966.entrySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2892 m26624(String str) {
        return (C2892) this.f32966.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C10349) && ((C10349) obj).f32966.equals(this.f32966);
        }
        return true;
    }

    public final int hashCode() {
        return this.f32966.hashCode();
    }
}
