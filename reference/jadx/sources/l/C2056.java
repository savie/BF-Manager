package l;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.accessibility.selecttospeak.SelectToSpeakService;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.֫ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6G9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2056 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f6829 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C22193 f6830;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long f6831;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C22193 f6832;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f6833;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final RunnableC6915 f6834;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f6835;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22939 f6836 = new C22939();

    public C2056(AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327, RunnableC6915 runnableC6915) {
        this.f6833 = abstractActivityC17204;
        this.f6835 = dialogInterfaceC8327;
        this.f6834 = runnableC6915;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7101() {
        C22193 c22193 = f6832;
        if (c22193 != null && c22193.f71508.get() == this) {
            f6832.f71505 = false;
        }
        C22193 c22194 = f6830;
        if (c22194 == null || c22194.f71508.get() != this) {
            return;
        }
        f6830.f71505 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7102(boolean z) {
        if (!C17695.m41415().m41433() && C17695.m41415().m41440() == null) {
            C22193 c22193 = new C22193(this);
            c22193.f71505 = z;
            if (m7088(c22193)) {
                C22193 c22194 = f6832;
                if (c22194 != null) {
                    f6830 = c22193;
                    if (c22194.f71506 || m7086(c22194, false)) {
                        return;
                    }
                    m7079(f6832, EnumC11004.UNHANDLED, (EnumC14207) null);
                    return;
                }
                f6832 = c22193;
                if (!m7100(c22193)) {
                    f6832 = null;
                } else {
                    m7097(c22193, false);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x015c  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7097(final C22193 c22193, boolean z) {
        EnumC11004 enumC11004;
        if (m7086(c22193, false)) {
            C17695.m41415().getClass();
            if (!C17695.m41412()) {
                if (f6829 && !z && !C7756.m21112()) {
                    EnumC5039 enumC5039 = EnumC5039.SHELL_INIT;
                    c22193.f71510 = enumC5039;
                    c22193.f71506 = true;
                    m7075(c22193, enumC5039);
                    try {
                        C5261.f18540.execute(new RunnableC5785(c22193, new C13921(1)));
                        return;
                    } catch (RejectedExecutionException unused) {
                        C21576.m49068(new Runnable() { // from class: l.ܿܺܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2056.m7083(c22193);
                            }
                        });
                        return;
                    }
                }
                c22193.f71510 = EnumC5039.CONTINUE_SELECTION;
                WeakReference weakReference = c22193.f71508;
                if (f6829 && C7756.m21109()) {
                    C2056 c2056 = (C2056) weakReference.get();
                    if (c2056 != null) {
                        AbstractActivityC17204 abstractActivityC17204 = c2056.f6833;
                        if (!m7086(c22193, false)) {
                            enumC11004 = EnumC11004.UNHANDLED;
                        } else {
                            c22193.f71510 = EnumC5039.CHOICE;
                            try {
                                View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
                                TextView textView = (TextView) viewM40395.findViewById(R.id.text);
                                SpannableString spannableString = new SpannableString(C21576.m49088(R.string.MT_Protector) + "\n\n" + C21576.m49088(R.string.MT_Protector));
                                int iIndexOf = TextUtils.indexOf(spannableString, "\n\n");
                                while (iIndexOf != -1) {
                                    int i = iIndexOf + 2;
                                    spannableString.setSpan(new RelativeSizeSpan(0.5f), iIndexOf, i, 33);
                                    iIndexOf = TextUtils.indexOf(spannableString, "\n\n", i);
                                }
                                textView.setText(spannableString);
                                final Button button = (Button) viewM40395.findViewById(R.id.button1);
                                final Button button2 = (Button) viewM40395.findViewById(R.id.button2);
                                final C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
                                final View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
                                c1255.setChecked(C21576.f68931.getBoolean("iad", true));
                                c1255.setOnCheckedChangeListener(new C8745());
                                viewFindViewById.setOnClickListener(new ViewOnClickListenerC12025(c1255, 2));
                                C2930.m9576(button2);
                                C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                                c2361BuildDialog.m8005(viewM40395);
                                final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
                                if (!dialogInterfaceC8327M8016.m22434()) {
                                    m7081(c22193, true);
                                    return;
                                }
                                C22939 c22939 = c2056.f6836;
                                if (c22939.f74520 != c22193 || !m7086(c22193, false)) {
                                    dialogInterfaceC8327M8016.dismiss();
                                    enumC11004 = EnumC11004.UNHANDLED;
                                } else {
                                    c22939.f74518 = dialogInterfaceC8327M8016;
                                    dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.ۜܺܳ
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            C2056.m7087(c22193, dialogInterfaceC8327M8016);
                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() { // from class: l.۬ܺܳ
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            C2056.m7078(c22193, dialogInterfaceC8327M8016, button, button2, c1255, viewFindViewById);
                                        }
                                    });
                                    button2.setOnClickListener(new View.OnClickListener() { // from class: l.֡ܺܳ
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            C2056.m7085(c22193, dialogInterfaceC8327M8016);
                                        }
                                    });
                                    return;
                                }
                            } catch (RuntimeException unused2) {
                                m7081(c22193, true);
                                return;
                            }
                        }
                    } else {
                        enumC11004 = EnumC11004.UNHANDLED;
                    }
                } else if (!m7086(c22193, false)) {
                    enumC11004 = EnumC11004.UNHANDLED;
                } else {
                    if (!ApplicationC17729.f58258.getBoolean("forbid_tip_ar_manual", true)) {
                        m7081(c22193, true);
                        return;
                    }
                    C2056 c2057 = (C2056) weakReference.get();
                    if (c2057 == null) {
                        enumC11004 = EnumC11004.UNHANDLED;
                    } else {
                        c22193.f71510 = EnumC5039.MANUAL_PROMPT;
                        try {
                            C2361 c2361BuildDialog2 = c2057.f6833.buildDialog();
                            c2361BuildDialog2.m8021(R.string.MT_Protector);
                            c2361BuildDialog2.m8000(R.string.MT_Protector);
                            c2361BuildDialog2.m8026(R.string.MT_Protector, null);
                            c2361BuildDialog2.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            final DialogInterfaceC8327 dialogInterfaceC8327M8017 = c2361BuildDialog2.m8016();
                            if (!dialogInterfaceC8327M8017.m22434()) {
                                m7081(c22193, true);
                                return;
                            }
                            C22939 c229310 = c2057.f6836;
                            if (c229310.f74520 != c22193 || !m7086(c22193, false)) {
                                dialogInterfaceC8327M8017.dismiss();
                                enumC11004 = EnumC11004.UNHANDLED;
                            } else {
                                c229310.f74518 = dialogInterfaceC8327M8017;
                                dialogInterfaceC8327M8017.m22426(new DialogInterface.OnDismissListener() { // from class: l.ᩳܺܳ
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        C2056.m7087(c22193, dialogInterfaceC8327M8017);
                                    }
                                });
                                dialogInterfaceC8327M8017.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۢܺܳ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C2056.m7095(c22193, dialogInterfaceC8327M8017);
                                    }
                                });
                                dialogInterfaceC8327M8017.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.֨ܺܳ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C2056.m7099(c22193, dialogInterfaceC8327M8017);
                                    }
                                });
                                return;
                            }
                        } catch (RuntimeException unused3) {
                            m7081(c22193, true);
                            return;
                        }
                    }
                }
                m7079(c22193, enumC11004, (EnumC14207) null);
                return;
            }
            m7079(c22193, EnumC11004.HANDLED, (EnumC14207) null);
            return;
        }
        m7079(c22193, EnumC11004.UNHANDLED, (EnumC14207) null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m7083(C22193 c22193) {
        if (f6832 != c22193) {
            return;
        }
        m7089(c22193);
        c22193.f71506 = false;
        if (m7086(c22193, false)) {
            c22193.f71510 = EnumC5039.CONTINUE_SELECTION;
            m7097(c22193, true);
        } else {
            m7079(c22193, EnumC11004.UNHANDLED, (EnumC14207) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7078(final C22193 c22193, DialogInterfaceC8327 dialogInterfaceC8327, Button button, Button button2, C1255 c1255, View view) {
        if (m7082(c22193, dialogInterfaceC8327, EnumC5039.CHOICE)) {
            EnumC5039 enumC5039 = EnumC5039.SHELL_WORKER;
            c22193.f71510 = enumC5039;
            c22193.f71506 = true;
            dialogInterfaceC8327.m22431(false);
            button.setEnabled(false);
            button2.setEnabled(false);
            c1255.setEnabled(false);
            view.setEnabled(false);
            m7075(c22193, enumC5039);
            try {
                C5261.f18540.execute(new RunnableC15479(c22193, new C13921(1)));
            } catch (RejectedExecutionException unused) {
                C21576.m49068(new Runnable() { // from class: l.۟ܺܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2056.m7096(c22193, EnumC14207.COMMAND_FAILED);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7085(C22193 c22193, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (m7082(c22193, dialogInterfaceC8327, EnumC5039.CHOICE)) {
            c22193.f71510 = EnumC5039.MANUAL_COMMIT;
            m7090(c22193, dialogInterfaceC8327);
            m7081(c22193, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m7096(C22193 c22193, EnumC14207 enumC14207) {
        DialogInterfaceC8327 dialogInterfaceC8327;
        DialogInterfaceC8327 dialogInterfaceC8328;
        C2056 c2056;
        if (f6832 != c22193) {
            return;
        }
        if (enumC14207 == null) {
            enumC14207 = EnumC14207.COMMAND_FAILED;
        }
        EnumC14207 enumC14208 = EnumC14207.STARTED;
        if (enumC14207 == enumC14208) {
            C17695.m41415().getClass();
            if (!C17695.m41412()) {
                enumC14207 = EnumC14207.STATE_UNKNOWN;
            }
        }
        WeakReference weakReference = c22193.f71508;
        WeakReference weakReference2 = c22193.f71508;
        C2056 c2057 = (C2056) weakReference.get();
        if (c2057 != null) {
            C22939 c22939 = c2057.f6836;
            if (c22939.f74520 != c22193) {
                dialogInterfaceC8327 = null;
            } else {
                dialogInterfaceC8327 = c22939.f74518;
            }
        } else {
            dialogInterfaceC8327 = null;
        }
        long j = c22193.f71511;
        boolean zM7082 = m7082(c22193, dialogInterfaceC8327, EnumC5039.SHELL_WORKER);
        m7089(c22193);
        c22193.f71506 = false;
        if (!zM7082) {
            m7092(c22193);
            if (enumC14207 != enumC14208 || j != f6831) {
                EnumC11004 enumC11004 = EnumC11004.UNHANDLED;
                if (enumC14207 == enumC14208) {
                    enumC14207 = null;
                }
                m7079(c22193, enumC11004, enumC14207);
                return;
            }
            m7079(c22193, EnumC11004.HANDLED, (EnumC14207) null);
            return;
        }
        C2056 c2058 = (C2056) weakReference2.get();
        if (c2058 != null) {
            C22939 c229310 = c2058.f6836;
            if (c229310.f74520 != c22193) {
                dialogInterfaceC8328 = null;
            } else {
                dialogInterfaceC8328 = c229310.f74518;
            }
        } else {
            dialogInterfaceC8328 = null;
        }
        if (enumC14207 == enumC14208) {
            c22193.f71510 = EnumC5039.FINISHING;
            try {
                m7090(c22193, dialogInterfaceC8328);
                m7079(c22193, EnumC11004.HANDLED, (EnumC14207) null);
                if (c22193.f71505 && j == f6831 && m7088(c22193) && (c2056 = (C2056) weakReference2.get()) != null) {
                    c2056.f6834.run();
                    return;
                }
                return;
            } catch (Throwable th) {
                m7079(c22193, EnumC11004.HANDLED, (EnumC14207) null);
                throw th;
            }
        }
        if (enumC14207 == EnumC14207.STATE_UNKNOWN || enumC14207 == EnumC14207.ENTRY_MISSING || enumC14207 == EnumC14207.BIND_TIMEOUT || enumC14207 == EnumC14207.UNSUPPORTED_PROFILE) {
            f6829 = false;
        }
        c22193.f71510 = EnumC5039.MANUAL_COMMIT;
        m7090(c22193, dialogInterfaceC8328);
        m7081(c22193, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7095(C22193 c22193, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (m7082(c22193, dialogInterfaceC8327, EnumC5039.MANUAL_PROMPT)) {
            c22193.f71510 = EnumC5039.MANUAL_COMMIT;
            m7090(c22193, dialogInterfaceC8327);
            m7081(c22193, true);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7099(C22193 c22193, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (m7082(c22193, dialogInterfaceC8327, EnumC5039.MANUAL_PROMPT)) {
            C6421.m18184(ApplicationC17729.f58258, "forbid_tip_ar_manual", false);
            c22193.f71510 = EnumC5039.MANUAL_COMMIT;
            m7090(c22193, dialogInterfaceC8327);
            m7081(c22193, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7081(C22193 c22193, boolean z) {
        C2056 c2056;
        EnumC11004 enumC11004;
        EnumC11004 enumC11005;
        if (!m7086(c22193, false)) {
            enumC11005 = EnumC11004.UNHANDLED;
        } else if (z) {
            C17695.m41415().getClass();
            if (C17695.m41412()) {
                enumC11005 = EnumC11004.HANDLED;
            } else {
                c2056 = (C2056) c22193.f71508.get();
                if (c2056 == null) {
                    enumC11005 = EnumC11004.UNHANDLED;
                } else {
                    c22193.f71510 = EnumC5039.MANUAL_COMMIT;
                    if (c2056.m7103()) {
                        enumC11004 = EnumC11004.HANDLED;
                    } else {
                        enumC11004 = EnumC11004.UNHANDLED;
                    }
                    m7079(c22193, enumC11004, (EnumC14207) null);
                    return;
                }
            }
        } else {
            c2056 = (C2056) c22193.f71508.get();
            if (c2056 == null) {
                enumC11005 = EnumC11004.UNHANDLED;
            } else {
                c22193.f71510 = EnumC5039.MANUAL_COMMIT;
                if (c2056.m7103()) {
                    enumC11004 = EnumC11004.HANDLED;
                } else {
                    enumC11004 = EnumC11004.UNHANDLED;
                }
                m7079(c22193, enumC11004, (EnumC14207) null);
                return;
            }
        }
        m7079(c22193, enumC11005, (EnumC14207) null);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m7103() {
        String string;
        try {
            this.f6833.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
            try {
                ApplicationC17729 applicationC17729 = C21576.f68934;
                try {
                    string = applicationC17729.getPackageManager().getServiceInfo(new ComponentName(applicationC17729, (Class<?>) SelectToSpeakService.class), 0).loadLabel(applicationC17729.getPackageManager()).toString();
                } catch (PackageManager.NameNotFoundException unused) {
                    string = applicationC17729.getString(R.string.MT_Protector);
                }
                C22673.m51160(C21576.m49059(R.string.MT_Protector, string));
            } catch (RuntimeException unused2) {
            }
            return true;
        } catch (RuntimeException unused3) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m7091() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C21576.m49068(new RunnableC9490());
            return;
        }
        f6831++;
        f6830 = null;
        C22193 c22193 = f6832;
        if (c22193 == null) {
            return;
        }
        c22193.f71509 = true;
        m7092(c22193);
        if (c22193.f71506) {
            return;
        }
        m7079(c22193, EnumC11004.UNHANDLED, (EnumC14207) null);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m7087(C22193 c22193, DialogInterfaceC8327 dialogInterfaceC8327) {
        C2056 c2056 = (C2056) c22193.f71508.get();
        if (c2056 != null) {
            C22939 c22939 = c2056.f6836;
            if (c22939.f74520 == c22193 && c22939.f74518 == dialogInterfaceC8327) {
                c22939.f74518 = null;
            }
        }
        if (f6832 == c22193) {
            EnumC5039 enumC5039 = c22193.f71510;
            if (enumC5039 == EnumC5039.CHOICE || enumC5039 == EnumC5039.MANUAL_PROMPT) {
                c22193.f71509 = true;
                m7079(c22193, EnumC11004.UNHANDLED, (EnumC14207) null);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m7092(C22193 c22193) {
        C2056 c2056 = (C2056) c22193.f71508.get();
        if (c2056 == null) {
            return;
        }
        C22939 c22939 = c2056.f6836;
        if (c22939.f74520 != c22193) {
            return;
        }
        c22193.f71510 = EnumC5039.FINISHING;
        m7089(c22193);
        DialogInterfaceC8327 dialogInterfaceC8327 = c22939.f74518;
        c22939.f74518 = null;
        c22939.f74520 = null;
        if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434()) {
            return;
        }
        dialogInterfaceC8327.dismiss();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m7090(C22193 c22193, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (dialogInterfaceC8327 == null) {
            return;
        }
        C2056 c2056 = (C2056) c22193.f71508.get();
        if (c2056 != null) {
            C22939 c22939 = c2056.f6836;
            if (c22939.f74520 == c22193 && c22939.f74518 == dialogInterfaceC8327) {
                c22939.f74518 = null;
            }
        }
        if (dialogInterfaceC8327.m22434()) {
            dialogInterfaceC8327.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7075(final C22193 c22193, final EnumC5039 enumC5039) {
        m7089(c22193);
        C2056 c2056 = (C2056) c22193.f71508.get();
        if (c2056 != null) {
            C22939 c22939 = c2056.f6836;
            if (c22939.f74520 != c22193) {
                return;
            }
            final long j = c22193.f71507 + 1;
            c22193.f71507 = j;
            c22939.f74519 = j;
            C21576.m49069(new Runnable() { // from class: l.ۖܺܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C2056.m7076(c22193, enumC5039, j);
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7076(C22193 c22193, EnumC5039 enumC5039, long j) {
        C2056 c2056 = (C2056) c22193.f71508.get();
        if (c2056 != null && m7086(c22193, false) && c22193.f71510 == enumC5039 && c22193.f71507 == j) {
            C22939 c22939 = c2056.f6836;
            if (c22939.f74520 == c22193 && c22939.f74519 == j) {
                try {
                    C13511 c13511 = new C13511(c2056.f6833, R.string.MT_Protector);
                    c13511.m33192();
                    if (m7086(c22193, false) && c22193.f71510 == enumC5039 && c22193.f71507 == j && c22939.f74520 == c22193 && c22939.f74519 == j) {
                        c22939.f74517 = c13511;
                    } else {
                        c13511.m33185();
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m7089(C22193 c22193) {
        long j = c22193.f71507 + 1;
        c22193.f71507 = j;
        C2056 c2056 = (C2056) c22193.f71508.get();
        if (c2056 == null) {
            return;
        }
        C22939 c22939 = c2056.f6836;
        if (c22939.f74520 != c22193) {
            return;
        }
        c22939.f74519 = j;
        C13511 c13511 = c22939.f74517;
        c22939.f74517 = null;
        if (c13511 != null) {
            c13511.m33185();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m7100(C22193 c22193) {
        C2056 c2056 = (C2056) c22193.f71508.get();
        if (c2056 == null || !m7088(c22193)) {
            return false;
        }
        C22939 c22939 = c2056.f6836;
        C22193 c22194 = c22939.f74520;
        if (c22194 != null && c22194 != c22193) {
            m7092(c22194);
        }
        c22939.f74520 = c22193;
        c22939.f74518 = null;
        c22939.f74517 = null;
        c22939.f74519 = c22193.f71507;
        c22193.f71509 = false;
        return true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m7088(C22193 c22193) {
        C2056 c2056 = (C2056) c22193.f71508.get();
        DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) c22193.f71512.get();
        if (c2056 == null) {
            return false;
        }
        AbstractActivityC17204 abstractActivityC17204 = c2056.f6833;
        return abstractActivityC17204.getLifecycle().mo23076() == EnumC2619.RESUMED && !abstractActivityC17204.isFinishing() && !abstractActivityC17204.isDestroyed() && dialogInterfaceC8327 != null && c2056.f6835 == dialogInterfaceC8327 && dialogInterfaceC8327.m22434();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7086(C22193 c22193, boolean z) {
        C2056 c2056;
        if (f6832 != c22193 || c22193.f71511 != f6831 || c22193.f71509 || !m7088(c22193) || (c2056 = (C2056) c22193.f71508.get()) == null) {
            return false;
        }
        C22939 c22939 = c2056.f6836;
        if (c22939.f74520 != c22193) {
            return false;
        }
        if (!z) {
            return true;
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = c22939.f74518;
        return dialogInterfaceC8327 != null && dialogInterfaceC8327.m22434();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7082(C22193 c22193, DialogInterfaceC8327 dialogInterfaceC8327, EnumC5039 enumC5039) {
        C2056 c2056;
        return dialogInterfaceC8327 != null && c22193.f71510 == enumC5039 && m7086(c22193, true) && (c2056 = (C2056) c22193.f71508.get()) != null && c2056.f6836.f74518 == dialogInterfaceC8327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7079(C22193 c22193, EnumC11004 enumC11004, EnumC14207 enumC14207) {
        if (f6832 != c22193) {
            return;
        }
        c22193.f71510 = EnumC5039.FINISHING;
        long j = c22193.f71511;
        m7092(c22193);
        f6832 = null;
        if (enumC14207 != null && j == f6831 && (enumC14207 == EnumC14207.STATE_UNKNOWN || enumC14207 == EnumC14207.ENTRY_MISSING || enumC14207 == EnumC14207.BIND_TIMEOUT || enumC14207 == EnumC14207.UNSUPPORTED_PROFILE)) {
            f6829 = false;
        }
        C22193 c22194 = f6830;
        f6830 = null;
        if (c22194 == null) {
            return;
        }
        long j2 = c22194.f71511;
        if (!(enumC11004 == EnumC11004.HANDLED && j2 == j) && j2 == f6831 && m7088(c22194)) {
            f6832 = c22194;
            if (!m7100(c22194)) {
                f6832 = null;
            } else if (enumC14207 != null) {
                m7081(c22194, false);
            } else {
                m7097(c22194, false);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7104() {
        C22193 c22193 = f6830;
        if (c22193 != null && c22193.f71508.get() == this) {
            f6830 = null;
        }
        C22193 c22194 = f6832;
        if (c22194 == null || c22194.f71508.get() != this) {
            return;
        }
        c22194.f71509 = true;
        m7092(c22194);
        if (c22194.f71506) {
            return;
        }
        m7079(c22194, EnumC11004.UNHANDLED, (EnumC14207) null);
    }
}
