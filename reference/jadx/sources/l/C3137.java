package l;

/* JADX INFO: renamed from: l.ۗۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 29YC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f10164;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f10167;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f10165 = System.getProperty("net.mdns.ipv4", "224.0.0.251");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f10168 = System.getProperty("net.mdns.ipv6", "FF02::FB");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int f10166 = Integer.getInteger("net.mdns.port", 5353).intValue();

    static {
        int iIntValue = Integer.getInteger("net.dns.ttl", 3600).intValue();
        f10167 = iIntValue;
        f10164 = iIntValue * 500;
    }
}
