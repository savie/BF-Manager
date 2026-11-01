package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۨ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AY1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12032 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C21203 f40295 = new C21203("UNDEFINED");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21203 f40294 = new C21203("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m29931(Object obj, InterfaceC14771 interfaceC14771) {
        if (!(interfaceC14771 instanceof C14149)) {
            interfaceC14771.mo2097(obj);
            return;
        }
        C14149 c14149 = (C14149) interfaceC14771;
        AbstractC12405 abstractC12405 = c14149.f46445;
        AbstractC18858 abstractC18858 = c14149.f46446;
        Throwable thM41594 = C17904.m41594(obj);
        Object c18754 = thM41594 == null ? obj : new C18754(thM41594, false);
        abstractC18858.getContext();
        if (abstractC12405.mo30859()) {
            c14149.f46447 = c18754;
            c14149.f44023 = 1;
            abstractC12405.mo8623(abstractC18858.getContext(), c14149);
            return;
        }
        AbstractC21721 abstractC21721M47939 = C21390.m47939();
        if (abstractC21721M47939.m48461()) {
            c14149.f46447 = c18754;
            c14149.f44023 = 1;
            abstractC21721M47939.m48459((AbstractC13255) c14149);
            return;
        }
        abstractC21721M47939.m48460(true);
        try {
            InterfaceC11138 interfaceC11138 = (InterfaceC11138) abstractC18858.getContext().mo4416(InterfaceC11138.f37788);
            if (interfaceC11138 == null || interfaceC11138.mo7120()) {
                Object obj2 = c14149.f46448;
                InterfaceC22386 context = abstractC18858.getContext();
                Object objM41155 = C17675.m41155(context, obj2);
                C18568 c18568M45601 = objM41155 != C17675.f56144 ? C20166.m45601(abstractC18858, context) : null;
                try {
                    abstractC18858.mo2097(obj);
                    C7321 c7321 = C7321.f24318;
                    if (c18568M45601 != null) {
                        throw null;
                    }
                    C17675.m41154(context, objM41155);
                } catch (Throwable th) {
                    if (c18568M45601 != null) {
                        throw null;
                    }
                    C17675.m41154(context, objM41155);
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionMo7109 = interfaceC11138.mo7109();
                c14149.mo32430(c18754, cancellationExceptionMo7109);
                c14149.mo2097(C18610.m43014((Throwable) cancellationExceptionMo7109));
            }
            while (abstractC21721M47939.m48465()) {
            }
        } catch (Throwable th2) {
            try {
                c14149.m32737(th2, (Throwable) null);
            } finally {
                abstractC21721M47939.m48463();
            }
        }
    }
}
