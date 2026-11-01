package l;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: l.ۨ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OG */
/* JADX INFO: loaded from: classes3.dex */
public class C11730 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f39422;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Type f39423;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Class f39424;

    public C11730() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C11730.class) {
                Type typeM51551 = C23415.m51551(parameterizedType.getActualTypeArguments()[0]);
                if (!C13638.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m29315(typeM51551);
                }
                this.f39423 = typeM51551;
                this.f39424 = C23415.m51555(typeM51551);
                this.f39422 = typeM51551.hashCode();
                return;
            }
        } else if (genericSuperclass == C11730.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public C11730(Type type) {
        C13638.requireNonNull(type);
        Type typeM51551 = C23415.m51551(type);
        this.f39423 = typeM51551;
        this.f39424 = C23415.m51555(typeM51551);
        this.f39422 = typeM51551.hashCode();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29315(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m29315(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m29315(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                m29315(actualTypeArguments[i]);
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
            m29315(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            m29315(upperBounds[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class m29316() {
        return this.f39424;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Type m29317() {
        return this.f39423;
    }

    public final int hashCode() {
        return this.f39422;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11730) {
            return C23415.m51554(this.f39423, ((C11730) obj).f39423);
        }
        return false;
    }

    public final String toString() {
        return C23415.m51548(this.f39423);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11730 m29314(Type type) {
        return new C11730(type);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11730 m29313(Class cls) {
        return new C11730(cls);
    }
}
