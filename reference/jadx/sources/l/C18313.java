package l;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18313 implements ParameterizedType {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Type f59725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Type[] f59726;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Type f59727;

    public C18313(Type type, Class cls, Type... typeArr) {
        C17359.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException(C24966.m55772(cls, "Must specify owner type for "));
        }
        this.f59725 = type == null ? null : C7872.m21404(type);
        this.f59727 = C7872.m21404(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f59726 = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            C17359.requireNonNull(this.f59726[i]);
            C7872.m21410(this.f59726[i]);
            Type[] typeArr3 = this.f59726;
            typeArr3[i] = C7872.m21404(typeArr3[i]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f59726.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f59727;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f59725;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C7872.m21407(this, (ParameterizedType) obj);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f59726) ^ this.f59727.hashCode();
        Type type = this.f59725;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f59726;
        int length = typeArr.length;
        Type type = this.f59727;
        if (length == 0) {
            return C7872.m21412(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(C7872.m21412(type));
        sb.append("<");
        sb.append(C7872.m21412(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(C7872.m21412(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
