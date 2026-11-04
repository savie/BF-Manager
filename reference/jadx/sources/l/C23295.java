package l;

import java.io.IOException;
import java.net.InetAddress;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩹ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public class C23295 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pattern f75457 = Pattern.compile(".*:.*|[0-9]+(\\.[0-9]+){3}");

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        c21362.m48602(inetAddress == null ? null : inetAddress.getHostAddress());
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        String strM13453 = c4208.m13453();
        if (this.f75457.matcher(strM13453).matches() || Boolean.getBoolean("gson.allowDnsInetAddress")) {
            return InetAddress.getByName(strM13453);
        }
        StringBuilder sbM51387 = C22783.m51387("Failed parsing '", strM13453, "' as InetAddress; at path ");
        sbM51387.append(c4208.m13451());
        sbM51387.append("; to allow DNS addresses, set system property gson.allowDnsInetAddress to \"true\"");
        throw new C7367(sbM51387.toString());
    }
}
