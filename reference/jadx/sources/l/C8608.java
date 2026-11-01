package l;

import com.alipay.sdk.m.y.l;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: l.ۡۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8608 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16328 f29716;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Proxy f29717;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress f29718;

    public C8608(C16328 c16328, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c16328 == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f29716 = c16328;
        this.f29717 = proxy;
        this.f29718 = inetSocketAddress;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16328 m22383() {
        return this.f29716;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Proxy m22385() {
        return this.f29717;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress m22382() {
        return this.f29718;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m22384() {
        return this.f29716.f52600 != null && this.f29717.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8608)) {
            return false;
        }
        C8608 c8608 = (C8608) obj;
        return c8608.f29716.equals(this.f29716) && c8608.f29717.equals(this.f29717) && c8608.f29718.equals(this.f29718);
    }

    public final int hashCode() {
        return this.f29718.hashCode() + ((this.f29717.hashCode() + ((this.f29716.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f29718 + l.d;
    }
}
