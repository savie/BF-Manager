package l;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.֡ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0414 implements WildcardType {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Type f1960;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Type f1961;

    public C0414(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length == 1) {
            C17359.requireNonNull(typeArr2[0]);
            C7872.m21410(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
            }
            this.f1960 = C7872.m21404(typeArr2[0]);
            this.f1961 = Object.class;
            return;
        }
        C17359.requireNonNull(typeArr[0]);
        C7872.m21410(typeArr[0]);
        this.f1960 = null;
        this.f1961 = C7872.m21404(typeArr[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f1961};
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f1960;
        return type != null ? new Type[]{type} : C7872.f26212;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && C7872.m21407(this, (WildcardType) obj);
    }

    public final int hashCode() {
        Type type = this.f1960;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f1961.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f1960;
        if (type != null) {
            return "? super " + C7872.m21412(type);
        }
        Type type2 = this.f1961;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + C7872.m21412(type2);
    }
}
