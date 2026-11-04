package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6H9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18865 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f61245 = C16980.m40037(C18865.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashSet f61247;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6129 f61251;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TreeSet f61250 = new TreeSet();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeSet f61248 = new TreeSet();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TreeMap f61249 = new TreeMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61246 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43763(C18865 c18865, ArrayList arrayList, String str, List list) {
        c18865.getClass();
        int i = 0;
        if (list.size() == 1) {
            arrayList.add((C2457) list.get(0));
            return;
        }
        String str2 = (String) c18865.f61249.get(str);
        if (str2 != null) {
            C1170.stream(list).filter(new C0220(i, str2)).findFirst().ifPresent(new C7678(0, arrayList));
            return;
        }
        C2457 c2457 = (C2457) list.get(0);
        arrayList.add(c2457);
        f61245.mo13725("Select providing '{}' plugin '{}', candidates: {}", str, c2457, list);
    }

    public C18865(C6129 c6129) {
        this.f61251 = c6129;
        this.f61247 = c6129.m17711();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43766(C15492 c15492) {
        c15492.getClass();
        List<InterfaceC24334> listSingletonList = Collections.singletonList(new C13467(Collections.EMPTY_MAP));
        final Set set = (Set) C1170.stream(listSingletonList).map(new C15033(6)).collect(C2025.toSet());
        C1170.removeIf(this.f61250, new Predicate() { // from class: l.ܰۚ᩵
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                ((C2457) obj).m8286();
                return set.contains("dex-input");
            }
        });
        int i = C10271.f32803;
        for (InterfaceC24334 interfaceC24334 : listSingletonList) {
            InterfaceC25186 interfaceC25186 = f61245;
            C2457 c2457 = new C2457(interfaceC24334, this.f61251);
            HashSet hashSet = this.f61247;
            c2457.m8286();
            if (!hashSet.contains("dex-input")) {
                c2457.m8280().getClass();
                interfaceC25186.mo13716(c2457, "Loading plugin: {}");
                if (!this.f61250.add(c2457)) {
                    throw new IllegalArgumentException("Duplicate plugin id: " + c2457 + ", class " + interfaceC24334.getClass());
                }
                C4937.forEach(this.f61246, new C21103(0, c2457));
            }
        }
        synchronized (this) {
            Map map = (Map) C1170.stream(this.f61250).collect(C2025.groupingBy(new C20299(7)));
            final ArrayList arrayList = new ArrayList(map.size());
            C11392.forEach(map, new BiConsumer() { // from class: l.ܿۚ᩵
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    C18865.m43763(this.f59283, arrayList, (String) obj, (List) obj2);
                }

                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C23501.$default$andThen(this, biConsumer);
                }
            });
            this.f61248.clear();
            this.f61248.addAll(arrayList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeSet m43764() {
        return this.f61248;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43767() {
        for (C2457 c2457 : this.f61248) {
            try {
                c2457.m8285();
            } catch (Exception e) {
                c2457.m8286();
                f61245.mo13710("Failed to unload plugin: {}", "dex-input", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43765(C0162 c0162) {
        final String str;
        InterfaceC13255 interfaceC13255M3839;
        C24087 c24087 = new C24087();
        c0162.m1369();
        TreeSet treeSet = this.f61248;
        Iterator it = treeSet.iterator();
        while (true) {
            str = "dex-input";
            if (!it.hasNext()) {
                break;
            }
            C2457 c2457 = (C2457) it.next();
            try {
                if (c2457.m8281() == null) {
                    c2457.m8284(c24087);
                }
                c2457.m8282(new C0966(c2457));
            } catch (Exception e) {
                c2457.m8286();
                f61245.mo13718("Failed to init plugin: {}", "dex-input", e);
            }
        }
        Iterator it2 = treeSet.iterator();
        while (it2.hasNext()) {
            C0966 c0966M8287 = ((C2457) it2.next()).m8287();
            if (c0966M8287 != null && (interfaceC13255M3839 = c0966M8287.m3839()) != null) {
                c0966M8287.m3838();
                List listM40048 = ((AbstractC16984) interfaceC13255M3839).m40048();
                if (listM40048 == null) {
                    throw new IllegalArgumentException("Null option descriptions in plugin id: dex-input");
                }
                final String str2 = "dex-input.";
                C4937.forEach(listM40048, new Consumer() { // from class: l.ۘۚ᩵
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C12312.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        InterfaceC5798 interfaceC5798 = (InterfaceC5798) obj;
                        String strName = interfaceC5798.name();
                        String str3 = str2;
                        if (strName == null || !strName.startsWith(str3)) {
                            throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m("Plugin option name should start with plugin id: '", str3, "', option: ", strName));
                        }
                        String strMo16915 = interfaceC5798.mo16915();
                        String str4 = str;
                        if (strMo16915 == null || strMo16915.isEmpty()) {
                            throw new IllegalArgumentException(C25272.m56409("Plugin option description not set, plugin: ", str4));
                        }
                        if (interfaceC5798.values() == null) {
                            throw new IllegalArgumentException(ExternalValue$$ExternalSyntheticOutline0.m("Plugin option values is null, option: ", strName, ", plugin: ", str4));
                        }
                    }
                });
            }
        }
    }
}
