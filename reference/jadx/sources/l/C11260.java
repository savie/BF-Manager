package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6DR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11260 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3450 f35552;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f35553;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC1566 f35554;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f35555 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f35556;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f35557;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35558;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11260 m28503(C6041 c6041, boolean z) {
        C11260 c11260 = new C11260();
        c11260.f35554 = c6041.f976;
        c11260.f35556 = c6041.getName();
        EnumC1763 enumC1763 = EnumC1763.THIS;
        c11260.f35558 = c6041.mo17865(enumC1763);
        c11260.f35557 = true;
        c11260.f35558 = c6041.mo17865(enumC1763);
        if (z) {
            c11260.f35555 = Collections.singletonList(new C17973(c6041.f20667, 0, c6041));
        }
        return c11260;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m28513() {
        return this.f35556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28506(String str) {
        this.f35556 = str;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m28517() {
        return this.f35554;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28508(AbstractC1566 abstractC1566) {
        this.f35554 = abstractC1566;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m28519() {
        return this.f35555;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28511(C17973 c17973) {
        if (this.f35555.isEmpty()) {
            this.f35555 = new ArrayList(3);
        }
        if (this.f35555.contains(c17973)) {
            return;
        }
        this.f35555.add(c17973);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28507(List list) {
        this.f35555 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17973 m28505() {
        if (this.f35555.isEmpty()) {
            throw new IllegalStateException("CodeVar without SSA variables attached: " + this);
        }
        return (C17973) this.f35555.get(0);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m28515() {
        return this.f35553;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28514() {
        this.f35553 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m28512() {
        return this.f35558;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m28520() {
        this.f35558 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28510(C11260 c11260) {
        if (c11260.f35557) {
            this.f35557 = true;
        }
        if (c11260.f35558) {
            this.f35558 = true;
        }
        if (c11260.f35553) {
            this.f35553 = true;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m28516() {
        return this.f35557;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28504() {
        this.f35557 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3450 m28518() {
        return this.f35552;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28509(C3450 c3450) {
        this.f35552 = c3450;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35553 ? "final " : "");
        sb.append(this.f35554);
        sb.append(' ');
        sb.append(this.f35556);
        return sb.toString();
    }
}
