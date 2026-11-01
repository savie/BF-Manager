package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37DX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21536 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC13776 f69952;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f69953;

    /* JADX INFO: renamed from: ܰ */
    public int mo5038() {
        return 1;
    }

    public AbstractC21536(EnumC13776 enumC13776, Object obj) {
        this.f69952 = enumC13776;
        this.f69953 = obj;
    }

    public int hashCode() {
        Object obj = this.f69953;
        return this.f69952.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC21536)) {
            return false;
        }
        AbstractC21536 abstractC21536 = (AbstractC21536) obj;
        return this.f69953.equals(abstractC21536.f69953) && this.f69952 == abstractC21536.f69952;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo8626(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC21536)) {
            return false;
        }
        AbstractC21536 abstractC21536 = (AbstractC21536) obj;
        EnumC13776 enumC13776 = abstractC21536.f69952;
        Object obj2 = this.f69953;
        boolean z = obj2 instanceof C15187;
        EnumC13776 enumC13777 = this.f69952;
        if (!z) {
            return obj2.equals(abstractC21536.f69953) && enumC13777 == enumC13776;
        }
        Object obj3 = abstractC21536.f69953;
        return (obj3 instanceof C15187) && ((C15187) obj2).m36400(obj3) && enumC13777 == enumC13776;
    }

    public String toString() {
        return C0242.m1617("[", this.f69952.toString(), " : '", mo46300(), "']");
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo46300() {
        Object obj = this.f69953;
        return obj == null ? "?" : obj.toString();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo3209(InterfaceC19275 interfaceC19275) throws IOException {
        ((C23509) interfaceC19275).m51765((int) this.f69952.m33539());
    }
}
