package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6460 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6460 f21722 = new C16900();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Set mo18261();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC3476 mo18262();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC3476 mo18263();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC3476 mo18264();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC6460 m18259(C24975 c24975, int i) {
        if (i == 0) {
            return f21722;
        }
        return new C12425(c24975, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m18258(C24975 c24975, int i) {
        if (i != 0) {
            return new C17646(c24975, i, c24975.m55818().mo8719(i));
        }
        return AbstractC8639.of();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m18260(C24975 c24975, int i) {
        if (i > 0) {
            return new C16154(c24975, i, c24975.m55818().mo8719(i));
        }
        return AbstractC1928.of();
    }
}
