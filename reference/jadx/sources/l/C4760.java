package l;

import android.view.ViewGroup;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4760 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f16766;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f16767;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13810 f16768;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f16769;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f16770;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11545 f16771;

    public C4760(C11545 c11545, List list) {
        this.f16771 = c11545;
        this.f16768 = (C13810) c11545.m28817();
        this.f16769 = list;
        boolean z = false;
        this.f16766 = list.size() > 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC2557.isDirectory() && !interfaceC2557.mo7986()) {
                z = true;
                break;
            }
        }
        this.f16767 = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13225(RunnableC22400 runnableC22400) {
        List list = this.f16769;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C13810 c13810 = this.f16768;
        String strM33624 = c13810.m33624();
        AbstractC20745 abstractC20745M15313 = C5553.m15313(strM33624, new String[0]);
        this.f16770 = abstractC20745M15313;
        boolean zMo8447 = abstractC20745M15313.mo8447();
        C11545 c11545 = this.f16771;
        if (zMo8447) {
            AbstractC20745 abstractC20745M46689 = this.f16770.m46689();
            C13638.requireNonNull(abstractC20745M46689);
            if (!abstractC20745M46689.mo8447()) {
                if (!C6696.m18084()) {
                    c11545.m28824().m31000(C16737.m39264(R.string.MT_Protector, strM33624), false);
                    return;
                }
            }
        } else if (!C6696.m18084()) {
            c11545.m28824().m31000(C16737.m39264(R.string.MT_Protector, strM33624), false);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) c11545.m28824().m30995(R.layout.MT_Protector);
        CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) viewGroup.findViewById(R.id.MT_Protector);
        checkBox.setChecked(true);
        checkBox2.setVisibility(8);
        boolean zM33623 = c13810.m33623();
        String strM14744 = C5319.m14744(this.f16766 ? System.currentTimeMillis() : ((C5696) list.get(0)).getTime());
        C23336 c23336 = new C23336(this, c11545.m28824(), zM33623, checkBox, viewGroup, zM33623 ? C20240.m45747(this.f16770) : null, runnableC22400);
        c23336.m40376(R.string.MT_Protector);
        c23336.m40346((CharSequence) strM14744);
        c23336.m40367(C5319.m14738());
        c23336.m40340();
        c23336.m40336(6);
        c23336.m40350(4);
        c23336.m40345(new C4408(true));
        c23336.m40368(true);
        c23336.m40338().setOnClickListener(new ViewOnClickListenerC6505(4, c23336));
        C23250.m51309(c23336.m40335());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13220(C4760 c4760, RunnableC22400 runnableC22400, long j, boolean z, C14558 c14558, boolean z2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (InterfaceC2557 interfaceC2557 : c4760.f16769) {
            String strSubstring = interfaceC2557.getPath().substring(1);
            if (interfaceC2557.isDirectory()) {
                arrayList.add(strSubstring + "/");
            } else {
                hashSet.add(strSubstring);
            }
        }
        new C2873(c4760, c14558, z2, hashSet, arrayList, z, j, hashSet2, runnableC22400).m10243();
    }
}
