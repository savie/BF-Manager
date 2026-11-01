package l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractActivityC10490 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f35934 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f35935;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f35936;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public View f35937;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C6111 f35938;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f35939;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f35940 = true;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public C16839 f35941;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f35942;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C20556 f35943;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f35944;

    /* JADX INFO: renamed from: ֫ */
    public String mo25147() {
        return null;
    }

    /* JADX INFO: renamed from: ۖۙ */
    public abstract boolean mo7992();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int mo26619() {
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo7993(Exception exc);

    /* JADX INFO: renamed from: ۙۙ */
    public abstract String mo7994();

    /* JADX INFO: renamed from: ۚۙ */
    public abstract String mo7995();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String mo26620() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo7996(String str);

    /* JADX INFO: renamed from: ۨۙ */
    public abstract String mo7997();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int mo26621() {
        return -1;
    }

    /* JADX INFO: renamed from: ܳ */
    public abstract String mo7998();

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public void mo26622() {
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31023();
        m31016(R.layout.MT_Protector);
        m31016(R.id.MT_Protector).setVisibility(8);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        C22377.m49629(this.f41645).setTextSize(17.0f);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC19432 c18250 = new C18250(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c18250);
        ProgressBar progressBar = (ProgressBar) m31016(R.id.MT_Protector);
        C11089 c11089 = new C11089(this);
        c11089.m27980(false);
        c11089.m27978();
        progressBar.setIndeterminateDrawable(c11089);
        this.f35937 = m31016(R.id.MT_Protector);
        C6111 c6111 = (C6111) m31016(R.id.MT_Protector);
        this.f35938 = c6111;
        m31019(c6111);
        this.f35941 = new C16839(this, this.f35938);
        C20556 c20556 = new C20556(this, this.f35938, "code", new C22673(this));
        this.f35943 = c20556;
        c20556.m46371(this, this.f35941, ActivityC14081.class);
        if (this instanceof ActivityC11591) {
            this.f35943.m46386();
        }
        this.f35938.m16884(new C21778(0, progressBar));
        this.f35938.m16868(new C18956(this));
        this.f35938.m16865(new C8373(this));
        if (mo7992()) {
            setTitle(mo7997());
            this.f35943.m46369(mo7994());
            String strMo26620 = mo26620();
            if (strMo26620 != null) {
                this.f35943.m46380(strMo26620);
            }
            new C19662(this).m10243();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        int iMo26621 = mo26621();
        if (iMo26621 == -1) {
            menu.findItem(R.id.MT_Protector).setVisible(false);
        } else {
            menu.findItem(R.id.MT_Protector).setTitle(iMo26621);
        }
        this.f35939 = (InterfaceMenuItemC9720) menu.findItem(R.id.MT_Protector);
        this.f35942 = (InterfaceMenuItemC9720) menu.findItem(R.id.MT_Protector);
        this.f35944 = (InterfaceMenuItemC9720) menu.findItem(R.id.MT_Protector);
        this.f35936 = (InterfaceMenuItemC9720) menu.findItem(R.id.MT_Protector);
        this.f35935 = (InterfaceMenuItemC9720) menu.findItem(R.id.MT_Protector);
        this.f35939.setEnabled(this.f35938.m17037());
        this.f35942.setEnabled(this.f35938.m16938());
        this.f35944.setEnabled(this.f35938.m17040());
        menu.findItem(R.id.MT_Protector).setChecked(this.f35938.m17004());
        menu.findItem(R.id.MT_Protector).setVisible(false);
        this.f35943.m46367(menu.findItem(R.id.MT_Protector));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            if (this.f35940) {
                this.f35940 = false;
                menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f35938.m16999());
            }
            this.f35936.setEnabled(this.f35938.m17025());
            this.f35935.setEnabled(this.f35938.m16932());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m26615(false, (ResultCallback) null);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo26622();
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m26611();
                return true;
            }
            this.f35943.m46383(menuItem);
            return true;
        }
        C6111 c6111 = this.f35938;
        c6111.m17065(!c6111.m17004());
        menuItem.setChecked(this.f35938.m17004());
        this.f35943.m46378();
        this.f35941.m39492();
        return true;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f35943.m46379()) {
            this.f35941.m39492();
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC10074, l.ActivityC19126, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f35943.m46365();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26613(AbstractActivityC10490 abstractActivityC10490) {
        abstractActivityC10490.m26615(true, (ResultCallback) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m26615(boolean z, ResultCallback resultCallback) {
        if (this.f35938.m17040()) {
            new C9079(this, z, resultCallback).m10243();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        m26611();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public void m26611() {
        if (this.f35938.m17040()) {
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21277(mo7997());
            c8067.m21253(mo26619());
            c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23190(0, this));
            c8067.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15429(0, this));
            c8067.m21269();
            return;
        }
        finish();
    }
}
