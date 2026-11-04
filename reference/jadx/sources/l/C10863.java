package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10863 implements InterfaceC10582 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7135 f34404;

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7200(int i) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7201(int i, int i2) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7211(int i, C22517 c22517, C22517 c22518) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7212(int i, boolean z) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7219(List list) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7222(C3125 c3125) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7223(C4617 c4617) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7224(C7445 c7445) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7234(C19378 c19378) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7239(boolean z) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo7245(boolean z) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo7247(int i) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo7252(int i, boolean z) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo7257(C8936 c8936) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo7262() {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo7263(int i) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo7265(boolean z) {
    }

    public C10863(ActivityC7135 activityC7135) {
        this.f34404 = activityC7135;
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۤ */
    public final void mo7241(int i) {
        ActivityC7135 activityC7135 = this.f34404;
        activityC7135.m19627(i);
        if (i == 4) {
            if (activityC7135.f23542) {
                if (activityC7135.f23518) {
                    return;
                }
                activityC7135.f23593 = true;
                activityC7135.m19603();
                return;
            }
            String str = activityC7135.f23546;
            if (!TextUtils.isEmpty(str)) {
                C21834.m49508(str);
            }
            if (ActivityC7135.m19660()) {
                if (activityC7135.f23571.f76056 == 0) {
                    return;
                }
                if (ActivityC7135.m19638() || !activityC7135.f23533.mo3302()) {
                    ActivityC7135.m19642(activityC7135);
                    return;
                } else {
                    if (activityC7135.f23533.size() > 1) {
                        C22673.m51159(R.string.MT_Protector);
                        return;
                    }
                    return;
                }
            }
            if (ActivityC7135.m19638()) {
                activityC7135.f23557.mo21705();
                activityC7135.f23557.mo21702();
            }
        }
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7229(C14902 c14902, int i) {
        ActivityC7135 activityC7135 = this.f34404;
        ActivityC7135.m19581(activityC7135, c14902);
        ActivityC7135.m19686(activityC7135, c14902);
        ActivityC7135.m19615(activityC7135, c14902);
        ActivityC7135.m19677(activityC7135, c14902);
        ActivityC7135.m19574(activityC7135, (CharSequence) null, c14902);
        ActivityC7135.m19645(activityC7135);
        activityC7135.m19560((CharSequence) activityC7135.getString(R.string.MT_Protector));
        activityC7135.m19672((CharSequence) activityC7135.getString(R.string.MT_Protector));
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7238(AbstractC24755 abstractC24755, int i) {
        if (abstractC24755.m55264()) {
            return;
        }
        ActivityC7135 activityC7135 = this.f34404;
        if (activityC7135.f23557 != null) {
            ActivityC7135.m19651(activityC7135);
        }
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7236(C21771 c21771) {
        ActivityC7135 activityC7135 = this.f34404;
        if (activityC7135.f23542) {
            activityC7135.m19704(true);
        }
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7225(C8936 c8936) {
        ActivityC7135 activityC7135 = this.f34404;
        ActivityC7135.m19625(activityC7135);
        if (activityC7135.f23509) {
            return;
        }
        if (C21706.m49278(c8936)) {
            activityC7135.finish();
            return;
        }
        int i = C10517.f33452;
        for (Throwable cause = c8936; cause != null; cause = cause.getCause()) {
            if (cause instanceof C10517) {
                return;
            }
        }
        if (ActivityC7135.m19591(activityC7135, c8936) || ActivityC7135.m19540(activityC7135)) {
            return;
        }
        int i2 = C9634.f31153;
        for (Throwable cause2 = c8936; cause2 != null; cause2 = cause2.getCause()) {
            if (cause2 instanceof C9634) {
                ActivityC7135.m19600(activityC7135);
                return;
            }
        }
        if (ActivityC7135.m19692(activityC7135)) {
            return;
        }
        if (activityC7135.f23542) {
            ActivityC7135.m19694(activityC7135);
            return;
        }
        if (activityC7135.f23555 || activityC7135.f23522) {
            C22673.m51159(R.string.MT_Protector);
            ActivityC7135.m19597(activityC7135);
            return;
        }
        String message = c8936.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = c8936.toString();
        }
        final InterfaceC2386 interfaceC2386Mo3303 = activityC7135.f23533.mo3303();
        if (message.contains("MediaCodecVideoRenderer error") && interfaceC2386Mo3303 != null && activityC7135.f23543 != null && (activityC7135.f23543.m25481() instanceof C11969)) {
            C2361 c2361BuildDialog = activityC7135.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜܳ֫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ActivityC7135 activityC7136 = this.f23775.f34404;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Uri uriM41230 = C17568.m41230(interfaceC2386Mo3303.getPath());
                    intent.setDataAndType(uriM41230, "video/*");
                    intent.addFlags(268435456);
                    C1112.m4126(intent, uriM41230);
                    try {
                        activityC7136.startActivity(intent);
                    } catch (Exception e) {
                        activityC7136.m40401(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ܳ֫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.f44125.m27599((C22673) null);
                }
            });
            c2361BuildDialog.m8003(new DialogInterface.OnCancelListener() { // from class: l.ۙ۫֫
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f17109.m27599((C22673) null);
                }
            });
            c2361BuildDialog.m8016();
            return;
        }
        m27599(C22673.m51154((CharSequence) message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27599(final C22673 c22673) {
        final InterfaceC5054 interfaceC5054;
        if (ActivityC7135.m19660()) {
            boolean zM19638 = ActivityC7135.m19638();
            ActivityC7135 activityC7135 = this.f34404;
            if ((zM19638 || !activityC7135.f23533.mo3302()) && (interfaceC5054 = activityC7135.f23557) != null) {
                C21576.m49069(new Runnable() { // from class: l.᩷۫֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC7135 activityC7136 = this.f71119.f34404;
                        C22673 c22674 = c22673;
                        if (c22674 != null) {
                            c22674.m51161();
                        }
                        InterfaceC5054 interfaceC5055 = activityC7136.f23557;
                        InterfaceC5054 interfaceC5056 = interfaceC5054;
                        if (interfaceC5056 == interfaceC5055 && !interfaceC5056.mo15289() && interfaceC5056.mo23580() == 1) {
                            ActivityC7135.m19642(activityC7136);
                        }
                    }
                }, 2000L);
            }
        }
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7221(C0733 c0733) {
        CharSequence charSequence = c0733.f2669;
        ActivityC7135 activityC7135 = this.f34404;
        ActivityC7135.m19574(activityC7135, charSequence, activityC7135.f23557 == null ? null : activityC7135.f23557.mo21699());
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7233(C18787 c18787) {
        ActivityC7135 activityC7135 = this.f34404;
        activityC7135.f23506 = c18787;
        if (activityC7135.f23500 != null && activityC7135.f23500.getVisibility() == 0) {
            activityC7135.m19671(activityC7135.f23590, activityC7135.f23539);
        }
        activityC7135.m19589(c18787);
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7227(C11831 c11831) {
        ActivityC7135 activityC7135 = this.f34404;
        if (activityC7135.f23550 != null) {
            activityC7135.f23550.m28244(ActivityC7135.m19551(activityC7135, c11831.f38157));
            activityC7135.m19533();
        }
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7228(C12074 c12074) {
        ActivityC7135 activityC7135 = this.f34404;
        if (activityC7135.f23500 != null && activityC7135.f23500.getVisibility() == 0) {
            activityC7135.m19671(activityC7135.f23590, activityC7135.f23539);
        }
        boolean zM19592 = ActivityC7135.m19592(activityC7135, c12074);
        boolean zM19618 = ActivityC7135.m19618(activityC7135, c12074);
        boolean zM19680 = ActivityC7135.m19680(activityC7135, c12074);
        activityC7135.m19699(c12074);
        if (!zM19680) {
            ActivityC7135.m19634(activityC7135);
        }
        if (!zM19592 && !zM19618) {
            ActivityC7135.m19654(activityC7135);
        }
        activityC7135.m19703(c12074);
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7261(boolean z) {
        ActivityC7135 activityC7135 = this.f34404;
        if (z) {
            activityC7135.getWindow().addFlags(128);
        } else {
            activityC7135.getWindow().clearFlags(128);
        }
    }
}
