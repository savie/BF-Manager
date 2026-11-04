package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GITM */
/* JADX INFO: loaded from: classes.dex */
public final class C23977 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f77593 = C16980.m40037(C23977.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f77594 = new HashSet();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f77595 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53506(InterfaceC24181 interfaceC24181, String str, Throwable th) {
        C23977 c23977M5684 = interfaceC24181.mo8527().m5684();
        synchronized (c23977M5684) {
            c23977M5684.f77594.add((InterfaceC6238) interfaceC24181);
            String strM53504 = m53504(interfaceC24181, str);
            if (th instanceof StackOverflowError) {
                f77593.mo13698(strM53504, "{}, error: StackOverflowError");
            } else if (th instanceof C2631) {
                String message = th.getMessage();
                C2631 c2631 = new C2631(message);
                if (message == null || message.isEmpty()) {
                    f77593.mo13698(strM53504, "{}");
                } else {
                    f77593.mo13718("{}, details: {}", strM53504, message);
                }
                th = c2631;
            } else {
                f77593.mo13724(strM53504, th);
            }
            ((InterfaceC6238) interfaceC24181).mo17863(C11457.f36007, new C15514(str, th));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53505(C2551 c2551, String str) {
        C23977 c23977M5684 = c2551.mo8527().m5684();
        synchronized (c23977M5684) {
            c23977M5684.f77595.add(c2551);
            f77593.mo13729(m53504((InterfaceC24181) c2551, str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m53504(InterfaceC24181 interfaceC24181, String str) {
        StringBuilder sbM10405 = C3188.m10405(str, " in ");
        sbM10405.append(interfaceC24181.typeName());
        sbM10405.append(": ");
        sbM10405.append(interfaceC24181);
        return sbM10405.toString();
    }
}
