package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC22957 extends AbstractActivityC17204 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f74567;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C7382 f74569;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public ListView f74570;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C3347 f74571;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC23597[] f74572;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public MenuItem f74573;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C5349 f74574;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f74566 = Pattern.compile("\\s");

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f74568 = Pattern.compile("\\s|\\(|\\)");

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "DexEditor";
    }

    public ActivityC22957() {
        AbstractC23597 abstractC23597 = C20613.f66106;
        this.f74572 = new AbstractC23597[]{abstractC23597, C20613.f66073, abstractC23597, C20613.f66098, C20613.f66082, C20613.f66086};
        m40394();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f74569 = (C7382) new C16196(this).m38422(C7382.class);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C20807 c20807 = new C20807(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c20807);
        m40415();
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        this.f56046 = (C16390) m40418(R.id.MT_Protector);
        ListView listView = (ListView) m40418(android.R.id.list);
        this.f74570 = listView;
        listView.setFastScrollEnabled(true);
        this.f74570.setOnItemClickListener(this);
        this.f74570.setOnItemLongClickListener(this);
        m40407(this.f56046);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC2162(0, this));
        this.f74571 = C12296.m30693(this, new C10350(1, this));
        C7382 c7382 = this.f74569;
        if (!c7382.f24302) {
            f74567 = false;
            c7382.f24306 = ApplicationC17729.f58258.getBoolean("flatten_package", true);
            if (C14584.m35199(this)) {
                return;
            }
            new C6637(this).m8197();
            return;
        }
        ListView listView2 = this.f74570;
        C5349 c5349 = new C5349(new C1416(this));
        this.f74574 = c5349;
        listView2.setAdapter((ListAdapter) c5349);
        this.f74570.setOnScrollListener(new C24537(this));
        this.f74574.m45065(this.f74570);
        this.f74574.m36199(true);
        this.f74574.m36200();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51760(ActivityC22957 activityC22957, int i, Intent intent) {
        if (i == 1) {
            activityC22957.f74569.f24312 = intent.getByteArrayExtra(e.m);
        } else if (i == 2) {
            activityC22957.f74569.f24312 = null;
            activityC22957.m51770();
        } else {
            activityC22957.f74569.f24312 = null;
        }
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        m51779(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m51779(boolean z) {
        int i = 0;
        if (f74567) {
            int i2 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳ᩶ۤ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    boolean z2 = ActivityC22957.f74567;
                    new C14839(this.f50689, true).m8197();
                }
            });
            c2361.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13348(i, this));
            c2361.m8016();
            return;
        }
        if (z) {
            int i3 = DialogInterfaceC8327.f27315;
            C2361 c2362 = new C2361(this);
            c2362.m8021(R.string.MT_Protector);
            c2362.m8000(R.string.MT_Protector);
            c2362.m8026(R.string.MT_Protector, null);
            c2362.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5891(i, this));
            c2362.m8016();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        C17359.requireNonNull(subMenu);
        final MenuItem menuItemFindItem = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem3 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem4 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem5 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem6 = subMenu.findItem(R.id.MT_Protector);
        MenuItem menuItemFindItem7 = subMenu.findItem(R.id.MT_Protector);
        this.f74573 = menuItemFindItem7;
        menuItemFindItem7.setChecked(this.f74569.f24306);
        this.f74569.f24322.m40350(this, new InterfaceC16438() { // from class: l.᩸᩶ۤ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                ActivityC22957.m51761(this.f74790, menuItemFindItem5, menuItemFindItem6, menuItemFindItem4, menuItemFindItem, menuItemFindItem2, menuItemFindItem3, (EnumC11022) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51761(ActivityC22957 activityC22957, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, MenuItem menuItem4, MenuItem menuItem5, MenuItem menuItem6, EnumC11022 enumC11022) {
        EnumC11022 enumC11023 = EnumC11022.STRING_POOL;
        menuItem.setVisible(enumC11022 == enumC11023);
        menuItem2.setVisible(enumC11022 == enumC11023);
        menuItem3.setVisible(enumC11022 == EnumC11022.FIELD_LIST || enumC11022 == EnumC11022.METHOD_LIST);
        activityC22957.f74573.setVisible(enumC11022 == EnumC11022.CLASS_LIST);
        switch (C3653.f12496[enumC11022.ordinal()]) {
            case 1:
            case 2:
                menuItem4.setVisible(true);
                menuItem5.setVisible(true);
                menuItem6.setVisible(true);
                break;
            case 3:
                boolean z = ((C16989) activityC22957.f74569.f24321.peek()).f55522.size() > 0;
                menuItem4.setVisible(z);
                menuItem5.setVisible(z);
                menuItem6.setVisible(z);
                break;
            case 4:
            case 5:
                menuItem4.setVisible(true);
                menuItem5.setVisible(false);
                menuItem6.setVisible(true);
                break;
            case 6:
                boolean z2 = ((C16989) activityC22957.f74569.f24318.peek()).f55522.size() > 0;
                menuItem4.setVisible(z2);
                menuItem5.setVisible(false);
                menuItem6.setVisible(z2);
                break;
            case 7:
            case 8:
                menuItem4.setVisible(false);
                menuItem5.setVisible(false);
                menuItem6.setVisible(false);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            new C14839(this, false).m8197();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m51779(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C21553(this, this, this.f74569.f24304).m55055();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C18569(this, this);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            EnumC11022 enumC11022M20286 = this.f74569.m20286();
            if (enumC11022M20286 == EnumC11022.FIELD_LIST) {
                C8873 c8873 = new C8873(this);
                if (c8873.f28985) {
                    c8873.f28985 = false;
                    c8873.m25509(0).m53899(new C9618(c8873));
                    c8873.m25509(2).m53899(new C2907(c8873));
                }
                c8873.f28987 = -1;
                c8873.f28986 = true;
                c8873.m25509(0).mo52335((CharSequence) "public");
                c8873.m25509(1).mo52335((CharSequence) "newField");
                c8873.m25509(2).mo52335((CharSequence) "I");
                c8873.m25509(3).mo52335((CharSequence) null);
                c8873.m25517();
                c8873.m25515().setText(R.string.MT_Protector);
                return true;
            }
            if (enumC11022M20286 == EnumC11022.METHOD_LIST) {
                new C14093(this).m34254();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            int i = C3653.f12496[this.f74569.m20286().ordinal()];
            if (i == 1 || i == 2) {
                new C19315(this, this, false).m29544(false);
                return true;
            }
            if (i == 3) {
                new C19315(this, this, true).m29544(true);
                return true;
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                switch (C3653.f12496[this.f74569.m20286().ordinal()]) {
                    case 1:
                    case 2:
                        new C25283(this, this, false).m32810(false);
                        return true;
                    case 3:
                        new C25283(this, this, true).m32810(true);
                        return true;
                    case 4:
                    case 5:
                        new C17077(this, this, false).m32810(false);
                        return true;
                    case 6:
                        new C17077(this, this, true).m32810(true);
                        return true;
                }
            }
            if (itemId != R.id.MT_Protector) {
                if (itemId != R.id.MT_Protector) {
                    return false;
                }
                C7382 c7382 = this.f74569;
                c7382.f24306 = !c7382.f24306;
                ApplicationC17729.f58258.edit().putBoolean("flatten_package", this.f74569.f24306).apply();
                this.f74573.setChecked(this.f74569.f24306);
                C7382 c7383 = this.f74569;
                c7383.f24310.m15303(c7383.f24316.keySet());
                C7382 c7384 = this.f74569;
                c7384.f24305 = c7384.f24310.f17636;
                this.f74574.notifyDataSetChanged();
                setTitle("/");
                return true;
            }
            switch (C3653.f12496[this.f74569.m20286().ordinal()]) {
                case 1:
                case 2:
                    new C0670(this, this, false).m976(false);
                    break;
                case 3:
                    new C0670(this, this, true).m976(true);
                    return true;
                case 4:
                case 5:
                    new C8128(this, this, false).m976(false);
                    return true;
                case 6:
                    new C8128(this, this, true).m976(true);
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public void m51780() {
        switch (C3653.f12496[this.f74569.m20286().ordinal()]) {
            case 1:
                m51779(true);
                break;
            case 2:
                C7382 c7382 = this.f74569;
                C22211 c22211 = c7382.f24305;
                if (c22211.f71548 == null) {
                    m51757(EnumC11022.MAIN);
                    m40418(R.string.MT_Protector);
                } else {
                    c7382.f24309.put(c22211.f71549, Integer.valueOf(this.f74570.getFirstVisiblePosition()));
                    C7382 c7383 = this.f74569;
                    c7383.f24305 = c7383.f24305.f71548;
                    setTitle("/" + this.f74569.f24305.f71549);
                    m51757(EnumC11022.CLASS_LIST);
                }
                break;
            case 3:
                this.f74569.f24321.pop();
                if (this.f74569.f24321.isEmpty()) {
                    C7382 c7384 = this.f74569;
                    EnumC11022 enumC11022 = c7384.f24314;
                    EnumC11022 enumC11023 = EnumC11022.MAIN;
                    if (enumC11022 == enumC11023 || c7384.f24305 == null) {
                        m51757(enumC11023);
                        m40418(R.string.MT_Protector);
                    } else {
                        m51757(EnumC11022.CLASS_LIST);
                        setTitle("/" + this.f74569.f24305.f71549);
                    }
                } else {
                    setTitle(((C16989) this.f74569.f24321.peek()).f55523);
                    this.f74574.m36199(true);
                    this.f74574.m36200();
                    this.f74574.notifyDataSetChanged();
                    this.f74570.setSelection(((C16989) this.f74569.f24321.peek()).f55524);
                }
                break;
            case 4:
                if (this.f74569.f24321.isEmpty()) {
                    setTitle("/" + this.f74569.f24305.f71549);
                    m51757(EnumC11022.CLASS_LIST);
                } else {
                    setTitle(((C16989) this.f74569.f24321.peek()).f55523);
                    m51757(EnumC11022.SEARCH_RESULT_CLASS);
                    this.f74570.setSelection(((C16989) this.f74569.f24321.peek()).f55524);
                }
                break;
            case 5:
            case 8:
                setTitle(this.f74569.f24298);
                m51757(EnumC11022.CLASS_INFO);
                break;
            case 6:
                this.f74569.f24318.pop();
                if (this.f74569.f24318.isEmpty()) {
                    EnumC11022 enumC11024 = this.f74569.f24315;
                    EnumC11022 enumC11025 = EnumC11022.METHOD_LIST;
                    if (enumC11024 == enumC11025) {
                        m51757(enumC11025);
                        m40418(R.string.MT_Protector);
                    } else {
                        m51757(EnumC11022.CLASS_INFO);
                        setTitle(this.f74569.f24298);
                    }
                } else {
                    setTitle(((C16989) this.f74569.f24318.peek()).f55523);
                    this.f74574.m36199(true);
                    this.f74574.m36200();
                    this.f74574.notifyDataSetChanged();
                    this.f74570.setSelection(((C16989) this.f74569.f24318.peek()).f55524);
                }
                break;
            case 7:
                C7382 c7385 = this.f74569;
                if (c7385.f24304) {
                    c7385.f24304 = false;
                    m40418(R.string.MT_Protector);
                    this.f74574.notifyDataSetChanged();
                } else {
                    c7385.f24309.put("//", Integer.valueOf(this.f74570.getFirstVisiblePosition()));
                    m51757(EnumC11022.MAIN);
                    m40418(R.string.MT_Protector);
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        try {
            switch (C3653.f12496[this.f74569.m20286().ordinal()]) {
                case 1:
                    if (i == 0) {
                        C7382 c7382 = this.f74569;
                        c7382.f24305 = c7382.f24310.f17636;
                        setTitle("/" + this.f74569.f24305.f71549);
                        m51757(EnumC11022.CLASS_LIST);
                    } else if (i == 1) {
                        m40418(R.string.MT_Protector);
                        m51757(EnumC11022.STRING_POOL);
                        Integer num = (Integer) this.f74569.f24309.get("//");
                        if (num == null) {
                            this.f74570.setSelection(0);
                        } else {
                            this.f74570.setSelection(num.intValue());
                        }
                    }
                    break;
                case 2:
                    if (i < this.f74569.f24305.f71550.size()) {
                        C7382 c7383 = this.f74569;
                        c7383.f24309.put(c7383.f24305.f71549, Integer.valueOf(this.f74570.getFirstVisiblePosition()));
                        C7382 c7384 = this.f74569;
                        c7384.f24305 = (C22211) c7384.f24305.f71550.get(i);
                        setTitle("/" + this.f74569.f24305.f71549);
                        m51757(EnumC11022.CLASS_LIST);
                    } else {
                        C7382 c7385 = this.f74569;
                        c7385.f24309.put(c7385.f24305.f71549, Integer.valueOf(this.f74570.getFirstVisiblePosition()));
                        int size = i - this.f74569.f24305.f71550.size();
                        C7382 c7386 = this.f74569;
                        c7386.f24298 = (String) c7386.f24305.f71553.get(size);
                        C7382 c7387 = this.f74569;
                        c7387.f24312 = null;
                        c7387.f24319 = (C4072) c7387.f24316.get(this.f74569.f24305.f71549 + this.f74569.f24298);
                        setTitle(this.f74569.f24298);
                        m51757(EnumC11022.CLASS_INFO);
                    }
                    break;
                case 3:
                    ((C16989) this.f74569.f24321.peek()).f55524 = this.f74570.getFirstVisiblePosition();
                    C7382 c7388 = this.f74569;
                    c7388.f24319 = (C4072) ((C16989) c7388.f24321.peek()).f55522.get(i);
                    String strM46860 = this.f74569.f24319.m13151().m46860();
                    int iLastIndexOf = strM46860.lastIndexOf(47);
                    if (iLastIndexOf == -1) {
                        C7382 c7389 = this.f74569;
                        String strSubstring = strM46860.substring(0, strM46860.length() - 1);
                        c7389.f24298 = strSubstring;
                        setTitle(strSubstring);
                    } else {
                        C7382 c73810 = this.f74569;
                        String strSubstring2 = strM46860.substring(iLastIndexOf + 1, strM46860.length() - 1);
                        c73810.f24298 = strSubstring2;
                        setTitle(strSubstring2);
                    }
                    this.f74569.f24312 = null;
                    m51757(EnumC11022.CLASS_INFO);
                    break;
                case 4:
                    if (i == 0) {
                        new C10364(this).m26664();
                    } else if (i == 1) {
                        m51782();
                        m40418(R.string.MT_Protector);
                        m51757(EnumC11022.FIELD_LIST);
                    } else if (i == 2) {
                        m51776();
                        m40418(R.string.MT_Protector);
                        m51757(EnumC11022.METHOD_LIST);
                    } else if (i == 3) {
                        m51770();
                    }
                    break;
                case 5:
                    z = i < this.f74569.f24311.size();
                    if (!z) {
                        i -= this.f74569.f24311.size();
                    }
                    C12275 c12275 = (C12275) (z ? this.f74569.f24311 : this.f74569.f24320).get(i);
                    if (c12275.f39464 == null) {
                        new C14093(this).m34253(i, c12275);
                    } else {
                        ActivityC0167.f1202 = c12275;
                        startActivity(new Intent(this, (Class<?>) ActivityC0167.class));
                    }
                    break;
                case 6:
                    ((C16989) this.f74569.f24318.peek()).f55524 = this.f74570.getFirstVisiblePosition();
                    C12275 c12276 = (C12275) ((C16989) this.f74569.f24318.peek()).f55522.get(i);
                    if (c12276.f39464 == null) {
                        C22673.m51152(R.string.MT_Protector);
                    } else {
                        ActivityC0167.f1202 = c12276;
                        startActivity(new Intent(this, (Class<?>) ActivityC0167.class));
                    }
                    break;
                case 7:
                    C17823 c17823 = new C17823(this, this);
                    c17823.m22961();
                    c17823.m22945(R.string.MT_Protector);
                    C7382 c73811 = this.f74569;
                    C3282[] c3282Arr = c73811.f24303;
                    if (c73811.f24304) {
                        i = c73811.f24307[i];
                    }
                    c73811.f24300 = i;
                    c17823.m22924((CharSequence) c3282Arr[i].m10827());
                    c17823.m22955(true);
                    break;
                case 8:
                    z = i < this.f74569.f24313.size();
                    if (!z) {
                        i -= this.f74569.f24313.size();
                    }
                    new C8873(this).m23751(i, (C20480) (z ? this.f74569.f24313 : this.f74569.f24308).get(i));
                    break;
            }
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private void m51770() {
        byte[] bArr = this.f74569.f24312;
        if (bArr == null) {
            new C16331(this).m8197();
            return;
        }
        C3347 c3347 = this.f74571;
        String strM23910 = C8947.m23910(new StringBuilder(), this.f74569.f24298, ".java");
        C23391.m52569(ActivityC22957.class, bArr, "textViewer_data");
        Intent intent = new Intent(C21576.m49084(), (Class<?>) ActivityC4300.class);
        intent.putExtra(e.s, 1);
        intent.putExtra("title", strM23910);
        intent.putExtra("saveStateOnResult", true);
        c3347.m10999(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public void m51776() {
        C6310 c6310M13154;
        this.f74569.f24320.clear();
        this.f74569.f24311.clear();
        C4072 c4072 = this.f74569.f24319;
        if (c4072 == null || (c6310M13154 = c4072.m13154()) == null) {
            return;
        }
        Collections.addAll(this.f74569.f24311, c6310M13154.m18016());
        Collections.addAll(this.f74569.f24320, c6310M13154.m18012());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public void m51782() {
        this.f74569.f24308.clear();
        this.f74569.f24313.clear();
        C6310 c6310M13154 = this.f74569.f24319.m13154();
        if (c6310M13154 != null) {
            Collections.addAll(this.f74569.f24313, c6310M13154.m18002());
            Collections.addAll(this.f74569.f24308, c6310M13154.m18010());
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        final String str;
        final int[] iArr;
        int i2 = C3653.f12496[this.f74569.m20286().ordinal()];
        if (i2 == 2) {
            final boolean z = i < this.f74569.f24305.f71550.size();
            if (z) {
                iArr = new int[]{R.string.MT_Protector, R.string.MT_Protector};
                str = ((C22211) this.f74569.f24305.f71550.get(i)).f71551;
            } else {
                int[] iArr2 = {R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
                str = (String) this.f74569.f24305.f71553.get(i - this.f74569.f24305.f71550.size());
                iArr = iArr2;
            }
            String[] strArr = new String[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                strArr[i3] = getString(iArr[i3]);
            }
            int i4 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8014(strArr, new DialogInterface.OnClickListener() { // from class: l.ᩴ᩶ۤ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    ActivityC22957.m51767(this.f64466, iArr, str, z, i5);
                }
            });
            c2361.m8016();
            return true;
        }
        if (i2 == 3) {
            C4072 c4072 = (C4072) ((C16989) this.f74569.f24321.peek()).f55522.get(i);
            String[] strArr2 = {getString(R.string.MT_Protector)};
            int i5 = DialogInterfaceC8327.f27315;
            C2361 c2362 = new C2361(this);
            c2362.m8014(strArr2, new DialogInterfaceOnClickListenerC11110(0, c4072));
            c2362.m8016();
            return true;
        }
        if (i2 == 5) {
            final boolean z2 = i < this.f74569.f24311.size();
            if (!z2) {
                i -= this.f74569.f24311.size();
            }
            final int i6 = i;
            final C12275 c12275 = (C12275) (z2 ? this.f74569.f24311 : this.f74569.f24320).get(i6);
            final int[] iArr3 = c12275.f39464 == null ? new int[]{R.string.MT_Protector, R.string.MT_Protector} : new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
            String[] strArr3 = new String[iArr3.length];
            for (int i7 = 0; i7 < iArr3.length; i7++) {
                strArr3[i7] = getString(iArr3[i7]);
            }
            int i8 = DialogInterfaceC8327.f27315;
            C2361 c2363 = new C2361(this);
            c2363.m8014(strArr3, new DialogInterface.OnClickListener() { // from class: l.᩷᩶ۤ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    boolean z3 = ActivityC22957.f74567;
                    int i10 = iArr3[i9];
                    final ActivityC22957 activityC22957 = this.f72191;
                    C12275 c12276 = c12275;
                    final int i11 = i6;
                    if (i10 == R.string.MT_Protector) {
                        new C14093(activityC22957).m34253(i11, c12276);
                        return;
                    }
                    if (i10 == R.string.MT_Protector) {
                        ActivityC0167.f1202 = c12276;
                        activityC22957.startActivity(new Intent(activityC22957, (Class<?>) ActivityC0167.class));
                    } else if (i10 == R.string.MT_Protector) {
                        int i12 = DialogInterfaceC8327.f27315;
                        C2361 c2364 = new C2361(activityC22957);
                        c2364.m8021(R.string.MT_Protector);
                        c2364.m8008(c12276.f39463.f19210.m10827());
                        final boolean z4 = z2;
                        c2364.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ᩶ۤ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i13) {
                                ActivityC22957.m51778(activityC22957, z4, i11);
                            }
                        });
                        c2364.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c2364.m8016();
                    }
                }
            });
            c2363.m8016();
            return true;
        }
        if (i2 != 8) {
            return false;
        }
        final boolean z3 = i < this.f74569.f24313.size();
        if (!z3) {
            i -= this.f74569.f24313.size();
        }
        final int i9 = i;
        final C20480 c20480 = (C20480) (z3 ? this.f74569.f24313 : this.f74569.f24308).get(i9);
        final int[] iArr4 = {R.string.MT_Protector, R.string.MT_Protector};
        String[] strArr4 = new String[2];
        for (int i10 = 0; i10 < 2; i10++) {
            strArr4[i10] = getString(iArr4[i10]);
        }
        int i11 = DialogInterfaceC8327.f27315;
        C2361 c2364 = new C2361(this);
        c2364.m8014(strArr4, new DialogInterface.OnClickListener() { // from class: l.۠ܰۤ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                boolean z4 = ActivityC22957.f74567;
                int i13 = iArr4[i12];
                final ActivityC22957 activityC22957 = this.f28325;
                C20480 c20481 = c20480;
                final int i14 = i9;
                if (i13 == R.string.MT_Protector) {
                    new C8873(activityC22957).m23751(i14, c20481);
                    return;
                }
                if (i13 == R.string.MT_Protector) {
                    int i15 = DialogInterfaceC8327.f27315;
                    C2361 c2365 = new C2361(activityC22957);
                    c2365.m8021(R.string.MT_Protector);
                    c2365.m8008(c20481.f65617.f43034.m10827());
                    final boolean z5 = z3;
                    c2365.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ܰۤ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i16) {
                            ActivityC22957.m51765(activityC22957, z5, i14);
                        }
                    });
                    c2365.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2365.m8016();
                }
            }
        });
        c2364.m8016();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51767(final ActivityC22957 activityC22957, int[] iArr, final String str, final boolean z, int i) {
        int i2 = iArr[i];
        if (i2 == R.string.MT_Protector) {
            C21576.m49067((CharSequence) ((C4072) activityC22957.f74569.f24316.get(activityC22957.f74569.f24305.f71549 + str)).m13151().m46860());
            return;
        }
        if (i2 == R.string.MT_Protector) {
            int i3 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(activityC22957);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8008(str);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜܰۤ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC22957.m51766(this.f23729, z, str);
                }
            });
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016();
            return;
        }
        if (i2 == R.string.MT_Protector) {
            C23791 c23791 = new C23791(activityC22957, activityC22957, str, z);
            c23791.m22945(R.string.MT_Protector);
            c23791.m22924((CharSequence) str);
            c23791.m22918();
            c23791.m22957(6);
            c23791.m22959();
            c23791.m22955(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public void m51774() {
        C22211 c22211;
        C7382 c7382 = this.f74569;
        String str = c7382.f24305.f71549;
        c7382.f24305 = c7382.f24310.f17636;
        loop0: while (!this.f74569.f24305.f71549.equals(str)) {
            int size = this.f74569.f24305.f71550.size();
            do {
                size--;
                if (size < 0) {
                    break loop0;
                } else {
                    c22211 = (C22211) this.f74569.f24305.f71550.get(size);
                }
            } while (!str.startsWith(c22211.f71549));
            this.f74569.f24305 = c22211;
        }
        this.f74574.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51765(ActivityC22957 activityC22957, boolean z, int i) {
        if (z) {
            activityC22957.f74569.f24319.m13154().m18013(i);
            activityC22957.f74569.f24313.remove(i);
        } else {
            activityC22957.f74569.f24319.m13154().m18017(i);
            activityC22957.f74569.f24308.remove(i);
        }
        activityC22957.f74574.notifyDataSetChanged();
        f74567 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51778(ActivityC22957 activityC22957, boolean z, int i) {
        if (z) {
            activityC22957.f74569.f24319.m13154().m18014(i);
            activityC22957.f74569.f24311.remove(i);
        } else {
            activityC22957.f74569.f24319.m13154().m18011(i);
            activityC22957.f74569.f24320.remove(i);
        }
        activityC22957.f74574.notifyDataSetChanged();
        f74567 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m51757(EnumC11022 enumC11022) {
        C22211 c22211;
        this.f74569.f24322.mo40353(enumC11022);
        this.f74574.m36199(true);
        this.f74574.m36200();
        this.f74574.notifyDataSetChanged();
        C7382 c7382 = this.f74569;
        c7382.f24304 = false;
        if (enumC11022 == EnumC11022.CLASS_LIST && (c22211 = c7382.f24305) != null) {
            Integer num = (Integer) c7382.f24309.get(c22211.f71549);
            if (num == null) {
                this.f74570.setSelection(0);
                return;
            } else {
                this.f74570.setSelection(num.intValue());
                return;
            }
        }
        this.f74570.setSelection(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51766(ActivityC22957 activityC22957, boolean z, String str) {
        if (z) {
            String str2 = activityC22957.f74569.f24305.f71549 + str.replace('.', '/') + '/';
            for (Map.Entry entry : activityC22957.f74569.f24316.entrySet()) {
                if (((String) entry.getKey()).startsWith(str2)) {
                    activityC22957.f74569.f24317.f80105.m38078().remove(entry.getValue());
                }
            }
        } else {
            activityC22957.f74569.f24317.f80105.m38078().remove(activityC22957.f74569.f24316.get(activityC22957.f74569.f24305.f71549 + str.replace('.', '/')));
        }
        f74567 = true;
        activityC22957.f74569.f24316.clear();
        for (C4072 c4072 : activityC22957.f74569.f24317.f80105.m38078()) {
            activityC22957.f74569.f24316.put(C1402.m5124(1, 1, c4072.m13151().m46860()), c4072);
        }
        C7382 c7382 = activityC22957.f74569;
        c7382.f24310.m15303(c7382.f24316.keySet());
        activityC22957.m51774();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51762(ActivityC22957 activityC22957, String str, String str2) {
        for (C20436 c20436 : activityC22957.f74569.f24317.f80112.m38078()) {
            String strM46860 = c20436.m46860();
            int i = 1;
            for (int i2 = 0; i2 < strM46860.length() && strM46860.charAt(i2) == '['; i2++) {
                i++;
            }
            int iIndexOf = strM46860.indexOf(str);
            if (iIndexOf != -1 && iIndexOf == i) {
                c20436.m46862(strM46860.replace(str, str2));
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m51768(ActivityC22957 activityC22957) {
        int i;
        HashSet hashSet = new HashSet();
        Iterator it = activityC22957.f74569.f24317.f80105.m38078().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C6310 c6310M13154 = ((C4072) it.next()).m13154();
            if (c6310M13154 != null) {
                for (C12275 c12275 : c6310M13154.m18016()) {
                    m51758(c12275, hashSet);
                }
                C12275[] c12275ArrM18012 = c6310M13154.m18012();
                int length = c12275ArrM18012.length;
                while (i < length) {
                    m51758(c12275ArrM18012[i], hashSet);
                    i++;
                }
            }
        }
        activityC22957.f74569.f24303 = new C3282[hashSet.size()];
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            activityC22957.f74569.f24303[i] = (C3282) it2.next();
            i++;
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51758(C12275 c12275, HashSet hashSet) {
        C7033 c7033 = c12275.f39464;
        if (c7033 != null) {
            for (AbstractC24188 abstractC24188 : c7033.f23208) {
                int i = C3653.f12498[abstractC24188.mo2083().ordinal()];
                if ((i == 1 || i == 2) && abstractC24188.f78334.f25843 == EnumC18966.string) {
                    hashSet.add((C3282) ((AbstractC14490) abstractC24188).m35002());
                }
            }
        }
    }
}
