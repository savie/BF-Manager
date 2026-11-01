package l;

import bin.mt.plus.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18709 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f60684;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f60685;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18709(ActivityC5677 activityC5677, ActivityC5677 activityC5678, AbstractC20745 abstractC20745) {
        super(activityC5678, -1);
        this.f60684 = activityC5677;
        this.f60685 = abstractC20745;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.contains("/") || strM40352.contains("\\")) {
            m40365(R.string.MT_Protector);
            return;
        }
        AbstractC20745 abstractC20745M46690 = this.f60685.m46690(strM40352);
        if (abstractC20745M46690.mo33975()) {
            m40365(R.string.MT_Protector);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (AbstractC22611 abstractC22611 : this.f60684.f19367) {
                C6111 c6111Mo19352 = abstractC22611.mo19352();
                if (c6111Mo19352 != null) {
                    linkedHashMap.put(abstractC22611, c6111Mo19352);
                }
            }
            new C18003(this, linkedHashMap, abstractC20745M46690).m10243();
        } catch (IllegalStateException unused) {
            C15829.m37611(R.string.MT_Protector);
        }
    }
}
