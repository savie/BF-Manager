package l;

import com.alipay.sdk.m.y.l;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: l.ۜܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7208 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13306 f23785;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Proxy f23786;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress f23787;

    public C7208(C13306 c13306, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c13306 == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f23785 = c13306;
        this.f23786 = proxy;
        this.f23787 = inetSocketAddress;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13306 m19793() {
        return this.f23785;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Proxy m19795() {
        return this.f23786;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InetSocketAddress m19796() {
        return this.f23787;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m19794() {
        return this.f23785.f42473 != null && this.f23786.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7208)) {
            return false;
        }
        C7208 c7208 = (C7208) obj;
        return c7208.f23785.equals(this.f23785) && c7208.f23786.equals(this.f23786) && c7208.f23787.equals(this.f23787);
    }

    public final int hashCode() {
        return this.f23787.hashCode() + ((this.f23786.hashCode() + ((this.f23785.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f23787 + l.d;
    }
}
