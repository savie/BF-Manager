package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.c;
import com.umeng.analytics.pro.bo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes3.dex */
public final class C6094 extends C21011 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f20611 = {0, 35, 37, 38, 39, 40, 41};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f20612 = C22253.m49425().getDigestLength();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f20613;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f20614;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f20615;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map f20616;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20617;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C9186 f20618;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C9186 f20619;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final HashMap f20620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20621;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20622;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13626 f20623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20624;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9186 f20625;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f20626;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f20627;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Set f20628;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Bundle f20629;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19169 f20630;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f20631;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f20632;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Map f20633;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f20634;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16507(C6094 c6094, String str, C7807 c7807) {
        c6094.getClass();
        c6094.m16519(str, c7807.getType());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16534(String str, String str2, String str3) {
        if (this.f20614.containsKey(str2)) {
            throw new C8142("Class exists: " + str2.replace('/', '.'));
        }
        String strM48325 = AbstractC21616.m48325(str3);
        if (strM48325 == null) {
            throw new IOException("Parse class type failed.");
        }
        m16519(str2, strM48325);
        C2565 c2565 = new C2565(str2);
        c2565.f10122 = str;
        C13626 c13626 = new C13626(new C13626(this.f20623, "smali"), c2565.f10122);
        c2565.f10121 = C13626.m33317(c13626, C22851.m50582(c13626.m33318(), str2.concat(".smali")));
        c2565.f10121.m33322(str3.getBytes(Charset.defaultCharset()));
        this.f20614.put(str2, c2565);
        if (this.f20622) {
            this.f20628.add(str2);
            this.f20619.mo23641(C0561.unmodifiableSet(this.f20628));
        }
        this.f20632 = 0L;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C6094 m16518(C13626 c13626) {
        return new C6094(c13626);
    }

    public C6094(C13626 c13626) throws IOException {
        Set set;
        super(c13626);
        this.f20624 = new ArrayList();
        this.f20617 = new ArrayList();
        this.f20614 = new HashMap();
        this.f20631 = new HashMap();
        this.f20626 = new HashMap();
        this.f20633 = C0561.synchronizedMap(new C21445());
        this.f20616 = C0561.synchronizedMap(new C21445());
        this.f20620 = new HashMap();
        this.f20615 = new HashMap();
        this.f20613 = new ConcurrentMapC13783();
        this.f20634 = new ConcurrentMapC13783();
        this.f20621 = new ArrayList();
        this.f20628 = Collections.EMPTY_SET;
        this.f20622 = true;
        this.f20625 = new C9186();
        this.f20618 = new C9186();
        this.f20619 = new C9186();
        C13626 c13627 = new C13626(c13626, "dex");
        this.f20623 = c13627;
        C6171.m17176(c13627.m33326());
        this.f20630 = new C19169(this);
        C13626 c13626M16568 = m16568();
        C13626[] c13626ArrM33325 = c13626M16568.m33325();
        if (c13626ArrM33325 == null) {
            throw new IOException("List files fail in: " + c13626M16568.m33319());
        }
        HashSet hashSet = new HashSet();
        C13626 c13628 = new C13626(m16575(), "exclude_dex");
        if (c13628.m33326()) {
            for (String str : c13628.m33318().m46730().split("\n")) {
                if (!str.isEmpty()) {
                    hashSet.add(str);
                }
            }
        }
        AbstractC20745 abstractC20745M33320 = m16575().m33320("removed");
        if (abstractC20745M33320.mo33975()) {
            BufferedReader bufferedReaderM46734 = abstractC20745M33320.m46734();
            try {
                HashSet hashSet2 = new HashSet();
                while (true) {
                    String line = bufferedReaderM46734.readLine();
                    if (line == null) {
                        break;
                    } else {
                        hashSet2.add(line);
                    }
                }
                bufferedReaderM46734.close();
                set = hashSet2;
            } catch (Throwable th) {
                try {
                    bufferedReaderM46734.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            set = Collections.EMPTY_SET;
        }
        for (C13626 c13629 : c13626ArrM33325) {
            if (c13629.m33318().mo33971() && c13629.getName().endsWith("_list")) {
                String strM46498 = C20630.m46498(5, 0, c13629.getName());
                this.f20624.add(strM46498);
                if (!hashSet.contains(strM46498)) {
                    this.f20617.add(strM46498);
                    C13626 c136210 = new C13626(c13626M16568, strM46498);
                    C17367 c17367 = new C17367(c13629.m33327());
                    while (c17367.available() > 0) {
                        C2565 c2565 = new C2565(c17367.m40442());
                        c2565.f10122 = strM46498;
                        c2565.f10123 = c136210;
                        int i = c17367.readInt();
                        c2565.f10120 = i;
                        if ((Integer.MIN_VALUE & i) != 0) {
                            c2565.f10120 = i & Integer.MAX_VALUE;
                            c2565.f10119 = c17367.readInt();
                        } else {
                            c2565.f10119 = 0;
                        }
                        String str2 = c2565.f10124;
                        if (set.contains(str2)) {
                            this.f20631.put(str2, c2565);
                        } else {
                            this.f20614.put(str2, c2565);
                        }
                    }
                }
            }
        }
        C18794.m43355(this.f20617);
        C18794.m43355(this.f20624);
        m16525();
        ArrayList arrayList = this.f20621;
        AbstractC20745 abstractC20745M33321 = m16575().m33320("recent");
        if (abstractC20745M33321.mo33975()) {
            arrayList.clear();
            BufferedReader bufferedReaderM46735 = abstractC20745M33321.m46734();
            while (true) {
                try {
                    String line2 = bufferedReaderM46735.readLine();
                    if (line2 == null) {
                        break;
                    } else if (!line2.isEmpty()) {
                        arrayList.add(line2);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReaderM46735.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            bufferedReaderM46735.close();
            m16520();
        }
        C13626 c136211 = new C13626(m16575(), "map");
        if (c136211.m33326()) {
            C17367 c17368 = new C17367(c136211.m33327());
            while (c17368.available() > 0) {
                this.f20620.put(c17368.m40442(), c17368.m40442());
            }
        }
        C13626 c136212 = new C13626(m16575(), "rename_map");
        if (c136212.m33326()) {
            C17367 c17369 = new C17367(c136212.m33327());
            while (c17369.available() > 0) {
                this.f20626.put(c17369.m40442(), c17369.m40442());
            }
        }
        C13626 c136213 = new C13626(m16575(), "dex_name_map");
        if (c136213.m33326()) {
            C17367 c173610 = new C17367(c136213.m33327());
            while (c173610.available() > 0) {
                this.f20615.put(c173610.m40442(), c173610.m40442());
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13626 m16568() {
        return new C13626(this.f20623, e.m);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13626 m16575() {
        return new C13626(this.f20623, "config");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m16569() {
        return C0561.unmodifiableList(this.f20617);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List m16530() {
        return C0561.unmodifiableList(this.f20624);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16536(ArrayList arrayList) throws C8142 {
        if (arrayList.containsAll(this.f20624)) {
            throw new C8142(R.string.MT_Protector);
        }
        C13626 c13626 = new C13626(m16575(), "exclude_dex");
        c13626.m33324();
        c13626.m33322(C6851.m18459((Collection) arrayList, '\n').getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16548(boolean z) {
        this.f20622 = z;
        if (z) {
            m16525();
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m16556() {
        return this.f20624.size() > 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16532(String str) {
        if (this.f20614.containsKey(str)) {
            ArrayList arrayList = this.f20621;
            if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
                arrayList.remove(str);
                arrayList.add(0, str);
                while (arrayList.size() > 30) {
                    C19028.m43762(arrayList, 1);
                }
                m16517();
                m16520();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16563(String str) {
        return this.f20614.containsKey(str);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Collection m16565() {
        return this.f20614.values();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList m16560(String str) {
        Set<String> setKeySet = this.f20614.keySet();
        ArrayList<String> arrayList = new ArrayList();
        String strConcat = str.concat("$");
        for (String str2 : setKeySet) {
            if (str2.startsWith(strConcat)) {
                arrayList.add(str2);
            }
        }
        Collections.sort(arrayList);
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Object obj = null;
        for (String str3 : arrayList) {
            if (!str3.equals(obj)) {
                arrayList2.add(str3);
                obj = str3;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8255 m16574(String str) {
        C7474 c7474M19963;
        int i = m16571().getInt("opt_dex_version");
        if (i <= 0 || i >= 7) {
            try {
                c7474M19963 = m16576(str).f18614;
            } catch (IOException unused) {
                c7474M19963 = C7474.m19963(15);
            }
        } else {
            c7474M19963 = C7474.m19961(f20611[i]);
        }
        final int i2 = c7474M19963.f24881;
        return (C8255) C2492.compute(this.f20634, str, new BiFunction() { // from class: l.᩷ܰۜ
            public /* synthetic */ BiFunction andThen(Function function) {
                return C5689.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C8255 c8255 = (C8255) obj2;
                int i3 = i2;
                if (c8255 != null && c8255.f28708 == i3) {
                    return c8255;
                }
                C8255 c8256 = new C8255();
                c8256.f28708 = i3;
                return c8256;
            }
        });
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5388 m16576(String str) throws IOException {
        C17684 c17684;
        Map map = this.f20616;
        C5388 c5388 = (C5388) map.get(str);
        if (c5388 != null) {
            return c5388;
        }
        Reference reference = (Reference) this.f20633.get(str);
        if (reference != null && (c17684 = (C17684) reference.get()) != null) {
            c5388 = new C5388(c17684.mo34147(), c17684.m41201());
        }
        if (c5388 == null) {
            C1388 c1388M46710 = new C13626(m16568(), str).m33318().m46710("r");
            try {
                c1388M46710.seek(4L);
                C7474 c7474M19961 = C7474.m19961((c1388M46710.read() - 48) + ((c1388M46710.read() - 48) * 10) + ((c1388M46710.read() - 48) * 100));
                c1388M46710.seek(96L);
                C5388 c5389 = new C5388(c7474M19961, c1388M46710.mo4872());
                c1388M46710.close();
                c5388 = c5389;
            } catch (Throwable th) {
                try {
                    c1388M46710.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        map.put(str, c5388);
        return c5388;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17684 m16550(String str) {
        C17684 c17684;
        C17684 c17685;
        Reference reference = (Reference) this.f20633.get(str);
        if (reference != null && (c17685 = (C17684) reference.get()) != null) {
            return c17685;
        }
        synchronized (this.f20633) {
            Reference reference2 = (Reference) this.f20633.get(str);
            if (reference2 != null && (c17684 = (C17684) reference2.get()) != null) {
                return c17684;
            }
            System.out.println("Read DexFile from file: " + str);
            InputStream inputStreamM33328 = new C13626(m16568(), str).m33328();
            try {
                C17684 c17684M41160 = C17684.m41160(inputStreamM33328);
                this.f20633.put(str, new SoftReference(c17684M41160));
                inputStreamM33328.close();
                return c17684M41160;
            } catch (Throwable th) {
                if (inputStreamM33328 != null) {
                    try {
                        inputStreamM33328.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20424 m16558(final String str) {
        return (C20424) C2492.computeIfAbsent(this.f20613, str, new Function() { // from class: l.ܺܰۜ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C7474 c7474M19963;
                try {
                    c7474M19963 = this.f51739.m16576(str).f18614;
                } catch (IOException unused) {
                    c7474M19963 = C7474.m19963(15);
                }
                C20424 c20424 = new C20424();
                c20424.f66198 = c7474M19963.f24881;
                return c20424;
            }
        });
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m16526(String str) {
        C2565 c2565 = (C2565) this.f20614.get(str);
        C13638.requireNonNull(c2565);
        return c2565.f10122;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5693 m16579() {
        C22627 c22627M50152 = C22627.m50152(this.f20614.keySet());
        c22627M50152.m50156(1);
        return c22627M50152.m50155();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m16525() {
        if (!this.f20622) {
            throw new IllegalStateException();
        }
        HashMap map = this.f20614;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C2565) it.next()).f10121 = null;
        }
        C13626 c13626 = new C13626(this.f20623, "smali");
        for (String str : this.f20617) {
            C13626 c13627 = new C13626(c13626, str);
            if (c13627.m33326()) {
                m16510(c13627, "", str);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C2565 c2565 = (C2565) ((Map.Entry) it2.next()).getValue();
            if (c2565.f10121 != null) {
                hashSet.add(c2565.f10124);
            } else if (c2565.f10123 == null) {
                it2.remove();
            }
        }
        C9186 c9186 = this.f20619;
        Set set = (Set) c9186.m44956();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f20628 = hashSet;
        c9186.mo23641(C0561.unmodifiableSet(hashSet));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16510(C13626 c13626, String str, String str2) {
        C13626[] c13626ArrM33325 = c13626.m33325();
        if (c13626ArrM33325 == null) {
            return;
        }
        for (C13626 c13627 : c13626ArrM33325) {
            if (c13627.m33318().mo33974()) {
                m16510(c13627, C1679.m5594(str, C22851.m50578(c13627.getName()), "/"), str2);
            } else {
                String strM50590 = C22851.m50590(c13627.getName());
                if (strM50590.endsWith(".smali")) {
                    StringBuilder sbM23356 = C9023.m23356(str);
                    sbM23356.append(strM50590.substring(0, strM50590.length() - 6));
                    String string = sbM23356.toString();
                    HashMap map = this.f20614;
                    C2565 c2565 = (C2565) map.get(string);
                    if (c2565 == null) {
                        c2565 = new C2565(string);
                        map.put(string, c2565);
                    }
                    c2565.f10122 = str2;
                    c2565.f10121 = c13627;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList m16559() {
        HashMap map = this.f20614;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(new C17383(this, (C2565) it.next()));
        }
        Collections.sort(arrayList, new C16678());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16539(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Predicate predicate) {
        m16542(new C22862(concurrentLinkedQueue), str, z, predicate);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16542(final InterfaceC3002 interfaceC3002, final String str, final boolean z, final Predicate predicate) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        boolean zIsEmpty = str.isEmpty();
        HashMap map = this.f20614;
        if (zIsEmpty && predicate == null && z) {
            C9030.stream(map.values()).sorted(C2565.f10117).map(new Function() { // from class: l.۫ܰۜ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C17383(this.f41506, (C2565) obj);
                }
            }).forEach(new Consumer() { // from class: l.᩵ܰۜ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    interfaceC3002.mo8963((C17383) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
        } else {
            C9030.stream(map.values()).filter(new Predicate() { // from class: l.ۡܰۜ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return C8512.$default$and(this, predicate2);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return C8512.$default$or(this, predicate2);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str2 = ((C2565) obj).f10124;
                    Predicate predicate2 = predicate;
                    if (predicate2 != null && !predicate2.test(str2)) {
                        return false;
                    }
                    String str3 = str;
                    if (str2.startsWith(str3)) {
                        return z || str2.indexOf(47, str3.length()) == -1;
                    }
                    return false;
                }
            }).sorted(C2565.f10117).map(new Function() { // from class: l.ۤܰۜ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C17383(this.f35426, (C2565) obj);
                }
            }).forEach(new Consumer() { // from class: l.᩵ܰۜ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    interfaceC3002.mo8963((C17383) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13626 m16521(C13626 c13626) {
        return new C13626(m47184(), C0252.m1693("dexBuild", c13626.m33319().substring(new C13626(this.f20623, "smali").m33319().length()) + ".bin"));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C13626 m16524(String str) {
        return new C13626(m47184(), C16523.m38890("dexBuild/", str, ".dex"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m16506(String str, C13626 c13626, C13626 c13627) throws IOException {
        byte[] bArrM33327 = c13626.m33327();
        C8255 c8255M16574 = m16574(str);
        int i = c8255M16574.f28708;
        MessageDigest messageDigestM49425 = C22253.m49425();
        messageDigestM49425.update((byte) 1);
        messageDigestM49425.update((byte) (i >>> 8));
        messageDigestM49425.update((byte) i);
        byte[] bArrDigest = messageDigestM49425.digest(bArrM33327);
        if (m16515(bArrDigest, c13627)) {
            return;
        }
        C8485 c8485M21646 = c8255M16574.m21646();
        C6843.m18449(new String(bArrM33327, StandardCharsets.UTF_8), c8485M21646, c8255M16574);
        C16246 c16246 = new C16246();
        c8485M21646.m37936(c16246);
        c13627.m33324();
        OutputStream outputStreamMo33976 = c13627.m33318().mo33976(false);
        try {
            outputStreamMo33976.write(bArrDigest);
            outputStreamMo33976.write(c16246.m38373(), 0, c16246.m38372());
            outputStreamMo33976.close();
        } catch (Throwable th) {
            if (outputStreamMo33976 != null) {
                try {
                    outputStreamMo33976.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16515(byte[] bArr, C13626 c13626) {
        if (c13626.m33326()) {
            try {
                InputStream inputStreamM33328 = c13626.m33328();
                try {
                    for (int i : bArr) {
                        if (inputStreamM33328.read() != (i & 255)) {
                            inputStreamM33328.close();
                            return false;
                        }
                    }
                    if (inputStreamM33328 != null) {
                        inputStreamM33328.close();
                    }
                    return true;
                } catch (Throwable th) {
                    if (inputStreamM33328 != null) {
                        try {
                            inputStreamM33328.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7807 m16503(C13626 c13626) {
        return (C7807) ((AbstractC18494) new C17684(c13626.m33327(), f20612, true).mo34148()).iterator().next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m16522() throws IOException {
        boolean z;
        Object[] objArr;
        boolean zM16515;
        C6094 c6094 = this;
        C2565[] c2565Arr = (C2565[]) c6094.f20614.values().toArray(new C2565[0]);
        for (C2565 c2565 : c2565Arr) {
            C13626 c13626 = c2565.f10121;
            if (c13626 != null) {
                C13626 c13626M16521 = c6094.m16521(c13626);
                String str = c2565.f10122;
                if (c13626M16521.m33326()) {
                    byte[] bArrM33327 = c13626.m33327();
                    int i = c6094.m16574(str).f28708;
                    MessageDigest messageDigestM49425 = C22253.m49425();
                    messageDigestM49425.update((byte) 1);
                    messageDigestM49425.update((byte) (i >>> 8));
                    messageDigestM49425.update((byte) i);
                    zM16515 = m16515(messageDigestM49425.digest(bArrM33327), c13626M16521);
                } else {
                    zM16515 = false;
                }
                if (!zM16515) {
                    return true;
                }
            }
        }
        Bundle bundleM16571 = m16571();
        int i2 = bundleM16571.getInt("opt_dex_version");
        boolean z2 = bundleM16571.getBoolean("opt_rm_source");
        boolean z3 = bundleM16571.getBoolean("opt_rm_line");
        boolean z4 = bundleM16571.getBoolean("opt_rm_param");
        boolean z5 = bundleM16571.getBoolean("opt_rm_prologue");
        boolean z6 = bundleM16571.getBoolean("opt_rm_local");
        boolean z7 = bundleM16571.getBoolean("opt_rm_api_mod");
        boolean z8 = i2 == 0 && !(z2 || z3 || z4 || z5 || z6 || z7);
        ArrayList arrayList = new ArrayList();
        ArrayList<C2565> arrayList2 = new ArrayList();
        MessageDigest messageDigestM49421 = C22253.m49421();
        Iterator it = c6094.f20617.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            arrayList.clear();
            arrayList2.clear();
            int length = c2565Arr.length;
            Iterator it2 = it;
            int i3 = 0;
            while (i3 < length) {
                int i4 = length;
                C2565 c2566 = c2565Arr[i3];
                C2565[] c2565Arr2 = c2565Arr;
                if (c2566.f10122.equals(str2)) {
                    if (c2566.f10121 != null) {
                        arrayList2.add(c2566);
                    } else {
                        if (c2566.f10123 == null) {
                            throw new IOException("Bad class item: " + c2566.f10124.replace('/', '.'));
                        }
                        arrayList.add(c2566);
                    }
                }
                i3++;
                length = i4;
                c2565Arr = c2565Arr2;
            }
            C2565[] c2565Arr3 = c2565Arr;
            C13626 c13626M16524 = c6094.m16524(str2);
            boolean z9 = z7;
            boolean z10 = z6;
            C13626 c13627 = new C13626(m47184(), C16523.m38890("dexBuild/", str2, ".digest"));
            if (z8 && arrayList2.isEmpty() && c6094.m16576(str2).f18613 == arrayList.size()) {
                objArr = z9 ? 1 : 0;
                z = z10 ? 1 : 0;
            } else {
                if (!c13626M16524.m33326() || !c13627.m33326()) {
                    return true;
                }
                Comparator comparator = C2565.f10118;
                Collections.sort(arrayList, comparator);
                Collections.sort(arrayList2, comparator);
                messageDigestM49421.reset();
                messageDigestM49421.update((byte) i2);
                messageDigestM49421.update(z2 ? (byte) 1 : (byte) 0);
                messageDigestM49421.update(z3 ? (byte) 1 : (byte) 0);
                messageDigestM49421.update(z4 ? (byte) 1 : (byte) 0);
                messageDigestM49421.update(z5 ? (byte) 1 : (byte) 0);
                z = z10 ? 1 : 0;
                messageDigestM49421.update(z ? (byte) 1 : (byte) 0);
                objArr = z9 ? 1 : 0;
                messageDigestM49421.update(objArr == true ? (byte) 1 : (byte) 0);
                messageDigestM49421.update((byte) -127);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C22253.m49418(messageDigestM49421, ((C2565) it3.next()).f10124);
                }
                messageDigestM49421.update(bo.h);
                for (C2565 c2567 : arrayList2) {
                    C22253.m49418(messageDigestM49421, c2567.f10124);
                    C22253.m49417(messageDigestM49421, c2567.f10121.m33328());
                }
                messageDigestM49421.update((byte) -125);
                if (!m16514(c13626M16524, c13627, messageDigestM49421.digest())) {
                    return true;
                }
            }
            c6094 = this;
            it = it2;
            c2565Arr = c2565Arr3;
            Object[] objArr2 = objArr;
            z6 = z;
            z7 = objArr2 == true ? 1 : 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16544(InterfaceC13856 interfaceC13856) throws C4682, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        C7474 c7474M19963;
        boolean z4;
        ArrayList arrayList;
        C16246 c16246;
        InterfaceC13856 interfaceC13857 = interfaceC13856;
        ArrayList<C2565> arrayList2 = new ArrayList();
        ArrayList<C2565> arrayList3 = new ArrayList();
        C16246 c16247 = new C16246();
        C2565[] c2565Arr = (C2565[]) this.f20614.values().toArray(new C2565[0]);
        for (C2565 c2565 : c2565Arr) {
            C13626 c13626 = c2565.f10121;
            String str = c2565.f10124;
            if (c13626 != null) {
                interfaceC13857.mo33695(str);
                try {
                    m16506(c2565.f10122, c13626, m16521(c13626));
                } catch (C22085 e) {
                    throw new C4682(str, e);
                }
            }
        }
        Bundle bundleM16571 = m16571();
        int i = bundleM16571.getInt("opt_dex_version");
        boolean z5 = bundleM16571.getBoolean("opt_rm_source");
        boolean z6 = bundleM16571.getBoolean("opt_rm_line");
        boolean z7 = bundleM16571.getBoolean("opt_rm_param");
        boolean z8 = bundleM16571.getBoolean("opt_rm_prologue");
        boolean z9 = bundleM16571.getBoolean("opt_rm_local");
        boolean z10 = bundleM16571.getBoolean("opt_rm_api_mod");
        boolean z11 = i == 0 && !(z5 || z6 || z7 || z8 || z9 || z10);
        MessageDigest messageDigestM49421 = C22253.m49421();
        ArrayList arrayList4 = this.f20617;
        boolean z12 = z10;
        int size = arrayList4.size();
        boolean z13 = z9;
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList5 = arrayList4;
            String str2 = (String) arrayList4.get(i2);
            boolean z14 = z8;
            int i3 = i2 + 1;
            interfaceC13857.mo33694(i3, size, m16529(str2));
            arrayList2.clear();
            arrayList3.clear();
            c16247.m38375();
            int length = c2565Arr.length;
            int i4 = size;
            int i5 = 0;
            while (i5 < length) {
                int i6 = length;
                C2565 c2566 = c2565Arr[i5];
                C2565[] c2565Arr2 = c2565Arr;
                if (c2566.f10122.equals(str2)) {
                    if (c2566.f10121 != null) {
                        arrayList3.add(c2566);
                    } else {
                        if (c2566.f10123 == null) {
                            throw new IOException("Bad class item: " + c2566.f10124.replace('/', '.'));
                        }
                        arrayList2.add(c2566);
                    }
                }
                i5++;
                length = i6;
                c2565Arr = c2565Arr2;
            }
            C2565[] c2565Arr3 = c2565Arr;
            C13626 c13626M16524 = m16524(str2);
            C16246 c16248 = c16247;
            C13626 c13627 = new C13626(m47184(), C16523.m38890("dexBuild/", str2, ".digest"));
            if (z11 && arrayList3.isEmpty() && m16576(str2).f18613 == arrayList2.size()) {
                c13626M16524.m33323();
                c13627.m33323();
                arrayList = arrayList2;
                z4 = z12;
                z = z14 ? 1 : 0;
                z2 = z13;
                c16246 = c16248;
                z3 = z11;
            } else {
                if (interfaceC13856.mo2357()) {
                    return;
                }
                Comparator comparator = C2565.f10118;
                Collections.sort(arrayList2, comparator);
                Collections.sort(arrayList3, comparator);
                messageDigestM49421.reset();
                messageDigestM49421.update((byte) i);
                messageDigestM49421.update(z5 ? (byte) 1 : (byte) 0);
                messageDigestM49421.update(z6 ? (byte) 1 : (byte) 0);
                messageDigestM49421.update(z7 ? (byte) 1 : (byte) 0);
                z = z14 ? 1 : 0;
                messageDigestM49421.update(z ? (byte) 1 : (byte) 0);
                z2 = z13;
                messageDigestM49421.update(z2 ? (byte) 1 : (byte) 0);
                boolean z15 = z12;
                z3 = z11;
                messageDigestM49421.update(z15 ? (byte) 1 : (byte) 0);
                messageDigestM49421.update((byte) -127);
                for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                    C22253.m49418(messageDigestM49421, ((C2565) it.next()).f10124);
                }
                messageDigestM49421.update(bo.h);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    C2565 c2567 = (C2565) it2.next();
                    C22253.m49418(messageDigestM49421, c2567.f10124);
                    C22253.m49417(messageDigestM49421, c2567.f10121.m33328());
                    z15 = z15 ? 1 : 0;
                    it2 = it3;
                }
                boolean z16 = z15;
                messageDigestM49421.update((byte) -125);
                byte[] bArrDigest = messageDigestM49421.digest();
                if (m16514(c13626M16524, c13627, bArrDigest)) {
                    arrayList = arrayList2;
                    z4 = z16 ? 1 : 0;
                    c16246 = c16248;
                } else {
                    if (interfaceC13856.mo2357()) {
                        return;
                    }
                    C8516 c8516 = new C8516(arrayList3.size() + arrayList2.size());
                    c8516.m22241(new C20206(0, interfaceC13857));
                    if (i <= 0 || i >= 7) {
                        try {
                            c7474M19963 = m16576(str2).f18614;
                        } catch (IOException unused) {
                            c7474M19963 = C7474.m19963(15);
                        }
                    } else {
                        c7474M19963 = C7474.m19961(f20611[i]);
                    }
                    C8485 c8485 = new C8485(c7474M19963);
                    c8485.f29407 = z6;
                    c8485.f29410 = z2;
                    c8485.f29408 = z7;
                    c8485.f29409 = z;
                    c8485.f29406 = z5;
                    z4 = z16 ? 1 : 0;
                    c8485.f29411 = z4;
                    for (C2565 c2568 : arrayList2) {
                        ArrayList arrayList6 = arrayList2;
                        c8516.m22242(1);
                        try {
                            c8485.m22160((InterfaceC22762) new C17383(this, c2568).mo23999());
                            if (interfaceC13856.mo2357()) {
                                return;
                            } else {
                                arrayList2 = arrayList6;
                            }
                        } catch (C22085 e2) {
                            throw new C4682(c2568.f10124, e2);
                        }
                    }
                    arrayList = arrayList2;
                    for (C2565 c2569 : arrayList3) {
                        c8516.m22242(1);
                        try {
                            c8485.m22160((InterfaceC22762) new C17383(this, c2569).mo23999());
                            if (interfaceC13856.mo2357()) {
                                return;
                            }
                        } catch (C22085 e3) {
                            throw new C4682(c2569.f10124, e3);
                        }
                    }
                    m16529(str2);
                    interfaceC13856.mo33693();
                    c13626M16524.m33323();
                    c13627.m33323();
                    c16246 = c16248;
                    c8485.m37936(c16246);
                    c13626M16524.m33318().m46704(c16246.m38373(), 0, c16246.m38372());
                    C11018 c11018 = new C11018();
                    c11018.writeInt(1936945938);
                    c11018.m27794(bArrDigest);
                    c11018.m27794(Arrays.copyOfRange(c16246.m38373(), 8, 32));
                    c13627.m33318().m46704(c11018.m27788(), 0, c11018.size());
                }
            }
            z13 = z2;
            z11 = z3;
            arrayList4 = arrayList5;
            i2 = i3;
            c2565Arr = c2565Arr3;
            messageDigestM49421 = messageDigestM49421;
            arrayList2 = arrayList;
            z8 = z;
            z12 = z4;
            size = i4;
            c16247 = c16246;
            interfaceC13857 = interfaceC13856;
        }
        this.f20627 = false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m16527() throws IOException {
        C13626 c13626M47188 = m47188();
        c13626M47188.m33318().m46739();
        for (String str : this.f20617) {
            C13626 c13626M16524 = m16524(str);
            if (!c13626M16524.m33326()) {
                c13626M16524 = new C13626(m16568(), str);
            }
            AbstractC20745 abstractC20745M33320 = c13626M47188.m33320(m16529(str));
            InputStream inputStreamM33328 = c13626M16524.m33328();
            try {
                OutputStream outputStreamMo33976 = abstractC20745M33320.mo33976(false);
                try {
                    C20010.m45301(inputStreamM33328, outputStreamMo33976);
                    if (outputStreamMo33976 != null) {
                        outputStreamMo33976.close();
                    }
                    if (inputStreamM33328 != null) {
                        inputStreamM33328.close();
                    }
                } catch (Throwable th) {
                    if (outputStreamMo33976 != null) {
                        try {
                            outputStreamMo33976.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamM33328 != null) {
                    try {
                        inputStreamM33328.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16547(AbstractC20745 abstractC20745, boolean z) throws IOException {
        abstractC20745.mo33987();
        for (String str : this.f20617) {
            C13626 c13626M16524 = m16524(str);
            if (c13626M16524.m33326()) {
                AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(m16529(str));
                if (z) {
                    abstractC20745M46690.m46687();
                }
                try {
                    InputStream inputStreamM33328 = c13626M16524.m33328();
                    try {
                        OutputStream outputStreamMo33976 = abstractC20745M46690.mo33976(false);
                        try {
                            C20010.m45301(inputStreamM33328, outputStreamMo33976);
                            if (outputStreamMo33976 != null) {
                                outputStreamMo33976.close();
                            }
                            if (inputStreamM33328 != null) {
                                inputStreamM33328.close();
                            }
                        } catch (Throwable th) {
                            if (outputStreamMo33976 != null) {
                                try {
                                    outputStreamMo33976.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStreamM33328 != null) {
                            try {
                                inputStreamM33328.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    if (z) {
                        abstractC20745M46690.m46722();
                    }
                    throw e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16514(C13626 c13626, C13626 c13627, byte[] bArr) {
        if (c13626.m33326() && c13627.m33326()) {
            try {
                C17367 c17367 = new C17367(c13627.m33327());
                C20190.m45649((InterfaceC0433) c17367, 1936945938);
                if (Arrays.equals(c17367.m40451(), bArr)) {
                    DataInputStream dataInputStream = new DataInputStream(c13626.m33328());
                    byte[] bArr2 = new byte[24];
                    dataInputStream.readFully(bArr2, 0, 8);
                    dataInputStream.readFully(bArr2, 0, 24);
                    return Arrays.equals(c17367.m40451(), bArr2);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16513(InterfaceC23333 interfaceC23333, C8516 c8516, InterfaceC9354 interfaceC9354, Set set) {
        if (interfaceC23333.mo2357()) {
            return;
        }
        c8516.m22242(1);
        C7807 c7807Mo24002 = interfaceC9354.mo24002();
        try {
            for (InterfaceC3710 interfaceC3710 : c7807Mo24002.getAnnotations()) {
                String type = interfaceC3710.getType();
                type.getClass();
                boolean z = false;
                switch (type) {
                    case "Ldalvik/annotation/InnerClass;":
                    case "Ldalvik/annotation/MemberClasses;":
                    case "Ldalvik/annotation/Signature;":
                        break;
                    default:
                        z = true;
                        break;
                }
                if (z) {
                    Iterator it = interfaceC3710.getElements().iterator();
                    while (it.hasNext()) {
                        m16509(((InterfaceC6533) it.next()).getValue(), set);
                    }
                }
            }
            Iterator it2 = c7807Mo24002.getFields().iterator();
            while (it2.hasNext()) {
                m16511((InterfaceC17822) it2.next(), set);
            }
            Iterator it3 = c7807Mo24002.getMethods().iterator();
            while (it3.hasNext()) {
                m16512((InterfaceC18528) it3.next(), set);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16509(InterfaceC10975 interfaceC10975, Set set) {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 == 23) {
            set.add(((InterfaceC5060) interfaceC10975).getValue());
            return;
        }
        if (iMo2656 == 28) {
            Iterator it = ((InterfaceC0390) interfaceC10975).getValue().iterator();
            while (it.hasNext()) {
                m16509((InterfaceC10975) it.next(), set);
            }
        } else {
            if (iMo2656 != 29) {
                return;
            }
            Iterator it2 = ((InterfaceC20147) interfaceC10975).getElements().iterator();
            while (it2.hasNext()) {
                m16509(((InterfaceC6533) it2.next()).getValue(), set);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16511(InterfaceC17822 interfaceC17822, Set set) {
        for (InterfaceC3710 interfaceC3710 : interfaceC17822.getAnnotations()) {
            String type = interfaceC3710.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC3710.getElements().iterator();
                    while (it.hasNext()) {
                        m16509(((InterfaceC6533) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC10975 interfaceC10975Mo28399 = interfaceC17822.mo28399();
        if (interfaceC10975Mo28399 != null) {
            m16509(interfaceC10975Mo28399, set);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16512(InterfaceC18528 interfaceC18528, Set set) {
        for (InterfaceC3710 interfaceC3710 : interfaceC18528.getAnnotations()) {
            String type = interfaceC3710.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC3710.getElements().iterator();
                    while (it.hasNext()) {
                        m16509(((InterfaceC6533) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC7945 interfaceC7945Mo25747 = interfaceC18528.mo25747();
        if (interfaceC7945Mo25747 != null) {
            for (InterfaceC1594 interfaceC1594 : interfaceC7945Mo25747.mo11508()) {
                EnumC18057 enumC18057 = interfaceC1594.mo5435().f35328;
                if (enumC18057 == EnumC18057.Format21c || enumC18057 == EnumC18057.Format31c) {
                    if (interfaceC1594.mo5435().f35329 == 0) {
                        set.add(((InterfaceC20852) ((InterfaceC13859) interfaceC1594).getReference()).getString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m16516() {
        C13626 c13626 = new C13626(m16575(), "rename_map");
        C11018 c11018 = new C11018();
        for (Map.Entry entry : this.f20626.entrySet()) {
            c11018.m27782((CharSequence) entry.getKey());
            c11018.m27782((CharSequence) entry.getValue());
        }
        c13626.m33318().m46697(c11018);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16538(HashMap map) throws IOException {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            HashMap map3 = this.f20614;
            if (map3.containsKey(str2)) {
                throw new IOException("Class exists: " + str2.replace('/', '.'));
            }
            C2565 c2565 = (C2565) map3.get(str);
            if (c2565 == null) {
                throw new IOException("Class not found: " + str.replace('/', '.'));
            }
            map2.put(c2565, str2);
        }
        if (map2.isEmpty()) {
            return;
        }
        int i = 0;
        this.f20622 = false;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : map2.entrySet()) {
            C2565 c2566 = (C2565) entry2.getKey();
            String strM16531 = m16531(c2566);
            String str3 = c2566.f10124;
            String str4 = (String) entry2.getValue();
            m16534(c2566.f10122, str4, strM16531);
            hashSet.add(str3);
            HashMap map4 = this.f20626;
            map4.put(str4, (String) C9735.getOrDefault(map4, str3, str3));
        }
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f20621;
            if (i >= arrayList.size()) {
                break;
            }
            String str5 = (String) map.get(arrayList.get(i));
            if (str5 != null) {
                arrayList.set(i, str5);
                z = true;
            }
            i++;
        }
        m16537(hashSet);
        m16516();
        m16548(true);
        if (z) {
            m16517();
            m16520();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m16529(String str) {
        String str2 = (String) this.f20615.get(str);
        return str2 == null ? C15489.m37076(str, ".dex") : str2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m16519(String str, String str2) {
        String strM46498 = C20630.m46498(1, 1, str2);
        boolean zEquals = strM46498.equals(str);
        HashMap map = this.f20620;
        if (zEquals) {
            if (map.remove(strM46498) != null) {
                m16523();
            }
        } else {
            if (str.equals(map.put(strM46498, str))) {
                return;
            }
            m16523();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m16523() {
        try {
            C11018 c11018 = new C11018();
            for (Map.Entry entry : this.f20620.entrySet()) {
                c11018.m27782((CharSequence) entry.getKey());
                c11018.m27782((CharSequence) entry.getValue());
            }
            m16575().m33320("map").m46697(c11018);
        } catch (IOException e) {
            this.f20625.mo23641(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m16567(String str) {
        String str2 = (String) this.f20620.get(str);
        return str2 == null ? str : str2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map m16552() {
        Set set = this.f20628;
        HashMap map = this.f20620;
        if (map.isEmpty() && set.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap(C0833.m3428(set.size() + map.size(), 4, 3, 1));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!str2.startsWith("# TOO_LONG_NAME/")) {
                map2.put(str2, "");
            } else {
                String str3 = (String) C9735.putIfAbsent(map2, str2, str);
                if (str3 != null && !str3.equals(str)) {
                    map2.put(str2, "");
                }
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            map2.put((String) it.next(), "");
        }
        return map2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16562(ActivityC5677 activityC5677) {
        this.f20630.m43998(activityC5677);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m16557() {
        this.f20630.m43996();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m16553() {
        C19169 c19169 = this.f20630;
        c19169.m43996();
        c19169.m43995();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m16572() {
        C19169 c19169 = this.f20630;
        c19169.m44000();
        c19169.m43999();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16573() {
        this.f20630.m44001();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9354 m16528(String str) {
        C2565 c2565 = (C2565) this.f20614.get(str);
        if (c2565 == null) {
            return null;
        }
        return new C17383(this, c2565);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m16564(String str) {
        C2565 c2565 = (C2565) this.f20614.get(str);
        if (c2565 == null) {
            return -268435456;
        }
        C13626 c13626 = c2565.f10121;
        if (c13626 != null) {
            return Long.valueOf(c13626.m33318().mo33991() ^ c13626.m33318().mo33964()).hashCode();
        }
        return c2565.f10123 != null ? -536870912 : -268435456;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m16551(String str) {
        C2093 c2093;
        HashMap map = this.f20614;
        C2565 c2565 = (C2565) map.get(str);
        C19169 c19169 = this.f20630;
        if (c2565 == null) {
            if (c2565 != null) {
                return "";
            }
            return "";
        }
        HashMap map2 = this.f20626;
        if (!map2.containsKey(str)) {
            if (c2565 != null) {
                return "";
            }
            return "";
        }
        String str2 = (String) map2.get(str);
        C2565 c2566 = (C2565) this.f20631.get(str2);
        if (c2566 == null) {
            c2566 = (C2565) map.get(str2);
        }
        if (c2566 != null && c2566.f10123 != null) {
            c19169.getClass();
            c2093 = new C2093();
            c19169.m43997(c2566, c2093);
        } else {
            if (c2565 != null || c2565.f10123 == null) {
                return "";
            }
            c19169.getClass();
            c2093 = new C2093();
            c19169.m43997(c2565, c2093);
        }
        return c2093.toString();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m16578(String str) throws C8142 {
        C2565 c2565 = (C2565) this.f20614.get(str);
        if (c2565 == null) {
            throw new C8142("Class not found: " + str.replace('/', '.'));
        }
        return m16531(c2565);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16531(C2565 c2565) throws C8142 {
        C13626 c13626 = c2565.f10121;
        if (c13626 != null) {
            return c13626.m33318().m46730();
        }
        if (c2565.f10123 != null) {
            C19169 c19169 = this.f20630;
            c19169.getClass();
            C2093 c2093 = new C2093();
            c19169.m43997(c2565, c2093);
            return c2093.toString();
        }
        throw new C8142("Bad class: " + c2565.f10124.replace('/', '.'));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16535(String str, C2093 c2093) throws IOException {
        C2565 c2565 = (C2565) this.f20614.get(str);
        if (c2565 == null) {
            throw new C8142("Class not found: " + str.replace('/', '.'));
        }
        m16541(c2565, c2093);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16541(C2565 c2565, C2093 c2093) throws IOException {
        C13626 c13626 = c2565.f10121;
        if (c13626 != null) {
            AbstractC20745 abstractC20745M33318 = c13626.m33318();
            abstractC20745M33318.getClass();
            try {
                InputStream inputStreamMo33970 = abstractC20745M33318.mo33970();
                try {
                    C20010.m45302(inputStreamMo33970, c2093, Charset.defaultCharset());
                    if (inputStreamMo33970 != null) {
                        inputStreamMo33970.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (inputStreamMo33970 != null) {
                        try {
                            inputStreamMo33970.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                C6237.m17292(abstractC20745M33318, e);
                throw e;
            }
        }
        if (c2565.f10123 != null) {
            this.f20630.m43997(c2565, c2093);
        } else {
            throw new C8142("Bad class: " + c2565.f10124.replace('/', '.'));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m16561(String str, String str2) throws C8142 {
        C2565 c2565 = (C2565) this.f20614.get(str);
        if (c2565 == null) {
            throw new C8142("Class not found: " + str.replace('/', '.'));
        }
        synchronized (this) {
            C8255 c8255M16574 = m16574(c2565.f10122);
            C19213 c19213M18449 = C6843.m18449(str2, c8255M16574.m21646(), c8255M16574);
            if (c19213M18449 == null) {
                throw new IOException("Unknown error");
            }
            m16519(c2565.f10124, c19213M18449.getType());
            m16540(c2565, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16533(String str, String str2) {
        C2565 c2565 = (C2565) this.f20614.get(str);
        if (c2565 == null) {
            throw new C8142("Class not found: " + str.replace('/', '.'));
        }
        m16540(c2565, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16540(C2565 c2565, String str) {
        boolean z;
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        if (c2565.f10121 == null) {
            C13626 c13626 = new C13626(new C13626(this.f20623, "smali"), c2565.f10122);
            c2565.f10121 = C13626.m33317(c13626, C22851.m50582(c13626.m33318(), c2565.f10124 + ".smali"));
            z = true;
        } else {
            z = false;
        }
        c2565.f10121.m33322(bytes);
        if (this.f20622 && z) {
            this.f20628.add(c2565.f10124);
            this.f20619.mo23641(C0561.unmodifiableSet(this.f20628));
        }
        this.f20632 = 0L;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m16570(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C2565 c2565 : this.f20614.values()) {
            if (c2565.f10124.startsWith(str)) {
                arrayList.add(c2565.f10124);
            }
        }
        m16537((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16537(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C2565 c2565 = (C2565) this.f20614.remove(str);
            if (c2565 != null) {
                C13626 c13626 = c2565.f10121;
                if (c13626 != null) {
                    c13626.m33323();
                    if (this.f20622) {
                        this.f20628.remove(str);
                        z2 = true;
                    }
                    c2565.f10121 = null;
                }
                if (c2565.f10123 != null) {
                    this.f20631.put(str, c2565);
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f20621.contains(str)) {
                    z = true;
                }
                if (this.f20626.remove(str) != null) {
                    z3 = true;
                }
            }
        }
        int length = sb.length();
        C9186 c9186 = this.f20625;
        if (length > 0) {
            AbstractC20745 abstractC20745M33320 = m16575().m33320("removed");
            try {
                abstractC20745M33320.mo46720();
                abstractC20745M33320.m46717(sb.toString());
            } catch (Throwable th) {
                c9186.mo23641(th);
            }
        }
        if (z) {
            m16520();
        }
        if (z2) {
            this.f20619.mo23641(C0561.unmodifiableSet(this.f20628));
        }
        if (z3) {
            try {
                m16516();
            } catch (IOException e) {
                c9186.mo23641(e);
            }
        }
        this.f20632 = 0L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m16517() {
        AbstractC20745 abstractC20745M33320 = m16575().m33320("recent");
        try {
            abstractC20745M33320.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC20745M33320.mo33976(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f20621.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f20625.mo23641(th3);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m16555(String str) {
        if (this.f20621.remove(str)) {
            m16517();
            m16520();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m16577() {
        this.f20621.clear();
        m16517();
        m16520();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Bundle m16571() {
        if (this.f20629 == null) {
            this.f20629 = new Bundle();
            AbstractC20745 abstractC20745M33320 = m16575().m33320("options");
            if (abstractC20745M33320.mo33971()) {
                try {
                    byte[] bArrM46727 = abstractC20745M33320.m46727();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrM46727, 0, bArrM46727.length);
                    parcelObtain.setDataPosition(0);
                    this.f20629.readFromParcel(parcelObtain);
                    parcelObtain.recycle();
                } catch (Exception e) {
                    this.f20625.mo23641(e);
                }
            }
        }
        return this.f20629;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m16566() {
        if (this.f20629 == null) {
            return;
        }
        AbstractC20745 abstractC20745M33320 = m16575().m33320("options");
        try {
            Parcel parcelObtain = Parcel.obtain();
            this.f20629.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            abstractC20745M33320.m46703(bArrMarshall);
        } catch (IOException e) {
            this.f20625.mo23641(e);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m16520() {
        ArrayList arrayList = this.f20621;
        this.f20618.mo23641(C0561.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16543(ActivityC5677 activityC5677, C16450 c16450) {
        this.f20625.m44959(activityC5677, c16450);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16545(C15601 c15601, C4496 c4496) {
        this.f20618.m44959(c15601, c4496);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16546(C15601 c15601, C17716 c17716) {
        this.f20619.m44959(c15601, c17716);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Set m16554() {
        return C0561.unmodifiableSet(this.f20628);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16549(final ActivityC5677 activityC5677, C18377 c18377) {
        boolean z;
        boolean z2;
        int i = 0;
        if (m47186()) {
            boolean zMo33975 = m16575().m33320("strings_changed").mo33975();
            if (activityC5677.m15665()) {
                z = true;
            } else {
                if (this.f20627) {
                    z2 = true;
                } else if (SystemClock.uptimeMillis() - this.f20632 < c.a) {
                    z2 = this.f20627;
                } else {
                    try {
                        this.f20627 = m16522();
                        this.f20632 = SystemClock.uptimeMillis();
                        z2 = this.f20627;
                    } catch (Exception unused) {
                        this.f20627 = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (zMo33975) {
                int i2 = DialogInterfaceC19356.f62401;
                C8067 c8067 = new C8067(activityC5677);
                c8067.m21274(R.string.MT_Protector);
                c8067.m21253(R.string.MT_Protector);
                c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8211(i, c18377));
                if (z) {
                    c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3725(4, activityC5677));
                } else {
                    c8067.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟ܰۜ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            activityC5677.finish();
                        }
                    });
                }
                c8067.m21269();
                return true;
            }
            if (z) {
                activityC5677.m15682();
                return true;
            }
        }
        return false;
    }
}
