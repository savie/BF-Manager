package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֡֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0102 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1040;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LinkedList f1041;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC9051 f1042;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f1043;

    public C0102() {
        throw null;
    }

    public C0102(ActivityC0848 activityC0848, LinkedList linkedList, AbstractC9051 abstractC9051, boolean z) {
        this.f1043 = activityC0848;
        this.f1041 = linkedList;
        this.f1042 = abstractC9051;
        this.f1040 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1202() {
        boolean z = this.f1040;
        ActivityC0848 activityC0848 = this.f1043;
        AbstractC9051 abstractC9051 = this.f1042;
        if (z || !abstractC9051.mo24170()) {
            abstractC9051.m24164(activityC0848);
            m1201();
            return;
        }
        activityC0848.m3457();
        ActivityC0848.m3419(activityC0848, abstractC9051);
        C2361 c2361BuildDialog = activityC0848.buildDialog();
        c2361BuildDialog.m8024(C18969.m44060(25, abstractC9051.mo1445()));
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶֫ۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final C0102 c0102 = this.f67093;
                c0102.f1042.mo24165(c0102.f1043, false, new Runnable() { // from class: l.ܿ֫ۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0102 c0103 = c0102;
                        c0103.f1042.m24164(c0103.f1043);
                        c0103.m1201();
                    }
                });
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10652(1, this));
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1201() {
        LinkedList linkedList = this.f1041;
        if (linkedList.isEmpty()) {
            return;
        }
        ((C0102) linkedList.removeFirst()).m1202();
    }
}
