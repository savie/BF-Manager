package l;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* JADX INFO: renamed from: l.᩻ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 47TI */
/* JADX INFO: loaded from: classes.dex */
public final class C23415 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Type[] f75822 = new Type[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Type m51551(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C17064(m51551(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C5775(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C17064(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C10715(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Class m51555(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m51555(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m51555(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51554(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return C13638.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m51554(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return C13638.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m51548(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Type m51552(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m51552(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m51552(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Type m51556(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
        }
        return m51550(cls, type, m51552(type, cls, cls2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Type m51549(Class cls, Type type) {
        Type typeM51556 = m51556(type, cls, Collection.class);
        if (typeM51556 instanceof ParameterizedType) {
            return ((ParameterizedType) typeM51556).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Type[] m51558(Class cls, Type type) {
        if (Properties.class.isAssignableFrom(cls)) {
            return new Type[]{String.class, String.class};
        }
        Type typeM51556 = m51556(type, cls, Map.class);
        return typeM51556 instanceof ParameterizedType ? ((ParameterizedType) typeM51556).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Type m51550(Class cls, Type type, Type type2) {
        return m51553(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x012c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [l.ۧۖ᩸] */
    /* JADX WARN: Type inference failed for: r11v4, types: [l.ۧۖ᩸] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Type m51553(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeM51553;
        Type[] upperBounds2;
        Type typeM51554;
        Type[] lowerBounds2;
        boolean zEquals;
        Type[] actualTypeArguments;
        int length;
        boolean z;
        Type c5775;
        Type typeM51555;
        Type genericComponentType;
        Type typeM51556;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length == 1) {
                                    break;
                                }
                                typeM51553 = m51553(type, cls, upperBounds[0], map);
                                if (typeM51553 != upperBounds[0]) {
                                    break;
                                }
                                if (typeM51553 instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeM51553).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeM51553};
                                }
                                type2 = new C10715(upperBounds2, f75822);
                                break;
                            }
                            typeM51554 = m51553(type, cls, lowerBounds[0], map);
                            if (typeM51554 != lowerBounds[0]) {
                                break;
                            }
                            if (typeM51554 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeM51554).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeM51554};
                            }
                            type2 = new C10715(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeM51557 = m51553(type, cls, ownerType, map);
                        zEquals = C13638.equals(typeM51557, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        z = false;
                        while (i < length) {
                            typeM51555 = m51553(type, cls, actualTypeArguments[i], map);
                            if (C13638.equals(typeM51555, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeM51555;
                            }
                            i++;
                        }
                        if (!zEquals) {
                        }
                        c5775 = new C5775(typeM51557, (Class) type2.getRawType(), actualTypeArguments);
                        type2 = c5775;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM51556 = m51553(type, cls, genericComponentType, map);
                    if (C13638.equals(genericComponentType, typeM51556)) {
                        c5775 = new C17064(typeM51556);
                        type2 = c5775;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length == 1) {
                                    break;
                                }
                                typeM51553 = m51553(type, cls, upperBounds[0], map);
                                if (typeM51553 != upperBounds[0]) {
                                    break;
                                }
                                if (typeM51553 instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeM51553).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeM51553};
                                }
                                type2 = new C10715(upperBounds2, f75822);
                                break;
                            }
                            typeM51554 = m51553(type, cls, lowerBounds[0], map);
                            if (typeM51554 != lowerBounds[0]) {
                                break;
                            }
                            if (typeM51554 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeM51554).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeM51554};
                            }
                            type2 = new C10715(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        Type typeM51558 = m51553(type, cls, ownerType2, map);
                        zEquals = C13638.equals(typeM51558, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        z = false;
                        while (i < length) {
                            typeM51555 = m51553(type, cls, actualTypeArguments[i], map);
                            if (C13638.equals(typeM51555, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeM51555;
                            }
                            i++;
                        }
                        if (!zEquals && !z) {
                            break;
                        }
                        c5775 = new C5775(typeM51558, (Class) type2.getRawType(), actualTypeArguments);
                        type2 = c5775;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM51556 = m51553(type, cls, genericComponentType, map);
                    if (C13638.equals(genericComponentType, typeM51556)) {
                        break;
                    }
                    c5775 = new C17064(typeM51556);
                    type2 = c5775;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeM51559 = m51553(type, cls, componentType, map);
                if (!C13638.equals(componentType, typeM51559)) {
                    c5775 = new C17064(typeM51559);
                    type2 = c5775;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeM51552 = m51552(type, cls, cls4);
                if (typeM51552 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i >= length2) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeM51552).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51557(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Primitive type is not allowed");
        }
    }
}
