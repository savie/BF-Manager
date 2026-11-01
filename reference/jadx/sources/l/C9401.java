package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۛ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9401 implements InterfaceC19333 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10957 f31883;

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo2570() {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo2571(int i) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo2573(boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2576(int i) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2577(int i, int i2) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2580(int i, C8750 c8750, C8750 c8751) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2588(int i, boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2595(List list) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2597(C0987 c0987) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2607(C14395 c14395) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2612(C18627 c18627) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2614(C21449 c21449) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2615(boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo2621(boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2623(int i) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2628(int i, boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2636(C15100 c15100) {
    }

    public C9401(ActivityC10957 activityC10957) {
        this.f31883 = activityC10957;
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۨ */
    public final void mo2617(int i) {
        ActivityC10957 activityC10957 = this.f31883;
        activityC10957.m27645(i);
        if (i == 4) {
            if (activityC10957.f37311) {
                if (activityC10957.f37317) {
                    return;
                }
                activityC10957.f37305 = true;
                activityC10957.m27690();
                return;
            }
            String str = activityC10957.f37277;
            if (!TextUtils.isEmpty(str)) {
                C1783.m5853(str);
            }
            if (ActivityC10957.m27551()) {
                if (activityC10957.f37348.f74612 == 0) {
                    return;
                }
                if (ActivityC10957.m27606() || !activityC10957.f37299.mo7408()) {
                    ActivityC10957.m27679(activityC10957);
                    return;
                } else {
                    if (activityC10957.f37299.size() > 1) {
                        C15829.m37618(R.string.MT_Protector);
                        return;
                    }
                    return;
                }
            }
            if (ActivityC10957.m27606()) {
                activityC10957.f37367.mo25855();
                activityC10957.f37367.mo25822();
            }
        }
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2606(C13689 c13689, int i) {
        ActivityC10957 activityC10957 = this.f31883;
        ActivityC10957.m27592(activityC10957, c13689);
        ActivityC10957.m27546(activityC10957, c13689);
        ActivityC10957.m27637(activityC10957, c13689);
        ActivityC10957.m27660(activityC10957, c13689);
        ActivityC10957.m27584(activityC10957, (CharSequence) null, c13689);
        ActivityC10957.m27669(activityC10957);
        activityC10957.m27572((CharSequence) activityC10957.getString(R.string.MT_Protector));
        activityC10957.m27654((CharSequence) activityC10957.getString(R.string.MT_Protector));
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2610(AbstractC16511 abstractC16511, int i) {
        if (abstractC16511.m38828()) {
            return;
        }
        ActivityC10957 activityC10957 = this.f31883;
        if (activityC10957.f37367 != null) {
            ActivityC10957.m27536(activityC10957);
        }
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2600(C8044 c8044) {
        ActivityC10957 activityC10957 = this.f31883;
        if (activityC10957.f37311) {
            activityC10957.m27708(true);
        }
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2609(C15100 c15100) {
        ActivityC10957 activityC10957 = this.f31883;
        ActivityC10957.m27626(activityC10957);
        if (activityC10957.f37362) {
            return;
        }
        if (C21788.m48547(c15100)) {
            activityC10957.finish();
            return;
        }
        int i = C18260.f58263;
        for (Throwable cause = c15100; cause != null; cause = cause.getCause()) {
            if (cause instanceof C18260) {
                return;
            }
        }
        if (ActivityC10957.m27604(activityC10957, c15100) || ActivityC10957.m27623(activityC10957)) {
            return;
        }
        int i2 = C19819.f63620;
        for (Throwable cause2 = c15100; cause2 != null; cause2 = cause2.getCause()) {
            if (cause2 instanceof C19819) {
                ActivityC10957.m27630(activityC10957);
                return;
            }
        }
        if (ActivityC10957.m27682(activityC10957)) {
            return;
        }
        if (activityC10957.f37311) {
            ActivityC10957.m27620(activityC10957);
            return;
        }
        if (activityC10957.f37368 || activityC10957.f37315) {
            C15829.m37618(R.string.MT_Protector);
            ActivityC10957.m27648(activityC10957);
            return;
        }
        String message = c15100.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = c15100.toString();
        }
        final InterfaceC2557 interfaceC2557Mo7410 = activityC10957.f37299.mo7410();
        if (message.contains("MediaCodecVideoRenderer error") && interfaceC2557Mo7410 != null && activityC10957.f37312 != null && (activityC10957.f37312.m28920() instanceof C21611)) {
            C8067 c8067BuildDialog = activityC10957.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۧۛ۬
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ActivityC10957 activityC10958 = this.f36833.f31883;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Uri uriM34656 = C14396.m34656(interfaceC2557Mo7410.getPath());
                    intent.setDataAndType(uriM34656, "video/*");
                    intent.addFlags(268435456);
                    C21273.m47737(intent, uriM34656);
                    try {
                        activityC10958.startActivity(intent);
                    } catch (Exception e) {
                        activityC10958.m31002(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻ۛ۬
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.f76103.m24148((C15829) null);
                }
            });
            c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.ܳۛ۬
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f46971.m24148((C15829) null);
                }
            });
            c8067BuildDialog.m21269();
            return;
        }
        m24148(C15829.m37613((CharSequence) message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m24148(final C15829 c15829) {
        final InterfaceC17693 interfaceC17693;
        if (ActivityC10957.m27551()) {
            boolean zM27606 = ActivityC10957.m27606();
            ActivityC10957 activityC10957 = this.f31883;
            if ((zM27606 || !activityC10957.f37299.mo7408()) && (interfaceC17693 = activityC10957.f37367) != null) {
                C16737.m39274(new Runnable() { // from class: l.֫ۛ۬
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC10957 activityC10958 = this.f6562.f31883;
                        C15829 c158210 = c15829;
                        if (c158210 != null) {
                            c158210.m37620();
                        }
                        InterfaceC17693 interfaceC17694 = activityC10958.f37367;
                        InterfaceC17693 interfaceC17695 = interfaceC17693;
                        if (interfaceC17695 == interfaceC17694 && !interfaceC17695.mo36792() && interfaceC17695.mo25808() == 1) {
                            ActivityC10957.m27679(activityC10958);
                        }
                    }
                }, 2000L);
            }
        }
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2598(C5221 c5221) {
        CharSequence charSequence = c5221.f18094;
        ActivityC10957 activityC10957 = this.f31883;
        ActivityC10957.m27584(activityC10957, charSequence, activityC10957.f37367 == null ? null : activityC10957.f37367.mo25853());
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2605(C13314 c13314) {
        ActivityC10957 activityC10957 = this.f31883;
        activityC10957.f37308 = c13314;
        if (activityC10957.f37289 != null && activityC10957.f37289.getVisibility() == 0) {
            activityC10957.m27652(activityC10957.f37353, activityC10957.f37302);
        }
        activityC10957.m27598(c13314);
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2611(C16841 c16841) {
        ActivityC10957 activityC10957 = this.f31883;
        if (activityC10957.f37285 != null) {
            activityC10957.f37285.m44303(ActivityC10957.m27563(activityC10957, c16841.f53889));
            activityC10957.m27535();
        }
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2601(C9456 c9456) {
        ActivityC10957 activityC10957 = this.f31883;
        if (activityC10957.f37289 != null && activityC10957.f37289.getVisibility() == 0) {
            activityC10957.m27652(activityC10957.f37353, activityC10957.f37302);
        }
        boolean zM27603 = ActivityC10957.m27603(activityC10957, c9456);
        boolean zM27640 = ActivityC10957.m27640(activityC10957, c9456);
        boolean zM27663 = ActivityC10957.m27663(activityC10957, c9456);
        activityC10957.m27706(c9456);
        if (!zM27663) {
            ActivityC10957.m27672(activityC10957);
        }
        if (!zM27603 && !zM27640) {
            ActivityC10957.m27676(activityC10957);
        }
        activityC10957.m27710(c9456);
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ܰ */
    public final void mo2637(boolean z) {
        ActivityC10957 activityC10957 = this.f31883;
        if (z) {
            activityC10957.getWindow().addFlags(128);
        } else {
            activityC10957.getWindow().clearFlags(128);
        }
    }
}
