package l;

import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import org.bouncycastle.asn1.BERTags;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ᩴ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7EE */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19840 {
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


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f63778;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f63779;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f63780;

    EnumC19840(int i, String str, boolean z) {
        this.f63780 = i;
        this.f63779 = str;
        this.f63778 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m45697() {
        return this.f63780;
    }

    public String getName() {
        return this.f63779;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m45700() {
        return this.f63778;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m45699(EnumC19840... enumC19840Arr) {
        for (EnumC19840 enumC19840 : enumC19840Arr) {
            if ((enumC19840.f63780 & this.f63780) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m45698(EnumC16856 enumC16856) {
        return (enumC16856.m39813() & this.f63780) != 0;
    }
}
