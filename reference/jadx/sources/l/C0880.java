package l;

import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0880 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11545 f3569;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f3570;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f3571;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f3572;

    public C0880(C11545 c11545, List list) {
        this.f3569 = c11545;
        this.f3572 = list;
        boolean z = false;
        this.f3571 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC2557.isDirectory() && !interfaceC2557.mo7986()) {
                z = true;
                break;
            }
        }
        this.f3570 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3555(RunnableC10138 runnableC10138) {
        List list = this.f3572;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C11545 c11545 = this.f3569;
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        String strM14744 = C5319.m14744(this.f3571 ? System.currentTimeMillis() : ((InterfaceC2557) list.get(0)).getTime());
        C2291 c2291 = new C2291(this, c11545.m28824(), viewM30995, checkBox, checkBox2, runnableC10138);
        c2291.m40376(R.string.MT_Protector);
        c2291.m40346((CharSequence) strM14744);
        c2291.m40367(C5319.m14738());
        c2291.m40340();
        c2291.m40350(4);
        c2291.m40336(6);
        c2291.m40345(new C4408(true));
        c2291.m40368(true);
        c2291.m40338().setOnClickListener(new ViewOnClickListenerC12024(3, c2291));
    }
}
