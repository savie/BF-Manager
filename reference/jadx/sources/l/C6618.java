package l;

import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6618 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f22116;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f22117;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f22118;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8614 f22119;

    public C6618(C8614 c8614, List list) {
        this.f22119 = c8614;
        this.f22118 = list;
        boolean z = false;
        this.f22117 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (interfaceC2386.isDirectory() && !interfaceC2386.mo8107()) {
                z = true;
                break;
            }
        }
        this.f22116 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18555(RunnableC5631 runnableC5631) {
        List list = this.f22118;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C8614 c8614 = this.f22119;
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        String strM50718 = C22482.m50718(this.f22117 ? System.currentTimeMillis() : ((InterfaceC2386) list.get(0)).getTime());
        C23772 c23772 = new C23772(this, c8614.m23233(), viewM40395, checkBox, checkBox2, runnableC5631);
        c23772.m22945(R.string.MT_Protector);
        c23772.m22924((CharSequence) strM50718);
        c23772.m22933(C22482.m50712());
        c23772.m22918();
        c23772.m22948(4);
        c23772.m22957(6);
        c23772.m22923(new C4863(true));
        c23772.m22955(true);
        c23772.m22928().setOnClickListener(new ViewOnClickListenerC16978(2, c23772));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18550(C6618 c6618, RunnableC5631 runnableC5631, long j, boolean z, boolean z2) {
        new C12583(c6618, (AbstractC18881) c6618.f22119.m23213().mo10174(), z, z2, j, runnableC5631).m8197();
    }
}
