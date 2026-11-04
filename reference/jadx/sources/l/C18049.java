package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܿۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9GY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18049 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC5018 f59096;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC14208 f59097;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C0150 f59098;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UUID f59099;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f59100;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f59102;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumSet f59104;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7365 f59106;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f59101 = new byte[0];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f59103 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f59105 = false;

    public C18049(UUID uuid, String str, int i, C12828 c12828) {
        this.f59099 = uuid;
        this.f59104 = EnumSet.copyOf((Collection) c12828.m31818());
        this.f59106 = new C7365(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42055(C6862 c6862) {
        C23664 c23664M19102 = c6862.m19102();
        this.f59106 = c6862.m19103();
        this.f59098 = new C0150(c23664M19102.m52893(), c23664M19102.m52901(), c23664M19102.m52896(), c23664M19102.m52898(), this.f59106.m20220().contains(EnumC17938.SMB2_GLOBAL_CAP_LARGE_MTU));
        this.f59097 = c6862.m19101();
        this.f59102 = c6862.m19105();
        this.f59096 = c6862.m19106();
        this.f59100 = c6862.m19104() != null ? c6862.m19104() : new byte[0];
        System.currentTimeMillis();
        c23664M19102.m52894().m52144();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final UUID m42065() {
        return this.f59099;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m42059() {
        return (this.f59106.m20223() & 2) > 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0150 m42061() {
        return this.f59098;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m42063() {
        byte[] bArr = this.f59101;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumSet m42058() {
        return this.f59104;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC14208 m42064() {
        return this.f59097;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m42066() {
        if (this.f59098.m1341() == EnumC15700.SMB_3_1_1) {
            return this.f59097 != null;
        }
        EnumC17938 enumC17938 = EnumC17938.SMB2_GLOBAL_CAP_ENCRYPTION;
        return this.f59104.contains(enumC17938) && this.f59106.m20220().contains(enumC17938);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42056() {
        return this.f59105 && this.f59098.m1341().m37476() && m42066();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m42062() {
        return this.f59106.m20220().contains(EnumC17938.SMB2_GLOBAL_CAP_LARGE_MTU);
    }

    public final String toString() {
        return "ConnectionContext{\n  serverGuid=" + this.f59106.m20226() + ",\n  serverName='" + this.f59106.m20224() + "',\n  negotiatedProtocol=" + this.f59098 + ",\n  clientGuid=" + this.f59099 + ",\n  clientCapabilities=" + this.f59104 + ",\n  serverCapabilities=" + this.f59106.m20220() + ",\n  clientSecurityMode=" + this.f59103 + ",\n  serverSecurityMode=" + this.f59106.m20223() + ",\n  server='" + this.f59106 + "'\n}";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7365 m42054() {
        return this.f59106;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC5018 m42060() {
        return this.f59096;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m42057() {
        return this.f59100;
    }
}
