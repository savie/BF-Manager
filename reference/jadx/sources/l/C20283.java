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

/* JADX INFO: renamed from: l.᩵ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes5.dex */
public final class C20283 extends C3413 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f65109;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17930 f65110;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f65111;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9378 f65112;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65113;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f65114;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65115;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f65116;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f65117;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f65118;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map f65119;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f65120;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17930 f65121;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f65122;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map f65123;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Bundle f65124;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11594 f65125;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f65126;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f65127;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f65128;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C17930 f65129;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f65130;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f65108 = {0, 35, 37, 38, 39, 40, 41};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f65107 = C15022.m36183().getDigestLength();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46558(C20283 c20283, String str, C22737 c22737) {
        c20283.getClass();
        c20283.m46565(str, c22737.getType());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46577(String str, String str2, String str3) {
        if (this.f65127.containsKey(str2)) {
            throw new C3090("Class exists: " + str2.replace('/', '.'));
        }
        String strM49367 = AbstractC21775.m49367(str3);
        if (strM49367 == null) {
            throw new IOException("Parse class type failed.");
        }
        m46565(str2, strM49367);
        C19382 c19382 = new C19382(str2);
        c19382.f62621 = str;
        C9378 c9378 = new C9378(new C9378(this.f65112, "smali"), c19382.f62621);
        c19382.f62623 = C9378.m24692(c9378, C3102.m10112(c9378.m24699(), str2.concat(".smali")));
        c19382.f62623.m24696(str3.getBytes(Charset.defaultCharset()));
        this.f65127.put(str2, c19382);
        if (this.f65114) {
            this.f65128.add(str2);
            this.f65110.mo40348(C4681.unmodifiableSet(this.f65128));
        }
        this.f65122 = 0L;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20283 m46564(C9378 c9378) {
        return new C20283(c9378);
    }

    public C20283(C9378 c9378) throws IOException {
        Set set;
        super(c9378);
        this.f65126 = new ArrayList();
        this.f65115 = new ArrayList();
        this.f65127 = new HashMap();
        this.f65111 = new HashMap();
        this.f65118 = new HashMap();
        this.f65119 = C4681.synchronizedMap(new C14307());
        this.f65123 = C4681.synchronizedMap(new C14307());
        this.f65116 = new HashMap();
        this.f65109 = new HashMap();
        this.f65117 = new ConcurrentMapC17249();
        this.f65130 = new ConcurrentMapC17249();
        this.f65113 = new ArrayList();
        this.f65128 = Collections.EMPTY_SET;
        this.f65114 = true;
        this.f65121 = new C17930();
        this.f65129 = new C17930();
        this.f65110 = new C17930();
        C9378 c9379 = new C9378(c9378, "dex");
        this.f65112 = c9379;
        C11972.m30026(c9379.m24702());
        this.f65125 = new C11594(this);
        C9378 c9378M46606 = m46606();
        C9378[] c9378ArrM24698 = c9378M46606.m24698();
        if (c9378ArrM24698 == null) {
            throw new IOException("List files fail in: " + c9378M46606.m24693());
        }
        HashSet hashSet = new HashSet();
        C9378 c93710 = new C9378(m46610(), "exclude_dex");
        if (c93710.m24702()) {
            for (String str : c93710.m24699().m49871().split("\n")) {
                if (!str.isEmpty()) {
                    hashSet.add(str);
                }
            }
        }
        AbstractC22044 abstractC22044M24694 = m46610().m24694("removed");
        if (abstractC22044M24694.mo2934()) {
            BufferedReader bufferedReaderM49863 = abstractC22044M24694.m49863();
            try {
                HashSet hashSet2 = new HashSet();
                while (true) {
                    String line = bufferedReaderM49863.readLine();
                    if (line == null) {
                        break;
                    } else {
                        hashSet2.add(line);
                    }
                }
                bufferedReaderM49863.close();
                set = hashSet2;
            } catch (Throwable th) {
                try {
                    bufferedReaderM49863.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            set = Collections.EMPTY_SET;
        }
        for (C9378 c93711 : c9378ArrM24698) {
            if (c93711.m24699().mo4304() && c93711.getName().endsWith("_list")) {
                String strM5124 = C1402.m5124(5, 0, c93711.getName());
                this.f65126.add(strM5124);
                if (!hashSet.contains(strM5124)) {
                    this.f65115.add(strM5124);
                    C9378 c93712 = new C9378(c9378M46606, strM5124);
                    C20348 c20348 = new C20348(c93711.m24700());
                    while (c20348.available() > 0) {
                        C19382 c19382 = new C19382(c20348.m46756());
                        c19382.f62621 = strM5124;
                        c19382.f62624 = c93712;
                        int i = c20348.readInt();
                        c19382.f62620 = i;
                        if ((Integer.MIN_VALUE & i) != 0) {
                            c19382.f62620 = i & Integer.MAX_VALUE;
                            c19382.f62625 = c20348.readInt();
                        } else {
                            c19382.f62625 = 0;
                        }
                        String str2 = c19382.f62622;
                        if (set.contains(str2)) {
                            this.f65111.put(str2, c19382);
                        } else {
                            this.f65127.put(str2, c19382);
                        }
                    }
                }
            }
        }
        C22521.m50746(this.f65115);
        C22521.m50746(this.f65126);
        m46611();
        ArrayList arrayList = this.f65113;
        AbstractC22044 abstractC22044M24695 = m46610().m24694("recent");
        if (abstractC22044M24695.mo2934()) {
            arrayList.clear();
            BufferedReader bufferedReaderM49864 = abstractC22044M24695.m49863();
            while (true) {
                try {
                    String line2 = bufferedReaderM49864.readLine();
                    if (line2 == null) {
                        break;
                    } else if (!line2.isEmpty()) {
                        arrayList.add(line2);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReaderM49864.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            bufferedReaderM49864.close();
            m46562();
        }
        C9378 c93713 = new C9378(m46610(), "map");
        if (c93713.m24702()) {
            C20348 c20349 = new C20348(c93713.m24700());
            while (c20349.available() > 0) {
                this.f65116.put(c20349.m46756(), c20349.m46756());
            }
        }
        C9378 c93714 = new C9378(m46610(), "rename_map");
        if (c93714.m24702()) {
            C20348 c203410 = new C20348(c93714.m24700());
            while (c203410.available() > 0) {
                this.f65118.put(c203410.m46756(), c203410.m46756());
            }
        }
        C9378 c93715 = new C9378(m46610(), "dex_name_map");
        if (c93715.m24702()) {
            C20348 c203411 = new C20348(c93715.m24700());
            while (c203411.available() > 0) {
                this.f65109.put(c203411.m46756(), c203411.m46756());
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9378 m46606() {
        return new C9378(this.f65112, e.m);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9378 m46610() {
        return new C9378(this.f65112, "config");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m46619() {
        return C4681.unmodifiableList(this.f65115);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m46570() {
        return C4681.unmodifiableList(this.f65126);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46579(ArrayList arrayList) throws C3090 {
        if (arrayList.containsAll(this.f65126)) {
            throw new C3090(R.string.MT_Protector);
        }
        C9378 c9378 = new C9378(m46610(), "exclude_dex");
        c9378.m24701();
        c9378.m24696(C24276.m54285((Collection) arrayList, '\n').getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46591(boolean z) {
        this.f65114 = z;
        if (z) {
            m46611();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m46599() {
        return this.f65126.size() > 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46575(String str) {
        if (this.f65127.containsKey(str)) {
            ArrayList arrayList = this.f65113;
            if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
                arrayList.remove(str);
                arrayList.add(0, str);
                while (arrayList.size() > 30) {
                    C2764.m9138(arrayList, 1);
                }
                m46548();
                m46562();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46617(String str) {
        return this.f65127.containsKey(str);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Collection m46608() {
        return this.f65127.values();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m46594(String str) {
        Set<String> setKeySet = this.f65127.keySet();
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7118 m46609(String str) {
        C19647 c19647M45292;
        int i = m46613().getInt("opt_dex_version");
        if (i <= 0 || i >= 7) {
            try {
                c19647M45292 = m46603(str).f33158;
            } catch (IOException unused) {
                c19647M45292 = C19647.m45292(15);
            }
        } else {
            c19647M45292 = C19647.m45293(f65108[i]);
        }
        final int i2 = c19647M45292.f63286;
        return (C7118) C23217.compute(this.f65130, str, new BiFunction() { // from class: l.᩻ۗۧ
            public /* synthetic */ BiFunction andThen(Function function) {
                return C3363.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C7118 c7118 = (C7118) obj2;
                int i3 = i2;
                if (c7118 != null && c7118.f23465 == i3) {
                    return c7118;
                }
                C7118 c7119 = new C7118();
                c7119.f23465 = i3;
                return c7119;
            }
        });
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10431 m46603(String str) {
        C24975 c24975;
        Map map = this.f65123;
        C10431 c10431 = (C10431) map.get(str);
        if (c10431 != null) {
            return c10431;
        }
        Reference reference = (Reference) this.f65119.get(str);
        if (reference != null && (c24975 = (C24975) reference.get()) != null) {
            c10431 = new C10431(c24975.mo4326(), c24975.m55804());
        }
        if (c10431 == null) {
            C13961 c13961M49855 = new C9378(m46606(), str).m24699().m49855("r");
            try {
                c13961M49855.seek(4L);
                C19647 c19647M45293 = C19647.m45293((c13961M49855.read() - 48) + ((c13961M49855.read() - 48) * 10) + ((c13961M49855.read() - 48) * 100));
                c13961M49855.seek(96L);
                C10431 c10432 = new C10431(c19647M45293, c13961M49855.mo34029());
                c13961M49855.close();
                c10431 = c10432;
            } catch (Throwable th) {
                try {
                    c13961M49855.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        map.put(str, c10431);
        return c10431;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24975 m46612(String str) {
        C24975 c24975;
        C24975 c24976;
        Reference reference = (Reference) this.f65119.get(str);
        if (reference != null && (c24976 = (C24975) reference.get()) != null) {
            return c24976;
        }
        synchronized (this.f65119) {
            Reference reference2 = (Reference) this.f65119.get(str);
            if (reference2 != null && (c24975 = (C24975) reference2.get()) != null) {
                return c24975;
            }
            System.out.println("Read DexFile from file: " + str);
            InputStream inputStreamM24703 = new C9378(m46606(), str).m24703();
            try {
                C24975 c24975M55778 = C24975.m55778(inputStreamM24703);
                this.f65119.put(str, new SoftReference(c24975M55778));
                inputStreamM24703.close();
                return c24975M55778;
            } catch (Throwable th) {
                if (inputStreamM24703 != null) {
                    try {
                        inputStreamM24703.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5564 m46596(final String str) {
        return (C5564) C23217.computeIfAbsent(this.f65117, str, new Function() { // from class: l.ܺۗۧ
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
                C19647 c19647M45292;
                try {
                    c19647M45292 = this.f53573.m46603(str).f33158;
                } catch (IOException unused) {
                    c19647M45292 = C19647.m45292(15);
                }
                C5564 c5564 = new C5564();
                c5564.f19332 = c19647M45292.f63286;
                return c5564;
            }
        });
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m46600(String str) {
        C19382 c19382 = (C19382) this.f65127.get(str);
        C17359.requireNonNull(c19382);
        return c19382.f62621;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19782 m46623() {
        C15306 c15306M36752 = C15306.m36752(this.f65127.keySet());
        c15306M36752.m36757(1);
        return c15306M36752.m36756();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m46611() {
        if (!this.f65114) {
            throw new IllegalStateException();
        }
        HashMap map = this.f65127;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C19382) it.next()).f62623 = null;
        }
        C9378 c9378 = new C9378(this.f65112, "smali");
        for (String str : this.f65115) {
            C9378 c9379 = new C9378(c9378, str);
            if (c9379.m24702()) {
                m46555(c9379, "", str);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C19382 c19382 = (C19382) ((Map.Entry) it2.next()).getValue();
            if (c19382.f62623 != null) {
                hashSet.add(c19382.f62622);
            } else if (c19382.f62624 == null) {
                it2.remove();
            }
        }
        C17930 c17930 = this.f65110;
        Set set = (Set) c17930.m40346();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f65128 = hashSet;
        c17930.mo40348(C4681.unmodifiableSet(hashSet));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46555(C9378 c9378, String str, String str2) {
        C9378[] c9378ArrM24698 = c9378.m24698();
        if (c9378ArrM24698 == null) {
            return;
        }
        for (C9378 c9379 : c9378ArrM24698) {
            if (c9379.m24699().mo4281()) {
                m46555(c9379, C20196.m46451(str, C3102.m10110(c9379.getName()), "/"), str2);
            } else {
                String strM10122 = C3102.m10122(c9379.getName());
                if (strM10122.endsWith(".smali")) {
                    StringBuilder sbM27333 = C10732.m27333(str);
                    sbM27333.append(strM10122.substring(0, strM10122.length() - 6));
                    String string = sbM27333.toString();
                    HashMap map = this.f65127;
                    C19382 c19382 = (C19382) map.get(string);
                    if (c19382 == null) {
                        c19382 = new C19382(string);
                        map.put(string, c19382);
                    }
                    c19382.f62621 = str2;
                    c19382.f62623 = c9379;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m46593() {
        HashMap map = this.f65127;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.add(new C3129(this, (C19382) it.next()));
        }
        Collections.sort(arrayList, new C15807());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46582(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Predicate predicate) {
        m46589(new C9706(concurrentLinkedQueue), str, z, predicate);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46589(final InterfaceC21620 interfaceC21620, final String str, final boolean z, final Predicate predicate) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        boolean zIsEmpty = str.isEmpty();
        HashMap map = this.f65127;
        if (zIsEmpty && predicate == null && z) {
            C1170.stream(map.values()).sorted(C19382.f62619).map(new Function() { // from class: l.᩹ۗۧ
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
                    return new C3129(this.f75412, (C19382) obj);
                }
            }).forEach(new Consumer() { // from class: l.ܳۗۧ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    interfaceC21620.mo25303((C3129) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
        } else {
            C1170.stream(map.values()).filter(new Predicate() { // from class: l.۫ۗۧ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return C19025.$default$and(this, predicate2);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return C19025.$default$or(this, predicate2);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str2 = ((C19382) obj).f62622;
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
            }).sorted(C19382.f62619).map(new Function() { // from class: l.ۚۗۧ
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
                    return new C3129(this.f18812, (C19382) obj);
                }
            }).forEach(new Consumer() { // from class: l.ܳۗۧ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    interfaceC21620.mo25303((C3129) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9378 m46568(C9378 c9378) {
        return new C9378(m11158(), C25272.m56409("dexBuild", c9378.m24693().substring(new C9378(this.f65112, "smali").m24693().length()) + ".bin"));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C9378 m46567(String str) {
        return new C9378(m11158(), C14442.m34865("dexBuild/", str, ".dex"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m46552(String str, C9378 c9378, C9378 c9379) throws IOException {
        byte[] bArrM24700 = c9378.m24700();
        C7118 c7118M46609 = m46609(str);
        int i = c7118M46609.f23465;
        MessageDigest messageDigestM36183 = C15022.m36183();
        messageDigestM36183.update((byte) 1);
        messageDigestM36183.update((byte) (i >>> 8));
        messageDigestM36183.update((byte) i);
        byte[] bArrDigest = messageDigestM36183.digest(bArrM24700);
        if (m46561(bArrDigest, c9379)) {
            return;
        }
        C8850 c8850M19516 = c7118M46609.m19516();
        C19051.m44161(new String(bArrM24700, StandardCharsets.UTF_8), c8850M19516, c7118M46609);
        C22781 c22781 = new C22781();
        c8850M19516.m52043(c22781);
        c9379.m24701();
        OutputStream outputStreamMo4289 = c9379.m24699().mo4289(false);
        try {
            outputStreamMo4289.write(bArrDigest);
            outputStreamMo4289.write(c22781.m51382(), 0, c22781.m51383());
            outputStreamMo4289.close();
        } catch (Throwable th) {
            if (outputStreamMo4289 != null) {
                try {
                    outputStreamMo4289.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46561(byte[] bArr, C9378 c9378) {
        if (c9378.m24702()) {
            try {
                InputStream inputStreamM24703 = c9378.m24703();
                try {
                    for (int i : bArr) {
                        if (inputStreamM24703.read() != (i & 255)) {
                            inputStreamM24703.close();
                            return false;
                        }
                    }
                    if (inputStreamM24703 != null) {
                        inputStreamM24703.close();
                    }
                    return true;
                } catch (Throwable th) {
                    if (inputStreamM24703 != null) {
                        try {
                            inputStreamM24703.close();
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
    public static C22737 m46551(C9378 c9378) {
        return (C22737) ((AbstractC8696) new C24975(c9378.m24700(), f65107, true).mo4327()).iterator().next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private boolean m46547() throws IOException {
        boolean z;
        Object[] objArr;
        boolean zM46561;
        C20283 c20283 = this;
        C19382[] c19382Arr = (C19382[]) c20283.f65127.values().toArray(new C19382[0]);
        for (C19382 c19382 : c19382Arr) {
            C9378 c9378 = c19382.f62623;
            if (c9378 != null) {
                C9378 c9378M46568 = c20283.m46568(c9378);
                String str = c19382.f62621;
                if (c9378M46568.m24702()) {
                    byte[] bArrM24700 = c9378.m24700();
                    int i = c20283.m46609(str).f23465;
                    MessageDigest messageDigestM36183 = C15022.m36183();
                    messageDigestM36183.update((byte) 1);
                    messageDigestM36183.update((byte) (i >>> 8));
                    messageDigestM36183.update((byte) i);
                    zM46561 = m46561(messageDigestM36183.digest(bArrM24700), c9378M46568);
                } else {
                    zM46561 = false;
                }
                if (!zM46561) {
                    return true;
                }
            }
        }
        Bundle bundleM46613 = m46613();
        int i2 = bundleM46613.getInt("opt_dex_version");
        boolean z2 = bundleM46613.getBoolean("opt_rm_source");
        boolean z3 = bundleM46613.getBoolean("opt_rm_line");
        boolean z4 = bundleM46613.getBoolean("opt_rm_param");
        boolean z5 = bundleM46613.getBoolean("opt_rm_prologue");
        boolean z6 = bundleM46613.getBoolean("opt_rm_local");
        boolean z7 = bundleM46613.getBoolean("opt_rm_api_mod");
        boolean z8 = i2 == 0 && !(z2 || z3 || z4 || z5 || z6 || z7);
        ArrayList arrayList = new ArrayList();
        ArrayList<C19382> arrayList2 = new ArrayList();
        MessageDigest messageDigestM36179 = C15022.m36179();
        Iterator it = c20283.f65115.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            arrayList.clear();
            arrayList2.clear();
            int length = c19382Arr.length;
            Iterator it2 = it;
            int i3 = 0;
            while (i3 < length) {
                int i4 = length;
                C19382 c19383 = c19382Arr[i3];
                C19382[] c19382Arr2 = c19382Arr;
                if (c19383.f62621.equals(str2)) {
                    if (c19383.f62623 != null) {
                        arrayList2.add(c19383);
                    } else {
                        if (c19383.f62624 == null) {
                            throw new IOException("Bad class item: " + c19383.f62622.replace('/', '.'));
                        }
                        arrayList.add(c19383);
                    }
                }
                i3++;
                length = i4;
                c19382Arr = c19382Arr2;
            }
            C19382[] c19382Arr3 = c19382Arr;
            C9378 c9378M46567 = c20283.m46567(str2);
            boolean z9 = z7;
            boolean z10 = z6;
            C9378 c9379 = new C9378(m11158(), C14442.m34865("dexBuild/", str2, ".digest"));
            if (z8 && arrayList2.isEmpty() && c20283.m46603(str2).f33157 == arrayList.size()) {
                objArr = z9 ? 1 : 0;
                z = z10 ? 1 : 0;
            } else {
                if (!c9378M46567.m24702() || !c9379.m24702()) {
                    return true;
                }
                Comparator comparator = C19382.f62618;
                Collections.sort(arrayList, comparator);
                Collections.sort(arrayList2, comparator);
                messageDigestM36179.reset();
                messageDigestM36179.update((byte) i2);
                messageDigestM36179.update(z2 ? (byte) 1 : (byte) 0);
                messageDigestM36179.update(z3 ? (byte) 1 : (byte) 0);
                messageDigestM36179.update(z4 ? (byte) 1 : (byte) 0);
                messageDigestM36179.update(z5 ? (byte) 1 : (byte) 0);
                z = z10 ? 1 : 0;
                messageDigestM36179.update(z ? (byte) 1 : (byte) 0);
                objArr = z9 ? 1 : 0;
                messageDigestM36179.update(objArr == true ? (byte) 1 : (byte) 0);
                messageDigestM36179.update((byte) -127);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C15022.m36176(messageDigestM36179, ((C19382) it3.next()).f62622);
                }
                messageDigestM36179.update(bo.h);
                for (C19382 c19384 : arrayList2) {
                    C15022.m36176(messageDigestM36179, c19384.f62622);
                    C15022.m36175(messageDigestM36179, c19384.f62623.m24703());
                }
                messageDigestM36179.update((byte) -125);
                if (!m46560(c9378M46567, c9379, messageDigestM36179.digest())) {
                    return true;
                }
            }
            c20283 = this;
            it = it2;
            c19382Arr = c19382Arr3;
            Object[] objArr2 = objArr;
            z6 = z;
            z7 = objArr2 == true ? 1 : 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46583(InterfaceC0737 interfaceC0737) throws IOException, C18636 {
        boolean z;
        boolean z2;
        boolean z3;
        C19647 c19647M45292;
        boolean z4;
        ArrayList arrayList;
        C22781 c22781;
        InterfaceC0737 interfaceC0738 = interfaceC0737;
        ArrayList<C19382> arrayList2 = new ArrayList();
        ArrayList<C19382> arrayList3 = new ArrayList();
        C22781 c22782 = new C22781();
        C19382[] c19382Arr = (C19382[]) this.f65127.values().toArray(new C19382[0]);
        for (C19382 c19382 : c19382Arr) {
            C9378 c9378 = c19382.f62623;
            String str = c19382.f62622;
            if (c9378 != null) {
                interfaceC0738.mo3061(str);
                try {
                    m46552(c19382.f62621, c9378, m46568(c9378));
                } catch (C4511 e) {
                    throw new C18636(str, e);
                }
            }
        }
        Bundle bundleM46613 = m46613();
        int i = bundleM46613.getInt("opt_dex_version");
        boolean z5 = bundleM46613.getBoolean("opt_rm_source");
        boolean z6 = bundleM46613.getBoolean("opt_rm_line");
        boolean z7 = bundleM46613.getBoolean("opt_rm_param");
        boolean z8 = bundleM46613.getBoolean("opt_rm_prologue");
        boolean z9 = bundleM46613.getBoolean("opt_rm_local");
        boolean z10 = bundleM46613.getBoolean("opt_rm_api_mod");
        boolean z11 = i == 0 && !(z5 || z6 || z7 || z8 || z9 || z10);
        MessageDigest messageDigestM36179 = C15022.m36179();
        ArrayList arrayList4 = this.f65115;
        boolean z12 = z10;
        int size = arrayList4.size();
        boolean z13 = z9;
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList5 = arrayList4;
            String str2 = (String) arrayList4.get(i2);
            boolean z14 = z8;
            int i3 = i2 + 1;
            interfaceC0738.mo3058(i3, size, m46569(str2));
            arrayList2.clear();
            arrayList3.clear();
            c22782.m51384();
            int length = c19382Arr.length;
            int i4 = size;
            int i5 = 0;
            while (i5 < length) {
                int i6 = length;
                C19382 c19383 = c19382Arr[i5];
                C19382[] c19382Arr2 = c19382Arr;
                if (c19383.f62621.equals(str2)) {
                    if (c19383.f62623 != null) {
                        arrayList3.add(c19383);
                    } else {
                        if (c19383.f62624 == null) {
                            throw new IOException("Bad class item: " + c19383.f62622.replace('/', '.'));
                        }
                        arrayList2.add(c19383);
                    }
                }
                i5++;
                length = i6;
                c19382Arr = c19382Arr2;
            }
            C19382[] c19382Arr3 = c19382Arr;
            C9378 c9378M46567 = m46567(str2);
            C22781 c22783 = c22782;
            C9378 c9379 = new C9378(m11158(), C14442.m34865("dexBuild/", str2, ".digest"));
            if (z11 && arrayList3.isEmpty() && m46603(str2).f33157 == arrayList2.size()) {
                c9378M46567.m24697();
                c9379.m24697();
                arrayList = arrayList2;
                z4 = z12;
                z = z14 ? 1 : 0;
                z2 = z13;
                c22781 = c22783;
                z3 = z11;
            } else {
                if (interfaceC0737.mo924()) {
                    return;
                }
                Comparator comparator = C19382.f62618;
                Collections.sort(arrayList2, comparator);
                Collections.sort(arrayList3, comparator);
                messageDigestM36179.reset();
                messageDigestM36179.update((byte) i);
                messageDigestM36179.update(z5 ? (byte) 1 : (byte) 0);
                messageDigestM36179.update(z6 ? (byte) 1 : (byte) 0);
                messageDigestM36179.update(z7 ? (byte) 1 : (byte) 0);
                z = z14 ? 1 : 0;
                messageDigestM36179.update(z ? (byte) 1 : (byte) 0);
                z2 = z13;
                messageDigestM36179.update(z2 ? (byte) 1 : (byte) 0);
                boolean z15 = z12;
                z3 = z11;
                messageDigestM36179.update(z15 ? (byte) 1 : (byte) 0);
                messageDigestM36179.update((byte) -127);
                for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                    C15022.m36176(messageDigestM36179, ((C19382) it.next()).f62622);
                }
                messageDigestM36179.update(bo.h);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    C19382 c19384 = (C19382) it2.next();
                    C15022.m36176(messageDigestM36179, c19384.f62622);
                    C15022.m36175(messageDigestM36179, c19384.f62623.m24703());
                    z15 = z15 ? 1 : 0;
                    it2 = it3;
                }
                boolean z16 = z15;
                messageDigestM36179.update((byte) -125);
                byte[] bArrDigest = messageDigestM36179.digest();
                if (m46560(c9378M46567, c9379, bArrDigest)) {
                    arrayList = arrayList2;
                    z4 = z16 ? 1 : 0;
                    c22781 = c22783;
                } else {
                    if (interfaceC0737.mo924()) {
                        return;
                    }
                    C3374 c3374 = new C3374(arrayList3.size() + arrayList2.size());
                    c3374.m11078(new C17299(0, interfaceC0738));
                    if (i <= 0 || i >= 7) {
                        try {
                            c19647M45292 = m46603(str2).f33158;
                        } catch (IOException unused) {
                            c19647M45292 = C19647.m45292(15);
                        }
                    } else {
                        c19647M45292 = C19647.m45293(f65108[i]);
                    }
                    C8850 c8850 = new C8850(c19647M45292);
                    c8850.f28924 = z6;
                    c8850.f28925 = z2;
                    c8850.f28923 = z7;
                    c8850.f28926 = z;
                    c8850.f28921 = z5;
                    z4 = z16 ? 1 : 0;
                    c8850.f28927 = z4;
                    for (C19382 c19385 : arrayList2) {
                        ArrayList arrayList6 = arrayList2;
                        c3374.m11079(1);
                        try {
                            c8850.m23712((InterfaceC10122) new C3129(this, c19385).mo10203());
                            if (interfaceC0737.mo924()) {
                                return;
                            } else {
                                arrayList2 = arrayList6;
                            }
                        } catch (C4511 e2) {
                            throw new C18636(c19385.f62622, e2);
                        }
                    }
                    arrayList = arrayList2;
                    for (C19382 c19386 : arrayList3) {
                        c3374.m11079(1);
                        try {
                            c8850.m23712((InterfaceC10122) new C3129(this, c19386).mo10203());
                            if (interfaceC0737.mo924()) {
                                return;
                            }
                        } catch (C4511 e3) {
                            throw new C18636(c19386.f62622, e3);
                        }
                    }
                    m46569(str2);
                    interfaceC0737.mo3059();
                    c9378M46567.m24697();
                    c9379.m24697();
                    c22781 = c22783;
                    c8850.m52043(c22781);
                    c9378M46567.m24699().m49850(c22781.m51382(), 0, c22781.m51383());
                    C6178 c6178 = new C6178();
                    c6178.writeInt(1936945938);
                    c6178.m17806(bArrDigest);
                    c6178.m17806(Arrays.copyOfRange(c22781.m51382(), 8, 32));
                    c9379.m24699().m49850(c6178.m17808(), 0, c6178.size());
                }
            }
            z13 = z2;
            z11 = z3;
            arrayList4 = arrayList5;
            i2 = i3;
            c19382Arr = c19382Arr3;
            messageDigestM36179 = messageDigestM36179;
            arrayList2 = arrayList;
            z8 = z;
            z12 = z4;
            size = i4;
            c22782 = c22781;
            interfaceC0738 = interfaceC0737;
        }
        this.f65120 = false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m46601() throws IOException {
        C9378 c9378M11162 = m11162();
        c9378M11162.m24699().m49853();
        for (String str : this.f65115) {
            C9378 c9378M46567 = m46567(str);
            if (!c9378M46567.m24702()) {
                c9378M46567 = new C9378(m46606(), str);
            }
            AbstractC22044 abstractC22044M24694 = c9378M11162.m24694(m46569(str));
            InputStream inputStreamM24703 = c9378M46567.m24703();
            try {
                OutputStream outputStreamMo4289 = abstractC22044M24694.mo4289(false);
                try {
                    C5125.m15496(inputStreamM24703, outputStreamMo4289);
                    if (outputStreamMo4289 != null) {
                        outputStreamMo4289.close();
                    }
                    if (inputStreamM24703 != null) {
                        inputStreamM24703.close();
                    }
                } catch (Throwable th) {
                    if (outputStreamMo4289 != null) {
                        try {
                            outputStreamMo4289.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamM24703 != null) {
                    try {
                        inputStreamM24703.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46590(AbstractC22044 abstractC22044, boolean z) throws IOException {
        abstractC22044.mo4274();
        for (String str : this.f65115) {
            C9378 c9378M46567 = m46567(str);
            if (c9378M46567.m24702()) {
                AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(m46569(str));
                if (z) {
                    abstractC22044M49876.m49867();
                }
                try {
                    InputStream inputStreamM24703 = c9378M46567.m24703();
                    try {
                        OutputStream outputStreamMo4289 = abstractC22044M49876.mo4289(false);
                        try {
                            C5125.m15496(inputStreamM24703, outputStreamMo4289);
                            if (outputStreamMo4289 != null) {
                                outputStreamMo4289.close();
                            }
                            if (inputStreamM24703 != null) {
                                inputStreamM24703.close();
                            }
                        } catch (Throwable th) {
                            if (outputStreamMo4289 != null) {
                                try {
                                    outputStreamMo4289.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStreamM24703 != null) {
                            try {
                                inputStreamM24703.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    if (z) {
                        abstractC22044M49876.m49859();
                    }
                    throw e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46560(C9378 c9378, C9378 c9379, byte[] bArr) {
        if (c9378.m24702() && c9379.m24702()) {
            try {
                C20348 c20348 = new C20348(c9379.m24700());
                C17364.m40795((InterfaceC15872) c20348, 1936945938);
                if (Arrays.equals(c20348.m46748(), bArr)) {
                    DataInputStream dataInputStream = new DataInputStream(c9378.m24703());
                    byte[] bArr2 = new byte[24];
                    dataInputStream.readFully(bArr2, 0, 8);
                    dataInputStream.readFully(bArr2, 0, 24);
                    return Arrays.equals(c20348.m46748(), bArr2);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46559(InterfaceC25004 interfaceC25004, C3374 c3374, InterfaceC14906 interfaceC14906, Set set) {
        if (interfaceC25004.mo924()) {
            return;
        }
        c3374.m11079(1);
        C22737 c22737Mo10207 = interfaceC14906.mo10207();
        try {
            for (InterfaceC7886 interfaceC7886 : c22737Mo10207.getAnnotations()) {
                String type = interfaceC7886.getType();
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
                    Iterator it = interfaceC7886.getElements().iterator();
                    while (it.hasNext()) {
                        m46556(((InterfaceC19073) it.next()).getValue(), set);
                    }
                }
            }
            Iterator it2 = c22737Mo10207.getFields().iterator();
            while (it2.hasNext()) {
                m46553((InterfaceC2665) it2.next(), set);
            }
            Iterator it3 = c22737Mo10207.getMethods().iterator();
            while (it3.hasNext()) {
                m46554((InterfaceC8631) it3.next(), set);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46556(InterfaceC16791 interfaceC16791, Set set) {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 == 23) {
            set.add(((InterfaceC14553) interfaceC16791).getValue());
            return;
        }
        if (iMo5414 == 28) {
            Iterator it = ((InterfaceC13062) interfaceC16791).getValue().iterator();
            while (it.hasNext()) {
                m46556((InterfaceC16791) it.next(), set);
            }
        } else {
            if (iMo5414 != 29) {
                return;
            }
            Iterator it2 = ((InterfaceC15299) interfaceC16791).getElements().iterator();
            while (it2.hasNext()) {
                m46556(((InterfaceC19073) it2.next()).getValue(), set);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46553(InterfaceC2665 interfaceC2665, Set set) {
        for (InterfaceC7886 interfaceC7886 : interfaceC2665.getAnnotations()) {
            String type = interfaceC7886.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC7886.getElements().iterator();
                    while (it.hasNext()) {
                        m46556(((InterfaceC19073) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC16791 interfaceC16791Mo8822 = interfaceC2665.mo8822();
        if (interfaceC16791Mo8822 != null) {
            m46556(interfaceC16791Mo8822, set);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46554(InterfaceC8631 interfaceC8631, Set set) {
        for (InterfaceC7886 interfaceC7886 : interfaceC8631.getAnnotations()) {
            String type = interfaceC7886.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC7886.getElements().iterator();
                    while (it.hasNext()) {
                        m46556(((InterfaceC19073) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC7140 interfaceC7140Mo13175 = interfaceC8631.mo13175();
        if (interfaceC7140Mo13175 != null) {
            for (InterfaceC23331 interfaceC23331 : interfaceC7140Mo13175.mo2840()) {
                EnumC7011 enumC7011 = interfaceC23331.mo30864().f73508;
                if (enumC7011 == EnumC7011.Format21c || enumC7011 == EnumC7011.Format31c) {
                    if (interfaceC23331.mo30864().f73513 == 0) {
                        set.add(((InterfaceC22759) ((InterfaceC6177) interfaceC23331).getReference()).getString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m46563() {
        C9378 c9378 = new C9378(m46610(), "rename_map");
        C6178 c6178 = new C6178();
        for (Map.Entry entry : this.f65118.entrySet()) {
            c6178.m17786((CharSequence) entry.getKey());
            c6178.m17786((CharSequence) entry.getValue());
        }
        c9378.m24699().m49844(c6178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46581(HashMap map) throws IOException {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            HashMap map3 = this.f65127;
            if (map3.containsKey(str2)) {
                throw new IOException("Class exists: " + str2.replace('/', '.'));
            }
            C19382 c19382 = (C19382) map3.get(str);
            if (c19382 == null) {
                throw new IOException("Class not found: " + str.replace('/', '.'));
            }
            map2.put(c19382, str2);
        }
        if (map2.isEmpty()) {
            return;
        }
        int i = 0;
        this.f65114 = false;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : map2.entrySet()) {
            C19382 c19383 = (C19382) entry2.getKey();
            String strM46574 = m46574(c19383);
            String str3 = c19383.f62622;
            String str4 = (String) entry2.getValue();
            m46577(c19383.f62621, str4, strM46574);
            hashSet.add(str3);
            HashMap map4 = this.f65118;
            map4.put(str4, (String) C11392.getOrDefault(map4, str3, str3));
        }
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f65113;
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
        m46580(hashSet);
        m46563();
        m46591(true);
        if (z) {
            m46548();
            m46562();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m46569(String str) {
        String str2 = (String) this.f65109.get(str);
        return str2 == null ? C14483.m34972(str, ".dex") : str2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m46565(String str, String str2) {
        String strM5124 = C1402.m5124(1, 1, str2);
        boolean zEquals = strM5124.equals(str);
        HashMap map = this.f65116;
        if (zEquals) {
            if (map.remove(strM5124) != null) {
                m46566();
            }
        } else {
            if (str.equals(map.put(strM5124, str))) {
                return;
            }
            m46566();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m46566() {
        try {
            C6178 c6178 = new C6178();
            for (Map.Entry entry : this.f65116.entrySet()) {
                c6178.m17786((CharSequence) entry.getKey());
                c6178.m17786((CharSequence) entry.getValue());
            }
            m46610().m24694("map").m49844(c6178);
        } catch (IOException e) {
            this.f65121.mo40348(e);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m46605(String str) {
        String str2 = (String) this.f65116.get(str);
        return str2 == null ? str : str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m46598() {
        Set set = this.f65128;
        HashMap map = this.f65116;
        if (map.isEmpty() && set.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap(C7376.m20246(set.size() + map.size(), 4, 3, 1));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!str2.startsWith("# TOO_LONG_NAME/")) {
                map2.put(str2, "");
            } else {
                String str3 = (String) C11392.putIfAbsent(map2, str2, str);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46616(ActivityC0848 activityC0848) {
        this.f65125.m29146(activityC0848);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m46595() {
        this.f65125.m29145();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m46621() {
        C11594 c11594 = this.f65125;
        c11594.m29145();
        c11594.m29151();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m46614() {
        C11594 c11594 = this.f65125;
        c11594.m29148();
        c11594.m29149();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m46573() {
        this.f65125.m29150();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC14906 m46618(String str) {
        C19382 c19382 = (C19382) this.f65127.get(str);
        if (c19382 == null) {
            return null;
        }
        return new C3129(this, c19382);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m46607(String str) {
        C19382 c19382 = (C19382) this.f65127.get(str);
        if (c19382 == null) {
            return -268435456;
        }
        C9378 c9378 = c19382.f62623;
        if (c9378 != null) {
            return Long.valueOf(c9378.m24699().mo4286() ^ c9378.m24699().mo4285()).hashCode();
        }
        return c19382.f62624 != null ? -536870912 : -268435456;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m46597(String str) {
        C0560 c0560;
        HashMap map = this.f65127;
        C19382 c19382 = (C19382) map.get(str);
        C11594 c11594 = this.f65125;
        if (c19382 == null) {
            if (c19382 != null) {
                return "";
            }
            return "";
        }
        HashMap map2 = this.f65118;
        if (!map2.containsKey(str)) {
            if (c19382 != null) {
                return "";
            }
            return "";
        }
        String str2 = (String) map2.get(str);
        C19382 c19383 = (C19382) this.f65111.get(str2);
        if (c19383 == null) {
            c19383 = (C19382) map.get(str2);
        }
        if (c19383 != null && c19383.f62624 != null) {
            c11594.getClass();
            c0560 = new C0560();
            c11594.m29147(c19383, c0560);
        } else {
            if (c19382 != null || c19382.f62624 == null) {
                return "";
            }
            c11594.getClass();
            c0560 = new C0560();
            c11594.m29147(c19382, c0560);
        }
        return c0560.toString();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m46622(String str) throws C3090 {
        C19382 c19382 = (C19382) this.f65127.get(str);
        if (c19382 == null) {
            throw new C3090("Class not found: " + str.replace('/', '.'));
        }
        return m46574(c19382);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46574(C19382 c19382) throws C3090 {
        C9378 c9378 = c19382.f62623;
        if (c9378 != null) {
            return c9378.m24699().m49871();
        }
        if (c19382.f62624 != null) {
            C11594 c11594 = this.f65125;
            c11594.getClass();
            C0560 c0560 = new C0560();
            c11594.m29147(c19382, c0560);
            return c0560.toString();
        }
        throw new C3090("Bad class: " + c19382.f62622.replace('/', '.'));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46578(String str, C0560 c0560) throws IOException {
        C19382 c19382 = (C19382) this.f65127.get(str);
        if (c19382 == null) {
            throw new C3090("Class not found: " + str.replace('/', '.'));
        }
        m46588(c19382, c0560);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46588(C19382 c19382, C0560 c0560) throws IOException {
        C9378 c9378 = c19382.f62623;
        if (c9378 != null) {
            AbstractC22044 abstractC22044M24699 = c9378.m24699();
            abstractC22044M24699.getClass();
            try {
                InputStream inputStreamMo4290 = abstractC22044M24699.mo4290();
                try {
                    C5125.m15497(inputStreamMo4290, c0560, Charset.defaultCharset());
                    if (inputStreamMo4290 != null) {
                        inputStreamMo4290.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (inputStreamMo4290 != null) {
                        try {
                            inputStreamMo4290.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                C2148.m7413(abstractC22044M24699, e);
                throw e;
            }
        }
        if (c19382.f62624 != null) {
            this.f65125.m29147(c19382, c0560);
        } else {
            throw new C3090("Bad class: " + c19382.f62622.replace('/', '.'));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46615(String str, String str2) throws C3090 {
        C19382 c19382 = (C19382) this.f65127.get(str);
        if (c19382 == null) {
            throw new C3090("Class not found: " + str.replace('/', '.'));
        }
        synchronized (this) {
            C7118 c7118M46609 = m46609(c19382.f62621);
            C7447 c7447M44161 = C19051.m44161(str2, c7118M46609.m19516(), c7118M46609);
            if (c7447M44161 == null) {
                throw new IOException("Unknown error");
            }
            m46565(c19382.f62622, c7447M44161.getType());
            m46587(c19382, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46576(String str, String str2) {
        C19382 c19382 = (C19382) this.f65127.get(str);
        if (c19382 == null) {
            throw new C3090("Class not found: " + str.replace('/', '.'));
        }
        m46587(c19382, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46587(C19382 c19382, String str) {
        boolean z;
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        if (c19382.f62623 == null) {
            C9378 c9378 = new C9378(new C9378(this.f65112, "smali"), c19382.f62621);
            c19382.f62623 = C9378.m24692(c9378, C3102.m10112(c9378.m24699(), c19382.f62622 + ".smali"));
            z = true;
        } else {
            z = false;
        }
        c19382.f62623.m24696(bytes);
        if (this.f65114 && z) {
            this.f65128.add(c19382.f62622);
            this.f65110.mo40348(C4681.unmodifiableSet(this.f65128));
        }
        this.f65122 = 0L;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m46620(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C19382 c19382 : this.f65127.values()) {
            if (c19382.f62622.startsWith(str)) {
                arrayList.add(c19382.f62622);
            }
        }
        m46580((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46580(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C19382 c19382 = (C19382) this.f65127.remove(str);
            if (c19382 != null) {
                C9378 c9378 = c19382.f62623;
                if (c9378 != null) {
                    c9378.m24697();
                    if (this.f65114) {
                        this.f65128.remove(str);
                        z2 = true;
                    }
                    c19382.f62623 = null;
                }
                if (c19382.f62624 != null) {
                    this.f65111.put(str, c19382);
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f65113.contains(str)) {
                    z = true;
                }
                if (this.f65118.remove(str) != null) {
                    z3 = true;
                }
            }
        }
        int length = sb.length();
        C17930 c17930 = this.f65121;
        if (length > 0) {
            AbstractC22044 abstractC22044M24694 = m46610().m24694("removed");
            try {
                abstractC22044M24694.mo49834();
                abstractC22044M24694.m49873(sb.toString());
            } catch (Throwable th) {
                c17930.mo40348(th);
            }
        }
        if (z) {
            m46562();
        }
        if (z2) {
            this.f65110.mo40348(C4681.unmodifiableSet(this.f65128));
        }
        if (z3) {
            try {
                m46563();
            } catch (IOException e) {
                c17930.mo40348(e);
            }
        }
        this.f65122 = 0L;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m46548() {
        AbstractC22044 abstractC22044M24694 = m46610().m24694("recent");
        try {
            abstractC22044M24694.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(abstractC22044M24694.mo4289(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f65113.iterator();
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
            this.f65121.mo40348(th3);
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m46572(String str) {
        if (this.f65113.remove(str)) {
            m46548();
            m46562();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m46604() {
        this.f65113.clear();
        m46548();
        m46562();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Bundle m46613() {
        if (this.f65124 == null) {
            this.f65124 = new Bundle();
            AbstractC22044 abstractC22044M24694 = m46610().m24694("options");
            if (abstractC22044M24694.mo4304()) {
                try {
                    byte[] bArrM49865 = abstractC22044M24694.m49865();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrM49865, 0, bArrM49865.length);
                    parcelObtain.setDataPosition(0);
                    this.f65124.readFromParcel(parcelObtain);
                    parcelObtain.recycle();
                } catch (Exception e) {
                    this.f65121.mo40348(e);
                }
            }
        }
        return this.f65124;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46602() {
        if (this.f65124 == null) {
            return;
        }
        AbstractC22044 abstractC22044M24694 = m46610().m24694("options");
        try {
            Parcel parcelObtain = Parcel.obtain();
            this.f65124.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            abstractC22044M24694.m49849(bArrMarshall);
        } catch (IOException e) {
            this.f65121.mo40348(e);
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m46562() {
        ArrayList arrayList = this.f65113;
        this.f65129.mo40348(C4681.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46584(ActivityC0848 activityC0848, C2667 c2667) {
        this.f65121.m40350(activityC0848, c2667);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46586(C15829 c15829, C19559 c19559) {
        this.f65129.m40350(c15829, c19559);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46585(C15829 c15829, C15083 c15083) {
        this.f65110.m40350(c15829, c15083);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Set m46571() {
        return C4681.unmodifiableSet(this.f65128);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46592(final ActivityC0848 activityC0848, final C22761 c22761) {
        boolean z;
        boolean z2;
        int i = 0;
        if (m11161()) {
            boolean zMo2934 = m46610().m24694("strings_changed").mo2934();
            if (activityC0848.m3439()) {
                z = true;
            } else {
                if (this.f65120) {
                    z2 = true;
                } else if (SystemClock.uptimeMillis() - this.f65122 < c.a) {
                    z2 = this.f65120;
                } else {
                    try {
                        this.f65120 = m46547();
                        this.f65122 = SystemClock.uptimeMillis();
                        z2 = this.f65120;
                    } catch (Exception unused) {
                        this.f65120 = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (zMo2934) {
                int i2 = DialogInterfaceC8327.f27315;
                C2361 c2361 = new C2361(activityC0848);
                c2361.m8021(R.string.MT_Protector);
                c2361.m8000(R.string.MT_Protector);
                c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴۗۧ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        C22761 c22762 = c22761;
                        c22762.m51318(3);
                        c22762.m51323();
                    }
                });
                if (z) {
                    c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫ۗۧ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            activityC0848.m3426();
                        }
                    });
                } else {
                    c2361.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11332(activityC0848, i));
                }
                c2361.m8016();
                return true;
            }
            if (z) {
                activityC0848.m3426();
                return true;
            }
        }
        return false;
    }
}
