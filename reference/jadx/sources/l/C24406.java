package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.᩺ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes2.dex */
public class C24406 extends AbstractC9051 implements InterfaceC16837 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C0594 f79200 = new C0594();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC21091 f79201;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15179 f79202;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C11967 f79203;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C22761 f79204;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f79205;

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۫ */
    public final String mo1443() {
        return null;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܳ */
    public final int mo1444() {
        return R.drawable.MT_Protector;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo1446() {
        return false;
    }

    public C24406() {
        super(R.layout.MT_Protector);
        setHasOptionsMenu(true);
        m24174("000000-0000-0000-0000-000000000001");
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۚ */
    public final String mo1440() {
        return C21576.m49088(R.string.MT_Protector);
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܺ */
    public final String mo1445() {
        return C21576.m49088(R.string.MT_Protector);
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C22761 c22761 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f79204 = c22761;
        c22761.m51322().m40350(this, new C11317(1, this));
        this.f79201 = new C20676(this, getChildFragmentManager());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54595(C24406 c24406, C11967 c11967) {
        c24406.f79203 = c11967;
        c24406.f79205 = c11967.m30008();
        if (c24406.isHidden()) {
            return;
        }
        c24406.m24163(new C3522(c24406, false));
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        C15179 c15179 = (C15179) view.findViewById(R.id.MT_Protector);
        this.f79202 = c15179;
        c15179.m36514(this.f79201);
        this.f79202.m36513(new C12471(this));
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(this.f79202);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C6506(this));
        C22761 c22761 = this.f79204;
        InterfaceC11217 viewLifecycleOwner = getViewLifecycleOwner();
        C15179 c151710 = this.f79202;
        C17359.requireNonNull(c151710);
        c22761.m51311(viewLifecycleOwner, new C23660(c151710));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m54596(C24406 c24406, boolean z, ActivityC0848 activityC0848) {
        if (!z) {
            activityC0848.setTitle(R.string.MT_Protector);
            activityC0848.m3428((CharSequence) c24406.f79205);
        } else {
            activityC0848.m3428((CharSequence) null);
        }
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        m24163(new C3522(this, z));
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onResume() {
        super.onResume();
        if (isHidden()) {
            return;
        }
        m24163(new C3522(this, false));
    }

    @Override // l.InterfaceC16837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1437() {
        if (this.f79202 == null) {
            return false;
        }
        InterfaceC11217 interfaceC11217M10493 = getChildFragmentManager().m10493("android:switcher:" + this.f79202.getId() + ":" + this.f79202.m36517());
        return (interfaceC11217M10493 instanceof InterfaceC16837) && ((InterfaceC16837) interfaceC11217M10493).mo1437();
    }

    @Override // l.ComponentCallbacksC11612
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ActivityC0848 activityC0848 = (ActivityC0848) requireActivity();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            activityC0848.m3454();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            activityC0848.m3450();
            return true;
        }
        boolean z = false;
        if (itemId == R.id.more) {
            boolean z2 = this.f79203 != null && this.f79202.m36517() == 0;
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (z2 && !this.f79203.m30007().isEmpty()) {
                z = true;
            }
            menuItemFindItem.setVisible(z);
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(z2);
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            this.f79204.m51297(itemId);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            activityC0848.m3453(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C11967 c11967 = this.f79203;
            if (c11967 != null) {
                c11967.m11159(activityC0848);
            }
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                activityC0848.m3458();
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        }
        ActivityC0848 activityC0849 = (ActivityC0848) requireActivity();
        View viewM40395 = activityC0849.m40395(R.layout.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("psri", true));
        C2361 c2361BuildDialog = activityC0849.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24070(2, c1255));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C21232.m48398(c2361BuildDialog.m8016());
        return true;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        MenuItem menuItemFindItem = ((InterfaceMenuC10774) menu).findItem(R.id.more).getSubMenu().findItem(R.id.MT_Protector);
        C17930 c17930M51296 = this.f79204.m51296();
        InterfaceC11217 viewLifecycleOwner = getViewLifecycleOwner();
        C17359.requireNonNull(menuItemFindItem);
        c17930M51296.m40350(viewLifecycleOwner, new C1038(1, menuItemFindItem));
    }
}
