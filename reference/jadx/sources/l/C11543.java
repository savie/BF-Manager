package l;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۧۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z70F */
/* JADX INFO: loaded from: classes4.dex */
public final class C11543 implements InterfaceC15670 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Set f36301;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f36302;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17510 f36303;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f36304;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16416 f36305;

    static {
        Object[] objArr = {"user-agent", "referer", "origin", "accept", "accept-language"};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f36301 = C4681.unmodifiableSet(hashSet);
    }

    public C11543(String str, C17510 c17510) {
        this.f36303 = c17510;
        try {
            String strM29049 = m29049(new URL(str));
            this.f36302 = strM29049;
            this.f36305 = new C16416();
            if (c17510.m41129().isEmpty()) {
                this.f36304 = "";
                return;
            }
            MessageDigest messageDigestM36179 = C15022.m36179();
            C15022.m36176(messageDigestM36179, strM29049 + '\n' + c17510.m41128() + '\n');
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap.putAll(c17510.m41129());
            for (Map.Entry entry : treeMap.entrySet()) {
                C15022.m36176(messageDigestM36179, ((String) entry.getKey()).toLowerCase(Locale.ROOT) + ':' + ((String) entry.getValue()) + '\n');
            }
            this.f36304 = C15022.m36182(messageDigestM36179.digest());
            C16416 c16416 = this.f36305;
            c16416.m38980(c17510.m41129());
            c16416.m38981(new C15866(this));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid stream source URL", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m29050(URL url, AbstractMap abstractMap) {
        C17510 c17510 = this.f36303;
        if (c17510.m41128() || this.f36302.equals(m29049(url))) {
            return abstractMap;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(abstractMap);
        for (String str : c17510.m41129().keySet()) {
            if (!f36301.contains(str.toLowerCase(Locale.ROOT))) {
                treeMap.remove(str);
            }
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29049(URL url) {
        int defaultPort = url.getPort() == -1 ? url.getDefaultPort() : url.getPort();
        StringBuilder sb = new StringBuilder();
        String protocol = url.getProtocol();
        Locale locale = Locale.ROOT;
        sb.append(protocol.toLowerCase(locale));
        sb.append("://");
        sb.append(url.getHost().toLowerCase(locale));
        sb.append(':');
        sb.append(defaultPort);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m29051() {
        return this.f36304;
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13433 mo3996() {
        return this.f36305.mo3996();
    }
}
