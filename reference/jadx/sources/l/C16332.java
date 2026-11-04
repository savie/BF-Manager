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

/* JADX INFO: renamed from: l.ܶ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public class C16332 extends AbstractC9051 implements InterfaceC8940, InterfaceC16837, InterfaceC10586 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53020 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f53022;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f53023;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f53024;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23582 f53025;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f53026;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C12340 f53027;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f53028;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11616 f53029;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f53030;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f53031;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C24132 f53032;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20283 f53033;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f53034;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public TextView f53035;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC12166 f53036;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f53037;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C15301 f53038;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public String f53039;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C5639 f53040;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C12318 f53041;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f53042;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public View f53043;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C22761 f53044;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public TextView f53045;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f53046;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f53047;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f53048;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final C18415 f53019 = C18415.m42924(8, "^[ \\t]*((fill-array-data|goto|packed-switch|sparse-switch|if-).+|-?0[xX][0-9a-fA-F]+ *-> *)?(:[\\w$]+)[ \\t]*(#.*)?$");

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final C18415 f53021 = C18415.m42924(8, "^[ \\t]*\\.catch.*\\{.*(:[\\w$]+).*\\.\\..*(:[\\w$]+).*\\}.*(:[\\w$]+)[ \\t]*(#.*)?$");

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo1433() {
        return true;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܳ */
    public final int mo1444() {
        return R.drawable.MT_Protector;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo1446() {
        return true;
    }

    public C16332() {
        super(R.layout.MT_Protector);
        setHasOptionsMenu(true);
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܺ */
    public final String mo1445() {
        if (this.f53039 == null) {
            this.f53039 = C18969.m44060(80, C15306.m36751(m38820()));
        }
        return this.f53039;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۚ */
    public final String mo1440() {
        if (!this.f29441.getBoolean("changed", false)) {
            return mo1445();
        }
        return "*" + mo1445();
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۫ */
    public final String mo1443() {
        return C18969.m44060(150, m38820());
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo24170() {
        return this.f29441.getBoolean("changed", false);
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۙ */
    public final void mo1436(C22761 c22761) {
        c22761.m51298(m38820());
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m38820() {
        String string = requireArguments().getString("classpath");
        C17359.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38822(String str) {
        m24174((String) null);
        requireArguments().putString("classpath", str);
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f53044 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f53041 = (C12318) new C16196(requireActivity()).m38422(C12318.class);
        this.f53029 = C25043.m55863(this, new C0473(this));
    }

    @Override // l.ComponentCallbacksC11612
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM3434 = ((ActivityC0848) requireActivity()).m3434(R.layout.MT_Protector);
        if (viewM3434 == null) {
            viewM3434 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C17359.requireNonNull(viewM3434);
        }
        C21576.m49069(new RunnableC14793(3, this), 600L);
        return viewM3434;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f53030 = false;
        this.f53043 = view.findViewById(R.id.MT_Protector);
        this.f53032 = (C24132) view.findViewById(R.id.MT_Protector);
        this.f53045 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f53035 = (TextView) view.findViewById(R.id.MT_Protector);
        C23582 c23582 = new C23582((ActivityC0848) requireActivity(), this.f53032, view);
        this.f53025 = c23582;
        c23582.m52808("edit_word_wrap_smali", false);
        this.f53040 = new C5639(view, this.f53032);
        this.f53025.m52810(getViewLifecycleOwner(), this.f53040, ActivityC7261.class);
        C12340 c12340 = new C12340();
        this.f53027 = c12340;
        c12340.mo14427(C11555.m29068(getViewLifecycleOwner()));
        this.f53036 = new ViewOnClickListenerC12166(this, this.f53032, this.f53027);
        this.f53027.mo14426(new C24101(this));
        this.f53032.m53912(new C7185(this));
        this.f53032.m53927(new C13896(this));
        this.f53032.m53916(new C5146(this));
        this.f53032.m53913(new InterfaceC11886() { // from class: l.ۡܰۧ
            @Override // l.InterfaceC11886
            /* JADX INFO: renamed from: ۙ */
            public final void mo1160(int i, int i2) {
                C16332.m38773(this.f30564, i, i2);
            }
        });
        this.f53032.m53909((InterfaceC5486) new C11857(this));
        this.f53045.setText(mo1440());
        if (this.f29441.getBoolean("changed", false)) {
            this.f53045.setTextColor(C3296.f10764);
        }
        final C4245 c4245Matcher = C18415.m42924(8, "^\\.class ([a-z\\-]+ )*L([^;]+);").matcher((CharSequence) "");
        this.f53045.setOnClickListener(new ViewOnClickListenerC6792(1, this, c4245Matcher));
        this.f53045.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۖܰۧ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C16332.m38777(this.f9052, c4245Matcher);
                return true;
            }
        });
        m38806();
        this.f53035.setOnClickListener(new ViewOnClickListenerC18879(1, this));
        this.f53026 = true;
        this.f53040.m16625();
        this.f53044.m51321().m40350(getViewLifecycleOwner(), new InterfaceC16438() { // from class: l.۠ܰۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C16332.m38780(this.f28328, (C20283) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38774(C16332 c16332, List list, List list2, List list3, List list4) {
        if (c16332.f53026) {
            c16332.f53036.m30403(list, list3, list2, list4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38773(C16332 c16332, int i, int i2) {
        C12340 c12340 = c16332.f53027;
        if (c12340 != null) {
            c12340.mo14425(i, i2, c16332);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38778(final C16332 c16332, C4245 c4245, View view) {
        String strM38820;
        C18452 c18452 = new C18452(c16332.requireContext(), view, 0);
        c4245.m13568reset((CharSequence) c16332.f53032.m54021());
        if (c4245.find()) {
            strM38820 = c4245.group(2);
        } else {
            strM38820 = c16332.m38820();
        }
        final C0408 c0408 = new C0408(c18452, strM38820, false);
        c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۢܰۧ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C16332.m38775(this.f32554, c0408, menuItem);
                return true;
            }
        });
        c18452.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38775(C16332 c16332, C0408 c0408, MenuItem menuItem) {
        if (c0408.m2214(menuItem)) {
            return;
        }
        c16332.f53044.m51298(c16332.m38820());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38777(C16332 c16332, C4245 c4245) {
        String strM38820;
        c4245.m13568reset((CharSequence) c16332.f53032.m54021());
        if (c4245.find()) {
            strM38820 = c4245.group(2);
        } else {
            strM38820 = c16332.m38820();
        }
        C2361 c2361BuildDialog = ((ActivityC0848) c16332.requireActivity()).buildDialog();
        c2361BuildDialog.m8008(strM38820);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38780(C16332 c16332, C20283 c20283) {
        c16332.f53033 = c20283;
        if (!c16332.f53026) {
            c16332.f53034 = true;
        } else {
            new C11111(c16332, c16332.m38820()).m8197();
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۧ */
    public final C24132 mo1442() {
        if (this.f53046) {
            throw new IllegalStateException("Text storage is still loading");
        }
        if (this.f53026) {
            return this.f53032;
        }
        return null;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f53026 = false;
        C12340 c12340 = this.f53027;
        if (c12340 != null) {
            c12340.close();
        }
        C24132 c24132 = this.f53032;
        if (c24132 != null) {
            c24132.m53966();
        }
        C23582 c23582 = this.f53025;
        if (c23582 != null) {
            c23582.m52821();
        }
        this.f53043 = null;
        this.f53040 = null;
        this.f53032 = null;
        this.f53025 = null;
        this.f53036 = null;
        this.f53027 = null;
        this.f53045 = null;
        this.f53035 = null;
        this.f53037 = null;
        this.f53022 = null;
        this.f53028 = null;
        this.f53023 = null;
        this.f53048 = null;
        this.f53047 = null;
        this.f53024 = null;
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle((CharSequence) null);
        ((ActivityC0848) requireActivity()).m3428((CharSequence) null);
        ((ActivityC0848) requireActivity()).m40419(this.f53032);
        C23582 c23582 = this.f53025;
        if (c23582 != null && c23582.m52804() && this.f53026) {
            this.f53040.m16625();
        }
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onPause() {
        super.onPause();
        C24132 c24132 = this.f53032;
        if (c24132 != null) {
            c24132.m53970();
        }
        ((ActivityC0848) requireActivity()).m40414();
    }

    @Override // l.ComponentCallbacksC11612, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C24132 c24132 = this.f53032;
        if (c24132 != null) {
            c24132.m53970();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38819(C15301 c15301) {
        this.f53038 = c15301;
        if (c15301 != null && this.f53026 && this.f53030) {
            if (c15301.f50017) {
                this.f53032.m54044();
            }
            C11972.m30026(this.f53026);
            C15301 c15302 = this.f53038;
            if (c15302 == null) {
                return;
            }
            this.f53038 = null;
            c15302.m36745(this.f53032);
            this.f53032.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38795(C16332 c16332) {
        C11972.m30026(c16332.f53026);
        C15301 c15301 = c16332.f53038;
        if (c15301 == null) {
            return;
        }
        c16332.f53038 = null;
        c15301.m36745(c16332.f53032);
        c16332.f53032.requestFocus();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        InterfaceMenuC10774 interfaceMenuC10774 = (InterfaceMenuC10774) menu;
        this.f53024 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f53047 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f53048 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f53023 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f53028 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f53022 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f53037 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f53024.setEnabled(this.f53032.m53999());
        this.f53047.setEnabled(this.f53032.m53957());
        this.f53048.setEnabled(this.f53032.m53890());
        this.f53023.setEnabled(!this.f53032.m54083());
        this.f53028.setChecked(this.f53032.m54083());
        this.f53025.m52805(interfaceMenuC10774.findItem(R.id.MT_Protector));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.CharSequence, l.ܳܿ᩸] */
    /* JADX WARN: Type inference failed for: r1v11, types: [l.ܳܿ᩸] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    @Override // l.ComponentCallbacksC11612
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        C10628 c10628;
        C10628 c10629;
        ?? r1;
        if (this.f53031 || this.f53046) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f53032.m53970();
        int itemId = menuItem.getItemId();
        boolean z2 = false;
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f53032.m53953());
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (C18978.m44078() && ApplicationC17729.f58258.getBoolean("cc", true)) {
                z2 = true;
            }
            menuItemFindItem.setChecked(z2);
            this.f53022.setEnabled(this.f53032.m54097());
            this.f53037.setEnabled(this.f53032.m54060());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            String strM36751 = C15306.m36751(m38820());
            if (strM36751.length() > 50) {
                strM36751 = strM36751.substring(0, 50);
            }
            this.f53029.m29186(strM36751 + ".smali");
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f53036.m30404();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (!C18978.m44078()) {
                C22673.m51152(R.string.MT_Protector);
                return true;
            }
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC17729.f58258.edit().putBoolean("cc", menuItem.isChecked()).apply();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC0848 activityC0848 = (ActivityC0848) requireActivity();
            mo24165(activityC0848, true, (Runnable) new RunnableC1219(activityC0848, this, z2));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ((ActivityC0848) requireActivity()).m3430(m38820(), (String) null, (ArrayList) null, false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C24538((ActivityC0848) requireActivity(), C24538.m54820(this.f53032));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C24132 c24132 = this.f53032;
            c24132.m54107(!c24132.m54083());
            menuItem.setChecked(this.f53032.m54083());
            this.f53025.m52826();
            if (this.f53026) {
                this.f53040.m16625();
            }
            this.f53023.setEnabled(!this.f53032.m54083());
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            if (!ApplicationC17729.f58258.getBoolean("ard", true)) {
                m38794();
                return true;
            }
            C2361 c2361BuildDialog = ((ActivityC0848) requireActivity()).buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15621(2, this));
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4353(2, this));
            c2361BuildDialog.m8016();
            return true;
        }
        if (itemId == R.string.MT_Protector) {
            Object objMo14424 = this.f53027.mo14424();
            int[] iArrM53971 = this.f53032.m53971();
            if (iArrM53971[0] == iArrM53971[1] && (objMo14424 instanceof C9685)) {
                C9685 c9685 = (C9685) objMo14424;
                ?? Mo15350 = this.f53032.m54021().mo15350();
                try {
                    int i = iArrM53971[0];
                    int iIndexOf = TextUtils.indexOf((CharSequence) Mo15350, '\n', c9685.m25269() + 1);
                    int iLastIndexOf = TextUtils.lastIndexOf(Mo15350, '\n', c9685.m25268() - 1);
                    if (iIndexOf > i || i > iLastIndexOf) {
                        C22673.m51152(R.string.MT_Protector);
                        Mo15350.close();
                        Mo15350 = Mo15350;
                    } else {
                        String strConcat = ".class Ltest;\n.super Ljava/lang/Object;\n".concat(Mo15350.subSequence(c9685.m25269(), c9685.m25268()));
                        Mo15350.close();
                        String strM46600 = this.f53033.m46600(m38820());
                        C7118 c7118M46609 = this.f53033.m46609(strM46600);
                        C5564 c5564M46596 = this.f53033.m46596(strM46600);
                        try {
                            C8850 c8850M19516 = c7118M46609.m19516();
                            C5122 c5122 = (C5122) C19051.m44161(strConcat, c8850M19516, c7118M46609).getMethods().iterator().next();
                            InterfaceC7140 interfaceC7140Mo13175 = c5122.mo13175();
                            if (interfaceC7140Mo13175 == null) {
                                c10629 = null;
                            } else {
                                z = interfaceC7140Mo13175 instanceof C10628;
                                if (z) {
                                    c10629 = (C10628) interfaceC7140Mo13175;
                                } else {
                                    c10628 = new C10628(interfaceC7140Mo13175);
                                    c10629 = c10628;
                                }
                            }
                            if (c10629 == null) {
                                r1 = c10628;
                                r1 = z;
                                r1 = c8850M19516;
                                C22673.m51152(R.string.MT_Protector);
                                Mo15350 = r1;
                            } else {
                                r1 = c10628;
                                r1 = z;
                                r1 = c8850M19516;
                                C23046 c23046 = new C23046(this, (ActivityC0848) requireActivity(), c10629, c5122, c5564M46596, c9685);
                                c23046.m22945(R.string.MT_Protector);
                                c23046.m22924((CharSequence) "1");
                                c23046.m22948(o.a.b);
                                c23046.m22935(R.string.MT_Protector);
                                c23046.m22929(R.string.MT_Protector);
                                c23046.m22918();
                                Mo15350 = 6;
                                c23046.m22957(6);
                                c23046.m22959();
                                c23046.m22955(true);
                            }
                        } catch (C4511 e) {
                            ((ActivityC0848) requireActivity()).m40401(e, (DialogInterface.OnDismissListener) null);
                            C15301 c15301M36736 = C15301.m36736(e.f16093, e.f16098);
                            C24132 c24133 = this.f53032;
                            c15301M36736.m36745(c24133);
                            Mo15350 = c24133;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Mo15350.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                C22673.m51152(R.string.MT_Protector);
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                mo24175((ActivityC0848) requireActivity());
                return true;
            }
            if (!this.f53025.m52825(menuItem)) {
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
    public static /* synthetic */ void m38772(C16332 c16332) {
        C6421.m18184(ApplicationC17729.f58258, "ard", false);
        c16332.m38794();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m38794() {
        String str;
        Object objMo14424 = this.f53027.mo14424();
        int[] iArrM53971 = this.f53032.m53971();
        if (iArrM53971[0] != iArrM53971[1] || !(objMo14424 instanceof C9685)) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        C9685 c9685 = (C9685) objMo14424;
        C15508 c15508Mo15350 = this.f53032.m54021().mo15350();
        try {
            int i = iArrM53971[0];
            int iIndexOf = TextUtils.indexOf((CharSequence) c15508Mo15350, '\n', c9685.m25269() + 1);
            int iLastIndexOf = TextUtils.lastIndexOf(c15508Mo15350, '\n', c9685.m25268() - 1);
            if (iIndexOf <= i && i <= iLastIndexOf) {
                int iIndexOf2 = TextUtils.indexOf((CharSequence) c15508Mo15350, '\n', i) + 1;
                if (iIndexOf2 != 0) {
                    iLastIndexOf = iIndexOf2;
                }
                String str2 = ".class Ltest;\n.super Ljava/lang/Object;\n" + c15508Mo15350.subSequence(c9685.m25269(), iLastIndexOf) + "  nop\n  .source \"analysis_register_mark\"\n  nop\n" + c15508Mo15350.subSequence(iLastIndexOf, c9685.m25268());
                c15508Mo15350.close();
                C7118 c7118M46609 = this.f53033.m46609(this.f53033.m46600(m38820()));
                try {
                    C5122 c5122 = (C5122) C19051.m44161(str2, c7118M46609.m19516(), c7118M46609).getMethods().iterator().next();
                    InterfaceC7140 interfaceC7140Mo13175 = c5122.mo13175();
                    C10628 c10628 = interfaceC7140Mo13175 != null ? interfaceC7140Mo13175 instanceof C10628 ? (C10628) interfaceC7140Mo13175 : new C10628(interfaceC7140Mo13175) : null;
                    if (c10628 == null) {
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                    try {
                        C24123 c24123 = new C24123(c10628);
                        c24123.m53669();
                        ArrayList arrayList = new ArrayList();
                        int iMo2841 = c10628.mo2841();
                        int i2 = 1 ^ (EnumC2536.STATIC.m8459(c5122.mo13184()) ? 1 : 0);
                        Iterator<E> it = c5122.mo6805().iterator();
                        while (it.hasNext()) {
                            i2 = C23800.m53096(((C21530) it.next()).getType()) ? i2 + 2 : i2 + 1;
                        }
                        int i3 = iMo2841 - i2;
                        Iterator it2 = c24123.m53670().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((C3239) it2.next()).m10594().iterator();
                            while (it3.hasNext()) {
                                C9400 c9400M30863 = ((AbstractC12384) it3.next()).m30863();
                                AbstractC12384 abstractC12384M24749 = c9400M30863.m24749();
                                if (abstractC12384M24749 != null && abstractC12384M24749.mo30864() == EnumC22631.f73424) {
                                    for (AbstractC16113 abstractC16113 : c9400M30863.m24748()) {
                                        if ((abstractC16113 instanceof InterfaceC5431) && "analysis_register_mark".equals(((InterfaceC5431) abstractC16113).mo16161())) {
                                            boolean[] zArrM24746 = c9400M30863.m24746();
                                            for (int i4 = 0; i4 < zArrM24746.length; i4++) {
                                                if (zArrM24746[i4]) {
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
                            C22673.m51152(R.string.MT_Protector);
                            return;
                        }
                        if (this.f53032.m54049()) {
                            str = "\t";
                        } else {
                            char[] cArr = new char[this.f53032.m54057()];
                            Arrays.fill(cArr, ' ');
                            str = new String(cArr);
                        }
                        StringBuilder sbM10405 = C3188.m10405(str, "# ");
                        sbM10405.append(getString(R.string.MT_Protector));
                        sbM10405.append(" ");
                        sbM10405.append(C24276.m54283(arrayList, " "));
                        String string = sbM10405.toString();
                        this.f53032.m54021().insert(iLastIndexOf, string + "\n");
                        this.f53032.mo52339(string.length() + iLastIndexOf);
                        this.f53032.m54065();
                        this.f53032.m53931(false);
                        return;
                    } catch (Exception e) {
                        C22673.m51160(e.toString());
                        return;
                    }
                } catch (C4511 e2) {
                    ((ActivityC0848) requireActivity()).m40401(e2, (DialogInterface.OnDismissListener) null);
                    C15301.m36736(e2.f16093, e2.f16098).m36745(this.f53032);
                    return;
                }
            }
            C22673.m51152(R.string.MT_Protector);
            c15508Mo15350.close();
        } catch (Throwable th) {
            try {
                c15508Mo15350.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC19777 interfaceC19777Mo1447 = mo1447();
        if (interfaceC19777Mo1447 != null) {
            C20062 c20062 = (C20062) interfaceC19777Mo1447;
            c20062.mo34769();
            c20062.mo34768();
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC19777 mo1447() {
        C20283 c20283 = this.f53033;
        if (c20283 == null || this.f53046 || !this.f53026) {
            return null;
        }
        C9378 c9378M24173 = m24173(c20283.m11163());
        if (this.f53031) {
            c9378M24173.m24697();
            return null;
        }
        C24132 c24132 = this.f53032;
        C23582 c23582 = this.f53025;
        if (c24132 == null || c23582 == null) {
            throw new RuntimeException();
        }
        return new C20062(this, c24132, c23582, c9378M24173);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38782(C16332 c16332, C20348 c20348) {
        C17364.m40795((InterfaceC15872) c20348, 1382253409);
        if (c20348.readInt() != c16332.f53033.m46607(c16332.m38820())) {
            return false;
        }
        c16332.f53032.m53992(true);
        try {
            C17364.m40795((InterfaceC15872) c20348, 1382253409);
            c16332.f53032.mo52303(c20348);
            C17364.m40795((InterfaceC15872) c20348, 1382253409);
            c16332.f53025.m52824(c20348);
            C17364.m40795((InterfaceC15872) c20348, 1382253409);
            c16332.f53025.m52813(c20348);
            if (!c16332.f53032.m54021().mo11042()) {
                c16332.f53032.m53929(c16332.m24166(c16332.f53033.m11163()).m24699());
            }
            c16332.f53032.m54055();
            return true;
        } catch (Throwable th) {
            c16332.f53032.m53992(false);
            throw th;
        }
    }

    @Override // l.InterfaceC8940
    /* JADX INFO: renamed from: ۙ */
    public final void mo1434(int i, int i2, String str) {
        if (this.f53026) {
            if (i == 0 && i2 == 0) {
                this.f53042 = null;
            } else if (i == -1 && i2 == -1) {
                this.f53042 = C18969.m44060(100, str);
            } else {
                this.f53042 = String.format("[%d - %d] : %s", Integer.valueOf(this.f53032.m54067(i) + 1), Integer.valueOf(this.f53032.m54067(i2) + 1), C18969.m44060(100, str));
            }
            m38806();
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m38806() {
        C24132 c24132 = this.f53032;
        if (c24132 != null) {
            StringBuilder sb = new StringBuilder();
            int iM53968 = c24132.m53968();
            int iM53882 = c24132.m53882();
            Point pointM53978 = c24132.m53978(iM53968);
            sb.append(pointM53978.x);
            sb.append(':');
            sb.append(pointM53978.y);
            if (iM53968 != iM53882) {
                sb.append(" (");
                sb.append(Math.abs(iM53882 - iM53968));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            sb.append(" │ ");
            sb.append((String) C17359.requireNonNullElse(this.f53042, "..."));
            this.f53035.setText(sb.toString());
        }
    }

    @Override // l.InterfaceC16837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1437() {
        C23582 c23582 = this.f53025;
        if (c23582 == null || !c23582.m52817()) {
            return false;
        }
        this.f53025.m52826();
        this.f53032.m53970();
        return true;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩷ */
    public final void mo24175(final ActivityC0848 activityC0848) {
        if (!this.f29441.getBoolean("changed", false)) {
            m24164(activityC0848);
            return;
        }
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC0848);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8000(R.string.MT_Protector);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟ܰۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = C16332.f53020;
                ActivityC0848 activityC0849 = activityC0848;
                C16332 c16332 = this.f26356;
                c16332.mo24165(activityC0849, false, (Runnable) new RunnableC1219(activityC0849, c16332, true));
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳܰۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f61883.m24164(activityC0848);
            }
        });
        c2361.m8016();
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۙ */
    public final void mo24165(ActivityC0848 activityC0848, boolean z, Runnable runnable) {
        C15586 c15586 = new C15586(runnable);
        if (!mo24170()) {
            c15586.onSuccess();
        } else {
            new C13349(activityC0848, new C17078(activityC0848, this, z), c15586).m8197();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38771(ActivityC0848 activityC0848, C16332 c16332, boolean z) {
        if (z) {
            c16332.m24164(activityC0848);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17583 m38821(ActivityC0848 activityC0848) {
        C11972.m30026(this.f29441.getBoolean("changed", false));
        return new C17078(activityC0848, this, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38818(C20283 c20283, C12318 c12318) {
        if (this.f53026 && !this.f53034 && !C22415.m50557()) {
            for (int i = 0; i < 50 && !this.f53034; i++) {
                SystemClock.sleep(100L);
            }
        }
        if (this.f53026 && this.f53034) {
            return this.f53032.m54021().toString();
        }
        c12318.m30724();
        C9378 c9378M24173 = m24173(c20283.m11163());
        if (!c9378M24173.m24702()) {
            return c20283.m46622(m38820());
        }
        C20348 c20348M46740 = C20348.m46740(c9378M24173.m24700());
        C17364.m40795((InterfaceC15872) c20348M46740, 1382253409);
        if (c20348M46740.readInt() == c20283.m46607(m38820())) {
            C17364.m40795((InterfaceC15872) c20348M46740, 1382253409);
            return C13731.m33555(c20348M46740, m24166(c20283.m11163()).m24699());
        }
        return c20283.m46622(m38820());
    }

    @Override // l.InterfaceC10586
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1439(C20283 c20283) {
        return !c20283.m46617(m38820());
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static void m38807(C16332 c16332) {
        if (c16332.f53026) {
            c16332.f53040.m16625();
        }
    }
}
