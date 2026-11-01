package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.۬ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9GY */
/* JADX INFO: loaded from: classes3.dex */
public final class C13159 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumC8949 f43823;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC19532 f43824;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f43826;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final UUID f43827;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3985 f43828;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumSet f43829;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f43830;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C19447 f43831;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f43821 = new byte[0];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f43825 = 1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f43822 = false;

    public C13159(UUID uuid, String str, int i, C16418 c16418) {
        this.f43827 = uuid;
        this.f43829 = EnumSet.copyOf((Collection) c16418.m38661());
        this.f43831 = new C19447(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32540(C19509 c19509) {
        C1892 c1892M44568 = c19509.m44568();
        this.f43831 = c19509.m44570();
        this.f43828 = new C3985(c1892M44568.m6151(), c1892M44568.m6159(), c1892M44568.m6152(), c1892M44568.m6155(), this.f43831.m44496().contains(EnumC24036.SMB2_GLOBAL_CAP_LARGE_MTU));
        this.f43824 = c19509.m44566();
        this.f43830 = c19509.m44569();
        this.f43823 = c19509.m44565();
        this.f43826 = c19509.m44567() != null ? c19509.m44567() : new byte[0];
        System.currentTimeMillis();
        c1892M44568.m6153().m5535();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final UUID m32538() {
        return this.f43827;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m32543() {
        return (this.f43831.m44500() & 2) > 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3985 m32548() {
        return this.f43828;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m32542() {
        byte[] bArr = this.f43821;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumSet m32544() {
        return this.f43829;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC19532 m32546() {
        return this.f43824;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m32549() {
        if (this.f43828.m11484() == EnumC20508.SMB_3_1_1) {
            return this.f43824 != null;
        }
        EnumC24036 enumC24036 = EnumC24036.SMB2_GLOBAL_CAP_ENCRYPTION;
        return this.f43829.contains(enumC24036) && this.f43831.m44496().contains(enumC24036);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32541() {
        return this.f43822 && this.f43828.m11484().m46306() && m32549();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m32547() {
        return this.f43831.m44496().contains(EnumC24036.SMB2_GLOBAL_CAP_LARGE_MTU);
    }

    public final String toString() {
        return "ConnectionContext{\n  serverGuid=" + this.f43831.m44495() + ",\n  serverName='" + this.f43831.m44499() + "',\n  negotiatedProtocol=" + this.f43828 + ",\n  clientGuid=" + this.f43827 + ",\n  clientCapabilities=" + this.f43829 + ",\n  serverCapabilities=" + this.f43831.m44496() + ",\n  clientSecurityMode=" + this.f43825 + ",\n  serverSecurityMode=" + this.f43831.m44500() + ",\n  server='" + this.f43831 + "'\n}";
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C19447 m32539() {
        return this.f43831;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC8949 m32537() {
        return this.f43823;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] m32545() {
        return this.f43826;
    }
}
