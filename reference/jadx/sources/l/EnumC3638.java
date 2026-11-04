package l;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۗ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC3638 implements InterfaceC20792 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC3638 f12452;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC3638 f12453;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC3638 f12454;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC3638 f12455;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC3638 f12457;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC3638 f12458;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC3638 f12459 = new C2147("IDENTITY", 0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC3638[] f12456 = m11787();

    /* JADX INFO: renamed from: ᩷ */
    public abstract /* synthetic */ String mo7412(Field field);

    public EnumC3638(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC3638(String str, int i, C2147 c2147) {
        this(str, i);
    }

    public static EnumC3638 valueOf(String str) {
        return (EnumC3638) Enum.valueOf(EnumC3638.class, str);
    }

    public static EnumC3638[] values() {
        return (EnumC3638[]) f12456.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC3638[] m11787() {
        return new EnumC3638[]{f12459, f12458, f12455, f12453, f12454, f12457, f12452};
    }

    static {
        final String str = "UPPER_CAMEL_CASE";
        final int i = 1;
        f12458 = new EnumC3638(str, i) { // from class: l.ۧ᩵ܽ
            {
                C2147 c2147 = null;
            }

            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ۙ */
            public List mo7411(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ᩷ */
            public String mo7412(Field field) {
                return EnumC3638.m11785(field.getName());
            }
        };
        final String str2 = "UPPER_CAMEL_CASE_WITH_SPACES";
        final int i2 = 2;
        f12455 = new EnumC3638(str2, i2) { // from class: l.᩻᩵ܽ
            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ۙ */
            public List mo7411(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2147 c2147 = null;
            }

            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ᩷ */
            public String mo7412(Field field) {
                return EnumC3638.m11785(EnumC3638.m11786(field.getName(), ' '));
            }
        };
        final String str3 = "UPPER_CASE_WITH_UNDERSCORES";
        final int i3 = 3;
        f12453 = new EnumC3638(str3, i3) { // from class: l.ܺ᩵ܽ
            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ۙ */
            public List mo7411(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2147 c2147 = null;
            }

            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ᩷ */
            public String mo7412(Field field) {
                return EnumC3638.m11786(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        final String str4 = "LOWER_CASE_WITH_UNDERSCORES";
        final int i4 = 4;
        f12454 = new EnumC3638(str4, i4) { // from class: l.ܽ᩵ܽ
            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ۙ */
            public List mo7411(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2147 c2147 = null;
            }

            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ᩷ */
            public String mo7412(Field field) {
                return EnumC3638.m11786(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        final String str5 = "LOWER_CASE_WITH_DASHES";
        final int i5 = 5;
        f12457 = new EnumC3638(str5, i5) { // from class: l.ܶ᩵ܽ
            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ۙ */
            public List mo7411(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2147 c2147 = null;
            }

            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ᩷ */
            public String mo7412(Field field) {
                return EnumC3638.m11786(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        final String str6 = "LOWER_CASE_WITH_DOTS";
        final int i6 = 6;
        f12452 = new EnumC3638(str6, i6) { // from class: l.᩹᩵ܽ
            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ۙ */
            public List mo7411(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2147 c2147 = null;
            }

            @Override // l.EnumC3638, l.InterfaceC20792
            /* JADX INFO: renamed from: ᩷ */
            public String mo7412(Field field) {
                return EnumC3638.m11786(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ */
    public List mo7411(Field field) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11786(String str, char c) {
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
    public static String m11785(String str) {
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
                    return ExternalValue$$ExternalSyntheticOutline0.m(1, str, sb);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i));
                sb2.append(upperCase);
                return ExternalValue$$ExternalSyntheticOutline0.m(i + 1, str, sb2);
            }
        }
        return str;
    }
}
