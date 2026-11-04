package l;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.GetChars;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public class C25350 extends AbstractC9051 implements InterfaceC16837, InterfaceC14555 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11967 f81831;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C24132 f81832;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f81833;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f81834;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C22761 f81835;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f81836;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public TextView f81837;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f81838;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f81839;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C11616 f81840;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C23582 f81841;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f81842;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f81843;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C5639 f81844;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f81845;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f81846;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f81847;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC22709 f81848;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public String f81849;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f81850;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f81851;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C15301 f81852;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f81853;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f81854;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public View f81855;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f81856;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C12318 f81857;

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

    public C25350() {
        super(R.layout.MT_Protector);
        this.f81853 = 0L;
        setHasOptionsMenu(true);
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܺ */
    public final String mo1445() {
        if (this.f81849 == null) {
            this.f81849 = C18969.m44060(80, C15306.m36751(m56683()));
        }
        return this.f81849;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۚ */
    public final String mo1440() {
        if (!this.f29441.getBoolean("changed", false)) {
            return mo1445();
        }
        return "*" + mo1445();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m56680() {
        if (this.f81836 == null) {
            String[] strArrSplit = m56683().split("/");
            if (strArrSplit.length == 3) {
                if (strArrSplit[2].equals("type-info")) {
                    this.f81836 = C18969.m44060(80, m56683()) + ".xml";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C18969.m44060(80, strArrSplit[0] + "/" + strArrSplit[2]));
                    sb.append(".xml");
                    this.f81836 = sb.toString();
                }
            } else {
                this.f81836 = C18969.m44060(80, m56683()) + ".xml";
            }
        }
        return this.f81836;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۫ */
    public final String mo1443() {
        return C18969.m44060(150, m56683());
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo24170() {
        return this.f29441.getBoolean("changed", false);
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۙ */
    public final void mo1436(C22761 c22761) {
        c22761.m51327(m56683());
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m56683() {
        String string = requireArguments().getString(MotionUtils.EASING_TYPE_PATH);
        C17359.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m56682(String str) {
        m24174((String) null);
        requireArguments().putString(MotionUtils.EASING_TYPE_PATH, str);
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f81835 = (C22761) new C16196(requireActivity()).m38422(C22761.class);
        this.f81857 = (C12318) new C16196(requireActivity()).m38422(C12318.class);
        String[] strArrSplit = m56683().split("/");
        if (strArrSplit.length != 3 || strArrSplit[2].equals("type-info")) {
            this.f81850 = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(strArrSplit[0]);
            sb.append("/");
            this.f81850 = C8947.m23910(sb, strArrSplit[1], "/type-info");
        }
        this.f81840 = C25043.m55863(this, new C8742(this));
        if (bundle != null) {
            this.f81853 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f81851 = false;
        this.f81855 = view.findViewById(R.id.MT_Protector);
        this.f81832 = (C24132) view.findViewById(R.id.MT_Protector);
        this.f81846 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f81837 = (TextView) view.findViewById(R.id.MT_Protector);
        C23582 c23582 = new C23582((ActivityC0848) requireActivity(), this.f81832, view);
        this.f81841 = c23582;
        c23582.m52808("edit_word_wrap_xml", false);
        this.f81844 = new C5639(view, this.f81832);
        this.f81841.m52810(getViewLifecycleOwner(), this.f81844, ActivityC7261.class);
        this.f81832.m53912(new C1263(this));
        this.f81832.m53913(new C15991(1, this));
        this.f81832.m53927(new C9465(this));
        this.f81832.m53909((InterfaceC5486) new C5958(this));
        this.f81832.m53916(new C8720(this));
        if (this.f81850 != null) {
            this.f81832.m53925(new C18416(this));
        }
        this.f81846.setText(mo1440());
        if (this.f29441.getBoolean("changed", false)) {
            this.f81846.setTextColor(C3296.f10764);
        }
        this.f81846.setOnClickListener(new ViewOnClickListenerC20498(1, this));
        this.f81846.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֡ܶۧ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C25350 c25350 = this.f2205;
                C2361 c2361BuildDialog = ((ActivityC0848) c25350.requireActivity()).buildDialog();
                c2361BuildDialog.m8008(c25350.m56683().concat(".xml"));
                c2361BuildDialog.m8016();
                return true;
            }
        });
        this.f81837.setText("...");
        this.f81856 = true;
        this.f81844.m16625();
        this.f81835.m51322().m40350(getViewLifecycleOwner(), new InterfaceC16438() { // from class: l.۟ܶۧ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C25350.m56637(this.f26509, (C11967) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m56654() {
        new C5212(this, (ActivityC0848) requireActivity(), m24161(), C6382.f21568.m49876("xmlTrans")).m8197();
    }

    @Override // l.ComponentCallbacksC11612
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM3434 = ((ActivityC0848) requireActivity()).m3434(R.layout.MT_Protector);
        if (viewM3434 == null) {
            viewM3434 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C17359.requireNonNull(viewM3434);
        }
        C21576.m49069(new RunnableC21244(3, this), 600L);
        return viewM3434;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56630(C25350 c25350) {
        int iM53968 = c25350.f81832.m53968();
        int iM53882 = c25350.f81832.m53882();
        if (iM53968 > iM53882) {
            iM53882 = iM53968;
            iM53968 = iM53882;
        }
        C15508 c15508Mo15350 = c25350.f81832.m54021().mo15350();
        try {
            int iM56628 = m56628((CharSequence) c15508Mo15350, iM53968 - 1, true);
            int iM56629 = m56628((CharSequence) c15508Mo15350, iM53882, false);
            if (iM56628 != -1 && iM56629 != -1 && m56640(iM56628 - 1, c15508Mo15350)) {
                int iM30003 = c25350.f81831.m30003(c25350.f81850, c15508Mo15350.subSequence(iM56628 + 1, iM56629));
                String str = iM30003 == -1 ? null : String.format("%08x", Integer.valueOf(iM30003));
                if (str != null) {
                    String strConcat = "@".concat(str);
                    c15508Mo15350.close();
                    return strConcat;
                }
            }
            c15508Mo15350.close();
            return c25350.f81832.m53870();
        } catch (Throwable th) {
            try {
                c15508Mo15350.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m56635(C25350 c25350, MenuItem menuItem) {
        if (menuItem.getGroupId() == R.string.MT_Protector) {
            if (menuItem.getItemId() == 0) {
                C21576.m49067((CharSequence) (C11293.m28558(c25350.m56683()) + ".xml"));
                return;
            }
            C21576.m49067((CharSequence) c25350.m56683().concat(".xml"));
            return;
        }
        c25350.f81835.m51327(c25350.m56683());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56637(C25350 c25350, C11967 c11967) {
        c25350.f81831 = c11967;
        if (!c25350.f81856) {
            c25350.f81854 = true;
        } else {
            new C13940(c25350, c25350.m56683()).m8197();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void m56666() {
        StringBuilder sb = new StringBuilder();
        C24132 c24132 = this.f81832;
        TextView textView = this.f81837;
        if (c24132 != null) {
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
            textView.setText(sb.toString());
        }
    }

    @Override // l.InterfaceC14555
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo35102(C11967 c11967) {
        return !c11967.m30009(m56683());
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۧ */
    public final C24132 mo1442() {
        if (this.f81843) {
            throw new IllegalStateException("Text storage is still loading");
        }
        if (this.f81856) {
            return this.f81832;
        }
        return null;
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        super.onDestroyView();
        this.f81856 = false;
        C24132 c24132 = this.f81832;
        if (c24132 != null) {
            c24132.m53966();
        }
        C23582 c23582 = this.f81841;
        if (c23582 != null) {
            c23582.m52821();
        }
        this.f81855 = null;
        this.f81844 = null;
        this.f81832 = null;
        this.f81841 = null;
        this.f81846 = null;
        this.f81837 = null;
        this.f81838 = null;
        this.f81839 = null;
        this.f81847 = null;
        this.f81842 = null;
        this.f81833 = null;
        this.f81848 = null;
        this.f81845 = null;
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle((CharSequence) null);
        ((ActivityC0848) requireActivity()).m3428((CharSequence) null);
        ((ActivityC0848) requireActivity()).m40419(this.f81832);
        C23582 c23582 = this.f81841;
        if (c23582 != null && c23582.m52804() && this.f81856) {
            this.f81844.m16625();
        }
        m56626();
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onPause() {
        super.onPause();
        C24132 c24132 = this.f81832;
        if (c24132 != null) {
            c24132.m53970();
        }
        ((ActivityC0848) requireActivity()).m40414();
    }

    @Override // l.ComponentCallbacksC11612, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C24132 c24132 = this.f81832;
        if (c24132 != null) {
            c24132.m53970();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56679(C15301 c15301) {
        this.f81852 = c15301;
        if (c15301 != null && this.f81856 && this.f81851) {
            if (c15301.f50017) {
                this.f81832.m54044();
            }
            C11972.m30026(this.f81856);
            C15301 c15302 = this.f81852;
            if (c15302 == null) {
                return;
            }
            this.f81852 = null;
            c15302.m36745(this.f81832);
            this.f81832.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m56655(C25350 c25350) {
        C11972.m30026(c25350.f81856);
        C15301 c15301 = c25350.f81852;
        if (c15301 == null) {
            return;
        }
        c25350.f81852 = null;
        c15301.m36745(c25350.f81832);
        c25350.f81832.requestFocus();
    }

    @Override // l.ComponentCallbacksC11612
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        InterfaceMenuC10774 interfaceMenuC10774 = (InterfaceMenuC10774) menu;
        interfaceMenuC10774.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC10774.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC10774.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC10774.findItem(R.id.MT_Protector).setVisible(false);
        this.f81845 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f81848 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f81833 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f81842 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f81847 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f81839 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f81838 = (InterfaceMenuItemC22709) interfaceMenuC10774.findItem(R.id.MT_Protector);
        this.f81845.setEnabled(this.f81832.m53999());
        this.f81848.setEnabled(this.f81832.m53957());
        this.f81833.setEnabled(this.f81832.m53890());
        this.f81842.setEnabled(!this.f81832.m54083());
        this.f81847.setChecked(this.f81832.m54083());
        this.f81841.m52805(interfaceMenuC10774.findItem(R.id.MT_Protector));
    }

    @Override // l.ComponentCallbacksC11612
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f81834 || this.f81843) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f81832.m53953());
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C9398.m24740((GetChars) this.f81832.m54021()));
            this.f81839.setEnabled(this.f81832.m54097());
            this.f81838.setEnabled(this.f81832.m54060());
            return true;
        }
        boolean z = false;
        if (itemId == R.id.MT_Protector) {
            String strM36751 = C15306.m36751(m56683());
            if (strM36751.length() > 20) {
                strM36751 = strM36751.substring(0, 20);
            }
            this.f81840.m29186(strM36751 + ".xml");
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC0848 activityC0848 = (ActivityC0848) requireActivity();
            mo24165(activityC0848, true, (Runnable) new RunnableC19162(activityC0848, this, z));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C24132 c24132 = this.f81832;
            c24132.m54107(!c24132.m54083());
            menuItem.setChecked(this.f81832.m54083());
            this.f81841.m52826();
            if (this.f81856) {
                this.f81844.m16625();
            }
            this.f81842.setEnabled(!this.f81832.m54083());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo24175((ActivityC0848) requireActivity());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m56654();
            return true;
        }
        if (this.f81841.m52825(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m56626() {
        if (this.f81853 == 0 || !isVisible()) {
            return;
        }
        if (!this.f81856 || !this.f81851 || this.f81834) {
            C21576.m49069(new RunnableC7570(2, this), 100L);
            return;
        }
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("xmlTrans");
        if (!abstractC22044M49876.mo2934() || abstractC22044M49876.mo4286() == this.f81853) {
            this.f81853 = 0L;
            return;
        }
        try {
            C14691 c14691M30926 = AbstractC12454.m30926(abstractC22044M49876.m49871(), EnumC7234.OrderedField);
            if (m24161().equals(c14691M30926.m35343("<--id-c5skl23kjndf-->"))) {
                C9398.m24739(c14691M30926, this.f81832.m54021());
                this.f81832.m53931(false);
            }
        } catch (Exception unused) {
        } finally {
            this.f81853 = 0L;
        }
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC19777 interfaceC19777Mo1447 = mo1447();
        if (interfaceC19777Mo1447 != null) {
            C22366 c22366 = (C22366) interfaceC19777Mo1447;
            c22366.mo34769();
            c22366.mo34768();
        }
        bundle.putLong("xmlTransFileTime", this.f81853);
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC19777 mo1447() {
        C11967 c11967 = this.f81831;
        if (c11967 == null || this.f81843 || !this.f81856) {
            return null;
        }
        C9378 c9378M24173 = m24173(c11967.m11163());
        if (this.f81834) {
            c9378M24173.m24697();
            return null;
        }
        C24132 c24132 = this.f81832;
        C23582 c23582 = this.f81841;
        if (c24132 == null || c23582 == null) {
            throw new RuntimeException();
        }
        return new C22366(this, c24132, c23582, c9378M24173);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56642(C25350 c25350, C20348 c20348) {
        C17364.m40795((InterfaceC15872) c20348, 1382253410);
        if (c20348.readInt() != c25350.f81831.m29987(c25350.m56683())) {
            return false;
        }
        c25350.f81832.m53992(true);
        try {
            C17364.m40795((InterfaceC15872) c20348, 1382253410);
            c25350.f81832.mo52303(c20348);
            C17364.m40795((InterfaceC15872) c20348, 1382253410);
            c25350.f81841.m52824(c20348);
            C17364.m40795((InterfaceC15872) c20348, 1382253410);
            c25350.f81841.m52813(c20348);
            if (!c25350.f81832.m54021().mo11042()) {
                c25350.f81832.m53929(c25350.m24166(c25350.f81831.m11163()).m24699());
            }
            c25350.f81832.m54055();
            return true;
        } catch (Throwable th) {
            c25350.f81832.m53992(false);
            throw th;
        }
    }

    @Override // l.InterfaceC16837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1437() {
        C23582 c23582 = this.f81841;
        if (c23582 == null || !c23582.m52817()) {
            return false;
        }
        this.f81841.m52826();
        this.f81832.m53970();
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
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢܶۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC0848 activityC0849 = activityC0848;
                C25350 c25350 = this.f32652;
                c25350.mo24165(activityC0849, false, (Runnable) new RunnableC19162(activityC0849, c25350, true));
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10463(2, this, activityC0848));
        c2361.m8016();
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۙ */
    public final void mo24165(ActivityC0848 activityC0848, boolean z, Runnable runnable) {
        C11177 c11177 = new C11177(runnable);
        if (!mo24170()) {
            c11177.onSuccess();
        } else {
            new C23112(activityC0848, new C11923(activityC0848, this, z), c11177).m8197();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m56633(ActivityC0848 activityC0848, C25350 c25350, boolean z) {
        if (z) {
            c25350.m24164(activityC0848);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17583 m56681(ActivityC0848 activityC0848) {
        C11972.m30026(this.f29441.getBoolean("changed", false));
        return new C11923(activityC0848, this, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m56678(C11967 c11967, C12318 c12318) {
        if (this.f81856 && !this.f81854 && !C22415.m50557()) {
            for (int i = 0; i < 50 && !this.f81854; i++) {
                SystemClock.sleep(100L);
            }
        }
        if (this.f81856 && this.f81854) {
            return this.f81832.m54021().toString();
        }
        c12318.m30724();
        C9378 c9378M24173 = m24173(c11967.m11163());
        if (!c9378M24173.m24702()) {
            return c11967.m29993(m56683());
        }
        C20348 c20348M46740 = C20348.m46740(c9378M24173.m24700());
        C17364.m40795((InterfaceC15872) c20348M46740, 1382253410);
        if (c20348M46740.readInt() == c11967.m29987(m56683())) {
            C17364.m40795((InterfaceC15872) c20348M46740, 1382253410);
            return C13731.m33555(c20348M46740, m24166(c11967.m11163()).m24699());
        }
        return c11967.m29993(m56683());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56631(C25350 c25350, String str) {
        int iM30003 = c25350.f81831.m30003(c25350.f81850, str);
        if (iM30003 == -1) {
            return null;
        }
        return String.format("%08x", Integer.valueOf(iM30003));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m56629(C15508 c15508, int i, boolean z) {
        int iLastIndexOf = z ? TextUtils.lastIndexOf(c15508, '>', i) : TextUtils.indexOf((CharSequence) c15508, '<', i);
        if (iLastIndexOf != -1 && (!z ? TextUtils.indexOf((CharSequence) c15508, '\n', i, iLastIndexOf) != -1 : TextUtils.indexOf((CharSequence) c15508, '\n', iLastIndexOf, i) != -1)) {
            return iLastIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m56628(CharSequence charSequence, int i, boolean z) {
        int iLastIndexOf = z ? TextUtils.lastIndexOf(charSequence, '\"', i) : TextUtils.indexOf(charSequence, '\"', i);
        if (iLastIndexOf != -1 && (!z ? TextUtils.indexOf(charSequence, '\n', i, iLastIndexOf) != -1 : TextUtils.indexOf(charSequence, '\n', iLastIndexOf, i) != -1)) {
            return iLastIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56640(int i, CharSequence charSequence) {
        C2229 c2229 = new C2229(i, charSequence);
        String strM7619 = c2229.m7619();
        if (strM7619.equals("=")) {
            strM7619 = C8947.m23910(new StringBuilder(), c2229.m7619(), strM7619);
        }
        return strM7619.equals("name=") && !c2229.m7619().equals("<item");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m56661(C25350 c25350) {
        if (c25350.f81856) {
            c25350.f81844.m16625();
        }
    }
}
