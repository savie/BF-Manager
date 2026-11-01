package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ܺۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15912 {
    SUCCESS("success"),
    FAILURE("failure"),
    APPLICABLE("applicable"),
    INAPPLICABLE("inapplicable"),
    DEFERRED_INST("deferred-inference"),
    PREDEF("predef"),
    OBJECT_INIT("object-init"),
    INTERNAL(UMModuleRegister.INNER);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f51534;

    EnumC15912(String str) {
        this.f51534 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m37832(C14770 c14770) {
        String strM35397 = c14770.m35397("debug.verboseResolution");
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC15912.class);
        if (strM35397 == null) {
            return enumSetNoneOf;
        }
        if (strM35397.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC15912.class);
        }
        List listAsList = Arrays.asList(strM35397.split(","));
        for (EnumC15912 enumC15912 : values()) {
            if (listAsList.contains(enumC15912.f51534)) {
                enumSetNoneOf.add(enumC15912);
            } else {
                if (listAsList.contains("-" + enumC15912.f51534)) {
                    enumSetNoneOf.remove(enumC15912);
                }
            }
        }
        return enumSetNoneOf;
    }
}
