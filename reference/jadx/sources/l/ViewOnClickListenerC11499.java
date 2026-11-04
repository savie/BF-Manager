package l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۧۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11499 extends AbstractActivityC17204 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f36169 = 0;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public C7308 f36170;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public View f36172;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public C3072 f36173;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public String f36174;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f36175;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C7198 f36176;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public long f36177;

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public int f36180;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public List f36182;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C11870 f36183;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public int f36184;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C16468 f36185;

    /* JADX INFO: renamed from: ۬᩷, reason: not valid java name and contains not printable characters */
    public C7495 f36186;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public C13903 f36188;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public final int f36190;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public C23255 f36191;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public C5817 f36192;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C3802 f36194;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public List f36195;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public List f36196;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public boolean f36198;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public C3347 f36199;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final C24720 f36200;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f36171 = new HashSet();

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f36181 = new HashSet();

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public Object f36197 = C22242.f71645;

    /* JADX INFO: renamed from: ۜ᩷, reason: not valid java name and contains not printable characters */
    public final C8277 f36178 = new C8277(this);

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public int f36193 = ApplicationC17729.f58258.getInt("fcsp", 0);

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public boolean f36179 = ApplicationC17729.f58258.getBoolean("fcrp", false);

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public String f36189 = "";

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public int f36187 = R.string.MT_Protector;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "FilePickerActivity";
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        C15243.m36590(menu, "menu");
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        SubMenu subMenu = menu.findItem(R.id.MT_Protector).getSubMenu();
        C15243.m36586(subMenu);
        ArrayList arrayList = new ArrayList();
        subMenu.clear();
        MenuItem menuItemAdd = subMenu.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector);
        C15243.m36591(menuItemAdd, "add(...)");
        C20613 c20613 = C20613.f66108;
        C15243.m36591(c20613, "ROOT");
        m28902(menuItemAdd, c20613);
        arrayList.add("/");
        MenuItem menuItemAdd2 = subMenu.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector);
        C15243.m36591(menuItemAdd2, "add(...)");
        C20613 c20614 = C20613.f66077;
        C15243.m36591(c20614, "SDCARD");
        m28902(menuItemAdd2, c20614);
        arrayList.add(C6382.f21566.mo4294());
        for (C16997 c16997 : (ArrayList) C17743.m41556()) {
            MenuItem menuItemAdd3 = subMenu.add(R.id.MT_Protector, arrayList.size() + R.string.MT_Protector, 0, c16997.f55539);
            C15243.m36591(menuItemAdd3, "add(...)");
            C20613 c20615 = C20613.f66077;
            C15243.m36591(c20615, "SDCARD");
            m28902(menuItemAdd3, c20615);
            arrayList.add(c16997.f55538.getPath());
        }
        for (C25291 c25291 : C17085.m40236()) {
            MenuItem menuItemAdd4 = subMenu.add(R.id.MT_Protector, arrayList.size() + R.string.MT_Protector, 0, c25291.f81686);
            C15243.m36591(menuItemAdd4, "add(...)");
            C20613 c20616 = C20613.f66109;
            C15243.m36591(c20616, "FOLDER");
            m28902(menuItemAdd4, c20616);
            arrayList.add(c25291.m56469());
        }
        this.f36182 = arrayList;
        return true;
    }

    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C15243.m36590(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C7495 c7495 = this.f36186;
        if (c7495 != null) {
            C6178 c6178 = new C6178();
            c7495.mo10161(c6178);
            bundle.putByteArray("visitorData", c6178.m17796());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28902(MenuItem menuItem, C20613 c20613) {
        C15243.m36590(c20613, "typeIcon");
        menuItem.setIcon(c20613.f66117.m30080());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C15243.m36590(menuItem, "selectedMenuItem");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            SubMenu subMenu = menuItem.getSubMenu();
            C15243.m36586(subMenu);
            subMenu.findItem(R.id.MT_Protector).setChecked(C20174.m46411());
            subMenu.findItem(R.id.MT_Protector).setChecked(C20174.m46415());
            C11471 c11471 = C11471.f36082;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m28915(this, false, (InterfaceC19479) null, 2);
            C11471 c11472 = C11471.f36082;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C16720.m39486();
            C7308 c7308 = this.f36170;
            if (c7308 == null) {
                C15243.m36592("searchView");
                throw null;
            }
            if (!c7308.m20011()) {
                C7308 c7309 = this.f36170;
                if (c7309 != null) {
                    c7309.m20006((String) null);
                } else {
                    C15243.m36592("searchView");
                    throw null;
                }
            }
            C7308 c73010 = this.f36170;
            if (c73010 == null) {
                C15243.m36592("searchView");
                throw null;
            }
            c73010.m20013(true);
            C11471 c11473 = C11471.f36082;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C0819(this);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean z = !menuItem.isChecked();
            menuItem.setChecked(z);
            C20174.m46414(z);
            m28915(this, true, (InterfaceC19479) null, 4);
            C11471 c11474 = C11471.f36082;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean z2 = !menuItem.isChecked();
            menuItem.setChecked(z2);
            C20174.m46408(z2);
            m28915(this, true, (InterfaceC19479) null, 4);
            C11471 c11475 = C11471.f36082;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            finish();
            C11471 c11476 = C11471.f36082;
            return true;
        }
        if (menuItem.getGroupId() == R.id.MT_Protector) {
            int i = itemId - R.string.MT_Protector;
            List list = this.f36182;
            if (i >= 0 && i < list.size()) {
                m28903((String) list.get(i), (InterfaceC19479) null);
                return true;
            }
        }
        return false;
    }

    public ViewOnClickListenerC11499() {
        List list = Collections.EMPTY_LIST;
        C15243.m36591(list, "emptyList(...)");
        this.f36196 = list;
        this.f36195 = list;
        this.f36184 = -1;
        this.f36190 = ApplicationC17729.f58262.getInt("fltp", 0);
        this.f36198 = true;
        this.f36182 = list;
        this.f36175 = new AtomicInteger();
        this.f36200 = C24720.m55196();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final void m28927(ViewOnClickListenerC11499 viewOnClickListenerC11499, int i) {
        viewOnClickListenerC11499.f36193 = i;
        ApplicationC17729.f58258.edit().mo3486(i, "fcsp").apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m28914(ViewOnClickListenerC11499 viewOnClickListenerC11499, boolean z) {
        viewOnClickListenerC11499.f36179 = z;
        C6421.m18184(ApplicationC17729.f58258, "fcrp", z);
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        m40415();
        m40418(R.layout.MT_Protector);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C4788 c4788 = new C4788(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c4788);
        Intent intent = getIntent();
        C15243.m36591(intent, "getIntent(...)");
        if (C15243.m36589((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            setTitle(R.string.MT_Protector);
        } else {
            setTitle(getIntent().getIntExtra("title", R.string.MT_Protector));
        }
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        AbstractC2944 abstractC2944M13853 = m13853();
        if (abstractC2944M13853 != null) {
            abstractC2944M13853.mo9633(true);
        }
        c16390.setNavigationIcon(R.drawable.MT_Protector);
        c16390.setNavigationOnClickListener(new ViewOnClickListenerC2162(5, this));
        c16390.setSubtitle("...");
        TextView textViewM18918 = C6784.m18918(c16390);
        TextView textViewM18916 = C6784.m18916(c16390);
        textViewM18916.setEllipsize(TextUtils.TruncateAt.START);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: l.᩷֨֫
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ViewOnClickListenerC11499.m28949(this.f69258);
                return true;
            }
        };
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۫֨֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC11499.m28926(this.f40817);
            }
        };
        textViewM18918.setOnClickListener(onClickListener);
        textViewM18916.setOnClickListener(onClickListener);
        textViewM18918.setOnLongClickListener(onLongClickListener);
        textViewM18916.setOnLongClickListener(onLongClickListener);
        View viewM40418 = m40418(R.id.file_name);
        C15243.m36591(viewM40418, "view(...)");
        this.f36191 = (C23255) viewM40418;
        View viewM40419 = m40418(R.id.MT_Protector);
        C15243.m36591(viewM40419, "view(...)");
        this.f36192 = (C5817) viewM40419;
        View viewM404110 = m40418(R.id.MT_Protector);
        C15243.m36591(viewM404110, "view(...)");
        this.f36173 = (C3072) viewM404110;
        View viewM404111 = m40418(R.id.MT_Protector);
        C15243.m36591(viewM404111, "view(...)");
        this.f36172 = viewM404111;
        C3802 c3802 = new C3802(this);
        this.f36194 = c3802;
        C5817 c5817 = this.f36192;
        if (c5817 == null) {
            C15243.m36592("recyclerView");
            throw null;
        }
        c5817.setAdapter(c3802);
        C3072 c3072 = this.f36173;
        if (c3072 == null) {
            C15243.m36592("swipeRefreshLayout");
            throw null;
        }
        c3072.m10020(new C7288(this));
        C5817 c5818 = this.f36192;
        if (c5818 == null) {
            C15243.m36592("recyclerView");
            throw null;
        }
        c5818.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ۚ֨֫
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ViewOnClickListenerC11499.m28904(this.f18631);
            }
        });
        View viewM404112 = m40418(R.id.MT_Protector);
        C15243.m36591(viewM404112, "view(...)");
        this.f36183 = (C11870) viewM404112;
        View viewM404113 = m40418(R.id.MT_Protector);
        C15243.m36591(viewM404113, "view(...)");
        C7198 c7198 = (C7198) viewM404113;
        this.f36176 = c7198;
        final Window window = getWindow();
        final int statusBarColor = window.getStatusBarColor();
        c7198.m19777(new InterfaceC13909() { // from class: l.۫֡֫
            {
                int i = 1464150349;
                int i2 = C2834.f9334;
                int i3 = C3099.f10023;
                int iM3169 = C0773.m3169("֫ۨ") ^ i2;
                int i4 = ((iM3169 ^ i3) * 19105) ^ (-1491357401);
                int i5 = 1338039170;
                while (true) {
                    i = ((((i ^ i3) * (-8107)) >> 31) & i4) ^ (iM3169 ^ i5);
                    switch (i) {
                        case -2110601668:
                        case -975283561:
                            return;
                        case -2005944023:
                        case -652100067:
                            if (RunnableC3055.m9933() != 0) {
                                iM3169 = C0619.m2761("᩶ܶ") ^ i2;
                                i4 = ((iM3169 ^ i3) * 30129) ^ 2090054503;
                                i5 = -1979531866;
                            } else {
                                iM3169 = C0773.m3169("᩸ܶ") ^ i2;
                                i4 = ((iM3169 ^ i3) * (-18591)) ^ (-117812382);
                                i5 = -2119711507;
                            }
                            break;
                        case -1978342758:
                        case 373007096:
                            C2354.m7983();
                            if (C2375.f7641 > 0) {
                                iM3169 = C0773.m3169("ܿۢ") ^ i3;
                                i4 = ((iM3169 ^ i2) * 7053) ^ 466014201;
                                i5 = 461338504;
                            } else {
                                iM3169 = C0773.m3169("֫ۛ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-5763)) ^ 487547283;
                                i5 = -24349586;
                            }
                            break;
                        case -1667951257:
                        case -985123850:
                            C2375.m8065();
                            C3998.m12920();
                            throw new RuntimeException();
                        case -1495385992:
                        case 2129228357:
                            AbstractC0641.m2813();
                            iM3169 = C0619.m2761("᩶ܶ") ^ i2;
                            i4 = ((iM3169 ^ i3) * 30129) ^ 2090054503;
                            i5 = -1979531866;
                            break;
                        case -1414126867:
                        case -775755364:
                            if (RunnableC0334.f1808 <= 0) {
                                iM3169 = C0773.m3169("ܿۢ") ^ i3;
                                i4 = ((iM3169 ^ i2) * 7053) ^ 466014201;
                                i5 = 461338504;
                            } else {
                                iM3169 = (C0773.m3169("᩷ۜ") ^ i3) * (-25);
                                i4 = ((iM3169 ^ i2) * (-12825)) ^ 613207598;
                                i5 = -1935682976;
                            }
                            break;
                        case -1275140944:
                        case 780995680:
                            if (RunnableC0334.f1808 <= 0) {
                                iM3169 = C0619.m2761("᩶ܶ") ^ i2;
                                i4 = ((iM3169 ^ i3) * 30129) ^ 2090054503;
                                i5 = -1979531866;
                            } else {
                                iM3169 = C0773.m3169("ܳܿ") ^ i3;
                                i4 = ((iM3169 ^ i2) * 2657) ^ (-410957987);
                                i5 = -1236655266;
                            }
                            break;
                        case -1049035721:
                        case 1882965339:
                            if (C1564.f5401 <= 0) {
                                iM3169 = C0773.m3169("֫ۛ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-5763)) ^ 487547283;
                                i5 = -24349586;
                            } else {
                                iM3169 = C0619.m2761("ۧۜ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-1519)) ^ (-1307459961);
                                i5 = -2123130802;
                            }
                            break;
                        case -823309693:
                        case -252102135:
                            if (C2354.f7599 >= 0) {
                                iM3169 = C0619.m2761("᩶ܶ") ^ i2;
                                i4 = ((iM3169 ^ i3) * 30129) ^ 2090054503;
                                i5 = -1979531866;
                            } else {
                                iM3169 = C0619.m2761("ۡܰ") ^ i2;
                                i4 = ((iM3169 ^ i3) * 24635) ^ (-790330030);
                                i5 = -453031086;
                            }
                            break;
                        case -544335341:
                        case -300400716:
                            if (C1783.f6087 <= 0) {
                                iM3169 = C0773.m3169("֫ۛ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-5763)) ^ 487547283;
                                i5 = -24349586;
                            } else {
                                iM3169 = C0773.m3169("᩶۫") ^ i2;
                                i4 = ((iM3169 ^ i3) * 20075) ^ (-1410468339);
                                i5 = 1064389566;
                            }
                            break;
                        case -466451899:
                        case 1512184914:
                            if (!C3077.f9998) {
                                iM3169 = C0773.m3169("ۖ۠") ^ i2;
                                i4 = ((iM3169 ^ i3) * 25821) ^ 627988430;
                                i5 = 1500696034;
                            } else {
                                iM3169 = C0773.m3169("֫ۛ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-5763)) ^ 487547283;
                                i5 = -24349586;
                            }
                            break;
                        case -325336683:
                        case -18840616:
                            if (C0619.f2439) {
                                iM3169 = C0773.m3169("ܿۢ") ^ i3;
                                i4 = ((iM3169 ^ i2) * 7053) ^ 466014201;
                                i5 = 461338504;
                            } else {
                                iM3169 = (C0773.m3169("ܶ۟") ^ i2) * 11;
                                i4 = ((iM3169 ^ i3) * 14349) ^ (-1796862448);
                                i5 = -1898000192;
                            }
                            break;
                        case -35532507:
                        case 1127049869:
                            C0862.m3503();
                            if (C3734.f12817 < 0) {
                                iM3169 = C0773.m3169("֫ۛ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-5763)) ^ 487547283;
                                i5 = -24349586;
                            } else {
                                iM3169 = C0619.m2761("᩶ܶ") ^ i2;
                                i4 = ((iM3169 ^ i3) * 30129) ^ 2090054503;
                                i5 = -1979531866;
                            }
                            break;
                        case 9033935:
                        case 962506563:
                            if (C1080.f3865 >= 0) {
                                iM3169 = C0773.m3169("֫ۛ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-5763)) ^ 487547283;
                                i5 = -24349586;
                            } else {
                                iM3169 = (i2 - C0619.m2761("ܺۙ")) * 33;
                                i4 = ((iM3169 ^ i3) * 795) ^ (-942668824);
                                i5 = 329839665;
                            }
                            break;
                        case 734681376:
                        case 1513773861:
                            if (C1564.f5401 <= 0) {
                                iM3169 = C0773.m3169("ۖ۠") ^ i2;
                                i4 = ((iM3169 ^ i3) * 25821) ^ 627988430;
                                i5 = 1500696034;
                            } else {
                                iM3169 = C0619.m2761("֫֫") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-14073)) ^ 41014698;
                                i5 = -341005482;
                            }
                            break;
                        default:
                            if (RunnableC3646.f12471) {
                                iM3169 = C0773.m3169("ۡۢ") ^ i3;
                                i4 = ((iM3169 ^ i2) * 14385) ^ (-895885360);
                                i5 = 40909557;
                            } else {
                                iM3169 = C0619.m2761("᩻ۜ") ^ i3;
                                i4 = ((iM3169 ^ i2) * (-17637)) ^ (-1614085050);
                                i5 = -1651532848;
                            }
                            break;
                    }
                }
            }

            @Override // l.InterfaceC13909
            /* JADX INFO: renamed from: ۙ */
            public final void mo15578(float f) {
                float f2 = 0.0f;
                int i = 0;
                int iArgb = 0;
                int i2 = 0;
                int i3 = 853500285;
                int i4 = C11235.f35427;
                int i5 = C2310.f7472;
                int iM2761 = C0619.m2761("᩷ۨ") ^ i5;
                int i6 = ((iM2761 ^ i4) * (-29281)) ^ (-2109731344);
                int i7 = 1886210872;
                while (true) {
                    i3 = ((((i3 ^ i4) * (-23489)) >> 31) & i6) ^ (iM2761 ^ i7);
                    switch (i3) {
                        case -2062529779:
                        case 1372350558:
                            if (C2419.f7754 >= 0) {
                                iM2761 = (C0773.m3169("᩸۫") + i4) * 33;
                                i6 = ((iM2761 ^ i5) * 2535) ^ (-1127622877);
                                i7 = 1993170245;
                            } else {
                                iM2761 = C0773.m3169("᩻ᩴ") ^ i4;
                                i6 = ((iM2761 ^ i5) * (-385)) ^ 1849141540;
                                i7 = 642456891;
                            }
                            break;
                        case -2055220305:
                        case -1015014061:
                            window.setStatusBarColor(C19988.m45966(iArgb, i2));
                            break;
                        case -1983274662:
                        case 454542610:
                            iArgb = Color.argb(i, 0, 0, 0);
                            if (C13473.f42873 != 0) {
                                iM2761 = C0773.m3169("᩵᩹") ^ i4;
                                i6 = ((iM2761 ^ i5) * 20241) ^ (-1971581098);
                                i7 = 119822334;
                            } else {
                                iM2761 = C0619.m2761("ۖ۬") ^ i4;
                                i6 = ((iM2761 ^ i5) * 91) ^ (-554296707);
                                i7 = 138732209;
                            }
                            break;
                        case -1982420237:
                        case -1721885982:
                            AbstractC0116.m1243();
                            C2702.m8876();
                            break;
                        case -1782240754:
                        case -871355039:
                            C0619.m2763();
                            if (C2375.f7641 <= 0) {
                                iM2761 = C0619.m2761("ۢ۟") ^ i5;
                                i6 = ((iM2761 ^ i4) * 6747) ^ 1647890838;
                                i7 = 1979435759;
                            } else {
                                iM2761 = (C0773.m3169("᩸۫") + i4) * 33;
                                i6 = ((iM2761 ^ i5) * 2535) ^ (-1127622877);
                                i7 = 1993170245;
                            }
                            break;
                        case -1700394189:
                        case 839955095:
                            i2 = statusBarColor;
                            if (AbstractC0116.f1064 <= 0) {
                                iM2761 = C0619.m2761("ܰܽ") ^ i5;
                                i6 = ((iM2761 ^ i4) * 17327) ^ (-1312805814);
                                i7 = 964216540;
                            } else {
                                iM2761 = C0619.m2761("ۨ۟") ^ i5;
                                i6 = ((iM2761 ^ i4) * (-18395)) ^ 1999963870;
                                i7 = 364038909;
                            }
                            break;
                        case -1547100789:
                        case 1822175501:
                            C2310.m7813();
                            C2834.m9344();
                            iM2761 = (C0773.m3169("᩸۫") + i4) * 33;
                            i6 = ((iM2761 ^ i5) * 2535) ^ (-1127622877);
                            i7 = 1993170245;
                            break;
                        case -1503888592:
                        case -795822876:
                            if (C3448.f11240 >= 0) {
                                iM2761 = C0619.m2761("ܰܽ") ^ i5;
                                i6 = ((iM2761 ^ i4) * 17327) ^ (-1312805814);
                                i7 = 964216540;
                            } else {
                                iM2761 = (C0773.m3169("ۤᩴ") ^ i4) * (-67);
                                i6 = ((iM2761 ^ i5) * 11581) ^ 1087390647;
                                i7 = -492535688;
                            }
                            break;
                        case -1486601538:
                        case -1263902410:
                            if (C2834.m9344() >= 0) {
                                iM2761 = (C0773.m3169("᩸۫") + i4) * 33;
                                i6 = ((iM2761 ^ i5) * 2535) ^ (-1127622877);
                                i7 = 1993170245;
                            } else {
                                iM2761 = (C0773.m3169("ܿۨ") + i5) * 109;
                                i6 = ((iM2761 ^ i4) * 18181) ^ 1189237171;
                                i7 = -151293200;
                            }
                            break;
                        case -1239135278:
                        case 879824588:
                            i = (int) (f * f2);
                            if (C1542.f5343 <= 0) {
                                iM2761 = C0773.m3169("ܶᩳ") ^ i4;
                                i6 = ((iM2761 ^ i5) * 4235) ^ 825305874;
                                i7 = -1700650394;
                            } else {
                                iM2761 = (C0773.m3169("۬᩷") ^ i4) * (-67);
                                i6 = ((iM2761 ^ i5) * (-4161)) ^ (-1113132210);
                                i7 = 124682361;
                            }
                            break;
                        case -984999734:
                        case -943323041:
                            if (C2834.f9334 <= 0) {
                                iM2761 = C0619.m2761("ۢ۟") ^ i5;
                                i6 = ((iM2761 ^ i4) * 6747) ^ 1647890838;
                                i7 = 1979435759;
                            } else {
                                iM2761 = (i5 - C0773.m3169("֡ᩴ")) * (-43);
                                i6 = ((iM2761 ^ i4) * 6939) ^ (-1355324526);
                                i7 = -264987562;
                            }
                            break;
                        case -362035774:
                        case -280351864:
                            if (!C17202.f56030) {
                                iM2761 = (C0773.m3169("᩸۫") + i4) * 33;
                                i6 = ((iM2761 ^ i5) * 2535) ^ (-1127622877);
                                i7 = 1993170245;
                            } else {
                                iM2761 = C0773.m3169("᩵᩹") ^ i4;
                                i6 = ((iM2761 ^ i5) * 20241) ^ (-1971581098);
                                i7 = 119822334;
                            }
                            break;
                        case 138471631:
                        case 1342803597:
                            C3448.m11248();
                            if (C3033.f9831 >= 0) {
                                iM2761 = C0619.m2761("ܰܽ") ^ i5;
                                i6 = ((iM2761 ^ i4) * 17327) ^ (-1312805814);
                                i7 = 964216540;
                            } else {
                                iM2761 = C0773.m3169("᩵᩹") ^ i4;
                                i6 = ((iM2761 ^ i5) * 20241) ^ (-1971581098);
                                i7 = 119822334;
                            }
                            break;
                        case 275367824:
                        case 922528758:
                            f2 = 102.0f;
                            if (C1542.f5343 <= 0) {
                                iM2761 = C0619.m2761("ܰܽ") ^ i5;
                                i6 = ((iM2761 ^ i4) * 17327) ^ (-1312805814);
                                i7 = 964216540;
                            } else {
                                iM2761 = C0773.m3169("᩷᩸") ^ i5;
                                i6 = ((iM2761 ^ i4) * 28613) ^ 622826114;
                                i7 = 1611992682;
                            }
                            break;
                        case 1706548738:
                        case 1812096332:
                            if (AbstractC0641.f2496 >= 0) {
                                iM2761 = C0773.m3169("᩵᩹") ^ i4;
                                i6 = ((iM2761 ^ i5) * 20241) ^ (-1971581098);
                                i7 = 119822334;
                            } else {
                                iM2761 = (C0773.m3169("ۛۚ") ^ i5) * 57;
                                i6 = ((iM2761 ^ i4) * 5673) ^ (-551420671);
                                i7 = 876616283;
                            }
                            break;
                        default:
                            int i8 = AbstractActivityC17204.f56033;
                            if (C4282.f15546 <= 0) {
                                iM2761 = C0773.m3169("᩵᩹") ^ i4;
                                i6 = ((iM2761 ^ i5) * 20241) ^ (-1971581098);
                                i7 = 119822334;
                            } else {
                                iM2761 = C0773.m3169("ۙ᩷") ^ i4;
                                i6 = ((iM2761 ^ i5) * 24033) ^ 2132727349;
                                i7 = -2104812934;
                            }
                            break;
                    }
                    return;
                }
            }
        });
        C25297 c25297 = (C25297) m40418(R.id.MT_Protector);
        C11870 c11870 = this.f36183;
        if (c11870 == null) {
            C15243.m36592("bottomToolbar");
            throw null;
        }
        c25297.m56487(c11870);
        final C11870 c11871 = this.f36183;
        if (c11871 == null) {
            C15243.m36592("bottomToolbar");
            throw null;
        }
        C7198 c7199 = this.f36176;
        if (c7199 == null) {
            C15243.m36592("bottomSlideLayout");
            throw null;
        }
        c11871.m29742(c7199);
        c11871.m29741();
        c11871.m29738(R.drawable.MT_Protector, R.drawable.MT_Protector).m37327(false);
        c11871.m29738(R.drawable.MT_Protector, R.drawable.MT_Protector).m37327(false);
        c11871.m29754(R.drawable.MT_Protector, 45);
        C15599 c15599M29739 = c11871.m29739(new C16803(c11871));
        c15599M29739.m37328();
        c15599M29739.m37327(false);
        c11871.m29738(R.drawable.MT_Protector, R.drawable.MT_Protector);
        final C24720 c24720M55194 = C24720.m55194(200);
        c11871.setOnClickListener(new View.OnClickListener() { // from class: l.֫֨֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC11499.m28919(c24720M55194, this, c11871);
            }
        });
        c11871.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۧ֨֫
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ViewOnClickListenerC11499.m28916(c11871, this);
                return true;
            }
        });
        View viewM404114 = m40418(R.id.searchView);
        C15243.m36591(viewM404114, "view(...)");
        C7308 c7308 = (C7308) viewM404114;
        this.f36170 = c7308;
        c7308.m20008(true);
        C7308 c7309 = this.f36170;
        if (c7309 == null) {
            C15243.m36592("searchView");
            throw null;
        }
        c7309.m20007(new C21942(this));
        this.f36188 = new C13903(this, new Runnable() { // from class: l.᩻֨֫
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC11499.m28915(this.f79871, true, (InterfaceC19479) null, 4);
            }
        });
        this.f36199 = C12296.m30693(this, new InterfaceC16025() { // from class: l.ܺ֨֫
            @Override // l.InterfaceC16025
            /* JADX INFO: renamed from: ۙ */
            public final void mo8384(Intent intent2, int i) {
                ViewOnClickListenerC11499.m28906(this.f53440, i, intent2);
            }
        });
        C20815.m47618(this);
        C17423.m40914();
        if (C7756.m21112()) {
            m28901(bundle);
            return;
        }
        final C13511 c13511 = new C13511(this, R.string.MT_Protector);
        c13511.m33191(500);
        new Thread(new Runnable() { // from class: l.ܽ֨֫
            @Override // java.lang.Runnable
            public final void run() {
                int i = ViewOnClickListenerC11499.f36169;
                try {
                    C7756.m21114();
                    C21576.m49068(new RunnableC2921(c13511, this, bundle, 1));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28949(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        C7495 c7495 = viewOnClickListenerC11499.f36186;
        if (c7495 != null) {
            C21576.m49067((CharSequence) c7495.m20193());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m28926(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        viewOnClickListenerC11499.m28890();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28904(ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        int i = viewOnClickListenerC11499.f36184;
        long j = viewOnClickListenerC11499.f36177;
        if (i == -1 || j == 0) {
            return;
        }
        if (System.currentTimeMillis() > j) {
            viewOnClickListenerC11499.f36177 = 0L;
            return;
        }
        C5817 c5817 = viewOnClickListenerC11499.f36192;
        if (c5817 == null) {
            C15243.m36592("recyclerView");
            throw null;
        }
        if (i >= c5817.m16963()) {
            C5817 c5818 = viewOnClickListenerC11499.f36192;
            if (c5818 == null) {
                C15243.m36592("recyclerView");
                throw null;
            }
            if (i <= c5818.m16969()) {
                return;
            }
        }
        C5817 c5819 = viewOnClickListenerC11499.f36192;
        if (c5819 == null) {
            C15243.m36592("recyclerView");
            throw null;
        }
        c5819.scrollToPosition(i);
        viewOnClickListenerC11499.f36184 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28919(C24720 c24720, final ViewOnClickListenerC11499 viewOnClickListenerC11499, C11870 c11870) {
        C7495 c7495;
        C7495 c7496;
        C8277 c8277 = viewOnClickListenerC11499.f36178;
        if (c24720.m55200()) {
            return;
        }
        if (viewOnClickListenerC11499.m28923() && viewOnClickListenerC11499.m28935() > 0) {
            int iM29755 = c11870.m29755();
            if (iM29755 == 0) {
                boolean z = false;
                for (InterfaceC2386 interfaceC2386 : viewOnClickListenerC11499.f36195) {
                    if (interfaceC2386.mo8090() && !interfaceC2386.isChecked()) {
                        interfaceC2386.setChecked(true);
                        z = true;
                    }
                }
                viewOnClickListenerC11499.m28962();
                if (z) {
                    c8277.m22362(false);
                    return;
                }
                return;
            }
            if (iM29755 == 1) {
                boolean z2 = false;
                for (InterfaceC2386 interfaceC2387 : viewOnClickListenerC11499.f36195) {
                    if (interfaceC2387.mo8090()) {
                        interfaceC2387.setChecked(!interfaceC2387.isChecked());
                        z2 = true;
                    }
                }
                viewOnClickListenerC11499.m28962();
                if (z2) {
                    c8277.m22362(false);
                    return;
                }
                return;
            }
            if (iM29755 == 2) {
                if (viewOnClickListenerC11499.m28923()) {
                    boolean zM28958 = viewOnClickListenerC11499.m28958();
                    viewOnClickListenerC11499.m28962();
                    if (zM28958) {
                        c8277.m22362(false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iM29755 != 3) {
                if (iM29755 != 4) {
                    return;
                }
                viewOnClickListenerC11499.m40396(R.string.MT_Protector, R.string.MT_Protector, false);
                return;
            }
            HashSet hashSet = new HashSet();
            for (InterfaceC2386 interfaceC2388 : viewOnClickListenerC11499.f36195) {
                if (interfaceC2388.mo8090() && interfaceC2388.isChecked()) {
                    String name = interfaceC2388.getName();
                    C15243.m36591(name, "getName(...)");
                    hashSet.add(C6040.m17520(name));
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            boolean z3 = false;
            for (InterfaceC2386 interfaceC2389 : viewOnClickListenerC11499.f36195) {
                if (interfaceC2389.mo8090() && !interfaceC2389.isChecked()) {
                    String name2 = interfaceC2389.getName();
                    C15243.m36591(name2, "getName(...)");
                    if (hashSet.contains(C6040.m17520(name2))) {
                        interfaceC2389.setChecked(true);
                        z3 = true;
                    }
                }
            }
            viewOnClickListenerC11499.m28962();
            if (z3) {
                c8277.m22362(false);
                return;
            }
            return;
        }
        int iM29756 = c11870.m29755();
        if (iM29756 == 0) {
            C3072 c3072 = viewOnClickListenerC11499.f36173;
            if (c3072 == null) {
                C15243.m36592("swipeRefreshLayout");
                throw null;
            }
            if (c3072.m10026() || (c7495 = viewOnClickListenerC11499.f36186) == null) {
                return;
            }
            final C2889 c2889M23722 = c7495.f24220.m23722(viewOnClickListenerC11499.m28938());
            String strM20218 = c7495.m20218();
            if (viewOnClickListenerC11499.m28923()) {
                viewOnClickListenerC11499.m28958();
                viewOnClickListenerC11499.m28962();
            }
            String str = c2889M23722.f9476;
            String str2 = c2889M23722.f9477;
            c7495.mo20211(str);
            String strM20219 = c7495.m20218();
            final String strM28558 = (strM20218.length() <= strM20219.length() || !strM20219.equals(C11293.m28556(strM20218))) ? null : C11293.m28558(strM20218);
            if (c2889M23722.f9475) {
                C7308 c7308 = viewOnClickListenerC11499.f36170;
                if (c7308 == null) {
                    C15243.m36592("searchView");
                    throw null;
                }
                c7308.m20006(str2);
                C7308 c7309 = viewOnClickListenerC11499.f36170;
                if (c7309 == null) {
                    C15243.m36592("searchView");
                    throw null;
                }
                c7309.m20013(false);
                C15243.m36591(str2, "filterText");
                viewOnClickListenerC11499.f36189 = str2;
            } else {
                C7308 c73010 = viewOnClickListenerC11499.f36170;
                if (c73010 == null) {
                    C15243.m36592("searchView");
                    throw null;
                }
                if (c73010.m20011()) {
                    viewOnClickListenerC11499.f36189 = "";
                    C7308 c73011 = viewOnClickListenerC11499.f36170;
                    if (c73011 == null) {
                        C15243.m36592("searchView");
                        throw null;
                    }
                    c73011.m20014();
                }
            }
            m28915(viewOnClickListenerC11499, true, new InterfaceC19479() { // from class: l.ۜۢ֫
                @Override // l.InterfaceC19479
                /* JADX INFO: renamed from: ۙ */
                public final Object mo4064() {
                    return ViewOnClickListenerC11499.m28894(this.f23248, c2889M23722, strM28558);
                }
            }, 2);
            viewOnClickListenerC11499.m28932();
            return;
        }
        if (iM29756 != 1) {
            if (iM29756 != 2) {
                if (iM29756 != 4) {
                    return;
                }
                viewOnClickListenerC11499.m28955();
                return;
            }
            View viewM40395 = viewOnClickListenerC11499.m40395(R.layout.MT_Protector);
            final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
            final C1626 c1626 = (C1626) viewM40395.findViewById(R.id.MT_Protector);
            c23255.m53899(new C6786(c1626));
            C2361 c2361BuildDialog = viewOnClickListenerC11499.buildDialog();
            c2361BuildDialog.m8005(viewM40395);
            c2361BuildDialog.m8012(false);
            boolean z4 = viewOnClickListenerC11499.f36180 != 0;
            if (z4) {
                ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            } else {
                ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            }
            final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
            C21232.m48398(dialogInterfaceC8327M8016);
            C21576.m49090(c23255);
            dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۖۢ֫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewOnClickListenerC11499.m28918(c23255, viewOnClickListenerC11499, dialogInterfaceC8327M8016, c1626);
                }
            });
            if (z4) {
                dialogInterfaceC8327M8016.m22433().setOnClickListener(new View.OnClickListener() { // from class: l.۠ۢ֫
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ViewOnClickListenerC11499.m28954(c23255, viewOnClickListenerC11499, dialogInterfaceC8327M8016, c1626);
                    }
                });
                return;
            }
            return;
        }
        C3072 c3073 = viewOnClickListenerC11499.f36173;
        if (c3073 == null) {
            C15243.m36592("swipeRefreshLayout");
            throw null;
        }
        if (c3073.m10026() || (c7496 = viewOnClickListenerC11499.f36186) == null) {
            return;
        }
        final C2889 c2889M23728 = c7496.f24220.m23728(viewOnClickListenerC11499.m28938());
        String strM202110 = c7496.m20218();
        if (viewOnClickListenerC11499.m28923()) {
            viewOnClickListenerC11499.m28958();
            viewOnClickListenerC11499.m28962();
        }
        String str3 = c2889M23728.f9476;
        String str4 = c2889M23728.f9477;
        c7496.mo20211(str3);
        String strM202111 = c7496.m20218();
        final String strM28559 = (strM202110.length() <= strM202111.length() || !strM202111.equals(C11293.m28556(strM202110))) ? null : C11293.m28558(strM202110);
        if (c2889M23728.f9475) {
            C7308 c73012 = viewOnClickListenerC11499.f36170;
            if (c73012 == null) {
                C15243.m36592("searchView");
                throw null;
            }
            c73012.m20006(str4);
            C7308 c73013 = viewOnClickListenerC11499.f36170;
            if (c73013 == null) {
                C15243.m36592("searchView");
                throw null;
            }
            c73013.m20013(false);
            C15243.m36591(str4, "filterText");
            viewOnClickListenerC11499.f36189 = str4;
        } else {
            C7308 c73014 = viewOnClickListenerC11499.f36170;
            if (c73014 == null) {
                C15243.m36592("searchView");
                throw null;
            }
            if (c73014.m20011()) {
                viewOnClickListenerC11499.f36189 = "";
                C7308 c73015 = viewOnClickListenerC11499.f36170;
                if (c73015 == null) {
                    C15243.m36592("searchView");
                    throw null;
                }
                c73015.m20014();
            }
        }
        m28915(viewOnClickListenerC11499, true, new InterfaceC19479() { // from class: l.ۡۢ֫
            @Override // l.InterfaceC19479
            /* JADX INFO: renamed from: ۙ */
            public final Object mo4064() {
                return ViewOnClickListenerC11499.m28947(this.f30181, c2889M23728, strM28559);
            }
        }, 2);
        viewOnClickListenerC11499.m28932();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28916(C11870 c11870, ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        int iM29755 = c11870.m29755();
        if (viewOnClickListenerC11499.m28923() && viewOnClickListenerC11499.m28935() > 0) {
            if (iM29755 != 3) {
                c11870.m29747(iM29755, new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector}[iM29755]);
                return;
            } else {
                new C17059(viewOnClickListenerC11499, new C1805(viewOnClickListenerC11499)).m40196();
                return;
            }
        }
        if (c11870.m29750()) {
            if (iM29755 == 0) {
                c11870.m29747(0, R.string.MT_Protector);
                return;
            }
            if (iM29755 == 1) {
                c11870.m29747(1, R.string.MT_Protector);
                return;
            }
            if (iM29755 == 2) {
                c11870.m29747(2, R.string.MT_Protector);
                return;
            }
            if (iM29755 != 3) {
                if (iM29755 != 4) {
                    return;
                }
                viewOnClickListenerC11499.m28890();
                return;
            }
            c11870.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            C7308 c7308 = viewOnClickListenerC11499.f36170;
            if (c7308 == null) {
                C15243.m36592("searchView");
                throw null;
            }
            if (!c7308.m20011()) {
                C7308 c7309 = viewOnClickListenerC11499.f36170;
                if (c7309 != null) {
                    c7309.m20006((String) null);
                } else {
                    C15243.m36592("searchView");
                    throw null;
                }
            }
            C7308 c73010 = viewOnClickListenerC11499.f36170;
            if (c73010 != null) {
                c73010.m20013(true);
            } else {
                C15243.m36592("searchView");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28906(ViewOnClickListenerC11499 viewOnClickListenerC11499, int i, Intent intent) {
        if (i != -1 || intent == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Uri data = intent.getData();
        C13903 c13903 = viewOnClickListenerC11499.f36188;
        if (c13903 != null) {
            c13903.m33866(data);
        } else {
            C15243.m36592("androidDataGranter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28917(C13511 c13511, ViewOnClickListenerC11499 viewOnClickListenerC11499, Bundle bundle) {
        c13511.m33185();
        viewOnClickListenerC11499.m28901(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [l.᩷ᩳ᩵] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m28901(Bundle bundle) {
        String stringExtra;
        String[] stringArrayExtra;
        int intExtra;
        String stringExtra2;
        C7495 c7495;
        Object arrayList;
        Intent intent = getIntent();
        C15243.m36586(intent);
        if (C15243.m36589((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            this.f36180 = (C15243.m36589((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT") && intent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false)) ? 3 : 1;
            String[] stringArrayExtra2 = intent.getStringArrayExtra("android.intent.extra.MIME_TYPES");
            if (stringArrayExtra2 == null) {
                arrayList = C22242.f71645;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra2) {
                    C15243.m36586((Object) str);
                    arrayList2.addAll(C0878.m3574(str, new char[]{','}));
                }
                ArrayList arrayList3 = new ArrayList(C7743.m21084((Iterable) arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String string = C0878.m3586((String) it.next()).toString();
                    Locale locale = Locale.ROOT;
                    C15243.m36591(locale, "ROOT");
                    String lowerCase = string.toLowerCase(locale);
                    C15243.m36591(lowerCase, "toLowerCase(...)");
                    arrayList3.add(lowerCase);
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList3) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
            }
            this.f36197 = arrayList;
            this.f36174 = "exportSelectFile";
            stringExtra2 = C6382.f21566.mo4294();
            C15243.m36591(stringExtra2, "getPath(...)");
            stringExtra = null;
            stringArrayExtra = null;
            intExtra = 0;
        } else {
            this.f36180 = intent.getIntExtra("type", 0);
            stringExtra = intent.getStringExtra("initFilename");
            stringArrayExtra = intent.getStringArrayExtra("suffixes");
            intExtra = intent.getIntExtra("customButtonTitle", 0);
            this.f36174 = intent.getStringExtra("initPathKey");
            stringExtra2 = intent.getStringExtra("initPath");
            if (stringExtra2 == null) {
                stringExtra2 = C6382.f21566.mo4294();
                C15243.m36591(stringExtra2, "getPath(...)");
            }
            if (stringExtra2.length() == 0 || !stringExtra2.startsWith("/")) {
                stringExtra2 = C6382.f21566.mo4294();
                C15243.m36591(stringExtra2, "getPath(...)");
            }
        }
        String str2 = this.f36174;
        if (str2 != null) {
            stringExtra2 = ApplicationC17729.f58258.getString(str2, stringExtra2);
            C15243.m36591(stringExtra2, "getString(...)");
        }
        if (bundle == null || !bundle.containsKey("visitorData")) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(stringExtra2, new String[0]);
            if (abstractC22044M35193.mo2934() && abstractC22044M35193.mo4304()) {
                stringExtra2 = abstractC22044M35193.m49881();
            }
            c7495 = new C7495(stringExtra2);
        } else {
            c7495 = new C7495(new C20348(bundle.getByteArray("visitorData")));
        }
        this.f36186 = c7495;
        m28932();
        if (stringExtra != null) {
            C23255 c23255 = this.f36191;
            if (c23255 == null) {
                C15243.m36592("filenameEditText");
                throw null;
            }
            c23255.mo52335((CharSequence) stringExtra);
        }
        if (stringArrayExtra != null) {
            for (String str3 : stringArrayExtra) {
                C15243.m36590(str3, "<this>");
                if (str3.indexOf(46, 0) >= 0) {
                    String lowerCase2 = str3.toLowerCase(Locale.ROOT);
                    C15243.m36591(lowerCase2, "toLowerCase(...)");
                    this.f36181.add(".".concat(lowerCase2));
                } else {
                    String lowerCase3 = str3.toLowerCase(Locale.ROOT);
                    C15243.m36591(lowerCase3, "toLowerCase(...)");
                    this.f36171.add(lowerCase3);
                }
            }
        }
        int i = this.f36180;
        if (i == 0) {
            m40418(R.id.button1).setVisibility(0);
            m40418(R.id.divider).setVisibility(0);
            C23255 c23256 = this.f36191;
            if (c23256 == null) {
                C15243.m36592("filenameEditText");
                throw null;
            }
            c23256.setVisibility(8);
            TextView textView = (TextView) m40418(R.id.button1);
            textView.setBackgroundTintList(ColorStateList.valueOf(C3296.f10767));
            textView.setOnClickListener(this);
            if (intExtra != 0) {
                textView.setText(intExtra);
            }
        } else if (i == 1) {
            C23255 c23257 = this.f36191;
            if (c23257 == null) {
                C15243.m36592("filenameEditText");
                throw null;
            }
            c23257.setVisibility(8);
            View view = this.f36172;
            if (view == null) {
                C15243.m36592("bottomSpace");
                throw null;
            }
            view.setVisibility(8);
        } else if (i == 2) {
            m40418(R.id.button2).setVisibility(0);
            m40418(R.id.textView).setVisibility(0);
            m40418(R.id.divider).setVisibility(0);
            TextView textView2 = (TextView) m40418(R.id.button2);
            textView2.setBackgroundTintList(ColorStateList.valueOf(C3296.f10767));
            textView2.setOnClickListener(this);
            if (intExtra != 0) {
                textView2.setText(intExtra);
            }
        } else if (i == 3) {
            m40418(R.id.button1).setVisibility(0);
            m40418(R.id.divider).setVisibility(0);
            C23255 c23258 = this.f36191;
            if (c23258 == null) {
                C15243.m36592("filenameEditText");
                throw null;
            }
            c23258.setVisibility(8);
            TextView textView3 = (TextView) m40418(R.id.button1);
            textView3.setBackgroundTintList(ColorStateList.valueOf(C3296.f10767));
            if (intExtra == 0) {
                intExtra = R.string.MT_Protector;
            }
            this.f36187 = intExtra;
            textView3.setOnClickListener(this);
            m28962();
        }
        final C8277 c8277 = this.f36178;
        c8277.getClass();
        final ViewOnClickListenerC11499 viewOnClickListenerC11499 = c8277.f27229;
        new Thread(new Runnable() { // from class: l.ۡ֨֫
            @Override // java.lang.Runnable
            public final void run() {
                C8277.m22355(this.f29375, c8277);
            }
        }).start();
        m28915(this, false, (InterfaceC19479) null, 2);
        this.f36185 = new C16468(this, new C8648(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28910(final ViewOnClickListenerC11499 viewOnClickListenerC11499, String str, C8877 c8877) {
        if (c8877 != null) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        C7198 c7198 = viewOnClickListenerC11499.f36176;
        if (c7198 == null) {
            C15243.m36592("bottomSlideLayout");
            throw null;
        }
        c7198.m19780();
        final AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        final boolean zMo4281 = abstractC22044M35193.mo4281();
        C21576.m49062(180L, new Runnable() { // from class: l.ᩴ֨֫
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC11499.m28920(zMo4281, viewOnClickListenerC11499, abstractC22044M35193);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28920(boolean z, final ViewOnClickListenerC11499 viewOnClickListenerC11499, final AbstractC22044 abstractC22044) {
        if (z) {
            String strMo4294 = abstractC22044.mo4294();
            C15243.m36591(strMo4294, "getPath(...)");
            viewOnClickListenerC11499.m28903(strMo4294, (InterfaceC19479) null);
            return;
        }
        viewOnClickListenerC11499.m28903(abstractC22044.m49881(), new InterfaceC19479() { // from class: l.ܳ֨֫
            @Override // l.InterfaceC19479
            /* JADX INFO: renamed from: ۙ */
            public final Object mo4064() {
                return ViewOnClickListenerC11499.m28948(abstractC22044, viewOnClickListenerC11499);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11471 m28948(AbstractC22044 abstractC22044, ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        C8277 c8277 = viewOnClickListenerC11499.f36178;
        String name = abstractC22044.getName();
        C15243.m36591(name, "getName(...)");
        c8277.m22359(name);
        return C11471.f36082;
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f36198) {
            this.f36198 = false;
        } else {
            m28915(this, true, (InterfaceC19479) null, 4);
        }
        C11870 c11870 = this.f36183;
        if (c11870 != null) {
            c11870.m29756();
        } else {
            C15243.m36592("bottomToolbar");
            throw null;
        }
    }

    @Override // l.AbstractActivityC17204, l.InterfaceC15712
    /* JADX INFO: renamed from: ᩷ */
    public final void mo123(Intent intent) {
        C3347 c3347 = this.f36199;
        if (c3347 != null) {
            c3347.m10999(intent);
        } else {
            C15243.m36592("launcherForGrantPathPrimary");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    private final void m28932() {
        C7495 c7495;
        C8855 c8855;
        C7495 c7496;
        C8855 c8856;
        C7495 c7497 = this.f36186;
        if (c7497 != null) {
            String strM20218 = c7497.m20218();
            C15243.m36591(strM20218, "getPath(...)");
            C22961.m51794(strM20218, (C8877) null);
            this.f56046.setSubtitle(c7497.m20218());
        }
        C11870 c11870 = this.f36183;
        if (c11870 == null) {
            C15243.m36592("bottomToolbar");
            throw null;
        }
        boolean z = false;
        AbstractC20075 abstractC20075M29740 = c11870.m29740(0);
        abstractC20075M29740.getClass();
        C15599 c15599 = (C15599) abstractC20075M29740;
        C3072 c3072 = this.f36173;
        if (c3072 != null) {
            c15599.m37327((c3072.m10026() || (c7496 = this.f36186) == null || (c8856 = c7496.f24220) == null || !c8856.m23725()) ? false : true);
            C11870 c11871 = this.f36183;
            if (c11871 == null) {
                C15243.m36592("bottomToolbar");
                throw null;
            }
            AbstractC20075 abstractC20075M29741 = c11871.m29740(1);
            abstractC20075M29741.getClass();
            C15599 c155910 = (C15599) abstractC20075M29741;
            C3072 c3073 = this.f36173;
            if (c3073 != null) {
                if (!c3073.m10026() && (c7495 = this.f36186) != null && (c8855 = c7495.f24220) != null && c8855.m23729()) {
                    z = true;
                }
                c155910.m37327(z);
                return;
            }
            C15243.m36592("swipeRefreshLayout");
            throw null;
        }
        C15243.m36592("swipeRefreshLayout");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28915(ViewOnClickListenerC11499 viewOnClickListenerC11499, boolean z, InterfaceC19479 interfaceC19479, int i) {
        boolean z2 = (i & 2) == 0;
        if ((i & 4) != 0) {
            interfaceC19479 = null;
        }
        InterfaceC19479 interfaceC194710 = interfaceC19479;
        AtomicInteger atomicInteger = viewOnClickListenerC11499.f36175;
        C7495 c7495 = viewOnClickListenerC11499.f36186;
        if (c7495 == null) {
            return;
        }
        AbstractC8585 lifecycle = viewOnClickListenerC11499.getLifecycle();
        C15243.m36591(lifecycle, "<get-lifecycle>(...)");
        new C12991(z2, viewOnClickListenerC11499, c7495, (C20168) lifecycle, z2 ? atomicInteger.get() : atomicInteger.incrementAndGet(), interfaceC194710, z).m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m28911(ViewOnClickListenerC11499 viewOnClickListenerC11499, List list) {
        Set setM28944;
        if (viewOnClickListenerC11499.m28923()) {
            setM28944 = viewOnClickListenerC11499.m28944();
        } else {
            setM28944 = C22988.f74634;
        }
        viewOnClickListenerC11499.f36196 = list;
        if (viewOnClickListenerC11499.m28923()) {
            for (InterfaceC2386 interfaceC2386 : viewOnClickListenerC11499.f36196) {
                if (!interfaceC2386.mo8106()) {
                    interfaceC2386.setChecked(interfaceC2386.mo8090() && setM28944.contains(interfaceC2386.getPath()));
                }
            }
        }
        if (viewOnClickListenerC11499.f36189.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC2386 interfaceC2387 = (InterfaceC2386) obj;
                if (!interfaceC2387.mo8092()) {
                    String name = interfaceC2387.getName();
                    C15243.m36591(name, "getName(...)");
                    if (C0878.m3576((CharSequence) name, (CharSequence) viewOnClickListenerC11499.f36189, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list = arrayList;
        }
        viewOnClickListenerC11499.f36195 = list;
        viewOnClickListenerC11499.m28962();
        viewOnClickListenerC11499.f36178.m22362(true);
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private final boolean m28923() {
        return this.f36180 == 3;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    private final HashSet m28944() {
        HashSet hashSet = new HashSet();
        for (InterfaceC2386 interfaceC2386 : this.f36196) {
            if (interfaceC2386.mo8090() && interfaceC2386.isChecked()) {
                hashSet.add(interfaceC2386.getPath());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    private final int m28935() {
        int i = 0;
        for (InterfaceC2386 interfaceC2386 : this.f36196) {
            if (interfaceC2386.mo8090() && interfaceC2386.isChecked()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private final boolean m28958() {
        boolean z = false;
        for (InterfaceC2386 interfaceC2386 : this.f36196) {
            if (!interfaceC2386.mo8106() && interfaceC2386.isChecked()) {
                interfaceC2386.setChecked(false);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m28905(ViewOnClickListenerC11499 viewOnClickListenerC11499, int i) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2386 interfaceC2386 : viewOnClickListenerC11499.f36195) {
            if (interfaceC2386.mo8090() && interfaceC2386.isChecked()) {
                arrayList.add(C17059.m40193(i, interfaceC2386.getTime()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = false;
        for (InterfaceC2386 interfaceC2387 : viewOnClickListenerC11499.f36195) {
            if (interfaceC2387.mo8090() && !interfaceC2387.isChecked()) {
                Iterator it = arrayList.iterator();
                C15243.m36591(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    C15243.m36591(next, "next(...)");
                    long[] jArr = (long[]) next;
                    if (jArr[0] <= interfaceC2387.getTime() && interfaceC2387.getTime() < jArr[1]) {
                        interfaceC2387.setChecked(true);
                        z = true;
                        break;
                    }
                }
            }
        }
        viewOnClickListenerC11499.m28921(z, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m28951(ViewOnClickListenerC11499 viewOnClickListenerC11499, long j, long j2) {
        boolean z = false;
        for (InterfaceC2386 interfaceC2386 : viewOnClickListenerC11499.f36195) {
            if (interfaceC2386.mo8090()) {
                boolean z2 = j <= interfaceC2386.getTime() && interfaceC2386.getTime() < j2;
                if (interfaceC2386.isChecked() != z2) {
                    interfaceC2386.setChecked(z2);
                    z = true;
                }
            }
        }
        viewOnClickListenerC11499.m28921(z, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m28908(ViewOnClickListenerC11499 viewOnClickListenerC11499, long j, long j2) {
        boolean z = false;
        for (InterfaceC2386 interfaceC2386 : viewOnClickListenerC11499.f36195) {
            if (interfaceC2386.mo8090()) {
                boolean z2 = interfaceC2386.mo8102() && j <= interfaceC2386.getSize() && interfaceC2386.getSize() < j2;
                if (interfaceC2386.isChecked() != z2) {
                    interfaceC2386.setChecked(z2);
                    z = true;
                }
            }
        }
        viewOnClickListenerC11499.m28921(z, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m28912(ViewOnClickListenerC11499 viewOnClickListenerC11499, C5534 c5534) {
        boolean z = false;
        for (InterfaceC2386 interfaceC2386 : viewOnClickListenerC11499.f36195) {
            if (interfaceC2386.mo8090()) {
                String name = interfaceC2386.getName();
                C15243.m36591(name, "getName(...)");
                boolean zBooleanValue = ((Boolean) c5534.invoke(name)).booleanValue();
                if (interfaceC2386.isChecked() != zBooleanValue) {
                    interfaceC2386.setChecked(zBooleanValue);
                    z = true;
                }
            }
        }
        viewOnClickListenerC11499.m28921(z, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m28921(boolean z, boolean z2) {
        m28962();
        if (z) {
            this.f36178.m22362(false);
        }
        if (z2 && m28935() == 0) {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final void m28962() {
        if (m28923()) {
            int iM28935 = m28935();
            TextView textView = (TextView) m40418(R.id.button1);
            textView.setText(getString(this.f36187) + MotionUtils.EASING_TYPE_FORMAT_START + iM28935 + MotionUtils.EASING_TYPE_FORMAT_END);
            textView.setEnabled(iM28935 > 0);
            if (iM28935 > 0) {
                C11870 c11870 = this.f36183;
                if (c11870 != null) {
                    c11870.m29748();
                    return;
                } else {
                    C15243.m36592("bottomToolbar");
                    throw null;
                }
            }
            C11870 c11871 = this.f36183;
            if (c11871 != null) {
                c11871.m29737();
            } else {
                C15243.m36592("bottomToolbar");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m28913(ViewOnClickListenerC11499 viewOnClickListenerC11499, ViewOnClickListenerC14242 viewOnClickListenerC14242) {
        viewOnClickListenerC14242.m34568().setBackgroundColor(viewOnClickListenerC11499.m28923() && viewOnClickListenerC14242.m34569().mo8090() && viewOnClickListenerC14242.m34569().isChecked() ? C3296.f10761 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void m28930() {
        final C7495 c7495;
        C3072 c3072 = this.f36173;
        if (c3072 == null) {
            C15243.m36592("swipeRefreshLayout");
            throw null;
        }
        if (c3072.m10026() || (c7495 = this.f36186) == null) {
            return;
        }
        String strM20218 = c7495.m20218();
        final String strM28558 = C11293.m28558(strM20218);
        final String strM28556 = C11293.m28556(strM20218);
        if (strM28556 == null) {
            if (this.f36200.m55199()) {
                C22673.m51152(R.string.MT_Protector);
                return;
            } else {
                C22673.m51157();
                finish();
                return;
            }
        }
        m28903(strM28556, new InterfaceC19479() { // from class: l.۬ۢ֫
            @Override // l.InterfaceC19479
            /* JADX INFO: renamed from: ۙ */
            public final Object mo4064() {
                return ViewOnClickListenerC11499.m28893(c7495, strM28556, this, strM28558);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11471 m28893(C7495 c7495, String str, ViewOnClickListenerC11499 viewOnClickListenerC11499, String str2) {
        viewOnClickListenerC11499.f36178.m22358((Integer) c7495.f24220.f28934.get(str), str2);
        return C11471.f36082;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m28955() {
        if (m28923() && !m28944().isEmpty()) {
            if (m28923()) {
                boolean zM28958 = m28958();
                m28962();
                if (zM28958) {
                    this.f36178.m22362(false);
                    return;
                }
                return;
            }
            return;
        }
        C7308 c7308 = this.f36170;
        if (c7308 == null) {
            C15243.m36592("searchView");
            throw null;
        }
        if (c7308.m20011()) {
            C7308 c7309 = this.f36170;
            if (c7309 != null) {
                c7309.m20012();
                return;
            } else {
                C15243.m36592("searchView");
                throw null;
            }
        }
        m28930();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11471 m28894(ViewOnClickListenerC11499 viewOnClickListenerC11499, C2889 c2889, String str) {
        viewOnClickListenerC11499.f36178.m22358(Integer.valueOf(c2889.f9478), str);
        return C11471.f36082;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11471 m28947(ViewOnClickListenerC11499 viewOnClickListenerC11499, C2889 c2889, String str) {
        viewOnClickListenerC11499.f36178.m22358(Integer.valueOf(c2889.f9478), str);
        return C11471.f36082;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28918(C23255 c23255, final ViewOnClickListenerC11499 viewOnClickListenerC11499, DialogInterfaceC8327 dialogInterfaceC8327, C1626 c1626) {
        int i;
        String string = c23255.m54021().toString();
        if (C0878.m3576((CharSequence) string, (CharSequence) "\\", false) || C0878.m3576((CharSequence) string, (CharSequence) "/", false)) {
            i = R.string.MT_Protector;
        } else {
            C7495 c7495 = viewOnClickListenerC11499.f36186;
            C15243.m36586(c7495);
            final AbstractC22044 abstractC22044M35193 = C14584.m35193(c7495.m20218(), string);
            if (abstractC22044M35193.mo2934()) {
                i = abstractC22044M35193.mo4281() ? R.string.MT_Protector : R.string.MT_Protector;
            } else {
                try {
                    C7495 c7496 = viewOnClickListenerC11499.f36186;
                    C15243.m36586(c7496);
                    C6265.m17912(c7496.mo20207(), EnumC12230.MODIFY_DIRECTORY_LINKED);
                    try {
                        abstractC22044M35193.m49853();
                        m28915(viewOnClickListenerC11499, false, new InterfaceC19479() { // from class: l.ۤ֨֫
                            @Override // l.InterfaceC19479
                            /* JADX INFO: renamed from: ۙ */
                            public final Object mo4064() {
                                return ViewOnClickListenerC11499.m28956(abstractC22044M35193, viewOnClickListenerC11499);
                            }
                        }, 2);
                        dialogInterfaceC8327.dismiss();
                        return;
                    } catch (Exception e) {
                        e = e;
                        viewOnClickListenerC11499.m40401(e, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                } catch (C4866 e2) {
                    e = e2;
                }
            }
        }
        c1626.m5768(viewOnClickListenerC11499.getText(i));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C11471 m28956(AbstractC22044 abstractC22044, ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        C8277 c8277 = viewOnClickListenerC11499.f36178;
        String name = abstractC22044.getName();
        C15243.m36591(name, "getName(...)");
        c8277.m22359(name);
        return C11471.f36082;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28954(C23255 c23255, final ViewOnClickListenerC11499 viewOnClickListenerC11499, DialogInterfaceC8327 dialogInterfaceC8327, C1626 c1626) {
        int i;
        String string = c23255.m54021().toString();
        if (C0878.m3576((CharSequence) string, (CharSequence) "\\", false) || C0878.m3576((CharSequence) string, (CharSequence) "/", false)) {
            i = R.string.MT_Protector;
        } else {
            C7495 c7495 = viewOnClickListenerC11499.f36186;
            C15243.m36586(c7495);
            final AbstractC22044 abstractC22044M35193 = C14584.m35193(c7495.m20218(), string);
            if (abstractC22044M35193.mo2934()) {
                i = abstractC22044M35193.mo4281() ? R.string.MT_Protector : R.string.MT_Protector;
            } else {
                try {
                    C7495 c7496 = viewOnClickListenerC11499.f36186;
                    C15243.m36586(c7496);
                    C6265.m17912(c7496.mo20207(), EnumC12230.MODIFY_DIRECTORY_LINKED);
                    try {
                        if (abstractC22044M35193.mo4283()) {
                            m28915(viewOnClickListenerC11499, false, new InterfaceC19479() { // from class: l.᩸֨֫
                                @Override // l.InterfaceC19479
                                /* JADX INFO: renamed from: ۙ */
                                public final Object mo4064() {
                                    return ViewOnClickListenerC11499.m28895(abstractC22044M35193, viewOnClickListenerC11499);
                                }
                            }, 2);
                            dialogInterfaceC8327.dismiss();
                            return;
                        }
                        throw new Exception("Failed to create file: ".concat(string));
                    } catch (Exception e) {
                        e = e;
                        viewOnClickListenerC11499.m40401(e, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                } catch (C4866 e2) {
                    e = e2;
                }
            }
        }
        c1626.m5768(viewOnClickListenerC11499.getText(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11471 m28895(AbstractC22044 abstractC22044, ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        C8277 c8277 = viewOnClickListenerC11499.f36178;
        String name = abstractC22044.getName();
        C15243.m36591(name, "getName(...)");
        c8277.m22359(name);
        return C11471.f36082;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    private final C2889 m28938() {
        C7495 c7495 = this.f36186;
        C15243.m36586(c7495);
        String strM20218 = c7495.m20218();
        int iM22356 = this.f36178.m22356();
        C7308 c7308 = this.f36170;
        if (c7308 != null) {
            return new C2889(strM20218, iM22356, this.f36189, c7308.m20011());
        }
        C15243.m36592("searchView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28903(String str, InterfaceC19479 interfaceC19479) {
        C7495 c7495 = this.f36186;
        C15243.m36586(c7495);
        c7495.f24220.m23727(m28938());
        if (m28923()) {
            m28958();
            m28962();
        }
        final C24941 c24941 = new C24941();
        if (!C0878.m3579(str, "/", false) && c7495.mo10177(str)) {
            c24941.f80717 = C11293.m28558(str);
            str = C11293.m28556(str);
            C15243.m36591(str, "getParent(...)");
        }
        c7495.mo20211(str);
        C7308 c7308 = this.f36170;
        if (c7308 == null) {
            C15243.m36592("searchView");
            throw null;
        }
        if (c7308.m20011()) {
            this.f36189 = "";
            C7308 c7309 = this.f36170;
            if (c7309 == null) {
                C15243.m36592("searchView");
                throw null;
            }
            c7309.m20014();
        }
        if (interfaceC19479 == null) {
            interfaceC19479 = new InterfaceC19479() { // from class: l.֨ۢ֫
                @Override // l.InterfaceC19479
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final Object mo4064() {
                    return ViewOnClickListenerC11499.m28896(c24941, this);
                }
            };
        }
        m28915(this, true, interfaceC19479, 2);
        m28932();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11471 m28896(C24941 c24941, ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        C8277 c8277 = viewOnClickListenerC11499.f36178;
        Object obj = c24941.f80717;
        if (obj == null) {
            c8277.m22357(0);
        } else {
            c8277.m22359((String) obj);
        }
        return C11471.f36082;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    private final void m28890() {
        C7495 c7495 = this.f36186;
        if (c7495 == null) {
            return;
        }
        Object systemService = C21576.m49084().getSystemService("clipboard");
        C15243.m36587(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        final ClipboardManager clipboardManager = (ClipboardManager) systemService;
        final C13497 c13497 = new C13497(this);
        c13497.m22945(R.string.MT_Protector);
        c13497.m22924((CharSequence) C18969.m44060(2000, c7495.m20193()));
        c13497.m22959();
        c13497.m22957(2);
        c13497.m22955(true);
        c13497.m22928().setOnClickListener(new View.OnClickListener() { // from class: l.ۙ֨֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                int i = ViewOnClickListenerC11499.f36169;
                ClipboardManager clipboardManager2 = clipboardManager;
                if (clipboardManager2.hasPrimaryClip()) {
                    CharSequence text = clipboardManager2.getText();
                    if (text == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    C13497 c13498 = c13497;
                    c13498.m22924((CharSequence) string);
                    c13498.m22916();
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intentPutStringArrayListExtra;
        String strM36755;
        C7495 c7495 = this.f36186;
        if (c7495 == null) {
            return;
        }
        int i = this.f36180;
        if (i == 0) {
            String strM20218 = c7495.m20218();
            C15243.m36591(strM20218, "getPath(...)");
            m28925(strM20218);
            return;
        }
        int i2 = 0;
        ClipData clipDataNewRawUri = null;
        if (i == 2) {
            String strM20219 = c7495.m20218();
            C23255 c23255 = this.f36191;
            if (c23255 == null) {
                C15243.m36592("filenameEditText");
                throw null;
            }
            AbstractC22044 abstractC22044M35193 = C14584.m35193(strM20219, c23255.m54021().toString());
            if (abstractC22044M35193.mo2934()) {
                C2361 c2361BuildDialog = buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8008(getString(R.string.MT_Protector, abstractC22044M35193.getName()));
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10029(i2, abstractC22044M35193, this));
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016();
                return;
            }
            String strMo4294 = abstractC22044M35193.mo4294();
            C15243.m36591(strMo4294, "getPath(...)");
            C22961.m51794(strMo4294, (C8877) null);
            String strMo4295 = abstractC22044M35193.mo4294();
            C15243.m36591(strMo4295, "getPath(...)");
            m28925(strMo4295);
            return;
        }
        if (i == 3) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (InterfaceC2386 interfaceC2386 : this.f36196) {
                if (interfaceC2386.mo8090() && interfaceC2386.isChecked()) {
                    arrayList.add(interfaceC2386.getPath());
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            String str = this.f36174;
            if (str != null) {
                C7495 c7496 = this.f36186;
                if (c7496 == null || (strM36755 = c7496.m20218()) == null) {
                    strM36755 = C15306.m36755(arrayList.get(0));
                }
                ApplicationC17729.f58258.edit().putString(str, strM36755).apply();
            }
            Intent intent = getIntent();
            C15243.m36591(intent, "getIntent(...)");
            if (!C15243.m36589((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
                intentPutStringArrayListExtra = new Intent().putStringArrayListExtra("paths", arrayList);
                C15243.m36591(intentPutStringArrayListExtra, "putStringArrayListExtra(...)");
            } else {
                intentPutStringArrayListExtra = new Intent();
                if (arrayList.size() == 1) {
                    intentPutStringArrayListExtra.setData(C17568.m41230(arrayList.get(0)));
                } else {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i3 = i2 + 1;
                        Uri uriM41230 = C17568.m41230(it.next());
                        if (i2 == 0) {
                            clipDataNewRawUri = ClipData.newRawUri("paths", uriM41230);
                        } else if (clipDataNewRawUri != null) {
                            clipDataNewRawUri.addItem(new ClipData.Item(uriM41230));
                        }
                        i2 = i3;
                    }
                    intentPutStringArrayListExtra.setClipData(clipDataNewRawUri);
                }
                if (!arrayList.isEmpty()) {
                    intentPutStringArrayListExtra.addFlags(1);
                    intentPutStringArrayListExtra.addFlags(2);
                }
            }
            setResult(-1, intentPutStringArrayListExtra);
            finish();
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m28929(AbstractC22044 abstractC22044, ViewOnClickListenerC11499 viewOnClickListenerC11499) {
        String strMo4294 = abstractC22044.mo4294();
        C15243.m36591(strMo4294, "getPath(...)");
        C22961.m51794(strMo4294, (C8877) null);
        String strMo4295 = abstractC22044.mo4294();
        C15243.m36591(strMo4295, "getPath(...)");
        viewOnClickListenerC11499.m28925(strMo4295);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28925(String str) {
        String str2 = this.f36174;
        if (str2 != null) {
            ApplicationC17729.f58258.edit().putString(str2, C15306.m36755(str)).apply();
        }
        Intent intent = new Intent();
        Intent intent2 = getIntent();
        C15243.m36591(intent2, "getIntent(...)");
        if (C15243.m36589((Object) intent2.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            intent.setData(C17568.m41230(str));
            intent.addFlags(1);
            intent.addFlags(2);
        } else {
            intent.putExtra(MotionUtils.EASING_TYPE_PATH, str);
            Bundle bundleExtra = getIntent().getBundleExtra("extra");
            if (bundleExtra != null) {
                intent.putExtra("extra", bundleExtra);
            }
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C20956 m28898(AbstractC12639 abstractC12639, String str, InterfaceC0073 interfaceC0073) {
        C15243.m36590(abstractC12639, "registry");
        C15243.m36590(str, "key");
        return new C20956(C12296.m30695(abstractC12639, str, new C12005(interfaceC0073)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C20956 m28899(AbstractActivityC17204 abstractActivityC17204, InterfaceC0073 interfaceC0073) {
        return new C20956(C12296.m30693(abstractActivityC17204, new C17751(interfaceC0073)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C20956 m28897(ComponentCallbacksC11612 componentCallbacksC11612, final InterfaceC0073 interfaceC0073) {
        return new C20956(C12296.m30694(componentCallbacksC11612, new InterfaceC16025() { // from class: l.᩵֨֫
            @Override // l.InterfaceC16025
            /* JADX INFO: renamed from: ۙ */
            public final void mo8384(Intent intent, int i) {
                String stringExtra;
                InterfaceC0073 interfaceC0074 = interfaceC0073;
                if (i == 0) {
                    interfaceC0074.mo1127();
                } else {
                    if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                        return;
                    }
                    interfaceC0074.mo1128(stringExtra);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C23940 m28900(ComponentCallbacksC11612 componentCallbacksC11612, final InterfaceC17972 interfaceC17972) {
        return new C23940(C12296.m30694(componentCallbacksC11612, new InterfaceC16025() { // from class: l.᩹֨֫
            @Override // l.InterfaceC16025
            /* JADX INFO: renamed from: ۙ */
            public final void mo8384(Intent intent, int i) {
                String stringExtra;
                InterfaceC17972 interfaceC17973 = interfaceC17972;
                if (i == 0) {
                    interfaceC17973.mo16589();
                    return;
                }
                if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("extra");
                C15243.m36586(bundleExtra);
                interfaceC17973.mo16590(bundleExtra, stringExtra);
            }
        }));
    }
}
