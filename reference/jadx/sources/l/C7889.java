package l;

import com.google.android.material.motion.MotionUtils;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۠ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9JH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7889 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f25937;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3985 f25938;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5335 f25939;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20858 f25940;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f25941;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16418 f25942;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11748 f25943;

    public C7889(long j, C11748 c11748, C20858 c20858, EnumSet enumSet, C16418 c16418, C13159 c13159, C5335 c5335, EnumSet enumSet2, EnumSet enumSet3) {
        this.f25937 = j;
        this.f25943 = c11748;
        this.f25940 = c20858;
        C3985 c3985M32548 = c13159.m32548();
        this.f25938 = c3985M32548;
        this.f25942 = c16418;
        this.f25939 = c5335;
        this.f25941 = enumSet3.contains(EnumC6831.SMB2_SHAREFLAG_ENCRYPT_DATA) && c3985M32548.m11484().m46306() && c13159.m32549();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20818() {
        long j = this.f25937;
        C5335 c5335 = this.f25939;
        C20858 c20858 = this.f25940;
        try {
            C13557 c13557M46889 = c20858.m46889((C11771) new C21276(this.f25938.m11484(), c20858.m46886(), this.f25937), false);
            long jM38674 = this.f25942.m38674();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC11440 interfaceC11440 = C21317.f69360;
            C11771 c11771 = (C11771) C2266.m6947(jM38674, c13557M46889);
            if (!EnumC3055.m9152(((C1186) c11771.mo25478()).m4349())) {
                throw new C10360((C1186) c11771.mo25478(), "Error closing connection to " + this.f25943);
            }
            c5335.m14813(new C13097(c20858.m46886(), j));
        } catch (Throwable th) {
            c5335.m14813(new C13097(c20858.m46886(), j));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m20819() {
        return this.f25943.m29357();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m20822() {
        return this.f25937;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20858 m20817() {
        return this.f25940;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16418 m20821() {
        return this.f25942;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m20816() {
        return this.f25941;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3985 m20820() {
        return this.f25938;
    }

    public final String toString() {
        return "TreeConnect[" + this.f25937 + "](" + this.f25943 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
