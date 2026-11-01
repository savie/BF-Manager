package l;

import java.io.IOException;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۖۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B3K */
/* JADX INFO: loaded from: classes2.dex */
public final class C2417 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f9696;

    static {
        AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690(TextBundle.TEXT_ENTRY);
        f9696 = abstractC20745M46690;
        if (abstractC20745M46690.mo33975() && !abstractC20745M46690.mo33974()) {
            abstractC20745M46690.mo24647();
        }
        try {
            abstractC20745M46690.m46739();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m7342() {
        return f9696;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m7346() {
        return f9696.m46690("current");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m7344() {
        return f9696.m46690("list");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m7347(String str) {
        return f9696.m46690(str + ".dat");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m7345(String str) {
        return f9696.m46690(str.concat(".tat"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m7343(String str) {
        return f9696.m46690(str.concat(".lit"));
    }
}
