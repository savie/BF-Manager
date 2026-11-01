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

/* JADX INFO: renamed from: l.ܶ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15472 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50406 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f50407;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C16373 f50408;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C23566 f50409;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public SpannableString f50410;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C22959 f50411 = C22959.m50800();

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f50412;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public String f50413;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public boolean f50414;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f50415;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public TextView f50416;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f50417;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f50418;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C9318 f50419;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public String f50420;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "NinePatchEditor";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C23233 c23233 = new C23233(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c23233);
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC10491(2, this));
        this.f50419 = (C9318) m31016(R.id.MT_Protector);
        TabLayout tabLayout = (TabLayout) m31016(R.id.tabLayout);
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
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C3082(this, tabNewTab, tabNewTab2, tabNewTab3));
        this.f50416 = (TextView) m31016(R.id.textView2);
        this.f50419.m23927(new C4887(this, tabLayout, tabNewTab, tabNewTab2, tabNewTab3));
        this.f50409 = ViewOnClickListenerC8374.m21926(this, new C1048(this));
        if (bundle != null) {
            try {
                if (bundle.containsKey("tmpFile")) {
                    String string = bundle.getString("file");
                    this.f50407 = string.isEmpty() ? null : C5553.m15313(string, new String[0]);
                    this.f50413 = bundle.getString("filename");
                    AbstractC20745 abstractC20745M15313 = C5553.m15313(bundle.getString("tmpFile"), new String[0]);
                    this.f50412 = abstractC20745M15313;
                    C6527 c6527 = new C6527(abstractC20745M15313.m46727());
                    this.f50419.m23926(c6527);
                    this.f50419.m23929(C17367.m40441(bundle.getByteArray(e.m)));
                    this.f50414 = bundle.getBoolean("compiled");
                    m37007(c6527);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        AbstractC20745 abstractC20745M15309 = C5553.m15309(getIntent());
        this.f50407 = abstractC20745M15309;
        this.f50413 = abstractC20745M15309.getName();
        new C11944(this).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37008(ActivityC15472 activityC15472, String str) {
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        activityC15472.f50407 = abstractC20745M15313;
        activityC15472.f50413 = abstractC20745M15313.getName();
        activityC15472.m37013(false);
        activityC15472.m37020();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37007(C6527 c6527) {
        Bitmap bitmapM17738 = c6527.m17738();
        ((TextView) m31016(R.id.textView1)).setText((bitmapM17738.getWidth() + 2) + " x " + (bitmapM17738.getHeight() + 2) + " px");
        m37020();
        m37003();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m37020() {
        this.f50420 = this.f50413;
        SpannableString spannableString = new SpannableString("*" + ((Object) this.f50420));
        this.f50410 = spannableString;
        spannableString.setSpan(new ForegroundColorSpan(C20368.f66005), 0, this.f50410.length(), 17);
        this.f41645.setSubtitle(this.f50419.m23935() ? this.f50410 : this.f50420);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m37003() {
        C16373 c16373 = this.f50408;
        if (c16373 == null) {
            TextView textView = this.f50416;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.MT_Protector));
            sb.append(" - ");
            sb.append(getString(this.f50414 ? R.string.MT_Protector : R.string.MT_Protector));
            textView.setText(sb.toString());
            return;
        }
        if (c16373.f52692 == c16373.f52691) {
            this.f50416.setText(R.string.MT_Protector);
            return;
        }
        this.f50416.setText((c16373.f52692 + 1) + " - " + (c16373.f52691 + 1) + " px");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f50415 = menu.findItem(R.id.MT_Protector);
        this.f50417 = menu.findItem(R.id.MT_Protector);
        this.f50418 = menu.findItem(R.id.MT_Protector);
        this.f50415.setEnabled(this.f50419.m23935());
        this.f50417.setEnabled(this.f50419.m23934());
        this.f50418.setEnabled(this.f50419.m23938());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f50419.m23939();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f50419.m23932();
            return true;
        }
        if (itemId == R.id.more) {
            SubMenu subMenu = menuItem.getSubMenu();
            C13638.requireNonNull(subMenu);
            int iM23931 = this.f50419.m23931();
            if (iM23931 == 0) {
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
            if (iM23931 == 1) {
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                if (this.f50419.m23920()) {
                    subMenu.findItem(R.id.MT_Protector).setVisible(false);
                    subMenu.findItem(R.id.MT_Protector).setVisible(true);
                    return true;
                }
                subMenu.findItem(R.id.MT_Protector).setVisible(true);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
            if (iM23931 == 2) {
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                subMenu.findItem(R.id.MT_Protector).setVisible(false);
                return true;
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                C2770 c2770 = new C2770(this, this);
                c2770.m40376(R.string.MT_Protector);
                c2770.m40369();
                c2770.m40348(true);
                c2770.m40361(false);
                c2770.m40351("INTERNAL:NinePatchRegion");
                c2770.m40357();
                c2770.m40341(C13932.m33769(6.0f));
                c2770.m40334(Integer.MAX_VALUE);
                c2770.m40340();
                c2770.m40346((CharSequence) this.f50419.m23940());
                c2770.m40368(true);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                SubMenu subMenu2 = menuItem.getSubMenu();
                C13638.requireNonNull(subMenu2);
                if (this.f50414) {
                    subMenu2.findItem(R.id.MT_Protector).setChecked(true);
                    return true;
                }
                subMenu2.findItem(R.id.MT_Protector).setChecked(true);
                return true;
            }
            if (itemId == R.id.MT_Protector) {
                if (this.f50414) {
                    this.f50414 = false;
                    this.f50419.m23937(true);
                    menuItem.setChecked(true);
                    m37003();
                    return true;
                }
            } else if (itemId == R.id.MT_Protector) {
                if (!this.f50414) {
                    this.f50414 = true;
                    this.f50419.m23937(true);
                    menuItem.setChecked(true);
                    m37003();
                    return true;
                }
            } else {
                if (itemId == R.id.MT_Protector) {
                    this.f50419.m23930(false);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f50419.m23930(true);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f50419.m23923();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    this.f50419.m23941();
                    return true;
                }
                if (itemId != R.id.MT_Protector) {
                    if (itemId != R.id.MT_Protector) {
                        if (itemId == R.id.MT_Protector) {
                            new C5593(this).m10243();
                            return true;
                        }
                        if (itemId != R.id.MT_Protector) {
                            return false;
                        }
                        getOnBackPressedDispatcher().m34906();
                        return true;
                    }
                    AbstractC20745 abstractC20745M15309 = this.f50407;
                    if (abstractC20745M15309 == null) {
                        abstractC20745M15309 = C5553.m15309(getIntent());
                    }
                    String strM46737 = abstractC20745M15309.m46737();
                    C23566 c23566 = this.f50409;
                    c23566.getClass();
                    C23566.m51965(c23566, R.string.MT_Protector, strM46737, this.f50413, new String[]{"9.png"}, 16);
                    return true;
                }
                if (this.f50411.m50802()) {
                    m37013(false);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m37013(boolean z) {
        if (this.f50407 == null) {
            C23566 c23566 = this.f50409;
            c23566.getClass();
            C23566.m51965(c23566, R.string.MT_Protector, C5553.m15309(getIntent()).m46737(), this.f50413, new String[]{"9.png"}, 16);
        } else if (this.f50414) {
            new C22527(this, z).m10243();
        } else {
            new C13355(this, z).m10243();
        }
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        getOnBackPressedDispatcher().m34906();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC20745 abstractC20745 = this.f50412;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AbstractC20745 abstractC20745 = this.f50412;
        if (abstractC20745 != null) {
            bundle.putString("tmpFile", abstractC20745.mo33986());
            C11018 c11018 = new C11018();
            this.f50419.m23928(c11018);
            bundle.putByteArray(e.m, c11018.m27798());
            bundle.putBoolean("compiled", this.f50414);
            AbstractC20745 abstractC20746 = this.f50407;
            bundle.putString("file", abstractC20746 == null ? "" : abstractC20746.mo33986());
            bundle.putString("filename", this.f50413);
        }
    }
}
