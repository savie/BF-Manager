package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.lang.reflect.Constructor;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩷ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22121 implements InterfaceC8424 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m50076(String str, String str2, String str3, String str4) {
        return JSON.object().add(str, str2).add(str3, str4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m50077(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50078(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    @Override // l.InterfaceC8424
    /* JADX INFO: renamed from: ۙ */
    public Constructor mo8291() {
        return C0469.class.asSubclass(InterfaceC22486.class).getConstructor(null);
    }
}
