package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۟ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7654 implements InterfaceC11266 {
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


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f25308;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m20207() {
        return "Kindname";
    }

    EnumC7654(String str) {
        this.f25308 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f25308;
    }

    @Override // l.InterfaceC11266
    /* JADX INFO: renamed from: ۙ */
    public String mo2722(Locale locale, InterfaceC14794 interfaceC14794) {
        return ((C22531) interfaceC14794).m50051(locale, C0252.m1693("compiler.misc.", toString()), new Object[0]);
    }
}
