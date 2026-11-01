package l;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩶' uses external variables
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
/* JADX INFO: renamed from: l.֨ۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC1079 implements InterfaceC11955 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC1079 f4941;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC1079[] f4942 = m4061();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC1079 f4943;

    @Override // l.InterfaceC11955
    public abstract /* synthetic */ Object apply(Object obj);

    public EnumC1079(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC1079(String str, int i, C4607 c4607) {
        this(str, i);
    }

    public static EnumC1079 valueOf(String str) {
        return (EnumC1079) Enum.valueOf(EnumC1079.class, str);
    }

    public static EnumC1079[] values() {
        return (EnumC1079[]) f4942.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC1079[] m4061() {
        return new EnumC1079[]{f4943, f4941};
    }

    static {
        final String str = "KEY";
        final int i = 0;
        f4943 = new EnumC1079(str, i) { // from class: l.ۚۧܶ
            {
                C4607 c4607 = null;
            }

            @Override // l.EnumC1079, l.InterfaceC11955
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        };
        final String str2 = "VALUE";
        final int i2 = 1;
        f4941 = new EnumC1079(str2, i2) { // from class: l.᩹ۧܶ
            {
                C4607 c4607 = null;
            }

            @Override // l.EnumC1079, l.InterfaceC11955
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }
}
