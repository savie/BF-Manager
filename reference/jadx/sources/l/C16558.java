package l;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: renamed from: l.ܺۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAVQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16558 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f53581;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f53582;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f53583;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f53584;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f53585;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Class f53586;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Method f53587;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f53588;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Type f53589;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f53590;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f53591;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Field f53592;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f53593;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Class f53594;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int f53595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19167 m39203() {
        return null;
    }

    public C16558(String str, Class cls, Class cls2, Type type, Field field, int i, int i2) {
        this.f53584 = 0;
        i = i < 0 ? 0 : i;
        this.f53585 = str;
        this.f53594 = cls;
        this.f53586 = cls2;
        this.f53589 = type;
        this.f53587 = null;
        this.f53592 = field;
        this.f53584 = i;
        this.f53595 = i2;
        this.f53583 = cls2.isEnum() && !InterfaceC24389.class.isAssignableFrom(cls2);
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f53581 = true;
            this.f53593 = Modifier.isTransient(modifiers);
        } else {
            this.f53581 = false;
            this.f53593 = false;
        }
        this.f53588 = false;
        long jCharAt = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.f53590 = jCharAt;
        this.f53582 = null;
        this.f53591 = new String[0];
    }

    public C16558(String str, Method method, Field field, Class cls, Type type, int i, int i2, InterfaceC19167 interfaceC19167, InterfaceC19167 interfaceC19168) {
        String str2;
        Type genericType;
        Class<?> returnType;
        boolean z = false;
        this.f53584 = 0;
        i = i < 0 ? 0 : i;
        this.f53585 = str;
        this.f53587 = method;
        this.f53592 = field;
        this.f53584 = i;
        this.f53595 = i2;
        InterfaceC19167 interfaceC19167M39203 = m39203();
        Type type2 = null;
        if (interfaceC19167M39203 != null) {
            str2 = interfaceC19167M39203.format();
            str2 = str2.trim().length() == 0 ? null : str2;
            this.f53591 = interfaceC19167M39203.alternateNames();
        } else {
            this.f53591 = new String[0];
            str2 = null;
        }
        this.f53582 = str2;
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f53581 = method == null || ((modifiers & 1) != 0 && method.getReturnType() == field.getType());
            this.f53593 = (modifiers & 128) != 0;
        } else {
            this.f53581 = false;
            this.f53593 = false;
        }
        long jCharAt = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.f53590 = jCharAt;
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                returnType = parameterTypes[0];
                genericType = (returnType == Class.class || returnType == String.class || returnType.isPrimitive()) ? returnType : method.getGenericParameterTypes()[0];
                this.f53588 = false;
            } else {
                returnType = method.getReturnType();
                genericType = returnType == Class.class ? returnType : method.getGenericReturnType();
                this.f53588 = true;
            }
            this.f53594 = method.getDeclaringClass();
        } else {
            Class<?> type3 = field.getType();
            genericType = (type3.isPrimitive() || type3 == String.class || type3.isEnum()) ? type3 : field.getGenericType();
            this.f53594 = field.getDeclaringClass();
            this.f53588 = Modifier.isFinal(field.getModifiers());
            returnType = type3;
        }
        if (returnType == Object.class && (genericType instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) genericType;
            Type[] actualTypeArguments = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments() : null;
            for (Class superclass = cls; superclass != null && superclass != Object.class && superclass != this.f53594; superclass = superclass.getSuperclass()) {
                Type genericSuperclass = superclass.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    C3134.m10227(actualTypeArguments2, superclass.getTypeParameters(), actualTypeArguments);
                    actualTypeArguments = actualTypeArguments2;
                }
            }
            if (actualTypeArguments != null) {
                TypeVariable[] typeParameters = this.f53594.getTypeParameters();
                for (int i4 = 0; i4 < typeParameters.length; i4++) {
                    if (typeVariable.equals(typeParameters[i4])) {
                        type2 = actualTypeArguments[i4];
                        break;
                    }
                }
            }
            if (type2 != null) {
                this.f53586 = C3134.m10213(type2);
                this.f53589 = type2;
                if (returnType.isEnum() && !InterfaceC24389.class.isAssignableFrom(returnType)) {
                    z = true;
                }
                this.f53583 = z;
                return;
            }
        }
        if (!(genericType instanceof Class)) {
            Type typeM39201 = m39201(cls, type == null ? cls : type, genericType);
            if (typeM39201 != genericType && ((typeM39201 instanceof ParameterizedType) || (typeM39201 instanceof Class))) {
                Class<?> clsM10213 = C3134.m10213(typeM39201);
                returnType = clsM10213;
            }
            genericType = typeM39201;
        }
        this.f53589 = genericType;
        this.f53586 = returnType;
        if (!returnType.isArray() && returnType.isEnum() && !InterfaceC24389.class.isAssignableFrom(returnType)) {
            z = true;
        }
        this.f53583 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Type m39201(Class cls, Type type, Type type2) {
        TypeVariable[] typeParameters;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type typeM39201 = m39201(cls, type, genericComponentType);
                return genericComponentType != typeM39201 ? Array.newInstance((Class<?>) C3134.m10213(typeM39201), 0).getClass() : type2;
            }
            if (C3134.m10245(type)) {
                if (type2 instanceof TypeVariable) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) C3134.m10231(type);
                    Class clsM10213 = C3134.m10213((Type) parameterizedType2);
                    TypeVariable typeVariable = (TypeVariable) type2;
                    for (int i = 0; i < clsM10213.getTypeParameters().length; i++) {
                        if (clsM10213.getTypeParameters()[i].getName().equals(typeVariable.getName())) {
                            return parameterizedType2.getActualTypeArguments()[i];
                        }
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                    Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                    Type[] actualTypeArguments2 = null;
                    if (type instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) type;
                        typeParameters = cls.getTypeParameters();
                    } else if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                        typeParameters = cls.getSuperclass().getTypeParameters();
                    } else {
                        typeParameters = null;
                        parameterizedType = null;
                    }
                    boolean z = false;
                    for (int i2 = 0; i2 < actualTypeArguments.length && parameterizedType != null; i2++) {
                        Type type3 = actualTypeArguments[i2];
                        if (type3 instanceof TypeVariable) {
                            TypeVariable typeVariable2 = (TypeVariable) type3;
                            for (int i3 = 0; i3 < typeParameters.length; i3++) {
                                if (typeParameters[i3].getName().equals(typeVariable2.getName())) {
                                    if (actualTypeArguments2 == null) {
                                        actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                                    }
                                    actualTypeArguments[i2] = actualTypeArguments2[i3];
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        return new C23272(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                    }
                }
            }
        }
        return type2;
    }

    public final String toString() {
        return this.f53585;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C16558 c16558) {
        int i = c16558.f53584;
        int i2 = this.f53584;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f53585.compareTo(c16558.f53585);
    }
}
