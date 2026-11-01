package l;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: renamed from: l.ܶܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAVQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15275 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Field f49783;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f49784;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f49785;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f49786;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Type f49787;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f49788;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f49789;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Class f49790;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int f49791;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f49792;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String[] f49793;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f49794;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f49795;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Class f49796;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f49797;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17086 m36579() {
        return null;
    }

    public C15275(String str, Class cls, Class cls2, Type type, Field field, int i, int i2) {
        this.f49786 = 0;
        i = i < 0 ? 0 : i;
        this.f49788 = str;
        this.f49796 = cls;
        this.f49790 = cls2;
        this.f49787 = type;
        this.f49784 = null;
        this.f49783 = field;
        this.f49786 = i;
        this.f49791 = i2;
        this.f49792 = cls2.isEnum() && !InterfaceC7208.class.isAssignableFrom(cls2);
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f49794 = true;
            this.f49795 = Modifier.isTransient(modifiers);
        } else {
            this.f49794 = false;
            this.f49795 = false;
        }
        this.f49797 = false;
        long jCharAt = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.f49785 = jCharAt;
        this.f49789 = null;
        this.f49793 = new String[0];
    }

    public C15275(String str, Method method, Field field, Class cls, Type type, int i, int i2, InterfaceC17086 interfaceC17086, InterfaceC17086 interfaceC17087) {
        String str2;
        Type genericType;
        Class<?> returnType;
        boolean z = false;
        this.f49786 = 0;
        i = i < 0 ? 0 : i;
        this.f49788 = str;
        this.f49784 = method;
        this.f49783 = field;
        this.f49786 = i;
        this.f49791 = i2;
        InterfaceC17086 interfaceC17086M36579 = m36579();
        Type type2 = null;
        if (interfaceC17086M36579 != null) {
            str2 = interfaceC17086M36579.format();
            str2 = str2.trim().length() == 0 ? null : str2;
            this.f49793 = interfaceC17086M36579.alternateNames();
        } else {
            this.f49793 = new String[0];
            str2 = null;
        }
        this.f49789 = str2;
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f49794 = method == null || ((modifiers & 1) != 0 && method.getReturnType() == field.getType());
            this.f49795 = (modifiers & 128) != 0;
        } else {
            this.f49794 = false;
            this.f49795 = false;
        }
        long jCharAt = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i3))) * 1099511628211L;
        }
        this.f49785 = jCharAt;
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                returnType = parameterTypes[0];
                genericType = (returnType == Class.class || returnType == String.class || returnType.isPrimitive()) ? returnType : method.getGenericParameterTypes()[0];
                this.f49797 = false;
            } else {
                returnType = method.getReturnType();
                genericType = returnType == Class.class ? returnType : method.getGenericReturnType();
                this.f49797 = true;
            }
            this.f49796 = method.getDeclaringClass();
        } else {
            Class<?> type3 = field.getType();
            genericType = (type3.isPrimitive() || type3 == String.class || type3.isEnum()) ? type3 : field.getGenericType();
            this.f49796 = field.getDeclaringClass();
            this.f49797 = Modifier.isFinal(field.getModifiers());
            returnType = type3;
        }
        if (returnType == Object.class && (genericType instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) genericType;
            Type[] actualTypeArguments = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments() : null;
            for (Class superclass = cls; superclass != null && superclass != Object.class && superclass != this.f49796; superclass = superclass.getSuperclass()) {
                Type genericSuperclass = superclass.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    C8219.m21522(actualTypeArguments2, superclass.getTypeParameters(), actualTypeArguments);
                    actualTypeArguments = actualTypeArguments2;
                }
            }
            if (actualTypeArguments != null) {
                TypeVariable[] typeParameters = this.f49796.getTypeParameters();
                for (int i4 = 0; i4 < typeParameters.length; i4++) {
                    if (typeVariable.equals(typeParameters[i4])) {
                        type2 = actualTypeArguments[i4];
                        break;
                    }
                }
            }
            if (type2 != null) {
                this.f49790 = C8219.m21508(type2);
                this.f49787 = type2;
                if (returnType.isEnum() && !InterfaceC7208.class.isAssignableFrom(returnType)) {
                    z = true;
                }
                this.f49792 = z;
                return;
            }
        }
        if (!(genericType instanceof Class)) {
            Type typeM36577 = m36577(cls, type == null ? cls : type, genericType);
            if (typeM36577 != genericType && ((typeM36577 instanceof ParameterizedType) || (typeM36577 instanceof Class))) {
                Class<?> clsM21508 = C8219.m21508(typeM36577);
                returnType = clsM21508;
            }
            genericType = typeM36577;
        }
        this.f49787 = genericType;
        this.f49790 = returnType;
        if (!returnType.isArray() && returnType.isEnum() && !InterfaceC7208.class.isAssignableFrom(returnType)) {
            z = true;
        }
        this.f49792 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Type m36577(Class cls, Type type, Type type2) {
        TypeVariable[] typeParameters;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type typeM36577 = m36577(cls, type, genericComponentType);
                return genericComponentType != typeM36577 ? Array.newInstance((Class<?>) C8219.m21508(typeM36577), 0).getClass() : type2;
            }
            if (C8219.m21506(type)) {
                if (type2 instanceof TypeVariable) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) C8219.m21527(type);
                    Class clsM21508 = C8219.m21508((Type) parameterizedType2);
                    TypeVariable typeVariable = (TypeVariable) type2;
                    for (int i = 0; i < clsM21508.getTypeParameters().length; i++) {
                        if (clsM21508.getTypeParameters()[i].getName().equals(typeVariable.getName())) {
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
                        return new C18802(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                    }
                }
            }
        }
        return type2;
    }

    public final String toString() {
        return this.f49788;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C15275 c15275) {
        int i = c15275.f49786;
        int i2 = this.f49786;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f49788.compareTo(c15275.f49788);
    }
}
