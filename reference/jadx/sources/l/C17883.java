package l;

import java.util.EventListener;

/* JADX INFO: renamed from: l.ᩳۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: EA25 */
/* JADX INFO: loaded from: classes4.dex */
public class C17883 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EventListener f56640;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f56641;

    public C17883(InterfaceC23715 interfaceC23715, boolean z) {
        this.f56640 = interfaceC23715;
        this.f56641 = z;
    }

    public final int hashCode() {
        return this.f56640.hashCode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EventListener m41505() {
        return this.f56640;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41506() {
        return this.f56641;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17883) {
            return this.f56640.equals(((C17883) obj).f56640);
        }
        return false;
    }
}
