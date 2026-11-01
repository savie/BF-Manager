package l;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۟ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC7455 implements InterfaceC20861 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC7455 f24840;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC7455 f24841;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC7455 f24842;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7455 f24843;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC7455 f24845;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC7455 f24846;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC7455 f24847 = new C21566("IDENTITY", 0);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC7455[] f24844 = m19939();

    @Override // l.InterfaceC20861
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract /* synthetic */ String mo19941(Field field);

    public EnumC7455(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC7455(String str, int i, C21566 c21566) {
        this(str, i);
    }

    public static EnumC7455 valueOf(String str) {
        return (EnumC7455) Enum.valueOf(EnumC7455.class, str);
    }

    public static EnumC7455[] values() {
        return (EnumC7455[]) f24844.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC7455[] m19939() {
        return new EnumC7455[]{f24847, f24846, f24841, f24842, f24843, f24840, f24845};
    }

    static {
        final String str = "UPPER_CAMEL_CASE";
        final int i = 1;
        f24846 = new EnumC7455(str, i) { // from class: l.ᩳۨ᩸
            {
                C21566 c21566 = null;
            }

            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ۙ */
            public List mo19940(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ܰ */
            public String mo19941(Field field) {
                return EnumC7455.m19937(field.getName());
            }
        };
        final String str2 = "UPPER_CAMEL_CASE_WITH_SPACES";
        final int i2 = 2;
        f24841 = new EnumC7455(str2, i2) { // from class: l.ᩴۨ᩸
            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ۙ */
            public List mo19940(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C21566 c21566 = null;
            }

            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ܰ */
            public String mo19941(Field field) {
                return EnumC7455.m19937(EnumC7455.m19938(field.getName(), ' '));
            }
        };
        final String str3 = "UPPER_CASE_WITH_UNDERSCORES";
        final int i3 = 3;
        f24842 = new EnumC7455(str3, i3) { // from class: l.۠ۨ᩸
            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ۙ */
            public List mo19940(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C21566 c21566 = null;
            }

            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ܰ */
            public String mo19941(Field field) {
                return EnumC7455.m19938(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        final String str4 = "LOWER_CASE_WITH_UNDERSCORES";
        final int i4 = 4;
        f24843 = new EnumC7455(str4, i4) { // from class: l.᩵ۨ᩸
            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ۙ */
            public List mo19940(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C21566 c21566 = null;
            }

            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ܰ */
            public String mo19941(Field field) {
                return EnumC7455.m19938(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        final String str5 = "LOWER_CASE_WITH_DASHES";
        final int i5 = 5;
        f24840 = new EnumC7455(str5, i5) { // from class: l.ۡۨ᩸
            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ۙ */
            public List mo19940(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C21566 c21566 = null;
            }

            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ܰ */
            public String mo19941(Field field) {
                return EnumC7455.m19938(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        final String str6 = "LOWER_CASE_WITH_DOTS";
        final int i6 = 6;
        f24845 = new EnumC7455(str6, i6) { // from class: l.ۤۨ᩸
            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ۙ */
            public List mo19940(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C21566 c21566 = null;
            }

            @Override // l.EnumC7455, l.InterfaceC20861
            /* JADX INFO: renamed from: ܰ */
            public String mo19941(Field field) {
                return EnumC7455.m19938(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
    }

    @Override // l.InterfaceC20861
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List mo19940(Field field) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19938(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19937(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(upperCase);
                    return C0242.m1616(1, str, sb);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i));
                sb2.append(upperCase);
                return C0242.m1616(i + 1, str, sb2);
            }
        }
        return str;
    }
}
