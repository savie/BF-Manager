package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20681 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f66303;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14560 f66304;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14560 f66305;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC16205 f66306;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f66307;

    public C20681(C14560 c14560, C14560 c14561) {
        this.f66304 = c14560;
        this.f66305 = c14561;
        this.f66303 = m47304() ? new C14307() : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47303(C14560 c14560, C20681 c20681) {
        C11392.putIfAbsent(this.f66303, c14560, c20681);
        if (this.f66303.size() == 20) {
            this.f66303 = new HashMap(this.f66303);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47304() {
        C14560 c14560 = this.f66305;
        int length = c14560.length();
        return length == 0 || c14560.charAt(length - 1) == '/';
    }
}
