package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 698T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3449 extends AbstractC4674 {
    public C3449() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        if (c21422.m47975() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c21422.m47979().iterator();
            while (it.hasNext()) {
                arrayList.add(new C10840((InterfaceC2557) it.next()));
            }
            c21422.m47960().mo13033(c21422.m47965(), arrayList, new RunnableC22610(this, arrayList, c21422, 1));
            return;
        }
        final C11545 c11545M47970 = c21422.m47970();
        c21422.m47960().m28625(c21422.m47965(), c21422.m47981(), new InterfaceC3263() { // from class: l.᩻᩵᩹
            @Override // l.InterfaceC3263
            /* JADX INFO: renamed from: ۙ */
            public final void mo3187(C10840 c10840) {
                c10840.m27172();
                C11545 c11545 = c11545M47970;
                c11545.m28817().m28625(c11545, c11545.m28797(), new C2038(this.f77467, c10840, c21422, c11545));
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10158(C3449 c3449, ArrayList arrayList, C21422 c21422) {
        ((C10840) arrayList.get(0)).m27172();
        ((C10840) arrayList.get(1)).m27172();
        AbstractC20745 abstractC20745M27177 = ((C10840) arrayList.get(0)).m27177();
        AbstractC20745 abstractC20745M27178 = ((C10840) arrayList.get(1)).m27177();
        C3246 c3246 = new C3246(abstractC20745M27177, abstractC20745M27178, abstractC20745M27177.mo33986(), abstractC20745M27178.mo33986(), c21422.m47960(), c21422.m47960());
        C11545 c11545M47965 = c21422.m47965();
        c3246.m9719();
        c3449.m10160(c11545M47965, c3246);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10159(C3449 c3449, C10840 c10840, C21422 c21422, C11545 c11545, C10840 c10841) {
        String name;
        String name2;
        c10841.m27172();
        AbstractC20745 abstractC20745M27177 = c10840.m27177();
        AbstractC20745 abstractC20745M27178 = c10841.m27177();
        boolean zM28762 = c21422.m47965().m28762();
        if (abstractC20745M27177.getName().equals(abstractC20745M27178.getName())) {
            int i = R.string.MT_Protector;
            name = C16737.m39264(zM28762 ? R.string.MT_Protector : R.string.MT_Protector, abstractC20745M27177.getName());
            if (!zM28762) {
                i = R.string.MT_Protector;
            }
            name2 = C16737.m39264(i, abstractC20745M27178.getName());
        } else {
            name = abstractC20745M27177.getName();
            name2 = abstractC20745M27178.getName();
        }
        C3246 c3246 = new C3246(c10840.m27177(), c10841.m27177(), name, name2, c21422.m47960(), c11545.m28817());
        if (!zM28762) {
            c3246.m9718();
        }
        c3449.m10160(c21422.m47965(), c3246);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10160(final C11545 c11545, final C3246 c3246) {
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(m12942());
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4388.m12238(c3246.f12072, c3246.f12075, editText, editText2);
        Main mainM28824 = c11545.m28824();
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(mainM28824);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳ᩵᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C3246 c3247 = c3246;
                c3247.m9717();
                AbstractC20745 abstractC20745 = c3247.f12071;
                AbstractC20745 abstractC20746 = c3247.f12074;
                C3449 c3449 = this.f48202;
                AbstractC20745 abstractC20745M4734 = C1333.m4734(c11545, c3449.m12942(), "txt");
                int i3 = C20725.f67443;
                C10142 c10142 = new C10142(C9801.class);
                c10142.m25768("saveAsPath", abstractC20745M4734.mo33986());
                c10142.m25768("inputPath1", abstractC20745.mo33986());
                c10142.m25768("inputPath2", abstractC20746.mo33986());
                c10142.m25768("title", C16737.m39288(c3449.m12942()));
                c10142.m25763();
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269().m44361().setOnClickListener(new ViewOnClickListenerC14381(c3246, editText, editText2, 1));
    }
}
