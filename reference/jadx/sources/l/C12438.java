package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12438 extends C0091 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14555 f41492;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12438(ActivityC14555 activityC14555) {
        super(true);
        this.f41492 = activityC14555;
    }

    @Override // l.C0091, l.InterfaceC3618
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1046(View view, String str) {
        if (str.startsWith("action://points-redemption/")) {
            try {
                int i = Integer.parseInt(str.substring(27));
                ActivityC14555 activityC14555 = this.f41492;
                C16609 c16609 = ActivityC14555.f47653;
                C6087 c6087 = new C6087(activityC14555, activityC14555, i);
                c6087.m40376(R.string.MT_Protector);
                c6087.m40363(R.string.MT_Protector);
                c6087.m40346((CharSequence) String.valueOf(i));
                c6087.m40350(2);
                c6087.m40375(4);
                c6087.m40355();
                c6087.m40368(true);
            } catch (Exception unused) {
            }
            return true;
        }
        return super.mo1046(view, str);
    }
}
