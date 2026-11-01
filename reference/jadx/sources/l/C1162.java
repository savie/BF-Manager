package l;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractSequentialList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAVS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1162 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C1162 f5199 = new C1162();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18096 f5200;

    public C1162() {
        C18096 c18096 = new C18096();
        this.f5200 = c18096;
        c18096.m42102(C15712.f50998, Boolean.class);
        C3010 c3010 = C3010.f11260;
        c18096.m42102(c3010, Character.class);
        C5833 c5833 = C5833.f19793;
        c18096.m42102(c5833, Byte.class);
        c18096.m42102(c5833, Short.class);
        c18096.m42102(c5833, Integer.class);
        c18096.m42102(c5833, Long.class);
        C13864 c13864 = C13864.f45705;
        c18096.m42102(c13864, Float.class);
        c18096.m42102(c13864, Double.class);
        c18096.m42102(c13864, Number.class);
        C20650 c20650 = C20650.f67222;
        c18096.m42102(c20650, BigDecimal.class);
        c18096.m42102(c20650, BigInteger.class);
        c18096.m42102(C6807.f22956, String.class);
        c18096.m42102(C8656.f29847, Object[].class);
        c18096.m42102(c3010, Class.class);
        c18096.m42102(c3010, SimpleDateFormat.class);
        c18096.m42102(c3010, Locale.class);
        c18096.m42102(c3010, Currency.class);
        c18096.m42102(c3010, TimeZone.class);
        c18096.m42102(c3010, UUID.class);
        c18096.m42102(c3010, URI.class);
        c18096.m42102(c3010, URL.class);
        c18096.m42102(c3010, Pattern.class);
        c18096.m42102(c3010, Charset.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11747 m4271(Class cls) {
        Class superclass;
        boolean z;
        C0188 c0188;
        C14301 c14301;
        C0188 c0189;
        C1599 c1599;
        C9362 c9362;
        C18096 c18096 = this.f5200;
        InterfaceC11747 interfaceC11747 = (InterfaceC11747) c18096.m42101(cls);
        if (interfaceC11747 == null) {
            if (Map.class.isAssignableFrom(cls)) {
                c9362 = new C9362();
                c18096.m42102(c9362, cls);
            } else {
                boolean zIsAssignableFrom = AbstractSequentialList.class.isAssignableFrom(cls);
                InterfaceC11747 c14302 = C19945.f63889;
                if (zIsAssignableFrom) {
                    c18096.m42102(c14302, cls);
                } else if (List.class.isAssignableFrom(cls)) {
                    c1599 = new C1599();
                    c18096.m42102(c1599, cls);
                } else if (Collection.class.isAssignableFrom(cls)) {
                    c18096.m42102(c14302, cls);
                } else if (Date.class.isAssignableFrom(cls)) {
                    c0189 = C0188.f1309;
                    c18096.m42102(c0189, cls);
                } else {
                    boolean zIsAssignableFrom2 = InterfaceC7208.class.isAssignableFrom(cls);
                    c14302 = C3010.f11260;
                    if (zIsAssignableFrom2 || InterfaceC10773.class.isAssignableFrom(cls) || InterfaceC19909.class.isAssignableFrom(cls)) {
                        c18096.m42102(c14302, cls);
                    } else if (cls.isEnum() || ((superclass = cls.getSuperclass()) != null && superclass != Object.class && superclass.isEnum())) {
                        C16417 c16417 = new C16417();
                        c18096.m42102(c16417, cls);
                        interfaceC11747 = c16417;
                    } else if (cls.isArray()) {
                        Class<?> componentType = cls.getComponentType();
                        C10067 c10067 = new C10067(componentType, m4271(componentType));
                        c18096.m42102(c10067, cls);
                        interfaceC11747 = c10067;
                    } else if (Throwable.class.isAssignableFrom(cls)) {
                        c14301 = new C14301(cls);
                        c14301.f46851 |= EnumC3984.WriteClassName.f14811;
                        c18096.m42102(c14301, cls);
                    } else if (TimeZone.class.isAssignableFrom(cls) || Charset.class.isAssignableFrom(cls) || Enumeration.class.isAssignableFrom(cls)) {
                        c18096.m42102(c14302, cls);
                    } else if (Calendar.class.isAssignableFrom(cls)) {
                        c0188 = C0188.f1309;
                        c18096.m42102(c0188, cls);
                    } else {
                        Class<?>[] interfaces = cls.getInterfaces();
                        int length = interfaces.length;
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                Class<?> cls2 = interfaces[i];
                                z = true;
                                if (cls2.getName().equals("net.sf.cglib.proxy.Factory") || cls2.getName().equals("org.springframework.cglib.proxy.Factory")) {
                                    z2 = true;
                                } else {
                                    if (cls2.getName().equals("javassist.util.proxy.ProxyObject")) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            z = false;
                            break;
                        }
                        if (z2 || z) {
                            InterfaceC11747 interfaceC11747M4271 = m4271(cls.getSuperclass());
                            c18096.m42102(interfaceC11747M4271, cls);
                            return interfaceC11747M4271;
                        }
                        if (!cls.getName().startsWith("android.net.Uri$")) {
                            c14302 = new C14301(cls);
                        }
                        c18096.m42102(c14302, cls);
                    }
                }
                interfaceC11747 = c14302;
            }
            if (interfaceC11747 == null) {
                interfaceC11747 = c0188;
                interfaceC11747 = c14301;
                interfaceC11747 = c0189;
                interfaceC11747 = c1599;
                interfaceC11747 = c9362;
                return (InterfaceC11747) c18096.m42101(cls);
            }
        }
        interfaceC11747 = c0188;
        interfaceC11747 = c14301;
        interfaceC11747 = c0189;
        interfaceC11747 = c1599;
        interfaceC11747 = c9362;
        return interfaceC11747;
    }
}
