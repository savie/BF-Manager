package l;

/* JADX INFO: renamed from: l.ۘܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXS */
/* JADX INFO: loaded from: classes2.dex */
public final class C4081 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m11610(C13110 c13110, InterfaceC14771 interfaceC14771, boolean z) {
        Object objMo32437 = c13110.mo32437();
        Throwable thMo32441 = c13110.mo32441(objMo32437);
        Object objM43014 = thMo32441 != null ? C18610.m43014(thMo32441) : c13110.mo32438(objMo32437);
        if (z) {
            C14149 c14149 = (C14149) interfaceC14771;
            AbstractC18858 abstractC18858 = c14149.f46446;
            Object obj = c14149.f46448;
            InterfaceC22386 context = abstractC18858.getContext();
            Object objM41155 = C17675.m41155(context, obj);
            C18568 c18568M45601 = objM41155 != C17675.f56144 ? C20166.m45601(abstractC18858, context) : null;
            try {
                c14149.f46446.mo2097(objM43014);
                C7321 c7321 = C7321.f24318;
                if (c18568M45601 == null) {
                    C17675.m41154(context, objM41155);
                    return;
                }
                throw null;
            } catch (Throwable th) {
                if (c18568M45601 != null) {
                    throw null;
                }
                C17675.m41154(context, objM41155);
                throw th;
            }
        }
        interfaceC14771.mo2097(objM43014);
    }
}
