package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.֫ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H79P */
/* JADX INFO: loaded from: classes2.dex */
public final class C1773 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONValue f6907;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9180 f6908;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1773 m5815(EnumC10591 enumC10591, JSONObject jSONObject) {
        return new C1773(enumC10591, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1773 m5814(EnumC10591 enumC10591) {
        return new C1773(enumC10591, null);
    }

    public C1773(InterfaceC9180 interfaceC9180, JSONValue jSONValue) {
        this.f6908 = interfaceC9180;
        this.f6907 = jSONValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONValue m5816() {
        return this.f6907;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7768 m5817() {
        InterfaceC9180 interfaceC9180 = this.f6908;
        JSONValue jSONValue = this.f6907;
        if (jSONValue != null) {
            return AbstractC16940.m39639(interfaceC9180, "application/json", jSONValue.toString());
        }
        return AbstractC16940.m39639(interfaceC9180, "text/plain; charset=UTF-8", "");
    }
}
