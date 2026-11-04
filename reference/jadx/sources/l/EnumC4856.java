package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۙۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4856 {
    SUCCESS("success"),
    FAILURE("failure"),
    APPLICABLE("applicable"),
    INAPPLICABLE("inapplicable"),
    DEFERRED_INST("deferred-inference"),
    PREDEF("predef"),
    OBJECT_INIT("object-init"),
    INTERNAL(UMModuleRegister.INNER);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f16951;

    EnumC4856(String str) {
        this.f16951 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m14898(C13015 c13015) {
        String strM32422 = c13015.m32422("debug.verboseResolution");
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC4856.class);
        if (strM32422 == null) {
            return enumSetNoneOf;
        }
        if (strM32422.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC4856.class);
        }
        List listAsList = Arrays.asList(strM32422.split(","));
        for (EnumC4856 enumC4856 : values()) {
            if (listAsList.contains(enumC4856.f16951)) {
                enumSetNoneOf.add(enumC4856);
            } else {
                if (listAsList.contains("-" + enumC4856.f16951)) {
                    enumSetNoneOf.remove(enumC4856);
                }
            }
        }
        return enumSetNoneOf;
    }
}
