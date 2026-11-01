package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۢۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9475 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f32065;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32066;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedList f32067;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20409 f32068;

    public C9475() {
        throw null;
    }

    public C9475(ActivityC11632 activityC11632, LinkedList linkedList, C20409 c20409, boolean z) {
        this.f32065 = activityC11632;
        this.f32067 = linkedList;
        this.f32068 = c20409;
        this.f32066 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24288() {
        if (!this.f32066) {
            C20409 c20409 = this.f32068;
            if (c20409.m13338()) {
                ActivityC11632 activityC11632 = this.f32065;
                activityC11632.m29012();
                activityC11632.m29023(c20409);
                C8067 c8067BuildDialog = activityC11632.buildDialog();
                c8067BuildDialog.m21277(c20409.m13346().f53983.getName());
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻ۡۖ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final C9475 c9475 = this.f76414;
                        c9475.f32068.m46140(c9475.f32065, new Runnable() { // from class: l.֫ۡۖ
                            @Override // java.lang.Runnable
                            public final void run() {
                                c9475.m24286();
                            }
                        });
                    }
                });
                c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳۡۖ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f47252.m24286();
                    }
                });
                c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269();
                return;
            }
        }
        m24286();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m24286() {
        ActivityC11632 activityC11632 = this.f32065;
        try {
            C20409 c20409 = this.f32068;
            c20409.getClass();
            activityC11632.m29016(c20409);
        } catch (Throwable th) {
            activityC11632.f39076.m2969(th);
        }
        LinkedList linkedList = this.f32067;
        if (!linkedList.isEmpty()) {
            ((C9475) linkedList.removeFirst()).m24288();
        } else {
            activityC11632.f39079 = false;
        }
    }
}
