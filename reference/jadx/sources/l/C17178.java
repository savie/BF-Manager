package l;

/* JADX INFO: renamed from: l.ܿۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 29YC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17178 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f54758;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f54761;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String f54760 = System.getProperty("net.mdns.ipv4", "224.0.0.251");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String f54757 = System.getProperty("net.mdns.ipv6", "FF02::FB");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int f54759 = Integer.getInteger("net.mdns.port", 5353).intValue();

    static {
        int iIntValue = Integer.getInteger("net.dns.ttl", 3600).intValue();
        f54761 = iIntValue;
        f54758 = iIntValue * 500;
    }
}
