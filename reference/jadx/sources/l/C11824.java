package l;

/* JADX INFO: renamed from: l.ۧᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AA3Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C11824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f38151;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11824 m29672(String str) {
        return new C11824(str);
    }

    public C11824(String str) {
        this.f38151 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m29673(InterfaceC17045 interfaceC17045) {
        return ((C17791) interfaceC17045).m41640(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m29675(InterfaceC17045 interfaceC17045) {
        Object objM41640 = ((C17791) interfaceC17045).m41640(this);
        if (objM41640 != null) {
            return objM41640;
        }
        throw new NullPointerException(this.f38151);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m29676(InterfaceC17045 interfaceC17045) {
        return ((C17791) interfaceC17045).m41642(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29674(InterfaceC17045 interfaceC17045, Object obj) {
        ((C17791) interfaceC17045).m41641(this, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11824.class != obj.getClass()) {
            return false;
        }
        return this.f38151.equals(((C11824) obj).f38151);
    }

    public final int hashCode() {
        return this.f38151.hashCode();
    }

    public final String toString() {
        return C8947.m23910(new StringBuilder("Prop{name='"), this.f38151, "'}");
    }
}
