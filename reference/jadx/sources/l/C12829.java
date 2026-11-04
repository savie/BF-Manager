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

/* JADX INFO: renamed from: l.۫ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAVS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12829 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12829 f41097 = new C12829();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15812 f41098;

    public C12829() {
        C15812 c15812 = new C15812();
        this.f41098 = c15812;
        c15812.m37738(C14911.f48696, Boolean.class);
        C14165 c14165 = C14165.f44790;
        c15812.m37738(c14165, Character.class);
        C10436 c10436 = C10436.f33163;
        c15812.m37738(c10436, Byte.class);
        c15812.m37738(c10436, Short.class);
        c15812.m37738(c10436, Integer.class);
        c15812.m37738(c10436, Long.class);
        C21780 c21780 = C21780.f69456;
        c15812.m37738(c21780, Float.class);
        c15812.m37738(c21780, Double.class);
        c15812.m37738(c21780, Number.class);
        C4471 c4471 = C4471.f15987;
        c15812.m37738(c4471, BigDecimal.class);
        c15812.m37738(c4471, BigInteger.class);
        c15812.m37738(C11337.f35710, String.class);
        c15812.m37738(C12674.f40598, Object[].class);
        c15812.m37738(c14165, Class.class);
        c15812.m37738(c14165, SimpleDateFormat.class);
        c15812.m37738(c14165, Locale.class);
        c15812.m37738(c14165, Currency.class);
        c15812.m37738(c14165, TimeZone.class);
        c15812.m37738(c14165, UUID.class);
        c15812.m37738(c14165, URI.class);
        c15812.m37738(c14165, URL.class);
        c15812.m37738(c14165, Pattern.class);
        c15812.m37738(c14165, Charset.class);
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
    public final InterfaceC10591 m31835(Class cls) {
        Class superclass;
        boolean z;
        C18641 c18641;
        C2979 c2979;
        C18641 c18642;
        C8945 c8945;
        C7454 c7454;
        C15812 c15812 = this.f41098;
        InterfaceC10591 interfaceC10591 = (InterfaceC10591) c15812.m37737(cls);
        if (interfaceC10591 == null) {
            if (Map.class.isAssignableFrom(cls)) {
                c7454 = new C7454();
                c15812.m37738(c7454, cls);
            } else {
                boolean zIsAssignableFrom = AbstractSequentialList.class.isAssignableFrom(cls);
                InterfaceC10591 c29710 = C21625.f69049;
                if (zIsAssignableFrom) {
                    c15812.m37738(c29710, cls);
                } else if (List.class.isAssignableFrom(cls)) {
                    c8945 = new C8945();
                    c15812.m37738(c8945, cls);
                } else if (Collection.class.isAssignableFrom(cls)) {
                    c15812.m37738(c29710, cls);
                } else if (Date.class.isAssignableFrom(cls)) {
                    c18642 = C18641.f60610;
                    c15812.m37738(c18642, cls);
                } else {
                    boolean zIsAssignableFrom2 = InterfaceC24389.class.isAssignableFrom(cls);
                    c29710 = C14165.f44790;
                    if (zIsAssignableFrom2 || InterfaceC1488.class.isAssignableFrom(cls) || InterfaceC21405.class.isAssignableFrom(cls)) {
                        c15812.m37738(c29710, cls);
                    } else if (cls.isEnum() || ((superclass = cls.getSuperclass()) != null && superclass != Object.class && superclass.isEnum())) {
                        C0742 c0742 = new C0742();
                        c15812.m37738(c0742, cls);
                        interfaceC10591 = c0742;
                    } else if (cls.isArray()) {
                        Class<?> componentType = cls.getComponentType();
                        C6709 c6709 = new C6709(componentType, m31835(componentType));
                        c15812.m37738(c6709, cls);
                        interfaceC10591 = c6709;
                    } else if (Throwable.class.isAssignableFrom(cls)) {
                        c2979 = new C2979(cls);
                        c2979.f9677 |= EnumC1643.WriteClassName.f5702;
                        c15812.m37738(c2979, cls);
                    } else if (TimeZone.class.isAssignableFrom(cls) || Charset.class.isAssignableFrom(cls) || Enumeration.class.isAssignableFrom(cls)) {
                        c15812.m37738(c29710, cls);
                    } else if (Calendar.class.isAssignableFrom(cls)) {
                        c18641 = C18641.f60610;
                        c15812.m37738(c18641, cls);
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
                            InterfaceC10591 interfaceC10591M31835 = m31835(cls.getSuperclass());
                            c15812.m37738(interfaceC10591M31835, cls);
                            return interfaceC10591M31835;
                        }
                        if (!cls.getName().startsWith("android.net.Uri$")) {
                            c29710 = new C2979(cls);
                        }
                        c15812.m37738(c29710, cls);
                    }
                }
                interfaceC10591 = c29710;
            }
            if (interfaceC10591 == null) {
                interfaceC10591 = c18641;
                interfaceC10591 = c2979;
                interfaceC10591 = c18642;
                interfaceC10591 = c8945;
                interfaceC10591 = c7454;
                return (InterfaceC10591) c15812.m37737(cls);
            }
        }
        interfaceC10591 = c18641;
        interfaceC10591 = c2979;
        interfaceC10591 = c18642;
        interfaceC10591 = c8945;
        interfaceC10591 = c7454;
        return interfaceC10591;
    }
}
