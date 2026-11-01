package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۙ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4971 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f17343;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17344;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedList f17345;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22611 f17346;

    public C4971() {
        throw null;
    }

    public C4971(ActivityC5677 activityC5677, LinkedList linkedList, AbstractC22611 abstractC22611, boolean z) {
        this.f17343 = activityC5677;
        this.f17345 = linkedList;
        this.f17346 = abstractC22611;
        this.f17344 = z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13792() {
        boolean z = this.f17344;
        ActivityC5677 activityC5677 = this.f17343;
        AbstractC22611 abstractC22611 = this.f17346;
        if (z || !abstractC22611.mo19351()) {
            abstractC22611.m50126(activityC5677);
            m13791();
            return;
        }
        activityC5677.m15667();
        ActivityC5677.m15576(activityC5677, abstractC22611);
        C8067 c8067BuildDialog = activityC5677.buildDialog();
        c8067BuildDialog.m21277(C13012.m32189(25, abstractC22611.mo3620()));
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫ۧۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final C4971 c4971 = this.f6911;
                c4971.f17346.mo19342(c4971.f17343, false, new Runnable() { // from class: l.ۗۧۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4971 c4972 = c4971;
                        c4972.f17346.m50126(c4972.f17343);
                        c4972.m13791();
                    }
                });
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢۧۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C4971 c4971 = this.f32229;
                c4971.f17346.m50126(c4971.f17343);
                c4971.m13791();
            }
        });
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13791() {
        LinkedList linkedList = this.f17345;
        if (linkedList.isEmpty()) {
            return;
        }
        ((C4971) linkedList.removeFirst()).m13792();
    }
}
