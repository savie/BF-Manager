package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAUY */
/* JADX INFO: loaded from: classes.dex */
public final class C23272 implements ParameterizedType {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Type[] f75418;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Type f75419;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Type f75420;

    public C23272(Type[] typeArr, Type type, Type type2) {
        this.f75418 = typeArr;
        this.f75420 = type;
        this.f75419 = type2;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f75418;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f75420;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f75419;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23272.class == obj.getClass()) {
            C23272 c23272 = (C23272) obj;
            Type type = c23272.f75419;
            Type type2 = c23272.f75420;
            if (!Arrays.equals(this.f75418, c23272.f75418)) {
                return false;
            }
            Type type3 = this.f75420;
            if (type3 == null ? type2 != null : !type3.equals(type2)) {
                return false;
            }
            Type type4 = this.f75419;
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
        Type[] typeArr = this.f75418;
        int iHashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.f75420;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f75419;
        return iHashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
