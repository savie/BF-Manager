package l;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ܿۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17064 implements GenericArrayType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Type f54478;

    public C17064(Type type) {
        C13638.requireNonNull(type);
        this.f54478 = C23415.m51551(type);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f54478;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C23415.m51554(this, (GenericArrayType) obj);
    }

    public final int hashCode() {
        return this.f54478.hashCode();
    }

    public final String toString() {
        return C23415.m51548(this.f54478) + "[]";
    }
}
