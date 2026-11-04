package l;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ܺۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16597 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53680 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C20956 f53681;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f53682;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public String f53683;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C24720 f53684 = C24720.m55197();

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f53685;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C1300 f53686;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f53687;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public boolean f53688;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f53689;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public SpannableString f53690;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f53691;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C24421 f53692;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public TextView f53693;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public String f53694;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "NinePatchEditor";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C24803 c24803 = new C24803(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c24803);
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC12809(1, this));
        this.f53686 = (C1300) m40418(R.id.MT_Protector);
        TabLayout tabLayout = (TabLayout) m40418(R.id.tabLayout);
        TabLayout.Tab tabNewTab = tabLayout.newTab();
        TabLayout.Tab tabNewTab2 = tabLayout.newTab();
        TabLayout.Tab tabNewTab3 = tabLayout.newTab();
        tabNewTab.setText(R.string.MT_Protector);
        tabNewTab2.setText(R.string.MT_Protector);
        tabNewTab3.setText(R.string.MT_Protector);
        tabLayout.addTab(tabNewTab);
        tabLayout.addTab(tabNewTab2);
        tabLayout.addTab(tabNewTab3);
        tabLayout.setSelectedTabIndicatorGravity(2);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C7157(this, tabNewTab, tabNewTab2, tabNewTab3));
        this.f53693 = (TextView) m40418(R.id.textView2);
        this.f53686.m4739(new C13868(this, tabLayout, tabNewTab, tabNewTab2, tabNewTab3));
        this.f53681 = ViewOnClickListenerC11499.m28899(this, new C8648(this));
        if (bundle != null) {
            try {
                if (bundle.containsKey("tmpFile")) {
                    String string = bundle.getString("file");
                    this.f53685 = string.isEmpty() ? null : C14584.m35193(string, new String[0]);
                    this.f53683 = bundle.getString("filename");
                    AbstractC22044 abstractC22044M35193 = C14584.m35193(bundle.getString("tmpFile"), new String[0]);
                    this.f53682 = abstractC22044M35193;
                    C15425 c15425 = new C15425(abstractC22044M35193.m49865());
                    this.f53686.m4741(c15425);
                    this.f53686.m4742(C20348.m46740(bundle.getByteArray(e.m)));
                    this.f53688 = bundle.getBoolean("compiled");
                    m39264(c15425);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        AbstractC22044 abstractC22044M35190 = C14584.m35190(getIntent());
        this.f53685 = abstractC22044M35190;
        this.f53683 = abstractC22044M35190.getName();
        new C10630(this).m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39265(ActivityC16597 activityC16597, String str) {
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        activityC16597.f53685 = abstractC22044M35193;
        activityC16597.f53683 = abstractC22044M35193.getName();
        activityC16597.m39280(false);
        activityC16597.m39281();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39264(C15425 c15425) {
        Bitmap bitmapM36951 = c15425.m36951();
        ((TextView) m40418(R.id.textView1)).setText((bitmapM36951.getWidth() + 2) + " x " + (bitmapM36951.getHeight() + 2) + " px");
        m39281();
        m39272();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m39281() {
        this.f53694 = this.f53683;
        SpannableString spannableString = new SpannableString("*" + ((Object) this.f53694));
        this.f53690 = spannableString;
        spannableString.setSpan(new ForegroundColorSpan(C3296.f10764), 0, this.f53690.length(), 17);
        this.f56046.setSubtitle(this.f53686.m4744() ? this.f53690 : this.f53694);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public void m39272() {
        C24421 c24421 = this.f53692;
        if (c24421 == null) {
            TextView textView = this.f53693;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.MT_Protector));
            sb.append(" - ");
            sb.append(getString(this.f53688 ? R.string.MT_Protector : R.string.MT_Protector));
            textView.setText(sb.toString());
            return;
        }
        if (c24421.f79289 == c24421.f79288) {
            this.f53693.setText(R.string.MT_Protector);
            return;
        }
        this.f53693.setText((c24421.f79289 + 1) + " - " + (c24421.f79288 + 1) + " px");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f53687 = menu.findItem(R.id.MT_Protector);
        this.f53691 = menu.findItem(R.id.MT_Protector);
        this.f53689 = menu.findItem(R.id.MT_Protector);
        this.f53687.setEnabled(this.f53686.m4744());
        this.f53691.setEnabled(this.f53686.m4746());
        this.f53689.setEnabled(this.f53686.m4754());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f53686.m4750();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f53686.m4747();
            return true;
        }
        if (itemId == R.id.more) {
            SubMenu subMenu = menuItem.getSubMenu();
            C17359.requireNonNull(subMenu);
            int iM4751 = this.f53686.m4751();
            if (iM4751 == 0) {
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
            if (iM4751 == 1) {
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                if (this.f53686.m4748()) {
                    subMenu.findItem(R.id.MT_Protector).setVisible(false);
                    subMenu.findItem(R.id.MT_Protector).setVisible(true);
                    return true;
                }
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
            if (iM4751 == 2) {
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                C22565 c22565 = new C22565(this, this);
                c22565.m22945(R.string.MT_Protector);
                c22565.m22961();
                c22565.m22927(true);
                c22565.m22934(false);
                c22565.m22943("INTERNAL:NinePatchRegion");
                c22565.m22937();
                c22565.m22919(C6907.m19160(6.0f));
                c22565.m22939(Integer.MAX_VALUE);
                c22565.m22918();
                c22565.m22924((CharSequence) this.f53686.m4749());
                c22565.m22955(true);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                SubMenu subMenu2 = menuItem.getSubMenu();
                C17359.requireNonNull(subMenu2);
                if (this.f53688) {
                    subMenu2.findItem(R.id.MT_Protector).setChecked(true);
                    return true;
                }
                subMenu2.findItem(R.id.MT_Protector).setChecked(true);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                if (this.f53688) {
                    this.f53688 = false;
                    this.f53686.m4753(true);
                    menuItem.setChecked(true);
                    m39272();
                    return true;
                }
            } else if (itemId == R.id.MT_Protector) {
                if (!this.f53688) {
                    this.f53688 = true;
                    this.f53686.m4753(true);
                    menuItem.setChecked(true);
                    m39272();
                    return true;
                }
            } else {
                if (itemId == R.id.MT_Protector) {
                    this.f53686.m4743(false);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f53686.m4743(true);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f53686.m4736();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f53686.m4756();
                    return true;
                }
                if (itemId != R.id.MT_Protector) {
                    if (itemId != R.id.MT_Protector) {
                        if (itemId == R.id.MT_Protector) {
                            new C19581(this).m8197();
                            return true;
                        }
                        if (itemId != R.id.MT_Protector) {
                            return false;
                        }
                        getOnBackPressedDispatcher().m19401();
                        return true;
                    }
                    AbstractC22044 abstractC22044M35190 = this.f53685;
                    if (abstractC22044M35190 == null) {
                        abstractC22044M35190 = C14584.m35190(getIntent());
                    }
                    String strM49881 = abstractC22044M35190.m49881();
                    C20956 c20956 = this.f53681;
                    c20956.getClass();
                    C20956.m47908(c20956, R.string.MT_Protector, strM49881, this.f53683, new String[]{"9.png"}, 16);
                    return true;
                }
                if (this.f53684.m55199()) {
                    m39280(false);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m39280(boolean z) {
        if (this.f53685 == null) {
            C20956 c20956 = this.f53681;
            c20956.getClass();
            C20956.m47908(c20956, R.string.MT_Protector, C14584.m35190(getIntent()).m49881(), this.f53683, new String[]{"9.png"}, 16);
        } else if (this.f53688) {
            new C15105(this, z).m8197();
        } else {
            new C5411(this, z).m8197();
        }
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        getOnBackPressedDispatcher().m19401();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC22044 abstractC22044 = this.f53682;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AbstractC22044 abstractC22044 = this.f53682;
        if (abstractC22044 != null) {
            bundle.putString("tmpFile", abstractC22044.mo4294());
            C6178 c6178 = new C6178();
            this.f53686.m4740(c6178);
            bundle.putByteArray(e.m, c6178.m17799());
            bundle.putBoolean("compiled", this.f53688);
            AbstractC22044 abstractC22045 = this.f53685;
            bundle.putString("file", abstractC22045 == null ? "" : abstractC22045.mo4294());
            bundle.putString("filename", this.f53683);
        }
    }
}
