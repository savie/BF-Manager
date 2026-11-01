package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC1587 implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener, View.OnClickListener, Runnable {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static String f6349;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f6352;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f6353;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Thread f6354;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextView f6356;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0176 f6357;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f6358;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f6359;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f6360;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BaseAdapter f6362;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f6355 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f6350 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6351 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f6363 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f6361 = C4678.m12968();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo5419();

    public AbstractDialogInterfaceOnClickListenerC1587(AbstractActivityC12483 abstractActivityC12483) {
        this.f6358 = 0;
        this.f6359 = abstractActivityC12483;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        C16754.m39314(listView);
        listView.setOnItemClickListener(this);
        listView.setDivider(null);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, this);
        DialogInterfaceC19356 dialogInterfaceC19356M52499 = C23821.m52499(c8067, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f6360 = dialogInterfaceC19356M52499;
        C23250.m51309(dialogInterfaceC19356M52499);
        View viewM44364 = dialogInterfaceC19356M52499.m44364(R.id.MT_Protector);
        viewM44364.setPadding(viewM44364.getPaddingLeft(), viewM44364.getPaddingTop(), viewM44364.getPaddingRight(), viewM44364.getPaddingTop() / 3);
        dialogInterfaceC19356M52499.m44361().setOnClickListener(this);
        if (this.f6361.isEmpty()) {
            onClick(null);
        }
        if (f6349 != null) {
            for (int i2 = 0; i2 < this.f6361.size(); i2++) {
                if (f6349.equals(((C0176) this.f6361.get(i2)).m1373())) {
                    this.f6358 = i2;
                    break;
                }
            }
        }
        C23461 c23461 = new C23461(this);
        this.f6362 = c23461;
        listView.setAdapter((ListAdapter) c23461);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5418(String str, String str2) {
        if (this.f6350 || !this.f6357.m1380(str)) {
            this.f6357.m1376(str, str2);
            return;
        }
        if (this.f6355) {
            return;
        }
        C12172 c12172M1374 = this.f6357.m1374(str);
        if (str2.equals(c12172M1374.f40737)) {
            return;
        }
        C13890.m33727();
        this.f6353 = true;
        this.f6359.runOnUiThread(new RunnableC10761(this, c12172M1374, str2));
        while (this.f6353) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
        if (this.f6351) {
            return;
        }
        this.f6357.m1376(str, str2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        if (this.f6358 < this.f6361.size()) {
            this.f6354 = Thread.currentThread();
            C0176 c0176 = (C0176) this.f6361.get(this.f6358);
            this.f6357 = c0176;
            try {
                c0176.m1377();
                new Thread(this).start();
            } catch (Exception e) {
                this.f6359.m31002(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Thread.currentThread() != this.f6354) {
            while (mo5419()) {
            }
            this.f6359.runOnUiThread(this);
        } else {
            try {
                this.f6357.m1381();
                C15829.m37611(R.string.MT_Protector);
            } catch (IOException unused) {
                C15829.m37611(R.string.MT_Protector);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f6358 = i;
        f6349 = ((C0176) this.f6361.get(i)).m1373();
        this.f6362.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5821 c5821 = new C5821(this, this.f6359);
        c5821.m40376(R.string.MT_Protector);
        c5821.m40340();
        c5821.m40336(6);
        c5821.m40368(true);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m5409(final AbstractDialogInterfaceOnClickListenerC1587 abstractDialogInterfaceOnClickListenerC1587) {
        AbstractActivityC12483 abstractActivityC12483 = abstractDialogInterfaceOnClickListenerC1587.f6359;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        abstractDialogInterfaceOnClickListenerC1587.f6352 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        abstractDialogInterfaceOnClickListenerC1587.f6356 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        abstractDialogInterfaceOnClickListenerC1587.f6352.setTextIsSelectable(true);
        abstractDialogInterfaceOnClickListenerC1587.f6356.setTextIsSelectable(true);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.MT_Protector), (RadioButton) viewM30995.findViewById(R.id.radioButton3), (RadioButton) viewM30995.findViewById(R.id.radioButton4)};
        ViewOnClickListenerC14803 viewOnClickListenerC14803 = new ViewOnClickListenerC14803(2, radioButtonArr);
        for (int i = 0; i < 4; i++) {
            radioButtonArr[i].setOnClickListener(viewOnClickListenerC14803);
        }
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿۙۖ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AbstractDialogInterfaceOnClickListenerC1587.m5412(this.f54577, radioButtonArr);
            }
        });
        abstractDialogInterfaceOnClickListenerC1587.f6363 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5412(AbstractDialogInterfaceOnClickListenerC1587 abstractDialogInterfaceOnClickListenerC1587, RadioButton[] radioButtonArr) {
        abstractDialogInterfaceOnClickListenerC1587.f6353 = false;
        if (radioButtonArr[0].isChecked()) {
            abstractDialogInterfaceOnClickListenerC1587.f6351 = true;
            return;
        }
        if (radioButtonArr[1].isChecked()) {
            abstractDialogInterfaceOnClickListenerC1587.f6351 = false;
            return;
        }
        if (radioButtonArr[2].isChecked()) {
            abstractDialogInterfaceOnClickListenerC1587.f6351 = true;
            abstractDialogInterfaceOnClickListenerC1587.f6355 = true;
        } else if (radioButtonArr[3].isChecked()) {
            abstractDialogInterfaceOnClickListenerC1587.f6351 = false;
            abstractDialogInterfaceOnClickListenerC1587.f6350 = true;
        }
    }
}
