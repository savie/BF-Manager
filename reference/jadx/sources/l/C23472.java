package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: JALK */
/* JADX INFO: loaded from: classes.dex */
public final class C23472 implements InterfaceC3174 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3174 f75933;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC3174
    /* JADX INFO: renamed from: ۙ */
    public final Object mo10365(Object obj, AbstractC6317 abstractC6317) throws Throwable {
        C16012 c16012;
        Object next;
        if (abstractC6317 instanceof C16012) {
            c16012 = (C16012) abstractC6317;
            int i = c16012.f51956;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16012.f51956 = i - Integer.MIN_VALUE;
            } else {
                c16012 = new C16012(this, abstractC6317);
            }
        } else {
            c16012 = new C16012(this, abstractC6317);
        }
        Object obj2 = c16012.f51957;
        EnumC16757 enumC16757 = EnumC16757.COROUTINE_SUSPENDED;
        int i2 = c16012.f51956;
        if (i2 == 0) {
            C19676.m45348(obj2);
            Iterator it = ((C14115) obj).m34265().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((InterfaceC7647) next) instanceof InterfaceC5167));
            InterfaceC5167 interfaceC5167 = next instanceof InterfaceC5167 ? (InterfaceC5167) next : null;
            if (interfaceC5167 != null) {
                c16012.f51956 = 1;
                if (this.f75933.mo10365(interfaceC5167, c16012) == enumC16757) {
                    return enumC16757;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C19676.m45348(obj2);
        }
        return C11471.f36082;
    }

    public C23472(InterfaceC3174 interfaceC3174, C12283 c12283) {
        this.f75933 = interfaceC3174;
    }
}
