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

/* JADX INFO: renamed from: l.֫ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C2026 extends AbstractC24643 implements InterfaceC20452 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final C3013 f6739;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final Set f6740;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final Set f6741;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6742 = 0;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f6743;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f6744;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f6745;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public HashMap f6746;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public EnumC5755 f6747;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public HashMap f6748;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C0776 f6749;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C13921 f6750;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized InterfaceC10974 m6981(InterfaceC24329 interfaceC24329) {
        InterfaceC8665 attributes;
        InterfaceC10974 interfaceC10974 = (InterfaceC10974) this.f6745.get(interfaceC24329);
        if (interfaceC10974 != null) {
            return interfaceC10974;
        }
        InterfaceC24329 interfaceC24329Mo3175 = this.f6749.mo3175(interfaceC24329);
        InterfaceC10974 c22163 = (InterfaceC10974) this.f6745.get(interfaceC24329Mo3175);
        if (c22163 != null) {
            this.f6745.put(interfaceC24329, c22163);
            return c22163;
        }
        try {
            attributes = C3445.readAttributes(interfaceC24329Mo3175, InterfaceC8665.class, new EnumC20599[0]);
        } catch (IOException unused) {
            c22163 = f6739;
            attributes = null;
        }
        if (attributes != null) {
            if (attributes.isDirectory()) {
                c22163 = new C22909(this, interfaceC24329Mo3175);
            } else {
                try {
                    c22163 = new C22163(this, interfaceC24329);
                } catch (SecurityException | ProviderNotFoundException e) {
                    throw new IOException(e);
                }
            }
        }
        this.f6745.put(interfaceC24329Mo3175, c22163);
        this.f6745.put(interfaceC24329, c22163);
        return c22163;
    }

    static {
        Object[] objArr = {EnumC17468.SOURCE, EnumC17468.CLASS};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f6744 = C4681.unmodifiableSet(hashSet);
        f6739 = new C3013();
        f6741 = Collections.EMPTY_SET;
        Object[] objArr2 = {EnumC17615.FOLLOW_LINKS};
        HashSet hashSet2 = new HashSet(1);
        Object obj2 = objArr2[0];
        C17359.requireNonNull(obj2);
        if (!hashSet2.add(obj2)) {
            throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj2));
        }
        f6740 = C4681.unmodifiableSet(hashSet2);
        f6743 = File.separatorChar == '/';
    }

    public C2026(C4747 c4747, boolean z, Charset charset) {
        super(charset);
        this.f6750 = new C13921(1);
        this.f6748 = new HashMap();
        this.f6746 = new HashMap();
        this.f6745 = new HashMap();
        if (z) {
            c4747.m14644(InterfaceC16722.class, this);
        }
        mo6985(c4747);
    }

    @Override // l.AbstractC24643
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6985(C4747 c4747) {
        super.mo6985(c4747);
        C0776 c0776 = (C0776) c4747.m14642(C0776.class);
        if (c0776 == null) {
            c0776 = new C0776();
        }
        this.f6749 = c0776;
        this.f79777.m32432("ignore.symbol.file");
        String strM32422 = this.f79777.m32422("sortFiles");
        if (strM32422 != null) {
            this.f6747 = strM32422.equals("reverse") ? EnumC5755.f19798 : EnumC5755.f19799;
        }
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ServiceLoader mo6980(InterfaceC24928 interfaceC24928, Class cls) {
        C17359.requireNonNull(interfaceC24928);
        return ServiceLoader.load(cls, mo6991(interfaceC24928));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6986(EnumC6282 enumC6282, Iterable iterable) {
        C17359.requireNonNull(enumC6282);
        C9724 c9724 = iterable == null ? null : new C9724(iterable);
        C22185 c22185 = this.f79780;
        AbstractC23655 abstractC23655M50193 = c22185.m50193(enumC6282);
        if (abstractC23655M50193 == null) {
            if (enumC6282.mo11525()) {
                abstractC23655M50193 = new C10228(c22185, enumC6282, new EnumC7687[0]);
            } else {
                abstractC23655M50193 = new C7246(c22185, enumC6282, new EnumC7687[0]);
            }
            c22185.f71484.put(enumC6282, abstractC23655M50193);
        }
        abstractC23655M50193.mo4669(c9724);
        this.f6748.remove(enumC6282);
        this.f6746.remove(enumC6282);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6988(InterfaceC11501 interfaceC11501, InterfaceC11501 interfaceC11502) {
        C17359.requireNonNull(interfaceC11501);
        C17359.requireNonNull(interfaceC11502);
        if (interfaceC11501 instanceof AbstractC13234) {
            AbstractC13234 abstractC13234 = (AbstractC13234) interfaceC11501;
            if (interfaceC11502 instanceof AbstractC13234) {
                return abstractC13234.f42299.equals(((AbstractC13234) interfaceC11502).f42299);
            }
        }
        return interfaceC11501.equals(interfaceC11502);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6989(InterfaceC24928 interfaceC24928) {
        C17359.requireNonNull(interfaceC24928);
        AbstractC23655 abstractC23655M50193 = this.f79780.m50193(interfaceC24928);
        if (abstractC23655M50193 == null) {
            return false;
        }
        return abstractC23655M50193.mo4674();
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6990(InterfaceC24928 interfaceC24928, InterfaceC11501 interfaceC11501) {
        C17359.requireNonNull(interfaceC24928);
        C17359.requireNonNull(interfaceC11501);
        if (interfaceC11501 instanceof AbstractC13234) {
            InterfaceC24329 interfaceC24329 = ((AbstractC13234) interfaceC11501).f42299;
            AbstractC23655 abstractC23655M50193 = this.f79780.m50193(interfaceC24928);
            if (abstractC23655M50193 == null) {
                throw new IllegalArgumentException("unknown location");
            }
            return abstractC23655M50193.mo4672(interfaceC24329);
        }
        throw new IllegalArgumentException(interfaceC11501.getName());
    }

    @Override // l.InterfaceC20452
    /* JADX INFO: renamed from: ᩴ */
    public final Collection mo6992(InterfaceC24928 interfaceC24928) {
        C17359.requireNonNull(interfaceC24928);
        AbstractC23655 abstractC23655M50193 = this.f79780.m50193(interfaceC24928);
        if (abstractC23655M50193 == null) {
            return null;
        }
        return abstractC23655M50193.mo4675();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6969(C2026 c2026, InterfaceC24329 interfaceC24329, C5777 c5777) {
        if (!f6743) {
            try {
                String string = interfaceC24329.toRealPath(EnumC20599.NOFOLLOW_LINKS).toString();
                char cCharAt = interfaceC24329.getFileSystem().getSeparator().charAt(0);
                char[] charArray = string.toCharArray();
                char[] charArray2 = c5777.f37972.toCharArray();
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

    @Override // l.InterfaceC16722, java.io.Flushable
    public final void flush() {
        this.f79774.clear();
        this.f6748.clear();
        this.f6746.clear();
    }

    @Override // l.InterfaceC16722, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f79784 > 0) {
            C23897 c23897 = new C23897(this, C2026.class.getName().concat(" DeferredClose"));
            c23897.setDaemon(true);
            c23897.start();
            return;
        }
        this.f79780.m50195();
        HashMap map = this.f6745;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC10974) it.next()).close();
        }
        map.clear();
        this.f6748.clear();
        this.f6746.clear();
        this.f79774.clear();
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ClassLoader mo6991(InterfaceC24928 interfaceC24928) {
        m6973(interfaceC24928);
        AbstractC23655 abstractC23655M50193 = this.f79780.m50193(interfaceC24928);
        final Collection collectionMo4675 = abstractC23655M50193 == null ? null : abstractC23655M50193.mo4675();
        Iterable iterable = collectionMo4675 == null ? null : new Iterable() { // from class: l.ᩳ᩻ۘ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C7488(collectionMo4675);
            }
        };
        if (iterable == null) {
            return null;
        }
        C18499 c18499 = new C18499();
        Iterator it = iterable.iterator();
        while (true) {
            C7488 c7488 = (C7488) it;
            if (!c7488.f24769.hasNext()) {
                break;
            }
            try {
                c18499.m43089(((File) c7488.next()).toURI().toURL());
            } catch (MalformedURLException e) {
                throw new AssertionError(e);
            }
        }
        URL[] urlArr = (URL[]) c18499.toArray(new URL[c18499.size()]);
        ClassLoader classLoader = C2026.class.getClassLoader();
        String str = this.f79783;
        if (str != null) {
            try {
                return (ClassLoader) Class.forName(str).asSubclass(ClassLoader.class).getConstructor(URL[].class, ClassLoader.class).newInstance(urlArr, classLoader);
            } catch (ReflectiveOperationException unused) {
            }
        }
        return new URLClassLoader(urlArr, classLoader);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable mo6977(InterfaceC24928 interfaceC24928, String str, Set set, boolean z) throws IOException {
        m6973(interfaceC24928);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C17359.requireNonNull(it.next());
        }
        C5777 c5777 = new C5777(str.toString().replace('.', '/'));
        C18499 c18499 = new C18499();
        try {
            for (C19925 c19925 : (List) C11392.computeIfAbsent((Map) C11392.computeIfAbsent(this.f6748, interfaceC24928, new C11737(1, this)), c5777, new C19794(2, this, interfaceC24928))) {
                c19925.f64085.mo9821(c19925.f64086, c5777, set, z, c18499);
            }
            return c18499.m43093();
        } catch (UncheckedIOException e) {
            throw e.getCause();
        }
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6978(InterfaceC24928 interfaceC24928, InterfaceC15976 interfaceC15976) {
        m6973(interfaceC24928);
        C17359.requireNonNull(interfaceC15976);
        Collection collectionMo6992 = mo6992(interfaceC24928);
        if (collectionMo6992 == null) {
            return null;
        }
        if (interfaceC15976 instanceof AbstractC13234) {
            return ((AbstractC13234) interfaceC15976).mo32788(collectionMo6992);
        }
        throw new IllegalArgumentException(interfaceC15976.getClass().getName());
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 mo6983(InterfaceC24928 interfaceC24928, String str, EnumC17468 enumC17468) {
        m6973(interfaceC24928);
        C17359.requireNonNull(str);
        C17359.requireNonNull(enumC17468);
        if (!f6744.contains(enumC17468)) {
            throw new IllegalArgumentException("Invalid kind: " + enumC17468);
        }
        C2048 c2048M7058 = C2048.m7058(str, enumC17468);
        Collection<InterfaceC24329> collectionMo6992 = mo6992(interfaceC24928);
        if (collectionMo6992 == null) {
            return null;
        }
        for (InterfaceC24329 interfaceC24329 : collectionMo6992) {
            InterfaceC15976 interfaceC15976Mo9820 = m6981(interfaceC24329).mo9820(interfaceC24329, c2048M7058);
            if (interfaceC15976Mo9820 != null) {
                return interfaceC15976Mo9820;
            }
        }
        return null;
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 mo6984(InterfaceC24928 interfaceC24928, String str, EnumC17468 enumC17468, InterfaceC11501 interfaceC11501) {
        m6971(interfaceC24928);
        C17359.requireNonNull(enumC17468);
        if (!f6744.contains(enumC17468)) {
            throw new IllegalArgumentException("Invalid kind: " + enumC17468);
        }
        return m6968(interfaceC24928, C2048.m7058(str, enumC17468), interfaceC11501);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11501 mo6982(InterfaceC24928 interfaceC24928, String str) {
        m6971(interfaceC24928);
        try {
            URI uri = new URI(str);
            if (!uri.isAbsolute()) {
                String path = uri.normalize().getPath();
                if (path.length() != 0 && path.equals(uri.getPath()) && !path.startsWith("/") && !path.startsWith("./") && !path.startsWith("../")) {
                    return m6968(interfaceC24928, new C2048(str), (InterfaceC11501) null);
                }
            }
        } catch (URISyntaxException unused) {
        }
        throw new IllegalArgumentException(C25272.m56409("Invalid relative name: ", str));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC13234 m6968(InterfaceC24928 interfaceC24928, C2048 c2048, InterfaceC11501 interfaceC11501) throws IOException {
        InterfaceC24329 interfaceC24329;
        AbstractC23655 abstractC23655M50193;
        EnumC6282 enumC6282 = EnumC6282.CLASS_OUTPUT;
        C13921 c13921 = this.f6750;
        C22185 c22185 = this.f79780;
        if (interfaceC24928 != enumC6282) {
            EnumC6282 enumC6283 = EnumC6282.SOURCE_OUTPUT;
            if (interfaceC24928 == enumC6283) {
                c22185.getClass();
                if (!enumC6283.mo11525()) {
                    throw new IllegalArgumentException();
                }
                if (((C10228) c22185.m50193(enumC6283)).f32678 != null) {
                    c22185.getClass();
                    if (!enumC6283.mo11525()) {
                        throw new IllegalArgumentException();
                    }
                    abstractC23655M50193 = c22185.m50193(enumC6283);
                } else {
                    c22185.getClass();
                    if (!enumC6282.mo11525()) {
                        throw new IllegalArgumentException();
                    }
                }
                interfaceC24329 = ((C10228) abstractC23655M50193).f32678;
            } else {
                AbstractC23655 abstractC23655M50194 = c22185.m50193(interfaceC24928);
                Iterator it = (abstractC23655M50194 == null ? null : abstractC23655M50194.mo4675()).iterator();
                interfaceC24329 = it.hasNext() ? (InterfaceC24329) it.next() : null;
            }
            if (interfaceC24329 == null) {
                try {
                    c13921.getClass();
                    interfaceC24329 = C14631.get(System.getProperty("user.dir"), new String[0]);
                } catch (InvalidPathException e) {
                    throw new IOException("bad filename " + c2048, e);
                }
            }
            InterfaceC24329 interfaceC243210 = interfaceC24329;
            InterfaceC24329 interfaceC24329M29493 = c2048.m29493(this.f6749.mo3175(interfaceC243210));
            int i = AbstractC13234.f42297;
            return new C22931(this, interfaceC24329M29493, interfaceC243210, c2048, 0);
        }
        c22185.getClass();
        if (!enumC6282.mo11525()) {
            throw new IllegalArgumentException();
        }
        if (((C10228) c22185.m50193(enumC6282)).f32678 == null) {
            String strM42088 = C18063.m42088(47, 1, c2048.f37972);
            if (interfaceC11501 != null && (interfaceC11501 instanceof AbstractC13234)) {
                return ((AbstractC13234) interfaceC11501).mo32789(strM42088);
            }
            c13921.getClass();
            InterfaceC24329 interfaceC243211 = C14631.get(strM42088, new String[0]);
            InterfaceC24329 interfaceC24329Mo3175 = this.f6749.mo3175(interfaceC243211);
            int i2 = AbstractC13234.f42297;
            return new C15471(this, interfaceC24329Mo3175, interfaceC243211, 0);
        }
        c22185.getClass();
        if (!enumC6282.mo11525()) {
            throw new IllegalArgumentException();
        }
        abstractC23655M50193 = c22185.m50193(enumC6282);
        interfaceC24329 = ((C10228) abstractC23655M50193).f32678;
        if (interfaceC24329 == null) {
            c13921.getClass();
            interfaceC24329 = C14631.get(System.getProperty("user.dir"), new String[0]);
        }
        InterfaceC24329 interfaceC243212 = interfaceC24329;
        InterfaceC24329 interfaceC24329M29494 = c2048.m29493(this.f6749.mo3175(interfaceC243212));
        int i3 = AbstractC13234.f42297;
        return new C22931(this, interfaceC24329M29494, interfaceC243212, c2048, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m6979(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null) {
            ArrayList arrayList = new ArrayList(linkedHashSet.size());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                InterfaceC24329 interfaceC24329 = (InterfaceC24329) it.next();
                InterfaceC24329 interfaceC24329Mo3175 = this.f6749.mo3175(interfaceC24329);
                int i = AbstractC13234.f42297;
                arrayList.add(new C15471(this, interfaceC24329Mo3175, interfaceC24329, 0));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ List m6967(C2026 c2026, InterfaceC24928 interfaceC24928) {
        return (List) c2026.f6746.get(interfaceC24928);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static HashMap m6975(C2026 c2026, InterfaceC24928 interfaceC24928) {
        List<C19925> listM35543;
        HashMap map = new HashMap();
        Collection<InterfaceC24329> collectionMo6992 = c2026.mo6992(interfaceC24928);
        if (collectionMo6992 == null) {
            listM35543 = C14769.m35543();
        } else {
            ArrayList arrayList = new ArrayList(collectionMo6992.size());
            for (InterfaceC24329 interfaceC24329 : collectionMo6992) {
                try {
                    arrayList.add(new C19925(interfaceC24329, c2026.m6981(interfaceC24329), arrayList.size()));
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            listM35543 = arrayList;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (C19925 c19925 : listM35543) {
            if (!c19925.f64085.mo9822()) {
                arrayList2.add(c19925);
            }
        }
        for (C19925 c19926 : listM35543) {
            InterfaceC10974 interfaceC10974 = c19926.f64085;
            if (interfaceC10974.mo9822()) {
                Iterator it = interfaceC10974.mo9819().iterator();
                while (it.hasNext()) {
                    ((List) C11392.computeIfAbsent(map, (C5777) it.next(), new Function() { // from class: l.ۢ᩻ۘ
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public /* synthetic */ Function mo10608andThen(Function function) {
                            return C24247.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C24247.$default$compose(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return new ArrayList(arrayList2);
                        }
                    })).add(c19926);
                }
            }
        }
        c2026.f6746.put(interfaceC24928, arrayList2);
        C4937.forEach(map.values(), new C1522());
        return map;
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24928 mo6994(InterfaceC24928 interfaceC24928, String str) {
        m6974(interfaceC24928);
        C17359.requireNonNull(str);
        EnumC6282 enumC6282 = EnumC6282.SOURCE_OUTPUT;
        C22185 c22185 = this.f79780;
        if (interfaceC24928 == enumC6282) {
            c22185.getClass();
            if (!enumC6282.mo11525()) {
                throw new IllegalArgumentException();
            }
            if (((C10228) c22185.m50193(enumC6282)).f32678 == null) {
                interfaceC24928 = EnumC6282.CLASS_OUTPUT;
            }
        }
        AbstractC23655 abstractC23655M50193 = c22185.m50193(interfaceC24928);
        if (abstractC23655M50193 == null) {
            return null;
        }
        return abstractC23655M50193.mo4668(str);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24928 mo6995(InterfaceC24928 interfaceC24928, InterfaceC15976 interfaceC15976) {
        m6974(interfaceC24928);
        if (!(interfaceC15976 instanceof AbstractC13234)) {
            return null;
        }
        InterfaceC24329 interfaceC24329M50185 = C22185.m50185(((AbstractC13234) interfaceC15976).f42299);
        AbstractC23655 abstractC23655M50193 = this.f79780.m50193(interfaceC24928);
        if (abstractC23655M50193 == null) {
            return null;
        }
        return abstractC23655M50193.mo4676(interfaceC24329M50185);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo6996(InterfaceC24928 interfaceC24928) {
        m6973(interfaceC24928);
        AbstractC23655 abstractC23655M50193 = this.f79780.m50193(interfaceC24928);
        if (abstractC23655M50193 == null) {
            return null;
        }
        return abstractC23655M50193.mo11524();
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable mo6993(InterfaceC24928 interfaceC24928) {
        m6974(interfaceC24928);
        AbstractC23655 abstractC23655M50193 = this.f79780.m50193(interfaceC24928);
        if (abstractC23655M50193 == null) {
            return null;
        }
        return abstractC23655M50193.mo4673();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m6971(InterfaceC24928 interfaceC24928) {
        C17359.requireNonNull(interfaceC24928);
        if (interfaceC24928.mo11525()) {
            return;
        }
        throw new IllegalArgumentException("location is not an output location: " + interfaceC24928.getName());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m6974(InterfaceC24928 interfaceC24928) {
        C17359.requireNonNull(interfaceC24928);
        if (interfaceC24928.mo11523() || interfaceC24928.mo11525()) {
            return;
        }
        throw new IllegalArgumentException("location is not an output location or a module-oriented location: " + interfaceC24928.getName());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m6973(InterfaceC24928 interfaceC24928) {
        C17359.requireNonNull(interfaceC24928);
        if (interfaceC24928.mo11523()) {
            throw new IllegalArgumentException("location is module-oriented: " + interfaceC24928.getName());
        }
    }

    @Override // l.AbstractC24643
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6987(EnumC7687 enumC7687, String str) {
        if (AbstractC24643.f79773.contains(enumC7687)) {
            this.f6748.clear();
            this.f6746.clear();
        }
        return super.mo6987(enumC7687, str);
    }
}
