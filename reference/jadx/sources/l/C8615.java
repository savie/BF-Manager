package l;

import com.google.android.material.motion.MotionUtils;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۠ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9JH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8615 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4382 f28169;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f28170;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f28171;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6117 f28172;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C10852 f28173;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C12828 f28174;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0150 f28175;

    public C8615(long j, C6117 c6117, C10852 c10852, EnumSet enumSet, C12828 c12828, C18049 c18049, C4382 c4382, EnumSet enumSet2, EnumSet enumSet3) {
        this.f28171 = j;
        this.f28172 = c6117;
        this.f28173 = c10852;
        C0150 c0150M42061 = c18049.m42061();
        this.f28175 = c0150M42061;
        this.f28174 = c12828;
        this.f28169 = c4382;
        this.f28170 = enumSet3.contains(EnumC19430.SMB2_SHAREFLAG_ENCRYPT_DATA) && c0150M42061.m1341().m37476() && c18049.m42066();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23238() {
        long j = this.f28171;
        C4382 c4382 = this.f28169;
        C10852 c10852 = this.f28173;
        try {
            C12453 c12453M27584 = c10852.m27584((C24652) new C9491(this.f28175.m1341(), c10852.m27586(), this.f28171), false);
            long jM31828 = this.f28174.m31828();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC6488 interfaceC6488 = C9469.f30684;
            C24652 c24652 = (C24652) C24388.m54498(jM31828, c12453M27584);
            if (!EnumC20243.m46514(((C18684) c24652.mo3632()).m43472())) {
                throw new C22172((C18684) c24652.mo3632(), "Error closing connection to " + this.f28172);
            }
            c4382.m13991(new C18552(c10852.m27586(), j));
        } catch (Throwable th) {
            c4382.m13991(new C18552(c10852.m27586(), j));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m23242() {
        return this.f28172.m17650();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m23241() {
        return this.f28171;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10852 m23244() {
        return this.f28173;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12828 m23243() {
        return this.f28174;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m23240() {
        return this.f28170;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0150 m23239() {
        return this.f28175;
    }

    public final String toString() {
        return "TreeConnect[" + this.f28171 + "](" + this.f28172 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
