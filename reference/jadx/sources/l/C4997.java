package l;

/* JADX INFO: renamed from: l.ۚ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: WBYW */
/* JADX INFO: loaded from: classes3.dex */
public class C4997 extends AbstractC17571 implements InterfaceC1469, InterfaceC9232 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f17396;

    @Override // l.AbstractC17571
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC5703 mo12091() {
        C12759.m31711(this);
        return this;
    }

    public C4997(C4269 c4269) {
        super(c4269, C13961.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f17396 = false;
    }

    @Override // l.InterfaceC4871
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3788() {
        return get();
    }

    @Override // l.AbstractC17571
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5703 mo13851() {
        return this.f17396 ? this : super.mo13851();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4997) {
            C4997 c4997 = (C4997) obj;
            return m40849().equals(c4997.m40849()) && m40848().equals(c4997.m40848()) && m40847().equals(c4997.m40847()) && C13465.m32965(this.f55834, c4997.f55834);
        }
        if (obj instanceof InterfaceC9232) {
            return obj.equals(mo13851());
        }
        return false;
    }

    public final int hashCode() {
        return m40847().hashCode() + ((m40848().hashCode() + (m40849().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC5703 interfaceC5703Mo13851 = mo13851();
        if (interfaceC5703Mo13851 != this) {
            return interfaceC5703Mo13851.toString();
        }
        return "property " + m40848() + " (Kotlin reflection is not available)";
    }
}
