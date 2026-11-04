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

/* JADX INFO: renamed from: l.ۘ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3786 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12968 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public Drawable f12969;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public String f12970;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC14806 f12971;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public String f12972;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f12973;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public C3072 f12974;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public List f12975;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public C20956 f12976;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public List f12977;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C19448 f12978;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public List f12979;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public Drawable f12980;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "SignatureKeyActivity";
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m12309(ActivityC3786 activityC3786) {
        activityC3786.getClass();
        new C10497(activityC3786).m8197();
    }

    public ActivityC3786() {
        List list = Collections.EMPTY_LIST;
        this.f12979 = list;
        this.f12975 = list;
        this.f12977 = list;
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12973 = getIntent().getBooleanExtra("fromDialog", false);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC7876(1, this));
        this.f12974 = (C3072) m40418(R.id.MT_Protector);
        this.f12980 = C20613.f66066.f66114.m30079();
        this.f12969 = C20613.f66050.f66114.m30079();
        new C10497(this).m8197();
        C25227 c25227 = (C25227) m40418(R.id.MT_Protector);
        C19448 c19448 = new C19448(this);
        this.f12978 = c19448;
        c25227.setAdapter(c19448);
        this.f12976 = ViewOnClickListenerC11499.m28899(this, new C18136(this));
        this.f12974.m10020(new InterfaceC17242() { // from class: l.֨ܿۤ
            @Override // l.InterfaceC17242
            /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
            public final void mo4897() {
                int i = ActivityC3786.f12968;
                new C10497(this.f4760).m8197();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12297(ActivityC3786 activityC3786, String str) {
        AbstractC14806 abstractC14806 = activityC3786.f12971;
        if (abstractC14806 == null) {
            return;
        }
        try {
            C25179 c25179 = new C25179(str);
            try {
                String strMo18532 = abstractC14806.mo18532();
                c25179.m56124(strMo18532 + ".x509.pem");
                StringBuilder sb = new StringBuilder();
                sb.append("-----BEGIN CERTIFICATE-----\n");
                String strEncodeToString = Base64.encodeToString(abstractC14806.m35652().getEncoded(), 2);
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
                c25179.write(sb.toString().getBytes());
                c25179.m56124(strMo18532 + ".pk8");
                c25179.write(abstractC14806.m35653().getEncoded());
                C22673.m51152(R.string.MT_Protector);
                c25179.close();
            } catch (Throwable th) {
                try {
                    c25179.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            activityC3786.m40401(e, (DialogInterface.OnDismissListener) null);
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
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        TextView textView = (TextView) dialogInterfaceC8327M8016.m22423(android.R.id.message);
        C23302.m52413(dialogInterfaceC8327M8016.m22422(), true).mo3052(textView, textView.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12301(ActivityC3786 activityC3786, AbstractC14806 abstractC14806, Runnable runnable) {
        if (abstractC14806.mo18538()) {
            C12569.f40362 = true;
            C16530.m39163(new C22432(runnable), abstractC14806, activityC3786);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12300(ActivityC3786 activityC3786, AbstractC14806 abstractC14806) {
        try {
            activityC3786.m12302(abstractC14806);
        } catch (Exception e) {
            activityC3786.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12302(AbstractC14806 abstractC14806) throws CertificateEncodingException {
        X509Certificate x509CertificateM35652 = abstractC14806.m35652();
        byte[] encoded = x509CertificateM35652.getEncoded();
        abstractC14806.mo18535();
        C16748 c16748 = new C16748();
        View viewM40395 = m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.textView1)).setText(R.string.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView4 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView5 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView6 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView7 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView8 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView9 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        TextView textView10 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.addColon);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.upperCase);
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        if (abstractC14806 instanceof C12569) {
            textView2.setText(R.string.MT_Protector);
        } else if (abstractC14806 instanceof C6604) {
            textView2.setText(R.string.MT_Protector);
        } else if ((abstractC14806 instanceof C24504) || (abstractC14806 instanceof C21520)) {
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
        textView.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView2.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView3.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView4.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView5.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView6.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView7.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView8.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView9.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView10.setOnClickListener(ViewOnClickListenerC15284.m36685());
        textView.setText(abstractC14806.mo18533());
        final RunnableC2819 runnableC2819 = new RunnableC2819(c16748, textView6, textView7, textView8, textView9, textView10);
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        c1256.setChecked(ApplicationC17729.f58258.getBoolean("apk_signature_info_upper_case", true));
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("apk_signature_info_add_colon", true));
        c1256.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ܿۤ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = ActivityC3786.f12968;
                ApplicationC17729.f58258.edit().putBoolean("apk_signature_info_upper_case", z).apply();
                runnableC2819.run();
            }
        });
        c1255.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۜܿۤ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = ActivityC3786.f12968;
                ApplicationC17729.f58258.edit().putBoolean("apk_signature_info_add_colon", z).apply();
                runnableC2819.run();
            }
        });
        dialogInterfaceC8327M8016.m22433().setOnClickListener(new ViewOnClickListenerC5181(this, c16748, 1));
        String sigAlgName = x509CertificateM35652.getSigAlgName();
        String sigAlgOID = x509CertificateM35652.getSigAlgOID();
        if (sigAlgName.equals(sigAlgOID) && (sigAlgName = C7349.m20168(sigAlgOID)) == null) {
            sigAlgName = sigAlgOID;
        }
        textView3.setText(sigAlgName);
        textView4.setText(C22482.m50713(x509CertificateM35652.getNotBefore().getTime()));
        textView5.setText(C22482.m50713(x509CertificateM35652.getNotAfter().getTime()));
        C17494.m41006(this, viewM40395, x509CertificateM35652);
        c16748.m39523(encoded);
        runnableC2819.run();
    }
}
