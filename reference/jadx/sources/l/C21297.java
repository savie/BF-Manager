package l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.᩶ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21297 implements GenericArrayType {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Type f67907;

    public C21297(Type type) {
        C17359.requireNonNull(type);
        this.f67907 = C7872.m21404(type);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f67907;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C7872.m21407(this, (GenericArrayType) obj);
    }

    public final int hashCode() {
        return this.f67907.hashCode();
    }

    public final String toString() {
        return C7872.m21412(this.f67907) + "[]";
    }
}
