package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0966 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3528 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2457 f3529;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        this.f3529.m8286();
        ((C0966) obj).f3529.m8286();
        return 0;
    }

    public C0966(C2457 c2457) {
        this.f3529 = c2457;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3837(C15704 c15704) {
        this.f3528.add(c15704);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m3835() {
        return this.f3528;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3836(InterfaceC13255 interfaceC13255) {
        this.f3529.m8283(interfaceC13255);
    }

    public final int hashCode() {
        this.f3529.m8286();
        return 88294036;
    }

    public final String toString() {
        this.f3529.m8286();
        return "dex-input";
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m3838() {
        this.f3529.m8286();
        return "dex-input";
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13255 m3839() {
        return this.f3529.m8288();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0966)) {
            return false;
        }
        this.f3529.m8286();
        ((C0966) obj).f3529.m8286();
        return true;
    }
}
