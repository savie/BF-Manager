package l;

import java.io.IOException;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩶ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B3K */
/* JADX INFO: loaded from: classes5.dex */
public final class C21301 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f67909;

    static {
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876(TextBundle.TEXT_ENTRY);
        f67909 = abstractC22044M49876;
        if (abstractC22044M49876.mo2934() && !abstractC22044M49876.mo4281()) {
            abstractC22044M49876.mo4296();
        }
        try {
            abstractC22044M49876.m49853();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m48536() {
        return f67909;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m48540() {
        return f67909.m49876("current");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m48538() {
        return f67909.m49876("list");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m48541(String str) {
        return f67909.m49876(str + ".dat");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m48539(String str) {
        return f67909.m49876(str.concat(".tat"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m48537(String str) {
        return f67909.m49876(str.concat(".lit"));
    }
}
