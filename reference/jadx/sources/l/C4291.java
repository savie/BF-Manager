package l;

/* JADX INFO: renamed from: l.ۙ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BTO */
/* JADX INFO: loaded from: classes3.dex */
public class C4291 extends AbstractC17571 implements InterfaceC3459, InterfaceC23343 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f15457;

    public C4291(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f15457 = i;
    }

    @Override // l.InterfaceC3459
    /* JADX INFO: renamed from: ᩹ */
    public final int mo10168() {
        return this.f15457;
    }

    @Override // l.AbstractC17571
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5703 mo12091() {
        C12759.m31710(this);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4291) {
            C4291 c4291 = (C4291) obj;
            return m40848().equals(c4291.m40848()) && m40847().equals(c4291.m40847()) && C13465.m32965(this.f55834, c4291.f55834) && C13465.m32965(m40849(), c4291.m40849());
        }
        if (obj instanceof InterfaceC23343) {
            return obj.equals(mo13851());
        }
        return false;
    }

    public final int hashCode() {
        return m40847().hashCode() + ((m40848().hashCode() + (m40849() == null ? 0 : m40849().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC5703 interfaceC5703Mo13851 = mo13851();
        if (interfaceC5703Mo13851 != this) {
            return interfaceC5703Mo13851.toString();
        }
        if ("<init>".equals(m40848())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m40848() + " (Kotlin reflection is not available)";
    }
}
