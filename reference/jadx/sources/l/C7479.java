package l;

import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7479 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11545 f24913;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f24914;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f24915;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f24916;

    public C7479(C11545 c11545, List list) {
        this.f24913 = c11545;
        this.f24916 = list;
        boolean z = false;
        this.f24915 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC2557.isDirectory() && !interfaceC2557.mo7986()) {
                z = true;
                break;
            }
        }
        this.f24914 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19978(RunnableC3681 runnableC3681) {
        List list = this.f24916;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C11545 c11545 = this.f24913;
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        String strM14744 = C5319.m14744(this.f24915 ? System.currentTimeMillis() : ((InterfaceC2557) list.get(0)).getTime());
        final C8185 c8185 = new C8185(this, c11545.m28824(), viewM30995, checkBox, checkBox2, runnableC3681);
        c8185.m40376(R.string.MT_Protector);
        c8185.m40346((CharSequence) strM14744);
        c8185.m40367(C5319.m14738());
        c8185.m40340();
        c8185.m40350(4);
        c8185.m40336(6);
        c8185.m40345(new C4408(true));
        c8185.m40368(true);
        c8185.m40338().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ۬֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c8185.m40346((CharSequence) C5319.m14744(System.currentTimeMillis()));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19974(C7479 c7479, RunnableC3681 runnableC3681, long j, boolean z, boolean z2) {
        new C10302(c7479, (AbstractC12233) c7479.f24913.m28817().mo13029(), z, z2, j, runnableC3681).m10243();
    }
}
