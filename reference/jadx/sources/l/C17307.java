package l;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9YL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17307 extends AbstractC12457 implements InterfaceC7983, InterfaceC23866 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f56351 = C16980.m40038(C17307.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Set f56352;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f56353;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Hashtable f56354;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f56355;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f56356;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient String f56357;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f56358;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f56359;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f56360;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f56361;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C16561 f56362;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f56363;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Set f56364;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f56365;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f56366;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f56367;

    public C17307() {
        throw null;
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ۘ */
    public final synchronized boolean mo30935() {
        boolean z;
        z = false;
        if (this.f56356 != null) {
            if ((this.f56364.size() > 0 || this.f56352.size() > 0) && mo30942() != null && mo30942().length > 0) {
                z = true;
            }
        }
        return z;
    }

    public C17307(String str, HashMap map, boolean z) {
        this(map, 0, 0, 0, z, null);
        try {
            this.f56367 = C5132.m15523(str);
            this.f56356 = str;
        } catch (IOException e) {
            throw new RuntimeException(C13645.m33383("Unexpected exception: ", e));
        }
    }

    public C17307(Map map, int i, int i2, int i3, boolean z, byte[] bArr) {
        HashMap mapM40632 = m40632(map);
        this.f56366 = (String) mapM40632.get(EnumC20662.Domain);
        this.f56358 = (String) mapM40632.get(EnumC20662.Protocol);
        this.f56363 = (String) mapM40632.get(EnumC20662.Application);
        this.f56365 = (String) mapM40632.get(EnumC20662.Instance);
        this.f56355 = (String) mapM40632.get(EnumC20662.Subtype);
        this.f56353 = i;
        this.f56361 = i2;
        this.f56359 = i3;
        this.f56367 = bArr;
        this.f56362 = new C16561(this);
        this.f56360 = z;
        this.f56364 = C4681.synchronizedSet(new LinkedHashSet());
        this.f56352 = C4681.synchronizedSet(new LinkedHashSet());
    }

    public C17307(AbstractC12457 abstractC12457) {
        this.f56364 = C4681.synchronizedSet(new LinkedHashSet());
        this.f56352 = C4681.synchronizedSet(new LinkedHashSet());
        if (abstractC12457 != null) {
            this.f56366 = abstractC12457.mo30950();
            this.f56358 = abstractC12457.mo30946();
            this.f56363 = abstractC12457.mo30936();
            this.f56365 = abstractC12457.getName();
            this.f56355 = abstractC12457.mo30948();
            this.f56353 = abstractC12457.mo30952();
            this.f56361 = abstractC12457.mo30951();
            this.f56359 = abstractC12457.mo30945();
            this.f56367 = abstractC12457.mo30942();
            this.f56360 = abstractC12457.mo30949();
            for (Inet6Address inet6Address : abstractC12457.mo30938()) {
                this.f56352.add(inet6Address);
            }
            for (Inet4Address inet4Address : abstractC12457.mo30947()) {
                this.f56364.add(inet4Address);
            }
        }
        this.f56362 = new C16561(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m40632(Map map) {
        HashMap map2 = new HashMap(5);
        EnumC20662 enumC20662 = EnumC20662.Domain;
        String str = "local";
        String str2 = map.containsKey(enumC20662) ? (String) map.get(enumC20662) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        map2.put(enumC20662, m40633(str));
        EnumC20662 enumC20663 = EnumC20662.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(enumC20663) ? (String) map.get(enumC20663) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        map2.put(enumC20663, m40633(str3));
        EnumC20662 enumC20664 = EnumC20662.Application;
        String str5 = "";
        String str6 = map.containsKey(enumC20664) ? (String) map.get(enumC20664) : "";
        if (str6 == null || str6.length() == 0) {
            str6 = "";
        }
        map2.put(enumC20664, m40633(str6));
        EnumC20662 enumC20665 = EnumC20662.Instance;
        String str7 = map.containsKey(enumC20665) ? (String) map.get(enumC20665) : "";
        if (str7 == null || str7.length() == 0) {
            str7 = "";
        }
        map2.put(enumC20665, m40633(str7));
        EnumC20662 enumC20666 = EnumC20662.Subtype;
        String str8 = map.containsKey(enumC20666) ? (String) map.get(enumC20666) : "";
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        map2.put(enumC20666, m40633(str5));
        return map2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m40633(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(".")) {
            strTrim = strTrim.substring(1);
        }
        if (strTrim.startsWith("_")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith(".") ? C1402.m5124(1, 0, strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m40650() {
        C16561 c16561 = this.f56362;
        c16561.lock();
        try {
            c16561.m38971(EnumC21037.f67241);
            c16561.mo38975(null);
            return false;
        } finally {
            c16561.unlock();
        }
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ۛ */
    public final String mo30939() {
        String strMo30950 = mo30950();
        String strMo30946 = mo30946();
        String strMo30936 = mo30936();
        StringBuilder sb = new StringBuilder();
        sb.append(strMo30936.length() > 0 ? C14442.m34865("_", strMo30936, ".") : "");
        return C12669.m31438(sb, strMo30946.length() > 0 ? C14442.m34865("_", strMo30946, ".") : "", strMo30950, ".");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m40634() {
        String strMo30948 = mo30948();
        StringBuilder sb = new StringBuilder();
        sb.append(strMo30948.length() > 0 ? C14442.m34865("_", strMo30948, "._sub.") : "");
        sb.append(mo30939());
        return sb.toString();
    }

    @Override // l.AbstractC12457
    public final String getName() {
        String str = this.f56365;
        return str != null ? str : "";
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ۧ */
    public final String mo30941() {
        if (this.f56357 == null) {
            this.f56357 = mo30944().toLowerCase();
        }
        return this.f56357;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40637(String str) {
        this.f56365 = str;
        this.f56357 = null;
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ܶ */
    public final String mo30944() {
        String strMo30950 = mo30950();
        String strMo30946 = mo30946();
        String strMo30936 = mo30936();
        String name = getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name.length() > 0 ? name.concat(".") : "");
        sb.append(strMo30936.length() > 0 ? C14442.m34865("_", strMo30936, ".") : "");
        return C12669.m31438(sb, strMo30946.length() > 0 ? C14442.m34865("_", strMo30946, ".") : "", strMo30950, ".");
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ۗ */
    public final String mo30934() {
        String str = this.f56356;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40652(String str) {
        this.f56356 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40638(Inet4Address inet4Address) {
        this.f56364.add(inet4Address);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40639(Inet6Address inet6Address) {
        this.f56352.add(inet6Address);
    }

    @Override // l.AbstractC12457
    @Deprecated
    /* JADX INFO: renamed from: ۤ */
    public final Inet4Address mo30940() {
        Inet4Address[] inet4AddressArrMo30947 = mo30947();
        if (inet4AddressArrMo30947.length > 0) {
            return inet4AddressArrMo30947[0];
        }
        return null;
    }

    @Override // l.AbstractC12457
    @Deprecated
    /* JADX INFO: renamed from: ܳ */
    public final Inet6Address mo30943() {
        Inet6Address[] inet6AddressArrMo30938 = mo30938();
        if (inet6AddressArrMo30938.length > 0) {
            return inet6AddressArrMo30938[0];
        }
        return null;
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ֫ */
    public final InetAddress[] mo30933() {
        Set set = this.f56364;
        int size = set.size();
        Set set2 = this.f56352;
        ArrayList arrayList = new ArrayList(set2.size() + size);
        arrayList.addAll(set);
        arrayList.addAll(set2);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ᩴ */
    public final Inet4Address[] mo30947() {
        Set set = this.f56364;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ۚ */
    public final Inet6Address[] mo30938() {
        Set set = this.f56352;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ᩻ */
    public final int mo30952() {
        return this.f56353;
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ܺ */
    public final int mo30945() {
        return this.f56359;
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ᩺ */
    public final int mo30951() {
        return this.f56361;
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ۨ */
    public final byte[] mo30942() {
        byte[] bArr = this.f56367;
        return (bArr == null || bArr.length <= 0) ? C5132.f17872 : bArr;
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ۙ */
    public final String mo30936() {
        String str = this.f56363;
        return str != null ? str : "";
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ᩷ */
    public final String mo30950() {
        String str = this.f56366;
        return str != null ? str : "local";
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ܽ */
    public final String mo30946() {
        String str = this.f56358;
        return str != null ? str : "tcp";
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ᩵ */
    public final String mo30948() {
        String str = this.f56355;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashMap m40648() {
        HashMap map = new HashMap(5);
        map.put(EnumC20662.Domain, mo30950());
        map.put(EnumC20662.Protocol, mo30946());
        map.put(EnumC20662.Application, mo30936());
        map.put(EnumC20662.Instance, getName());
        map.put(EnumC20662.Subtype, mo30948());
        return map;
    }

    @Override // l.InterfaceC7983
    /* JADX INFO: renamed from: ۙ */
    public final void mo21766(C4254 c4254, long j, AbstractC14694 abstractC14694) {
        if (!(abstractC14694 instanceof AbstractC17152)) {
            f56351.mo13708(abstractC14694 == null ? "null" : abstractC14694.getClass().getSimpleName(), "DNSEntry is not of type 'DNSRecord' but of type {}");
            return;
        }
        AbstractC17152 abstractC17152 = (AbstractC17152) abstractC14694;
        boolean z = true;
        if (abstractC17152.mo35351(j)) {
            InterfaceC25186 interfaceC25186 = f56351;
            int i = C24767.f80159[abstractC17152.m35360().ordinal()];
            if (i == 1 || i == 2) {
                if (!abstractC17152.m35359().equalsIgnoreCase(mo30934())) {
                    return;
                }
                InetAddress inetAddress = ((AbstractC20136) abstractC17152).f64714;
                if (EnumC24021.TYPE_A.equals(abstractC17152.m35360())) {
                    Inet4Address inet4Address = (Inet4Address) inetAddress;
                    if (this.f56364.remove(inet4Address)) {
                        interfaceC25186.mo13716(inet4Address, "Removed expired IPv4: {}");
                    } else {
                        interfaceC25186.mo13716(inet4Address, "Expired IPv4 not in this service: {}");
                        return;
                    }
                } else {
                    Inet6Address inet6Address = (Inet6Address) inetAddress;
                    if (this.f56352.remove(inet6Address)) {
                        interfaceC25186.mo13716(inet6Address, "Removed expired IPv6: {}");
                    } else {
                        interfaceC25186.mo13716(inet6Address, "Expired IPv6 not in this service: {}");
                        return;
                    }
                }
            } else {
                interfaceC25186.mo13708(abstractC17152, "Unhandled expired record: {}");
                return;
            }
        } else {
            Set set = this.f56352;
            Set set2 = this.f56364;
            int i2 = C24767.f80159[abstractC17152.m35360().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (!abstractC17152.m35359().equalsIgnoreCase(mo30944())) {
                                return;
                            }
                            this.f56367 = ((C25358) abstractC17152).m56712();
                            this.f56354 = null;
                        } else if (i2 != 5 || mo30948().length() != 0 || abstractC17152.m35358().length() == 0) {
                            return;
                        } else {
                            this.f56355 = abstractC17152.m35358();
                        }
                    } else {
                        if (!abstractC17152.m35359().equalsIgnoreCase(mo30944())) {
                            return;
                        }
                        C11931 c11931 = (C11931) abstractC17152;
                        String str = this.f56356;
                        if (str != null && str.equalsIgnoreCase(c11931.m29891())) {
                            z = false;
                        }
                        this.f56356 = c11931.m29891();
                        this.f56353 = c11931.m29888();
                        this.f56361 = c11931.m29890();
                        this.f56359 = c11931.m29892();
                        if (z) {
                            set2.clear();
                            set.clear();
                            Iterator it = c4254.m13581(this.f56356, EnumC24021.TYPE_A, EnumC6121.CLASS_IN).iterator();
                            while (it.hasNext()) {
                                mo21766(c4254, j, (AbstractC14694) it.next());
                            }
                            Iterator it2 = c4254.m13581(this.f56356, EnumC24021.TYPE_AAAA, EnumC6121.CLASS_IN).iterator();
                            while (it2.hasNext()) {
                                mo21766(c4254, j, (AbstractC14694) it2.next());
                            }
                            return;
                        }
                    }
                } else {
                    if (!abstractC17152.m35359().equalsIgnoreCase(mo30934())) {
                        return;
                    }
                    InetAddress inetAddress2 = ((AbstractC20136) abstractC17152).f64714;
                    if (!(inetAddress2 instanceof Inet6Address) || !set.add((Inet6Address) inetAddress2)) {
                        return;
                    }
                }
            } else {
                if (!abstractC17152.m35359().equalsIgnoreCase(mo30934())) {
                    return;
                }
                InetAddress inetAddress3 = ((AbstractC20136) abstractC17152).f64714;
                if (!(inetAddress3 instanceof Inet4Address) || !set2.add((Inet4Address) inetAddress3)) {
                    return;
                }
            }
        }
        C14168 c14168M38974 = this.f56362.m38974();
        if (c14168M38974 != null) {
            if (mo30935()) {
                c14168M38974.m34426(new C11340(c14168M38974, mo30939(), getName(), clone()));
            }
            synchronized (this) {
                notifyAll();
            }
            return;
        }
        f56351.mo13721("JmDNS not available.");
    }

    @Override // l.InterfaceC23866
    /* JADX INFO: renamed from: ۙ */
    public final void mo34430(AbstractC18053 abstractC18053) {
        this.f56362.mo34430(abstractC18053);
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m40644() {
        this.f56362.m38973();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m40651() {
        return this.f56362.m38972();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40640(AbstractC8357 abstractC8357) {
        this.f56362.m38968(abstractC8357);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40641(AbstractC8357 abstractC8357, EnumC21037 enumC21037) {
        this.f56362.m38969(abstractC8357, enumC21037);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40653(AbstractC8357 abstractC8357, EnumC21037 enumC21037) {
        C16561 c16561 = this.f56362;
        c16561.lock();
        try {
            return c16561.f53242 == abstractC8357 && c16561.f53241 == enumC21037;
        } finally {
            c16561.unlock();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m40645() {
        return this.f56362.f53241.m48086();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m40635() {
        return this.f56362.f53241.m48087();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m40647() {
        return this.f56362.f53241.m48088();
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40649() {
        return this.f56362.m38976();
    }

    public final int hashCode() {
        return mo30944().hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17307) && mo30944().equals(((C17307) obj).mo30944());
    }

    @Override // l.AbstractC12457
    public final C17307 clone() {
        C17307 c17307 = new C17307(m40648(), this.f56353, this.f56361, this.f56359, this.f56360, this.f56367);
        c17307.f56356 = this.f56356;
        for (Inet6Address inet6Address : mo30938()) {
            c17307.f56352.add(inet6Address);
        }
        for (Inet4Address inet4Address : mo30947()) {
            c17307.f56364.add(inet4Address);
        }
        return c17307;
    }

    public final String toString() {
        Map map;
        StringBuilder sb = new StringBuilder("[ServiceInfoImpl@");
        sb.append(System.identityHashCode(this));
        sb.append(" name: '");
        if (getName().length() > 0) {
            sb.append(getName());
            sb.append('.');
        }
        sb.append(m40634());
        sb.append("' address: '");
        InetAddress[] inetAddressArrMo30933 = mo30933();
        if (inetAddressArrMo30933.length > 0) {
            for (InetAddress inetAddress : inetAddressArrMo30933) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(this.f56353);
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(this.f56353);
        }
        sb.append("' status: '");
        sb.append(this.f56362.toString());
        sb.append(this.f56360 ? "' is persistent," : "',");
        if (mo30935()) {
            sb.append(" has data");
        } else {
            sb.append(" has NO data");
        }
        if (mo30942().length > 0) {
            synchronized (this) {
                if (this.f56354 == null && mo30942() != null) {
                    Hashtable hashtable = new Hashtable();
                    try {
                        C5132.m15522(hashtable, mo30942());
                    } catch (Exception e) {
                        f56351.mo13702("Malformed TXT Field ", (Throwable) e);
                    }
                    this.f56354 = hashtable;
                }
                map = this.f56354;
                if (map == null) {
                    map = Collections.EMPTY_MAP;
                }
            }
            if (map.isEmpty()) {
                sb.append(", empty");
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    byte[] bArr = (byte[]) entry.getValue();
                    byte[] bArr2 = C5132.f17871;
                    String strM15521 = C5132.m15521(0, bArr.length, bArr);
                    sb.append("\n\t");
                    C22121.m50078(sb, (String) entry.getKey(), ": ", strM15521);
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m40636(EnumC6121 enumC6121, int i, C21628 c21628) {
        ArrayList arrayList = new ArrayList();
        if (enumC6121 != EnumC6121.CLASS_ANY && enumC6121 != EnumC6121.CLASS_IN) {
            return arrayList;
        }
        if (mo30948().length() > 0) {
            arrayList.add(new C2237(m40634(), EnumC6121.CLASS_IN, false, i, mo30944()));
        }
        String strMo30939 = mo30939();
        EnumC6121 enumC6122 = EnumC6121.CLASS_IN;
        arrayList.add(new C2237(strMo30939, enumC6122, false, i, mo30944()));
        arrayList.add(new C11931(mo30944(), enumC6122, true, i, this.f56359, this.f56361, this.f56353, c21628.f69056));
        arrayList.add(new C25358(mo30944(), enumC6122, true, i, mo30942()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40643(byte[] bArr) {
        this.f56367 = bArr;
        this.f56354 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40642(C14168 c14168) {
        this.f56362.mo38970(c14168);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14168 m40646() {
        return this.f56362.m38974();
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo30949() {
        return this.f56360;
    }

    @Override // l.AbstractC12457
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo30937(AbstractC12457 abstractC12457) {
        if (abstractC12457 instanceof C17307) {
            C17307 c17307 = (C17307) abstractC12457;
            Set set = c17307.f56352;
            Set set2 = c17307.f56364;
            Set set3 = this.f56364;
            if (set3.size() != set2.size()) {
                return false;
            }
            Set set4 = this.f56352;
            return set4.size() == set.size() && set3.equals(set2) && set4.equals(set);
        }
        InetAddress[] inetAddressArrMo30933 = mo30933();
        InetAddress[] inetAddressArrMo30934 = abstractC12457.mo30933();
        return inetAddressArrMo30933.length == inetAddressArrMo30934.length && new HashSet(Arrays.asList(inetAddressArrMo30933)).equals(new HashSet(Arrays.asList(inetAddressArrMo30934)));
    }
}
