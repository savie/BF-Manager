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

/* JADX INFO: renamed from: l.֡ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K9YL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0244 extends AbstractC11015 implements InterfaceC11451, InterfaceC12157 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f1454 = C13488.m32998(C0244.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Set f1455;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f1456;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20001 f1457;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f1458;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f1459;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f1460;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f1461;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f1462;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient String f1463;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f1464;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Hashtable f1465;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f1466;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set f1467;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f1468;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f1469;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f1470;

    public C0244() {
        throw null;
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo1673() {
        boolean z;
        z = false;
        if (this.f1460 != null) {
            if ((this.f1455.size() > 0 || this.f1467.size() > 0) && mo1658() != null && mo1658().length > 0) {
                z = true;
            }
        }
        return z;
    }

    public C0244(String str, HashMap map, boolean z) {
        this(map, 0, 0, 0, z, null);
        try {
            this.f1464 = C15540.m37179(str);
            this.f1460 = str;
        } catch (IOException e) {
            throw new RuntimeException(C15489.m37075("Unexpected exception: ", e));
        }
    }

    public C0244(Map map, int i, int i2, int i3, boolean z, byte[] bArr) {
        HashMap mapM1634 = m1634(map);
        this.f1469 = (String) mapM1634.get(EnumC6075.Domain);
        this.f1456 = (String) mapM1634.get(EnumC6075.Protocol);
        this.f1466 = (String) mapM1634.get(EnumC6075.Application);
        this.f1468 = (String) mapM1634.get(EnumC6075.Instance);
        this.f1458 = (String) mapM1634.get(EnumC6075.Subtype);
        this.f1461 = i;
        this.f1462 = i2;
        this.f1470 = i3;
        this.f1464 = bArr;
        this.f1457 = new C20001(this);
        this.f1459 = z;
        this.f1455 = C0561.synchronizedSet(new LinkedHashSet());
        this.f1467 = C0561.synchronizedSet(new LinkedHashSet());
    }

    public C0244(AbstractC11015 abstractC11015) {
        this.f1455 = C0561.synchronizedSet(new LinkedHashSet());
        this.f1467 = C0561.synchronizedSet(new LinkedHashSet());
        if (abstractC11015 != null) {
            this.f1469 = abstractC11015.mo1662();
            this.f1456 = abstractC11015.mo1674();
            this.f1466 = abstractC11015.mo1640();
            this.f1468 = abstractC11015.getName();
            this.f1458 = abstractC11015.mo1671();
            this.f1461 = abstractC11015.mo1676();
            this.f1462 = abstractC11015.mo1656();
            this.f1470 = abstractC11015.mo1669();
            this.f1464 = abstractC11015.mo1658();
            this.f1459 = abstractC11015.mo1672();
            for (Inet6Address inet6Address : abstractC11015.mo1665()) {
                this.f1467.add(inet6Address);
            }
            for (Inet4Address inet4Address : abstractC11015.mo1653()) {
                this.f1455.add(inet4Address);
            }
        }
        this.f1457 = new C20001(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m1634(Map map) {
        HashMap map2 = new HashMap(5);
        EnumC6075 enumC6075 = EnumC6075.Domain;
        String str = "local";
        String str2 = map.containsKey(enumC6075) ? (String) map.get(enumC6075) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        map2.put(enumC6075, m1635(str));
        EnumC6075 enumC6076 = EnumC6075.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(enumC6076) ? (String) map.get(enumC6076) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        map2.put(enumC6076, m1635(str3));
        EnumC6075 enumC6077 = EnumC6075.Application;
        String str5 = "";
        String str6 = map.containsKey(enumC6077) ? (String) map.get(enumC6077) : "";
        if (str6 == null || str6.length() == 0) {
            str6 = "";
        }
        map2.put(enumC6077, m1635(str6));
        EnumC6075 enumC6078 = EnumC6075.Instance;
        String str7 = map.containsKey(enumC6078) ? (String) map.get(enumC6078) : "";
        if (str7 == null || str7.length() == 0) {
            str7 = "";
        }
        map2.put(enumC6078, m1635(str7));
        EnumC6075 enumC6079 = EnumC6075.Subtype;
        String str8 = map.containsKey(enumC6079) ? (String) map.get(enumC6079) : "";
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        map2.put(enumC6079, m1635(str5));
        return map2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m1635(String str) {
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
        return strTrim.endsWith(".") ? C20630.m46498(1, 0, strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m1638() {
        C20001 c20001 = this.f1457;
        c20001.lock();
        try {
            c20001.m38592(EnumC3066.f11545);
            c20001.mo38599(null);
            return false;
        } finally {
            c20001.unlock();
        }
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo1660() {
        String strMo1662 = mo1662();
        String strMo1674 = mo1674();
        String strMo1640 = mo1640();
        StringBuilder sb = new StringBuilder();
        sb.append(strMo1640.length() > 0 ? C16523.m38890("_", strMo1640, ".") : "");
        return C1694.m5622(sb, strMo1674.length() > 0 ? C16523.m38890("_", strMo1674, ".") : "", strMo1662, ".");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m1661() {
        String strMo1671 = mo1671();
        StringBuilder sb = new StringBuilder();
        sb.append(strMo1671.length() > 0 ? C16523.m38890("_", strMo1671, "._sub.") : "");
        sb.append(mo1660());
        return sb.toString();
    }

    @Override // l.AbstractC11015
    public final String getName() {
        String str = this.f1468;
        return str != null ? str : "";
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String mo1655() {
        if (this.f1463 == null) {
            this.f1463 = mo1670().toLowerCase();
        }
        return this.f1463;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1642(String str) {
        this.f1468 = str;
        this.f1463 = null;
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo1670() {
        String strMo1662 = mo1662();
        String strMo1674 = mo1674();
        String strMo1640 = mo1640();
        String name = getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name.length() > 0 ? name.concat(".") : "");
        sb.append(strMo1640.length() > 0 ? C16523.m38890("_", strMo1640, ".") : "");
        return C1694.m5622(sb, strMo1674.length() > 0 ? C16523.m38890("_", strMo1674, ".") : "", strMo1662, ".");
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String mo1657() {
        String str = this.f1460;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m1666(String str) {
        this.f1460 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1643(Inet4Address inet4Address) {
        this.f1455.add(inet4Address);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1644(Inet6Address inet6Address) {
        this.f1467.add(inet6Address);
    }

    @Override // l.AbstractC11015
    @Deprecated
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Inet4Address mo1637() {
        Inet4Address[] inet4AddressArrMo1653 = mo1653();
        if (inet4AddressArrMo1653.length > 0) {
            return inet4AddressArrMo1653[0];
        }
        return null;
    }

    @Override // l.AbstractC11015
    @Deprecated
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Inet6Address mo1675() {
        Inet6Address[] inet6AddressArrMo1665 = mo1665();
        if (inet6AddressArrMo1665.length > 0) {
            return inet6AddressArrMo1665[0];
        }
        return null;
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InetAddress[] mo1639() {
        Set set = this.f1455;
        int size = set.size();
        Set set2 = this.f1467;
        ArrayList arrayList = new ArrayList(set2.size() + size);
        arrayList.addAll(set);
        arrayList.addAll(set2);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Inet4Address[] mo1653() {
        Set set = this.f1455;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Inet6Address[] mo1665() {
        Set set = this.f1467;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int mo1676() {
        return this.f1461;
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int mo1669() {
        return this.f1470;
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int mo1656() {
        return this.f1462;
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final byte[] mo1658() {
        byte[] bArr = this.f1464;
        return (bArr == null || bArr.length <= 0) ? C15540.f50591 : bArr;
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo1640() {
        String str = this.f1466;
        return str != null ? str : "";
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo1662() {
        String str = this.f1469;
        return str != null ? str : "local";
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo1674() {
        String str = this.f1456;
        return str != null ? str : "tcp";
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String mo1671() {
        String str = this.f1458;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashMap m1654() {
        HashMap map = new HashMap(5);
        map.put(EnumC6075.Domain, mo1662());
        map.put(EnumC6075.Protocol, mo1674());
        map.put(EnumC6075.Application, mo1640());
        map.put(EnumC6075.Instance, getName());
        map.put(EnumC6075.Subtype, mo1671());
        return map;
    }

    @Override // l.InterfaceC11451
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1645(C1841 c1841, long j, AbstractC9604 abstractC9604) {
        if (!(abstractC9604 instanceof AbstractC19918)) {
            f1454.mo12129(abstractC9604 == null ? "null" : abstractC9604.getClass().getSimpleName(), "DNSEntry is not of type 'DNSRecord' but of type {}");
            return;
        }
        AbstractC19918 abstractC19918 = (AbstractC19918) abstractC9604;
        boolean z = true;
        if (abstractC19918.mo24471(j)) {
            InterfaceC4314 interfaceC4314 = f1454;
            int i = C15768.f51075[abstractC19918.m24467().ordinal()];
            if (i == 1 || i == 2) {
                if (!abstractC19918.m24477().equalsIgnoreCase(mo1657())) {
                    return;
                }
                InetAddress inetAddress = ((AbstractC7923) abstractC19918).f26022;
                if (EnumC14357.TYPE_A.equals(abstractC19918.m24467())) {
                    Inet4Address inet4Address = (Inet4Address) inetAddress;
                    if (this.f1455.remove(inet4Address)) {
                        interfaceC4314.mo12126(inet4Address, "Removed expired IPv4: {}");
                    } else {
                        interfaceC4314.mo12126(inet4Address, "Expired IPv4 not in this service: {}");
                        return;
                    }
                } else {
                    Inet6Address inet6Address = (Inet6Address) inetAddress;
                    if (this.f1467.remove(inet6Address)) {
                        interfaceC4314.mo12126(inet6Address, "Removed expired IPv6: {}");
                    } else {
                        interfaceC4314.mo12126(inet6Address, "Expired IPv6 not in this service: {}");
                        return;
                    }
                }
            } else {
                interfaceC4314.mo12129(abstractC19918, "Unhandled expired record: {}");
                return;
            }
        } else {
            Set set = this.f1467;
            Set set2 = this.f1455;
            int i2 = C15768.f51075[abstractC19918.m24467().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (!abstractC19918.m24477().equalsIgnoreCase(mo1670())) {
                                return;
                            }
                            this.f1464 = ((C15685) abstractC19918).m37381();
                            this.f1465 = null;
                        } else if (i2 != 5 || mo1671().length() != 0 || abstractC19918.m24473().length() == 0) {
                            return;
                        } else {
                            this.f1458 = abstractC19918.m24473();
                        }
                    } else {
                        if (!abstractC19918.m24477().equalsIgnoreCase(mo1670())) {
                            return;
                        }
                        C20623 c20623 = (C20623) abstractC19918;
                        String str = this.f1460;
                        if (str != null && str.equalsIgnoreCase(c20623.m46482())) {
                            z = false;
                        }
                        this.f1460 = c20623.m46482();
                        this.f1461 = c20623.m46481();
                        this.f1462 = c20623.m46483();
                        this.f1470 = c20623.m46484();
                        if (z) {
                            set2.clear();
                            set.clear();
                            Iterator it = c1841.m5994(this.f1460, EnumC14357.TYPE_A, EnumC23529.CLASS_IN).iterator();
                            while (it.hasNext()) {
                                mo1645(c1841, j, (AbstractC9604) it.next());
                            }
                            Iterator it2 = c1841.m5994(this.f1460, EnumC14357.TYPE_AAAA, EnumC23529.CLASS_IN).iterator();
                            while (it2.hasNext()) {
                                mo1645(c1841, j, (AbstractC9604) it2.next());
                            }
                            return;
                        }
                    }
                } else {
                    if (!abstractC19918.m24477().equalsIgnoreCase(mo1657())) {
                        return;
                    }
                    InetAddress inetAddress2 = ((AbstractC7923) abstractC19918).f26022;
                    if (!(inetAddress2 instanceof Inet6Address) || !set.add((Inet6Address) inetAddress2)) {
                        return;
                    }
                }
            } else {
                if (!abstractC19918.m24477().equalsIgnoreCase(mo1657())) {
                    return;
                }
                InetAddress inetAddress3 = ((AbstractC7923) abstractC19918).f26022;
                if (!(inetAddress3 instanceof Inet4Address) || !set2.add((Inet4Address) inetAddress3)) {
                    return;
                }
            }
        }
        C22823 c22823M38598 = this.f1457.m38598();
        if (c22823M38598 != null) {
            if (mo1673()) {
                c22823M38598.m50546(new C20706(c22823M38598, mo1660(), getName(), clone()));
            }
            synchronized (this) {
                notifyAll();
            }
            return;
        }
        f1454.mo12135("JmDNS not available.");
    }

    @Override // l.InterfaceC12157
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1648(AbstractC4955 abstractC4955) {
        this.f1457.mo1648(abstractC4955);
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m1652() {
        this.f1457.m38597();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m1636() {
        return this.f1457.m38596();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1646(AbstractC4249 abstractC4249) {
        this.f1457.m38593(abstractC4249);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1647(AbstractC4249 abstractC4249, EnumC3066 enumC3066) {
        this.f1457.m38594(abstractC4249, enumC3066);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m1667(AbstractC4249 abstractC4249, EnumC3066 enumC3066) {
        C20001 c20001 = this.f1457;
        c20001.lock();
        try {
            return c20001.f52742 == abstractC4249 && c20001.f52744 == enumC3066;
        } finally {
            c20001.unlock();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m1659() {
        return this.f1457.f52744.m9203();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m1668() {
        return this.f1457.f52744.m9200();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m1677() {
        return this.f1457.f52744.m9202();
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1663() {
        return this.f1457.m38591();
    }

    public final int hashCode() {
        return mo1670().hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0244) && mo1670().equals(((C0244) obj).mo1670());
    }

    @Override // l.AbstractC11015
    public final C0244 clone() {
        C0244 c0244 = new C0244(m1654(), this.f1461, this.f1462, this.f1470, this.f1459, this.f1464);
        c0244.f1460 = this.f1460;
        for (Inet6Address inet6Address : mo1665()) {
            c0244.f1467.add(inet6Address);
        }
        for (Inet4Address inet4Address : mo1653()) {
            c0244.f1455.add(inet4Address);
        }
        return c0244;
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
        sb.append(m1661());
        sb.append("' address: '");
        InetAddress[] inetAddressArrMo1639 = mo1639();
        if (inetAddressArrMo1639.length > 0) {
            for (InetAddress inetAddress : inetAddressArrMo1639) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(this.f1461);
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(this.f1461);
        }
        sb.append("' status: '");
        sb.append(this.f1457.toString());
        sb.append(this.f1459 ? "' is persistent," : "',");
        if (mo1673()) {
            sb.append(" has data");
        } else {
            sb.append(" has NO data");
        }
        if (mo1658().length > 0) {
            synchronized (this) {
                if (this.f1465 == null && mo1658() != null) {
                    Hashtable hashtable = new Hashtable();
                    try {
                        C15540.m37178(hashtable, mo1658());
                    } catch (Exception e) {
                        f1454.mo12122("Malformed TXT Field ", (Throwable) e);
                    }
                    this.f1465 = hashtable;
                }
                map = this.f1465;
                if (map == null) {
                    map = Collections.EMPTY_MAP;
                }
            }
            if (map.isEmpty()) {
                sb.append(", empty");
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    byte[] bArr = (byte[]) entry.getValue();
                    byte[] bArr2 = C15540.f50590;
                    String strM37177 = C15540.m37177(0, bArr.length, bArr);
                    sb.append("\n\t");
                    C0219.m1594(sb, (String) entry.getKey(), ": ", strM37177);
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m1641(EnumC23529 enumC23529, int i, C2983 c2983) {
        ArrayList arrayList = new ArrayList();
        if (enumC23529 != EnumC23529.CLASS_ANY && enumC23529 != EnumC23529.CLASS_IN) {
            return arrayList;
        }
        if (mo1671().length() > 0) {
            arrayList.add(new C7217(m1661(), EnumC23529.CLASS_IN, false, i, mo1670()));
        }
        String strMo1660 = mo1660();
        EnumC23529 enumC235210 = EnumC23529.CLASS_IN;
        arrayList.add(new C7217(strMo1660, enumC235210, false, i, mo1670()));
        arrayList.add(new C20623(mo1670(), enumC235210, true, i, this.f1470, this.f1462, this.f1461, c2983.f11191));
        arrayList.add(new C15685(mo1670(), enumC235210, true, i, mo1658()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1650(byte[] bArr) {
        this.f1464 = bArr;
        this.f1465 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1649(C22823 c22823) {
        this.f1457.mo38595(c22823);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C22823 m1664() {
        return this.f1457.m38598();
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean mo1672() {
        return this.f1459;
    }

    @Override // l.AbstractC11015
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1651(AbstractC11015 abstractC11015) {
        if (abstractC11015 instanceof C0244) {
            C0244 c0244 = (C0244) abstractC11015;
            Set set = c0244.f1467;
            Set set2 = c0244.f1455;
            Set set3 = this.f1455;
            if (set3.size() != set2.size()) {
                return false;
            }
            Set set4 = this.f1467;
            return set4.size() == set.size() && set3.equals(set2) && set4.equals(set);
        }
        InetAddress[] inetAddressArrMo1639 = mo1639();
        InetAddress[] inetAddressArrMo16310 = abstractC11015.mo1639();
        return inetAddressArrMo1639.length == inetAddressArrMo16310.length && new HashSet(Arrays.asList(inetAddressArrMo1639)).equals(new HashSet(Arrays.asList(inetAddressArrMo16310)));
    }
}
