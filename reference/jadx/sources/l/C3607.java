package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۗᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H79P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3607 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONValue f12366;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC14953 f12367;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3607 m11700(EnumC21667 enumC21667, JSONObject jSONObject) {
        return new C3607(enumC21667, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3607 m11699(EnumC21667 enumC21667) {
        return new C3607(enumC21667, null);
    }

    public C3607(InterfaceC14953 interfaceC14953, JSONValue jSONValue) {
        this.f12367 = interfaceC14953;
        this.f12366 = jSONValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONValue m11701() {
        return this.f12366;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18683 m11702() {
        InterfaceC14953 interfaceC14953 = this.f12367;
        JSONValue jSONValue = this.f12366;
        if (jSONValue != null) {
            return AbstractC1530.m5422(interfaceC14953, "application/json", jSONValue.toString());
        }
        return AbstractC1530.m5422(interfaceC14953, "text/plain; charset=UTF-8", "");
    }
}
