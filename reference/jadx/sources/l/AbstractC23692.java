package l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23692 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f76663;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10948 f76664;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f76665;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f76666 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ImageView f76667;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10948 f76668;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo12061(int i, int i2);

    public AbstractC23692(AbstractActivityC12483 abstractActivityC12483, int i, int i2) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        this.f76668 = c10948;
        C10948 c10949 = (C10948) viewM30995.findViewById(R.id.editText2);
        this.f76664 = c10949;
        ImageView imageView = (ImageView) viewM30995.findViewById(R.id.MT_Protector);
        this.f76667 = imageView;
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        c10948.mo16989((CharSequence) String.valueOf(i));
        c10949.mo16989((CharSequence) String.valueOf(i2));
        this.f76665 = Math.max(1, i);
        this.f76663 = Math.max(1, i2);
        c10948.m27473(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c10949.m27473(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c10948.m16853(new C6052(this));
        c10949.m16853(new C10992(this));
        imageView.setOnClickListener(new ViewOnClickListenerC22460(2, this));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC19356M10334.m44373().setOnClickListener(new ViewOnClickListenerC22192(this, dialogInterfaceC19356M10334));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52145(AbstractC23692 abstractC23692) {
        ImageView imageView = abstractC23692.f76667;
        boolean z = abstractC23692.f76666;
        abstractC23692.f76666 = !z;
        if (!z) {
            imageView.setImageResource(R.drawable.MT_Protector);
            try {
                int i = Integer.parseInt(abstractC23692.f76668.m17000().toString());
                int i2 = Integer.parseInt(abstractC23692.f76664.m17000().toString());
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                abstractC23692.f76665 = i;
                abstractC23692.f76663 = i2;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        imageView.setImageResource(R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52146(AbstractC23692 abstractC23692, DialogInterfaceC19356 dialogInterfaceC19356) {
        C10948 c10948 = abstractC23692.f76664;
        C10948 c10949 = abstractC23692.f76668;
        try {
            int i = Integer.parseInt(c10949.m17000().toString());
            try {
                int i2 = Integer.parseInt(c10948.m17000().toString());
                dialogInterfaceC19356.dismiss();
                abstractC23692.mo12061(i, i2);
            } catch (Exception unused) {
                c10948.requestFocus();
                C15829.m37611(R.string.MT_Protector);
            }
        } catch (Exception unused2) {
            c10949.requestFocus();
            C15829.m37611(R.string.MT_Protector);
        }
    }
}
