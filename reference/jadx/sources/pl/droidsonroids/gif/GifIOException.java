package pl.droidsonroids.gif;

import java.io.IOException;
import l.EnumC3141;

/* JADX INFO: loaded from: classes2.dex */
public class GifIOException extends IOException {
    public static final long serialVersionUID = 13038402904505L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f82017;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC3141 f82018;

    @Override // java.lang.Throwable
    public final String getMessage() {
        EnumC3141 enumC3141 = this.f82018;
        String str = this.f82017;
        if (str == null) {
            return enumC3141.m10263();
        }
        return enumC3141.m10263() + ": " + str;
    }

    public GifIOException(int i, String str) {
        this.f82018 = EnumC3141.m10260(i);
        this.f82017 = str;
    }
}
