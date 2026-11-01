package l;

import com.alipay.sdk.m.w.a;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.᩷ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20623 extends AbstractC19918 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f67175 = C13488.m32998(C20623.class.getName());

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f67176;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f67177;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f67178;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f67179;

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo19185() {
        return true;
    }

    public C20623(String str, EnumC23529 enumC23529, boolean z, int i, int i2, int i3, int i4, String str2) {
        super(str, EnumC14357.TYPE_SRV, enumC23529, z, i);
        this.f67178 = i2;
        this.f67179 = i3;
        this.f67177 = i4;
        this.f67176 = str2;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final void mo19179(C5100 c5100) {
        c5100.writeShort(this.f67178);
        c5100.writeShort(this.f67179);
        c5100.writeShort(this.f67177);
        boolean z = C13568.f44758;
        String str = this.f67176;
        if (z) {
            c5100.m14210(str);
        } else {
            c5100.m14212(str.length(), str);
            c5100.writeByte(0);
        }
    }

    @Override // l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public final void mo20927(DataOutputStream dataOutputStream) throws IOException {
        super.mo20927(dataOutputStream);
        dataOutputStream.writeShort(this.f67178);
        dataOutputStream.writeShort(this.f67179);
        dataOutputStream.writeShort(this.f67177);
        try {
            dataOutputStream.write(this.f67176.getBytes(a.D));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m46482() {
        return this.f67176;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m46484() {
        return this.f67178;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m46483() {
        return this.f67179;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m46481() {
        return this.f67177;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19182(AbstractC19918 abstractC19918) {
        if (!(abstractC19918 instanceof C20623)) {
            return false;
        }
        C20623 c20623 = (C20623) abstractC19918;
        return this.f67178 == c20623.f67178 && this.f67179 == c20623.f67179 && this.f67177 == c20623.f67177 && this.f67176.equals(c20623.f67176);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x006f A[Catch: IOException -> 0x007d, TRY_LEAVE, TryCatch #0 {IOException -> 0x007d, blocks: (B:13:0x0061, B:15:0x006f), top: B:29:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19184(C22823 c22823) {
        InterfaceC4314 interfaceC4314;
        C20623 c20623;
        int iM24469;
        C0244 c0244 = (C0244) ((ConcurrentMapC13783) c22823.m50563()).get(m24470());
        if (c0244 != null && (c0244.m1668() || c0244.m1677())) {
            if (this.f67177 == c0244.mo1676()) {
                if (!this.f67176.equalsIgnoreCase(c22823.m50562().f11191)) {
                    InetAddress inetAddressM45208 = m45208();
                    interfaceC4314 = f67175;
                    interfaceC4314.mo12126(inetAddressM45208, "handleQuery() Conflicting probe detected from: {}");
                    c20623 = new C20623(c0244.mo1670(), EnumC23529.CLASS_IN, true, C17178.f54761, c0244.mo1669(), c0244.mo1656(), c0244.mo1676(), c22823.m50562().f11191);
                    try {
                        if (c22823.m50565().equals(m45208())) {
                            interfaceC4314.mo12132("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), c20623.toString());
                        }
                    } catch (IOException e) {
                        interfaceC4314.mo12122("IOException", (Throwable) e);
                    }
                    iM24469 = m24469((AbstractC19918) c20623);
                    if (iM24469 == 0) {
                        interfaceC4314.mo12135("handleQuery() Ignoring a identical service query");
                        return false;
                    }
                    if (c0244.m1659() && iM24469 > 0) {
                        String lowerCase = c0244.mo1670().toLowerCase();
                        InterfaceC10123 interfaceC10123M21103 = C8006.m21103();
                        InetAddress inetAddress = c22823.m50562().f11192;
                        c0244.m1642(((C8712) interfaceC10123M21103).m22545(c0244.getName(), EnumC19295.SERVICE));
                        ((ConcurrentMapC13783) c22823.m50563()).remove(lowerCase);
                        ((ConcurrentMapC13783) c22823.m50563()).put(c0244.mo1670().toLowerCase(), c0244);
                        interfaceC4314.mo12126(c0244.getName(), "handleQuery() Lost tie break: new unique name chosen:{}");
                        c0244.m1652();
                        return true;
                    }
                }
            } else {
                InetAddress inetAddressM45209 = m45208();
                interfaceC4314 = f67175;
                interfaceC4314.mo12126(inetAddressM45209, "handleQuery() Conflicting probe detected from: {}");
                c20623 = new C20623(c0244.mo1670(), EnumC23529.CLASS_IN, true, C17178.f54761, c0244.mo1669(), c0244.mo1656(), c0244.mo1676(), c22823.m50562().f11191);
                if (c22823.m50565().equals(m45208())) {
                    interfaceC4314.mo12132("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), c20623.toString());
                }
                iM24469 = m24469((AbstractC19918) c20623);
                if (iM24469 == 0) {
                    interfaceC4314.mo12135("handleQuery() Ignoring a identical service query");
                    return false;
                }
                if (c0244.m1659()) {
                    String lowerCase2 = c0244.mo1670().toLowerCase();
                    InterfaceC10123 interfaceC10123M21104 = C8006.m21103();
                    InetAddress inetAddress2 = c22823.m50562().f11192;
                    c0244.m1642(((C8712) interfaceC10123M21104).m22545(c0244.getName(), EnumC19295.SERVICE));
                    ((ConcurrentMapC13783) c22823.m50563()).remove(lowerCase2);
                    ((ConcurrentMapC13783) c22823.m50563()).put(c0244.mo1670().toLowerCase(), c0244);
                    interfaceC4314.mo12126(c0244.getName(), "handleQuery() Lost tie break: new unique name chosen:{}");
                    c0244.m1652();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19183(C22823 c22823) {
        C0244 c0244 = (C0244) ((ConcurrentMapC13783) c22823.m50563()).get(m24470());
        if (c0244 == null) {
            return false;
        }
        if (this.f67177 == c0244.mo1676()) {
            if (this.f67176.equalsIgnoreCase(c22823.m50562().f11191)) {
                return false;
            }
        }
        InterfaceC4314 interfaceC4314 = f67175;
        interfaceC4314.mo12135("handleResponse() Denial detected");
        if (c0244.m1659()) {
            String lowerCase = c0244.mo1670().toLowerCase();
            InterfaceC10123 interfaceC10123M21103 = C8006.m21103();
            InetAddress inetAddress = c22823.m50562().f11192;
            c0244.m1642(((C8712) interfaceC10123M21103).m22545(c0244.getName(), EnumC19295.SERVICE));
            ((ConcurrentMapC13783) c22823.m50563()).remove(lowerCase);
            ((ConcurrentMapC13783) c22823.m50563()).put(c0244.mo1670().toLowerCase(), c0244);
            interfaceC4314.mo12126(c0244.getName(), "handleResponse() New unique name chose:{}");
        }
        c0244.m1652();
        return true;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final C0244 mo19176(boolean z) {
        return new C0244(C0561.unmodifiableMap(this.f32353), this.f67177, this.f67179, this.f67178, z, null);
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final C20706 mo19177(C22823 c22823) {
        C0244 c0244Mo19176 = mo19176(false);
        c0244Mo19176.m1649(c22823);
        return new C20706(c22823, c0244Mo19176.mo1660(), c0244Mo19176.getName(), c0244Mo19176);
    }

    @Override // l.AbstractC19918, l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public final void mo19178(StringBuilder sb) {
        super.mo19178(sb);
        sb.append(" server: '");
        sb.append(this.f67176);
        sb.append(':');
        sb.append(this.f67177);
        sb.append('\'');
    }
}
