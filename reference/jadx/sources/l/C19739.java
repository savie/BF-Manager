package l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ᩴۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19739 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63530 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Logger f63533 = Logger.getLogger(C19739.class.getName());

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f63536 = new int[0];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C24478[] f63537 = new C24478[0];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C7323[] f63538 = new C7323[0];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C8069[] f63532 = new C8069[0];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C22723[] f63534 = new C22723[0];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C10788[] f63535 = new C10788[0];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f63531 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile C11996 f63529 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16471 m45482(EnumC5810 enumC5810) {
        int i = C11996.f38661;
        int i2 = C12543.f40257;
        C9780 c9780 = C21209.f67697;
        if (f63529 == null) {
            synchronized (C19739.class) {
                if (f63529 == null) {
                    try {
                        C20485 c20485M46986 = C20485.m46986();
                        c20485M46986.m46988(C21209.f67697);
                        f63529 = C11996.m30155("\n\u001d\u0018æ\u0007\"\u0003Ê>\u0000*\u0013\b\u0001\u0010\u0002\u0018\u0002 \u0003(\u00010\u0002Ê>\u0004\b\u0001\u0010\u0001\n\u001d\u0018ç\u0007\"\u0003Ê>\u0000*\u0013\b\u0002\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001\n\u001d\u0018è\u0007\"\u0013\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001*\u0003Ê>\u0000 æ\u0007(è\u0007".getBytes(C23447.f75889), c20485M46986);
                    } catch (Exception e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
        C11996 c11996 = f63529;
        if (enumC5810.getNumber() < c11996.m30162().getNumber()) {
            throw new IllegalArgumentException("Edition " + enumC5810 + " is lower than the minimum supported edition " + c11996.m30162() + "!");
        }
        if (enumC5810.getNumber() > c11996.m30160().getNumber()) {
            throw new IllegalArgumentException("Edition " + enumC5810 + " is greater than the maximum supported edition " + c11996.m30160() + "!");
        }
        C20201 c20201 = null;
        for (C20201 c20202 : c11996.m30161()) {
            if (c20202.m46463().getNumber() > enumC5810.getNumber()) {
                break;
            }
            c20201 = c20202;
        }
        if (c20201 == null) {
            throw new IllegalArgumentException("Edition " + enumC5810 + " does not have a valid default FeatureSet!");
        }
        C7301 builder = c20201.m46462().toBuilder();
        builder.m19969(c20201.m46464());
        return builder.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16471 m45483(C16471 c16471) {
        C16471 c16472 = (C16471) f63531.putIfAbsent(Integer.valueOf(c16471.hashCode()), c16471);
        return c16472 == null ? c16471 : c16472;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45480(C14034 c14034, C24478 c24478, String str) {
        if (c24478 == null) {
            String strM34198 = c14034.m34198();
            return !strM34198.isEmpty() ? C8008.m21875('.', strM34198, str) : str;
        }
        return c24478.mo5002() + '.' + str;
    }
}
