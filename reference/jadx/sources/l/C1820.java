package l;

/* JADX INFO: renamed from: l.֫ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WBYW */
/* JADX INFO: loaded from: classes3.dex */
public class C1820 extends AbstractC2326 implements InterfaceC21761, InterfaceC10572 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f6171;

    @Override // l.AbstractC2326
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC8531 mo6298() {
        C16735.m39515(this);
        return this;
    }

    public C1820(C6661 c6661) {
        super(c6661, C21892.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f6171 = false;
    }

    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() {
        return get();
    }

    @Override // l.AbstractC2326
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC8531 mo6297() {
        return this.f6171 ? this : super.mo6297();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1820) {
            C1820 c1820 = (C1820) obj;
            return m7832().equals(c1820.m7832()) && m7833().equals(c1820.m7833()) && m7831().equals(c1820.m7831()) && C15243.m36589(this.f7503, c1820.f7503);
        }
        if (obj instanceof InterfaceC10572) {
            return obj.equals(mo6297());
        }
        return false;
    }

    public final int hashCode() {
        return m7831().hashCode() + ((m7833().hashCode() + (m7832().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC8531 interfaceC8531Mo6297 = mo6297();
        if (interfaceC8531Mo6297 != this) {
            return interfaceC8531Mo6297.toString();
        }
        return "property " + m7833() + " (Kotlin reflection is not available)";
    }
}
