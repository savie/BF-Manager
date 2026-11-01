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

/* JADX INFO: renamed from: l.۟ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public class C7236 extends AbstractC22611 implements InterfaceC19601, InterfaceC14850 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f24095;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18895 f24096;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public View f24097;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f24098;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f24099;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f24100;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C8500 f24101;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f24102;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C16839 f24103;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C18377 f24104;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f24105;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6111 f24106;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f24107;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f24108;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public TextView f24109;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f24110;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24111;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public String f24112;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8229 f24113;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f24114;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f24115;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f24116;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f24117;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f24118;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC9720 f24119;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C6382 f24120;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20556 f24121;

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

    public C7236() {
        super(R.layout.MT_Protector);
        this.f24117 = 0L;
        setHasOptionsMenu(true);
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܶ */
    public final String mo3620() {
        if (this.f24112 == null) {
            this.f24112 = C13012.m32189(80, C22627.m50150(m19346()));
        }
        return this.f24112;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۘ */
    public final String mo3615() {
        if (!this.f73689.getBoolean("changed", false)) {
            return mo3620();
        }
        return "*" + mo3620();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m19347() {
        if (this.f24100 == null) {
            String[] strArrSplit = m19346().split("/");
            if (strArrSplit.length == 3) {
                if (strArrSplit[2].equals("type-info")) {
                    this.f24100 = C13012.m32189(80, m19346()) + ".xml";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C13012.m32189(80, strArrSplit[0] + "/" + strArrSplit[2]));
                    sb.append(".xml");
                    this.f24100 = sb.toString();
                }
            } else {
                this.f24100 = C13012.m32189(80, m19346()) + ".xml";
            }
        }
        return this.f24100;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۬ */
    public final String mo3618() {
        return C13012.m32189(150, m19346());
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo19351() {
        return this.f73689.getBoolean("changed", false);
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19344(C18377 c18377) {
        c18377.m42650(m19346());
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m19346() {
        String string = requireArguments().getString(MotionUtils.EASING_TYPE_PATH);
        C13638.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19349(String str) {
        m50133((String) null);
        requireArguments().putString(MotionUtils.EASING_TYPE_PATH, str);
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24104 = (C18377) new C16717(requireActivity()).m39205(C18377.class);
        this.f24120 = (C6382) new C16717(requireActivity()).m39205(C6382.class);
        String[] strArrSplit = m19346().split("/");
        if (strArrSplit.length != 3 || strArrSplit[2].equals("type-info")) {
            this.f24118 = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(strArrSplit[0]);
            sb.append("/");
            this.f24118 = C22697.m50267(sb, strArrSplit[1], "/type-info");
        }
        this.f24096 = C8312.m21739(this, new C13455(this));
        if (bundle != null) {
            this.f24117 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f24114 = false;
        this.f24097 = view.findViewById(R.id.MT_Protector);
        this.f24106 = (C6111) view.findViewById(R.id.MT_Protector);
        this.f24098 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f24109 = (TextView) view.findViewById(R.id.MT_Protector);
        C20556 c20556 = new C20556((ActivityC5677) requireActivity(), this.f24106, view);
        this.f24121 = c20556;
        c20556.m46370("edit_word_wrap_xml", false);
        this.f24103 = new C16839(view, this.f24106);
        this.f24121.m46371(getViewLifecycleOwner(), this.f24103, ActivityC14081.class);
        this.f24106.m16868(new C2296(this));
        this.f24106.m16864(new InterfaceC7191() { // from class: l.ܳۗۘ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ */
            public final void mo4041(int i, int i2) {
                this.f46658.m19332();
            }
        });
        this.f24106.m16862(new C5119(this));
        this.f24106.m16879((InterfaceC19517) new C19231(this));
        this.f24106.m16865(new C0885(this));
        if (this.f24118 != null) {
            this.f24106.m16867(new C9310(this));
        }
        this.f24098.setText(mo3615());
        if (this.f73689.getBoolean("changed", false)) {
            this.f24098.setTextColor(C20368.f66005);
        }
        this.f24098.setOnClickListener(new ViewOnClickListenerC6378(2, this));
        this.f24098.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۗۗۘ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C7236 c7236 = this.f11087;
                C8067 c8067BuildDialog = ((ActivityC5677) c7236.requireActivity()).buildDialog();
                c8067BuildDialog.m21261(c7236.m19346().concat(".xml"));
                c8067BuildDialog.m21269();
                return true;
            }
        });
        this.f24109.setText("...");
        this.f24116 = true;
        this.f24103.m39492();
        this.f24104.m42658().m44959(getViewLifecycleOwner(), new C4413(0, this));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m19325() {
        new C6530(this, (ActivityC5677) requireActivity(), m50129(), C11904.f39938.m46690("xmlTrans")).m10243();
    }

    @Override // l.ComponentCallbacksC22654
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM15651 = ((ActivityC5677) requireActivity()).m15651(R.layout.MT_Protector);
        if (viewM15651 == null) {
            viewM15651 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C13638.requireNonNull(viewM15651);
        }
        C16737.m39274(new RunnableC7981(4, this), 600L);
        return viewM15651;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19292(C7236 c7236) {
        int iM16916 = c7236.f24106.m16916();
        int iM17020 = c7236.f24106.m17020();
        if (iM16916 > iM17020) {
            iM17020 = iM16916;
            iM16916 = iM17020;
        }
        C3329 c3329Mo2399 = c7236.f24106.m17000().mo2399();
        try {
            int iM19290 = m19290(iM16916 - 1, (CharSequence) c3329Mo2399, true);
            int iM19291 = m19290(iM17020, (CharSequence) c3329Mo2399, false);
            if (iM19290 != -1 && iM19291 != -1 && m19302(iM19290 - 1, c3329Mo2399)) {
                int iM21599 = c7236.f24113.m21599(c7236.f24118, c3329Mo2399.subSequence(iM19290 + 1, iM19291));
                String str = iM21599 == -1 ? null : String.format("%08x", Integer.valueOf(iM21599));
                if (str != null) {
                    String strConcat = "@".concat(str);
                    c3329Mo2399.close();
                    return strConcat;
                }
            }
            c3329Mo2399.close();
            return c7236.f24106.m17016();
        } catch (Throwable th) {
            try {
                c3329Mo2399.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19297(C7236 c7236, MenuItem menuItem) {
        if (menuItem.getGroupId() == R.string.MT_Protector) {
            if (menuItem.getItemId() == 0) {
                C16737.m39272((CharSequence) (C6730.m18175(c7236.m19346()) + ".xml"));
                return;
            }
            C16737.m39272((CharSequence) c7236.m19346().concat(".xml"));
            return;
        }
        c7236.f24104.m42650(c7236.m19346());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19300(C7236 c7236, C8229 c8229) {
        c7236.f24113 = c8229;
        if (!c7236.f24116) {
            c7236.f24110 = true;
        } else {
            new C3707(c7236, c7236.m19346()).m10243();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void m19332() {
        StringBuilder sb = new StringBuilder();
        C6111 c6111 = this.f24106;
        TextView textView = this.f24109;
        if (c6111 != null) {
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
            textView.setText(sb.toString());
        }
    }

    @Override // l.InterfaceC14850
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19345(C8229 c8229) {
        return !c8229.m21609(m19346());
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6111 mo19352() {
        if (this.f24107) {
            throw new IllegalStateException("Text storage is still loading");
        }
        if (this.f24116) {
            return this.f24106;
        }
        return null;
    }

    @Override // l.ComponentCallbacksC22654
    public final void onDestroyView() {
        super.onDestroyView();
        this.f24116 = false;
        C6111 c6111 = this.f24106;
        if (c6111 != null) {
            c6111.m16940();
        }
        C20556 c20556 = this.f24121;
        if (c20556 != null) {
            c20556.m46365();
        }
        this.f24097 = null;
        this.f24103 = null;
        this.f24106 = null;
        this.f24121 = null;
        this.f24098 = null;
        this.f24109 = null;
        this.f24105 = null;
        this.f24108 = null;
        this.f24119 = null;
        this.f24102 = null;
        this.f24099 = null;
        this.f24115 = null;
        this.f24095 = null;
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle((CharSequence) null);
        ((ActivityC5677) requireActivity()).m15657((CharSequence) null);
        ((ActivityC5677) requireActivity()).m31019(this.f24106);
        C20556 c20556 = this.f24121;
        if (c20556 != null && c20556.m46379() && this.f24116) {
            this.f24103.m39492();
        }
        m19334();
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onPause() {
        super.onPause();
        C6111 c6111 = this.f24106;
        if (c6111 != null) {
            c6111.m16915();
        }
        ((ActivityC5677) requireActivity()).m31015();
    }

    @Override // l.ComponentCallbacksC22654, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C6111 c6111 = this.f24106;
        if (c6111 != null) {
            c6111.m16915();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19343(C8500 c8500) {
        this.f24101 = c8500;
        if (c8500 != null && this.f24116 && this.f24114) {
            if (c8500.f29474) {
                this.f24106.m16934();
            }
            C6171.m17176(this.f24116);
            C8500 c8501 = this.f24101;
            if (c8501 == null) {
                return;
            }
            this.f24101 = null;
            c8501.m22227(this.f24106);
            this.f24106.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m19326(C7236 c7236) {
        C6171.m17176(c7236.f24116);
        C8500 c8500 = c7236.f24101;
        if (c8500 == null) {
            return;
        }
        c7236.f24101 = null;
        c8500.m22227(c7236.f24106);
        c7236.f24106.requestFocus();
    }

    @Override // l.ComponentCallbacksC22654
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        InterfaceMenuC1957 interfaceMenuC1957 = (InterfaceMenuC1957) menu;
        interfaceMenuC1957.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC1957.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC1957.findItem(R.id.MT_Protector).setVisible(false);
        interfaceMenuC1957.findItem(R.id.MT_Protector).setVisible(false);
        this.f24095 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f24115 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f24099 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f24102 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f24119 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f24108 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f24105 = (InterfaceMenuItemC9720) interfaceMenuC1957.findItem(R.id.MT_Protector);
        this.f24095.setEnabled(this.f24106.m17037());
        this.f24115.setEnabled(this.f24106.m16938());
        this.f24099.setEnabled(this.f24106.m17040());
        this.f24102.setEnabled(!this.f24106.m17004());
        this.f24119.setChecked(this.f24106.m17004());
        this.f24121.m46367(interfaceMenuC1957.findItem(R.id.MT_Protector));
    }

    @Override // l.ComponentCallbacksC22654
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f24111 || this.f24107) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f24106.m16999());
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(C23428.m51593((GetChars) this.f24106.m17000()));
            this.f24108.setEnabled(this.f24106.m17025());
            this.f24105.setEnabled(this.f24106.m16932());
            return true;
        }
        boolean z = false;
        if (itemId == R.id.MT_Protector) {
            String strM50150 = C22627.m50150(m19346());
            if (strM50150.length() > 20) {
                strM50150 = strM50150.substring(0, 20);
            }
            this.f24096.m43563(strM50150 + ".xml");
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            ActivityC5677 activityC5677 = (ActivityC5677) requireActivity();
            mo19342(activityC5677, true, (Runnable) new RunnableC13587(activityC5677, this, z));
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C6111 c6111 = this.f24106;
            c6111.m17065(!c6111.m17004());
            menuItem.setChecked(this.f24106.m17004());
            this.f24121.m46378();
            if (this.f24116) {
                this.f24103.m39492();
            }
            this.f24102.setEnabled(!this.f24106.m17004());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo19350((ActivityC5677) requireActivity());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m19325();
            return true;
        }
        if (this.f24121.m46383(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m19334() {
        if (this.f24117 == 0 || !isVisible()) {
            return;
        }
        if (!this.f24116 || !this.f24114 || this.f24111) {
            C16737.m39274(new RunnableC14990(5, this), 100L);
            return;
        }
        AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("xmlTrans");
        if (!abstractC20745M46690.mo33975() || abstractC20745M46690.mo33991() == this.f24117) {
            this.f24117 = 0L;
            return;
        }
        try {
            C15676 c15676M22397 = AbstractC8620.m22397(abstractC20745M46690.m46730(), EnumC9326.OrderedField);
            if (m50129().equals(c15676M22397.m37351("<--id-c5skl23kjndf-->"))) {
                C23428.m51592(c15676M22397, this.f24106.m17000());
                this.f24106.m16886(false);
            }
        } catch (Exception unused) {
        } finally {
            this.f24117 = 0L;
        }
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC19083 interfaceC19083Mo19340 = mo19340();
        if (interfaceC19083Mo19340 != null) {
            C22759 c22759 = (C22759) interfaceC19083Mo19340;
            c22759.mo30475();
            c22759.mo30474();
        }
        bundle.putLong("xmlTransFileTime", this.f24117);
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19083 mo19340() {
        C8229 c8229 = this.f24113;
        if (c8229 == null || this.f24107 || !this.f24116) {
            return null;
        }
        C13626 c13626M50132 = m50132(c8229.m47183());
        if (this.f24111) {
            c13626M50132.m33323();
            return null;
        }
        C6111 c6111 = this.f24106;
        C20556 c20556 = this.f24121;
        if (c6111 == null || c20556 == null) {
            throw new RuntimeException();
        }
        return new C22759(this, c6111, c20556, c13626M50132);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19304(C7236 c7236, C17367 c17367) {
        C20190.m45649((InterfaceC0433) c17367, 1382253410);
        if (c17367.readInt() != c7236.f24113.m21597(c7236.m19346())) {
            return false;
        }
        c7236.f24106.m16922(true);
        try {
            C20190.m45649((InterfaceC0433) c17367, 1382253410);
            c7236.f24106.mo16878(c17367);
            C20190.m45649((InterfaceC0433) c17367, 1382253410);
            c7236.f24121.m46382(c17367);
            C20190.m45649((InterfaceC0433) c17367, 1382253410);
            c7236.f24121.m46375(c17367);
            if (!c7236.f24106.m17000().mo8731()) {
                c7236.f24106.m16882(c7236.m50130(c7236.f24113.m47183()).m33318());
            }
            c7236.f24106.m16998();
            return true;
        } catch (Throwable th) {
            c7236.f24106.m16922(false);
            throw th;
        }
    }

    @Override // l.InterfaceC19601
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3616() {
        C20556 c20556 = this.f24121;
        if (c20556 == null || !c20556.m46385()) {
            return false;
        }
        this.f24121.m46378();
        this.f24106.m16915();
        return true;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo19350(final ActivityC5677 activityC5677) {
        if (!this.f73689.getBoolean("changed", false)) {
            m50126(activityC5677);
            return;
        }
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC5677);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21253(R.string.MT_Protector);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۙۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC5677 activityC5678 = activityC5677;
                C7236 c7236 = this.f38617;
                c7236.mo19342(activityC5678, false, (Runnable) new RunnableC13587(activityC5678, c7236, true));
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC14537(4, this, activityC5677));
        c8067.m21269();
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19342(ActivityC5677 activityC5677, boolean z, Runnable runnable) {
        C14998 c14998 = new C14998(runnable);
        if (!mo19351()) {
            c14998.onSuccess();
        } else {
            new C21347(activityC5677, new C10059(activityC5677, this, z), c14998).m10243();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19295(ActivityC5677 activityC5677, C7236 c7236, boolean z) {
        if (z) {
            c7236.m50126(activityC5677);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9018 m19348(ActivityC5677 activityC5677) {
        C6171.m17176(this.f73689.getBoolean("changed", false));
        return new C10059(activityC5677, this, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m19341(C8229 c8229, C6382 c6382) {
        if (this.f24116 && !this.f24110 && !C13890.m33728()) {
            for (int i = 0; i < 50 && !this.f24110; i++) {
                SystemClock.sleep(100L);
            }
        }
        if (this.f24116 && this.f24110) {
            return this.f24106.m17000().toString();
        }
        c6382.m17521();
        C13626 c13626M50132 = m50132(c8229.m47183());
        if (!c13626M50132.m33326()) {
            return c8229.m21568(m19346());
        }
        C17367 c17367M40441 = C17367.m40441(c13626M50132.m33327());
        C20190.m45649((InterfaceC0433) c17367M40441, 1382253410);
        if (c17367M40441.readInt() == c8229.m21597(m19346())) {
            C20190.m45649((InterfaceC0433) c17367M40441, 1382253410);
            return C13167.m32559(c17367M40441, m50130(c8229.m47183()).m33318());
        }
        return c8229.m21568(m19346());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19293(C7236 c7236, String str) {
        int iM21599 = c7236.f24113.m21599(c7236.f24118, str);
        if (iM21599 == -1) {
            return null;
        }
        return String.format("%08x", Integer.valueOf(iM21599));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19291(C3329 c3329, int i, boolean z) {
        int iLastIndexOf = z ? TextUtils.lastIndexOf(c3329, '>', i) : TextUtils.indexOf((CharSequence) c3329, '<', i);
        if (iLastIndexOf != -1 && (!z ? TextUtils.indexOf((CharSequence) c3329, '\n', i, iLastIndexOf) != -1 : TextUtils.indexOf((CharSequence) c3329, '\n', iLastIndexOf, i) != -1)) {
            return iLastIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19290(int i, CharSequence charSequence, boolean z) {
        int iLastIndexOf = z ? TextUtils.lastIndexOf(charSequence, '\"', i) : TextUtils.indexOf(charSequence, '\"', i);
        if (iLastIndexOf != -1 && (!z ? TextUtils.indexOf(charSequence, '\n', i, iLastIndexOf) != -1 : TextUtils.indexOf(charSequence, '\n', iLastIndexOf, i) != -1)) {
            return iLastIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19302(int i, CharSequence charSequence) {
        C8648 c8648 = new C8648(i, charSequence);
        String strM22450 = c8648.m22450();
        if (strM22450.equals("=")) {
            strM22450 = C22697.m50267(new StringBuilder(), c8648.m22450(), strM22450);
        }
        return strM22450.equals("name=") && !c8648.m22450().equals("<item");
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static void m19283(C7236 c7236) {
        if (c7236.f24116) {
            c7236.f24103.m39492();
        }
    }
}
