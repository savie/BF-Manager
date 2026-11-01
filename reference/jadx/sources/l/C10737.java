package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: JAVC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10737 extends AbstractC18533 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC7950 f36584;

    public C10737() {
        throw null;
    }

    @Override // l.AbstractC18533
    /* JADX INFO: renamed from: ۙ */
    public final void mo7044(C14265 c14265, Object obj, Type type, Map map) {
        Object objMo1395;
        Class cls;
        C0893 c0893 = c14265.f46686;
        InterfaceC7950 interfaceC7950 = this.f36584;
        C15275 c15275 = this.f58998;
        if (interfaceC7950 == null) {
            this.f36584 = c0893.m3568(c15275.f49790, c15275.f49787);
        }
        Type c18802 = c15275.f49787;
        String str = c15275.f49788;
        boolean z = type instanceof ParameterizedType;
        if (z) {
            c18802 = C15275.m36577(this.f58999, type, c18802);
            this.f36584 = c0893.m3569(c18802);
        }
        if ((c18802 instanceof ParameterizedType) && z) {
            ParameterizedType parameterizedType = (ParameterizedType) c18802;
            ParameterizedType parameterizedType2 = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type rawType = parameterizedType2.getRawType();
            if ((rawType instanceof Class) && C8219.m21522(actualTypeArguments, ((Class) rawType).getTypeParameters(), parameterizedType2.getActualTypeArguments())) {
                c18802 = new C18802(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
            }
        }
        String str2 = c15275.f49789;
        if (str2 != null && (this.f36584 instanceof C0188)) {
            objMo1395 = C0188.m1394(c14265, c18802, str2);
        } else {
            objMo1395 = this.f36584.mo1395(c14265, c18802, str);
        }
        if (c14265.f46685 == 1) {
            C23437 c23437M34407 = c14265.m34407();
            c23437M34407.f75868 = this;
            c23437M34407.f75867 = c14265.f46689;
            c14265.f46685 = 0;
            return;
        }
        if (obj == null) {
            map.put(str, objMo1395);
            return;
        }
        if (objMo1395 == null && ((cls = c15275.f49790) == Byte.TYPE || cls == Short.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
            return;
        }
        mo31963(obj, objMo1395);
    }
}
