package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۙܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4960 implements InterfaceC13449 {
    ANNOTATION("kindname.annotation"),
    CONSTRUCTOR("kindname.constructor"),
    INTERFACE("kindname.interface"),
    ENUM("kindname.enum"),
    STATIC("kindname.static"),
    TYPEVAR("kindname.type.variable"),
    BOUND("kindname.type.variable.bound"),
    VAR("kindname.variable"),
    VAL("kindname.value"),
    METHOD("kindname.method"),
    CLASS("kindname.class"),
    STATIC_INIT("kindname.static.init"),
    INSTANCE_INIT("kindname.instance.init"),
    PACKAGE("kindname.package"),
    MODULE("kindname.module"),
    RECORD_COMPONENT("kindname.record.component"),
    RECORD("kindname.record");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f17277;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m15162() {
        return "Kindname";
    }

    EnumC4960(String str) {
        this.f17277 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f17277;
    }

    @Override // l.InterfaceC13449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo15163(Locale locale, InterfaceC2263 interfaceC2263) {
        return ((C23721) interfaceC2263).m52976(locale, C25272.m56409("compiler.misc.", toString()), new Object[0]);
    }
}
