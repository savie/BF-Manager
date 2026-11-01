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

/* JADX INFO: renamed from: l.ۨܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Z70F */
/* JADX INFO: loaded from: classes4.dex */
public final class C11828 implements InterfaceC20723 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Set f39719;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f39720;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22411 f39721;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f39722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10846 f39723;

    static {
        Object[] objArr = {"user-agent", "referer", "origin", "accept", "accept-language"};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f39719 = C0561.unmodifiableSet(hashSet);
    }

    public C11828(String str, C22411 c22411) {
        this.f39721 = c22411;
        try {
            String strM29495 = m29495(new URL(str));
            this.f39722 = strM29495;
            this.f39723 = new C10846();
            if (c22411.m49696().isEmpty()) {
                this.f39720 = "";
                return;
            }
            MessageDigest messageDigestM49421 = C22253.m49421();
            C22253.m49418(messageDigestM49421, strM29495 + '\n' + c22411.m49695() + '\n');
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap.putAll(c22411.m49696());
            for (Map.Entry entry : treeMap.entrySet()) {
                C22253.m49418(messageDigestM49421, ((String) entry.getKey()).toLowerCase(Locale.ROOT) + ':' + ((String) entry.getValue()) + '\n');
            }
            this.f39720 = C22253.m49424(messageDigestM49421.digest());
            C10846 c10846 = this.f39723;
            c10846.m27201(c22411.m49696());
            c10846.m27202(new C9836(this));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid stream source URL", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m29496(URL url, AbstractMap abstractMap) {
        C22411 c22411 = this.f39721;
        if (c22411.m49695() || this.f39722.equals(m29495(url))) {
            return abstractMap;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(abstractMap);
        for (String str : c22411.m49696().keySet()) {
            if (!f39719.contains(str.toLowerCase(Locale.ROOT))) {
                treeMap.remove(str);
            }
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29495(URL url) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m29497() {
        return this.f39720;
    }

    @Override // l.InterfaceC20723
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15785 mo4000() {
        return this.f39723.mo4000();
    }
}
