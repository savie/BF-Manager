package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ᩴۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19610 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1255 f63203;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView f63204;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f63205;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5440 f63206;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f63207;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1255 f63208;

    public C19610(ActivityC5440 activityC5440) {
        this.f63206 = activityC5440;
        View viewM40395 = activityC5440.m40395(R.layout.MT_Protector);
        this.f63205 = viewM40395;
        this.f63207 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        m45260();
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۜ۫ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19610 c19610 = this.f23640;
                C22594 c22594 = new C22594(c19610, c19610.f63206);
                c22594.m25512(R.string.MT_Protector, R.string.MT_Protector);
                c22594.m25513(R.string.MT_Protector);
                c22594.m25517();
                C21576.m49069(new RunnableC12350(2, c22594), 200L);
                C23255 c23255M25509 = c22594.m25509(0);
                C23255 c23255M255010 = c22594.m25509(1);
                c23255M25509.m52326(o.a.b);
                c23255M255010.m52326(o.a.b);
                int i = C24832.f80322;
                c23255M25509.mo52335((CharSequence) String.valueOf(ApplicationC17729.f58258.getInt("text_function_min_line", 1)));
                c23255M255010.mo52335((CharSequence) String.valueOf(ApplicationC17729.f58258.getInt("text_function_max_line", 4)));
            }
        });
        this.f63204 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        m45263();
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۬۫ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C19610 c19610 = this.f43976;
                C2361 c2361BuildDialog = c19610.f63206.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                int i = C24832.f80322;
                c2361BuildDialog.m8001(R.array.MT_Protector, ApplicationC17729.f58258.getInt("tfgi", 0), new DialogInterface.OnClickListener() { // from class: l.ۤۚᩴ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C19610.m45262(c19610, dialogInterface, i2);
                    }
                });
                c2361BuildDialog.m8016();
            }
        });
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        this.f63208 = c1255;
        int i = C24832.f80322;
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("tfugh", true));
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۙۚᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1255 c1256 = this.f16578.f63208;
                c1256.toggle();
                boolean zIsChecked = c1256.isChecked();
                int i2 = C24832.f80322;
                ApplicationC17729.f58258.edit().putBoolean("tfugh", zIsChecked).apply();
                C24832.m55358();
            }
        });
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        this.f63203 = c1256;
        c1256.setChecked(C5639.m16621());
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۚᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1255 c1257 = this.f69610.f63203;
                c1257.toggle();
                C5639.m16620(c1257.isChecked());
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45262(C19610 c19610, DialogInterface dialogInterface, int i) {
        int i2 = C24832.f80322;
        ApplicationC17729.f58258.edit().mo3486(i, "tfgi").apply();
        C24832.m55358();
        c19610.m45263();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m45260() {
        StringBuilder sb = new StringBuilder();
        int i = C24832.f80322;
        sb.append(ApplicationC17729.f58258.getInt("text_function_min_line", 1));
        sb.append(" - ");
        sb.append(ApplicationC17729.f58258.getInt("text_function_max_line", 4));
        this.f63207.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m45263() {
        String strM49088;
        int i = C24832.f80322;
        int i2 = ApplicationC17729.f58258.getInt("tfgi", 0);
        if (i2 == 0) {
            strM49088 = C21576.m49088(R.string.MT_Protector);
        } else if (i2 == 1) {
            strM49088 = C21576.m49088(R.string.MT_Protector);
        } else {
            strM49088 = i2 != 2 ? null : C21576.m49088(R.string.MT_Protector);
        }
        this.f63204.setText(strM49088);
    }
}
