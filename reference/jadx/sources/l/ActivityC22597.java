package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩸ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC22597 extends AbstractActivityC17204 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73044 = 0;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static String f73045;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C10662 f73046;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC24089 f73047;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public ListView f73048;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC20359 f73049;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C5349 f73050;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "ArscEditor";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f73046 = (C10662) new C16196(this).m38422(C10662.class);
        C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C10134 c10134 = new C10134(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m19400(c10134);
        m40415();
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        this.f56046 = (C16390) m40418(R.id.MT_Protector);
        ListView listView = (ListView) m40418(android.R.id.list);
        this.f73048 = listView;
        listView.setFastScrollEnabled(true);
        m40407(this.f56046);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC6407(0, this));
        this.f73049 = new ViewOnClickListenerC20359(this);
        this.f73047 = new ViewOnClickListenerC24089(this);
        if (this.f73046.f33812) {
            m50922();
        } else {
            if (C14584.m35199(this)) {
                return;
            }
            new C1186(this).m8197();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public void m50922() {
        C17593 c17593 = new C17593(this);
        ListView listView = this.f73048;
        C5349 c5349 = new C5349(c17593);
        this.f73050 = c5349;
        listView.setAdapter((ListAdapter) c5349);
        this.f73048.setOnScrollListener(new C9388(this));
        this.f73050.m45065(this.f73048);
        this.f73050.m36199(true);
        this.f73050.m36200();
        this.f73048.setOnItemClickListener(this);
        this.f73048.setOnItemLongClickListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        switch (C19085.f61800[this.f73046.m27171().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C10662 c10662 = this.f73046;
                if (c10662.f33820) {
                    i = c10662.f33805[i];
                }
                c10662.f33798 = c10662.f33815.getValue(i);
                C18452 c18452 = new C18452(this, view, 0);
                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c18452.m42994(new InterfaceC21436() { // from class: l.᩵۫᩸
                    @Override // l.InterfaceC21436
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC22597.f73044;
                        if (menuItem.getItemId() == R.string.MT_Protector) {
                            final ActivityC22597 activityC22597 = this.f65902;
                            C10662 c10663 = activityC22597.f73046;
                            String strM48430 = c10663.f33807.m48430(c10663.f33798.mo16637());
                            int i3 = DialogInterfaceC8327.f27315;
                            C2361 c2361 = new C2361(activityC22597);
                            c2361.m8021(R.string.MT_Protector);
                            c2361.m8008(activityC22597.getString(R.string.MT_Protector, strM48430));
                            final int i4 = i;
                            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹۫᩸
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC22597 activityC22598 = activityC22597;
                                    activityC22598.f73046.f33815.m32847(i4);
                                    activityC22598.f73046.f33798 = null;
                                    activityC22598.f73050.notifyDataSetChanged();
                                    activityC22598.f73046.f33806 = true;
                                }
                            });
                            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c2361.m8016();
                        }
                        return true;
                    }
                });
                C22744.m51282(view, c18452);
                return true;
            case 4:
            default:
                return false;
            case 5:
            case 8:
            case 9:
                final EnumC3951 enumC3951M27171 = this.f73046.m27171();
                if (enumC3951M27171 == EnumC3951.CONFIG) {
                    C10662 c10663 = this.f73046;
                    c10663.f33815 = (C13304) c10663.f33800.get(c10663.f33817 ? c10663.f33801[i] : i);
                } else if (enumC3951M27171 == EnumC3951.SEARCH_BY_ID) {
                    m50916((C13304) this.f73046.f33799.get(i));
                } else if (enumC3951M27171 == EnumC3951.SEARCH_VALUE) {
                    m50916(((C15883) this.f73046.f33802.get(i)).f51647);
                } else {
                    throw new IllegalStateException(enumC3951M27171.name());
                }
                C18452 c18453 = new C18452(this, view, 0);
                if (enumC3951M27171 != EnumC3951.SEARCH_BY_ID) {
                    c18453.m42995().add(0, R.string.menu_copy_id, 0, R.string.menu_copy_id);
                }
                c18453.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c18453.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c18453.m42994(new InterfaceC21436() { // from class: l.ܶ۫᩸
                    @Override // l.InterfaceC21436
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC22597.f73044;
                        int itemId = menuItem.getItemId();
                        final ActivityC22597 activityC22597 = this.f52155;
                        if (itemId == R.string.menu_copy_id) {
                            C21576.m49061(R.string.MT_Protector, activityC22597.f73046.f33815.mo23385());
                        } else if (itemId == R.string.MT_Protector) {
                            activityC22597.f73049.m46779();
                        } else if (itemId == R.string.MT_Protector) {
                            int i3 = DialogInterfaceC8327.f27315;
                            C2361 c2361 = new C2361(activityC22597);
                            c2361.m8021(R.string.MT_Protector);
                            c2361.m8008(activityC22597.getString(R.string.MT_Protector, activityC22597.f73046.f33815.mo18156()));
                            final EnumC3951 enumC3951 = enumC3951M27171;
                            final int i4 = i;
                            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗ۫᩸
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC22597 activityC22598 = activityC22597;
                                    C10662 c10664 = activityC22598.f73046;
                                    c10664.f33818.m46056(c10664.f33815.mo23383());
                                    EnumC3951 enumC3952 = EnumC3951.CONFIG;
                                    EnumC3951 enumC3953 = enumC3951;
                                    int i6 = i4;
                                    if (enumC3953 == enumC3952) {
                                        C10662 c10665 = activityC22598.f73046;
                                        if (c10665.f33817) {
                                            c10665.f33819--;
                                            while (true) {
                                                C10662 c10666 = activityC22598.f73046;
                                                if (i6 >= c10666.f33819) {
                                                    break;
                                                }
                                                int[] iArr = c10666.f33801;
                                                int i7 = i6 + 1;
                                                iArr[i6] = iArr[i7] - 1;
                                                i6 = i7;
                                            }
                                        }
                                        activityC22598.f73046.m27170();
                                    } else if (enumC3953 == EnumC3951.SEARCH_BY_ID) {
                                        activityC22598.f73046.f33799.remove(i6);
                                    } else if (enumC3953 == EnumC3951.SEARCH_VALUE) {
                                        activityC22598.f73046.f33802.remove(i6);
                                    } else {
                                        throw new IllegalStateException(enumC3953.name());
                                    }
                                    activityC22598.f73046.f33815 = null;
                                    activityC22598.f73050.notifyDataSetChanged();
                                    activityC22598.f73046.f33806 = true;
                                }
                            });
                            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c2361.m8016();
                        }
                        return true;
                    }
                });
                C22744.m51282(view, c18453);
                return true;
            case 6:
                if (i >= 3) {
                    C10662 c10664 = this.f73046;
                    c10664.f33804 = c10664.f33797.mo15673(i - 3);
                    C8643 c8643 = new C8643(this, this);
                    c8643.m22945(R.string.MT_Protector);
                    c8643.m22924((CharSequence) this.f73046.f33804.getPackageName());
                    c8643.m22957(6);
                    c8643.m22959();
                    c8643.m22955(true);
                    return true;
                }
                return false;
            case 7:
                C10662 c10665 = this.f73046;
                c10665.f33818 = c10665.f33816.mo4334(i);
                this.f73046.m27170();
                C18452 c18454 = new C18452(this, view, 0);
                c18454.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                if (this.f73046.f33816.mo4331() > 1) {
                    c18454.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                c18454.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c18454.m42994(new InterfaceC21436() { // from class: l.᩺۫᩸
                    @Override // l.InterfaceC21436
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC22597.f73044;
                        int itemId = menuItem.getItemId();
                        final ActivityC22597 activityC22597 = this.f78657;
                        if (itemId == R.string.MT_Protector) {
                            C7152 c7152 = new C7152(activityC22597, activityC22597);
                            c7152.m22945(R.string.MT_Protector);
                            c7152.m22924((CharSequence) activityC22597.f73046.f33818.mo9074());
                            c7152.m22918();
                            c7152.m22957(6);
                            c7152.m22959();
                            c7152.m22955(true);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            int i3 = DialogInterfaceC8327.f27315;
                            C2361 c2361 = new C2361(activityC22597);
                            c2361.m8021(R.string.MT_Protector);
                            c2361.m8008(activityC22597.getString(R.string.MT_Protector, activityC22597.f73046.f33818.mo9077()));
                            final int i4 = i;
                            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶۫᩸
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC22597 activityC22598 = activityC22597;
                                    activityC22598.f73046.f33816.m53023(i4);
                                    C10662 c10666 = activityC22598.f73046;
                                    c10666.f33818 = null;
                                    c10666.f33800.clear();
                                    activityC22598.f73050.notifyDataSetChanged();
                                    activityC22598.f73046.f33806 = true;
                                }
                            });
                            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c2361.m8016();
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            C13863 c13863 = new C13863(activityC22597, activityC22597);
                            c13863.m22945(R.string.MT_Protector);
                            c13863.m22924((CharSequence) activityC22597.f73046.f33818.mo9074());
                            c13863.m22918();
                            c13863.m22957(6);
                            c13863.m22916();
                            c13863.m22955(true);
                        }
                        return true;
                    }
                });
                C22744.m51282(view, c18454);
                return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50916(C13304 c13304) {
        C10662 c10662 = this.f73046;
        c10662.f33815 = c13304;
        c10662.f33818 = c13304.mo18158();
        C10662 c10663 = this.f73046;
        c10663.f33816 = c10663.f33818.getType();
        C10662 c10664 = this.f73046;
        c10664.f33804 = c10664.f33816.m53029();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (C19085.f61800[this.f73046.m27171().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C10662 c10662 = this.f73046;
                if (c10662.f33820) {
                    i = c10662.f33805[i];
                }
                c10662.f33798 = c10662.f33815.getValue(i);
                this.f73047.m53649();
                break;
            case 4:
                C4697 c4697 = new C4697(this, this);
                c4697.m22945(R.string.MT_Protector);
                c4697.m22961();
                C10662 c10663 = this.f73046;
                C12558 c12558 = c10663.f33813;
                if (c10663.f33817) {
                    i = c10663.f33801[i];
                }
                c10663.f33821 = i;
                c4697.m22924((CharSequence) c12558.m15441(i));
                c4697.m22916();
                c4697.m22955(true);
                break;
            case 5:
                if (!this.f73046.f33816.getTypeName().equals("id")) {
                    C10662 c10664 = this.f73046;
                    ArrayList arrayList = c10664.f33800;
                    if (c10664.f33817) {
                        i = c10664.f33801[i];
                    }
                    c10664.f33815 = (C13304) arrayList.get(i);
                    if (this.f73046.f33815.mo18155()) {
                        setTitle(this.f73046.f33818.mo9077() + '/' + this.f73046.f33815.mo18156());
                        m50915(EnumC3951.ENTRY);
                    } else {
                        C10662 c10665 = this.f73046;
                        c10665.f33798 = c10665.f33815.getValue();
                        this.f73047.m53649();
                    }
                }
                break;
            case 6:
                if (i == 0) {
                    m40418(R.string.MT_Protector);
                    m50915(EnumC3951.STRING_POOL);
                } else if (i == 1) {
                    new C21851(this, this).m977();
                } else if (i != 2) {
                    C10662 c10666 = this.f73046;
                    c10666.f33804 = c10666.f33797.mo15673(i - 3);
                    setTitle(this.f73046.f33804.getPackageName());
                    m50915(EnumC3951.PACKAGE);
                } else {
                    C18339 c18339 = new C18339(this, this);
                    c18339.m22945(R.string.search_by_id);
                    c18339.m22924((CharSequence) f73045);
                    c18339.m22918();
                    c18339.m22957(3);
                    String str = f73045;
                    if (str != null && str.length() > 0) {
                        c18339.m22959();
                    }
                    c18339.m22955(true);
                }
                break;
            case 7:
                C10662 c10667 = this.f73046;
                c10667.f33818 = c10667.f33816.mo4334(i);
                this.f73046.m27170();
                setTitle(this.f73046.f33818.mo9077());
                m50915(EnumC3951.CONFIG);
                break;
            case 8:
                C10662 c10668 = this.f73046;
                c10668.f33815 = (C13304) c10668.f33799.get(i);
                if (this.f73046.f33815.mo18155()) {
                    C10662 c10669 = this.f73046;
                    c10669.f33818 = c10669.f33815.mo18158();
                    this.f73046.m27170();
                    C10662 c106610 = this.f73046;
                    c106610.f33816 = c106610.f33818.getType();
                    setTitle(this.f73046.f33818.mo9077() + '/' + this.f73046.f33815.mo18156());
                    m50915(EnumC3951.SEARCH_BY_ID_IN);
                } else {
                    C10662 c106611 = this.f73046;
                    c106611.f33798 = c106611.f33815.getValue();
                    this.f73047.m53649();
                }
                break;
            case 9:
                m50916(((C15883) this.f73046.f33802.get(i)).f51647);
                if (this.f73046.f33815.mo18155()) {
                    setTitle(this.f73046.f33818.mo9077() + "/" + this.f73046.f33815.mo18156());
                    m50915(EnumC3951.SEARCH_VALUE_IN);
                } else {
                    C10662 c106612 = this.f73046;
                    c106612.f33798 = c106612.f33815.getValue();
                    this.f73047.m53649();
                }
                break;
            case 10:
                C10662 c106613 = this.f73046;
                c106613.f33816 = c106613.f33804.getType(i);
                if (this.f73046.f33816.mo4331() == 1 && this.f73046.f33816.getTypeName().equals("id")) {
                    C10662 c106614 = this.f73046;
                    c106614.f33818 = c106614.f33816.mo4334(0);
                    this.f73046.m27170();
                    setTitle(this.f73046.f33818.mo9077());
                    m50915(EnumC3951.CONFIG);
                } else {
                    setTitle(this.f73046.f33816.getTypeName());
                    m50915(EnumC3951.TYPE);
                }
                break;
        }
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        m50925();
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private void m50925() {
        if (this.f73046.f33806) {
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰ۫᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC22597.f73044;
                    new C0440(this.f46017, true).m8197();
                }
            });
            c2361.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5891(1, this));
            c2361.m8016();
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public void m50921() {
        C10662 c10662 = this.f73046;
        C25239 c25239 = c10662.f33804;
        C23747 c23747 = c10662.f33816;
        C20017 c20017 = c10662.f33818;
        C13304 c13304 = c10662.f33815;
        switch (C19085.f61800[c10662.m27171().ordinal()]) {
            case 1:
                C10662 c10663 = this.f73046;
                if (c10663.f33820) {
                    c10663.f33820 = false;
                    this.f73050.notifyDataSetChanged();
                    setTitle(c20017.mo9077() + '/' + c13304.mo18156());
                } else {
                    setTitle(c10663.f33817 ? getString(R.string.MT_Protector, c10663.f33808) : c20017.mo9077());
                    m50915(EnumC3951.CONFIG);
                }
                break;
            case 2:
                C10662 c10664 = this.f73046;
                if (c10664.f33820) {
                    c10664.f33820 = false;
                    this.f73050.notifyDataSetChanged();
                    setTitle(c20017.mo9077() + '/' + c13304.mo18156());
                } else {
                    setTitle(f73045);
                    m50915(EnumC3951.SEARCH_BY_ID);
                }
                break;
            case 3:
                C10662 c10665 = this.f73046;
                if (c10665.f33820) {
                    c10665.f33820 = false;
                    this.f73050.notifyDataSetChanged();
                    setTitle(c20017.mo9077() + "/" + c13304.mo18156());
                } else {
                    setTitle(c10665.f33809);
                    m50915(EnumC3951.SEARCH_VALUE);
                }
                break;
            case 4:
                C10662 c10666 = this.f73046;
                if (c10666.f33817) {
                    c10666.f33817 = false;
                    this.f73050.notifyDataSetChanged();
                    m40418(R.string.MT_Protector);
                } else {
                    m40418(R.string.MT_Protector);
                    m50915(EnumC3951.MAIN);
                }
                break;
            case 5:
                C10662 c10667 = this.f73046;
                if (c10667.f33817) {
                    c10667.f33817 = false;
                    this.f73050.notifyDataSetChanged();
                    setTitle(c20017.mo9077());
                } else if (c23747.mo4331() == 1 && c23747.getTypeName().equals("id")) {
                    setTitle(c25239.getPackageName());
                    m50915(EnumC3951.PACKAGE);
                } else {
                    setTitle(c23747.getTypeName());
                    m50915(EnumC3951.TYPE);
                }
                break;
            case 6:
                m50925();
                break;
            case 7:
                setTitle(c25239.getPackageName());
                m50915(EnumC3951.PACKAGE);
                break;
            case 8:
            case 9:
                this.f73046.f33802.clear();
                this.f73046.f33799.clear();
                m40418(R.string.MT_Protector);
                m50915(EnumC3951.MAIN);
                break;
            case 10:
                m40418(R.string.MT_Protector);
                m50915(EnumC3951.MAIN);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        int itemId = menuItem.getItemId();
        int iMo18154 = 0;
        int i = 1;
        if (itemId == R.id.MT_Protector) {
            new C0440(this, false).m8197();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m50925();
            return true;
        }
        byte b = 2;
        if (itemId == R.id.MT_Protector) {
            int i2 = C19085.f61800[this.f73046.m27171().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z = this.f73046.f33820;
            } else {
                z = this.f73046.f33817;
            }
            new C2677(this, this, z).m55055();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            final C23747 c23747 = this.f73046.f33816;
            int iMo4331 = c23747.mo4331();
            String[] strArr = new String[iMo4331];
            final boolean[] zArr = new boolean[iMo4331];
            while (iMo18154 < iMo4331) {
                strArr[iMo18154] = c23747.mo4334(iMo18154).mo9077();
                iMo18154++;
            }
            View viewM40395 = m40395(R.layout.MT_Protector);
            ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
            C18597.m43179(listView);
            listView.setDivider(null);
            ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
            C21581 c21581 = new C21581(this, zArr, strArr);
            listView.setAdapter((ListAdapter) c21581);
            listView.setOnItemClickListener(c21581);
            int i3 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this);
            c2361.m8005(viewM40395);
            c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘ۫᩸
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    int i5 = ActivityC22597.f73044;
                    ActivityC22597 activityC22597 = this.f14149;
                    activityC22597.getClass();
                    boolean[] zArr2 = zArr;
                    boolean z2 = false;
                    for (int length = zArr2.length - 1; length >= 0; length--) {
                        if (zArr2[length]) {
                            c23747.m53023(length);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        activityC22597.f73050.notifyDataSetChanged();
                        activityC22597.f73046.f33806 = true;
                    }
                }
            });
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016().m22440().setOnClickListener(new ViewOnClickListenerC11152(i, zArr, c21581));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C7898(this, this);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        int i4 = C19085.f61800[this.f73046.m27171().ordinal()];
        if (i4 != 1) {
            if (i4 == 5) {
                C17375.m40816(this);
                return true;
            }
            if (i4 != 7) {
                return true;
            }
            C24835 c24835 = new C24835(this, this);
            c24835.m22945(R.string.MT_Protector);
            Locale locale = Locale.getDefault();
            c24835.m22933("-" + locale.getLanguage() + "-r" + locale.getCountry());
            c24835.m22918();
            c24835.m22957(6);
            c24835.m22955(true);
            return true;
        }
        String typeName = this.f73046.f33816.getTypeName();
        typeName.getClass();
        switch (typeName.hashCode()) {
            case -475309713:
                if (!typeName.equals("plurals")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3004913:
                if (!typeName.equals("attr")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 93090393:
                if (!typeName.equals("array")) {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        String str = "Text";
        int i5 = 4;
        switch (b) {
            case 0:
                i5 = 0;
                break;
            case 1:
                iMo18154 = 16777216;
                str = "1";
                break;
            case 2:
                iMo18154 = 33554432 + this.f73046.f33815.mo18154();
                i5 = 0;
                break;
            default:
                str = "1";
                break;
        }
        this.f73047.m53650(str, iMo18154, i5, true);
        return true;
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
        this.f73046.f33814.m40350(this, new InterfaceC16438() { // from class: l.ۨ۫᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                EnumC3951 enumC3951 = (EnumC3951) obj;
                int i = ActivityC22597.f73044;
                EnumC3951 enumC3952 = EnumC3951.STRING_POOL;
                menuItemFindItem2.setVisible(enumC3951 == enumC3952);
                menuItemFindItem.setVisible(enumC3951 == enumC3952 || enumC3951 == EnumC3951.CONFIG || enumC3951 == EnumC3951.ENTRY || enumC3951 == EnumC3951.SEARCH_VALUE_IN || enumC3951 == EnumC3951.SEARCH_BY_ID_IN);
                EnumC3951 enumC3953 = EnumC3951.TYPE;
                menuItemFindItem3.setVisible(enumC3951 == enumC3953 || enumC3951 == EnumC3951.CONFIG || enumC3951 == EnumC3951.ENTRY);
                menuItemFindItem4.setVisible(enumC3951 == enumC3953);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m50915(EnumC3951 enumC3951) {
        EnumC3951 enumC3951M27171 = this.f73046.m27171();
        this.f73046.f33810[enumC3951M27171.ordinal()] = this.f73048.getFirstVisiblePosition();
        this.f73046.f33814.mo40353(enumC3951);
        this.f73050.m36199(true);
        this.f73050.m36200();
        this.f73050.notifyDataSetChanged();
        if (enumC3951M27171 == EnumC3951.SEARCH_VALUE || enumC3951M27171 == EnumC3951.SEARCH_VALUE_IN || enumC3951M27171 == EnumC3951.SEARCH_BY_ID || enumC3951M27171 == EnumC3951.SEARCH_BY_ID_IN) {
            return;
        }
        this.f73048.setSelection(this.f73046.f33810[enumC3951.ordinal()]);
    }
}
