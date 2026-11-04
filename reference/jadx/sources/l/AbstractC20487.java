package l;

import java.io.Serializable;
import java.lang.reflect.Field;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.᩵ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20487 implements InterfaceC4825, InterfaceC24217, Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4825 f65626;

    /* JADX INFO: renamed from: ۫ */
    public void mo18033() {
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract Object mo10983(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC4825 mo23811(Object obj, InterfaceC4825 interfaceC4825) {
        C15243.m36590(interfaceC4825, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public AbstractC20487(InterfaceC4825 interfaceC4825) {
        this.f65626 = interfaceC4825;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4825 m46989() {
        return this.f65626;
    }

    @Override // l.InterfaceC4825
    /* JADX INFO: renamed from: ۙ */
    public final void mo8188(Object obj) {
        InterfaceC4825 interfaceC4825 = this;
        while (true) {
            AbstractC20487 abstractC20487 = (AbstractC20487) interfaceC4825;
            InterfaceC4825 interfaceC4826 = abstractC20487.f65626;
            C15243.m36586(interfaceC4826);
            try {
                obj = abstractC20487.mo10983(obj);
                if (obj == EnumC16757.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = C19676.m45347(th);
            }
            abstractC20487.mo18033();
            if (!(interfaceC4826 instanceof AbstractC20487)) {
                interfaceC4826.mo8188(obj);
                return;
            }
            interfaceC4825 = interfaceC4826;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo33360 = mo33360();
        if (objMo33360 == null) {
            objMo33360 = getClass().getName();
        }
        sb.append(objMo33360);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC24217 mo5178() {
        InterfaceC4825 interfaceC4825 = this.f65626;
        if (interfaceC4825 instanceof InterfaceC24217) {
            return (InterfaceC24217) interfaceC4825;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public StackTraceElement mo33360() {
        int iIntValue;
        String strC;
        InterfaceC4079 interfaceC4079 = (InterfaceC4079) getClass().getAnnotation(InterfaceC4079.class);
        if (interfaceC4079 == null || interfaceC4079.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC4079.l()[iIntValue] : -1;
        String strM48400 = C21233.m48400(this);
        if (strM48400 == null) {
            strC = interfaceC4079.c();
        } else {
            strC = strM48400 + '/' + interfaceC4079.c();
        }
        return new StackTraceElement(strC, interfaceC4079.m(), interfaceC4079.f(), i);
    }
}
