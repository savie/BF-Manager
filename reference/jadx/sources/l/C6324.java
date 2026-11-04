package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۛۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes3.dex */
public final class C6324 extends AbstractDialogInterfaceOnClickListenerC17480 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f21431;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f21432;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14526 f21433;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6324(AbstractActivityC17204 abstractActivityC17204, C14526 c14526, AbstractActivityC17204 abstractActivityC17205, Runnable runnable) {
        super(abstractActivityC17204, "smur");
        this.f21433 = c14526;
        this.f21431 = abstractActivityC17205;
        this.f21432 = runnable;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17480
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5598() {
        String strTrim = m40985().trim();
        EnumC5183 enumC5183M50404 = C22337.m50404(strTrim);
        if (enumC5183M50404 == EnumC5183.MPD_UNSUPPORTED) {
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        if (enumC5183M50404 != EnumC5183.VALID) {
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        if (strTrim.length() <= 2000) {
            m40988().m41594(strTrim);
            m40987();
        }
        C17510 c17510M35044 = this.f21433.m35044(strTrim);
        String string = UUID.randomUUID().toString();
        C23391.m52569(null, new C22337(strTrim, c17510M35044), C25272.m56409("VideoPlayerUrlArguments:", string));
        AbstractActivityC17204 abstractActivityC17204 = this.f21431;
        abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC7135.class).putExtra("bin.mt.media.extra.URL_ARGUMENTS_TOKEN", string));
        m40981();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17480, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable = this.f21432;
        if (runnable != null) {
            runnable.run();
        }
    }
}
