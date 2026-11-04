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

/* JADX INFO: renamed from: l.ۖۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L58U */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC2437 implements DialogInterface.OnClickListener, AdapterView.OnItemClickListener, View.OnClickListener, Runnable {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static String f7800;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f7801;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextView f7802;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f7803;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f7804;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C18099 f7806;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Thread f7809;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f7810;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f7811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BaseAdapter f7814;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f7805 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f7812 = false;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f7807 = true;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f7808 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f7813 = C6912.m19190();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo8227();

    public AbstractDialogInterfaceOnClickListenerC2437(AbstractActivityC17204 abstractActivityC17204) {
        this.f7803 = 0;
        this.f7811 = abstractActivityC17204;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        C18597.m43179(listView);
        listView.setOnItemClickListener(this);
        listView.setDivider(null);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, this);
        DialogInterfaceC8327 dialogInterfaceC8327M23911 = C8947.m23911(c2361, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f7801 = dialogInterfaceC8327M23911;
        C5416.m16144(dialogInterfaceC8327M23911);
        View viewM22423 = dialogInterfaceC8327M23911.m22423(R.id.title);
        viewM22423.setPadding(viewM22423.getPaddingLeft(), viewM22423.getPaddingTop(), viewM22423.getPaddingRight(), viewM22423.getPaddingTop() / 3);
        dialogInterfaceC8327M23911.m22440().setOnClickListener(this);
        if (this.f7813.isEmpty()) {
            onClick(null);
        }
        if (f7800 != null) {
            for (int i2 = 0; i2 < this.f7813.size(); i2++) {
                if (f7800.equals(((C18099) this.f7813.get(i2)).m42221())) {
                    this.f7803 = i2;
                    break;
                }
            }
        }
        C0946 c0946 = new C0946(this);
        this.f7814 = c0946;
        listView.setAdapter((ListAdapter) c0946);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8226(String str, String str2) {
        if (this.f7812 || !this.f7806.m42220(str)) {
            this.f7806.m42215(str, str2);
            return;
        }
        if (this.f7805) {
            return;
        }
        C7658 c7658M42213 = this.f7806.m42213(str);
        if (str2.equals(c7658M42213.f25230)) {
            return;
        }
        C22415.m50556();
        this.f7804 = true;
        this.f7811.runOnUiThread(new RunnableC9894(this, c7658M42213, str2));
        while (this.f7804) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
        if (this.f7807) {
            return;
        }
        this.f7806.m42215(str, str2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        if (this.f7803 < this.f7813.size()) {
            this.f7809 = Thread.currentThread();
            C18099 c18099 = (C18099) this.f7813.get(this.f7803);
            this.f7806 = c18099;
            try {
                c18099.m42218();
                new Thread(this).start();
            } catch (Exception e) {
                this.f7811.m40401(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Thread.currentThread() != this.f7809) {
            while (mo8227()) {
            }
            this.f7811.runOnUiThread(this);
        } else {
            try {
                this.f7806.m42217();
                C22673.m51152(R.string.MT_Protector);
            } catch (IOException unused) {
                C22673.m51152(R.string.MT_Protector);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f7803 = i;
        f7800 = ((C18099) this.f7813.get(i)).m42221();
        this.f7814.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C18845 c18845 = new C18845(this, this.f7811);
        c18845.m22945(R.string.MT_Protector);
        c18845.m22918();
        c18845.m22957(6);
        c18845.m22955(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8215(AbstractDialogInterfaceOnClickListenerC2437 abstractDialogInterfaceOnClickListenerC2437) {
        AbstractActivityC17204 abstractActivityC17204 = abstractDialogInterfaceOnClickListenerC2437.f7811;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        abstractDialogInterfaceOnClickListenerC2437.f7810 = (TextView) viewM40395.findViewById(R.id.title);
        abstractDialogInterfaceOnClickListenerC2437.f7802 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        int i = 1;
        abstractDialogInterfaceOnClickListenerC2437.f7810.setTextIsSelectable(true);
        abstractDialogInterfaceOnClickListenerC2437.f7802.setTextIsSelectable(true);
        RadioButton[] radioButtonArr = {(RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.MT_Protector), (RadioButton) viewM40395.findViewById(R.id.radioButton3), (RadioButton) viewM40395.findViewById(R.id.radioButton4)};
        ViewOnClickListenerC25319 viewOnClickListenerC25319 = new ViewOnClickListenerC25319(1, radioButtonArr);
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(viewOnClickListenerC25319);
        }
        int i3 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18826(i, abstractDialogInterfaceOnClickListenerC2437, radioButtonArr));
        abstractDialogInterfaceOnClickListenerC2437.f7808 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8218(AbstractDialogInterfaceOnClickListenerC2437 abstractDialogInterfaceOnClickListenerC2437, RadioButton[] radioButtonArr) {
        abstractDialogInterfaceOnClickListenerC2437.f7804 = false;
        if (radioButtonArr[0].isChecked()) {
            abstractDialogInterfaceOnClickListenerC2437.f7807 = true;
            return;
        }
        if (radioButtonArr[1].isChecked()) {
            abstractDialogInterfaceOnClickListenerC2437.f7807 = false;
            return;
        }
        if (radioButtonArr[2].isChecked()) {
            abstractDialogInterfaceOnClickListenerC2437.f7807 = true;
            abstractDialogInterfaceOnClickListenerC2437.f7805 = true;
        } else if (radioButtonArr[3].isChecked()) {
            abstractDialogInterfaceOnClickListenerC2437.f7807 = false;
            abstractDialogInterfaceOnClickListenerC2437.f7812 = true;
        }
    }
}
