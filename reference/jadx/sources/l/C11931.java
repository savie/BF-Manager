package l;

import com.alipay.sdk.m.w.a;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۧ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11931 extends AbstractC17152 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f38427 = C16980.m40038(C11931.class.getName());

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f38428;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f38429;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f38430;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38431;

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo7640() {
        return true;
    }

    public C11931(String str, EnumC6121 enumC6121, boolean z, int i, int i2, int i3, int i4, String str2) {
        super(str, EnumC24021.TYPE_SRV, enumC6121, z, i);
        this.f38431 = i2;
        this.f38430 = i3;
        this.f38429 = i4;
        this.f38428 = str2;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final void mo7635(C10219 c10219) {
        c10219.writeShort(this.f38431);
        c10219.writeShort(this.f38430);
        c10219.writeShort(this.f38429);
        boolean z = C0525.f2219;
        String str = this.f38428;
        if (z) {
            c10219.m26355(str);
        } else {
            c10219.m26357(str.length(), str);
            c10219.writeByte(0);
        }
    }

    @Override // l.AbstractC14694
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29889(DataOutputStream dataOutputStream) throws IOException {
        super.mo29889(dataOutputStream);
        dataOutputStream.writeShort(this.f38431);
        dataOutputStream.writeShort(this.f38430);
        dataOutputStream.writeShort(this.f38429);
        try {
            dataOutputStream.write(this.f38428.getBytes(a.D));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m29891() {
        return this.f38428;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m29892() {
        return this.f38431;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m29890() {
        return this.f38430;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m29888() {
        return this.f38429;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7638(AbstractC17152 abstractC17152) {
        if (!(abstractC17152 instanceof C11931)) {
            return false;
        }
        C11931 c11931 = (C11931) abstractC17152;
        return this.f38431 == c11931.f38431 && this.f38430 == c11931.f38430 && this.f38429 == c11931.f38429 && this.f38428.equals(c11931.f38428);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x006f A[Catch: IOException -> 0x007d, TRY_LEAVE, TryCatch #0 {IOException -> 0x007d, blocks: (B:13:0x0061, B:15:0x006f), top: B:29:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo7639(C14168 c14168) {
        InterfaceC25186 interfaceC25186;
        C11931 c11931;
        int iM35349;
        C17307 c17307 = (C17307) ((ConcurrentMapC17249) c14168.m34445()).get(m35350());
        if (c17307 != null && (c17307.m40635() || c17307.m40647())) {
            if (this.f38429 == c17307.mo30952()) {
                if (!this.f38428.equalsIgnoreCase(c14168.m34408().f69056)) {
                    InetAddress inetAddressM40300 = m40300();
                    interfaceC25186 = f38427;
                    interfaceC25186.mo13716(inetAddressM40300, "handleQuery() Conflicting probe detected from: {}");
                    c11931 = new C11931(c17307.mo30944(), EnumC6121.CLASS_IN, true, C3137.f10167, c17307.mo30945(), c17307.mo30951(), c17307.mo30952(), c14168.m34408().f69056);
                    try {
                        if (c14168.m34448().equals(m40300())) {
                            interfaceC25186.mo13710("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), c11931.toString());
                        }
                    } catch (IOException e) {
                        interfaceC25186.mo13702("IOException", (Throwable) e);
                    }
                    iM35349 = m35349((AbstractC17152) c11931);
                    if (iM35349 == 0) {
                        interfaceC25186.mo13721("handleQuery() Ignoring a identical service query");
                        return false;
                    }
                    if (c17307.m40645() && iM35349 > 0) {
                        String lowerCase = c17307.mo30944().toLowerCase();
                        InterfaceC5375 interfaceC5375M45079 = C19545.m45079();
                        InetAddress inetAddress = c14168.m34408().f69055;
                        c17307.m40637(((C12832) interfaceC5375M45079).m31861(c17307.getName(), EnumC15069.SERVICE));
                        ((ConcurrentMapC17249) c14168.m34445()).remove(lowerCase);
                        ((ConcurrentMapC17249) c14168.m34445()).put(c17307.mo30944().toLowerCase(), c17307);
                        interfaceC25186.mo13716(c17307.getName(), "handleQuery() Lost tie break: new unique name chosen:{}");
                        c17307.m40644();
                        return true;
                    }
                }
            } else {
                InetAddress inetAddressM40301 = m40300();
                interfaceC25186 = f38427;
                interfaceC25186.mo13716(inetAddressM40301, "handleQuery() Conflicting probe detected from: {}");
                c11931 = new C11931(c17307.mo30944(), EnumC6121.CLASS_IN, true, C3137.f10167, c17307.mo30945(), c17307.mo30951(), c17307.mo30952(), c14168.m34408().f69056);
                if (c14168.m34448().equals(m40300())) {
                    interfaceC25186.mo13710("Got conflicting probe from ourselves\nincoming: {}\nlocal   : {}", toString(), c11931.toString());
                }
                iM35349 = m35349((AbstractC17152) c11931);
                if (iM35349 == 0) {
                    interfaceC25186.mo13721("handleQuery() Ignoring a identical service query");
                    return false;
                }
                if (c17307.m40645()) {
                    String lowerCase2 = c17307.mo30944().toLowerCase();
                    InterfaceC5375 interfaceC5375M450710 = C19545.m45079();
                    InetAddress inetAddress2 = c14168.m34408().f69055;
                    c17307.m40637(((C12832) interfaceC5375M450710).m31861(c17307.getName(), EnumC15069.SERVICE));
                    ((ConcurrentMapC17249) c14168.m34445()).remove(lowerCase2);
                    ((ConcurrentMapC17249) c14168.m34445()).put(c17307.mo30944().toLowerCase(), c17307);
                    interfaceC25186.mo13716(c17307.getName(), "handleQuery() Lost tie break: new unique name chosen:{}");
                    c17307.m40644();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7637(C14168 c14168) {
        C17307 c17307 = (C17307) ((ConcurrentMapC17249) c14168.m34445()).get(m35350());
        if (c17307 == null) {
            return false;
        }
        if (this.f38429 == c17307.mo30952()) {
            if (this.f38428.equalsIgnoreCase(c14168.m34408().f69056)) {
                return false;
            }
        }
        InterfaceC25186 interfaceC25186 = f38427;
        interfaceC25186.mo13721("handleResponse() Denial detected");
        if (c17307.m40645()) {
            String lowerCase = c17307.mo30944().toLowerCase();
            InterfaceC5375 interfaceC5375M45079 = C19545.m45079();
            InetAddress inetAddress = c14168.m34408().f69055;
            c17307.m40637(((C12832) interfaceC5375M45079).m31861(c17307.getName(), EnumC15069.SERVICE));
            ((ConcurrentMapC17249) c14168.m34445()).remove(lowerCase);
            ((ConcurrentMapC17249) c14168.m34445()).put(c17307.mo30944().toLowerCase(), c17307);
            interfaceC25186.mo13716(c17307.getName(), "handleResponse() New unique name chose:{}");
        }
        c17307.m40644();
        return true;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final C17307 mo7633(boolean z) {
        return new C17307(C4681.unmodifiableMap(this.f48028), this.f38429, this.f38430, this.f38431, z, null);
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final C11340 mo7632(C14168 c14168) {
        C17307 c17307Mo7633 = mo7633(false);
        c17307Mo7633.m40642(c14168);
        return new C11340(c14168, c17307Mo7633.mo30939(), c17307Mo7633.getName(), c17307Mo7633);
    }

    @Override // l.AbstractC17152, l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public final void mo7634(StringBuilder sb) {
        super.mo7634(sb);
        sb.append(" server: '");
        sb.append(this.f38428);
        sb.append(':');
        sb.append(this.f38429);
        sb.append('\'');
    }
}
