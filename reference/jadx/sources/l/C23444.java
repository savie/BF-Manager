package l;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes2.dex */
public class C23444 extends AbstractC22611 implements InterfaceC3976, InterfaceC19601, InterfaceC18088 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75887 = 0;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC0201 f75889;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f75890;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f75891;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f75892;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f75893;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C16347 f75894;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public View f75895;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C6094 f75896;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public TextView f75897;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75898;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C18895 f75899;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f75900;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f75901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75902;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f75903;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public TextView f75904;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20556 f75905;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C16839 f75906;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f75907;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f75908;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public String f75909;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f75910;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C18377 f75911;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C6382 f75912;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C8500 f75913;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f75914;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C6111 f75915;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final C14690 f75888 = C14690.m35218(8, "^[ \\t]*((fill-array-data|goto|packed-switch|sparse-switch|if-).+|-?0[xX][0-9a-fA-F]+ *-> *)?(:[\\w$]+)[ \\t]*(#.*)?$");

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final C14690 f75886 = C14690.m35218(8, "^[ \\t]*\\.catch.*\\{.*(:[\\w$]+).*\\.\\..*(:[\\w$]+).*\\}.*(:[\\w$]+)[ \\t]*(#.*)?$");

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo29300() {
        return true;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo3621() {
        return true;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3622() {
        return R.drawable.MT_Protector;
    }

    public C23444() {
        super(R.layout.MT_Protector);
        setHasOptionsMenu(true);
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܶ */
    public final String mo3620() {
        if (this.f75909 == null) {
            this.f75909 = C13012.m32189(80, C22627.m50150(m51659()));
        }
        return this.f75909;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۘ */
    public final String mo3615() {
        if (!this.f73689.getBoolean("changed", false)) {
            return mo3620();
        }
        return "*" + mo3620();
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۬ */
    public final String mo3618() {
        return C13012.m32189(150, m51659());
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo19351() {
        return this.f73689.getBoolean("changed", false);
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۙ */
    public final void mo19344(C18377 c18377) {
        c18377.m42626(m51659());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m51659() {
        String string = requireArguments().getString("classpath");
        C13638.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m51661(String str) {
        m50133((String) null);
        requireArguments().putString("classpath", str);
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f75911 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f75912 = (C6382) new C16717(requireActivity()).m39205(C6382.class);
        this.f75899 = C8312.m21739(this, new C0051(this));
    }

    @Override // l.ComponentCallbacksC22654
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM15651 = ((ActivityC5677) requireActivity()).m15651(R.layout.MT_Protector);
        if (viewM15651 == null) {
            viewM15651 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C13638.requireNonNull(viewM15651);
        }
        C16737.m39274(new RunnableC17794(5, this), 600L);
        return viewM15651;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f75902 = false;
        this.f75895 = view.findViewById(R.id.MT_Protector);
        this.f75915 = (C6111) view.findViewById(R.id.MT_Protector);
        this.f75904 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f75897 = (TextView) view.findViewById(R.id.MT_Protector);
        C20556 c20556 = new C20556((ActivityC5677) requireActivity(), this.f75915, view);
        this.f75905 = c20556;
        c20556.m46370("edit_word_wrap_smali", false);
        this.f75906 = new C16839(view, this.f75915);
        this.f75905.m46371(getViewLifecycleOwner(), this.f75906, ActivityC14081.class);
        C16347 c16347 = new C16347();
        this.f75894 = c16347;
        c16347.mo30284(C23229.m51233(getViewLifecycleOwner()));
        this.f75889 = new ViewOnClickListenerC0201(this, this.f75915, this.f75894);
        this.f75894.mo36571(new C16069(this));
        this.f75915.m16868(new C18504(this));
        this.f75915.m16862(new C7921(this));
        this.f75915.m16865(new C19210(this));
        this.f75915.m16864(new InterfaceC7191() { // from class: l.᩺ۘۜ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ */
            public final void mo4041(int i, int i2) {
                C23444.m51613(this.f74072, i, i2);
            }
        });
        this.f75915.m16879((InterfaceC19517) new C12155(this));
        this.f75904.setText(mo3615());
        if (this.f73689.getBoolean("changed", false)) {
            this.f75904.setTextColor(C20368.f66005);
        }
        final C6222 c6222Matcher = C14690.m35218(8, "^\\.class ([a-z\\-]+ )*L([^;]+);").matcher((CharSequence) "");
        this.f75904.setOnClickListener(new ViewOnClickListenerC8249(1, this, c6222Matcher));
        this.f75904.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܶۘۜ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C23444.m51618(this.f48884, c6222Matcher);
                return true;
            }
        });
        m51649();
        this.f75897.setOnClickListener(new View.OnClickListener() { // from class: l.᩸ۘۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f69413.f75889.m1509();
            }
        });
        this.f75898 = true;
        this.f75906.m39492();
        this.f75911.m42622().m44959(getViewLifecycleOwner(), new InterfaceC10597() { // from class: l.ᩳۘۜ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C23444.m51617(this.f56416, (C6094) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51614(C23444 c23444, List list, List list2, List list3, List list4) {
        if (c23444.f75898) {
            c23444.f75889.m1508(list, list3, list2, list4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51613(C23444 c23444, int i, int i2) {
        C16347 c16347 = c23444.f75894;
        if (c16347 != null) {
            c16347.mo10752(i, i2, c23444);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51619(final C23444 c23444, C6222 c6222, View view) {
        String strM51659;
        C16195 c16195 = new C16195(c23444.requireContext(), view, 0);
        c6222.m17276reset((CharSequence) c23444.f75915.m17000());
        if (c6222.find()) {
            strM51659 = c6222.group(2);
        } else {
            strM51659 = c23444.m51659();
        }
        final C1529 c1529 = new C1529(c16195, strM51659, false);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.۬ۘۜ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C23444.m51615(this.f42774, c1529, menuItem);
                return true;
            }
        });
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51615(C23444 c23444, C1529 c1529, MenuItem menuItem) {
        if (c1529.m5303(menuItem)) {
            return;
        }
        c23444.f75911.m42626(c23444.m51659());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51618(C23444 c23444, C6222 c6222) {
        String strM51659;
        c6222.m17276reset((CharSequence) c23444.f75915.m17000());
        if (c6222.find()) {
            strM51659 = c6222.group(2);
        } else {
            strM51659 = c23444.m51659();
        }
        C8067 c8067BuildDialog = ((ActivityC5677) c23444.requireActivity()).buildDialog();
        c8067BuildDialog.m21261(strM51659);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51617(C23444 c23444, C6094 c6094) {
        c23444.f75896 = c6094;
        if (!c23444.f75898) {
            c23444.f75901 = true;
        } else {
            new C10038(c23444, c23444.m51659()).m10243();
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩺ */
    public final C6111 mo19352() {
        if (this.f75891) {
            throw new IllegalStateException("Text storage is still loading");
        }
        if (this.f75898) {
            return this.f75915;
        }
        return null;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f75898 = false;
        C16347 c16347 = this.f75894;
        if (c16347 != null) {
            c16347.close();
        }
        C6111 c6111 = this.f75915;
        if (c6111 != null) {
            c6111.m16940();
        }
        C20556 c20556 = this.f75905;
        if (c20556 != null) {
            c20556.m46365();
        }
        this.f75895 = null;
        this.f75906 = null;
        this.f75915 = null;
        this.f75905 = null;
        this.f75889 = null;
        this.f75894 = null;
        this.f75904 = null;
        this.f75897 = null;
        this.f75892 = null;
        this.f75907 = null;
        this.f75903 = null;
        this.f75900 = null;
        this.f75914 = null;
        this.f75910 = null;
        this.f75893 = null;
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle((CharSequence) null);
        ((ActivityC5677) requireActivity()).m15657((CharSequence) null);
        ((ActivityC5677) requireActivity()).m31019(this.f75915);
        C20556 c20556 = this.f75905;
        if (c20556 != null && c20556.m46379() && this.f75898) {
            this.f75906.m39492();
        }
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onPause() {
        super.onPause();
        C6111 c6111 = this.f75915;
        if (c6111 != null) {
            c6111.m16915();
        }
        ((ActivityC5677) requireActivity()).m31015();
    }

    @Override // l.ComponentCallbacksC22654, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C6111 c6111 = this.f75915;
        if (c6111 != null) {
            c6111.m16915();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51658(C8500 c8500) {
        this.f75913 = c8500;
        if (c8500 != null && this.f75898 && this.f75902) {
            if (c8500.f29474) {
                this.f75915.m16934();
            }
            C6171.m17176(this.f75898);
            C8500 c8501 = this.f75913;
            if (c8501 == null) {
                return;
            }
            this.f75913 = null;
            c8501.m22227(this.f75915);
            this.f75915.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m51643(C23444 c23444) {
        C6171.m17176(c23444.f75898);
        C8500 c8500 = c23444.f75913;
        if (c8500 == null) {
            return;
        }
        c23444.f75913 = null;
        c8500.m22227(c23444.f75915);
        c23444.f75915.requestFocus();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        InterfaceMenuC1957 interfaceMenuC1957 = (InterfaceMenuC1957) menu;
        this.f75893 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f75910 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f75914 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f75900 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f75903 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f75907 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f75892 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f75893.setEnabled(this.f75915.m17037());
        this.f75910.setEnabled(this.f75915.m16938());
        this.f75914.setEnabled(this.f75915.m17040());
        this.f75900.setEnabled(!this.f75915.m17004());
        this.f75903.setChecked(this.f75915.m17004());
        this.f75905.m46367(interfaceMenuC1957.findItem(R.id.MT_Protector));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.CharSequence, l.ۗܺۖ] */
    /* JADX WARN: Type inference failed for: r1v11, types: [l.ۗܺۖ] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    @Override // l.ComponentCallbacksC22654
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        C10111 c10111;
        C10111 c10112;
        ?? r1;
        if (this.f75890 || this.f75891) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f75915.m16915();
        int itemId = menuItem.getItemId();
        boolean z2 = false;
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f75915.m16999());
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (C1709.m5693() && ApplicationC0716.f2992.getBoolean("cc", true)) {
                z2 = true;
            }
            menuItemFindItem.setChecked(z2);
            this.f75907.setEnabled(this.f75915.m17025());
            this.f75892.setEnabled(this.f75915.m16932());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            String strM50150 = C22627.m50150(m51659());
            if (strM50150.length() > 50) {
                strM50150 = strM50150.substring(0, 50);
            }
            this.f75899.m43563(strM50150 + ".smali");
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f75889.m1509();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (!C1709.m5693()) {
                C15829.m37611(R.string.MT_Protector);
                return true;
            }
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC0716.f2992.edit().putBoolean("cc", menuItem.isChecked()).apply();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC5677 activityC5677 = (ActivityC5677) requireActivity();
            mo19342(activityC5677, true, (Runnable) new RunnableC5240(activityC5677, this, z2));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ((ActivityC5677) requireActivity()).m15659(m51659(), (String) null, (ArrayList) null, false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C4475((ActivityC5677) requireActivity(), C4475.m12493(this.f75915));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C6111 c6111 = this.f75915;
            c6111.m17065(!c6111.m17004());
            menuItem.setChecked(this.f75915.m17004());
            this.f75905.m46378();
            if (this.f75898) {
                this.f75906.m39492();
            }
            this.f75900.setEnabled(!this.f75915.m17004());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            if (!ApplicationC0716.f2992.getBoolean("ard", true)) {
                m51642();
                return true;
            }
            C8067 c8067BuildDialog = ((ActivityC5677) requireActivity()).buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۘۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f13462.m51642();
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۘۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C23444.m51612(this.f21932);
                }
            });
            c8067BuildDialog.m21269();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            Object objMo10751 = this.f75894.mo10751();
            int[] iArrM16971 = this.f75915.m16971();
            if (iArrM16971[0] == iArrM16971[1] && (objMo10751 instanceof C1154)) {
                C1154 c1154 = (C1154) objMo10751;
                ?? Mo2399 = this.f75915.m17000().mo2399();
                try {
                    int i = iArrM16971[0];
                    int iIndexOf = TextUtils.indexOf((CharSequence) Mo2399, '\n', c1154.m4246() + 1);
                    int iLastIndexOf = TextUtils.lastIndexOf(Mo2399, '\n', c1154.m4251() - 1);
                    if (iIndexOf > i || i > iLastIndexOf) {
                        C15829.m37611(R.string.MT_Protector);
                        Mo2399.close();
                        Mo2399 = Mo2399;
                    } else {
                        String strConcat = ".class Ltest;\n.super Ljava/lang/Object;\n".concat(Mo2399.subSequence(c1154.m4246(), c1154.m4251()));
                        Mo2399.close();
                        String strM16526 = this.f75896.m16526(m51659());
                        C8255 c8255M16574 = this.f75896.m16574(strM16526);
                        C20424 c20424M16558 = this.f75896.m16558(strM16526);
                        try {
                            C8485 c8485M21646 = c8255M16574.m21646();
                            C10124 c10124 = (C10124) C6843.m18449(strConcat, c8485M21646, c8255M16574).getMethods().iterator().next();
                            InterfaceC7945 interfaceC7945Mo25747 = c10124.mo25747();
                            if (interfaceC7945Mo25747 == null) {
                                c10112 = null;
                            } else {
                                z = interfaceC7945Mo25747 instanceof C10111;
                                if (z) {
                                    c10112 = (C10111) interfaceC7945Mo25747;
                                } else {
                                    c10111 = new C10111(interfaceC7945Mo25747);
                                    c10112 = c10111;
                                }
                            }
                            if (c10112 == null) {
                                r1 = c10111;
                                r1 = z;
                                r1 = c8485M21646;
                                C15829.m37611(R.string.MT_Protector);
                                Mo2399 = r1;
                            } else {
                                r1 = c10111;
                                r1 = z;
                                r1 = c8485M21646;
                                C7215 c7215 = new C7215(this, (ActivityC5677) requireActivity(), c10112, c10124, c20424M16558, c1154);
                                c7215.m40376(R.string.MT_Protector);
                                c7215.m40346((CharSequence) "1");
                                c7215.m40350(o.a.b);
                                c7215.m40353(R.string.MT_Protector);
                                c7215.m40363(R.string.MT_Protector);
                                c7215.m40340();
                                Mo2399 = 6;
                                c7215.m40336(6);
                                c7215.m40355();
                                c7215.m40368(true);
                            }
                        } catch (C22085 e) {
                            ((ActivityC5677) requireActivity()).m31002(e, (DialogInterface.OnDismissListener) null);
                            C8500 c8500M22223 = C8500.m22223(e.f71538, e.f71540);
                            C6111 c6112 = this.f75915;
                            c8500M22223.m22227(c6112);
                            Mo2399 = c6112;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Mo2399.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                C15829.m37611(R.string.MT_Protector);
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                mo19350((ActivityC5677) requireActivity());
                return true;
            }
            if (!this.f75905.m46383(menuItem)) {
                return super.onOptionsItemSelected(menuItem);
            }
            if (itemId == R.id.MT_Protector) {
                SubMenu subMenu = menuItem.getSubMenu();
                subMenu.add(0, R.string.MT_Protector, 65520, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                subMenu.add(0, R.string.MT_Protector, 65520, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51612(C23444 c23444) {
        C1679.m5597(ApplicationC0716.f2992, "ard", false);
        c23444.m51642();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m51642() {
        String str;
        Object objMo10751 = this.f75894.mo10751();
        int[] iArrM16971 = this.f75915.m16971();
        if (iArrM16971[0] != iArrM16971[1] || !(objMo10751 instanceof C1154)) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        C1154 c1154 = (C1154) objMo10751;
        C3329 c3329Mo2399 = this.f75915.m17000().mo2399();
        try {
            int i = iArrM16971[0];
            int iIndexOf = TextUtils.indexOf((CharSequence) c3329Mo2399, '\n', c1154.m4246() + 1);
            int iLastIndexOf = TextUtils.lastIndexOf(c3329Mo2399, '\n', c1154.m4251() - 1);
            if (iIndexOf <= i && i <= iLastIndexOf) {
                int iIndexOf2 = TextUtils.indexOf((CharSequence) c3329Mo2399, '\n', i) + 1;
                if (iIndexOf2 != 0) {
                    iLastIndexOf = iIndexOf2;
                }
                String str2 = ".class Ltest;\n.super Ljava/lang/Object;\n" + c3329Mo2399.subSequence(c1154.m4246(), iLastIndexOf) + "  nop\n  .source \"analysis_register_mark\"\n  nop\n" + c3329Mo2399.subSequence(iLastIndexOf, c1154.m4251());
                c3329Mo2399.close();
                C8255 c8255M16574 = this.f75896.m16574(this.f75896.m16526(m51659()));
                try {
                    C10124 c10124 = (C10124) C6843.m18449(str2, c8255M16574.m21646(), c8255M16574).getMethods().iterator().next();
                    InterfaceC7945 interfaceC7945Mo25747 = c10124.mo25747();
                    C10111 c10111 = interfaceC7945Mo25747 != null ? interfaceC7945Mo25747 instanceof C10111 ? (C10111) interfaceC7945Mo25747 : new C10111(interfaceC7945Mo25747) : null;
                    if (c10111 == null) {
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    }
                    try {
                        C13970 c13970 = new C13970(c10111);
                        c13970.m33819();
                        ArrayList arrayList = new ArrayList();
                        int iMo11507 = c10111.mo11507();
                        int i2 = 1 ^ (EnumC15236.STATIC.m36501(c10124.mo25750()) ? 1 : 0);
                        Iterator<E> it = c10124.mo9699().iterator();
                        while (it.hasNext()) {
                            i2 = C13571.m33174(((C1428) it.next()).getType()) ? i2 + 2 : i2 + 1;
                        }
                        int i3 = iMo11507 - i2;
                        Iterator it2 = c13970.m33820().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((C1829) it2.next()).m5981().iterator();
                            while (it3.hasNext()) {
                                C15050 c15050M10035 = ((AbstractC3384) it3.next()).m10035();
                                AbstractC3384 abstractC3384M36033 = c15050M10035.m36033();
                                if (abstractC3384M36033 != null && abstractC3384M36033.mo5435() == EnumC10297.f35298) {
                                    for (AbstractC23847 abstractC23847 : c15050M10035.m36039()) {
                                        if ((abstractC23847 instanceof InterfaceC16412) && "analysis_register_mark".equals(((InterfaceC16412) abstractC23847).mo20789())) {
                                            boolean[] zArrM36040 = c15050M10035.m36040();
                                            for (int i4 = 0; i4 < zArrM36040.length; i4++) {
                                                if (zArrM36040[i4]) {
                                                    if (i4 >= i3) {
                                                        arrayList.add(am.ax + (i4 - i3));
                                                    } else {
                                                        arrayList.add(am.aE + i4);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            C15829.m37611(R.string.MT_Protector);
                            return;
                        }
                        if (this.f75915.m17014()) {
                            str = "\t";
                        } else {
                            char[] cArr = new char[this.f75915.m16904()];
                            Arrays.fill(cArr, ' ');
                            str = new String(cArr);
                        }
                        StringBuilder sbM8976 = C3012.m8976(str, "# ");
                        sbM8976.append(getString(R.string.MT_Protector));
                        sbM8976.append(" ");
                        sbM8976.append(C6851.m18456(arrayList, " "));
                        String string = sbM8976.toString();
                        this.f75915.m17000().insert(iLastIndexOf, string + "\n");
                        this.f75915.mo17029(string.length() + iLastIndexOf);
                        this.f75915.m17033();
                        this.f75915.m16886(false);
                        return;
                    } catch (Exception e) {
                        C15829.m37619(e.toString());
                        return;
                    }
                } catch (C22085 e2) {
                    ((ActivityC5677) requireActivity()).m31002(e2, (DialogInterface.OnDismissListener) null);
                    C8500.m22223(e2.f71538, e2.f71540).m22227(this.f75915);
                    return;
                }
            }
            C15829.m37611(R.string.MT_Protector);
            c3329Mo2399.close();
        } catch (Throwable th) {
            try {
                c3329Mo2399.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC19083 interfaceC19083Mo19340 = mo19340();
        if (interfaceC19083Mo19340 != null) {
            C20621 c20621 = (C20621) interfaceC19083Mo19340;
            c20621.mo30475();
            c20621.mo30474();
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC19083 mo19340() {
        C6094 c6094 = this.f75896;
        if (c6094 == null || this.f75891 || !this.f75898) {
            return null;
        }
        C13626 c13626M50132 = m50132(c6094.m47183());
        if (this.f75890) {
            c13626M50132.m33323();
            return null;
        }
        C6111 c6111 = this.f75915;
        C20556 c20556 = this.f75905;
        if (c6111 == null || c20556 == null) {
            throw new RuntimeException();
        }
        return new C20621(this, c6111, c20556, c13626M50132);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51622(C23444 c23444, C17367 c17367) {
        C20190.m45649((InterfaceC0433) c17367, 1382253409);
        if (c17367.readInt() != c23444.f75896.m16564(c23444.m51659())) {
            return false;
        }
        c23444.f75915.m16922(true);
        try {
            C20190.m45649((InterfaceC0433) c17367, 1382253409);
            c23444.f75915.mo16878(c17367);
            C20190.m45649((InterfaceC0433) c17367, 1382253409);
            c23444.f75905.m46382(c17367);
            C20190.m45649((InterfaceC0433) c17367, 1382253409);
            c23444.f75905.m46375(c17367);
            if (!c23444.f75915.m17000().mo8731()) {
                c23444.f75915.m16882(c23444.m50130(c23444.f75896.m47183()).m33318());
            }
            c23444.f75915.m16998();
            return true;
        } catch (Throwable th) {
            c23444.f75915.m16922(false);
            throw th;
        }
    }

    @Override // l.InterfaceC3976
    /* JADX INFO: renamed from: ۙ */
    public final void mo11470(int i, int i2, String str) {
        if (this.f75898) {
            if (i == 0 && i2 == 0) {
                this.f75908 = null;
            } else if (i == -1 && i2 == -1) {
                this.f75908 = C13012.m32189(100, str);
            } else {
                this.f75908 = String.format("[%d - %d] : %s", Integer.valueOf(this.f75915.m16981(i) + 1), Integer.valueOf(this.f75915.m16981(i2) + 1), C13012.m32189(100, str));
            }
            m51649();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m51649() {
        C6111 c6111 = this.f75915;
        if (c6111 != null) {
            StringBuilder sb = new StringBuilder();
            int iM16916 = c6111.m16916();
            int iM17020 = c6111.m17020();
            Point pointM16956 = c6111.m16956(iM16916);
            sb.append(pointM16956.x);
            sb.append(':');
            sb.append(pointM16956.y);
            if (iM16916 != iM17020) {
                sb.append(" (");
                sb.append(Math.abs(iM17020 - iM16916));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            sb.append(" │ ");
            sb.append((String) C13638.requireNonNullElse(this.f75908, "..."));
            this.f75897.setText(sb.toString());
        }
    }

    @Override // l.InterfaceC19601
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3616() {
        C20556 c20556 = this.f75905;
        if (c20556 == null || !c20556.m46385()) {
            return false;
        }
        this.f75905.m46378();
        this.f75915.m16915();
        return true;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܰ */
    public final void mo19350(final ActivityC5677 activityC5677) {
        if (!this.f73689.getBoolean("changed", false)) {
            m50126(activityC5677);
            return;
        }
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC5677);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21253(R.string.MT_Protector);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨ۘۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = C23444.f75887;
                ActivityC5677 activityC5678 = activityC5677;
                C23444 c23444 = this.f3521;
                c23444.mo19342(activityC5678, false, (Runnable) new RunnableC5240(activityC5678, c23444, true));
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15551(1, this, activityC5677));
        c8067.m21269();
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۙ */
    public final void mo19342(ActivityC5677 activityC5677, boolean z, Runnable runnable) {
        C15683 c15683 = new C15683(runnable);
        if (!mo19351()) {
            c15683.onSuccess();
        } else {
            new C19916(activityC5677, new C5804(activityC5677, this, z), c15683).m10243();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51611(ActivityC5677 activityC5677, C23444 c23444, boolean z) {
        if (z) {
            c23444.m50126(activityC5677);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9018 m51660(ActivityC5677 activityC5677) {
        C6171.m17176(this.f73689.getBoolean("changed", false));
        return new C5804(activityC5677, this, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m51657(C6094 c6094, C6382 c6382) {
        if (this.f75898 && !this.f75901 && !C13890.m33728()) {
            for (int i = 0; i < 50 && !this.f75901; i++) {
                SystemClock.sleep(100L);
            }
        }
        if (this.f75898 && this.f75901) {
            return this.f75915.m17000().toString();
        }
        c6382.m17521();
        C13626 c13626M50132 = m50132(c6094.m47183());
        if (!c13626M50132.m33326()) {
            return c6094.m16578(m51659());
        }
        C17367 c17367M40441 = C17367.m40441(c13626M50132.m33327());
        C20190.m45649((InterfaceC0433) c17367M40441, 1382253409);
        if (c17367M40441.readInt() == c6094.m16564(m51659())) {
            C20190.m45649((InterfaceC0433) c17367M40441, 1382253409);
            return C13167.m32559(c17367M40441, m50130(c6094.m47183()).m33318());
        }
        return c6094.m16578(m51659());
    }

    @Override // l.InterfaceC18088
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo29298(C6094 c6094) {
        return !c6094.m16563(m51659());
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static void m51650(C23444 c23444) {
        if (c23444.f75898) {
            c23444.f75906.m39492();
        }
    }
}
