package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: JALK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17162 implements InterfaceC8130 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8130 f54728;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC8130
    /* JADX INFO: renamed from: ۙ */
    public final Object mo21429(Object obj, AbstractC18858 abstractC18858) throws Throwable {
        C12224 c12224;
        Object next;
        if (abstractC18858 instanceof C12224) {
            c12224 = (C12224) abstractC18858;
            int i = c12224.f40856;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12224.f40856 = i - Integer.MIN_VALUE;
            } else {
                c12224 = new C12224(this, abstractC18858);
            }
        } else {
            c12224 = new C12224(this, abstractC18858);
        }
        Object obj2 = c12224.f40855;
        EnumC13214 enumC13214 = EnumC13214.COROUTINE_SUSPENDED;
        int i2 = c12224.f40856;
        if (i2 == 0) {
            C18610.m43015(obj2);
            Iterator it = ((C5331) obj).m14809().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((InterfaceC14298) next) instanceof InterfaceC22327));
            InterfaceC22327 interfaceC22327 = next instanceof InterfaceC22327 ? (InterfaceC22327) next : null;
            if (interfaceC22327 != null) {
                c12224.f40856 = 1;
                if (this.f54728.mo21429(interfaceC22327, c12224) == enumC13214) {
                    return enumC13214;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C18610.m43015(obj2);
        }
        return C7321.f24318;
    }

    public C17162(InterfaceC8130 interfaceC8130, C23513 c23513) {
        this.f54728 = interfaceC8130;
    }
}
