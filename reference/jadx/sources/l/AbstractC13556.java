package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13556 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC13556 f44726 = new C10921();

    /* JADX INFO: renamed from: ۖ */
    public abstract InterfaceC9510 mo12232();

    /* JADX INFO: renamed from: ۙ */
    public abstract Set mo12233();

    /* JADX INFO: renamed from: ۨ */
    public abstract InterfaceC9510 mo12234();

    /* JADX INFO: renamed from: ܰ */
    public abstract InterfaceC9510 mo12235();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC13556 m33144(C17684 c17684, int i) {
        if (i == 0) {
            return f44726;
        }
        return new C4382(c17684, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m33143(C17684 c17684, int i) {
        if (i != 0) {
            return new C23621(c17684, i, c17684.m41166().mo9809(i));
        }
        return AbstractC23844.of();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m33145(C17684 c17684, int i) {
        if (i > 0) {
            return new C14449(c17684, i, c17684.m41166().mo9809(i));
        }
        return AbstractC22433.of();
    }
}
