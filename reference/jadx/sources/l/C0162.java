package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6I5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0162 implements Closeable {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f1176 = C16980.m40037(C0162.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f1177;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f1178;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C1610 f1179;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final HashMap f1180;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18865 f1181;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4585 f1182;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6129 f1183;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f1184;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8423 f1185;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f1186;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1184) {
            return;
        }
        try {
            this.f1181.m43767();
            this.f1179 = null;
            this.f1185.m22616();
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            m1363(this.f1178, setNewSetFromMap);
            m1363(this.f1177, setNewSetFromMap);
            m1363(this.f1186, setNewSetFromMap);
            this.f1184 = true;
            C4585 c4585 = this.f1182;
            if (c4585 != null) {
                c4585.close();
            }
            this.f1183.close();
        } catch (Throwable th) {
            this.f1184 = true;
            C4585 c4586 = this.f1182;
            if (c4586 != null) {
                c4586.close();
            }
            this.f1183.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C0908 m1364(C2551 c2551) {
        C0908 c0908M8511;
        c0908M8511 = c2551.m8511();
        if (c0908M8511 == null) {
            m1367(c2551.m8536());
            c0908M8511 = new C0908(c2551);
            c2551.m8499(c0908M8511);
        }
        return c0908M8511;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C18807 m1367(C24927 c24927) {
        C18807 c18807M55550;
        c18807M55550 = c24927.m55550();
        if (c18807M55550 == null) {
            c18807M55550 = c24927.m55552() ? new C18807(c24927, m1367(c24927.m55574())) : new C18807(c24927, this);
            c24927.m55545(c18807M55550);
        }
        return c18807M55550;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m1369() {
        if (this.f1184) {
            throw new IllegalStateException("Decompiler is closed");
        }
        if (this.f1182 == null) {
            this.f1183.getClass();
            this.f1182 = new C4585();
        }
    }

    public C0162() {
        this(new C6129());
    }

    public C0162(C6129 c6129) {
        this.f1178 = new ArrayList();
        new C3093();
        this.f1177 = new ArrayList();
        this.f1180 = new HashMap();
        this.f1186 = new ArrayList();
        this.f1185 = new C8423();
        this.f1183 = c6129;
        this.f1181 = new C18865(c6129);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m1370() {
        m1369();
        C18865 c18865 = this.f1181;
        c18865.m43767();
        this.f1179 = null;
        this.f1185.m22616();
        C24029.m53586(this);
        InterfaceC25186 interfaceC25186 = f1176;
        interfaceC25186.mo13709("loading ...");
        C6129 c6129 = this.f1183;
        c18865.m43766(c6129.m17718());
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13716(c18865.m43764(), "Resolved plugins: {}");
        }
        c18865.m43765(this);
        boolean zMo13707 = interfaceC25186.mo13707();
        HashMap map = this.f1180;
        if (zMo13707) {
            List list = (List) C1170.stream(map.values()).flatMap(new C3984(1)).map(new C21045(0)).collect(C2025.toList());
            interfaceC25186.mo13701("Loaded custom passes: {} {}", Integer.valueOf(list.size()), list);
        }
        ArrayList arrayList = this.f1178;
        arrayList.clear();
        List listM13226 = C4123.m13226(c6129.m17723(), new C18061(0));
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = c18865.m43764().iterator();
        while (it.hasNext()) {
            C0966 c0966M8287 = ((C2457) it.next()).m8287();
            if (c0966M8287 != null) {
                Iterator it2 = c0966M8287.m3835().iterator();
                while (it2.hasNext()) {
                    try {
                        InterfaceC4196 interfaceC4196Mo35269 = ((InterfaceC14636) it2.next()).mo35269(listM13226);
                        if (!interfaceC4196Mo35269.isEmpty()) {
                            arrayList.add(interfaceC4196Mo35269);
                        }
                    } catch (Exception e) {
                        throw new C8597("Failed to load DEX input", e);
                    }
                }
            }
        }
        arrayList.addAll(this.f1177);
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13701("Loaded using {} inputs plugin in {} ms", Integer.valueOf(arrayList.size()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        C1610 c1610 = new C1610(this);
        this.f1179 = c1610;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC4196) it3.next()).mo13405(new C22815(2, c1610));
        }
        this.f1179.m5665();
        this.f1179.m5666();
        this.f1179.m5673(map);
        this.f1179.m5693();
        this.f1179.m5689();
        interfaceC25186.mo13721("Load finished");
        List list2 = (List) map.get(InterfaceC23698.f76825);
        if (list2 != null) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                ((InterfaceC23698) ((InterfaceC17730) it4.next())).init();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1363(ArrayList arrayList, Set set) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Closeable closeable = (Closeable) it.next();
                if (set.add(closeable)) {
                    try {
                        closeable.close();
                    } catch (Exception e) {
                        f1176.mo13710("Fail to close '{}'", closeable, e);
                    }
                }
            }
            arrayList.clear();
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final String toString() {
        int i = C10271.f32803;
        return "jadx decompiler dev-fc9688ef483d-mt";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18807 m1366(String str) {
        return (C18807) C1170.stream(this.f1179.m5680()).filter(new C3891(0, str)).findFirst().map(new Function() { // from class: l.ܰۘۗ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f45207.m1367((C24927) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        }).orElse(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6129 m1365() {
        return this.f1183;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1368(C6010 c6010) {
        this.f1177.add(c6010);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m1371() {
        return this.f1177;
    }
}
