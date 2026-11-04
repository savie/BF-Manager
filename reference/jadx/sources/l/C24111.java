package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩺ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24111 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77943;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LinkedList f77944;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7941 f77945;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f77946;

    public C24111() {
        throw null;
    }

    public C24111(ActivityC18143 activityC18143, LinkedList linkedList, C7941 c7941, boolean z) {
        this.f77946 = activityC18143;
        this.f77944 = linkedList;
        this.f77945 = c7941;
        this.f77943 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53665() {
        if (!this.f77943) {
            C7941 c7941 = this.f77945;
            if (c7941.m19933()) {
                ActivityC18143 activityC18143 = this.f77946;
                activityC18143.m42299();
                activityC18143.m42305(c7941);
                C2361 c2361BuildDialog = activityC18143.buildDialog();
                c2361BuildDialog.m8024(c7941.m19934().f30601.getName());
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵ۛ᩸
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final C24111 c24111 = this.f65356;
                        c24111.f77945.m21629(c24111.f77946, new Runnable() { // from class: l.ۛۛ᩸
                            @Override // java.lang.Runnable
                            public final void run() {
                                c24111.m53663();
                            }
                        });
                    }
                });
                c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۛ᩸
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f39158.m53663();
                    }
                });
                c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016();
                return;
            }
        }
        m53663();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m53663() {
        ActivityC18143 activityC18143 = this.f77946;
        try {
            C7941 c7941 = this.f77945;
            c7941.getClass();
            activityC18143.m42295(c7941);
        } catch (Throwable th) {
            activityC18143.f59342.m4466(th);
        }
        LinkedList linkedList = this.f77944;
        if (!linkedList.isEmpty()) {
            ((C24111) linkedList.removeFirst()).m53665();
        } else {
            activityC18143.f59335 = false;
        }
    }
}
