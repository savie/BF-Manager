package l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۚ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5493 {
    SOURCE("source"),
    CLASS(Name.LABEL),
    REDUNDANT("redundant");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f19110;

    EnumC5493(String str) {
        this.f19110 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m16322(String[] strArr) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC5493.class);
        List listAsList = Arrays.asList(strArr);
        if (listAsList.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC5493.class);
        }
        for (EnumC5493 enumC5493 : values()) {
            if (listAsList.contains(enumC5493.f19110)) {
                enumSetNoneOf.add(enumC5493);
            } else {
                if (listAsList.contains("-" + enumC5493.f19110)) {
                    enumSetNoneOf.remove(enumC5493);
                }
            }
        }
        return enumSetNoneOf;
    }
}
