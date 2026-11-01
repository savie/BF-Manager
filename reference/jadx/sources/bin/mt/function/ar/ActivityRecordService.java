package bin.mt.function.ar;

import android.accessibilityservice.AccessibilityService;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import l.ApplicationC0716;
import l.C1174;
import l.C12418;
import l.C13012;
import l.C16195;
import l.C16737;
import l.C1679;
import l.C22342;
import l.C23648;
import l.C2666;
import l.C5950;
import l.C6696;
import l.C7312;
import l.InterfaceC10890;
import l.InterfaceC21133;
import l.InterfaceC6025;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRecordService extends AccessibilityService implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile WeakReference f14;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C1174 f17;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f18;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public TextView f19;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f20;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C7312 f21;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f22;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f23;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final LinkedList f16 = new LinkedList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f15 = ApplicationC0716.f2992.getBoolean("activity_record", false);

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m46() {
        return f15;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44(boolean z) {
        if (f15 != z) {
            f15 = z;
            C1679.m5597(ApplicationC0716.f2992, "activity_record", z);
            ActivityRecordService activityRecordServiceM42 = m42();
            if (activityRecordServiceM42 != null) {
                if (z) {
                    activityRecordServiceM42.f24 = false;
                }
                if (z && ApplicationC0716.f2992.getBoolean("activity_record_floating_enable", true)) {
                    activityRecordServiceM42.f21.m19514();
                } else {
                    activityRecordServiceM42.f21.m19513();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m40() {
        ActivityRecordService activityRecordServiceM42 = m42();
        if (activityRecordServiceM42 != null) {
            activityRecordServiceM42.m47();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m49() {
        ActivityRecordService activityRecordServiceM42 = m42();
        if (activityRecordServiceM42 != null) {
            activityRecordServiceM42.f21.m19514();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m48() {
        ActivityRecordService activityRecordServiceM42 = m42();
        if (activityRecordServiceM42 != null) {
            activityRecordServiceM42.f21.m19513();
            activityRecordServiceM42.f24 = false;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m41() {
        ActivityRecordService activityRecordServiceM42 = m42();
        if (activityRecordServiceM42 != null) {
            return activityRecordServiceM42.f21.isAttachedToWindow();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ActivityRecordService m42() {
        WeakReference weakReference = f14;
        if (weakReference != null) {
            return (ActivityRecordService) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m45() {
        return m42() != null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C2666.m8210());
        C7312 c7312 = (C7312) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f21 = c7312;
        this.f18 = (TextView) c7312.findViewById(R.id.textView0);
        this.f22 = (TextView) this.f21.findViewById(R.id.textView1);
        this.f20 = (TextView) this.f21.findViewById(R.id.textView2);
        this.f23 = (TextView) this.f21.findViewById(R.id.textView3);
        this.f19 = (TextView) this.f21.findViewById(R.id.textView4);
        if (!ApplicationC0716.f2992.getBoolean("activity_record_floating_show_single", true)) {
            onClick(this.f21);
        }
        this.f21.setOnClickListener(this);
        this.f21.setOnLongClickListener(this);
        m47();
        if (f15 && ApplicationC0716.f2992.getBoolean("activity_record_floating_enable", true)) {
            this.f21.m19514();
        }
        f14 = new WeakReference(this);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m47() {
        LinkedList linkedList = f16;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            if (it.hasNext()) {
                C1174 c1174 = (C1174) it.next();
                this.f18.setText(c1174.f5233);
                this.f22.setText(c1174.f5231);
            } else {
                this.f18.setText(R.string.MT_Protector);
                this.f22.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f20.setText(((C1174) it.next()).f5231);
            } else {
                this.f20.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f23.setText(((C1174) it.next()).f5231);
            } else {
                this.f23.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f19.setText(((C1174) it.next()).f5231);
            } else {
                this.f19.setText((CharSequence) null);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        WeakReference weakReference = f14;
        if (weakReference != null && weakReference.get() == this) {
            f14 = null;
        }
        this.f21.m19513();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50(ActivityInfo activityInfo) {
        CharSequence charSequenceLoadLabel = activityInfo.loadLabel(getPackageManager());
        if (TextUtils.isEmpty(charSequenceLoadLabel) || charSequenceLoadLabel.toString().trim().isEmpty()) {
            return m51(activityInfo.packageName);
        }
        return charSequenceLoadLabel.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m51(String str) {
        PackageManager packageManager = getPackageManager();
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (Exception unused) {
            return "null";
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0105 A[EDGE_INSN: B:60:0x0105->B:61:0x0106 BREAK  A[LOOP:0: B:38:0x009e->B:59:0x0102]] */
    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ActivityInfo activityInfo;
        String strSubstring;
        ActivityInfo activityInfo2;
        if (!f15 || this.f24 || accessibilityEvent.getEventType() != 32 || accessibilityEvent.getClassName() == null || accessibilityEvent.getPackageName() == null) {
            return;
        }
        C1174 c1174 = new C1174();
        String string = accessibilityEvent.getClassName().toString();
        String string2 = accessibilityEvent.getPackageName().toString();
        c1174.f5232 = string2;
        c1174.f5231 = string;
        if (string2.equals(getPackageName()) || c1174.equals(f17) || string2.equals("bin.mt.plus") || string2.equals("bin.mt.plus.canary") || string2.equals("bin.mt.plus")) {
            return;
        }
        try {
            activityInfo = getPackageManager().getActivityInfo(new ComponentName(string2, string), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            activityInfo = null;
        }
        if (activityInfo == null) {
            InterfaceC10890 interfaceC10890M18096 = C6696.m18096();
            if (interfaceC10890M18096 == null || !interfaceC10890M18096.mo2032()) {
                strSubstring = null;
                break;
            }
            C5950 c5950Mo2026 = interfaceC10890M18096.mo2026(600L, "dumpsys activity activities");
            if (!c5950Mo2026.f20238.isEmpty()) {
                strSubstring = null;
                break;
            }
            String[] strArr = c5950Mo2026.f20239;
            int length = strArr.length;
            int i = 0;
            boolean z = false;
            loop0: while (true) {
                if (i < length) {
                    String str = strArr[i];
                    if (z) {
                        if (str.contains("ActivityRecord")) {
                            if (str.contains(" " + string2 + "/")) {
                                for (String str2 : str.split(" ")) {
                                    if (str2.startsWith(string2.concat("/"))) {
                                        strSubstring = str2.substring(string2.length() + 1);
                                        if (!strSubstring.startsWith(".")) {
                                            break loop0;
                                        }
                                        strSubstring = string2.concat(strSubstring);
                                        break loop0;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (str.isEmpty()) {
                        }
                    } else if (str.contains("Running activities")) {
                        z = true;
                    }
                    i++;
                }
                strSubstring = null;
                break;
            }
            if (strSubstring == null) {
                try {
                    ClassLoader.getSystemClassLoader().loadClass(string);
                    return;
                } catch (ClassNotFoundException unused2) {
                    c1174.f5233 = m51(string2);
                }
            } else {
                try {
                    activityInfo2 = getPackageManager().getActivityInfo(new ComponentName(string2, strSubstring), 0);
                } catch (PackageManager.NameNotFoundException unused3) {
                    activityInfo2 = null;
                }
                if (activityInfo2 == null) {
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(string);
                        return;
                    } catch (ClassNotFoundException unused4) {
                        c1174.f5233 = m51(string2);
                    }
                } else {
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(string);
                        c1174.f5231 = strSubstring;
                    } catch (ClassNotFoundException unused5) {
                        c1174.f5231 = C1679.m5594(strSubstring, " > ", string);
                    }
                    if (c1174.equals(f17)) {
                        return;
                    } else {
                        c1174.f5233 = m50(activityInfo2);
                    }
                }
            }
        } else {
            c1174.f5233 = m50(activityInfo);
        }
        LinkedList linkedList = f16;
        synchronized (linkedList) {
            if (linkedList.size() > 30) {
                linkedList.removeLast();
            }
            linkedList.addFirst(c1174);
        }
        m47();
        f17 = c1174;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC6025 interfaceC6025;
        boolean z = false;
        if (this.f20.getVisibility() == 0) {
            this.f20.setVisibility(8);
            this.f23.setVisibility(8);
            this.f19.setVisibility(8);
            interfaceC6025 = ApplicationC0716.f2992;
        } else {
            this.f20.setVisibility(0);
            this.f23.setVisibility(0);
            this.f19.setVisibility(0);
            interfaceC6025 = ApplicationC0716.f2992;
            z = true;
        }
        C1679.m5597(interfaceC6025, "activity_record_floating_show_single", z);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C16195 c16195 = new C16195(this, view, 0);
        C12418 c12418M38298 = c16195.m38298();
        if (this.f20.getVisibility() == 0 && this.f22.length() > 0) {
            SubMenu subMenuAddSubMenu = c12418M38298.addSubMenu(R.string.MT_Protector);
            subMenuAddSubMenu.add(0, 1, 0, this.f22.getText());
            if (this.f20.length() > 0) {
                subMenuAddSubMenu.add(0, 2, 0, C13012.m32189(30, this.f20.getText().toString()));
            }
            if (this.f23.length() > 0) {
                subMenuAddSubMenu.add(0, 3, 0, C13012.m32189(30, this.f23.getText().toString()));
            }
            if (this.f19.length() > 0) {
                subMenuAddSubMenu.add(0, 4, 0, C13012.m32189(30, this.f19.getText().toString()));
            }
        } else {
            c12418M38298.add(0, 1, 0, R.string.MT_Protector).setEnabled(this.f22.length() > 0);
        }
        c12418M38298.add(0, 15, 0, this.f24 ? R.string.MT_Protector : R.string.MT_Protector);
        c12418M38298.add(0, 16, 0, R.string.MT_Protector);
        c12418M38298.add(0, 17, 0, R.string.MT_Protector);
        c12418M38298.add(0, 18, 0, R.string.MT_Protector);
        c16195.m38296((InterfaceC21133) new C23648(2, this));
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43(ActivityRecordService activityRecordService, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C16737.m39272((CharSequence) activityRecordService.f22.getText().toString());
            return;
        }
        if (itemId == 2) {
            C16737.m39272((CharSequence) activityRecordService.f20.getText().toString());
            return;
        }
        if (itemId == 3) {
            C16737.m39272((CharSequence) activityRecordService.f23.getText().toString());
            return;
        }
        if (itemId == 4) {
            C16737.m39272((CharSequence) activityRecordService.f19.getText().toString());
            return;
        }
        switch (itemId) {
            case 15:
                boolean z = activityRecordService.f24;
                activityRecordService.f24 = !z;
                menuItem.setTitle(!z ? R.string.MT_Protector : R.string.MT_Protector);
                return;
            case 16:
                activityRecordService.f21.m19513();
                return;
            case 17:
                LinkedList linkedList = f16;
                synchronized (linkedList) {
                    linkedList.clear();
                    m40();
                    break;
                }
                f17 = null;
                return;
            case 18:
                C22342.m49508();
                return;
            default:
                return;
        }
    }
}
