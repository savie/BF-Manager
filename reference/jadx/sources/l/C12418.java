package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12418 extends C23302 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21369 f39919;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12418(ActivityC21369 activityC21369) {
        super(true);
        this.f39919 = activityC21369;
    }

    @Override // l.C23302, l.InterfaceC14195
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo30888(View view, String str) {
        if (str.startsWith("action://points-redemption/")) {
            try {
                int i = Integer.parseInt(str.substring(27));
                ActivityC21369 activityC21369 = this.f39919;
                C0107 c0107 = ActivityC21369.f68056;
                C24353 c24353 = new C24353(activityC21369, activityC21369, i);
                c24353.m22945(R.string.MT_Protector);
                c24353.m22929(R.string.MT_Protector);
                c24353.m22924((CharSequence) String.valueOf(i));
                c24353.m22948(2);
                c24353.m22942(4);
                c24353.m22959();
                c24353.m22955(true);
            } catch (Exception unused) {
            }
            return true;
        }
        return super.mo30888(view, str);
    }
}
