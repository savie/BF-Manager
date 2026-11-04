package l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.statistics.b;
import com.umeng.commonsdk.statistics.idtracking.i;

/* JADX INFO: renamed from: l.ᩴܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19876 {
    AUXILIARYCLASS("auxiliaryclass"),
    CAST("cast"),
    CLASSFILE("classfile"),
    DEPRECATION("deprecation"),
    DEP_ANN("dep-ann"),
    DIVZERO("divzero"),
    EMPTY(b.f),
    EXPORTS("exports"),
    FALLTHROUGH("fallthrough"),
    FINALLY("finally"),
    MISSING_EXPLICIT_CTOR("missing-explicit-ctor"),
    MODULE(am.e),
    OPENS("opens"),
    OPTIONS("options"),
    OVERLOADS("overloads"),
    OVERRIDES("overrides"),
    PATH(MotionUtils.EASING_TYPE_PATH),
    PROCESSING("processing"),
    RAW("rawtypes"),
    REMOVAL("removal"),
    REQUIRES_AUTOMATIC("requires-automatic"),
    REQUIRES_TRANSITIVE_AUTOMATIC("requires-transitive-automatic"),
    SERIAL(i.a),
    STATIC("static"),
    STRICTFP("strictfp"),
    SYNCHRONIZATION("synchronization"),
    TEXT_BLOCKS("text-blocks"),
    TRY("try"),
    UNCHECKED("unchecked"),
    VARARGS("varargs"),
    PREVIEW("preview");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f63944;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f63945;

    EnumC19876(String str) {
        this(str, false);
    }

    EnumC19876(String str, boolean z) {
        this.f63945 = str;
        this.f63944 = z;
        C15400.f50204.put(str, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19876 m45735(String str) {
        return (EnumC19876) C15400.f50204.get(str);
    }
}
