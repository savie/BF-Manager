package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes2.dex */
public final class C2924 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11620 f10990;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f10991;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2924(ActivityC11620 activityC11620, ActivityC11620 activityC11621, String str) {
        super(activityC11621, -1);
        this.f10990 = activityC11620;
        this.f10991 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.length() != 0) {
            String str = this.f10991;
            if (!strM40352.equals(str)) {
                if (strM40352.contains("/") || strM40352.contains("\\")) {
                    m40365(R.string.MT_Protector);
                    return;
                }
                if (!str.equalsIgnoreCase(strM40352) && C14920.m35667(strM40352)) {
                    m40365(R.string.MT_Protector);
                    return;
                }
                if (!C14920.m35668(str, strM40352)) {
                    C15829.m37611(R.string.MT_Protector);
                }
                ArrayList arrayListM35666 = C14920.m35666();
                ActivityC11620 activityC11620 = this.f10990;
                activityC11620.f39034 = arrayListM35666;
                activityC11620.f39033.notifyDataSetChanged();
                m40364();
                return;
            }
        }
        m40364();
    }
}
