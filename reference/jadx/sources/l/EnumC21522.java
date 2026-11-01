package l;

import com.alipay.sdk.m.y.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedList;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۢ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.᩸ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89J */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC21522 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC21522 f69921;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC21522 f69922;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC21522 f69923;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC21522 f69924;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC21522 f69925;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f69926 = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC21522[] f69927;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC21522 f69928;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f69929 = 3000;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC22187 f69930;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC22187 f69931;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f69932;

    public static EnumC21522 valueOf(String str) {
        return (EnumC21522) Enum.valueOf(EnumC21522.class, str);
    }

    public static EnumC21522[] values() {
        return (EnumC21522[]) f69927.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC21522[] m48244() {
        return new EnumC21522[]{f69923, f69924, f69928, f69922, f69925, f69921};
    }

    static {
        EnumC22187 enumC22187 = EnumC22187.WINREG_V1_0;
        EnumC22187 enumC22188 = EnumC22187.NDR_32BIT_V2;
        f69923 = new EnumC21522("WINREG", 0, "winreg", enumC22187, enumC22188);
        EnumC22187 enumC22189 = EnumC22187.SRVSVC_V3_0;
        f69924 = new EnumC21522("SRVSVC", 1, "srvsvc", enumC22189, enumC22188);
        f69928 = new EnumC21522("LSASVC", 2, "lsarpc", EnumC22187.LSASVC_V0_0, enumC22188);
        f69922 = new EnumC21522("SAMSVC", 3, "samr", EnumC22187.SAMSVC_V1_0, enumC22188);
        f69925 = new EnumC21522("BROWSER_SRVSVC", 4, "browser", enumC22189, enumC22188);
        f69921 = new EnumC21522("SVCCTL", 5, "svcctl", EnumC22187.SVCCTL_V2_0, enumC22188);
        f69927 = m48244();
    }

    public EnumC21522(String str, int i, String str2, EnumC22187 enumC22187, EnumC22187 enumC22188) {
        super(str, i);
        this.f69932 = str2;
        this.f69931 = enumC22187;
        this.f69930 = enumC22188;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC6705 m48246(C20858 c20858) throws IOException {
        C21294 c21294M46891 = c20858.m46891("IPC$");
        if (!(c21294M46891 instanceof C2243)) {
            throw new C21317(C15489.m37076(this.f69932, " not a named pipe."));
        }
        C22934 c22934 = new C22934(m48243(c20858, (C2243) c21294M46891));
        c22934.m18122(this.f69931, this.f69930);
        return c22934;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8823 m48243(C20858 c20858, C2243 c2243) throws C18700, InterruptedIOException, C3011 {
        LinkedList linkedList = new LinkedList();
        for (int i = -1; i < 1; i++) {
            try {
                return m48245(c20858, c2243);
            } catch (C18700 e) {
                linkedList.offer(e);
                if (C15173.f49555[e.m43239().ordinal()] == 1) {
                    try {
                        Thread.sleep(c.a);
                    } catch (InterruptedException e2) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException();
                        interruptedIOException.addSuppressed(e2);
                        throw interruptedIOException;
                    }
                } else {
                    throw ((C18700) linkedList.poll());
                }
            }
        }
        if (!linkedList.isEmpty()) {
            throw ((C18700) linkedList.poll());
        }
        throw new C3011("Unknown error when opening pipe: " + c2243.m47755().m29354());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C8823 m48245(C20858 c20858, C2243 c2243) {
        return new C8823(c20858, c2243, this.f69932);
    }
}
