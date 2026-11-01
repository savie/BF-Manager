package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ۚ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5202 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f18036;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f18037;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f18038;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f18039;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f18040;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f18041;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C5202 f18035 = new C5202(0);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C5202 f18034 = new C5202(2);

    public C5202(int i) {
        this.f18041 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C5202 m14379() {
        return f18035;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C5202 m14378() {
        return f18034;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5202 m14376(String str) {
        C5202 c5202 = new C5202(1);
        c5202.f18040 = str;
        return c5202;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5202 m14375(Exception exc) {
        Throwable cause;
        C5202 c5202 = new C5202(1);
        if (!(exc instanceof ExecutionException) || (cause = exc.getCause()) == null) {
            cause = exc;
        }
        if (cause instanceof C22356) {
            c5202.f18040 = cause.getMessage();
            c5202.f18038 = true;
            return c5202;
        }
        String message = cause.getMessage() != null ? cause.getMessage() : cause.toString();
        if ((cause instanceof FileNotFoundException) && !message.contains("EISDIR")) {
            message = "File not found: ".concat(message);
        }
        c5202.f18040 = C13012.m32189(500, message);
        String message2 = cause.getMessage();
        if (message2 != null) {
            if (!C1709.m5692() && (message2.contains(C16737.m39288(R.string.MT_Protector)) || message2.contains(C16737.m39288(R.string.MT_Protector)))) {
                c5202.f18039 = true;
                return c5202;
            }
            if (!C1709.m5693() && message2.contains(C16737.m39288(R.string.MT_Protector))) {
                c5202.f18036 = true;
                return c5202;
            }
        }
        if (!(cause instanceof C4987) && !(cause instanceof C8142)) {
            if (cause instanceof C6237) {
                c5202.f18037 = C8244.m21621((C6237) cause);
                return c5202;
            }
            c5202.f18037 = C18752.m43302(exc);
        }
        return c5202;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m14380() {
        return this.f18041 == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m14383() {
        return this.f18041 == 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m14384() {
        return this.f18041 == 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m14381() {
        return this.f18040;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14382(AbstractActivityC12483 abstractActivityC12483) {
        if (m14383()) {
            if (TextUtils.isEmpty(this.f18040)) {
                return;
            }
            if (this.f18038) {
                C15829.m37613((CharSequence) this.f18040);
                return;
            }
            String str = this.f18037;
            if (str != null && str.startsWith("AndroidDataFileUnreadableException///")) {
                C8244.m21622(abstractActivityC12483, this.f18037);
                return;
            }
            C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21261(this.f18040);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            C23250.m51308(dialogInterfaceC19356M21269);
            if (this.f18039) {
                dialogInterfaceC19356M21269.m44361().setText(R.string.MT_Protector);
                C3141.f11846.m44959(dialogInterfaceC19356M21269, new C4496(dialogInterfaceC19356M21269, 0));
                dialogInterfaceC19356M21269.m44361().setOnClickListener(new ViewOnClickListenerC13670(abstractActivityC12483, 0));
                return;
            } else if (this.f18036) {
                dialogInterfaceC19356M21269.m44361().setText(R.string.MT_Protector);
                dialogInterfaceC19356M21269.m44361().setOnClickListener(new ViewOnClickListenerC11553(abstractActivityC12483, 0));
                return;
            } else if (this.f18037 != null) {
                dialogInterfaceC19356M21269.m44361().setOnClickListener(new ViewOnClickListenerC2379(0, this, abstractActivityC12483));
                return;
            } else {
                dialogInterfaceC19356M21269.m44361().setVisibility(8);
                return;
            }
        }
        throw new RuntimeException("Not a failure result");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14377(C5202 c5202, AbstractActivityC12483 abstractActivityC12483) {
        ActivityC21135.m47562(abstractActivityC12483, c5202.f18037, C16737.m39288(R.string.MT_Protector), null, null);
    }
}
