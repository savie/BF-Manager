package l;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5775 implements ParameterizedType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Type[] f19619;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Type f19620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Type f19621;

    public C5775(Type type, Class cls, Type... typeArr) {
        C13638.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f19620 = type == null ? null : C23415.m51551(type);
        this.f19621 = C23415.m51551(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f19619 = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            C13638.requireNonNull(this.f19619[i]);
            C23415.m51557(this.f19619[i]);
            Type[] typeArr3 = this.f19619;
            typeArr3[i] = C23415.m51551(typeArr3[i]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f19619.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f19621;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f19620;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C23415.m51554(this, (ParameterizedType) obj);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f19619) ^ this.f19621.hashCode();
        Type type = this.f19620;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f19619;
        int length = typeArr.length;
        Type type = this.f19621;
        if (length == 0) {
            return C23415.m51548(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(C23415.m51548(type));
        sb.append("<");
        sb.append(C23415.m51548(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(C23415.m51548(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
