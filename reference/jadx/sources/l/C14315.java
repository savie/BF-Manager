package l;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.nio.file.InvalidPathException;
import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14315 extends AbstractC3729 implements InterfaceC0762 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f46886 = 0;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final C10081 f46887;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final Set f46888;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f46889;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f46890;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f46891;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C0219 f46892;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f46893;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public HashMap f46894;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public HashMap f46895;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C21369 f46896;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public EnumC23487 f46897;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized InterfaceC16431 m34547(InterfaceC3800 interfaceC3800) {
        InterfaceC20735 attributes;
        InterfaceC16431 interfaceC16431 = (InterfaceC16431) this.f46893.get(interfaceC3800);
        if (interfaceC16431 != null) {
            return interfaceC16431;
        }
        InterfaceC3800 interfaceC3800Mo36011 = this.f46896.mo36011(interfaceC3800);
        InterfaceC16431 c0202 = (InterfaceC16431) this.f46893.get(interfaceC3800Mo36011);
        if (c0202 != null) {
            this.f46893.put(interfaceC3800, c0202);
            return c0202;
        }
        try {
            attributes = C5212.readAttributes(interfaceC3800Mo36011, InterfaceC20735.class, new EnumC22146[0]);
        } catch (IOException unused) {
            c0202 = f46887;
            attributes = null;
        }
        if (attributes != null) {
            if (attributes.isDirectory()) {
                c0202 = new C12198(this, interfaceC3800Mo36011);
            } else {
                try {
                    c0202 = new C0202(this, interfaceC3800);
                } catch (SecurityException | ProviderNotFoundException e) {
                    throw new IOException(e);
                }
            }
        }
        this.f46893.put(interfaceC3800Mo36011, c0202);
        this.f46893.put(interfaceC3800, c0202);
        return c0202;
    }

    static {
        Object[] objArr = {EnumC11347.SOURCE, EnumC11347.CLASS};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f46891 = C0561.unmodifiableSet(hashSet);
        f46887 = new C10081();
        f46888 = Collections.EMPTY_SET;
        Object[] objArr2 = {EnumC13680.FOLLOW_LINKS};
        HashSet hashSet2 = new HashSet(1);
        Object obj2 = objArr2[0];
        C13638.requireNonNull(obj2);
        if (!hashSet2.add(obj2)) {
            throw new IllegalArgumentException(C9023.m23354(obj2, "duplicate element: "));
        }
        f46889 = C0561.unmodifiableSet(hashSet2);
        f46890 = File.separatorChar == '/';
    }

    public C14315(C12343 c12343, boolean z, Charset charset) {
        super(charset);
        this.f46892 = new C0219();
        this.f46894 = new HashMap();
        this.f46895 = new HashMap();
        this.f46893 = new HashMap();
        if (z) {
            c12343.m30657(InterfaceC13464.class, this);
        }
        mo10917(c12343);
    }

    @Override // l.AbstractC3729
    /* JADX INFO: renamed from: ۙ */
    public final void mo10917(C12343 c12343) {
        super.mo10917(c12343);
        C21369 c21369 = (C21369) c12343.m30655(C21369.class);
        if (c21369 == null) {
            c21369 = new C21369();
        }
        this.f46896 = c21369;
        this.f13546.m35407("ignore.symbol.file");
        String strM35397 = this.f13546.m35397("sortFiles");
        if (strM35397 != null) {
            this.f46897 = strM35397.equals("reverse") ? EnumC23487.f76047 : EnumC23487.f76049;
        }
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final ServiceLoader mo32949(InterfaceC4290 interfaceC4290, Class cls) {
        C13638.requireNonNull(interfaceC4290);
        return ServiceLoader.load(cls, mo32955(interfaceC4290));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34548(EnumC3584 enumC3584, Iterable iterable) {
        C13638.requireNonNull(enumC3584);
        C8670 c8670 = iterable == null ? null : new C8670(iterable);
        C20456 c20456 = this.f13554;
        AbstractC14107 abstractC14107M46272 = c20456.m46272(enumC3584);
        if (abstractC14107M46272 == null) {
            if (enumC3584.mo10597()) {
                abstractC14107M46272 = new C19045(c20456, enumC3584, new EnumC19730[0]);
            } else {
                abstractC14107M46272 = new C7756(c20456, enumC3584, new EnumC19730[0]);
            }
            c20456.f66391.put(enumC3584, abstractC14107M46272);
        }
        abstractC14107M46272.mo4918(c8670);
        this.f46894.remove(enumC3584);
        this.f46895.remove(enumC3584);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22150(InterfaceC3458 interfaceC3458, InterfaceC3458 interfaceC3459) {
        C13638.requireNonNull(interfaceC3458);
        C13638.requireNonNull(interfaceC3459);
        if (interfaceC3458 instanceof AbstractC6344) {
            AbstractC6344 abstractC6344 = (AbstractC6344) interfaceC3458;
            if (interfaceC3459 instanceof AbstractC6344) {
                return abstractC6344.f21404.equals(((AbstractC6344) interfaceC3459).f21404);
            }
        }
        return interfaceC3458.equals(interfaceC3459);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32953(InterfaceC4290 interfaceC4290) {
        C13638.requireNonNull(interfaceC4290);
        AbstractC14107 abstractC14107M46272 = this.f13554.m46272(interfaceC4290);
        if (abstractC14107M46272 == null) {
            return false;
        }
        return abstractC14107M46272.mo22116();
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32954(InterfaceC4290 interfaceC4290, InterfaceC3458 interfaceC3458) {
        C13638.requireNonNull(interfaceC4290);
        C13638.requireNonNull(interfaceC3458);
        if (interfaceC3458 instanceof AbstractC6344) {
            InterfaceC3800 interfaceC3800 = ((AbstractC6344) interfaceC3458).f21404;
            AbstractC14107 abstractC14107M46272 = this.f13554.m46272(interfaceC4290);
            if (abstractC14107M46272 == null) {
                throw new IllegalArgumentException("unknown location");
            }
            return abstractC14107M46272.mo4920(interfaceC3800);
        }
        throw new IllegalArgumentException(interfaceC3458.getName());
    }

    @Override // l.InterfaceC0762
    /* JADX INFO: renamed from: ۚ */
    public final Collection mo3278(InterfaceC4290 interfaceC4290) {
        C13638.requireNonNull(interfaceC4290);
        AbstractC14107 abstractC14107M46272 = this.f13554.m46272(interfaceC4290);
        if (abstractC14107M46272 == null) {
            return null;
        }
        return abstractC14107M46272.mo9021();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34540(C14315 c14315, InterfaceC3800 interfaceC3800, C11284 c11284) {
        if (!f46890) {
            try {
                String string = interfaceC3800.toRealPath(EnumC22146.NOFOLLOW_LINKS).toString();
                char cCharAt = interfaceC3800.getFileSystem().getSeparator().charAt(0);
                char[] charArray = string.toCharArray();
                char[] charArray2 = c11284.f48427.toCharArray();
                int length = charArray.length - 1;
                int length2 = charArray2.length - 1;
                while (length >= 0 && length2 >= 0) {
                    while (length >= 0 && charArray[length] == cCharAt) {
                        length--;
                    }
                    while (length2 >= 0 && charArray2[length2] == '/') {
                        length2--;
                    }
                    if (length >= 0 && length2 >= 0) {
                        if (charArray[length] != charArray2[length2]) {
                            return false;
                        }
                        length--;
                        length2--;
                    }
                }
                if (length2 >= 0) {
                    return false;
                }
            } catch (IOException unused) {
            }
        }
        return true;
    }

    @Override // l.InterfaceC13464, java.io.Flushable
    public final void flush() {
        this.f13551.clear();
        this.f46894.clear();
        this.f46895.clear();
    }

    @Override // l.InterfaceC13464, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13552 > 0) {
            C2318 c2318 = new C2318(this, C14315.class.getName().concat(" DeferredClose"));
            c2318.setDaemon(true);
            c2318.start();
            return;
        }
        this.f13554.m46273();
        HashMap map = this.f46893;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC16431) it.next()).close();
        }
        map.clear();
        this.f46894.clear();
        this.f46895.clear();
        this.f13551.clear();
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۨ */
    public final ClassLoader mo32955(InterfaceC4290 interfaceC4290) {
        m34537(interfaceC4290);
        AbstractC14107 abstractC14107M46272 = this.f13554.m46272(interfaceC4290);
        final Collection collectionMo9021 = abstractC14107M46272 == null ? null : abstractC14107M46272.mo9021();
        Iterable iterable = collectionMo9021 == null ? null : new Iterable() { // from class: l.ᩴۚ۟
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C20664(collectionMo9021);
            }
        };
        if (iterable == null) {
            return null;
        }
        C19003 c19003 = new C19003();
        Iterator it = iterable.iterator();
        while (true) {
            C20664 c20664 = (C20664) it;
            if (!c20664.f67251.hasNext()) {
                break;
            }
            try {
                c19003.m43723(((File) c20664.next()).toURI().toURL());
            } catch (MalformedURLException e) {
                throw new AssertionError(e);
            }
        }
        URL[] urlArr = (URL[]) c19003.toArray(new URL[c19003.size()]);
        ClassLoader classLoader = C14315.class.getClassLoader();
        String str = this.f13543;
        if (str != null) {
            try {
                return (ClassLoader) Class.forName(str).asSubclass(ClassLoader.class).getConstructor(URL[].class, ClassLoader.class).newInstance(urlArr, classLoader);
            } catch (ReflectiveOperationException unused) {
            }
        }
        return new URLClassLoader(urlArr, classLoader);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo32947(final InterfaceC4290 interfaceC4290, String str, Set set, boolean z) throws IOException {
        m34537(interfaceC4290);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C13638.requireNonNull(it.next());
        }
        C11284 c11284 = new C11284(str.toString().replace('.', '/'));
        C19003 c19003 = new C19003();
        try {
            for (C17136 c17136 : (List) C9735.computeIfAbsent((Map) C9735.computeIfAbsent(this.f46894, interfaceC4290, new C8542(2, this)), c11284, new Function() { // from class: l.۠ۚ۟
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C14315.m34538(this.f26157, interfaceC4290);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }
            })) {
                c17136.f54652.mo1515(c17136.f54651, c11284, set, z, c19003);
            }
            return c19003.m43726();
        } catch (UncheckedIOException e) {
            throw e.getCause();
        }
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final String mo32948(InterfaceC4290 interfaceC4290, InterfaceC2173 interfaceC2173) {
        m34537(interfaceC4290);
        C13638.requireNonNull(interfaceC2173);
        Collection collectionMo3278 = mo3278(interfaceC4290);
        if (collectionMo3278 == null) {
            return null;
        }
        if (interfaceC2173 instanceof AbstractC6344) {
            return ((AbstractC6344) interfaceC2173).mo17449(collectionMo3278);
        }
        throw new IllegalArgumentException(interfaceC2173.getClass().getName());
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2173 mo32950(InterfaceC4290 interfaceC4290, String str, EnumC11347 enumC11347) {
        m34537(interfaceC4290);
        C13638.requireNonNull(str);
        C13638.requireNonNull(enumC11347);
        if (!f46891.contains(enumC11347)) {
            throw new IllegalArgumentException("Invalid kind: " + enumC11347);
        }
        C23984 c23984M52820 = C23984.m52820(str, enumC11347);
        Collection<InterfaceC3800> collectionMo3278 = mo3278(interfaceC4290);
        if (collectionMo3278 == null) {
            return null;
        }
        for (InterfaceC3800 interfaceC3800 : collectionMo3278) {
            InterfaceC2173 interfaceC2173Mo1514 = m34547(interfaceC3800).mo1514(interfaceC3800, c23984M52820);
            if (interfaceC2173Mo1514 != null) {
                return interfaceC2173Mo1514;
            }
        }
        return null;
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2173 mo32951(InterfaceC4290 interfaceC4290, String str, EnumC11347 enumC11347, InterfaceC3458 interfaceC3458) {
        m34542(interfaceC4290);
        C13638.requireNonNull(enumC11347);
        if (!f46891.contains(enumC11347)) {
            throw new IllegalArgumentException("Invalid kind: " + enumC11347);
        }
        return m34539(interfaceC4290, C23984.m52820(str, enumC11347), interfaceC3458);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3458 mo32952(InterfaceC4290 interfaceC4290, String str) {
        m34542(interfaceC4290);
        try {
            URI uri = new URI(str);
            if (!uri.isAbsolute()) {
                String path = uri.normalize().getPath();
                if (path.length() != 0 && path.equals(uri.getPath()) && !path.startsWith("/") && !path.startsWith("./") && !path.startsWith("../")) {
                    return m34539(interfaceC4290, new C23984(str), (InterfaceC3458) null);
                }
            }
        } catch (URISyntaxException unused) {
        }
        throw new IllegalArgumentException(C0252.m1693("Invalid relative name: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC6344 m34539(InterfaceC4290 interfaceC4290, C23984 c23984, InterfaceC3458 interfaceC3458) throws IOException {
        InterfaceC3800 interfaceC3800;
        AbstractC14107 abstractC14107M46272;
        EnumC3584 enumC3584 = EnumC3584.CLASS_OUTPUT;
        C0219 c0219 = this.f46892;
        C20456 c20456 = this.f13554;
        if (interfaceC4290 != enumC3584) {
            EnumC3584 enumC3585 = EnumC3584.SOURCE_OUTPUT;
            if (interfaceC4290 == enumC3585) {
                c20456.getClass();
                if (!enumC3585.mo10597()) {
                    throw new IllegalArgumentException();
                }
                if (((C19045) c20456.m46272(enumC3585)).f61605 != null) {
                    c20456.getClass();
                    if (!enumC3585.mo10597()) {
                        throw new IllegalArgumentException();
                    }
                    abstractC14107M46272 = c20456.m46272(enumC3585);
                } else {
                    c20456.getClass();
                    if (!enumC3584.mo10597()) {
                        throw new IllegalArgumentException();
                    }
                }
                interfaceC3800 = ((C19045) abstractC14107M46272).f61605;
            } else {
                AbstractC14107 abstractC14107M46273 = c20456.m46272(interfaceC4290);
                Iterator it = (abstractC14107M46273 == null ? null : abstractC14107M46273.mo9021()).iterator();
                interfaceC3800 = it.hasNext() ? (InterfaceC3800) it.next() : null;
            }
            if (interfaceC3800 == null) {
                try {
                    c0219.getClass();
                    interfaceC3800 = C22852.get(System.getProperty("user.dir"), new String[0]);
                } catch (InvalidPathException e) {
                    throw new IOException("bad filename " + c23984, e);
                }
            }
            InterfaceC3800 interfaceC3801 = interfaceC3800;
            InterfaceC3800 interfaceC3800M35483 = c23984.m35483(this.f46896.mo36011(interfaceC3801));
            int i = AbstractC6344.f21400;
            return new C16928(this, interfaceC3800M35483, interfaceC3801, c23984, 0);
        }
        c20456.getClass();
        if (!enumC3584.mo10597()) {
            throw new IllegalArgumentException();
        }
        if (((C19045) c20456.m46272(enumC3584)).f61605 == null) {
            String str = c23984.f48427;
            String strSubstring = str.substring(str.lastIndexOf(47) + 1);
            if (interfaceC3458 != null && (interfaceC3458 instanceof AbstractC6344)) {
                return ((AbstractC6344) interfaceC3458).mo17450(strSubstring);
            }
            c0219.getClass();
            InterfaceC3800 interfaceC3802 = C22852.get(strSubstring, new String[0]);
            InterfaceC3800 interfaceC3800Mo36011 = this.f46896.mo36011(interfaceC3802);
            int i2 = AbstractC6344.f21400;
            return new C17633(this, interfaceC3800Mo36011, interfaceC3802, 0);
        }
        c20456.getClass();
        if (!enumC3584.mo10597()) {
            throw new IllegalArgumentException();
        }
        abstractC14107M46272 = c20456.m46272(enumC3584);
        interfaceC3800 = ((C19045) abstractC14107M46272).f61605;
        if (interfaceC3800 == null) {
            c0219.getClass();
            interfaceC3800 = C22852.get(System.getProperty("user.dir"), new String[0]);
        }
        InterfaceC3800 interfaceC3803 = interfaceC3800;
        InterfaceC3800 interfaceC3800M35484 = c23984.m35483(this.f46896.mo36011(interfaceC3803));
        int i3 = AbstractC6344.f21400;
        return new C16928(this, interfaceC3800M35484, interfaceC3803, c23984, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34546(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null) {
            ArrayList arrayList = new ArrayList(linkedHashSet.size());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                InterfaceC3800 interfaceC3800 = (InterfaceC3800) it.next();
                InterfaceC3800 interfaceC3800Mo36011 = this.f46896.mo36011(interfaceC3800);
                int i = AbstractC6344.f21400;
                arrayList.add(new C17633(this, interfaceC3800Mo36011, interfaceC3800, 0));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ List m34538(C14315 c14315, InterfaceC4290 interfaceC4290) {
        return (List) c14315.f46895.get(interfaceC4290);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashMap m34543(C14315 c14315, InterfaceC4290 interfaceC4290) {
        List<C17136> listM48588;
        HashMap map = new HashMap();
        Collection<InterfaceC3800> collectionMo3278 = c14315.mo3278(interfaceC4290);
        if (collectionMo3278 == null) {
            listM48588 = C21825.m48588();
        } else {
            ArrayList arrayList = new ArrayList(collectionMo3278.size());
            for (InterfaceC3800 interfaceC3800 : collectionMo3278) {
                try {
                    arrayList.add(new C17136(interfaceC3800, c14315.m34547(interfaceC3800), arrayList.size()));
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            listM48588 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C17136 c17136 : listM48588) {
            if (!c17136.f54652.mo1516()) {
                arrayList2.add(c17136);
            }
        }
        for (C17136 c17137 : listM48588) {
            InterfaceC16431 interfaceC16431 = c17137.f54652;
            if (interfaceC16431.mo1516()) {
                Iterator it = interfaceC16431.mo1513().iterator();
                while (it.hasNext()) {
                    ((List) C9735.computeIfAbsent(map, (C11284) it.next(), new C23877(1, arrayList2))).add(c17137);
                }
            }
        }
        c14315.f46895.put(interfaceC4290, arrayList2);
        C0356.forEach(map.values(), new C19253());
        return map;
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4290 mo32957(InterfaceC4290 interfaceC4290, String str) {
        m34545(interfaceC4290);
        C13638.requireNonNull(str);
        EnumC3584 enumC3584 = EnumC3584.SOURCE_OUTPUT;
        C20456 c20456 = this.f13554;
        if (interfaceC4290 == enumC3584) {
            c20456.getClass();
            if (!enumC3584.mo10597()) {
                throw new IllegalArgumentException();
            }
            if (((C19045) c20456.m46272(enumC3584)).f61605 == null) {
                interfaceC4290 = EnumC3584.CLASS_OUTPUT;
            }
        }
        AbstractC14107 abstractC14107M46272 = c20456.m46272(interfaceC4290);
        if (abstractC14107M46272 == null) {
            return null;
        }
        return abstractC14107M46272.mo4917(str);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4290 mo32958(InterfaceC4290 interfaceC4290, InterfaceC2173 interfaceC2173) {
        m34545(interfaceC4290);
        if (!(interfaceC2173 instanceof AbstractC6344)) {
            return null;
        }
        InterfaceC3800 interfaceC3800M46261 = C20456.m46261(((AbstractC6344) interfaceC2173).f21404);
        AbstractC14107 abstractC14107M46272 = this.f13554.m46272(interfaceC4290);
        if (abstractC14107M46272 == null) {
            return null;
        }
        return abstractC14107M46272.mo4922(interfaceC3800M46261);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۖ */
    public final String mo32946(InterfaceC4290 interfaceC4290) {
        m34537(interfaceC4290);
        AbstractC14107 abstractC14107M46272 = this.f13554.m46272(interfaceC4290);
        if (abstractC14107M46272 == null) {
            return null;
        }
        return abstractC14107M46272.mo29858();
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ܰ */
    public final Iterable mo32956(InterfaceC4290 interfaceC4290) {
        m34545(interfaceC4290);
        AbstractC14107 abstractC14107M46272 = this.f13554.m46272(interfaceC4290);
        if (abstractC14107M46272 == null) {
            return null;
        }
        return abstractC14107M46272.mo4923();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m34542(InterfaceC4290 interfaceC4290) {
        C13638.requireNonNull(interfaceC4290);
        if (interfaceC4290.mo10597()) {
            return;
        }
        throw new IllegalArgumentException("location is not an output location: " + interfaceC4290.getName());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m34545(InterfaceC4290 interfaceC4290) {
        C13638.requireNonNull(interfaceC4290);
        if (interfaceC4290.mo10596() || interfaceC4290.mo10597()) {
            return;
        }
        throw new IllegalArgumentException("location is not an output location or a module-oriented location: " + interfaceC4290.getName());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m34537(InterfaceC4290 interfaceC4290) {
        C13638.requireNonNull(interfaceC4290);
        if (interfaceC4290.mo10596()) {
            throw new IllegalArgumentException("location is module-oriented: " + interfaceC4290.getName());
        }
    }

    @Override // l.AbstractC3729
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10919(EnumC19730 enumC19730, String str) {
        if (AbstractC3729.f13542.contains(enumC19730)) {
            this.f46894.clear();
            this.f46895.clear();
        }
        return super.mo10919(enumC19730, str);
    }
}
