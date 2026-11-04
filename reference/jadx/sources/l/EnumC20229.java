package l;

import com.alipay.sdk.m.t.e;
import java.util.EnumSet;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.᩵֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20229 {
    DIAMOND("diamond", EnumC3666.f12545),
    LAMBDA("lambda", EnumC3666.f12572),
    METHOD(e.s, EnumC3666.f12575),
    LOCAL("local", EnumC3666.f12565);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC3666 f64925;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f64926;

    EnumC20229(String str, EnumC3666 enumC3666) {
        this.f64926 = str;
        this.f64925 = enumC3666;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m46502(String str, EnumC20820 enumC20820) {
        if (str == null) {
            return EnumSet.noneOf(EnumC20229.class);
        }
        C14769 c14769M35542 = C14769.m35542((Object[]) str.split(","));
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC20229.class);
        if (c14769M35542.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC20229.class);
        }
        for (EnumC20229 enumC20229 : values()) {
            if (c14769M35542.contains("-" + enumC20229.f64926) || !enumC20229.f64925.m11915(enumC20820)) {
                enumSetNoneOf.remove(enumC20229);
            } else if (c14769M35542.contains(enumC20229.f64926)) {
                enumSetNoneOf.add(enumC20229);
            }
        }
        return enumSetNoneOf;
    }
}
