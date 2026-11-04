package l;

import com.alipay.sdk.m.y.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedList;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۜ' uses external variables
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
/* JADX INFO: renamed from: l.۟ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89J */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7717 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC7717[] f25428;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC7717 f25429;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int f25430 = 1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC7717 f25431;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7717 f25432;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC7717 f25433;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int f25434 = 3000;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC7717 f25435;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC7717 f25436;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC6269 f25437;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC6269 f25438;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f25439;

    public static EnumC7717 valueOf(String str) {
        return (EnumC7717) Enum.valueOf(EnumC7717.class, str);
    }

    public static EnumC7717[] values() {
        return (EnumC7717[]) f25428.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC7717[] m20998() {
        return new EnumC7717[]{f25431, f25429, f25436, f25435, f25432, f25433};
    }

    static {
        EnumC6269 enumC6269 = EnumC6269.WINREG_V1_0;
        EnumC6269 enumC62610 = EnumC6269.NDR_32BIT_V2;
        f25431 = new EnumC7717("WINREG", 0, "winreg", enumC6269, enumC62610);
        EnumC6269 enumC62611 = EnumC6269.SRVSVC_V3_0;
        f25429 = new EnumC7717("SRVSVC", 1, "srvsvc", enumC62611, enumC62610);
        f25436 = new EnumC7717("LSASVC", 2, "lsarpc", EnumC6269.LSASVC_V0_0, enumC62610);
        f25435 = new EnumC7717("SAMSVC", 3, "samr", EnumC6269.SAMSVC_V1_0, enumC62610);
        f25432 = new EnumC7717("BROWSER_SRVSVC", 4, "browser", enumC62611, enumC62610);
        f25433 = new EnumC7717("SVCCTL", 5, "svcctl", EnumC6269.SVCCTL_V2_0, enumC62610);
        f25428 = m20998();
    }

    public EnumC7717(String str, int i, String str2, EnumC6269 enumC6269, EnumC6269 enumC62610) {
        super(str, i);
        this.f25439 = str2;
        this.f25437 = enumC6269;
        this.f25438 = enumC62610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC21142 m21000(C10852 c10852) throws IOException {
        C1158 c1158M27582 = c10852.m27582("IPC$");
        if (!(c1158M27582 instanceof C24279)) {
            throw new C9469(C14483.m34972(this.f25439, " not a named pipe."));
        }
        C18158 c18158 = new C18158(m20997(c10852, (C24279) c1158M27582));
        c18158.m48245(this.f25437, this.f25438);
        return c18158;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2496 m20997(C10852 c10852, C24279 c24279) throws C3133, C9953, InterruptedIOException {
        LinkedList linkedList = new LinkedList();
        for (int i = -1; i < 1; i++) {
            try {
                return m20999(c10852, c24279);
            } catch (C9953 e) {
                linkedList.offer(e);
                if (C0259.f1549[e.m25787().ordinal()] == 1) {
                    try {
                        Thread.sleep(c.a);
                    } catch (InterruptedException e2) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException();
                        interruptedIOException.addSuppressed(e2);
                        throw interruptedIOException;
                    }
                } else {
                    throw ((C9953) linkedList.poll());
                }
            }
        }
        if (!linkedList.isEmpty()) {
            throw ((C9953) linkedList.poll());
        }
        throw new C3133("Unknown error when opening pipe: " + c24279.m4268().m17653());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C2496 m20999(C10852 c10852, C24279 c24279) {
        return new C2496(c10852, c24279, this.f25439);
    }
}
