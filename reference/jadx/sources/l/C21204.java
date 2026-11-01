package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public class C21204 extends AbstractC21536 {
    public C21204() {
        throw null;
    }

    public C21204(EnumC13776 enumC13776, C15187 c15187, C15187 c15188) {
        super(enumC13776, new C13111(c15187, c15188));
    }

    @Override // l.AbstractC21536
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21204)) {
            return false;
        }
        C21204 c21204 = (C21204) obj;
        return this.f69952 == c21204.f69952 && ((C15187) ((C13111) this.f69953).f43679).equals(((C13111) c21204.f69953).f43679) && ((C15187) ((C13111) this.f69953).f43680).equals(((C13111) c21204.f69953).f43680);
    }

    @Override // l.AbstractC21536
    /* JADX INFO: renamed from: ۙ */
    public boolean mo8626(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21204)) {
            return false;
        }
        C21204 c21204 = (C21204) obj;
        return this.f69952 == c21204.f69952 && ((C15187) ((C13111) this.f69953).f43679).m36400(((C13111) c21204.f69953).f43679) && ((C15187) ((C13111) this.f69953).f43680).m36400(((C13111) c21204.f69953).f43680);
    }

    @Override // l.AbstractC21536
    public final String toString() {
        return this.f69952.toString() + "[" + ((C15187) ((C13111) this.f69953).f43679).toString() + "," + ((C15187) ((C13111) this.f69953).f43680).toString() + "]";
    }

    @Override // l.AbstractC21536
    /* JADX INFO: renamed from: ۙ */
    public void mo3209(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo3209(interfaceC19275);
        if (this.f69952 == EnumC13776.f45409) {
            ((C23509) interfaceC19275).m51765(((C15187) ((C13111) this.f69953).f43679).f43854);
        } else {
            ((C23509) interfaceC19275).m51770(((C15187) ((C13111) this.f69953).f43679).f43854);
        }
        ((C23509) interfaceC19275).m51770(((C15187) ((C13111) this.f69953).f43680).f43854);
    }
}
