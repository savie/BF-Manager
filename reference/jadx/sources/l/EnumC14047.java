package l;

import com.alipay.sdk.m.t.e;
import java.util.EnumSet;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ܰ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC14047 {
    DIAMOND("diamond", EnumC14026.f46114),
    LAMBDA("lambda", EnumC14026.f46098),
    METHOD(e.s, EnumC14026.f46113),
    LOCAL("local", EnumC14026.f46126);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC14026 f46178;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f46179;

    EnumC14047(String str, EnumC14026 enumC14026) {
        this.f46179 = str;
        this.f46178 = enumC14026;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m33993(String str, EnumC11909 enumC11909) {
        if (str == null) {
            return EnumSet.noneOf(EnumC14047.class);
        }
        C21825 c21825M48586 = C21825.m48586((Object[]) str.split(","));
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC14047.class);
        if (c21825M48586.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC14047.class);
        }
        for (EnumC14047 enumC14047 : values()) {
            if (c21825M48586.contains("-" + enumC14047.f46179) || !enumC14047.f46178.m33945(enumC11909)) {
                enumSetNoneOf.remove(enumC14047);
            } else if (c21825M48586.contains(enumC14047.f46179)) {
                enumSetNoneOf.add(enumC14047);
            }
        }
        return enumSetNoneOf;
    }
}
