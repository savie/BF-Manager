package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܶܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes4.dex */
public final class C15356 extends AbstractDialogInterfaceOnClickListenerC4454 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f50031;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f50032;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18883 f50033;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15356(AbstractActivityC12483 abstractActivityC12483, C18883 c18883, AbstractActivityC12483 abstractActivityC12484, Runnable runnable) {
        super(abstractActivityC12483, "smur");
        this.f50033 = c18883;
        this.f50032 = abstractActivityC12484;
        this.f50031 = runnable;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC4454
    /* JADX INFO: renamed from: ۚ */
    public final void mo12431() {
        String strTrim = m12432().trim();
        EnumC6182 enumC6182M28042 = C11122.m28042(strTrim);
        if (enumC6182M28042 == EnumC6182.MPD_UNSUPPORTED) {
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        if (enumC6182M28042 != EnumC6182.VALID) {
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        if (strTrim.length() <= 2000) {
            m12433().m23507(strTrim);
            m12434();
        }
        C22411 c22411M43559 = this.f50033.m43559(strTrim);
        String string = UUID.randomUUID().toString();
        C12670.m31503(null, new C11122(strTrim, c22411M43559), C0252.m1693("VideoPlayerUrlArguments:", string));
        AbstractActivityC12483 abstractActivityC12483 = this.f50032;
        abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC10957.class).putExtra("bin.mt.media.extra.URL_ARGUMENTS_TOKEN", string));
        m12427();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC4454, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable = this.f50031;
        if (runnable != null) {
            runnable.run();
        }
    }
}
