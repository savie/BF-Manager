package l;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18960 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f61394;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InetAddress f61395;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InetAddress f61396;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InetAddress f61397;

    public C18960(InetAddress inetAddress, InetAddress inetAddress2, InetAddress inetAddress3, List list) {
        this.f61396 = inetAddress;
        this.f61397 = inetAddress2;
        this.f61395 = inetAddress3;
        this.f61394 = C0561.unmodifiableList(new ArrayList(list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18960(InetAddress inetAddress, InetAddress inetAddress2, List list) {
        InetAddress inetAddressM42445;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            inetAddressM42445 = ((C18254) it.next()).m42445();
            if (inetAddressM42445 != null) {
                this(inetAddress, inetAddress2, inetAddressM42445, list);
            }
        }
        inetAddressM42445 = null;
        this(inetAddress, inetAddress2, inetAddressM42445, list);
    }
}
