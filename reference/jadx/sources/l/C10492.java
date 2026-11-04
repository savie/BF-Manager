package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C10492 implements InterfaceC21197, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f33383;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List f33384;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f33385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21965 f33386;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f33387;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f33388;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f35998;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f33386.compareTo(((C10492) obj).f33386);
    }

    public C10492(C21965 c21965, List list, AbstractC1566 abstractC1566, List list2, List list3, int i) {
        this.f33386 = c21965;
        this.f33388 = list;
        this.f33383 = abstractC1566;
        this.f33387 = list2;
        this.f33384 = list3;
        this.f33385 = i;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ܺ */
    public final C21965 mo8532() {
        return this.f33386;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC1566 mo8519() {
        return this.f33383;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩴ */
    public final List mo8537() {
        return this.f33388;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩸ */
    public final List mo8554() {
        return this.f33387;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩵ */
    public final List mo8542() {
        return this.f33384;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo8510() {
        return (this.f33385 & 128) != 0;
    }

    @Override // l.InterfaceC21197
    /* JADX INFO: renamed from: ᩶ */
    public final int mo8545() {
        return this.f33385;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10492) {
            return this.f33386.equals(((C10492) obj).f33386);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33386.hashCode();
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return C14483.m34974(this) + " (c)";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClspMth{");
        List list = this.f33387;
        if (C4123.m13232((Collection) list)) {
            sb.append('<');
            sb.append(C4123.m13221(list, ", "));
            sb.append("> ");
        }
        sb.append(this.f33386.m49699());
        sb.append('(');
        sb.append(C4123.m13221(this.f33388, ", "));
        sb.append("):");
        sb.append(this.f33383);
        if (mo8510()) {
            sb.append(" VARARG");
        }
        List list2 = this.f33384;
        if (C4123.m13232((Collection) list2)) {
            sb.append(" throws ");
            sb.append(C4123.m13221(list2, ", "));
        }
        sb.append('}');
        return sb.toString();
    }
}
