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

/* JADX INFO: renamed from: l.ۘ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3588 extends AbstractActivityC12483 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public static boolean f13200;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C9101 f13202;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C5938 f13203;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C2177 f13204;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public MenuItem f13205;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public ListView f13206;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC16214[] f13207;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f13199 = Pattern.compile("\\s");

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f13201 = Pattern.compile("\\s|\\(|\\)");

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "DexEditor";
    }

    public ActivityC3588() {
        AbstractC16214 abstractC16214 = C0690.f2905;
        this.f13207 = new AbstractC16214[]{abstractC16214, C0690.f2911, abstractC16214, C0690.f2879, C0690.f2899, C0690.f2887};
        m31013();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13204 = (C2177) new C16717(this).m39205(C2177.class);
        C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C16164 c16164 = new C16164(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m34905(c16164);
        m31023();
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        this.f41645 = (C6938) m31016(R.id.MT_Protector);
        ListView listView = (ListView) m31016(android.R.id.list);
        this.f13206 = listView;
        listView.setFastScrollEnabled(true);
        this.f13206.setOnItemClickListener(this);
        this.f13206.setOnItemLongClickListener(this);
        m31004(this.f41645);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC21808(0, this));
        this.f13202 = C7689.m20320(this, new C18280(0, this));
        C2177 c2177 = this.f13204;
        if (!c2177.f7901) {
            f13200 = false;
            c2177.f7893 = ApplicationC0716.f2992.getBoolean("flatten_package", true);
            if (C5553.m15320((AbstractActivityC12483) this)) {
                return;
            }
            new C0640(this).m10243();
            return;
        }
        ListView listView2 = this.f13206;
        C5938 c5938 = new C5938(new C3462(this));
        this.f13203 = c5938;
        listView2.setAdapter((ListAdapter) c5938);
        this.f13206.setOnScrollListener(new C16869(this));
        this.f13203.m38885(this.f13206);
        this.f13203.m30532(true);
        this.f13203.m30530();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10610(ActivityC3588 activityC3588, int i, Intent intent) {
        if (i == 1) {
            activityC3588.f13204.f7904 = intent.getByteArrayExtra(e.m);
        } else if (i == 2) {
            activityC3588.f13204.f7904 = null;
            activityC3588.m10605();
        } else {
            activityC3588.f13204.f7904 = null;
        }
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo10632() {
        m10620(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10620(boolean z) {
        if (f13200) {
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ᩶ۨ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    boolean z2 = ActivityC3588.f13200;
                    new C17574(this.f23519, true).m10243();
                }
            });
            c8067.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23220(this, 0));
            c8067.m21269();
            return;
        }
        if (z) {
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8068 = new C8067(this);
            c8068.m21274(R.string.MT_Protector);
            c8068.m21253(R.string.MT_Protector);
            c8068.m21251(R.string.MT_Protector, null);
            c8068.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶ᩶ۨ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    boolean z2 = ActivityC3588.f13200;
                    this.f50380.finish();
                }
            });
            c8068.m21269();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        C13638.requireNonNull(subMenu);
        final MenuItem menuItemFindItem = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem3 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem4 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem5 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem6 = subMenu.findItem(R.id.MT_Protector);
        MenuItem menuItemFindItem7 = subMenu.findItem(R.id.MT_Protector);
        this.f13205 = menuItemFindItem7;
        menuItemFindItem7.setChecked(this.f13204.f7893);
        this.f13204.f7911.m44959(this, new InterfaceC10597() { // from class: l.۬᩶ۨ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                ActivityC3588.m10611(this.f44256, menuItemFindItem5, menuItemFindItem6, menuItemFindItem4, menuItemFindItem, menuItemFindItem2, menuItemFindItem3, (EnumC12762) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10611(ActivityC3588 activityC3588, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, MenuItem menuItem4, MenuItem menuItem5, MenuItem menuItem6, EnumC12762 enumC12762) {
        EnumC12762 enumC12763 = EnumC12762.STRING_POOL;
        menuItem.setVisible(enumC12762 == enumC12763);
        menuItem2.setVisible(enumC12762 == enumC12763);
        menuItem3.setVisible(enumC12762 == EnumC12762.FIELD_LIST || enumC12762 == EnumC12762.METHOD_LIST);
        activityC3588.f13205.setVisible(enumC12762 == EnumC12762.CLASS_LIST);
        switch (C21102.f68739[enumC12762.ordinal()]) {
            case 1:
            case 2:
                menuItem4.setVisible(true);
                menuItem5.setVisible(true);
                menuItem6.setVisible(true);
                break;
            case 3:
                boolean z = ((C19112) activityC3588.f13204.f7912.peek()).f61749.size() > 0;
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
                boolean z2 = ((C19112) activityC3588.f13204.f7890.peek()).f61749.size() > 0;
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
            new C17574(this, false).m10243();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m10620(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C6285(this, this, this.f13204.f7895).m15185();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C11225(this, this);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            EnumC12762 enumC12762M6777 = this.f13204.m6777();
            if (enumC12762M6777 == EnumC12762.FIELD_LIST) {
                C11351 c11351 = new C11351(this);
                if (c11351.f38295) {
                    c11351.f38295 = false;
                    c11351.m47193(0).addTextChangedListener(new C4294(c11351));
                    c11351.m47193(2).addTextChangedListener(new C13468(c11351));
                }
                c11351.f38296 = -1;
                c11351.f38297 = true;
                c11351.m47193(0).setText("public");
                c11351.m47193(1).setText("newField");
                c11351.m47193(2).setText("I");
                c11351.m47193(3).setText((CharSequence) null);
                c11351.m47192();
                c11351.m47199().setText(R.string.MT_Protector);
                return true;
            }
            if (enumC12762M6777 == EnumC12762.METHOD_LIST) {
                new C5000(this).m13876();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            int i = C21102.f68739[this.f13204.m6777().ordinal()];
            if (i == 1 || i == 2) {
                new C2051(this, this, false).m42691(false);
                return true;
            }
            if (i == 3) {
                new C2051(this, this, true).m42691(true);
                return true;
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                switch (C21102.f68739[this.f13204.m6777().ordinal()]) {
                    case 1:
                    case 2:
                        new C8403(this, this, false).m35576(false);
                        return true;
                    case 3:
                        new C8403(this, this, true).m35576(true);
                        return true;
                    case 4:
                    case 5:
                        new C19692(this, this, false).m35576(false);
                        return true;
                    case 6:
                        new C19692(this, this, true).m35576(true);
                        return true;
                }
            }
            if (itemId != R.id.MT_Protector) {
                if (itemId != R.id.MT_Protector) {
                    return false;
                }
                C2177 c2177 = this.f13204;
                c2177.f7893 = !c2177.f7893;
                ApplicationC0716.f2992.edit().putBoolean("flatten_package", this.f13204.f7893).apply();
                this.f13205.setChecked(this.f13204.f7893);
                C2177 c2178 = this.f13204;
                c2178.f7906.m48752(c2178.f7902.keySet());
                C2177 c2179 = this.f13204;
                c2179.f7897 = c2179.f7906.f71139;
                this.f13203.notifyDataSetChanged();
                setTitle("/");
                return true;
            }
            switch (C21102.f68739[this.f13204.m6777().ordinal()]) {
                case 1:
                case 2:
                    new C23925(this, this, false).m40655(false);
                    break;
                case 3:
                    new C23925(this, this, true).m40655(true);
                    return true;
                case 4:
                case 5:
                    new C14753(this, this, false).m40655(false);
                    return true;
                case 6:
                    new C14753(this, this, true).m40655(true);
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m10629() {
        switch (C21102.f68739[this.f13204.m6777().ordinal()]) {
            case 1:
                m10620(true);
                break;
            case 2:
                C2177 c2177 = this.f13204;
                C0766 c0766 = c2177.f7897;
                if (c0766.f3085 == null) {
                    m10619(EnumC12762.MAIN);
                    m31016(R.string.MT_Protector);
                } else {
                    c2177.f7896.put(c0766.f3083, Integer.valueOf(this.f13206.getFirstVisiblePosition()));
                    C2177 c2178 = this.f13204;
                    c2178.f7897 = c2178.f7897.f3085;
                    setTitle("/" + this.f13204.f7897.f3083);
                    m10619(EnumC12762.CLASS_LIST);
                }
                break;
            case 3:
                this.f13204.f7912.pop();
                if (this.f13204.f7912.isEmpty()) {
                    C2177 c2179 = this.f13204;
                    EnumC12762 enumC12762 = c2179.f7909;
                    EnumC12762 enumC12763 = EnumC12762.MAIN;
                    if (enumC12762 == enumC12763 || c2179.f7897 == null) {
                        m10619(enumC12763);
                        m31016(R.string.MT_Protector);
                    } else {
                        m10619(EnumC12762.CLASS_LIST);
                        setTitle("/" + this.f13204.f7897.f3083);
                    }
                } else {
                    setTitle(((C19112) this.f13204.f7912.peek()).f61750);
                    this.f13203.m30532(true);
                    this.f13203.m30530();
                    this.f13203.notifyDataSetChanged();
                    this.f13206.setSelection(((C19112) this.f13204.f7912.peek()).f61751);
                }
                break;
            case 4:
                if (this.f13204.f7912.isEmpty()) {
                    setTitle("/" + this.f13204.f7897.f3083);
                    m10619(EnumC12762.CLASS_LIST);
                } else {
                    setTitle(((C19112) this.f13204.f7912.peek()).f61750);
                    m10619(EnumC12762.SEARCH_RESULT_CLASS);
                    this.f13206.setSelection(((C19112) this.f13204.f7912.peek()).f61751);
                }
                break;
            case 5:
            case 8:
                setTitle(this.f13204.f7908);
                m10619(EnumC12762.CLASS_INFO);
                break;
            case 6:
                this.f13204.f7890.pop();
                if (this.f13204.f7890.isEmpty()) {
                    EnumC12762 enumC12764 = this.f13204.f7910;
                    EnumC12762 enumC12765 = EnumC12762.METHOD_LIST;
                    if (enumC12764 == enumC12765) {
                        m10619(enumC12765);
                        m31016(R.string.MT_Protector);
                    } else {
                        m10619(EnumC12762.CLASS_INFO);
                        setTitle(this.f13204.f7908);
                    }
                } else {
                    setTitle(((C19112) this.f13204.f7890.peek()).f61750);
                    this.f13203.m30532(true);
                    this.f13203.m30530();
                    this.f13203.notifyDataSetChanged();
                    this.f13206.setSelection(((C19112) this.f13204.f7890.peek()).f61751);
                }
                break;
            case 7:
                C2177 c21710 = this.f13204;
                if (c21710.f7895) {
                    c21710.f7895 = false;
                    m31016(R.string.MT_Protector);
                    this.f13203.notifyDataSetChanged();
                } else {
                    c21710.f7896.put("//", Integer.valueOf(this.f13206.getFirstVisiblePosition()));
                    m10619(EnumC12762.MAIN);
                    m31016(R.string.MT_Protector);
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        try {
            switch (C21102.f68739[this.f13204.m6777().ordinal()]) {
                case 1:
                    if (i == 0) {
                        C2177 c2177 = this.f13204;
                        c2177.f7897 = c2177.f7906.f71139;
                        setTitle("/" + this.f13204.f7897.f3083);
                        m10619(EnumC12762.CLASS_LIST);
                    } else if (i == 1) {
                        m31016(R.string.MT_Protector);
                        m10619(EnumC12762.STRING_POOL);
                        Integer num = (Integer) this.f13204.f7896.get("//");
                        if (num == null) {
                            this.f13206.setSelection(0);
                        } else {
                            this.f13206.setSelection(num.intValue());
                        }
                    }
                    break;
                case 2:
                    if (i < this.f13204.f7897.f3084.size()) {
                        C2177 c2178 = this.f13204;
                        c2178.f7896.put(c2178.f7897.f3083, Integer.valueOf(this.f13206.getFirstVisiblePosition()));
                        C2177 c2179 = this.f13204;
                        c2179.f7897 = (C0766) c2179.f7897.f3084.get(i);
                        setTitle("/" + this.f13204.f7897.f3083);
                        m10619(EnumC12762.CLASS_LIST);
                    } else {
                        C2177 c21710 = this.f13204;
                        c21710.f7896.put(c21710.f7897.f3083, Integer.valueOf(this.f13206.getFirstVisiblePosition()));
                        int size = i - this.f13204.f7897.f3084.size();
                        C2177 c21711 = this.f13204;
                        c21711.f7908 = (String) c21711.f7897.f3087.get(size);
                        C2177 c21712 = this.f13204;
                        c21712.f7904 = null;
                        c21712.f7907 = (C13929) c21712.f7902.get(this.f13204.f7897.f3083 + this.f13204.f7908);
                        setTitle(this.f13204.f7908);
                        m10619(EnumC12762.CLASS_INFO);
                    }
                    break;
                case 3:
                    ((C19112) this.f13204.f7912.peek()).f61751 = this.f13206.getFirstVisiblePosition();
                    C2177 c21713 = this.f13204;
                    c21713.f7907 = (C13929) ((C19112) c21713.f7912.peek()).f61749.get(i);
                    String strM6314 = this.f13204.f7907.m33765().m6314();
                    int iLastIndexOf = strM6314.lastIndexOf(47);
                    if (iLastIndexOf == -1) {
                        C2177 c21714 = this.f13204;
                        String strSubstring = strM6314.substring(0, strM6314.length() - 1);
                        c21714.f7908 = strSubstring;
                        setTitle(strSubstring);
                    } else {
                        C2177 c21715 = this.f13204;
                        String strSubstring2 = strM6314.substring(iLastIndexOf + 1, strM6314.length() - 1);
                        c21715.f7908 = strSubstring2;
                        setTitle(strSubstring2);
                    }
                    this.f13204.f7904 = null;
                    m10619(EnumC12762.CLASS_INFO);
                    break;
                case 4:
                    if (i == 0) {
                        new C9814(this).m24917();
                    } else if (i == 1) {
                        m10624();
                        m31016(R.string.MT_Protector);
                        m10619(EnumC12762.FIELD_LIST);
                    } else if (i == 2) {
                        m10607();
                        m31016(R.string.MT_Protector);
                        m10619(EnumC12762.METHOD_LIST);
                    } else if (i == 3) {
                        m10605();
                    }
                    break;
                case 5:
                    z = i < this.f13204.f7894.size();
                    if (!z) {
                        i -= this.f13204.f7894.size();
                    }
                    C9841 c9841 = (C9841) (z ? this.f13204.f7894 : this.f13204.f7892).get(i);
                    if (c9841.f33623 == null) {
                        new C5000(this).m13874(i, c9841);
                    } else {
                        ActivityC23946.f77666 = c9841;
                        startActivity(new Intent(this, (Class<?>) ActivityC23946.class));
                    }
                    break;
                case 6:
                    ((C19112) this.f13204.f7890.peek()).f61751 = this.f13206.getFirstVisiblePosition();
                    C9841 c9842 = (C9841) ((C19112) this.f13204.f7890.peek()).f61749.get(i);
                    if (c9842.f33623 == null) {
                        C15829.m37611(R.string.MT_Protector);
                    } else {
                        ActivityC23946.f77666 = c9842;
                        startActivity(new Intent(this, (Class<?>) ActivityC23946.class));
                    }
                    break;
                case 7:
                    C9109 c9109 = new C9109(this, this);
                    c9109.m40369();
                    c9109.m40376(R.string.MT_Protector);
                    C2177 c21716 = this.f13204;
                    C14655[] c14655Arr = c21716.f7898;
                    if (c21716.f7895) {
                        i = c21716.f7891[i];
                    }
                    c21716.f7913 = i;
                    c9109.m40346((CharSequence) c14655Arr[i].m35176());
                    c9109.m40368(true);
                    break;
                case 8:
                    z = i < this.f13204.f7903.size();
                    if (!z) {
                        i -= this.f13204.f7903.size();
                    }
                    new C11351(this).m28431(i, (C2078) (z ? this.f13204.f7903 : this.f13204.f7914).get(i));
                    break;
            }
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10605() {
        byte[] bArr = this.f13204.f7904;
        if (bArr == null) {
            new C10520(this).m10243();
            return;
        }
        C9101 c9101 = this.f13202;
        String strM50267 = C22697.m50267(new StringBuilder(), this.f13204.f7908, ".java");
        C12670.m31503(ActivityC3588.class, bArr, "textViewer_data");
        Intent intent = new Intent(C16737.m39277(), (Class<?>) ActivityC21135.class);
        intent.putExtra(e.s, 1);
        intent.putExtra("title", strM50267);
        intent.putExtra("saveStateOnResult", true);
        c9101.m23450(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void m10607() {
        C3489 c3489M33764;
        this.f13204.f7892.clear();
        this.f13204.f7894.clear();
        C13929 c13929 = this.f13204.f7907;
        if (c13929 == null || (c3489M33764 = c13929.m33764()) == null) {
            return;
        }
        Collections.addAll(this.f13204.f7894, c3489M33764.m10236());
        Collections.addAll(this.f13204.f7892, c3489M33764.m10232());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public void m10624() {
        this.f13204.f7914.clear();
        this.f13204.f7903.clear();
        C3489 c3489M33764 = this.f13204.f7907.m33764();
        if (c3489M33764 != null) {
            Collections.addAll(this.f13204.f7903, c3489M33764.m10237());
            Collections.addAll(this.f13204.f7914, c3489M33764.m10233());
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        final String str;
        final int[] iArr;
        int i2 = C21102.f68739[this.f13204.m6777().ordinal()];
        if (i2 == 2) {
            final boolean z = i < this.f13204.f7897.f3084.size();
            if (z) {
                iArr = new int[]{R.string.MT_Protector, R.string.MT_Protector};
                str = ((C0766) this.f13204.f7897.f3084.get(i)).f3082;
            } else {
                int[] iArr2 = {R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
                str = (String) this.f13204.f7897.f3087.get(i - this.f13204.f7897.f3084.size());
                iArr = iArr2;
            }
            String[] strArr = new String[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                strArr[i3] = getString(iArr[i3]);
            }
            int i4 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this);
            c8067.m21267(strArr, new DialogInterface.OnClickListener() { // from class: l.ۘ᩶ۨ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    ActivityC3588.m10617(this.f15211, iArr, str, z, i5);
                }
            });
            c8067.m21269();
            return true;
        }
        if (i2 == 3) {
            final C13929 c13929 = (C13929) ((C19112) this.f13204.f7912.peek()).f61749.get(i);
            String[] strArr2 = {getString(R.string.MT_Protector)};
            int i5 = DialogInterfaceC19356.f62401;
            C8067 c8068 = new C8067(this);
            c8068.m21267(strArr2, new DialogInterface.OnClickListener() { // from class: l.֨᩶ۨ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    boolean z2 = ActivityC3588.f13200;
                    C16737.m39272((CharSequence) c13929.m33765().m6314());
                }
            });
            c8068.m21269();
            return true;
        }
        if (i2 == 5) {
            final boolean z2 = i < this.f13204.f7894.size();
            if (!z2) {
                i -= this.f13204.f7894.size();
            }
            final int i6 = i;
            final C9841 c9841 = (C9841) (z2 ? this.f13204.f7894 : this.f13204.f7892).get(i6);
            final int[] iArr3 = c9841.f33623 == null ? new int[]{R.string.MT_Protector, R.string.MT_Protector} : new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
            String[] strArr3 = new String[iArr3.length];
            for (int i7 = 0; i7 < iArr3.length; i7++) {
                strArr3[i7] = getString(iArr3[i7]);
            }
            int i8 = DialogInterfaceC19356.f62401;
            C8067 c8069 = new C8067(this);
            c8069.m21267(strArr3, new DialogInterface.OnClickListener() { // from class: l.᩹᩶ۨ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    boolean z3 = ActivityC3588.f13200;
                    int i10 = iArr3[i9];
                    final ActivityC3588 activityC3588 = this.f73477;
                    C9841 c9842 = c9841;
                    final int i11 = i6;
                    if (i10 == R.string.MT_Protector) {
                        new C5000(activityC3588).m13874(i11, c9842);
                        return;
                    }
                    if (i10 == R.string.MT_Protector) {
                        ActivityC23946.f77666 = c9842;
                        activityC3588.startActivity(new Intent(activityC3588, (Class<?>) ActivityC23946.class));
                    } else if (i10 == R.string.MT_Protector) {
                        int i12 = DialogInterfaceC19356.f62401;
                        C8067 c80610 = new C8067(activityC3588);
                        c80610.m21274(R.string.MT_Protector);
                        c80610.m21261(c9842.f33621.f65771.m35176());
                        final boolean z4 = z2;
                        c80610.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ᩶ۨ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i13) {
                                ActivityC3588.m10628(activityC3588, z4, i11);
                            }
                        });
                        c80610.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c80610.m21269();
                    }
                }
            });
            c8069.m21269();
            return true;
        }
        if (i2 != 8) {
            return false;
        }
        final boolean z3 = i < this.f13204.f7903.size();
        if (!z3) {
            i -= this.f13204.f7903.size();
        }
        final int i9 = i;
        final C2078 c2078 = (C2078) (z3 ? this.f13204.f7903 : this.f13204.f7914).get(i9);
        final int[] iArr4 = {R.string.MT_Protector, R.string.MT_Protector};
        String[] strArr4 = new String[2];
        for (int i10 = 0; i10 < 2; i10++) {
            strArr4[i10] = getString(iArr4[i10]);
        }
        int i11 = DialogInterfaceC19356.f62401;
        C8067 c80610 = new C8067(this);
        c80610.m21267(strArr4, new DialogInterface.OnClickListener() { // from class: l.ܰ᩶ۨ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                boolean z4 = ActivityC3588.f13200;
                int i13 = iArr4[i12];
                final ActivityC3588 activityC3588 = this.f46182;
                C2078 c2079 = c2078;
                final int i14 = i9;
                if (i13 == R.string.MT_Protector) {
                    new C11351(activityC3588).m28431(i14, c2079);
                    return;
                }
                if (i13 == R.string.MT_Protector) {
                    int i15 = DialogInterfaceC19356.f62401;
                    C8067 c80611 = new C8067(activityC3588);
                    c80611.m21274(R.string.MT_Protector);
                    c80611.m21261(c2079.f7681.f61164.m35176());
                    final boolean z5 = z3;
                    c80611.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖ᩶ۨ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i16) {
                            ActivityC3588.m10615(activityC3588, z5, i14);
                        }
                    });
                    c80611.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c80611.m21269();
                }
            }
        });
        c80610.m21269();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10617(final ActivityC3588 activityC3588, int[] iArr, final String str, final boolean z, int i) {
        int i2 = iArr[i];
        if (i2 == R.string.MT_Protector) {
            C16737.m39272((CharSequence) ((C13929) activityC3588.f13204.f7902.get(activityC3588.f13204.f7897.f3083 + str)).m33765().m6314());
            return;
        }
        if (i2 == R.string.MT_Protector) {
            int i3 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(activityC3588);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21261(str);
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨ᩶ۨ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC3588.m10616(this.f40030, z, str);
                }
            });
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269();
            return;
        }
        if (i2 == R.string.MT_Protector) {
            C7697 c7697 = new C7697(activityC3588, activityC3588, str, z);
            c7697.m40376(R.string.MT_Protector);
            c7697.m40346((CharSequence) str);
            c7697.m40340();
            c7697.m40336(6);
            c7697.m40355();
            c7697.m40368(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public void m10621() {
        C0766 c0766;
        C2177 c2177 = this.f13204;
        String str = c2177.f7897.f3083;
        c2177.f7897 = c2177.f7906.f71139;
        loop0: while (!this.f13204.f7897.f3083.equals(str)) {
            int size = this.f13204.f7897.f3084.size();
            do {
                size--;
                if (size < 0) {
                    break loop0;
                } else {
                    c0766 = (C0766) this.f13204.f7897.f3084.get(size);
                }
            } while (!str.startsWith(c0766.f3083));
            this.f13204.f7897 = c0766;
        }
        this.f13203.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10615(ActivityC3588 activityC3588, boolean z, int i) {
        if (z) {
            activityC3588.f13204.f7907.m33764().m10231(i);
            activityC3588.f13204.f7903.remove(i);
        } else {
            activityC3588.f13204.f7907.m33764().m10223(i);
            activityC3588.f13204.f7914.remove(i);
        }
        activityC3588.f13203.notifyDataSetChanged();
        f13200 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10628(ActivityC3588 activityC3588, boolean z, int i) {
        if (z) {
            activityC3588.f13204.f7907.m33764().m10234(i);
            activityC3588.f13204.f7894.remove(i);
        } else {
            activityC3588.f13204.f7907.m33764().m10238(i);
            activityC3588.f13204.f7892.remove(i);
        }
        activityC3588.f13203.notifyDataSetChanged();
        f13200 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m10619(EnumC12762 enumC12762) {
        C0766 c0766;
        this.f13204.f7911.mo23642(enumC12762);
        this.f13203.m30532(true);
        this.f13203.m30530();
        this.f13203.notifyDataSetChanged();
        C2177 c2177 = this.f13204;
        c2177.f7895 = false;
        if (enumC12762 == EnumC12762.CLASS_LIST && (c0766 = c2177.f7897) != null) {
            Integer num = (Integer) c2177.f7896.get(c0766.f3083);
            if (num == null) {
                this.f13206.setSelection(0);
                return;
            } else {
                this.f13206.setSelection(num.intValue());
                return;
            }
        }
        this.f13206.setSelection(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10616(ActivityC3588 activityC3588, boolean z, String str) {
        if (z) {
            String str2 = activityC3588.f13204.f7897.f3083 + str.replace('.', '/') + '/';
            for (Map.Entry entry : activityC3588.f13204.f7902.entrySet()) {
                if (((String) entry.getKey()).startsWith(str2)) {
                    activityC3588.f13204.f7900.f40371.m28059().remove(entry.getValue());
                }
            }
        } else {
            activityC3588.f13204.f7900.f40371.m28059().remove(activityC3588.f13204.f7902.get(activityC3588.f13204.f7897.f3083 + str.replace('.', '/')));
        }
        f13200 = true;
        activityC3588.f13204.f7902.clear();
        for (C13929 c13929 : activityC3588.f13204.f7900.f40371.m28059()) {
            activityC3588.f13204.f7902.put(C20630.m46498(1, 1, c13929.m33765().m6314()), c13929);
        }
        C2177 c2177 = activityC3588.f13204;
        c2177.f7906.m48752(c2177.f7902.keySet());
        activityC3588.m10621();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10612(ActivityC3588 activityC3588, String str, String str2) {
        for (C1953 c1953 : activityC3588.f13204.f7900.f40367.m28059()) {
            String strM6314 = c1953.m6314();
            int i = 1;
            for (int i2 = 0; i2 < strM6314.length() && strM6314.charAt(i2) == '['; i2++) {
                i++;
            }
            int iIndexOf = strM6314.indexOf(str);
            if (iIndexOf != -1 && iIndexOf == i) {
                c1953.m6318(strM6314.replace(str, str2));
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m10626(ActivityC3588 activityC3588) {
        int i;
        HashSet hashSet = new HashSet();
        Iterator it = activityC3588.f13204.f7900.f40371.m28059().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C3489 c3489M33764 = ((C13929) it.next()).m33764();
            if (c3489M33764 != null) {
                for (C9841 c9841 : c3489M33764.m10236()) {
                    m10618(c9841, hashSet);
                }
                C9841[] c9841ArrM10232 = c3489M33764.m10232();
                int length = c9841ArrM10232.length;
                while (i < length) {
                    m10618(c9841ArrM10232[i], hashSet);
                    i++;
                }
            }
        }
        activityC3588.f13204.f7898 = new C14655[hashSet.size()];
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            activityC3588.f13204.f7898[i] = (C14655) it2.next();
            i++;
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10618(C9841 c9841, HashSet hashSet) {
        C17706 c17706 = c9841.f33623;
        if (c17706 != null) {
            for (AbstractC4300 abstractC4300 : c17706.f56222) {
                int i = C21102.f68741[abstractC4300.mo4758().ordinal()];
                if ((i == 1 || i == 2) && abstractC4300.f15468.f3348 == EnumC12768.string) {
                    hashSet.add((C14655) ((AbstractC11357) abstractC4300).m28439());
                }
            }
        }
    }
}
