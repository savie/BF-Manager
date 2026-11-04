package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07BN */
/* JADX INFO: loaded from: classes4.dex */
public final class C14249 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m34590(C3767 c3767) {
        boolean zMo4274;
        if (!EnumC12716.POST.equals(c3767.m12226())) {
            return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        try {
            C3809 c3809M34589 = m34589(c3767);
            int i = 1;
            if (c3809M34589.f13000 == null || c3809M34589.f13000.isEmpty()) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "targetPath"));
            }
            if (c3809M34589.f13001 == null || c3809M34589.f13001.isEmpty()) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "name"));
            }
            if (c3809M34589.f12999 == null) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "isDirectory"));
            }
            if (c3809M34589.f13001.contains("\\") || "/".equals(c3809M34589.f13001)) {
                return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49088(R.string.MT_Protector));
            }
            String strM20187 = AbstractC7364.m20187(c3809M34589.f13000);
            try {
                C6265.m17912(strM20187, EnumC12230.MODIFY_DIRECTORY_LINKED);
                AbstractC22044 abstractC22044M35193 = c3809M34589.f13001.startsWith("/") ? C14584.m35193(c3809M34589.f13001, new String[0]) : C14584.m35193(strM20187, c3809M34589.f13001);
                if (abstractC22044M35193.mo2934()) {
                    return C12802.m31751(EnumC21667.CONFLICT, C21576.m49088(abstractC22044M35193.mo4281() ? R.string.MT_Protector : R.string.MT_Protector));
                }
                if (c3809M34589.f12999.booleanValue()) {
                    zMo4274 = abstractC22044M35193.mo4274();
                } else {
                    AbstractC22044 abstractC22044M49858 = abstractC22044M35193.m49858();
                    zMo4274 = (abstractC22044M49858 == null || abstractC22044M49858.mo2934() || abstractC22044M49858.mo4274()) && abstractC22044M35193.mo4283();
                }
                if (!zMo4274) {
                    RunnableC22951 runnableC22951 = new RunnableC22951(i);
                    if (C22415.m50557()) {
                        C6331.m18055();
                    } else {
                        C21576.m49068(runnableC22951);
                    }
                    return C12802.m31751(EnumC21667.INTERNAL_ERROR, C21576.m49059(c3809M34589.f12999.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector, c3809M34589.f13001));
                }
                RunnableC0361 runnableC0361 = new RunnableC0361(5, abstractC22044M35193);
                if (C22415.m50557()) {
                    runnableC0361.run();
                } else {
                    C21576.m49068(runnableC0361);
                }
                HashMap map = new HashMap();
                map.put("item", C7538.m20601(new C6004(abstractC22044M35193)));
                map.put("parentPath", abstractC22044M35193.getParent());
                return C12802.m31750(map);
            } catch (C4866 e) {
                return C12802.m31751(EnumC21667.CONFLICT, e.getMessage());
            }
        } catch (IOException | RuntimeException | C0784 unused) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3809 m34589(C3767 c3767) {
        JSONObject jSONObjectM48362 = C21203.m48362(c3767);
        C3809 c3809 = new C3809();
        c3809.f13000 = C21203.m48367(jSONObjectM48362, "targetPath");
        c3809.f13001 = C21203.m48367(jSONObjectM48362, "name");
        c3809.f12999 = (jSONObjectM48362.get("isDirectory") == null || jSONObjectM48362.get("isDirectory").isNull()) ? null : Boolean.valueOf(C21203.m48366(jSONObjectM48362, "isDirectory"));
        return c3809;
    }
}
