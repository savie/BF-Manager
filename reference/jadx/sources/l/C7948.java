package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.۠ۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I76C */
/* JADX INFO: loaded from: classes3.dex */
public final class C7948 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20980(C14247 c14247, final C18479 c18479) {
        return m20977(c14247, c18479.f58888, c18479.f58885, c18479.f58891, new InterfaceC18531() { // from class: l.᩸ۙ۬
            @Override // l.InterfaceC18531
            public final C12731 get() {
                return C12887.m31960(c18479);
            }
        }, new InterfaceC18531() { // from class: l.ᩳۙ۬
            @Override // l.InterfaceC18531
            public final C12731 get() {
                return C12887.m31955(c18479);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20978(C14247 c14247, final C7190 c7190) {
        return m20977(c14247, c7190.f23991, c7190.f23988, c7190.f23992, new InterfaceC18531() { // from class: l.᩺ۙ۬
            @Override // l.InterfaceC18531
            public final C12731 get() {
                return C12887.m31958(c7190);
            }
        }, new InterfaceC18531() { // from class: l.ܶۙ۬
            @Override // l.InterfaceC18531
            public final C12731 get() {
                return C12887.m31953(c7190);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20979(C14247 c14247, final C7896 c7896) {
        return m20977(c14247, c7896.f25953, c7896.f25950, c7896.f25957, new InterfaceC18531() { // from class: l.ۘۙ۬
            @Override // l.InterfaceC18531
            public final C12731 get() {
                return C12887.m31959(c7896);
            }
        }, new InterfaceC18531() { // from class: l.ۜۙ۬
            @Override // l.InterfaceC18531
            public final C12731 get() {
                return C12887.m31954(c7896);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20977(C14247 c14247, String str, long j, String str2, InterfaceC18531 interfaceC18531, InterfaceC18531 interfaceC18532) throws C12731 {
        if (c14247.f46657 != 40) {
            if ("auto".equals(str2)) {
                return "auto";
            }
            throw C12731.m31626("instructionMode must be auto for non-ARM ELF", "instructionMode", JSON.value(str2), JSON.array("auto"), (JSONObject) null);
        }
        boolean z = "virtual".equals(str) && (j & 1) == 1;
        if ("arm".equals(str2)) {
            if (z) {
                throw interfaceC18531.get();
            }
            return "arm";
        }
        if ("thumb".equals(str2) || z) {
            return "thumb";
        }
        throw interfaceC18532.get();
    }
}
