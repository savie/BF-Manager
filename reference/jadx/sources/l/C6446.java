package l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.ۛܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OG */
/* JADX INFO: loaded from: classes3.dex */
public class C6446 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21682;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Type f21683;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Class f21684;

    public C6446() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C6446.class) {
                Type typeM21404 = C7872.m21404(parameterizedType.getActualTypeArguments()[0]);
                if (!C17359.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m18231(typeM21404);
                }
                this.f21683 = typeM21404;
                this.f21684 = C7872.m21408(typeM21404);
                this.f21682 = typeM21404.hashCode();
                return;
            }
        } else if (genericSuperclass == C6446.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public C6446(Type type) {
        C17359.requireNonNull(type);
        Type typeM21404 = C7872.m21404(type);
        this.f21683 = typeM21404;
        this.f21684 = C7872.m21408(typeM21404);
        this.f21682 = typeM21404.hashCode();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m18231(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m18231(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m18231(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                m18231(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            m18231(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            m18231(upperBounds[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m18232() {
        return this.f21684;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Type m18233() {
        return this.f21683;
    }

    public final int hashCode() {
        return this.f21682;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6446) {
            return C7872.m21407(this.f21683, ((C6446) obj).f21683);
        }
        return false;
    }

    public final String toString() {
        return C7872.m21412(this.f21683);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6446 m18230(Type type) {
        return new C6446(type);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6446 m18229(Class cls) {
        return new C6446(cls);
    }
}
