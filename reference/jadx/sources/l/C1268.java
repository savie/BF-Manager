package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAVC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1268 extends AbstractC23863 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC3725 f4560;

    public C1268() {
        throw null;
    }

    @Override // l.AbstractC23863
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4587(C2759 c2759, Object obj, Type type, Map map) {
        Object objMo12124;
        Class cls;
        C13420 c13420 = c2759.f9130;
        InterfaceC3725 interfaceC3725 = this.f4560;
        C16558 c16558 = this.f77258;
        if (interfaceC3725 == null) {
            this.f4560 = c13420.m33060(c16558.f53586, c16558.f53589);
        }
        Type c23272 = c16558.f53589;
        String str = c16558.f53585;
        boolean z = type instanceof ParameterizedType;
        if (z) {
            c23272 = C16558.m39201(this.f77255, type, c23272);
            this.f4560 = c13420.m33061(c23272);
        }
        if ((c23272 instanceof ParameterizedType) && z) {
            ParameterizedType parameterizedType = (ParameterizedType) c23272;
            ParameterizedType parameterizedType2 = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type rawType = parameterizedType2.getRawType();
            if ((rawType instanceof Class) && C3134.m10227(actualTypeArguments, ((Class) rawType).getTypeParameters(), parameterizedType2.getActualTypeArguments())) {
                c23272 = new C23272(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
            }
        }
        String str2 = c16558.f53582;
        if (str2 != null && (this.f4560 instanceof C18641)) {
            objMo12124 = C18641.m43394(c2759, c23272, str2);
        } else {
            objMo12124 = this.f4560.mo12124(c2759, c23272, str);
        }
        if (c2759.f9124 == 1) {
            C9470 c9470M9122 = c2759.m9122();
            c9470M9122.f30687 = this;
            c9470M9122.f30686 = c2759.f9133;
            c2759.f9124 = 0;
            return;
        }
        if (obj == null) {
            map.put(str, objMo12124);
            return;
        }
        if (objMo12124 == null && ((cls = c16558.f53586) == Byte.TYPE || cls == Short.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
            return;
        }
        mo17349(obj, objMo12124);
    }
}
