package l;

import java.io.Serializable;
import java.lang.reflect.Field;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.᩸ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21680 implements InterfaceC14771, InterfaceC8275, Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14771 f70321;

    /* JADX INFO: renamed from: ֨ */
    public void mo40269() {
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract Object mo11546(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC14771 mo20747(Object obj, InterfaceC14771 interfaceC14771) {
        C13465.m32966(interfaceC14771, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public AbstractC21680(InterfaceC14771 interfaceC14771) {
        this.f70321 = interfaceC14771;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14771 m48423() {
        return this.f70321;
    }

    @Override // l.InterfaceC14771
    /* JADX INFO: renamed from: ۙ */
    public final void mo2097(Object obj) {
        InterfaceC14771 interfaceC14771 = this;
        while (true) {
            AbstractC21680 abstractC21680 = (AbstractC21680) interfaceC14771;
            InterfaceC14771 interfaceC14772 = abstractC21680.f70321;
            C13465.m32962(interfaceC14772);
            try {
                obj = abstractC21680.mo11546(obj);
                if (obj == EnumC13214.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = C18610.m43014(th);
            }
            abstractC21680.mo40269();
            if (!(interfaceC14772 instanceof AbstractC21680)) {
                interfaceC14772.mo2097(obj);
                return;
            }
            interfaceC14771 = interfaceC14772;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo40270 = mo40270();
        if (objMo40270 == null) {
            objMo40270 = getClass().getName();
        }
        sb.append(objMo40270);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC8275 mo21694() {
        InterfaceC14771 interfaceC14771 = this.f70321;
        if (interfaceC14771 instanceof InterfaceC8275) {
            return (InterfaceC8275) interfaceC14771;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ */
    public StackTraceElement mo40270() {
        int iIntValue;
        String strC;
        InterfaceC19564 interfaceC19564 = (InterfaceC19564) getClass().getAnnotation(InterfaceC19564.class);
        if (interfaceC19564 == null || interfaceC19564.v() < 1) {
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
        int i = iIntValue >= 0 ? interfaceC19564.l()[iIntValue] : -1;
        String strM26294 = C10392.m26294(this);
        if (strM26294 == null) {
            strC = interfaceC19564.c();
        } else {
            strC = strM26294 + '/' + interfaceC19564.c();
        }
        return new StackTraceElement(strC, interfaceC19564.m(), interfaceC19564.f(), i);
    }
}
