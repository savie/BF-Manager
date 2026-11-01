package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۤᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C10474 implements InterfaceC20974, Closeable {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f35828 = Pattern.compile("(\\P{all})+");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16949 f35829;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35830;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11885 f35831;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C23942 f35832;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f35833;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public ClassLoader f35834;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C20414 f35835;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C14770 f35836;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C16202 f35837;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public SecurityException f35838;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35839;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C2092 f35840;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C23800 f35841;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13320 f35842;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f35843;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9399 f35844;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C12325 f35845;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4831 f35846;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35847;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C5534 f35848;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f35849;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35850;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17573 f35851;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12343 f35852;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15413 f35853;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C3836 f35855;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21017 f35857;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35858;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public EnumC11909 f35859;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final Set f35860;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public ServiceLoader f35861;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f35862;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public Set f35854 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C22220 f35856 = new C13296(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m26545(C10474 c10474, InterfaceC16036 interfaceC16036, C7651 c7651) {
        c10474.m26546(interfaceC16036, Collections.EMPTY_SET, c7651);
    }

    public final String toString() {
        return "javac ProcessingEnvironment";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m26542(C10474 c10474, C21825 c21825) {
        c10474.getClass();
        C21825 c21825M48588 = C21825.m48588();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C10164 c10164 = (C10164) it.next();
            if (c10164.f34725.mo6761("package-info", EnumC11347.SOURCE)) {
                c21825M48588 = c21825M48588.m48597(c10164.f34721);
            }
        }
        return c21825M48588.m48589();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21825 m26557(C10474 c10474, C21825 c21825) {
        c10474.getClass();
        C21825 c21825M48588 = C21825.m48588();
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            for (AbstractC8774 abstractC8774 : ((C10164) it.next()).f34727) {
                if (abstractC8774.m22847(EnumC18651.f60468)) {
                    C22492 c22492 = ((C8753) abstractC8774).f30086;
                    C6171.m17171(c22492);
                    c21825M48588 = c21825M48588.m48597(c22492);
                }
            }
        }
        return c21825M48588.m48589();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10474 m26540(C12343 c12343) {
        C10474 c10474 = (C10474) c12343.m30655(C10474.class);
        return c10474 == null ? new C10474(c12343) : c10474;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10474(C12343 c12343) {
        String strSubstring;
        this.f35852 = c12343;
        c12343.m30657(C10474.class, this);
        this.f35835 = C20414.m46161(c12343);
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f35859 = enumC11909M29706;
        C23549.m51906(c12343);
        C14770 c14770M35395 = C14770.m35395(c12343);
        this.f35836 = c14770M35395;
        this.f35830 = c14770M35395.m35408(EnumC19730.f63375);
        this.f35847 = c14770M35395.m35408(EnumC19730.f63396);
        this.f35839 = c14770M35395.m35408(EnumC19730.f63380);
        this.f35833 = C16826.m39463(c12343).m39467(EnumC0597.PROCESSING);
        C16949 c16949M39706 = C16949.m39706(c12343);
        this.f35829 = c16949M39706;
        if (c14770M35395.m35402(EnumC19730.f63335, "only") || c14770M35395.m35408(EnumC19730.f63402)) {
            c16949M39706.f54223 = EnumC16079.PROCESS;
        }
        this.f35862 = c14770M35395.m35407("fatalEnterError");
        this.f35850 = c14770M35395.m35407("showResolveErrors");
        this.f35858 = c14770M35395.m35408(EnumC19730.f63343);
        this.f35849 = (InterfaceC13464) c12343.m30655(InterfaceC13464.class);
        String str = EnumC14026.f46096.m33945(enumC11909M29706) ? "java.base/" : "";
        String[] strArr = {str.concat("java.lang.Deprecated"), str.concat("java.lang.FunctionalInterface"), str.concat("java.lang.Override"), str.concat("java.lang.SafeVarargs"), str.concat("java.lang.SuppressWarnings"), str.concat("java.lang.annotation.Documented"), str.concat("java.lang.annotation.Inherited"), str.concat("java.lang.annotation.Native"), str.concat("java.lang.annotation.Repeatable"), str.concat("java.lang.annotation.Retention"), str.concat("java.lang.annotation.Target"), str.concat("java.io.Serial")};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str2 = strArr[i];
            C13638.requireNonNull(str2);
            if (!hashSet.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        this.f35860 = C0561.unmodifiableSet(hashSet);
        this.f35831 = new C11885(c12343);
        C5534 c5534 = new C5534();
        c5534.f18960 = 0;
        c5534.f18962 = C20414.m46161(c12343);
        c5534.f18961 = this;
        this.f35848 = c5534;
        this.f35837 = C16202.m38303(c12343);
        int i2 = C20435.f66261;
        if (((C20435) c12343.m30655(C20435.class)) == null) {
            c12343.m30657(C20435.class, new C20435());
            C3836.m11131(c12343);
            C23800.m52336(c12343);
        }
        this.f35845 = C12325.m30599(c12343);
        this.f35841 = C23800.m52336(c12343);
        this.f35851 = C17573.m40852(c12343);
        Set<String> setM35399 = this.f35836.m35399();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : setM35399) {
            if (str3.startsWith("-A") && str3.length() > 2) {
                int iIndexOf = str3.indexOf(61);
                String strSubstring2 = null;
                if (iIndexOf == -1) {
                    strSubstring2 = str3.substring(2);
                    strSubstring = null;
                } else if (iIndexOf >= 3) {
                    String strSubstring3 = str3.substring(2, iIndexOf);
                    strSubstring = iIndexOf < str3.length() + (-1) ? str3.substring(iIndexOf + 1) : null;
                    strSubstring2 = strSubstring3;
                } else {
                    strSubstring = null;
                }
                linkedHashMap.put(strSubstring2, strSubstring);
            }
        }
        InterfaceC23858 interfaceC23858 = (InterfaceC23858) this.f35852.m30655(InterfaceC23858.class);
        if (interfaceC23858 != null) {
            Iterator it = interfaceC23858.m52585().iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(((InterfaceC11158) it.next()).m28094());
            }
        }
        Map mapUnmodifiableMap = C0561.unmodifiableMap(linkedHashMap);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(mapUnmodifiableMap.keySet());
        this.f35843 = hashSet2;
        C22531.m50048(c12343);
        this.f35840 = C2092.m6631(c12343);
        this.f35855 = C3836.m11131(c12343);
        this.f35846 = C4831.m13414(c12343);
        this.f35832 = C23942.m52776(c12343);
        this.f35844 = C9399.m24138(c12343);
        this.f35842 = C0576.m2728(c12343).m2737();
        this.f35857 = C21017.m47211(c12343);
        C2008.m6467(c12343);
        InterfaceC13464 interfaceC13464 = this.f35849;
        try {
            EnumC3584 enumC3584 = EnumC3584.ANNOTATION_PROCESSOR_MODULE_PATH;
            if (interfaceC13464.mo32953(enumC3584)) {
                try {
                    this.f35861 = interfaceC13464.mo32949(enumC3584, InterfaceC16036.class);
                    return;
                } catch (IOException e) {
                    throw new C13048(e);
                }
            }
            EnumC3584 enumC3585 = EnumC3584.ANNOTATION_PROCESSOR_PATH;
            ClassLoader classLoaderMo32955 = interfaceC13464.mo32953(enumC3585) ? interfaceC13464.mo32955(enumC3585) : interfaceC13464.mo32955(EnumC3584.CLASS_PATH);
            this.f35834 = classLoaderMo32955;
            if (classLoaderMo32955 == 0 || !(classLoaderMo32955 instanceof Closeable)) {
                return;
            }
            C16949 c16949 = this.f35829;
            c16949.f54241 = c16949.f54241.m48597((Closeable) classLoaderMo32955);
        } catch (SecurityException e2) {
            this.f35838 = e2;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m26573() {
        Object c18940;
        C6171.m17178(this.f35853);
        EnumC19730 enumC19730 = EnumC19730.f63402;
        C14770 c14770 = this.f35836;
        if (c14770.m35408(enumC19730)) {
            try {
                c18940 = C21825.of((Object) new C17528()).iterator();
            } catch (Throwable th) {
                AssertionError assertionError = new AssertionError("Problem instantiating PrintingProcessor.");
                assertionError.initCause(th);
                throw assertionError;
            }
        } else {
            SecurityException securityException = this.f35838;
            if (securityException == null) {
                String strM35398 = c14770.m35398(EnumC19730.f63346);
                boolean zMo32953 = this.f35849.mo32953(EnumC3584.ANNOTATION_PROCESSOR_MODULE_PATH);
                C20414 c20414 = this.f35835;
                if (zMo32953) {
                    if (strM35398 == null) {
                        c18940 = new C9063(this.f35861, c20414);
                    } else {
                        c18940 = new C18940(this.f35861, c20414, strM35398);
                    }
                } else if (strM35398 == null) {
                    ClassLoader classLoader = this.f35834;
                    C9063 c9063 = new C9063();
                    c9063.f30913 = c20414;
                    try {
                        try {
                            ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC16036.class, classLoader);
                            c9063.f30915 = serviceLoaderLoad;
                            c9063.f30914 = serviceLoaderLoad.iterator();
                            c18940 = c9063;
                        } catch (Exception unused) {
                            c9063.f30914 = m26555("proc.no.service", (Exception) null);
                            c18940 = c9063;
                        }
                    } catch (Throwable th2) {
                        c20414.m48197(C23879.f77355);
                        throw new C13048(th2);
                    }
                } else {
                    C18234 c18234 = new C18234();
                    c18234.f58212 = null;
                    c18234.f58215 = Arrays.asList(strM35398.split(",")).iterator();
                    c18234.f58214 = this.f35834;
                    c18234.f58213 = c20414;
                    c18940 = c18234;
                }
            } else {
                c18940 = m26555("proc.cant.create.loader", securityException);
            }
        }
        InterfaceC23858 interfaceC23858 = (InterfaceC23858) this.f35852.m30655(InterfaceC23858.class);
        List list = Collections.EMPTY_LIST;
        if (interfaceC23858 != null) {
            list = C9030.stream(interfaceC23858.m52585()).map(new C18834(5)).toList();
        }
        this.f35853 = new C15413(this, C20021.m45348(C21825.of(c18940, (Object) list.iterator()), new C14566(3)));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ServiceLoader m26571() {
        EnumC3584 enumC3584 = EnumC3584.ANNOTATION_PROCESSOR_MODULE_PATH;
        InterfaceC13464 interfaceC13464 = this.f35849;
        if (interfaceC13464.mo32953(enumC3584)) {
            try {
                return interfaceC13464.mo32949(enumC3584, InterfaceC1387.class);
            } catch (IOException e) {
                throw new C13048(e);
            }
        }
        return ServiceLoader.load(InterfaceC1387.class, this.f35834);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Iterator m26555(String str, Exception exc) {
        Collection collectionMo3278;
        InterfaceC13464 interfaceC13464 = this.f35849;
        if (interfaceC13464 instanceof C14315) {
            C14315 c14315 = (C14315) interfaceC13464;
            EnumC3584 enumC3584 = EnumC3584.ANNOTATION_PROCESSOR_PATH;
            if (c14315.mo32953(enumC3584)) {
                collectionMo3278 = c14315.mo3278((InterfaceC4290) enumC3584);
            } else {
                collectionMo3278 = c14315.mo3278((InterfaceC4290) EnumC3584.CLASS_PATH);
            }
            if (this.f35836.m35398(EnumC19730.f63346) == null) {
                URL[] urlArr = new URL[1];
                Iterator it = collectionMo3278.iterator();
                while (it.hasNext()) {
                    try {
                        urlArr[0] = ((InterfaceC3800) it.next()).toUri().toURL();
                        if (!C11179.m28125(urlArr)) {
                        }
                    } catch (MalformedURLException e) {
                        throw new AssertionError(e);
                    } catch (C6239 e2) {
                        this.f35835.m48197(C23879.m52626(e2.getLocalizedMessage()));
                    }
                }
                return Collections.EMPTY_LIST.iterator();
            }
            m26543(str, exc);
            throw null;
        }
        m26543(str, exc);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26543(String str, Exception exc) {
        C20414 c20414 = this.f35835;
        if (exc != null) {
            c20414.m48191(str, exc.getLocalizedMessage());
            throw new C13048(exc);
        }
        c20414.m48191(str, new Object[0]);
        throw new C13048();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26569() {
        C15413 c15413 = this.f35853;
        c15413.getClass();
        return c15413.f50249.iterator().hasNext() || c15413.f50250.hasNext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26544(C10474 c10474, LinkedHashSet linkedHashSet, C21825 c21825, C21825 c21826, C21825 c21827) {
        C20414 c20414 = c10474.f35835;
        HashMap map = new HashMap(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            InterfaceC23216 interfaceC23216 = (InterfaceC23216) it.next();
            InterfaceC5576 interfaceC5576M38305 = c10474.f35837.m38305(interfaceC23216);
            if (EnumC14026.f46096.m33945(c10474.f35859) && interfaceC5576M38305 != null) {
                str = ((Object) interfaceC5576M38305.mo11809()) + "/";
            }
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(interfaceC23216.mo11809().toString());
            map.put(sbM23356.toString(), interfaceC23216);
        }
        if (map.size() == 0) {
            map.put("", null);
        }
        C15413 c15413 = c10474.f35853;
        c15413.getClass();
        C23174 c23174 = new C23174(c15413, c15413);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(c21825);
        linkedHashSet2.addAll(c21826);
        linkedHashSet2.addAll(c21827);
        C7651 c7651 = new C7651(false, false, C0561.unmodifiableSet(linkedHashSet2), c10474);
        while (map.size() > 0 && c23174.hasNext()) {
            C8357 next = c23174.next();
            HashSet hashSet = new HashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (next.m21881(str2)) {
                    hashSet.add(str2);
                    InterfaceC23216 interfaceC23217 = (InterfaceC23216) entry.getValue();
                    if (interfaceC23217 != null) {
                        linkedHashSet3.add(interfaceC23217);
                    }
                }
            }
            if (hashSet.size() > 0 || next.f28985) {
                boolean zM26546 = c10474.m26546(next.f28988, linkedHashSet3, c7651);
                next.f28985 = true;
                next.m21880(c10474.f35843);
                if (c10474.f35830 || c10474.f35839) {
                    c20414.m46185("x.print.processor.info", next.f28988.getClass().getName(), hashSet.toString(), Boolean.valueOf(zM26546));
                }
                if (zM26546) {
                    map.keySet().removeAll(hashSet);
                }
            }
        }
        map.remove("");
        if (c10474.f35833 && map.size() > 0) {
            map.keySet().removeAll(c10474.f35860);
            if (map.size() > 0) {
                Set setKeySet = map.keySet();
                C14065 c14065 = C9768.f32836;
                c20414.m48201(new C14065("compiler", "proc.annotations.without.processors", setKeySet));
            }
        }
        Iterator it2 = c23174.f75209;
        if (c23174.f75211) {
            return;
        }
        Set set = Collections.EMPTY_SET;
        while (it2.hasNext()) {
            C8357 c8357 = (C8357) it2.next();
            if (c8357.f28985) {
                m26545(c23174.f75210.f50248, c8357.f28988, c7651);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m26546(InterfaceC16036 interfaceC16036, Set set, C7651 c7651) {
        C20414 c20414 = this.f35835;
        C4831 c4831 = this.f35846;
        InterfaceC3398 interfaceC3398M13415 = c4831.m13415(c4831.f16986);
        try {
            try {
                try {
                    interfaceC16036.mo38028(c7651);
                    c4831.m13415(interfaceC3398M13415);
                    return true;
                } catch (C4146 e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    AbstractC23903 abstractC23903 = e.f15170;
                    C11948 c11948M11788 = e.m11788();
                    String string = stringWriter.toString();
                    C5909 c5909 = C23879.f77204;
                    c20414.m48197(new C5909("compiler", "proc.cant.access", abstractC23903, c11948M11788, string));
                    c4831.m13415(interfaceC3398M13415);
                    return false;
                }
            } catch (C16100 e2) {
                AbstractC23903 abstractC23904 = e2.f15170;
                C11948 c11948M11789 = e2.m11788();
                C5909 c59010 = C23879.f77204;
                c20414.m48197(new C5909("compiler", "proc.cant.access.1", abstractC23904, c11948M11789));
                c4831.m13415(interfaceC3398M13415);
                return false;
            } catch (Throwable th) {
                throw new C14002(th);
            }
        } catch (Throwable th2) {
            c4831.m13415(interfaceC3398M13415);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26568(C21825 c21825, C21825 c21826, C21825 c21827, C9126 c9126) {
        boolean zM44779;
        C11885 c11885;
        C10474 c10474;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Iterator it = this.f35844.m24140().iterator();
        while (it.hasNext()) {
            setNewSetFromMap.add(((C4603) it.next()).f16295);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = c21827.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add((C7675) it2.next());
        }
        this.f35854 = C0561.unmodifiableSet(linkedHashSet);
        C19646 c19646 = new C19646(this, c21825, c21826, setNewSetFromMap, c9126);
        do {
            c19646.m44778(false, false);
            zM44779 = c19646.m44779();
            c11885 = this.f35831;
            boolean zM29642 = c11885.m29642();
            c19646.m44777(this.f35850);
            c19646 = c19646.m44775(new LinkedHashSet(c11885.m29645()), new LinkedHashMap(c11885.m29643()));
            c10474 = c19646.f63091;
            if (c19646.m44779()) {
                zM44779 = true;
            }
            if (!zM29642) {
                break;
            }
        } while (!zM44779);
        c19646.m44778(true, zM44779);
        c19646.m44777(true);
        c11885.m29641();
        HashSet hashSet = this.f35843;
        if (!hashSet.isEmpty()) {
            String string = hashSet.toString();
            C14065 c14065 = C9768.f32836;
            this.f35835.m48201(new C14065("compiler", "proc.unmatched.processor.options", string));
        }
        if (this.f35848.f18960 > 0) {
            zM44779 = true;
        } else if (this.f35858) {
            C16949 c16949 = c10474.f35829;
            if (c16949.f54221.f66179 > 0 && c16949.m39731() > 0) {
                zM44779 = true;
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(c11885.m29645());
        C21825 c21825M48594 = c19646.f63088;
        C16949 c169410 = this.f35829;
        boolean z = zM44779 || c169410.m39731() > 0;
        if (linkedHashSet2.size() > 0) {
            C21825 c21825M39718 = c169410.m39718((Set) linkedHashSet2, false);
            c21825M48594.getClass();
            c21825M48594 = c21825M39718.m48594(c21825M48594);
        }
        if ((z || c169410.m39731() > 0) && c169410.m39731() == 0) {
            c169410.f54221.f66177++;
        }
        if (c169410.m39735()) {
            c19646.m44776();
            c169410.m39734(c21825M48594);
            c169410.m39727(c21825M48594);
        } else {
            c169410.f54204.clear();
        }
        close();
        C2092 c2092 = this.f35840;
        if (c2092.m6633()) {
            return;
        }
        c2092.m6632(new C4209(EnumC13383.ANNOTATION_PROCESSING));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it;
        ServiceLoader serviceLoader;
        this.f35831.close();
        C15413 c15413 = this.f35853;
        if (c15413 != null && (it = c15413.f50250) != null && (it instanceof C9063) && (serviceLoader = ((C9063) it).f30915) != null) {
            try {
                serviceLoader.reload();
            } catch (Exception unused) {
            }
        }
        this.f35853 = null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5534 m26566() {
        return this.f35848;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11885 m26574() {
        return this.f35831;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16202 m26567() {
        return this.f35837;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16202 m26570() {
        return this.f35837;
    }

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public final EnumC12508 m26572() {
        return EnumC11909.m29707(this.f35859);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[LOOP:0: B:35:0x0086->B:36:0x0088, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x007a, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m26539(boolean z, String str, InterfaceC16036 interfaceC16036, C20414 c20414, boolean z2) {
        String strQuote;
        String strSubstring;
        String strM46498;
        int iIndexOf = str.indexOf(47);
        boolean zM31065 = true;
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            if (!EnumC12508.m31069(strSubstring2)) {
                return m26538(str, interfaceC16036, c20414, z2);
            }
            strQuote = Pattern.quote(strSubstring2 + "/");
            strSubstring = str.substring(iIndexOf + 1);
        } else {
            if (str.equals("*")) {
                return C12653.m31449(str);
            }
            strQuote = z ? ".*/" : "";
            strSubstring = str;
        }
        int i = C12653.f42264;
        if (!strSubstring.equals("*")) {
            int iIndexOf2 = strSubstring.indexOf(42);
            if (iIndexOf2 == -1) {
                strM46498 = strSubstring;
                if (zM31065) {
                    for (String str2 : strM46498.split("\\.", strM46498.length() + 2)) {
                        zM31065 &= EnumC12508.m31065(str2);
                    }
                }
            } else if (iIndexOf2 == strSubstring.length() - 1) {
                int i2 = iIndexOf2 - 1;
                if (i2 >= 0) {
                    zM31065 = strSubstring.charAt(i2) == '.';
                    strM46498 = C20630.m46498(2, 0, strSubstring);
                } else {
                    strM46498 = strSubstring;
                }
                if (zM31065) {
                    while (i < r4) {
                        zM31065 &= EnumC12508.m31065(str2);
                    }
                }
            } else {
                zM31065 = false;
            }
        }
        if (!zM31065) {
            return m26538(str, interfaceC16036, c20414, z2);
        }
        StringBuilder sbM23356 = C9023.m23356(strQuote);
        sbM23356.append(C12653.m31450(strSubstring));
        return Pattern.compile(sbM23356.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m26538(String str, InterfaceC16036 interfaceC16036, C20414 c20414, boolean z) {
        if (z) {
            String name = interfaceC16036.getClass().getName();
            C14065 c14065 = C9768.f32836;
            c20414.m48201(new C14065("compiler", "proc.malformed.supported.string", str, name));
        }
        return f35828;
    }
}
