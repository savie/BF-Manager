package l;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.function.ar.ActivityRecordService;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩹ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes.dex */
public final class C22342 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C14852 f72932 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C14852 f72933 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static long f72935 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean f72937 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f72938;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f72939;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3561 f72940 = new C3561();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public BaseAdapter f72941;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f72942;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Set f72934 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f72936 = new AtomicLong();

    public C22342(AbstractActivityC12483 abstractActivityC12483) {
        this.f72939 = abstractActivityC12483;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49550() {
        LinkedList linkedList = ActivityRecordService.f16;
        synchronized (linkedList) {
            this.f72942 = new ArrayList(linkedList);
        }
        this.f72941 = new C17673(this);
        C8067 c8067BuildDialog = this.f72939.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21259(this.f72941, (DialogInterfaceOnClickListenerC9948) null);
        c8067BuildDialog.m21251((ActivityRecordService.m45() && ActivityRecordService.m46()) ? R.string.MT_Protector : R.string.MT_Protector, null);
        DialogInterfaceC19356 dialogInterfaceC19356M52499 = C23821.m52499(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f72938 = dialogInterfaceC19356M52499;
        final Button buttonM44373 = dialogInterfaceC19356M52499.m44373();
        f72934.add(buttonM44373);
        this.f72938.m44367(new DialogInterface.OnDismissListener() { // from class: l.ܶ᩻ۚ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C22342.m49527(this.f50612, buttonM44373);
            }
        });
        this.f72938.m44376().setOnItemClickListener(new C21201());
        this.f72938.m44373().setOnClickListener(new ViewOnClickListenerC9227(2, this));
        this.f72938.m44376().setTag(this);
        this.f72939.getLifecycle().mo9171(new C2150(this));
        this.f72938.m44361().setOnClickListener(new ViewOnClickListenerC4450(1, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49527(C22342 c22342, Button button) {
        m49505(c22342);
        f72934.remove(button);
        AbstractActivityC12483 abstractActivityC12483 = c22342.f72939;
        if (abstractActivityC12483 instanceof ActivityC7815) {
            abstractActivityC12483.finish();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49526(C22342 c22342, View view) {
        AbstractActivityC12483 abstractActivityC12483 = c22342.f72939;
        C16195 c16195 = new C16195(abstractActivityC12483, view, 0);
        C12418 c12418M38298 = c16195.m38298();
        boolean zM41 = true;
        if (!ApplicationC0716.f2992.getBoolean("activity_record_floating_enable", true) ? false : C16125.m38170(abstractActivityC12483)) {
            zM41 = (ActivityRecordService.m45() && ActivityRecordService.m46()) ? true ^ ActivityRecordService.m41() : false;
        }
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        if (zM41) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c16195.m38296(new C11509(3, c22342));
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49525(C22342 c22342, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            LinkedList linkedList = ActivityRecordService.f16;
            synchronized (linkedList) {
                linkedList.clear();
                ActivityRecordService.m40();
            }
            ActivityRecordService.f17 = null;
            c22342.f72942.clear();
            c22342.f72941.notifyDataSetChanged();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C1679.m5597(ApplicationC0716.f2992, "activity_record_floating_enable", false);
            ActivityRecordService.m48();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C1679.m5597(ApplicationC0716.f2992, "activity_record_floating_enable", true);
            if (C6696.m18094(c22342.f72939)) {
                if (ActivityRecordService.m45() && ActivityRecordService.m46()) {
                    ActivityRecordService.m49();
                    return;
                }
                return;
            }
            try {
                C16125.m38167(c22342.f72939, null);
            } catch (Throwable th) {
                c22342.f72939.m31002(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49524(C22342 c22342) {
        boolean zM45 = ActivityRecordService.m45();
        if (zM45 && ActivityRecordService.m46()) {
            m49508();
            return;
        }
        if (!zM45) {
            m49528(false);
        }
        C14852 c14852 = new C14852(c22342);
        if (m49506(c14852)) {
            C14852 c14853 = f72932;
            if (c14853 != null) {
                f72933 = c14852;
                if (c14853.f48530 || m49539(c14853, false)) {
                    return;
                }
                m49517(f72932, EnumC9913.UNHANDLED, (EnumC24024) null);
                return;
            }
            f72932 = c14852;
            if (!m49510(c14852)) {
                f72932 = null;
            } else {
                m49546(c14852, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m49546(final C14852 c14852, boolean z) {
        EnumC9913 enumC9913;
        if (m49539(c14852, false)) {
            if (ActivityRecordService.m45()) {
                m49528(true);
                m49517(c14852, EnumC9913.HANDLED, (EnumC24024) null);
                return;
            }
            if (f72937 && !z && !C6696.m18082()) {
                EnumC11324 enumC11324 = EnumC11324.SHELL_INIT;
                c14852.f48531 = enumC11324;
                c14852.f48530 = true;
                m49518(c14852, enumC11324);
                try {
                    C4716.f16636.execute(new RunnableC5408(c14852, new C0219()));
                    return;
                } catch (RejectedExecutionException unused) {
                    C16737.m39273(new Runnable() { // from class: l.᩶᩻ۚ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22342.m49540(c14852);
                        }
                    });
                    return;
                }
            }
            c14852.f48531 = EnumC11324.CONTINUE_SELECTION;
            WeakReference weakReference = c14852.f48536;
            if (f72937 && C6696.m18100()) {
                C22342 c22342 = (C22342) weakReference.get();
                if (c22342 != null) {
                    AbstractActivityC12483 abstractActivityC12483 = c22342.f72939;
                    if (!m49539(c14852, false)) {
                        enumC9913 = EnumC9913.UNHANDLED;
                    } else {
                        c14852.f48531 = EnumC11324.CHOICE;
                        try {
                            View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
                            TextView textView = (TextView) viewM30995.findViewById(R.id.text);
                            SpannableString spannableString = new SpannableString(C16737.m39288(R.string.MT_Protector) + "\n\n" + C16737.m39288(R.string.MT_Protector));
                            int iIndexOf = TextUtils.indexOf(spannableString, "\n\n");
                            while (iIndexOf != -1) {
                                int i = iIndexOf + 2;
                                spannableString.setSpan(new RelativeSizeSpan(0.5f), iIndexOf, i, 33);
                                iIndexOf = TextUtils.indexOf(spannableString, "\n\n", i);
                            }
                            textView.setText(spannableString);
                            final Button button = (Button) viewM30995.findViewById(R.id.button1);
                            final Button button2 = (Button) viewM30995.findViewById(R.id.button2);
                            C9682.m24639(button2);
                            C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                            c8067BuildDialog.m21258(viewM30995);
                            final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
                            if (!dialogInterfaceC19356M21269.m44375()) {
                                m49523(c14852, true);
                                return;
                            }
                            C3561 c3561 = c22342.f72940;
                            if (c3561.f13110 != c14852 || !m49539(c14852, false)) {
                                dialogInterfaceC19356M21269.dismiss();
                                enumC9913 = EnumC9913.UNHANDLED;
                            } else {
                                c3561.f13112 = dialogInterfaceC19356M21269;
                                dialogInterfaceC19356M21269.m44367(new DialogInterface.OnDismissListener() { // from class: l.ܽ᩻ۚ
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        C22342.m49504(c14852, dialogInterfaceC19356M21269);
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener() { // from class: l.۫᩻ۚ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C22342.m49521(c14852, dialogInterfaceC19356M21269, button, button2);
                                    }
                                });
                                button2.setOnClickListener(new View.OnClickListener() { // from class: l.᩸᩻ۚ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C22342.m49534(c14852, dialogInterfaceC19356M21269);
                                    }
                                });
                                return;
                            }
                        } catch (RuntimeException unused2) {
                            m49523(c14852, true);
                            return;
                        }
                    }
                } else {
                    enumC9913 = EnumC9913.UNHANDLED;
                }
            } else if (!m49539(c14852, false)) {
                enumC9913 = EnumC9913.UNHANDLED;
            } else {
                if (!ApplicationC0716.f2992.getBoolean("forbid_tip_ar_manual", true)) {
                    m49523(c14852, true);
                    return;
                }
                C22342 c22343 = (C22342) weakReference.get();
                if (c22343 == null) {
                    enumC9913 = EnumC9913.UNHANDLED;
                } else {
                    c14852.f48531 = EnumC11324.MANUAL_PROMPT;
                    try {
                        C8067 c8067BuildDialog2 = c22343.f72939.buildDialog();
                        c8067BuildDialog2.m21274(R.string.MT_Protector);
                        c8067BuildDialog2.m21253(R.string.MT_Protector);
                        c8067BuildDialog2.m21251(R.string.MT_Protector, null);
                        c8067BuildDialog2.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        final DialogInterfaceC19356 dialogInterfaceC19356M212610 = c8067BuildDialog2.m21269();
                        if (!dialogInterfaceC19356M212610.m44375()) {
                            m49523(c14852, true);
                            return;
                        }
                        C3561 c3562 = c22343.f72940;
                        if (c3562.f13110 != c14852 || !m49539(c14852, false)) {
                            dialogInterfaceC19356M212610.dismiss();
                            enumC9913 = EnumC9913.UNHANDLED;
                        } else {
                            c3562.f13112 = dialogInterfaceC19356M212610;
                            dialogInterfaceC19356M212610.m44367(new DialogInterface.OnDismissListener() { // from class: l.ᩳ᩻ۚ
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    C22342.m49504(c14852, dialogInterfaceC19356M212610);
                                }
                            });
                            dialogInterfaceC19356M212610.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ᩻ۚ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C22342.m49520(c14852, dialogInterfaceC19356M212610);
                                }
                            });
                            dialogInterfaceC19356M212610.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.۠᩻ۚ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C22342.m49509(c14852, dialogInterfaceC19356M212610);
                                }
                            });
                            return;
                        }
                    } catch (RuntimeException unused3) {
                        m49523(c14852, true);
                        return;
                    }
                }
            }
            m49517(c14852, enumC9913, (EnumC24024) null);
            return;
        }
        m49517(c14852, EnumC9913.UNHANDLED, (EnumC24024) null);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m49540(C14852 c14852) {
        if (f72932 != c14852) {
            return;
        }
        m49547(c14852);
        c14852.f48530 = false;
        if (m49539(c14852, false)) {
            c14852.f48531 = EnumC11324.CONTINUE_SELECTION;
            m49546(c14852, true);
        } else {
            m49517(c14852, EnumC9913.UNHANDLED, (EnumC24024) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49521(final C14852 c14852, DialogInterfaceC19356 dialogInterfaceC19356, Button button, Button button2) {
        if (m49531(c14852, dialogInterfaceC19356, EnumC11324.CHOICE)) {
            EnumC11324 enumC11324 = EnumC11324.SHELL_WORKER;
            c14852.f48531 = enumC11324;
            c14852.f48530 = true;
            dialogInterfaceC19356.m44372(false);
            button.setEnabled(false);
            button2.setEnabled(false);
            m49518(c14852, enumC11324);
            try {
                C4716.f16636.execute(new RunnableC11759(c14852, new C0219()));
            } catch (RejectedExecutionException unused) {
                C16737.m39273(new Runnable() { // from class: l.᩵᩻ۚ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22342.m49545(c14852, EnumC24024.COMMAND_FAILED);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c4, code lost:
    
        if (r19 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c6, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d2, code lost:
    
        if (m49529(1000, r17, r13, r14, r15) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d4, code lost:
    
        r1 = m49514(r9, r12, r10, r17, r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01df, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e3, code lost:
    
        r11 = r8;
        r1 = m49514(r9, r12, r10, r17, r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ef, code lost:
    
        if (r1 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:?, code lost:
    
        return m49515(r9, r12, r0, r17, r13, r14, r15, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r8.f21694 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.EnumC24024 m49542() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22342.m49542():l.᩻᩻ۚ");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49534(C14852 c14852, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (m49531(c14852, dialogInterfaceC19356, EnumC11324.CHOICE)) {
            c14852.f48531 = EnumC11324.MANUAL_COMMIT;
            m49548(c14852, dialogInterfaceC19356);
            m49523(c14852, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m49545(C14852 c14852, EnumC24024 enumC24024) {
        DialogInterfaceC19356 dialogInterfaceC19356;
        DialogInterfaceC19356 dialogInterfaceC19357;
        if (f72932 != c14852) {
            return;
        }
        if (enumC24024 == null) {
            enumC24024 = EnumC24024.COMMAND_FAILED;
        }
        EnumC24024 enumC24025 = EnumC24024.STARTED;
        if (enumC24024 == enumC24025 && !ActivityRecordService.m45()) {
            enumC24024 = EnumC24024.STATE_UNKNOWN;
        }
        C22342 c22342 = (C22342) c14852.f48536.get();
        if (c22342 != null) {
            C3561 c3561 = c22342.f72940;
            if (c3561.f13110 != c14852) {
                dialogInterfaceC19356 = null;
            } else {
                dialogInterfaceC19356 = c3561.f13112;
            }
        } else {
            dialogInterfaceC19356 = null;
        }
        boolean zM49531 = m49531(c14852, dialogInterfaceC19356, EnumC11324.SHELL_WORKER);
        m49547(c14852);
        c14852.f48530 = false;
        if (!zM49531) {
            m49533(c14852);
            if (enumC24024 == enumC24025 && c14852.f48532 == f72935) {
                try {
                    m49528(true);
                    return;
                } finally {
                    m49517(c14852, EnumC9913.HANDLED, (EnumC24024) null);
                }
            } else {
                EnumC9913 enumC9913 = EnumC9913.UNHANDLED;
                if (enumC24024 == enumC24025) {
                    enumC24024 = null;
                }
                m49517(c14852, enumC9913, enumC24024);
                return;
            }
        }
        C22342 c22343 = (C22342) c14852.f48536.get();
        if (c22343 != null) {
            C3561 c3562 = c22343.f72940;
            if (c3562.f13110 != c14852) {
                dialogInterfaceC19357 = null;
            } else {
                dialogInterfaceC19357 = c3562.f13112;
            }
        } else {
            dialogInterfaceC19357 = null;
        }
        if (enumC24024 == enumC24025) {
            c14852.f48531 = EnumC11324.FINISHING;
            m49548(c14852, dialogInterfaceC19357);
            try {
                m49528(true);
                C15829.m37611(R.string.MT_Protector);
                return;
            } finally {
                m49517(c14852, EnumC9913.HANDLED, (EnumC24024) null);
            }
        }
        if (enumC24024 == EnumC24024.STATE_UNKNOWN || enumC24024 == EnumC24024.ENTRY_MISSING || enumC24024 == EnumC24024.BIND_TIMEOUT || enumC24024 == EnumC24024.UNSUPPORTED_PROFILE) {
            f72937 = false;
        }
        c14852.f48531 = EnumC11324.MANUAL_COMMIT;
        m49548(c14852, dialogInterfaceC19357);
        m49523(c14852, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49520(C14852 c14852, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (m49531(c14852, dialogInterfaceC19356, EnumC11324.MANUAL_PROMPT)) {
            c14852.f48531 = EnumC11324.MANUAL_COMMIT;
            m49548(c14852, dialogInterfaceC19356);
            m49523(c14852, true);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49509(C14852 c14852, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (m49531(c14852, dialogInterfaceC19356, EnumC11324.MANUAL_PROMPT)) {
            C1679.m5597(ApplicationC0716.f2992, "forbid_tip_ar_manual", false);
            c14852.f48531 = EnumC11324.MANUAL_COMMIT;
            m49548(c14852, dialogInterfaceC19356);
            m49523(c14852, true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49523(C14852 c14852, boolean z) {
        EnumC9913 enumC9913;
        if (!m49539(c14852, false)) {
            enumC9913 = EnumC9913.UNHANDLED;
        } else if (z && ActivityRecordService.m45()) {
            m49528(true);
            enumC9913 = EnumC9913.HANDLED;
        } else {
            C22342 c22342 = (C22342) c14852.f48536.get();
            if (c22342 == null) {
                enumC9913 = EnumC9913.UNHANDLED;
            } else {
                c14852.f48531 = EnumC11324.MANUAL_COMMIT;
                try {
                    c22342.f72939.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                    try {
                        C15829.m37619(C16737.m39264(R.string.MT_Protector, C16737.m39288(R.string.MT_Protector)));
                    } catch (RuntimeException unused) {
                    }
                    enumC9913 = EnumC9913.HANDLED;
                } catch (RuntimeException unused2) {
                    enumC9913 = EnumC9913.UNHANDLED;
                }
            }
        }
        m49517(c14852, enumC9913, (EnumC24024) null);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m49508() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C16737.m39273(new RunnableC16263());
            return;
        }
        f72935++;
        m49528(false);
        f72933 = null;
        C14852 c14852 = f72932;
        if (c14852 == null) {
            return;
        }
        c14852.f48533 = true;
        m49533(c14852);
        if (c14852.f48530) {
            return;
        }
        m49517(c14852, EnumC9913.UNHANDLED, (EnumC24024) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49528(boolean z) {
        ActivityRecordService.m44(z);
        int i = z ? R.string.MT_Protector : R.string.MT_Protector;
        for (Button button : f72934) {
            if (button != null) {
                button.setText(i);
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m49504(C14852 c14852, DialogInterfaceC19356 dialogInterfaceC19356) {
        C22342 c22342 = (C22342) c14852.f48536.get();
        if (c22342 != null) {
            C3561 c3561 = c22342.f72940;
            if (c3561.f13110 == c14852 && c3561.f13112 == dialogInterfaceC19356) {
                c3561.f13112 = null;
            }
        }
        if (f72932 == c14852) {
            EnumC11324 enumC11324 = c14852.f48531;
            if (enumC11324 == EnumC11324.CHOICE || enumC11324 == EnumC11324.MANUAL_PROMPT) {
                c14852.f48533 = true;
                m49517(c14852, EnumC9913.UNHANDLED, (EnumC24024) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m49533(C14852 c14852) {
        C22342 c22342 = (C22342) c14852.f48536.get();
        if (c22342 == null) {
            return;
        }
        C3561 c3561 = c22342.f72940;
        if (c3561.f13110 != c14852) {
            return;
        }
        c14852.f48531 = EnumC11324.FINISHING;
        m49547(c14852);
        DialogInterfaceC19356 dialogInterfaceC19356 = c3561.f13112;
        c3561.f13112 = null;
        c3561.f13110 = null;
        if (dialogInterfaceC19356 == null || !dialogInterfaceC19356.m44375()) {
            return;
        }
        dialogInterfaceC19356.dismiss();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m49548(C14852 c14852, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (dialogInterfaceC19356 == null) {
            return;
        }
        C22342 c22342 = (C22342) c14852.f48536.get();
        if (c22342 != null) {
            C3561 c3561 = c22342.f72940;
            if (c3561.f13110 == c14852 && c3561.f13112 == dialogInterfaceC19356) {
                c3561.f13112 = null;
            }
        }
        if (dialogInterfaceC19356.m44375()) {
            dialogInterfaceC19356.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49518(final C14852 c14852, final EnumC11324 enumC11324) {
        m49547(c14852);
        C22342 c22342 = (C22342) c14852.f48536.get();
        if (c22342 != null) {
            C3561 c3561 = c22342.f72940;
            if (c3561.f13110 != c14852) {
                return;
            }
            final long j = c14852.f48535 + 1;
            c14852.f48535 = j;
            c3561.f13113 = j;
            C16737.m39274(new Runnable() { // from class: l.֡᩻ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C22342.m49519(c14852, enumC11324, j);
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49519(C14852 c14852, EnumC11324 enumC11324, long j) {
        C22342 c22342 = (C22342) c14852.f48536.get();
        if (c22342 != null && m49539(c14852, false) && c14852.f48531 == enumC11324 && c14852.f48535 == j) {
            C3561 c3561 = c22342.f72940;
            if (c3561.f13110 == c14852 && c3561.f13113 == j) {
                try {
                    C17485 c17485 = new C17485(c22342.f72939, R.string.MT_Protector);
                    c17485.m40704();
                    if (m49539(c14852, false) && c14852.f48531 == enumC11324 && c14852.f48535 == j && c3561.f13110 == c14852 && c3561.f13113 == j) {
                        c3561.f13111 = c17485;
                    } else {
                        c17485.m40694();
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m49547(C14852 c14852) {
        long j = c14852.f48535 + 1;
        c14852.f48535 = j;
        C22342 c22342 = (C22342) c14852.f48536.get();
        if (c22342 == null) {
            return;
        }
        C3561 c3561 = c22342.f72940;
        if (c3561.f13110 != c14852) {
            return;
        }
        c3561.f13113 = j;
        C17485 c17485 = c3561.f13111;
        c3561.f13111 = null;
        if (c17485 != null) {
            c17485.m40694();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m49510(C14852 c14852) {
        C22342 c22342 = (C22342) c14852.f48536.get();
        if (c22342 == null || !m49506(c14852)) {
            return false;
        }
        C3561 c3561 = c22342.f72940;
        C14852 c14853 = c3561.f13110;
        if (c14853 != null && c14853 != c14852) {
            m49533(c14853);
        }
        c3561.f13110 = c14852;
        c3561.f13112 = null;
        c3561.f13111 = null;
        c3561.f13113 = c14852.f48535;
        c14852.f48533 = false;
        return true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m49506(C14852 c14852) {
        C22342 c22342 = (C22342) c14852.f48536.get();
        DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) c14852.f48534.get();
        if (c22342 == null) {
            return false;
        }
        AbstractActivityC12483 abstractActivityC12483 = c22342.f72939;
        return dialogInterfaceC19356 != null && c22342.f72938 == dialogInterfaceC19356 && dialogInterfaceC19356.m44375() && abstractActivityC12483.getLifecycle().mo9170() == EnumC9414.RESUMED && !abstractActivityC12483.isFinishing() && !abstractActivityC12483.isDestroyed();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m49539(C14852 c14852, boolean z) {
        C22342 c22342;
        if (f72932 != c14852 || c14852.f48532 != f72935 || c14852.f48533 || !m49506(c14852) || (c22342 = (C22342) c14852.f48536.get()) == null) {
            return false;
        }
        C3561 c3561 = c22342.f72940;
        if (c3561.f13110 != c14852) {
            return false;
        }
        if (!z) {
            return true;
        }
        DialogInterfaceC19356 dialogInterfaceC19356 = c3561.f13112;
        return dialogInterfaceC19356 != null && dialogInterfaceC19356.m44375();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49531(C14852 c14852, DialogInterfaceC19356 dialogInterfaceC19356, EnumC11324 enumC11324) {
        C22342 c22342;
        return dialogInterfaceC19356 != null && c14852.f48531 == enumC11324 && m49539(c14852, true) && (c22342 = (C22342) c14852.f48536.get()) != null && c22342.f72940.f13112 == dialogInterfaceC19356;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49517(C14852 c14852, EnumC9913 enumC9913, EnumC24024 enumC24024) {
        if (f72932 != c14852) {
            return;
        }
        c14852.f48531 = EnumC11324.FINISHING;
        long j = c14852.f48532;
        m49533(c14852);
        f72932 = null;
        if (enumC24024 != null && j == f72935 && (enumC24024 == EnumC24024.STATE_UNKNOWN || enumC24024 == EnumC24024.ENTRY_MISSING || enumC24024 == EnumC24024.BIND_TIMEOUT || enumC24024 == EnumC24024.UNSUPPORTED_PROFILE)) {
            f72937 = false;
        }
        C14852 c14853 = f72933;
        f72933 = null;
        if (c14853 == null) {
            return;
        }
        long j2 = c14853.f48532;
        if (!(enumC9913 == EnumC9913.HANDLED && j2 == j) && j2 == f72935 && m49506(c14853)) {
            f72932 = c14853;
            if (!m49510(c14853)) {
                f72932 = null;
            } else if (enumC24024 != null) {
                m49523(c14853, false);
            } else {
                m49546(c14853, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m49505(C22342 c22342) {
        C14852 c14852 = f72933;
        if (c14852 != null && c14852.f48536.get() == c22342) {
            f72933 = null;
        }
        C14852 c14853 = f72932;
        if (c14853 == null || c14853.f48536.get() != c22342) {
            return;
        }
        c14853.f48533 = true;
        m49533(c14853);
        if (c14853.f48530) {
            return;
        }
        m49517(c14853, EnumC9913.UNHANDLED, (EnumC24024) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC24024 m49514(InterfaceC10890 interfaceC10890, int i, int i2, long j, C10619 c10619, C6384 c6384) {
        if (i2 >= 24) {
            return null;
        }
        C4702 c4702M49511 = m49511(interfaceC10890, i, "accessibility_enabled", j, c10619, c6384);
        if (c4702M49511.f16599) {
            if ("1".equals(((String) c4702M49511.f16598.get(0)).trim())) {
                return null;
            }
            if (m49512(interfaceC10890, i, "accessibility_enabled", "1", j, c10619, c6384).f16599) {
                C4702 c4702M49512 = m49511(interfaceC10890, i, "accessibility_enabled", j, c10619, c6384);
                if (c4702M49512.f16599 && "1".equals(((String) c4702M49512.f16598.get(0)).trim())) {
                    return null;
                }
                if (c6384.f21694) {
                    return EnumC24024.STATE_UNKNOWN;
                }
                return EnumC24024.COMMAND_FAILED;
            }
            if (c6384.f21694) {
                return EnumC24024.STATE_UNKNOWN;
            }
            return EnumC24024.COMMAND_FAILED;
        }
        if (c6384.f21694) {
            return EnumC24024.STATE_UNKNOWN;
        }
        return EnumC24024.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC24024 m49515(InterfaceC10890 interfaceC10890, int i, String str, long j, C9208 c9208, C10619 c10619, C7796 c7796, C6384 c6384) {
        m49529(Math.min(8000L, Math.max(0L, (j - SystemClock.elapsedRealtime()) - 2500)), j, c9208, c10619, c7796);
        C4702 c4702M49511 = m49511(interfaceC10890, i, "enabled_accessibility_services", j, c10619, c6384);
        if (c4702M49511.f16599) {
            if (!m49530((String) c4702M49511.f16598.get(0), str)) {
                return EnumC24024.ENTRY_MISSING;
            }
            if (ActivityRecordService.m45()) {
                return EnumC24024.STARTED;
            }
            return EnumC24024.BIND_TIMEOUT;
        }
        if (c6384.f21694) {
            return EnumC24024.STATE_UNKNOWN;
        }
        return EnumC24024.COMMAND_FAILED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49529(long j, long j2, C9208 c9208, C10619 c10619, C7796 c7796) {
        if (ActivityRecordService.m45()) {
            return true;
        }
        long jMin = Math.min(j2, Math.max(0L, j) + SystemClock.elapsedRealtime());
        while (SystemClock.elapsedRealtime() < jMin) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMin2 = Math.min(200L, jMin - jElapsedRealtime);
            if (jMin2 <= 0) {
                return false;
            }
            SystemClock.sleep(jMin2);
            if (ActivityRecordService.m45()) {
                return true;
            }
            if (SystemClock.elapsedRealtime() <= jElapsedRealtime) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4702 m49511(InterfaceC10890 interfaceC10890, int i, String str, long j, C10619 c10619, C6384 c6384) {
        return m49513(interfaceC10890, "settings get --user " + i + " secure " + str, 1, false, j, c10619, c6384);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4702 m49512(InterfaceC10890 interfaceC10890, int i, String str, String str2, long j, C10619 c10619, C6384 c6384) {
        StringBuilder sb = new StringBuilder("settings put --user ");
        sb.append(i);
        sb.append(" secure ");
        sb.append(str);
        sb.append(" ");
        sb.append("'" + str2.replace("'", "'\\''") + "'");
        return m49513(interfaceC10890, sb.toString(), 0, true, j, c10619, c6384);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4702 m49513(InterfaceC10890 interfaceC10890, String str, int i, boolean z, long j, C10619 c10619, C6384 c6384) {
        boolean z2;
        boolean z3;
        synchronized (interfaceC10890) {
            long jElapsedRealtime = j - SystemClock.elapsedRealtime();
            if (jElapsedRealtime <= 0) {
                return new C4702(Collections.EMPTY_LIST, false);
            }
            long jMin = Math.min(2500L, jElapsedRealtime);
            if (z) {
                c6384.f21694 = true;
            }
            String str2 = "MT_AR_DONE:" + Long.toHexString(f72936.incrementAndGet());
            try {
                try {
                    C5950 c5950Mo2026 = interfaceC10890.mo2026(jMin, "{ " + str + "; } | while IFS= read -r mt_ar_line || [ -n \"$mt_ar_line\" ]; do print -r -- \"MT_AR_OUT:$mt_ar_line\"; done; print -r -- '" + str2 + "'");
                    String[] strArrSplit = c5950Mo2026.f20238.split("\\n", -1);
                    int length = strArrSplit.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        }
                        if ("Read shell timeout.".equals(strArrSplit[i2].trim())) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    boolean zMo2029 = interfaceC10890.mo2029();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = c5950Mo2026.f20239;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 >= strArr.length) {
                            if (i4 == 1) {
                                z3 = true;
                                break;
                            }
                        } else {
                            String str3 = strArr[i3];
                            if (str2.equals(str3)) {
                                i4++;
                                if (i3 == strArr.length - 1) {
                                    i3++;
                                }
                            } else if (str3.startsWith("MT_AR_OUT:")) {
                                arrayList.add(str3.substring(10));
                                i3++;
                            }
                        }
                        z3 = false;
                        break;
                    }
                    if (z2 || !zMo2029 || (!z3 && (interfaceC10890 instanceof C17239))) {
                        try {
                            interfaceC10890.close();
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (!c5950Mo2026.m16221() && z3 && arrayList.size() == i) {
                        return new C4702(arrayList, true);
                    }
                    return new C4702(Collections.EMPTY_LIST, false);
                } catch (RuntimeException unused2) {
                    return new C4702(Collections.EMPTY_LIST, false);
                }
            } catch (RuntimeException unused3) {
                interfaceC10890.close();
                return new C4702(Collections.EMPTY_LIST, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49530(String str, String str2) {
        ComponentName componentNameUnflattenFromString;
        if (str == null || str.isEmpty() || "null".equals(str) || (componentNameUnflattenFromString = ComponentName.unflattenFromString(str2)) == null) {
            return false;
        }
        for (String str3 : str.split(":", -1)) {
            if (!str3.isEmpty() && componentNameUnflattenFromString.equals(ComponentName.unflattenFromString(str3))) {
                return true;
            }
        }
        return false;
    }
}
