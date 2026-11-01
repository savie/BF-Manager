package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAUY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18802 implements ParameterizedType {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Type f60935;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Type[] f60936;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Type f60937;

    public C18802(Type[] typeArr, Type type, Type type2) {
        this.f60936 = typeArr;
        this.f60937 = type;
        this.f60935 = type2;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f60936;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f60937;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f60935;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18802.class == obj.getClass()) {
            C18802 c18802 = (C18802) obj;
            Type type = c18802.f60935;
            Type type2 = c18802.f60937;
            if (!Arrays.equals(this.f60936, c18802.f60936)) {
                return false;
            }
            Type type3 = this.f60937;
            if (type3 == null ? type2 != null : !type3.equals(type2)) {
                return false;
            }
            Type type4 = this.f60935;
            if (type4 != null) {
                return type4.equals(type);
            }
            if (type == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Type[] typeArr = this.f60936;
        int iHashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.f60937;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f60935;
        return iHashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
