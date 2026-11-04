package l;

import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5609 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f19437;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f19438;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f19439;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8614 f19440;

    public C5609(C8614 c8614, List list) {
        this.f19440 = c8614;
        this.f19439 = list;
        boolean z = false;
        this.f19438 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC2386.isDirectory() && !interfaceC2386.mo8107()) {
                z = true;
                break;
            }
        }
        this.f19437 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16588(RunnableC3547 runnableC3547) {
        List list = this.f19439;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C8614 c8614 = this.f19440;
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        String strM50718 = C22482.m50718(this.f19438 ? System.currentTimeMillis() : ((InterfaceC2386) list.get(0)).getTime());
        C19779 c19779 = new C19779(this, c8614.m23233(), viewM40395, checkBox, checkBox2, runnableC3547);
        c19779.m22945(R.string.MT_Protector);
        c19779.m22924((CharSequence) strM50718);
        c19779.m22933(C22482.m50712());
        c19779.m22918();
        c19779.m22948(4);
        c19779.m22957(6);
        c19779.m22923(new C4863(true));
        c19779.m22955(true);
        c19779.m22928().setOnClickListener(new ViewOnClickListenerC15853(1, c19779));
    }
}
