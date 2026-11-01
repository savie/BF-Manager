package l;

/* JADX INFO: renamed from: l.ܳ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: AA3Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C14178 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f46532;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14178 m34274(String str) {
        return new C14178(str);
    }

    public C14178(String str) {
        this.f46532 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m34275(InterfaceC9239 interfaceC9239) {
        return ((C2887) interfaceC9239).m8689(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m34277(InterfaceC9239 interfaceC9239) {
        Object objM8689 = ((C2887) interfaceC9239).m8689(this);
        if (objM8689 != null) {
            return objM8689;
        }
        throw new NullPointerException(this.f46532);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m34278(InterfaceC9239 interfaceC9239) {
        return ((C2887) interfaceC9239).m8691(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34276(InterfaceC9239 interfaceC9239, Object obj) {
        ((C2887) interfaceC9239).m8690(this, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14178.class != obj.getClass()) {
            return false;
        }
        return this.f46532.equals(((C14178) obj).f46532);
    }

    public final int hashCode() {
        return this.f46532.hashCode();
    }

    public final String toString() {
        return C22697.m50267(new StringBuilder("Prop{name='"), this.f46532, "'}");
    }
}
