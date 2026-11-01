package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public class C5682 extends AbstractC21536 {
    public C5682() {
        throw null;
    }

    @Override // l.AbstractC21536
    public final String toString() {
        return C0242.m1617("[", this.f69952.toString(), " ", ((C15187) this.f69953).toString(), "]");
    }

    @Override // l.AbstractC21536
    /* JADX INFO: renamed from: ۙ */
    public final void mo3209(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo3209(interfaceC19275);
        ((C15187) this.f69953).mo2341(interfaceC19275);
    }

    @Override // l.AbstractC21536
    public final int hashCode() {
        Object obj = this.f69953;
        return this.f69952.hashCode() + ((obj != null ? ((C15187) obj).hashCode() : 0) * 31);
    }

    @Override // l.AbstractC21536
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5682)) {
            return false;
        }
        C5682 c5682 = (C5682) obj;
        return C13638.equals(this.f69953, c5682.f69953) && this.f69952 == c5682.f69952;
    }
}
