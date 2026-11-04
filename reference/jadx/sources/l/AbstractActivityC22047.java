package l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActivityC22047 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71100 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public View f71101;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f71102 = true;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f71103;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f71104;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C23582 f71105;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C5639 f71106;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f71107;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C24132 f71108;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f71109;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f71110;

    /* JADX INFO: renamed from: ֫ۙ */
    public abstract boolean mo1384();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1385(Exception exc);

    /* JADX INFO: renamed from: ۚۙ */
    public abstract String mo1386();

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo1387(String str);

    /* JADX INFO: renamed from: ۤۙ */
    public String mo35215() {
        return null;
    }

    /* JADX INFO: renamed from: ۧۙ */
    public abstract String mo1388();

    /* JADX INFO: renamed from: ۫ۙ */
    public int mo1389() {
        return -1;
    }

    /* JADX INFO: renamed from: ܳۙ */
    public abstract String mo1390();

    /* JADX INFO: renamed from: ᩴۙ */
    public int mo1391() {
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ᩷ۙ */
    public abstract String mo1392();

    /* JADX INFO: renamed from: ᩸ۙ */
    public String mo35216() {
        return null;
    }

    /* JADX INFO: renamed from: ᩻ۙ */
    public void mo1393() {
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40415();
        m40418(R.layout.MT_Protector);
        m40418(R.id.MT_Protector).setVisibility(8);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        C6784.m18918(this.f56046).setTextSize(17.0f);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC6323 c2896 = new C2896(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c2896);
        final ProgressBar progressBar = (ProgressBar) m40418(R.id.MT_Protector);
        C14459 c14459 = new C14459(this);
        c14459.m34928(false);
        c14459.m34926();
        progressBar.setIndeterminateDrawable(c14459);
        this.f71101 = m40418(R.id.MT_Protector);
        C24132 c24132 = (C24132) m40418(R.id.MT_Protector);
        this.f71108 = c24132;
        m40419(c24132);
        this.f71106 = new C5639(this, this.f71108);
        C23582 c23582 = new C23582(this, this.f71108, "code", new C19403(3, this));
        this.f71105 = c23582;
        c23582.m52810(this, this.f71106, ActivityC7261.class);
        if (this instanceof ActivityC14587) {
            this.f71105.m52819();
        }
        this.f71108.m53922(new InterfaceC16497() { // from class: l.ۡ᩵᩸
            @Override // l.InterfaceC16497
            /* JADX INFO: renamed from: ۙ */
            public final void mo1354(boolean z) {
                int i = AbstractActivityC22047.f71100;
                progressBar.setVisibility(z ? 0 : 8);
            }
        });
        this.f71108.m53912(new C8862(this));
        this.f71108.m53916(new C7371(this));
        if (mo1384()) {
            setTitle(mo1386());
            this.f71105.m52807(mo1390());
            String strMo35216 = mo35216();
            if (strMo35216 != null) {
                this.f71105.m52822(strMo35216);
            }
            new C14082(this).m8197();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        int iMo1389 = mo1389();
        if (iMo1389 == -1) {
            menu.findItem(R.id.MT_Protector).setVisible(false);
        } else {
            menu.findItem(R.id.MT_Protector).setTitle(iMo1389);
        }
        this.f71103 = (InterfaceMenuItemC22709) menu.findItem(R.id.MT_Protector);
        this.f71107 = (InterfaceMenuItemC22709) menu.findItem(R.id.MT_Protector);
        this.f71110 = (InterfaceMenuItemC22709) menu.findItem(R.id.MT_Protector);
        this.f71109 = (InterfaceMenuItemC22709) menu.findItem(R.id.MT_Protector);
        this.f71104 = (InterfaceMenuItemC22709) menu.findItem(R.id.MT_Protector);
        this.f71103.setEnabled(this.f71108.m53999());
        this.f71107.setEnabled(this.f71108.m53957());
        this.f71110.setEnabled(this.f71108.m53890());
        menu.findItem(R.id.MT_Protector).setChecked(this.f71108.m54083());
        menu.findItem(R.id.MT_Protector).setVisible(false);
        this.f71105.m52805(menu.findItem(R.id.MT_Protector));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            if (this.f71102) {
                this.f71102 = false;
                menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f71108.m53953());
            }
            this.f71109.setEnabled(this.f71108.m54097());
            this.f71104.setEnabled(this.f71108.m54060());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m49887(false, (ResultCallback) null);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo1393();
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m49889();
                return true;
            }
            this.f71105.m52825(menuItem);
            return true;
        }
        C24132 c24132 = this.f71108;
        c24132.m54107(!c24132.m54083());
        menuItem.setChecked(this.f71108.m54083());
        this.f71105.m52826();
        this.f71106.m16625();
        return true;
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f71105.m52804()) {
            this.f71106.m16625();
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f71105.m52821();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49885(AbstractActivityC22047 abstractActivityC22047) {
        abstractActivityC22047.m49887(true, (ResultCallback) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m49887(boolean z, ResultCallback resultCallback) {
        if (this.f71108.m53890()) {
            new C4893(this, z, resultCallback).m8197();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        m49889();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public void m49889() {
        if (this.f71108.m53890()) {
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8024(mo1386());
            c2361.m8000(mo1391());
            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5891(2, this));
            c2361.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21760(2, this));
            c2361.m8016();
            return;
        }
        finish();
    }
}
