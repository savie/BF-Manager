package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۢ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I76C */
/* JADX INFO: loaded from: classes3.dex */
public final class C10472 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26897(C2270 c2270, final C19028 c19028) {
        return m26894(c2270, c19028.f61643, c19028.f61641, c19028.f61646, new InterfaceC19423() { // from class: l.֡᩻ۚ
            @Override // l.InterfaceC19423
            public final C10186 get() {
                return C24645.m54999(c19028);
            }
        }, new InterfaceC19423() { // from class: l.۟᩻ۚ
            @Override // l.InterfaceC19423
            public final C10186 get() {
                return C24645.m54994(c19028);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26895(C2270 c2270, final C8586 c8586) {
        return m26894(c2270, c8586.f28070, c8586.f28068, c8586.f28069, new InterfaceC19423() { // from class: l.᩶᩻ۚ
            @Override // l.InterfaceC19423
            public final C10186 get() {
                return C24645.m54997(c8586);
            }
        }, new InterfaceC19423() { // from class: l.ܿ᩻ۚ
            @Override // l.InterfaceC19423
            public final C10186 get() {
                return C24645.m54992(c8586);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26896(C2270 c2270, final C10077 c10077) {
        return m26894(c2270, c10077.f32306, c10077.f32304, c10077.f32309, new InterfaceC19423() { // from class: l.ۘ᩻ۚ
            @Override // l.InterfaceC19423
            public final C10186 get() {
                return C24645.m54998(c10077);
            }
        }, new InterfaceC19423() { // from class: l.ܰ᩻ۚ
            @Override // l.InterfaceC19423
            public final C10186 get() {
                return C24645.m54993(c10077);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26894(C2270 c2270, String str, long j, String str2, InterfaceC19423 interfaceC19423, InterfaceC19423 interfaceC19424) throws C10186 {
        if (c2270.f7406 != 40) {
            if ("auto".equals(str2)) {
                return "auto";
            }
            throw C10186.m26301("instructionMode must be auto for non-ARM ELF", "instructionMode", JSON.value(str2), JSON.array("auto"), (JSONObject) null);
        }
        boolean z = "virtual".equals(str) && (j & 1) == 1;
        if ("arm".equals(str2)) {
            if (z) {
                throw interfaceC19423.get();
            }
            return "arm";
        }
        if ("thumb".equals(str2) || z) {
            return "thumb";
        }
        throw interfaceC19424.get();
    }
}
