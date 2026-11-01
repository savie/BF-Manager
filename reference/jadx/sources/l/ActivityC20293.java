package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC20293 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65753 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public String f65754;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C1242 f65755;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public Drawable f65756;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public List f65757;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public AbstractC17131 f65758;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public String f65759;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public List f65760;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public C6018 f65761;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public List f65762;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public C23566 f65763;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f65764;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public Drawable f65765;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "SignatureKeyActivity";
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m45803(ActivityC20293 activityC20293) {
        activityC20293.getClass();
        new C5476(activityC20293).m10243();
    }

    public ActivityC20293() {
        List list = Collections.EMPTY_LIST;
        this.f65762 = list;
        this.f65760 = list;
        this.f65757 = list;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f65764 = getIntent().getBooleanExtra("fromDialog", false);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC2702(1, this));
        this.f65761 = (C6018) m31016(R.id.MT_Protector);
        this.f65765 = C0690.f2912.f2943.m35073();
        this.f65756 = C0690.f2938.f2943.m35073();
        new C5476(this).m10243();
        C17492 c17492 = (C17492) m31016(R.id.MT_Protector);
        C1242 c1242 = new C1242(this);
        this.f65755 = c1242;
        c17492.setAdapter(c1242);
        this.f65763 = ViewOnClickListenerC8374.m21926(this, new C13217(this));
        this.f65761.m16334(new C4043(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45789(ActivityC20293 activityC20293, String str) {
        AbstractC17131 abstractC17131 = activityC20293.f65758;
        if (abstractC17131 == null) {
            return;
        }
        try {
            C22918 c22918 = new C22918(str);
            try {
                String strMo1460 = abstractC17131.mo1460();
                c22918.m50725(strMo1460 + ".x509.pem");
                StringBuilder sb = new StringBuilder();
                sb.append("-----BEGIN CERTIFICATE-----\n");
                String strEncodeToString = Base64.encodeToString(abstractC17131.m40009().getEncoded(), 2);
                StringBuilder sb2 = new StringBuilder();
                int i = 0;
                while (i < strEncodeToString.length()) {
                    int i2 = i + 64;
                    sb2.append((CharSequence) strEncodeToString, i, Math.min(i2, strEncodeToString.length()));
                    sb2.append("\n");
                    i = i2;
                }
                sb.append(sb2.toString());
                sb.append("\n-----END CERTIFICATE-----");
                c22918.write(sb.toString().getBytes());
                c22918.m50725(strMo1460 + ".pk8");
                c22918.write(abstractC17131.m40013().getEncoded());
                C15829.m37611(R.string.MT_Protector);
                c22918.close();
            } catch (Throwable th) {
                try {
                    c22918.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            activityC20293.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        TextView textView = (TextView) dialogInterfaceC19356M21269.m44364(android.R.id.message);
        C0091.m1034(dialogInterfaceC19356M21269.m44363(), true).mo20653(textView, textView.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45793(ActivityC20293 activityC20293, AbstractC17131 abstractC17131, Runnable runnable) {
        if (abstractC17131.mo1457()) {
            C19954.f63907 = true;
            C23053.m50999(new C22410(runnable), abstractC17131, activityC20293);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45792(ActivityC20293 activityC20293, AbstractC17131 abstractC17131) {
        try {
            activityC20293.m45788(abstractC17131);
        } catch (Exception e) {
            activityC20293.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45788(AbstractC17131 abstractC17131) throws CertificateEncodingException {
        X509Certificate x509CertificateM40009 = abstractC17131.m40009();
        byte[] encoded = x509CertificateM40009.getEncoded();
        abstractC17131.mo1458();
        final C10105 c10105 = new C10105();
        View viewM30995 = m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView6 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView7 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView8 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView9 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView10 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.addColon);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.upperCase);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        if (abstractC17131 instanceof C19954) {
            textView2.setText(R.string.MT_Protector);
        } else if (abstractC17131 instanceof C0197) {
            textView2.setText(R.string.MT_Protector);
        } else if ((abstractC17131 instanceof C16426) || (abstractC17131 instanceof C5842)) {
            textView2.setText(R.string.MT_Protector);
        }
        textView2.setText(textView2.getText().toString().replaceAll("\\(.*\\)|（.*）", "").trim());
        if (Build.VERSION.SDK_INT >= 23) {
            textView6.setHyphenationFrequency(2);
            textView7.setHyphenationFrequency(2);
            textView8.setHyphenationFrequency(2);
            textView9.setHyphenationFrequency(2);
            textView10.setHyphenationFrequency(2);
        }
        textView.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView2.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView3.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView4.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView5.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView6.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView7.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView8.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView9.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView10.setOnClickListener(ViewOnClickListenerC22523.m50033());
        textView.setText(abstractC17131.mo1459());
        final RunnableC9235 runnableC9235 = new RunnableC9235(c10105, textView6, textView7, textView8, textView9, textView10);
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        c12563.setChecked(ApplicationC0716.f2992.getBoolean("apk_signature_info_upper_case", true));
        c12562.setChecked(ApplicationC0716.f2992.getBoolean("apk_signature_info_add_colon", true));
        c12563.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۗ֡ۨ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = ActivityC20293.f65753;
                ApplicationC0716.f2992.edit().putBoolean("apk_signature_info_upper_case", z).apply();
                runnableC9235.run();
            }
        });
        c12562.setOnCheckedChangeListener(new C4770(0, runnableC9235));
        dialogInterfaceC19356M21269.m44374().setOnClickListener(new View.OnClickListener() { // from class: l.ܰܽۨ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC20293.f65753;
                ActivityC20293 activityC20293 = this.f45894;
                activityC20293.getClass();
                C7282.m19429(activityC20293, c10105);
            }
        });
        String sigAlgName = x509CertificateM40009.getSigAlgName();
        String sigAlgOID = x509CertificateM40009.getSigAlgOID();
        if (sigAlgName.equals(sigAlgOID) && (sigAlgName = C2811.m8546(sigAlgOID)) == null) {
            sigAlgName = sigAlgOID;
        }
        textView3.setText(sigAlgName);
        textView4.setText(C5319.m14739(x509CertificateM40009.getNotBefore().getTime()));
        textView5.setText(C5319.m14739(x509CertificateM40009.getNotAfter().getTime()));
        C7282.m19427(this, viewM30995, x509CertificateM40009);
        c10105.m25717(encoded);
        runnableC9235.run();
    }
}
