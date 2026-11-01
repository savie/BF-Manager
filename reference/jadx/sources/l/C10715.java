package l;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.ۧۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10715 implements WildcardType, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Type f36540;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Type f36541;

    public C10715(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length == 1) {
            C13638.requireNonNull(typeArr2[0]);
            C23415.m51557(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
            }
            this.f36540 = C23415.m51551(typeArr2[0]);
            this.f36541 = Object.class;
            return;
        }
        C13638.requireNonNull(typeArr[0]);
        C23415.m51557(typeArr[0]);
        this.f36540 = null;
        this.f36541 = C23415.m51551(typeArr[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f36541};
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f36540;
        return type != null ? new Type[]{type} : C23415.f75822;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && C23415.m51554(this, (WildcardType) obj);
    }

    public final int hashCode() {
        Type type = this.f36540;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f36541.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f36540;
        if (type != null) {
            return "? super " + C23415.m51548(type);
        }
        Type type2 = this.f36541;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + C23415.m51548(type2);
    }
}
