package pl.droidsonroids.gif;

import java.io.IOException;
import l.EnumC2362;

/* JADX INFO: loaded from: classes2.dex */
public class GifIOException extends IOException {
    public static final long serialVersionUID = 13038402904505L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f77901;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC2362 f77902;

    @Override // java.lang.Throwable
    public final String getMessage() {
        EnumC2362 enumC2362 = this.f77902;
        String str = this.f77901;
        if (str == null) {
            return enumC2362.m7184();
        }
        return enumC2362.m7184() + ": " + str;
    }

    public GifIOException(int i, String str) {
        this.f77902 = EnumC2362.m7181(i);
        this.f77901 = str;
    }
}
