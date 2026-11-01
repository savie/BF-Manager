package l;

import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import org.bouncycastle.asn1.BERTags;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.֡ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7EE */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0554 {
    NONE(0, "n/a", false),
    CLASS(1, Name.LABEL, false),
    FIELD(2, "field", false),
    METHOD(4, e.s, false),
    INNER_CLASS(8, "inner-class", false),
    MODULE(16, am.e, false),
    REQUIRES(32, "requires", false),
    EXPORTS(64, "exports", false),
    OPENS(128, "opens", false),
    METHOD_PARAMETERS(256, "method parameters", false),
    MODULE_DIRECTIVES(BERTags.FLAGS, "module directives", false),
    ORDINARY(512, "ordinary", true),
    VALUE_OBJECTS(512, "value classes and objects", true);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f2327;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f2328;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f2329;

    EnumC0554(int i, String str, boolean z) {
        this.f2329 = i;
        this.f2327 = str;
        this.f2328 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m2641() {
        return this.f2329;
    }

    public String getName() {
        return this.f2327;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m2644() {
        return this.f2328;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m2643(EnumC0554... enumC0554Arr) {
        for (EnumC0554 enumC0554 : enumC0554Arr) {
            if ((enumC0554.f2329 & this.f2329) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m2642(EnumC23839 enumC23839) {
        return (enumC23839.m52557() & this.f2329) != 0;
    }
}
