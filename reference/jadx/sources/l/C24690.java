package l;

import bin.mt.plus.Features;

/* JADX INFO: renamed from: l.᩻֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2ISH */
/* JADX INFO: loaded from: classes.dex */
public final class C24690 extends AbstractC12486 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C24690 f79904 = new C24690("FFmpeg", "ffmpegJNI", "libffmpegJNI.so", "ffmpeg", "/assets/ffmpeg");

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ۙ */
    public final String mo31026(String str) {
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m55038() {
        try {
            f79904.m31027();
        } catch (C11263 e) {
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e.getMessage());
            unsatisfiedLinkError.initCause(e);
            throw unsatisfiedLinkError;
        }
    }

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ᩷ */
    public final String mo31029() {
        return Features.getABI();
    }

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ᩷ */
    public final C20691 mo31030(String str) {
        if (str.equals("arm64-v8a")) {
            return new C20691(1235192L, "8a4a5a08835f6155ff8edc25ad560958ea0d1056052cd966a9c763ba09fcdfb8");
        }
        return null;
    }

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ۙ */
    public final RuntimeException mo31025(String str, Throwable th) {
        return new C11263(str, th);
    }
}
