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
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC8374 extends AbstractActivityC12483 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29048 = 0;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public C1439 f29049;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C22046 f29050;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C5926 f29052;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C7935 f29053;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C14063 f29054;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public final C22959 f29056;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f29057;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public List f29058;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public long f29059;

    /* JADX INFO: renamed from: ۢܰ, reason: not valid java name and contains not printable characters */
    public C11672 f29060;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public C9101 f29061;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public View f29064;

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public int f29065;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public EditText f29066;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public List f29067;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public List f29069;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public boolean f29070;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public String f29071;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public int f29072;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public C21423 f29073;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public C8765 f29076;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final int f29077;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public C6018 f29078;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f29055 = new HashSet();

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f29062 = new HashSet();

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public final C2728 f29051 = new C2728(this);

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public int f29063 = ApplicationC0716.f2992.getInt("fcsp", 0);

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public boolean f29068 = ApplicationC0716.f2992.getBoolean("fcrp", false);

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public String f29075 = "";

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public int f29074 = R.string.MT_Protector;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "FilePickerActivity";
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        C13465.m32966(menu, "menu");
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        SubMenu subMenu = menu.findItem(R.id.MT_Protector).getSubMenu();
        C13465.m32962(subMenu);
        ArrayList arrayList = new ArrayList();
        subMenu.clear();
        MenuItem menuItemAdd = subMenu.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector);
        C13465.m32967(menuItemAdd, "add(...)");
        C0690 c0690 = C0690.f2923;
        C13465.m32967(c0690, "ROOT");
        m21929(menuItemAdd, c0690);
        arrayList.add("/");
        MenuItem menuItemAdd2 = subMenu.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector);
        C13465.m32967(menuItemAdd2, "add(...)");
        C0690 c0691 = C0690.f2927;
        C13465.m32967(c0691, "SDCARD");
        m21929(menuItemAdd2, c0691);
        arrayList.add(C11904.f39934.mo33986());
        for (C18149 c18149 : (ArrayList) C8272.m21692()) {
            MenuItem menuItemAdd3 = subMenu.add(R.id.MT_Protector, arrayList.size() + R.string.MT_Protector, 0, c18149.f58040);
            C13465.m32967(menuItemAdd3, "add(...)");
            C0690 c0692 = C0690.f2927;
            C13465.m32967(c0692, "SDCARD");
            m21929(menuItemAdd3, c0692);
            arrayList.add(c18149.f58039.getPath());
        }
        for (C18295 c18295 : C19001.m43714()) {
            MenuItem menuItemAdd4 = subMenu.add(R.id.MT_Protector, arrayList.size() + R.string.MT_Protector, 0, c18295.f58377);
            C13465.m32967(menuItemAdd4, "add(...)");
            C0690 c0693 = C0690.f2900;
            C13465.m32967(c0693, "FOLDER");
            m21929(menuItemAdd4, c0693);
            arrayList.add(c18295.m42503());
        }
        this.f29069 = arrayList;
        return true;
    }

    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C13465.m32966(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C11672 c11672 = this.f29060;
        if (c11672 != null) {
            C11018 c11018 = new C11018();
            c11672.mo13032(c11018);
            bundle.putByteArray("visitorData", c11018.m27773());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21929(MenuItem menuItem, C0690 c0690) {
        C13465.m32966(c0690, "typeIcon");
        menuItem.setIcon(c0690.f2944.m35074());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C13465.m32966(menuItem, "selectedMenuItem");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            SubMenu subMenu = menuItem.getSubMenu();
            C13465.m32962(subMenu);
            subMenu.findItem(R.id.MT_Protector).setChecked(C5383.m14951());
            subMenu.findItem(R.id.MT_Protector).setChecked(C5383.m14954());
            C7321 c7321 = C7321.f24318;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m21944(this, false, (InterfaceC4871) null, 2);
            C7321 c7322 = C7321.f24318;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C9080.m23413();
            C1439 c1439 = this.f29049;
            if (c1439 == null) {
                C13465.m32968("searchView");
                throw null;
            }
            if (!c1439.m5031()) {
                C1439 c14310 = this.f29049;
                if (c14310 != null) {
                    c14310.m5028((String) null);
                } else {
                    C13465.m32968("searchView");
                    throw null;
                }
            }
            C1439 c14311 = this.f29049;
            if (c14311 == null) {
                C13465.m32968("searchView");
                throw null;
            }
            c14311.m5034(true);
            C7321 c7323 = C7321.f24318;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C14019(this);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean z = !menuItem.isChecked();
            menuItem.setChecked(z);
            C5383.m14953(z);
            m21944(this, true, (InterfaceC4871) null, 4);
            C7321 c7324 = C7321.f24318;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean z2 = !menuItem.isChecked();
            menuItem.setChecked(z2);
            C5383.m14947(z2);
            m21944(this, true, (InterfaceC4871) null, 4);
            C7321 c7325 = C7321.f24318;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            finish();
            C7321 c7326 = C7321.f24318;
            return true;
        }
        if (menuItem.getGroupId() == R.id.MT_Protector) {
            int i = itemId - R.string.MT_Protector;
            List list = this.f29069;
            if (i >= 0 && i < list.size()) {
                m21931((String) list.get(i), (InterfaceC4871) null);
                return true;
            }
        }
        return false;
    }

    public ViewOnClickListenerC8374() {
        List list = Collections.EMPTY_LIST;
        C13465.m32967(list, "emptyList(...)");
        this.f29067 = list;
        this.f29058 = list;
        this.f29072 = -1;
        this.f29077 = ApplicationC0716.f2988.getInt("fltp", 0);
        this.f29070 = true;
        this.f29069 = list;
        this.f29057 = new AtomicInteger();
        this.f29056 = C22959.m50801();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final void m21961(ViewOnClickListenerC8374 viewOnClickListenerC8374, int i) {
        viewOnClickListenerC8374.f29063 = i;
        ApplicationC0716.f2992.edit().mo4065(i, "fcsp").apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m21943(ViewOnClickListenerC8374 viewOnClickListenerC8374, boolean z) {
        viewOnClickListenerC8374.f29068 = z;
        C1679.m5597(ApplicationC0716.f2992, "fcrp", z);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31023();
        m31016(R.layout.MT_Protector);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C1317 c1317 = new C1317(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c1317);
        Intent intent = getIntent();
        C13465.m32967(intent, "getIntent(...)");
        if (C13465.m32965((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            setTitle(R.string.MT_Protector);
        } else {
            setTitle(getIntent().getIntExtra("title", R.string.MT_Protector));
        }
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        AbstractC10697 abstractC10697M25489 = m25489();
        if (abstractC10697M25489 != null) {
            abstractC10697M25489.mo13895(true);
        }
        c6938.setNavigationIcon(R.drawable.MT_Protector);
        c6938.setNavigationOnClickListener(new ViewOnClickListenerC6693(this, 2));
        c6938.setSubtitle("...");
        TextView textViewM49629 = C22377.m49629(c6938);
        TextView textViewM49630 = C22377.m49630(c6938);
        textViewM49630.setEllipsize(TextUtils.TruncateAt.START);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: l.ۜ۠ۘ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ViewOnClickListenerC8374.m21968(this.f22407);
                return true;
            }
        };
        ViewOnClickListenerC14803 viewOnClickListenerC14803 = new ViewOnClickListenerC14803(4, this);
        textViewM49629.setOnClickListener(viewOnClickListenerC14803);
        textViewM49630.setOnClickListener(viewOnClickListenerC14803);
        textViewM49629.setOnLongClickListener(onLongClickListener);
        textViewM49630.setOnLongClickListener(onLongClickListener);
        View viewM31016 = m31016(R.id.file_name);
        C13465.m32967(viewM31016, "view(...)");
        this.f29066 = (EditText) viewM31016;
        View viewM31017 = m31016(R.id.MT_Protector);
        C13465.m32967(viewM31017, "view(...)");
        this.f29073 = (C21423) viewM31017;
        View viewM31018 = m31016(R.id.MT_Protector);
        C13465.m32967(viewM31018, "view(...)");
        this.f29078 = (C6018) viewM31018;
        View viewM31019 = m31016(R.id.MT_Protector);
        C13465.m32967(viewM31019, "view(...)");
        this.f29064 = viewM31019;
        C5926 c5926 = new C5926(this);
        this.f29052 = c5926;
        C21423 c21423 = this.f29073;
        if (c21423 == null) {
            C13465.m32968("recyclerView");
            throw null;
        }
        c21423.setAdapter(c5926);
        C6018 c6018 = this.f29078;
        if (c6018 == null) {
            C13465.m32968("swipeRefreshLayout");
            throw null;
        }
        c6018.m16334(new C17920(this));
        C21423 c21424 = this.f29073;
        if (c21424 == null) {
            C13465.m32968("recyclerView");
            throw null;
        }
        c21424.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC18626(0, this));
        View viewM310110 = m31016(R.id.MT_Protector);
        C13465.m32967(viewM310110, "view(...)");
        this.f29053 = (C7935) viewM310110;
        View viewM310111 = m31016(R.id.MT_Protector);
        C13465.m32967(viewM310111, "view(...)");
        C22046 c22046 = (C22046) viewM310111;
        this.f29050 = c22046;
        final Window window = getWindow();
        final int statusBarColor = window.getStatusBarColor();
        c22046.m48984(new InterfaceC0878() { // from class: l.۟ܶۘ
            {
                int i = 666657931;
                int i2 = C2642.f10294;
                int i3 = C1398.f5802;
                int iM45029 = (C19806.m45029("ۖ֡") + i2) * 69;
                int i4 = ((iM45029 ^ i3) * (-17407)) ^ 566466552;
                int i5 = -972795241;
                while (true) {
                    i = ((((i ^ i3) * 14445) >> 31) & i4) ^ (iM45029 ^ i5);
                    switch (i) {
                        case -2049818478:
                        case 1126614670:
                            if (C10634.f36300 >= 0) {
                                iM45029 = C19806.m45029("֨ۧ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 1401) ^ (-1699564929);
                                i5 = -1684986641;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۙۡ") ^ i2;
                                i4 = ((iM45029 ^ i3) * 11779) ^ (-890480309);
                                i5 = -120259501;
                            }
                            break;
                        case -2034795792:
                        case 1829929791:
                            C0671.m3008();
                            C1066.m4023();
                            throw new RuntimeException();
                        case -2008814742:
                        case -1333483731:
                            C10634.m26820();
                            if (C2642.f10294 <= 0) {
                                iM45029 = C19806.m45029("۫ܺ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 21639) ^ 1360295603;
                                i5 = -258225575;
                            } else {
                                iM45029 = (C19806.m45029("᩻ۧ") ^ i2) * 37;
                                i4 = ((iM45029 ^ i3) * 29459) ^ 754194349;
                                i5 = -1827266127;
                            }
                            break;
                        case -1638470867:
                        case -112728628:
                            if (RunnableC0195.m1431()) {
                                iM45029 = ThreadFactoryC3888.m11306("ۜۖ") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-21103)) ^ 1019798547;
                                i5 = 1683263044;
                            } else {
                                iM45029 = (i2 - C19806.m45029("ܰ۠")) * 85;
                                i4 = ((iM45029 ^ i3) * (-8525)) ^ (-1048786319);
                                i5 = -1474274443;
                            }
                            break;
                        case -1574565729:
                        case 1077147547:
                            if (C1066.f4915 <= 0) {
                                iM45029 = C19806.m45029("᩸ۖ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 28603) ^ 1397193484;
                                i5 = -1381927853;
                            } else {
                                iM45029 = (i3 - ThreadFactoryC3888.m11306("ܶܽ")) * 5;
                                i4 = ((iM45029 ^ i2) * (-17129)) ^ (-57686094);
                                i5 = -425189892;
                            }
                            break;
                        case -870410727:
                        case -727284878:
                            if (C10634.m26820()) {
                                iM45029 = C19806.m45029("֨ۧ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 1401) ^ (-1699564929);
                                i5 = -1684986641;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۤ۬") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-18053)) ^ (-1399947556);
                                i5 = 694588270;
                            }
                            break;
                        case -743853722:
                        case 583574597:
                            if (RunnableC0195.f1321 >= 0) {
                                iM45029 = (C19806.m45029("᩻ۧ") ^ i2) * 37;
                                i4 = ((iM45029 ^ i3) * 29459) ^ 754194349;
                                i5 = -1827266127;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("᩺ۧ") ^ i2) * 91;
                                i4 = ((iM45029 ^ i3) * 17137) ^ (-548399813);
                                i5 = -273034273;
                            }
                            break;
                        case -697103705:
                        case 1374031371:
                            if (RunnableC1895.m6170() != 0) {
                                iM45029 = (C19806.m45029("᩻ۧ") ^ i2) * 37;
                                i4 = ((iM45029 ^ i3) * 29459) ^ 754194349;
                                i5 = -1827266127;
                            } else {
                                iM45029 = C19806.m45029("᩸ۖ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 28603) ^ 1397193484;
                                i5 = -1381927853;
                            }
                            break;
                        case -618735727:
                        case -155804190:
                            if (C1377.f5749) {
                                iM45029 = ThreadFactoryC3888.m11306("ۡ۫") ^ i2;
                                i4 = ((iM45029 ^ i3) * (-32603)) ^ (-218113760);
                                i5 = -2117251779;
                            } else {
                                iM45029 = (C19806.m45029("᩻ۧ") ^ i2) * 37;
                                i4 = ((iM45029 ^ i3) * 29459) ^ 754194349;
                                i5 = -1827266127;
                            }
                            break;
                        case -611442165:
                        case -173866912:
                            C2477.m7593();
                            if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                iM45029 = (i2 - C19806.m45029("ܰ۠")) * 85;
                                i4 = ((iM45029 ^ i3) * (-8525)) ^ (-1048786319);
                                i5 = -1474274443;
                            } else {
                                iM45029 = C19806.m45029("᩸ۖ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 28603) ^ 1397193484;
                                i5 = -1381927853;
                            }
                            break;
                        case -414229183:
                        case 298693831:
                            if (C7105.m18985()) {
                                iM45029 = C19806.m45029("֨ۧ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 1401) ^ (-1699564929);
                                i5 = -1684986641;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۖ᩵") ^ i3;
                                i4 = ((iM45029 ^ i2) * 3347) ^ 157482043;
                                i5 = -576502208;
                            }
                            break;
                        case -117343011:
                        case 1329684675:
                            if (RunnableC0195.m1431()) {
                                iM45029 = C19806.m45029("ܶۧ") ^ i2;
                                i4 = ((iM45029 ^ i3) * 24841) ^ (-1442034929);
                                i5 = 2143827412;
                            } else {
                                iM45029 = C19806.m45029("᩸ۖ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 28603) ^ 1397193484;
                                i5 = -1381927853;
                            }
                            break;
                        case 35105087:
                        case 239535643:
                            C1461.m5080();
                            iM45029 = C19806.m45029("᩸ۖ") ^ i3;
                            i4 = ((iM45029 ^ i2) * 28603) ^ 1397193484;
                            i5 = -1381927853;
                            break;
                        case 41122331:
                        case 458807602:
                            return;
                        case 755896310:
                        case 1616095647:
                            if (C1668.f6641 >= 0) {
                                iM45029 = C19806.m45029("۫ܺ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 21639) ^ 1360295603;
                                i5 = -258225575;
                            } else {
                                iM45029 = (i3 - C19806.m45029("ۤܺ")) * (-73);
                                i4 = ((iM45029 ^ i2) * 16695) ^ (-2097928695);
                                i5 = -150903686;
                            }
                            break;
                        default:
                            if (C0797.m3359()) {
                                iM45029 = C19806.m45029("ܿ۠") ^ i2;
                                i4 = ((iM45029 ^ i3) * (-2141)) ^ (-2087994447);
                                i5 = -869126947;
                            } else {
                                iM45029 = C19806.m45029("᩸ۖ") ^ i3;
                                i4 = ((iM45029 ^ i2) * 28603) ^ 1397193484;
                                i5 = -1381927853;
                            }
                            break;
                    }
                }
            }

            @Override // l.InterfaceC0878
            /* JADX INFO: renamed from: ۙ */
            public final void mo3550(float f) {
                float f2 = 0.0f;
                int i = 0;
                int iArgb = 0;
                int i2 = 0;
                int i3 = -1516487297;
                int i4 = C2124.f7782;
                int i5 = ThreadFactoryC3888.f14547;
                int iM45029 = (C19806.m45029("ܶ᩹") ^ i4) * (-115);
                int i6 = ((iM45029 ^ i5) * (-9559)) ^ 669063190;
                int i7 = 1623077450;
                while (true) {
                    i3 = ((((i3 ^ i5) * (-24291)) >> 31) & i6) ^ (iM45029 ^ i7);
                    switch (i3) {
                        case -2114964616:
                        case 630815266:
                            if (C0216.f1393 != 0) {
                                iM45029 = (C19806.m45029("ܳۙ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i6 = ((iM45029 ^ i5) * 7835) ^ (-1338580853);
                                i7 = 774299222;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i4;
                                i6 = ((iM45029 ^ i5) * (-11071)) ^ 1228369820;
                                i7 = -1808564305;
                            }
                            break;
                        case -1801378547:
                        case -855611:
                            i2 = statusBarColor;
                            if (C2704.f10408) {
                                iM45029 = ThreadFactoryC3888.m11306("ۙ֫") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-22905)) ^ 290076584;
                                i7 = -1815338434;
                            } else {
                                iM45029 = (C19806.m45029("ܳۙ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i6 = ((iM45029 ^ i5) * 7835) ^ (-1338580853);
                                i7 = 774299222;
                            }
                            break;
                        case -1722419795:
                        case 1575613550:
                            if (C0050.f912 <= 0) {
                                iM45029 = C19806.m45029("᩵۬") ^ i4;
                                i6 = ((iM45029 ^ i5) * 20697) ^ 1559579943;
                                i7 = 654448157;
                            } else {
                                iM45029 = C19806.m45029("᩻᩵") ^ i5;
                                i6 = ((iM45029 ^ i4) * 4641) ^ 1647808944;
                                i7 = 1795725298;
                            }
                            break;
                        case -1655096802:
                        case -256337832:
                            if (C7105.m18985()) {
                                iM45029 = (C19806.m45029("ܳۙ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i6 = ((iM45029 ^ i5) * 7835) ^ (-1338580853);
                                i7 = 774299222;
                            } else {
                                iM45029 = (i4 - C19806.m45029("ۘ᩹")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                i6 = ((iM45029 ^ i5) * (-2989)) ^ 812846661;
                                i7 = 1121656776;
                            }
                            break;
                        case -1496724897:
                        case 794172683:
                            C0817.m3399();
                            C2124.m6673();
                            break;
                        case -1227947431:
                        case 153182366:
                            iArgb = Color.argb(i, 0, 0, 0);
                            if (RunnableC0195.f1321 >= 0) {
                                iM45029 = C19806.m45029("ܳ᩵") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-10285)) ^ 490283615;
                                i7 = -328196521;
                            } else {
                                iM45029 = (C19806.m45029("᩺ᩳ") ^ i4) * (-79);
                                i6 = ((iM45029 ^ i5) * 7649) ^ (-1991618530);
                                i7 = -399828905;
                            }
                            break;
                        case -1172791285:
                        case -978357816:
                            window.setStatusBarColor(C3224.m9670(iArgb, i2));
                            break;
                        case -1088010131:
                        case 1717952011:
                            int i8 = AbstractActivityC12483.f41623;
                            if (CallableC1627.m5507() != 0) {
                                iM45029 = C19806.m45029("ܳ᩵") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-10285)) ^ 490283615;
                                i7 = -328196521;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i4;
                                i6 = ((iM45029 ^ i5) * (-2491)) ^ (-1731820228);
                                i7 = -2071812353;
                            }
                            break;
                        case -530988916:
                        case -269903413:
                            if (C1148.m4232() > 0) {
                                iM45029 = (i5 - C19806.m45029("᩶ۙ")) * (-25);
                                i6 = ((iM45029 ^ i4) * (-18409)) ^ (-694069190);
                                i7 = -401404811;
                            } else {
                                iM45029 = C19806.m45029("ܳ᩵") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-10285)) ^ 490283615;
                                i7 = -328196521;
                            }
                            break;
                        case -475526998:
                        case 2074474231:
                            if (RunnableC1564.f6300) {
                                iM45029 = C19806.m45029("᩵۬") ^ i4;
                                i6 = ((iM45029 ^ i5) * 20697) ^ 1559579943;
                                i7 = 654448157;
                            } else {
                                iM45029 = (C19806.m45029("ܳܶ") + i5) * 91;
                                i6 = ((iM45029 ^ i4) * (-25919)) ^ 792149328;
                                i7 = 686476931;
                            }
                            break;
                        case -216392751:
                        case 861054143:
                            f2 = 102.0f;
                            if (C0629.f2722 <= 0) {
                                iM45029 = C19806.m45029("۬ܶ") ^ i4;
                                i6 = ((iM45029 ^ i5) * 17949) ^ (-314836970);
                                i7 = -1737309686;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i4;
                                i6 = ((iM45029 ^ i5) * 17327) ^ 8896763;
                                i7 = 510008560;
                            }
                            break;
                        case 514449244:
                        case 2022391922:
                            C2477.m7593();
                            if (AbstractC0464.f2088 <= 0) {
                                iM45029 = C19806.m45029("᩵۬") ^ i4;
                                i6 = ((iM45029 ^ i5) * 20697) ^ 1559579943;
                                i7 = 654448157;
                            } else {
                                iM45029 = (C19806.m45029("ܳۙ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i6 = ((iM45029 ^ i5) * 7835) ^ (-1338580853);
                                i7 = 774299222;
                            }
                            break;
                        case 806389203:
                        case 1778205138:
                            i = (int) (f * f2);
                            if (C2477.f9839 <= 0) {
                                iM45029 = C19806.m45029("۬ܶ") ^ i4;
                                i6 = ((iM45029 ^ i5) * 17949) ^ (-314836970);
                                i7 = -1737309686;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("ܳ֡") ^ i5) * (-105);
                                i6 = ((iM45029 ^ i4) * 31011) ^ 1714808032;
                                i7 = 670600575;
                            }
                            break;
                        case 1030247084:
                        case 1396729065:
                            if (C0216.m1591() <= 0) {
                                iM45029 = (i5 - C19806.m45029("᩶ۙ")) * (-25);
                                i6 = ((iM45029 ^ i4) * (-18409)) ^ (-694069190);
                                i7 = -401404811;
                            } else {
                                iM45029 = (C19806.m45029("ۡۚ") + i5) * 41;
                                i6 = ((iM45029 ^ i4) * 17839) ^ (-292465004);
                                i7 = -1334737746;
                            }
                            break;
                        case 1128715646:
                        case 1352313601:
                            if (C1189.f5284 <= 0) {
                                iM45029 = C19806.m45029("ܳ᩵") ^ i5;
                                i6 = ((iM45029 ^ i4) * (-10285)) ^ 490283615;
                                i7 = -328196521;
                            } else {
                                iM45029 = (C19806.m45029("ܳۙ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i6 = ((iM45029 ^ i5) * 7835) ^ (-1338580853);
                                i7 = 774299222;
                            }
                            break;
                        default:
                            C1668.m5583();
                            iM45029 = (C19806.m45029("ܳۙ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i6 = ((iM45029 ^ i5) * 7835) ^ (-1338580853);
                            i7 = 774299222;
                            break;
                    }
                    return;
                }
            }
        });
        C19224 c19224 = (C19224) m31016(R.id.MT_Protector);
        C7935 c7935 = this.f29053;
        if (c7935 == null) {
            C13465.m32968("bottomToolbar");
            throw null;
        }
        c19224.m44152(c7935);
        final C7935 c7936 = this.f29053;
        if (c7936 == null) {
            C13465.m32968("bottomToolbar");
            throw null;
        }
        C22046 c22047 = this.f29050;
        if (c22047 == null) {
            C13465.m32968("bottomSlideLayout");
            throw null;
        }
        c7936.m20962(c22047);
        c7936.m20960();
        c7936.m20957(R.drawable.MT_Protector, R.drawable.MT_Protector).m35969(false);
        c7936.m20957(R.drawable.MT_Protector, R.drawable.MT_Protector).m35969(false);
        c7936.m20971(R.drawable.MT_Protector, 45);
        C14991 c14991M20958 = c7936.m20958(new C18583(c7936));
        c14991M20958.m35973();
        c14991M20958.m35969(false);
        c7936.m20957(R.drawable.MT_Protector, R.drawable.MT_Protector);
        c7936.setOnClickListener(new ViewOnClickListenerC8043(C22959.m50799(200), this, c7936, 0));
        c7936.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩵۠ۘ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ViewOnClickListenerC8374.m21932(c7936, this);
                return true;
            }
        });
        View viewM310112 = m31016(R.id.searchView);
        C13465.m32967(viewM310112, "view(...)");
        C1439 c1439 = (C1439) viewM310112;
        this.f29049 = c1439;
        c1439.m5030(true);
        C1439 c14310 = this.f29049;
        if (c14310 == null) {
            C13465.m32968("searchView");
            throw null;
        }
        c14310.m5029(new C13313(this));
        this.f29054 = new C14063(this, new Runnable() { // from class: l.ۡ۠ۘ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC8374.m21944(this.f30070, true, (InterfaceC4871) null, 4);
            }
        });
        this.f29061 = C7689.m20320(this, new InterfaceC8395() { // from class: l.ۤ۠ۘ
            @Override // l.InterfaceC8395
            /* JADX INFO: renamed from: ۙ */
            public final void mo1796(Intent intent2, int i) {
                ViewOnClickListenerC8374.m21935(this.f34687, i, intent2);
            }
        });
        C10535.m26672(this);
        C0674.m3030();
        if (C6696.m18082()) {
            m21928(bundle);
            return;
        }
        C17485 c17485 = new C17485(this, R.string.MT_Protector);
        c17485.m40701(500);
        new Thread(new RunnableC7337(c17485, this, bundle, 0)).start();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m21968(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        C11672 c11672 = viewOnClickListenerC8374.f29060;
        if (c11672 != null) {
            C16737.m39272((CharSequence) c11672.m28640());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m21960(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        viewOnClickListenerC8374.m21917();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21933(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        int i = viewOnClickListenerC8374.f29072;
        long j = viewOnClickListenerC8374.f29059;
        if (i == -1 || j == 0) {
            return;
        }
        if (System.currentTimeMillis() > j) {
            viewOnClickListenerC8374.f29059 = 0L;
            return;
        }
        C21423 c21423 = viewOnClickListenerC8374.f29073;
        if (c21423 == null) {
            C13465.m32968("recyclerView");
            throw null;
        }
        if (i >= c21423.m47986()) {
            C21423 c21424 = viewOnClickListenerC8374.f29073;
            if (c21424 == null) {
                C13465.m32968("recyclerView");
                throw null;
            }
            if (i <= c21424.m47990()) {
                return;
            }
        }
        C21423 c21425 = viewOnClickListenerC8374.f29073;
        if (c21425 == null) {
            C13465.m32968("recyclerView");
            throw null;
        }
        c21425.scrollToPosition(i);
        viewOnClickListenerC8374.f29072 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21947(C22959 c22959, final ViewOnClickListenerC8374 viewOnClickListenerC8374, C7935 c7935) {
        C11672 c11672;
        C11672 c11673;
        C2728 c2728 = viewOnClickListenerC8374.f29051;
        if (c22959.m50803()) {
            return;
        }
        if (viewOnClickListenerC8374.m21964() && viewOnClickListenerC8374.m21974() > 0) {
            int iM20955 = c7935.m20955();
            if (iM20955 == 0) {
                boolean z = false;
                for (InterfaceC2557 interfaceC2557 : viewOnClickListenerC8374.f29058) {
                    if (interfaceC2557.mo7985() && !interfaceC2557.isChecked()) {
                        interfaceC2557.setChecked(true);
                        z = true;
                    }
                }
                viewOnClickListenerC8374.m21985();
                if (z) {
                    c2728.m8339(false);
                    return;
                }
                return;
            }
            if (iM20955 == 1) {
                boolean z2 = false;
                for (InterfaceC2557 interfaceC2558 : viewOnClickListenerC8374.f29058) {
                    if (interfaceC2558.mo7985()) {
                        interfaceC2558.setChecked(!interfaceC2558.isChecked());
                        z2 = true;
                    }
                }
                viewOnClickListenerC8374.m21985();
                if (z2) {
                    c2728.m8339(false);
                    return;
                }
                return;
            }
            if (iM20955 == 2) {
                if (viewOnClickListenerC8374.m21964()) {
                    boolean zM21957 = viewOnClickListenerC8374.m21957();
                    viewOnClickListenerC8374.m21985();
                    if (zM21957) {
                        c2728.m8339(false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iM20955 != 3) {
                if (iM20955 != 4) {
                    return;
                }
                viewOnClickListenerC8374.m30996(R.string.MT_Protector, R.string.MT_Protector, false);
                return;
            }
            HashSet hashSet = new HashSet();
            for (InterfaceC2557 interfaceC2559 : viewOnClickListenerC8374.f29058) {
                if (interfaceC2559.mo7985() && interfaceC2559.isChecked()) {
                    String name = interfaceC2559.getName();
                    C13465.m32967(name, "getName(...)");
                    hashSet.add(C12277.m30514(name));
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            boolean z3 = false;
            for (InterfaceC2557 interfaceC25510 : viewOnClickListenerC8374.f29058) {
                if (interfaceC25510.mo7985() && !interfaceC25510.isChecked()) {
                    String name2 = interfaceC25510.getName();
                    C13465.m32967(name2, "getName(...)");
                    if (hashSet.contains(C12277.m30514(name2))) {
                        interfaceC25510.setChecked(true);
                        z3 = true;
                    }
                }
            }
            viewOnClickListenerC8374.m21985();
            if (z3) {
                c2728.m8339(false);
                return;
            }
            return;
        }
        int iM20956 = c7935.m20955();
        if (iM20956 == 0) {
            C6018 c6018 = viewOnClickListenerC8374.f29078;
            if (c6018 == null) {
                C13465.m32968("swipeRefreshLayout");
                throw null;
            }
            if (c6018.m16340() || (c11672 = viewOnClickListenerC8374.f29060) == null) {
                return;
            }
            final C4405 c4405M33190 = c11672.f38589.m33190(viewOnClickListenerC8374.m21950());
            String strM28629 = c11672.m28629();
            if (viewOnClickListenerC8374.m21964()) {
                viewOnClickListenerC8374.m21957();
                viewOnClickListenerC8374.m21985();
            }
            String str = c4405M33190.f15686;
            String str2 = c4405M33190.f15687;
            c11672.mo28628(str);
            String strM286210 = c11672.m28629();
            final String strM18175 = (strM28629.length() <= strM286210.length() || !strM286210.equals(C6730.m18172(strM28629))) ? null : C6730.m18175(strM28629);
            if (c4405M33190.f15685) {
                C1439 c1439 = viewOnClickListenerC8374.f29049;
                if (c1439 == null) {
                    C13465.m32968("searchView");
                    throw null;
                }
                c1439.m5028(str2);
                C1439 c14310 = viewOnClickListenerC8374.f29049;
                if (c14310 == null) {
                    C13465.m32968("searchView");
                    throw null;
                }
                c14310.m5034(false);
                C13465.m32967(str2, "filterText");
                viewOnClickListenerC8374.f29075 = str2;
            } else {
                C1439 c14311 = viewOnClickListenerC8374.f29049;
                if (c14311 == null) {
                    C13465.m32968("searchView");
                    throw null;
                }
                if (c14311.m5031()) {
                    viewOnClickListenerC8374.f29075 = "";
                    C1439 c14312 = viewOnClickListenerC8374.f29049;
                    if (c14312 == null) {
                        C13465.m32968("searchView");
                        throw null;
                    }
                    c14312.m5026();
                }
            }
            m21944(viewOnClickListenerC8374, true, new InterfaceC4871() { // from class: l.֨۠ۘ
                @Override // l.InterfaceC4871
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final Object mo3788() {
                    return ViewOnClickListenerC8374.m21921(this.f4629, c4405M33190, strM18175);
                }
            }, 2);
            viewOnClickListenerC8374.m21952();
            return;
        }
        if (iM20956 != 1) {
            if (iM20956 != 2) {
                if (iM20956 != 4) {
                    return;
                }
                viewOnClickListenerC8374.m21975();
                return;
            }
            View viewM30995 = viewOnClickListenerC8374.m30995(R.layout.MT_Protector);
            final C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
            final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
            c10948.m16853(new C5551(textView));
            C8067 c8067BuildDialog = viewOnClickListenerC8374.buildDialog();
            c8067BuildDialog.m21258(viewM30995);
            c8067BuildDialog.m21265(false);
            boolean z4 = viewOnClickListenerC8374.f29065 != 0;
            if (z4) {
                ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            } else {
                ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            }
            final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            C8875.m23019(dialogInterfaceC19356M21269);
            C16737.m39290(c10948);
            dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ۠ۘ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewOnClickListenerC8374.m21973(c10948, viewOnClickListenerC8374, dialogInterfaceC19356M21269, textView);
                }
            });
            if (z4) {
                dialogInterfaceC19356M21269.m44374().setOnClickListener(new View.OnClickListener() { // from class: l.᩹۠ۘ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ViewOnClickListenerC8374.m21945(c10948, viewOnClickListenerC8374, dialogInterfaceC19356M21269, textView);
                    }
                });
                return;
            }
            return;
        }
        C6018 c6019 = viewOnClickListenerC8374.f29078;
        if (c6019 == null) {
            C13465.m32968("swipeRefreshLayout");
            throw null;
        }
        if (c6019.m16340() || (c11673 = viewOnClickListenerC8374.f29060) == null) {
            return;
        }
        final C4405 c4405M33196 = c11673.f38589.m33196(viewOnClickListenerC8374.m21950());
        String strM286211 = c11673.m28629();
        if (viewOnClickListenerC8374.m21964()) {
            viewOnClickListenerC8374.m21957();
            viewOnClickListenerC8374.m21985();
        }
        String str3 = c4405M33196.f15686;
        String str4 = c4405M33196.f15687;
        c11673.mo28628(str3);
        String strM286212 = c11673.m28629();
        final String strM18176 = (strM286211.length() <= strM286212.length() || !strM286212.equals(C6730.m18172(strM286211))) ? null : C6730.m18175(strM286211);
        if (c4405M33196.f15685) {
            C1439 c14313 = viewOnClickListenerC8374.f29049;
            if (c14313 == null) {
                C13465.m32968("searchView");
                throw null;
            }
            c14313.m5028(str4);
            C1439 c14314 = viewOnClickListenerC8374.f29049;
            if (c14314 == null) {
                C13465.m32968("searchView");
                throw null;
            }
            c14314.m5034(false);
            C13465.m32967(str4, "filterText");
            viewOnClickListenerC8374.f29075 = str4;
        } else {
            C1439 c14315 = viewOnClickListenerC8374.f29049;
            if (c14315 == null) {
                C13465.m32968("searchView");
                throw null;
            }
            if (c14315.m5031()) {
                viewOnClickListenerC8374.f29075 = "";
                C1439 c14316 = viewOnClickListenerC8374.f29049;
                if (c14316 == null) {
                    C13465.m32968("searchView");
                    throw null;
                }
                c14316.m5026();
            }
        }
        m21944(viewOnClickListenerC8374, true, new InterfaceC4871() { // from class: l.ۖ۠ۘ
            @Override // l.InterfaceC4871
            /* JADX INFO: renamed from: ۙ */
            public final Object mo3788() {
                return ViewOnClickListenerC8374.m21966(this.f9620, c4405M33196, strM18176);
            }
        }, 2);
        viewOnClickListenerC8374.m21952();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21932(C7935 c7935, ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        int iM20955 = c7935.m20955();
        if (viewOnClickListenerC8374.m21964() && viewOnClickListenerC8374.m21974() > 0) {
            if (iM20955 != 3) {
                c7935.m20967(iM20955, new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector}[iM20955]);
                return;
            } else {
                new C8909(viewOnClickListenerC8374, new C18957(viewOnClickListenerC8374)).m23183();
                return;
            }
        }
        if (c7935.m20972()) {
            if (iM20955 == 0) {
                c7935.m20967(0, R.string.MT_Protector);
                return;
            }
            if (iM20955 == 1) {
                c7935.m20967(1, R.string.MT_Protector);
                return;
            }
            if (iM20955 == 2) {
                c7935.m20967(2, R.string.MT_Protector);
                return;
            }
            if (iM20955 != 3) {
                if (iM20955 != 4) {
                    return;
                }
                viewOnClickListenerC8374.m21917();
                return;
            }
            c7935.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            C1439 c1439 = viewOnClickListenerC8374.f29049;
            if (c1439 == null) {
                C13465.m32968("searchView");
                throw null;
            }
            if (!c1439.m5031()) {
                C1439 c14310 = viewOnClickListenerC8374.f29049;
                if (c14310 != null) {
                    c14310.m5028((String) null);
                } else {
                    C13465.m32968("searchView");
                    throw null;
                }
            }
            C1439 c14311 = viewOnClickListenerC8374.f29049;
            if (c14311 != null) {
                c14311.m5034(true);
            } else {
                C13465.m32968("searchView");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21935(ViewOnClickListenerC8374 viewOnClickListenerC8374, int i, Intent intent) {
        if (i != -1 || intent == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Uri data = intent.getData();
        C14063 c14063 = viewOnClickListenerC8374.f29054;
        if (c14063 != null) {
            c14063.m34021(data);
        } else {
            C13465.m32968("androidDataGranter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21946(C17485 c17485, ViewOnClickListenerC8374 viewOnClickListenerC8374, Bundle bundle) {
        c17485.m40694();
        viewOnClickListenerC8374.m21928(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [l.ۘ۠ۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m21928(Bundle bundle) {
        String stringExtra;
        String[] stringArrayExtra;
        int intExtra;
        String stringExtra2;
        C11672 c11672;
        Intent intent = getIntent();
        C13465.m32962(intent);
        if (C13465.m32965((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            this.f29065 = (C13465.m32965((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT") && intent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false)) ? 3 : 1;
            this.f29071 = "exportSelectFile";
            stringExtra2 = C11904.f39934.mo33986();
            C13465.m32967(stringExtra2, "getPath(...)");
            stringExtra = null;
            stringArrayExtra = null;
            intExtra = 0;
        } else {
            this.f29065 = intent.getIntExtra("type", 0);
            stringExtra = intent.getStringExtra("initFilename");
            stringArrayExtra = intent.getStringArrayExtra("suffixes");
            intExtra = intent.getIntExtra("customButtonTitle", 0);
            this.f29071 = intent.getStringExtra("initPathKey");
            stringExtra2 = intent.getStringExtra("initPath");
            if (stringExtra2 == null) {
                stringExtra2 = C11904.f39934.mo33986();
                C13465.m32967(stringExtra2, "getPath(...)");
            }
            if (stringExtra2.length() == 0 || !stringExtra2.startsWith("/")) {
                stringExtra2 = C11904.f39934.mo33986();
                C13465.m32967(stringExtra2, "getPath(...)");
            }
        }
        String str = this.f29071;
        if (str != null) {
            stringExtra2 = ApplicationC0716.f2992.getString(str, stringExtra2);
            C13465.m32967(stringExtra2, "getString(...)");
        }
        if (bundle == null || !bundle.containsKey("visitorData")) {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(stringExtra2, new String[0]);
            if (abstractC20745M15313.mo33975() && abstractC20745M15313.mo33971()) {
                stringExtra2 = abstractC20745M15313.m46737();
            }
            c11672 = new C11672(stringExtra2);
        } else {
            c11672 = new C11672(new C17367(bundle.getByteArray("visitorData")));
        }
        this.f29060 = c11672;
        m21952();
        if (stringExtra != null) {
            EditText editText = this.f29066;
            if (editText == null) {
                C13465.m32968("filenameEditText");
                throw null;
            }
            editText.setText(stringExtra);
        }
        if (stringArrayExtra != null) {
            for (String str2 : stringArrayExtra) {
                C13465.m32966(str2, "<this>");
                if (str2.indexOf(46, 0) >= 0) {
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    C13465.m32967(lowerCase, "toLowerCase(...)");
                    this.f29062.add(".".concat(lowerCase));
                } else {
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    C13465.m32967(lowerCase2, "toLowerCase(...)");
                    this.f29055.add(lowerCase2);
                }
            }
        }
        int i = this.f29065;
        if (i == 0) {
            m31016(R.id.button1).setVisibility(0);
            m31016(R.id.divider).setVisibility(0);
            EditText editText2 = this.f29066;
            if (editText2 == null) {
                C13465.m32968("filenameEditText");
                throw null;
            }
            editText2.setVisibility(8);
            TextView textView = (TextView) m31016(R.id.button1);
            textView.setBackgroundTintList(ColorStateList.valueOf(C20368.f65972));
            textView.setOnClickListener(this);
            if (intExtra != 0) {
                textView.setText(intExtra);
            }
        } else if (i == 1) {
            EditText editText3 = this.f29066;
            if (editText3 == null) {
                C13465.m32968("filenameEditText");
                throw null;
            }
            editText3.setVisibility(8);
            View view = this.f29064;
            if (view == null) {
                C13465.m32968("bottomSpace");
                throw null;
            }
            view.setVisibility(8);
        } else if (i == 2) {
            m31016(R.id.button2).setVisibility(0);
            m31016(R.id.textView).setVisibility(0);
            m31016(R.id.divider).setVisibility(0);
            TextView textView2 = (TextView) m31016(R.id.button2);
            textView2.setBackgroundTintList(ColorStateList.valueOf(C20368.f65972));
            textView2.setOnClickListener(this);
            if (intExtra != 0) {
                textView2.setText(intExtra);
            }
        } else if (i == 3) {
            m31016(R.id.button1).setVisibility(0);
            m31016(R.id.divider).setVisibility(0);
            EditText editText4 = this.f29066;
            if (editText4 == null) {
                C13465.m32968("filenameEditText");
                throw null;
            }
            editText4.setVisibility(8);
            TextView textView3 = (TextView) m31016(R.id.button1);
            textView3.setBackgroundTintList(ColorStateList.valueOf(C20368.f65972));
            if (intExtra == 0) {
                intExtra = R.string.MT_Protector;
            }
            this.f29074 = intExtra;
            textView3.setOnClickListener(this);
            m21985();
        }
        C2728 c2728 = this.f29051;
        c2728.getClass();
        new Thread(new RunnableC12961(1, c2728.f10499, c2728)).start();
        m21944(this, false, (InterfaceC4871) null, 2);
        this.f29076 = new C8765(this, (C3808) new InterfaceC23891() { // from class: l.ۘ۠ۘ
            @Override // l.InterfaceC23891
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo11094(String str3, C5546 c5546) {
                ViewOnClickListenerC8374.m21939(this.f14140, str3, c5546);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21939(ViewOnClickListenerC8374 viewOnClickListenerC8374, String str, C5546 c5546) {
        if (c5546 != null) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        C22046 c22046 = viewOnClickListenerC8374.f29050;
        if (c22046 == null) {
            C13465.m32968("bottomSlideLayout");
            throw null;
        }
        c22046.m48988();
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        C16737.m39267(180L, new RunnableC5240(abstractC20745M15313.mo33974(), viewOnClickListenerC8374, abstractC20745M15313));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21948(boolean z, final ViewOnClickListenerC8374 viewOnClickListenerC8374, final AbstractC20745 abstractC20745) {
        if (z) {
            String strMo33986 = abstractC20745.mo33986();
            C13465.m32967(strMo33986, "getPath(...)");
            viewOnClickListenerC8374.m21931(strMo33986, (InterfaceC4871) null);
            return;
        }
        viewOnClickListenerC8374.m21931(abstractC20745.m46737(), new InterfaceC4871() { // from class: l.᩸۠ۘ
            @Override // l.InterfaceC4871
            /* JADX INFO: renamed from: ۙ */
            public final Object mo3788() {
                return ViewOnClickListenerC8374.m21923(abstractC20745, viewOnClickListenerC8374);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7321 m21923(AbstractC20745 abstractC20745, ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        C2728 c2728 = viewOnClickListenerC8374.f29051;
        String name = abstractC20745.getName();
        C13465.m32967(name, "getName(...)");
        c2728.m8336(name);
        return C7321.f24318;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f29070) {
            this.f29070 = false;
        } else {
            m21944(this, true, (InterfaceC4871) null, 4);
        }
        C7935 c7935 = this.f29053;
        if (c7935 != null) {
            c7935.m20973();
        } else {
            C13465.m32968("bottomToolbar");
            throw null;
        }
    }

    @Override // l.AbstractActivityC12483, l.InterfaceC17421
    /* JADX INFO: renamed from: ܰ */
    public final void mo130(Intent intent) {
        C9101 c9101 = this.f29061;
        if (c9101 != null) {
            c9101.m23450(intent);
        } else {
            C13465.m32968("launcherForGrantPathPrimary");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private final void m21952() {
        C11672 c11672;
        C13579 c13579;
        C11672 c11673;
        C13579 c135710;
        C11672 c11674 = this.f29060;
        if (c11674 != null) {
            String strM28629 = c11674.m28629();
            C13465.m32967(strM28629, "getPath(...)");
            C23186.m51183(strM28629, (C5546) null);
            this.f41645.setSubtitle(c11674.m28629());
        }
        C7935 c7935 = this.f29053;
        if (c7935 == null) {
            C13465.m32968("bottomToolbar");
            throw null;
        }
        boolean z = false;
        AbstractC22752 abstractC22752M20959 = c7935.m20959(0);
        abstractC22752M20959.getClass();
        C14991 c14991 = (C14991) abstractC22752M20959;
        C6018 c6018 = this.f29078;
        if (c6018 != null) {
            c14991.m35969((c6018.m16340() || (c11673 = this.f29060) == null || (c135710 = c11673.f38589) == null || !c135710.m33193()) ? false : true);
            C7935 c7936 = this.f29053;
            if (c7936 == null) {
                C13465.m32968("bottomToolbar");
                throw null;
            }
            AbstractC22752 abstractC22752M209510 = c7936.m20959(1);
            abstractC22752M209510.getClass();
            C14991 c14992 = (C14991) abstractC22752M209510;
            C6018 c6019 = this.f29078;
            if (c6019 != null) {
                if (!c6019.m16340() && (c11672 = this.f29060) != null && (c13579 = c11672.f38589) != null && c13579.m33197()) {
                    z = true;
                }
                c14992.m35969(z);
                return;
            }
            C13465.m32968("swipeRefreshLayout");
            throw null;
        }
        C13465.m32968("swipeRefreshLayout");
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21944(ViewOnClickListenerC8374 viewOnClickListenerC8374, boolean z, InterfaceC4871 interfaceC4871, int i) {
        boolean z2 = (i & 2) == 0;
        if ((i & 4) != 0) {
            interfaceC4871 = null;
        }
        InterfaceC4871 interfaceC4872 = interfaceC4871;
        AtomicInteger atomicInteger = viewOnClickListenerC8374.f29057;
        C11672 c11672 = viewOnClickListenerC8374.f29060;
        if (c11672 == null) {
            return;
        }
        AbstractC3062 lifecycle = viewOnClickListenerC8374.getLifecycle();
        C13465.m32967(lifecycle, "<get-lifecycle>(...)");
        new C21779(z2, viewOnClickListenerC8374, c11672, (C4245) lifecycle, z2 ? atomicInteger.get() : atomicInteger.incrementAndGet(), interfaceC4872, z).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m21940(ViewOnClickListenerC8374 viewOnClickListenerC8374, List list) {
        Set setM21918;
        if (viewOnClickListenerC8374.m21964()) {
            setM21918 = viewOnClickListenerC8374.m21918();
        } else {
            setM21918 = C21826.f70878;
        }
        viewOnClickListenerC8374.f29067 = list;
        if (viewOnClickListenerC8374.m21964()) {
            for (InterfaceC2557 interfaceC2557 : viewOnClickListenerC8374.f29067) {
                if (!interfaceC2557.mo7980()) {
                    interfaceC2557.setChecked(interfaceC2557.mo7985() && setM21918.contains(interfaceC2557.getPath()));
                }
            }
        }
        if (viewOnClickListenerC8374.f29075.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC2557 interfaceC2558 = (InterfaceC2557) obj;
                if (!interfaceC2558.mo7969()) {
                    String name = interfaceC2558.getName();
                    C13465.m32967(name, "getName(...)");
                    if (C12529.m31136((CharSequence) name, (CharSequence) viewOnClickListenerC8374.f29075, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list = arrayList;
        }
        viewOnClickListenerC8374.f29058 = list;
        viewOnClickListenerC8374.m21985();
        viewOnClickListenerC8374.f29051.m8339(true);
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private final boolean m21964() {
        return this.f29065 == 3;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private final HashSet m21918() {
        HashSet hashSet = new HashSet();
        for (InterfaceC2557 interfaceC2557 : this.f29067) {
            if (interfaceC2557.mo7985() && interfaceC2557.isChecked()) {
                hashSet.add(interfaceC2557.getPath());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private final int m21974() {
        int i = 0;
        for (InterfaceC2557 interfaceC2557 : this.f29067) {
            if (interfaceC2557.mo7985() && interfaceC2557.isChecked()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private final boolean m21957() {
        boolean z = false;
        for (InterfaceC2557 interfaceC2557 : this.f29067) {
            if (!interfaceC2557.mo7980() && interfaceC2557.isChecked()) {
                interfaceC2557.setChecked(false);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m21934(ViewOnClickListenerC8374 viewOnClickListenerC8374, int i) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2557 interfaceC2557 : viewOnClickListenerC8374.f29058) {
            if (interfaceC2557.mo7985() && interfaceC2557.isChecked()) {
                arrayList.add(C8909.m23180(i, interfaceC2557.getTime()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = false;
        for (InterfaceC2557 interfaceC2558 : viewOnClickListenerC8374.f29058) {
            if (interfaceC2558.mo7985() && !interfaceC2558.isChecked()) {
                Iterator it = arrayList.iterator();
                C13465.m32967(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    C13465.m32967(next, "next(...)");
                    long[] jArr = (long[]) next;
                    if (jArr[0] <= interfaceC2558.getTime() && interfaceC2558.getTime() < jArr[1]) {
                        interfaceC2558.setChecked(true);
                        z = true;
                        break;
                    }
                }
            }
        }
        viewOnClickListenerC8374.m21949(z, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m21970(ViewOnClickListenerC8374 viewOnClickListenerC8374, long j, long j2) {
        boolean z = false;
        for (InterfaceC2557 interfaceC2557 : viewOnClickListenerC8374.f29058) {
            if (interfaceC2557.mo7985()) {
                boolean z2 = j <= interfaceC2557.getTime() && interfaceC2557.getTime() < j2;
                if (interfaceC2557.isChecked() != z2) {
                    interfaceC2557.setChecked(z2);
                    z = true;
                }
            }
        }
        viewOnClickListenerC8374.m21949(z, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m21937(ViewOnClickListenerC8374 viewOnClickListenerC8374, long j, long j2) {
        boolean z = false;
        for (InterfaceC2557 interfaceC2557 : viewOnClickListenerC8374.f29058) {
            if (interfaceC2557.mo7985()) {
                boolean z2 = interfaceC2557.mo7982() && j <= interfaceC2557.getSize() && interfaceC2557.getSize() < j2;
                if (interfaceC2557.isChecked() != z2) {
                    interfaceC2557.setChecked(z2);
                    z = true;
                }
            }
        }
        viewOnClickListenerC8374.m21949(z, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m21942(ViewOnClickListenerC8374 viewOnClickListenerC8374, C18251 c18251) {
        boolean z = false;
        for (InterfaceC2557 interfaceC2557 : viewOnClickListenerC8374.f29058) {
            if (interfaceC2557.mo7985()) {
                String name = interfaceC2557.getName();
                C13465.m32967(name, "getName(...)");
                boolean zBooleanValue = ((Boolean) c18251.invoke(name)).booleanValue();
                if (interfaceC2557.isChecked() != zBooleanValue) {
                    interfaceC2557.setChecked(zBooleanValue);
                    z = true;
                }
            }
        }
        viewOnClickListenerC8374.m21949(z, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m21949(boolean z, boolean z2) {
        m21985();
        if (z) {
            this.f29051.m8339(false);
        }
        if (z2 && m21974() == 0) {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m21985() {
        if (m21964()) {
            int iM21974 = m21974();
            TextView textView = (TextView) m31016(R.id.button1);
            textView.setText(getString(this.f29074) + MotionUtils.EASING_TYPE_FORMAT_START + iM21974 + MotionUtils.EASING_TYPE_FORMAT_END);
            textView.setEnabled(iM21974 > 0);
            if (iM21974 > 0) {
                C7935 c7935 = this.f29053;
                if (c7935 != null) {
                    c7935.m20965();
                    return;
                } else {
                    C13465.m32968("bottomToolbar");
                    throw null;
                }
            }
            C7935 c7936 = this.f29053;
            if (c7936 != null) {
                c7936.m20956();
            } else {
                C13465.m32968("bottomToolbar");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m21941(ViewOnClickListenerC8374 viewOnClickListenerC8374, ViewOnClickListenerC10866 viewOnClickListenerC10866) {
        viewOnClickListenerC10866.m27222().setBackgroundColor(viewOnClickListenerC8374.m21964() && viewOnClickListenerC10866.m27224().mo7985() && viewOnClickListenerC10866.m27224().isChecked() ? C20368.f65992 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21914() {
        final C11672 c11672;
        C6018 c6018 = this.f29078;
        if (c6018 == null) {
            C13465.m32968("swipeRefreshLayout");
            throw null;
        }
        if (c6018.m16340() || (c11672 = this.f29060) == null) {
            return;
        }
        String strM28629 = c11672.m28629();
        final String strM18175 = C6730.m18175(strM28629);
        final String strM18172 = C6730.m18172(strM28629);
        if (strM18172 == null) {
            if (this.f29056.m50802()) {
                C15829.m37611(R.string.MT_Protector);
                return;
            } else {
                C15829.m37616();
                finish();
                return;
            }
        }
        m21931(strM18172, new InterfaceC4871() { // from class: l.۬۠ۘ
            @Override // l.InterfaceC4871
            /* JADX INFO: renamed from: ۙ */
            public final Object mo3788() {
                return ViewOnClickListenerC8374.m21922(c11672, strM18172, this, strM18175);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7321 m21922(C11672 c11672, String str, ViewOnClickListenerC8374 viewOnClickListenerC8374, String str2) {
        viewOnClickListenerC8374.f29051.m8335((Integer) c11672.f38589.f44775.getOrDefault(str, null), str2);
        return C7321.f24318;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21975() {
        if (m21964() && !m21918().isEmpty()) {
            if (m21964()) {
                boolean zM21957 = m21957();
                m21985();
                if (zM21957) {
                    this.f29051.m8339(false);
                    return;
                }
                return;
            }
            return;
        }
        C1439 c1439 = this.f29049;
        if (c1439 == null) {
            C13465.m32968("searchView");
            throw null;
        }
        if (c1439.m5031()) {
            C1439 c14310 = this.f29049;
            if (c14310 != null) {
                c14310.m5033();
                return;
            } else {
                C13465.m32968("searchView");
                throw null;
            }
        }
        m21914();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7321 m21921(ViewOnClickListenerC8374 viewOnClickListenerC8374, C4405 c4405, String str) {
        viewOnClickListenerC8374.f29051.m8335(Integer.valueOf(c4405.f15684), str);
        return C7321.f24318;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7321 m21966(ViewOnClickListenerC8374 viewOnClickListenerC8374, C4405 c4405, String str) {
        viewOnClickListenerC8374.f29051.m8335(Integer.valueOf(c4405.f15684), str);
        return C7321.f24318;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m21930(TextView textView, int i) {
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m21973(C10948 c10948, final ViewOnClickListenerC8374 viewOnClickListenerC8374, DialogInterfaceC19356 dialogInterfaceC19356, TextView textView) {
        String string = c10948.m17000().toString();
        if (C12529.m31136((CharSequence) string, (CharSequence) "\\", false) || C12529.m31136((CharSequence) string, (CharSequence) "/", false)) {
            m21930(textView, R.string.MT_Protector);
            return;
        }
        C11672 c11672 = viewOnClickListenerC8374.f29060;
        C13465.m32962(c11672);
        final AbstractC20745 abstractC20745M15313 = C5553.m15313(c11672.m28629(), string);
        if (abstractC20745M15313.mo33975()) {
            if (abstractC20745M15313.mo33974()) {
                m21930(textView, R.string.MT_Protector);
                return;
            } else {
                m21930(textView, R.string.MT_Protector);
                return;
            }
        }
        try {
            C11672 c11673 = viewOnClickListenerC8374.f29060;
            C13465.m32962(c11673);
            C2462.m7541(c11673.mo28637(), EnumC11636.MODIFY_DIRECTORY_LINKED);
            try {
                abstractC20745M15313.m46739();
                m21944(viewOnClickListenerC8374, false, new InterfaceC4871() { // from class: l.ܶ۠ۘ
                    @Override // l.InterfaceC4871
                    /* JADX INFO: renamed from: ۙ */
                    public final Object mo3788() {
                        return ViewOnClickListenerC8374.m21915(abstractC20745M15313, viewOnClickListenerC8374);
                    }
                }, 2);
                dialogInterfaceC19356.dismiss();
            } catch (Exception e) {
                e = e;
                viewOnClickListenerC8374.m31002(e, (DialogInterface.OnDismissListener) null);
            }
        } catch (C4987 e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C7321 m21915(AbstractC20745 abstractC20745, ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        C2728 c2728 = viewOnClickListenerC8374.f29051;
        String name = abstractC20745.getName();
        C13465.m32967(name, "getName(...)");
        c2728.m8336(name);
        return C7321.f24318;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21945(C10948 c10948, final ViewOnClickListenerC8374 viewOnClickListenerC8374, DialogInterfaceC19356 dialogInterfaceC19356, TextView textView) {
        String string = c10948.m17000().toString();
        if (C12529.m31136((CharSequence) string, (CharSequence) "\\", false) || C12529.m31136((CharSequence) string, (CharSequence) "/", false)) {
            m21930(textView, R.string.MT_Protector);
            return;
        }
        C11672 c11672 = viewOnClickListenerC8374.f29060;
        C13465.m32962(c11672);
        final AbstractC20745 abstractC20745M15313 = C5553.m15313(c11672.m28629(), string);
        if (abstractC20745M15313.mo33975()) {
            if (abstractC20745M15313.mo33974()) {
                m21930(textView, R.string.MT_Protector);
                return;
            } else {
                m21930(textView, R.string.MT_Protector);
                return;
            }
        }
        try {
            C11672 c11673 = viewOnClickListenerC8374.f29060;
            C13465.m32962(c11673);
            C2462.m7541(c11673.mo28637(), EnumC11636.MODIFY_DIRECTORY_LINKED);
            try {
                if (abstractC20745M15313.mo33978()) {
                    m21944(viewOnClickListenerC8374, false, new InterfaceC4871() { // from class: l.᩺۠ۘ
                        @Override // l.InterfaceC4871
                        /* JADX INFO: renamed from: ۙ */
                        public final Object mo3788() {
                            return ViewOnClickListenerC8374.m21967(abstractC20745M15313, viewOnClickListenerC8374);
                        }
                    }, 2);
                    dialogInterfaceC19356.dismiss();
                    return;
                }
                throw new Exception("Failed to create file: ".concat(string));
            } catch (Exception e) {
                e = e;
                viewOnClickListenerC8374.m31002(e, (DialogInterface.OnDismissListener) null);
            }
        } catch (C4987 e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7321 m21967(AbstractC20745 abstractC20745, ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        C2728 c2728 = viewOnClickListenerC8374.f29051;
        String name = abstractC20745.getName();
        C13465.m32967(name, "getName(...)");
        c2728.m8336(name);
        return C7321.f24318;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private final C4405 m21950() {
        C11672 c11672 = this.f29060;
        C13465.m32962(c11672);
        String strM28629 = c11672.m28629();
        int iM8333 = this.f29051.m8333();
        C1439 c1439 = this.f29049;
        if (c1439 != null) {
            return new C4405(strM28629, iM8333, this.f29075, c1439.m5031());
        }
        C13465.m32968("searchView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21931(String str, InterfaceC4871 interfaceC4871) {
        C11672 c11672 = this.f29060;
        C13465.m32962(c11672);
        c11672.f38589.m33195(m21950());
        if (m21964()) {
            m21957();
            m21985();
        }
        final C0763 c0763 = new C0763();
        if (!C12529.m31139(str, "/", false) && c11672.mo13041(str)) {
            c0763.f3078 = C6730.m18175(str);
            str = C6730.m18172(str);
            C13465.m32967(str, "getParent(...)");
        }
        c11672.mo28628(str);
        C1439 c1439 = this.f29049;
        if (c1439 == null) {
            C13465.m32968("searchView");
            throw null;
        }
        if (c1439.m5031()) {
            this.f29075 = "";
            C1439 c14310 = this.f29049;
            if (c14310 == null) {
                C13465.m32968("searchView");
                throw null;
            }
            c14310.m5026();
        }
        if (interfaceC4871 == null) {
            interfaceC4871 = new InterfaceC4871() { // from class: l.ۨ۠ۘ
                @Override // l.InterfaceC4871
                /* JADX INFO: renamed from: ۙ */
                public final Object mo3788() {
                    return ViewOnClickListenerC8374.m21920(c0763, this);
                }
            };
        }
        m21944(this, true, interfaceC4871, 2);
        m21952();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7321 m21920(C0763 c0763, ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        C2728 c2728 = viewOnClickListenerC8374.f29051;
        Object obj = c0763.f3078;
        if (obj == null) {
            c2728.m8334(0);
        } else {
            c2728.m8336((String) obj);
        }
        return C7321.f24318;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private final void m21917() {
        C11672 c11672 = this.f29060;
        if (c11672 == null) {
            return;
        }
        Object systemService = C16737.m39277().getSystemService("clipboard");
        C13465.m32963(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        C22485 c22485 = new C22485(this);
        c22485.m40376(R.string.MT_Protector);
        c22485.m40346((CharSequence) C13012.m32189(2000, c11672.m28640()));
        c22485.m40355();
        c22485.m40336(2);
        c22485.m40368(true);
        c22485.m40338().setOnClickListener(new ViewOnClickListenerC0217(1, (ClipboardManager) systemService, c22485));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intentPutStringArrayListExtra;
        String strM50154;
        C11672 c11672 = this.f29060;
        if (c11672 == null) {
            return;
        }
        int i = this.f29065;
        if (i == 0) {
            String strM28629 = c11672.m28629();
            C13465.m32967(strM28629, "getPath(...)");
            m21959(strM28629);
            return;
        }
        int i2 = 0;
        int i3 = 3;
        ClipData clipDataNewRawUri = null;
        if (i == 2) {
            String strM286210 = c11672.m28629();
            EditText editText = this.f29066;
            if (editText == null) {
                C13465.m32968("filenameEditText");
                throw null;
            }
            AbstractC20745 abstractC20745M15313 = C5553.m15313(strM286210, editText.getText().toString());
            if (abstractC20745M15313.mo33975()) {
                C8067 c8067BuildDialog = buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21261(getString(R.string.MT_Protector, abstractC20745M15313.getName()));
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC14537(i3, abstractC20745M15313, this));
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269();
                return;
            }
            String strMo33986 = abstractC20745M15313.mo33986();
            C13465.m32967(strMo33986, "getPath(...)");
            C23186.m51183(strMo33986, (C5546) null);
            String strMo33987 = abstractC20745M15313.mo33986();
            C13465.m32967(strMo33987, "getPath(...)");
            m21959(strMo33987);
            return;
        }
        if (i == 3) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (InterfaceC2557 interfaceC2557 : this.f29067) {
                if (interfaceC2557.mo7985() && interfaceC2557.isChecked()) {
                    arrayList.add(interfaceC2557.getPath());
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            String str = this.f29071;
            if (str != null) {
                C11672 c11673 = this.f29060;
                if (c11673 == null || (strM50154 = c11673.m28629()) == null) {
                    strM50154 = C22627.m50154(arrayList.get(0));
                }
                ApplicationC0716.f2992.edit().putString(str, strM50154).apply();
            }
            Intent intent = getIntent();
            C13465.m32967(intent, "getIntent(...)");
            if (!C13465.m32965((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
                intentPutStringArrayListExtra = new Intent().putStringArrayListExtra("paths", arrayList);
                C13465.m32967(intentPutStringArrayListExtra, "putStringArrayListExtra(...)");
            } else {
                intentPutStringArrayListExtra = new Intent();
                if (arrayList.size() == 1) {
                    intentPutStringArrayListExtra.setData(C14396.m34656(arrayList.get(0)));
                } else {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i4 = i2 + 1;
                        Uri uriM34656 = C14396.m34656(it.next());
                        if (i2 == 0) {
                            clipDataNewRawUri = ClipData.newRawUri("paths", uriM34656);
                        } else if (clipDataNewRawUri != null) {
                            clipDataNewRawUri.addItem(new ClipData.Item(uriM34656));
                        }
                        i2 = i4;
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m21963(AbstractC20745 abstractC20745, ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        String strMo33986 = abstractC20745.mo33986();
        C13465.m32967(strMo33986, "getPath(...)");
        C23186.m51183(strMo33986, (C5546) null);
        String strMo33987 = abstractC20745.mo33986();
        C13465.m32967(strMo33987, "getPath(...)");
        viewOnClickListenerC8374.m21959(strMo33987);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21959(String str) {
        String str2 = this.f29071;
        if (str2 != null) {
            ApplicationC0716.f2992.edit().putString(str2, C22627.m50154(str)).apply();
        }
        Intent intent = new Intent();
        Intent intent2 = getIntent();
        C13465.m32967(intent2, "getIntent(...)");
        if (C13465.m32965((Object) intent2.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            intent.setData(C14396.m34656(str));
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
    public static final C23566 m21925(AbstractC7874 abstractC7874, String str, InterfaceC1692 interfaceC1692) {
        C13465.m32966(abstractC7874, "registry");
        C13465.m32966(str, "key");
        return new C23566(C7689.m20321(abstractC7874, str, new C17503(interfaceC1692)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C23566 m21926(AbstractActivityC12483 abstractActivityC12483, final InterfaceC1692 interfaceC1692) {
        return new C23566(C7689.m20320(abstractActivityC12483, new InterfaceC8395() { // from class: l.ܽ۠ۘ
            @Override // l.InterfaceC8395
            /* JADX INFO: renamed from: ۙ */
            public final void mo1796(Intent intent, int i) {
                String stringExtra;
                InterfaceC1692 interfaceC1693 = interfaceC1692;
                if (i == 0) {
                    interfaceC1693.onCanceled();
                } else {
                    if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                        return;
                    }
                    interfaceC1693.mo3908(stringExtra);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C23566 m21927(ComponentCallbacksC22654 componentCallbacksC22654, final InterfaceC1692 interfaceC1692) {
        return new C23566(C7689.m20322(componentCallbacksC22654, new InterfaceC8395() { // from class: l.֡۠ۘ
            @Override // l.InterfaceC8395
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo1796(Intent intent, int i) {
                String stringExtra;
                InterfaceC1692 interfaceC1693 = interfaceC1692;
                if (i == 0) {
                    interfaceC1693.onCanceled();
                } else {
                    if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                        return;
                    }
                    interfaceC1693.mo3908(stringExtra);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C17215 m21924(ComponentCallbacksC22654 componentCallbacksC22654, final InterfaceC14394 interfaceC14394) {
        return new C17215(C7689.m20322(componentCallbacksC22654, new InterfaceC8395() { // from class: l.ܺ۠ۘ
            @Override // l.InterfaceC8395
            /* JADX INFO: renamed from: ۙ */
            public final void mo1796(Intent intent, int i) {
                String stringExtra;
                InterfaceC14394 interfaceC14395 = interfaceC14394;
                if (i == 0) {
                    interfaceC14395.onCanceled();
                    return;
                }
                if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("extra");
                C13465.m32962(bundleExtra);
                interfaceC14395.onGetPath(bundleExtra, stringExtra);
            }
        }));
    }
}
