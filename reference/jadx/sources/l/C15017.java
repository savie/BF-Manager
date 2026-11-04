package l;

import bin.mt.plus.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܳ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15017 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f49051;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f49052;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15017(ActivityC0848 activityC0848, ActivityC0848 activityC0849, AbstractC22044 abstractC22044) {
        super(activityC0849, -1);
        this.f49051 = activityC0848;
        this.f49052 = abstractC22044;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM22914 = m22914();
        if (strM22914.contains("/") || strM22914.contains("\\")) {
            m22952(R.string.MT_Protector);
            return;
        }
        AbstractC22044 abstractC22044M49876 = this.f49052.m49876(strM22914);
        if (abstractC22044M49876.mo2934()) {
            m22952(R.string.MT_Protector);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (AbstractC9051 abstractC9051 : this.f49051.f3173) {
                C24132 c24132Mo1442 = abstractC9051.mo1442();
                if (c24132Mo1442 != null) {
                    linkedHashMap.put(abstractC9051, c24132Mo1442);
                }
            }
            new C19493(this, linkedHashMap, abstractC22044M49876).m8197();
        } catch (IllegalStateException unused) {
            C22673.m51152(R.string.MT_Protector);
        }
    }
}
