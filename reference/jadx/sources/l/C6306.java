package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes2.dex */
public final class C6306 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m17402(AbstractC20745 abstractC20745) {
        if (!abstractC20745.getName().toLowerCase().endsWith(".arsc")) {
            try {
                C2455 c2455 = new C2455(abstractC20745);
                try {
                    C12107 entry = c2455.getEntry("resources.arsc");
                    if (entry == null) {
                        c2455.close();
                        return abstractC20745;
                    }
                    AbstractC20745 abstractC20745M46688 = C11904.f39936.m46688(".arsc");
                    abstractC20745M46688.m46694(c2455.m7471(entry));
                    c2455.close();
                    return abstractC20745M46688;
                } catch (Throwable th) {
                    try {
                        c2455.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        return abstractC20745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17403(C11545 c11545, C3246 c3246) {
        Main mainM28824 = c11545.m28824();
        View viewM30995 = mainM28824.m30995(R.layout.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.editText2);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4388.m12238(c3246.f12072, c3246.f12075, editText, editText2);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(mainM28824);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20418(0, c3246, c11545));
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269().m44361().setOnClickListener(new ViewOnClickListenerC0661(c3246, editText, editText2, 0));
    }
}
