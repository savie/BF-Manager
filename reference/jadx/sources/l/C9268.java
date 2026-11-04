package l;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9268 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InetAddress f30145;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InetAddress f30146;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InetAddress f30147;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f30148;

    public C9268(InetAddress inetAddress, InetAddress inetAddress2, InetAddress inetAddress3, List list) {
        this.f30146 = inetAddress;
        this.f30147 = inetAddress2;
        this.f30145 = inetAddress3;
        this.f30148 = C4681.unmodifiableList(new ArrayList(list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9268(InetAddress inetAddress, InetAddress inetAddress2, List list) {
        InetAddress inetAddressM4002;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            inetAddressM4002 = ((C1066) it.next()).m4002();
            if (inetAddressM4002 != null) {
                this(inetAddress, inetAddress2, inetAddressM4002, list);
            }
        }
        inetAddressM4002 = null;
        this(inetAddress, inetAddress2, inetAddressM4002, list);
    }
}
