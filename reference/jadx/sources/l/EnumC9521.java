package l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ۢۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9521 {
    SOURCE("source"),
    CLASS(Name.LABEL),
    REDUNDANT("redundant");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f32207;

    EnumC9521(String str) {
        this.f32207 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumSet m24364(String[] strArr) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC9521.class);
        List listAsList = Arrays.asList(strArr);
        if (listAsList.contains(ProviderConfigurationPermission.ALL_STR)) {
            enumSetNoneOf = EnumSet.allOf(EnumC9521.class);
        }
        for (EnumC9521 enumC9521 : values()) {
            if (listAsList.contains(enumC9521.f32207)) {
                enumSetNoneOf.add(enumC9521);
            } else {
                if (listAsList.contains("-" + enumC9521.f32207)) {
                    enumSetNoneOf.remove(enumC9521);
                }
            }
        }
        return enumSetNoneOf;
    }
}
