package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ܽ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes5.dex */
public class C16324 extends AbstractC22611 implements InterfaceC19601 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C18597 f52566 = new C18597();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C18377 f52567;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19383 f52568;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8229 f52569;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC16655 f52570;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f52571;

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۬ */
    public final String mo3618() {
        return null;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo3621() {
        return false;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3622() {
        return R.drawable.MT_Protector;
    }

    public C16324() {
        super(R.layout.MT_Protector);
        setHasOptionsMenu(true);
        m50133("000000-0000-0000-0000-000000000001");
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۘ */
    public final String mo3615() {
        return C16737.m39288(R.string.MT_Protector);
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܶ */
    public final String mo3620() {
        return C16737.m39288(R.string.MT_Protector);
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18377 c18377 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f52567 = c18377;
        c18377.m42658().m44959(this, new InterfaceC10597() { // from class: l.᩷֫ۘ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C16324.m38491(this.f66586, (C8229) obj);
            }
        });
        this.f52570 = new C15619(this, getChildFragmentManager());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38491(C16324 c16324, C8229 c8229) {
        c16324.f52569 = c8229;
        c16324.f52571 = c8229.m21608();
        if (c16324.isHidden()) {
            return;
        }
        c16324.m50125(new C7151(c16324, false));
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        C19383 c19383 = (C19383) view.findViewById(R.id.MT_Protector);
        this.f52568 = c19383;
        c19383.m44420(this.f52570);
        this.f52568.m44422(new C19852(this));
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(this.f52568);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C0095(this));
        C18377 c18377 = this.f52567;
        InterfaceC1423 viewLifecycleOwner = getViewLifecycleOwner();
        C19383 c19384 = this.f52568;
        C13638.requireNonNull(c19384);
        c18377.m42652(viewLifecycleOwner, new C3145(2, c19384));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38492(C16324 c16324, boolean z, ActivityC5677 activityC5677) {
        if (!z) {
            activityC5677.setTitle(R.string.MT_Protector);
            activityC5677.m15657((CharSequence) c16324.f52571);
        } else {
            activityC5677.m15657((CharSequence) null);
        }
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        m50125(new C7151(this, z));
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onResume() {
        super.onResume();
        if (isHidden()) {
            return;
        }
        m50125(new C7151(this, false));
    }

    @Override // l.InterfaceC19601
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3616() {
        if (this.f52568 == null) {
            return false;
        }
        InterfaceC17422 interfaceC17422M23119 = getChildFragmentManager().m23119("android:switcher:" + this.f52568.getId() + ":" + this.f52568.m44426());
        return (interfaceC17422M23119 instanceof InterfaceC19601) && ((InterfaceC19601) interfaceC17422M23119).mo3616();
    }

    @Override // l.ComponentCallbacksC22654
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ActivityC5677 activityC5677 = (ActivityC5677) requireActivity();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            activityC5677.m15677();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            activityC5677.m15678();
            return true;
        }
        boolean z = false;
        if (itemId == R.id.more) {
            boolean z2 = this.f52569 != null && this.f52568.m44426() == 0;
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (z2 && !this.f52569.m21603().isEmpty()) {
                z = true;
            }
            menuItemFindItem.setVisible(z);
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(z2);
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            this.f52567.m42625(itemId);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            activityC5677.m15662(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C8229 c8229 = this.f52569;
            if (c8229 != null) {
                c8229.m47185(activityC5677);
            }
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                activityC5677.m15666();
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        }
        ActivityC5677 activityC5678 = (ActivityC5677) requireActivity();
        View viewM30995 = activityC5678.m30995(R.layout.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        c12562.setChecked(ApplicationC0716.f2992.getBoolean("psri", true));
        C8067 c8067BuildDialog = activityC5678.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3725(3, c12562));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C8875.m23019(c8067BuildDialog.m21269());
        return true;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        MenuItem menuItemFindItem = ((InterfaceMenuC1957) menu).findItem(R.id.more).getSubMenu().findItem(R.id.MT_Protector);
        C9186 c9186M42624 = this.f52567.m42624();
        InterfaceC1423 viewLifecycleOwner = getViewLifecycleOwner();
        C13638.requireNonNull(menuItemFindItem);
        c9186M42624.m44959(viewLifecycleOwner, new C7905(menuItemFindItem));
    }
}
