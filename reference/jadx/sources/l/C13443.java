package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13443 implements InterfaceC4954 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42803 = new C8443("seconds", "nanos");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42810 = new C6952("seconds", "nanos");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42811 = new C13663("year", "month", "day");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42809 = new C5240("hour", "minute", "second", "nano");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42808 = new C11205("month", "day");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42807 = new C15680("years", "months", "days");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42804 = new C18885("year");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42802 = new C9934("year", "month");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC17567 f42806 = new C0986().m41229();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16075 f42805 = new C2477();

    @Override // l.InterfaceC4954
    public final InterfaceC16075 get() {
        return f42805;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC17567 m33085(C24522 c24522) {
        c24522.getClass();
        return new C22394(c24522.m54785(C6446.m18229(C7816.class)), c24522.m54785(C6446.m18229(C10052.class))).m41229();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC17567 m33078(C24522 c24522) {
        return new C23140(m33085(c24522), c24522.m54785(C6446.m18229(C11149.class))).m41229();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17567 m33074(C24522 c24522) {
        return new C9188(m33085(c24522), c24522.m54785(C6446.m18229(C11149.class)), c24522.m54785(C6446.m18229(AbstractC22338.class))).m41229();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33075(Serializable serializable, String str, C4208 c4208) {
        if (serializable != null) {
            return;
        }
        StringBuilder sbM51387 = C22783.m51387("Missing ", str, " field; at path ");
        sbM51387.append(c4208.m13451());
        throw new C7367(sbM51387.toString());
    }
}
