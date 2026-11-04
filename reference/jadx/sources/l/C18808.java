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

/* JADX INFO: renamed from: l.ᩳۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes5.dex */
public final class C18808 implements InterfaceC2574, Closeable {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f61088 = Pattern.compile("(\\P{all})+");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4747 f61089;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C15846 f61090;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public ClassLoader f61091;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 f61092;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C11957 f61093;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean f61094;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C7312 f61095;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean f61096;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f61097;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14852 f61098;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C3163 f61099;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C24776 f61100;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f61101;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C2466 f61102;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C19881 f61103;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public SecurityException f61104;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C24705 f61105;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f61106;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f61107;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11518 f61108;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final Set f61109;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean f61111;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public EnumC20820 f61112;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4878 f61113;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C24030 f61114;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C13015 f61115;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22092 f61117;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C17316 f61118;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C15252 f61119;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C14764 f61120;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f61121;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public ServiceLoader f61122;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public Set f61110 = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final C23174 f61116 = new C3146(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m43619(C18808 c18808, InterfaceC8540 interfaceC8540, C9857 c9857) {
        c18808.m43620(interfaceC8540, Collections.EMPTY_SET, c9857);
    }

    public final String toString() {
        return "javac ProcessingEnvironment";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m43615(C18808 c18808, C14769 c14769) {
        c18808.getClass();
        C14769 c14769M35543 = C14769.m35543();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C19113 c19113 = (C19113) it.next();
            if (c19113.f61856.mo10886("package-info", EnumC17468.SOURCE)) {
                c14769M35543 = c14769M35543.m35552(c19113.f61858);
            }
        }
        return c14769M35543.m35554();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14769 m43634(C18808 c18808, C14769 c14769) {
        c18808.getClass();
        C14769 c14769M35543 = C14769.m35543();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            for (AbstractC8036 abstractC8036 : ((C19113) it.next()).f61857) {
                if (abstractC8036.m21911(EnumC21461.f68501)) {
                    C24550 c24550 = ((C7926) abstractC8036).f26345;
                    C11972.m30021(c24550);
                    c14769M35543 = c14769M35543.m35552(c24550);
                }
            }
        }
        return c14769M35543.m35554();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18808 m43616(C4747 c4747) {
        C18808 c18808 = (C18808) c4747.m14642(C18808.class);
        return c18808 == null ? new C18808(c4747) : c18808;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18808(C4747 c4747) {
        String strSubstring;
        this.f61089 = c4747;
        c4747.m14644(C18808.class, this);
        this.f61095 = C7312.m20023(c4747);
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f61112 = enumC20820M47625;
        C19991.m45972(c4747);
        C13015 c13015M32421 = C13015.m32421(c4747);
        this.f61115 = c13015M32421;
        this.f61106 = c13015M32421.m32433(EnumC7687.f25335);
        this.f61096 = c13015M32421.m32433(EnumC7687.f25338);
        this.f61121 = c13015M32421.m32433(EnumC7687.f25279);
        this.f61107 = C15400.m36873(c4747).m36878(EnumC19876.PROCESSING);
        C4878 c4878M14927 = C4878.m14927(c4747);
        this.f61113 = c4878M14927;
        if (c13015M32421.m32427(EnumC7687.f25284, "only") || c13015M32421.m32433(EnumC7687.f25363)) {
            c4878M14927.f17031 = EnumC10903.PROCESS;
        }
        this.f61101 = c13015M32421.m32432("fatalEnterError");
        this.f61111 = c13015M32421.m32432("showResolveErrors");
        this.f61094 = c13015M32421.m32433(EnumC7687.f25311);
        this.f61092 = (InterfaceC16722) c4747.m14642(InterfaceC16722.class);
        String str = EnumC3666.f12544.m11915(enumC20820M47625) ? "java.base/" : "";
        String[] strArr = {str.concat("java.lang.Deprecated"), str.concat("java.lang.FunctionalInterface"), str.concat("java.lang.Override"), str.concat("java.lang.SafeVarargs"), str.concat("java.lang.SuppressWarnings"), str.concat("java.lang.annotation.Documented"), str.concat("java.lang.annotation.Inherited"), str.concat("java.lang.annotation.Native"), str.concat("java.lang.annotation.Repeatable"), str.concat("java.lang.annotation.Retention"), str.concat("java.lang.annotation.Target"), str.concat("java.io.Serial")};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str2 = strArr[i];
            C17359.requireNonNull(str2);
            if (!hashSet.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        this.f61109 = C4681.unmodifiableSet(hashSet);
        this.f61100 = new C24776(c4747);
        C17316 c17316 = new C17316();
        c17316.f56401 = 0;
        c17316.f56403 = C7312.m20023(c4747);
        c17316.f56402 = this;
        this.f61118 = c17316;
        this.f61102 = C2466.m8318(c4747);
        int i2 = C8432.f27593;
        if (((C8432) c4747.m14642(C8432.class)) == null) {
            c4747.m14644(C8432.class, new C8432());
            C14764.m35506(c4747);
            C24705.m55066(c4747);
        }
        this.f61103 = C19881.m45741(c4747);
        this.f61105 = C24705.m55066(c4747);
        this.f61108 = C11518.m28979(c4747);
        Set<String> setM32424 = this.f61115.m32424();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : setM32424) {
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
        InterfaceC19554 interfaceC19554 = (InterfaceC19554) this.f61089.m14642(InterfaceC19554.class);
        if (interfaceC19554 != null) {
            Iterator it = interfaceC19554.m45125().iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(((InterfaceC22538) it.next()).m50777());
            }
        }
        Map mapUnmodifiableMap = C4681.unmodifiableMap(linkedHashMap);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(mapUnmodifiableMap.keySet());
        this.f61097 = hashSet2;
        C23721.m52973(c4747);
        this.f61093 = C11957.m29925(c4747);
        this.f61120 = C14764.m35506(c4747);
        this.f61099 = C3163.m10345(c4747);
        this.f61119 = C15252.m36599(c4747);
        this.f61090 = C15846.m37791(c4747);
        this.f61098 = C19571.m45162(c4747).m45170();
        this.f61117 = C22092.m49912(c4747);
        C17638.m41289(c4747);
        InterfaceC16722 interfaceC16722 = this.f61092;
        try {
            EnumC6282 enumC6282 = EnumC6282.ANNOTATION_PROCESSOR_MODULE_PATH;
            if (interfaceC16722.mo6989(enumC6282)) {
                try {
                    this.f61122 = interfaceC16722.mo6980(enumC6282, InterfaceC8540.class);
                    return;
                } catch (IOException e) {
                    throw new C20190(e);
                }
            }
            EnumC6282 enumC6283 = EnumC6282.ANNOTATION_PROCESSOR_PATH;
            ClassLoader classLoaderMo6991 = interfaceC16722.mo6989(enumC6283) ? interfaceC16722.mo6991(enumC6283) : interfaceC16722.mo6991(EnumC6282.CLASS_PATH);
            this.f61091 = classLoaderMo6991;
            if (classLoaderMo6991 == 0 || !(classLoaderMo6991 instanceof Closeable)) {
                return;
            }
            C4878 c4878 = this.f61113;
            c4878.f17026 = c4878.f17026.m35552((Closeable) classLoaderMo6991);
        } catch (SecurityException e2) {
            this.f61104 = e2;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43647() {
        Object c21046;
        C11972.m30030(this.f61114);
        EnumC7687 enumC7687 = EnumC7687.f25363;
        C13015 c13015 = this.f61115;
        if (c13015.m32433(enumC7687)) {
            try {
                c21046 = C14769.of((Object) new C4943()).iterator();
            } catch (Throwable th) {
                AssertionError assertionError = new AssertionError("Problem instantiating PrintingProcessor.");
                assertionError.initCause(th);
                throw assertionError;
            }
        } else {
            SecurityException securityException = this.f61104;
            if (securityException == null) {
                String strM32423 = c13015.m32423(EnumC7687.f25317);
                boolean zMo6989 = this.f61092.mo6989(EnumC6282.ANNOTATION_PROCESSOR_MODULE_PATH);
                C7312 c7312 = this.f61095;
                if (zMo6989) {
                    if (strM32423 == null) {
                        c21046 = new C7621(this.f61122, c7312);
                    } else {
                        c21046 = new C21046(this.f61122, c7312, strM32423);
                    }
                } else if (strM32423 == null) {
                    ClassLoader classLoader = this.f61091;
                    C7621 c7621 = new C7621();
                    c7621.f25155 = c7312;
                    try {
                        try {
                            ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC8540.class, classLoader);
                            c7621.f25156 = serviceLoaderLoad;
                            c7621.f25154 = serviceLoaderLoad.iterator();
                            c21046 = c7621;
                        } catch (Exception unused) {
                            c7621.f25154 = m43633("proc.no.service", (Exception) null);
                            c21046 = c7621;
                        }
                    } catch (Throwable th2) {
                        c7312.m34525(C22843.f74092);
                        throw new C20190(th2);
                    }
                } else {
                    C14332 c14332 = new C14332();
                    c14332.f45210 = null;
                    c14332.f45211 = Arrays.asList(strM32423.split(",")).iterator();
                    c14332.f45208 = this.f61091;
                    c14332.f45209 = c7312;
                    c21046 = c14332;
                }
            } else {
                c21046 = m43633("proc.cant.create.loader", securityException);
            }
        }
        InterfaceC19554 interfaceC19554 = (InterfaceC19554) this.f61089.m14642(InterfaceC19554.class);
        List list = Collections.EMPTY_LIST;
        if (interfaceC19554 != null) {
            list = C1170.stream(interfaceC19554.m45125()).map(new C20957(5)).toList();
        }
        this.f61114 = new C24030(this, C8475.m22793(C14769.of(c21046, (Object) list.iterator()), new C3984(12)));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ServiceLoader m43642() {
        EnumC6282 enumC6282 = EnumC6282.ANNOTATION_PROCESSOR_MODULE_PATH;
        InterfaceC16722 interfaceC16722 = this.f61092;
        if (interfaceC16722.mo6989(enumC6282)) {
            try {
                return interfaceC16722.mo6980(enumC6282, InterfaceC6213.class);
            } catch (IOException e) {
                throw new C20190(e);
            }
        }
        return ServiceLoader.load(InterfaceC6213.class, this.f61091);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Iterator m43633(String str, Exception exc) {
        Collection collectionMo6992;
        InterfaceC16722 interfaceC16722 = this.f61092;
        if (interfaceC16722 instanceof C2026) {
            C2026 c2026 = (C2026) interfaceC16722;
            EnumC6282 enumC6282 = EnumC6282.ANNOTATION_PROCESSOR_PATH;
            if (c2026.mo6989(enumC6282)) {
                collectionMo6992 = c2026.mo6992((InterfaceC24928) enumC6282);
            } else {
                collectionMo6992 = c2026.mo6992((InterfaceC24928) EnumC6282.CLASS_PATH);
            }
            if (this.f61115.m32423(EnumC7687.f25317) == null) {
                URL[] urlArr = new URL[1];
                Iterator it = collectionMo6992.iterator();
                while (it.hasNext()) {
                    try {
                        urlArr[0] = ((InterfaceC24329) it.next()).toUri().toURL();
                        if (!C10908.m27687(urlArr)) {
                        }
                    } catch (MalformedURLException e) {
                        throw new AssertionError(e);
                    } catch (C22097 e2) {
                        this.f61095.m34525(C22843.m51558(e2.getLocalizedMessage()));
                    }
                }
                return Collections.EMPTY_LIST.iterator();
            }
            m43617(str, exc);
            throw null;
        }
        m43617(str, exc);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43617(String str, Exception exc) {
        C7312 c7312 = this.f61095;
        if (exc != null) {
            c7312.m34519(str, exc.getLocalizedMessage());
            throw new C20190(exc);
        }
        c7312.m34519(str, new Object[0]);
        throw new C20190();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43641() {
        C24030 c24030 = this.f61114;
        c24030.getClass();
        return c24030.f77746.iterator().hasNext() || c24030.f77748.hasNext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43618(C18808 c18808, LinkedHashSet linkedHashSet, C14769 c14769, C14769 c147610, C14769 c147611) {
        C7312 c7312 = c18808.f61095;
        HashMap map = new HashMap(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            InterfaceC3804 interfaceC3804 = (InterfaceC3804) it.next();
            InterfaceC23196 interfaceC23196M8322 = c18808.f61102.m8322(interfaceC3804);
            if (EnumC3666.f12544.m11915(c18808.f61112) && interfaceC23196M8322 != null) {
                str = ((Object) interfaceC23196M8322.mo9562()) + "/";
            }
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(interfaceC3804.mo9562().toString());
            map.put(sbM27333.toString(), interfaceC3804);
        }
        if (map.size() == 0) {
            map.put("", null);
        }
        C24030 c24030 = c18808.f61114;
        c24030.getClass();
        C6130 c6130 = new C6130(c24030, c24030);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(c14769);
        linkedHashSet2.addAll(c147610);
        linkedHashSet2.addAll(c147611);
        C9857 c9857 = new C9857(false, false, C4681.unmodifiableSet(linkedHashSet2), c18808);
        while (map.size() > 0 && c6130.hasNext()) {
            C18062 next = c6130.next();
            HashSet hashSet = new HashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (next.m42086(str2)) {
                    hashSet.add(str2);
                    InterfaceC3804 interfaceC3805 = (InterfaceC3804) entry.getValue();
                    if (interfaceC3805 != null) {
                        linkedHashSet3.add(interfaceC3805);
                    }
                }
            }
            if (hashSet.size() > 0 || next.f59132) {
                boolean zM43620 = c18808.m43620(next.f59135, linkedHashSet3, c9857);
                next.f59132 = true;
                next.m42085(c18808.f61097);
                if (c18808.f61106 || c18808.f61121) {
                    c7312.m20047("x.print.processor.info", next.f59135.getClass().getName(), hashSet.toString(), Boolean.valueOf(zM43620));
                }
                if (zM43620) {
                    map.keySet().removeAll(hashSet);
                }
            }
        }
        map.remove("");
        if (c18808.f61107 && map.size() > 0) {
            map.keySet().removeAll(c18808.f61109);
            if (map.size() > 0) {
                Set setKeySet = map.keySet();
                C25213 c25213 = C13146.f42046;
                c7312.m34529(new C25213("compiler", "proc.annotations.without.processors", setKeySet));
            }
        }
        Iterator it2 = c6130.f20935;
        if (c6130.f20937) {
            return;
        }
        Set set = Collections.EMPTY_SET;
        while (it2.hasNext()) {
            C18062 c18062 = (C18062) it2.next();
            if (c18062.f59132) {
                m43619(c6130.f20934.f77747, c18062.f59135, c9857);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m43620(InterfaceC8540 interfaceC8540, Set set, C9857 c9857) {
        C7312 c7312 = this.f61095;
        C3163 c3163 = this.f61099;
        InterfaceC23301 interfaceC23301M10346 = c3163.m10346(c3163.f10267);
        try {
            try {
                interfaceC8540.mo15148(c9857);
                c3163.m10346(interfaceC23301M10346);
                return true;
            } catch (Throwable th) {
                c3163.m10346(interfaceC23301M10346);
                throw th;
            }
        } catch (C10620 e) {
            AbstractC11781 abstractC11781 = e.f68881;
            C17007 c17007M49041 = e.m49041();
            C11040 c11040 = C22843.f74058;
            c7312.m34525(new C11040("compiler", "proc.cant.access.1", abstractC11781, c17007M49041));
            c3163.m10346(interfaceC23301M10346);
            return false;
        } catch (C21566 e2) {
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            AbstractC11781 abstractC11782 = e2.f68881;
            C17007 c17007M49042 = e2.m49041();
            String string = stringWriter.toString();
            C11040 c11041 = C22843.f74058;
            c7312.m34525(new C11040("compiler", "proc.cant.access", abstractC11782, c17007M49042, string));
            c3163.m10346(interfaceC23301M10346);
            return false;
        } catch (Throwable th2) {
            throw new C11349(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43640(C14769 c14769, C14769 c147610, C14769 c147611, C10294 c10294) {
        boolean zM1378;
        C24776 c24776;
        C18808 c18808;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Iterator it = this.f61090.m37799().iterator();
        while (it.hasNext()) {
            setNewSetFromMap.add(((C3168) it.next()).f10275);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = c147611.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add((C14106) it2.next());
        }
        this.f61110 = C4681.unmodifiableSet(linkedHashSet);
        C0163 c0163 = new C0163(this, c14769, c147610, setNewSetFromMap, c10294);
        do {
            c0163.m1377(false, false);
            zM1378 = c0163.m1378();
            c24776 = this.f61100;
            boolean zM55301 = c24776.m55301();
            c0163.m1376(this.f61111);
            c0163 = c0163.m1374(new LinkedHashSet(c24776.m55304()), new LinkedHashMap(c24776.m55299()));
            c18808 = c0163.f1191;
            if (c0163.m1378()) {
                zM1378 = true;
            }
            if (!zM55301) {
                break;
            }
        } while (!zM1378);
        c0163.m1377(true, zM1378);
        c0163.m1376(true);
        c24776.m55302();
        HashSet hashSet = this.f61097;
        if (!hashSet.isEmpty()) {
            String string = hashSet.toString();
            C25213 c25213 = C13146.f42046;
            this.f61095.m34529(new C25213("compiler", "proc.unmatched.processor.options", string));
        }
        if (this.f61118.f56401 > 0) {
            zM1378 = true;
        } else if (this.f61094) {
            C4878 c4878 = c18808.f61113;
            if (c4878.f16998.f24083 > 0 && c4878.m14953() > 0) {
                zM1378 = true;
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(c24776.m55304());
        C14769 c14769M35549 = c0163.f1187;
        C4878 c4879 = this.f61113;
        boolean z = zM1378 || c4879.m14953() > 0;
        if (linkedHashSet2.size() > 0) {
            C14769 c14769M14940 = c4879.m14940((Set) linkedHashSet2, false);
            c14769M35549.getClass();
            c14769M35549 = c14769M14940.m35549(c14769M35549);
        }
        if ((z || c4879.m14953() > 0) && c4879.m14953() == 0) {
            c4879.f16998.f24079++;
        }
        if (c4879.m14958()) {
            c0163.m1375();
            c4879.m14957(c14769M35549);
            c4879.m14949(c14769M35549);
        } else {
            c4879.f17050.clear();
        }
        close();
        C11957 c11957 = this.f61093;
        if (c11957.m29927()) {
            return;
        }
        c11957.m29926(new C3975(EnumC24113.ANNOTATION_PROCESSING));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it;
        ServiceLoader serviceLoader;
        this.f61100.close();
        C24030 c24030 = this.f61114;
        if (c24030 != null && (it = c24030.f77748) != null && (it instanceof C7621) && (serviceLoader = ((C7621) it).f25156) != null) {
            try {
                serviceLoader.reload();
            } catch (Exception unused) {
            }
        }
        this.f61114 = null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17316 m43644() {
        return this.f61118;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24776 m43645() {
        return this.f61100;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2466 m43643() {
        return this.f61102;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2466 m43648() {
        return this.f61102;
    }

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC21704 m43646() {
        return EnumC20820.m47626(this.f61112);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[LOOP:0: B:35:0x0086->B:36:0x0088, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x007a, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m43613(boolean z, String str, InterfaceC8540 interfaceC8540, C7312 c7312, boolean z2) {
        String strQuote;
        String strSubstring;
        String strM5124;
        int iIndexOf = str.indexOf(47);
        boolean zM49266 = true;
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            if (!EnumC21704.m49269(strSubstring2)) {
                return m43612(str, interfaceC8540, c7312, z2);
            }
            strQuote = Pattern.quote(strSubstring2 + "/");
            strSubstring = str.substring(iIndexOf + 1);
        } else {
            if (str.equals("*")) {
                return C21966.m49708(str);
            }
            strQuote = z ? ".*/" : "";
            strSubstring = str;
        }
        int i = C21966.f70903;
        if (!strSubstring.equals("*")) {
            int iIndexOf2 = strSubstring.indexOf(42);
            if (iIndexOf2 == -1) {
                strM5124 = strSubstring;
                if (zM49266) {
                    for (String str2 : strM5124.split("\\.", strM5124.length() + 2)) {
                        zM49266 &= EnumC21704.m49266(str2);
                    }
                }
            } else if (iIndexOf2 == strSubstring.length() - 1) {
                int i2 = iIndexOf2 - 1;
                if (i2 >= 0) {
                    zM49266 = strSubstring.charAt(i2) == '.';
                    strM5124 = C1402.m5124(2, 0, strSubstring);
                } else {
                    strM5124 = strSubstring;
                }
                if (zM49266) {
                    while (i < r4) {
                        zM49266 &= EnumC21704.m49266(str2);
                    }
                }
            } else {
                zM49266 = false;
            }
        }
        if (!zM49266) {
            return m43612(str, interfaceC8540, c7312, z2);
        }
        StringBuilder sbM27333 = C10732.m27333(strQuote);
        sbM27333.append(C21966.m49709(strSubstring));
        return Pattern.compile(sbM27333.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Pattern m43612(String str, InterfaceC8540 interfaceC8540, C7312 c7312, boolean z) {
        if (z) {
            String name = interfaceC8540.getClass().getName();
            C25213 c25213 = C13146.f42046;
            c7312.m34529(new C25213("compiler", "proc.malformed.supported.string", str, name));
        }
        return f61088;
    }
}
