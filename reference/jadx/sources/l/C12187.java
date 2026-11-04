package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ۨۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12187 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C12187 f39182 = new C12187(0);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C12187 f39183 = new C12187(2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f39184;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f39185;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f39186;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f39187;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f39188;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f39189;

    public C12187(int i) {
        this.f39186 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C12187 m30468() {
        return f39182;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C12187 m30469() {
        return f39183;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12187 m30466(String str) {
        C12187 c12187 = new C12187(1);
        c12187.f39188 = str;
        return c12187;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12187 m30465(Exception exc) {
        Throwable cause;
        C12187 c12187 = new C12187(1);
        if (!(exc instanceof ExecutionException) || (cause = exc.getCause()) == null) {
            cause = exc;
        }
        if (cause instanceof C13464) {
            c12187.f39188 = cause.getMessage();
            c12187.f39187 = true;
            return c12187;
        }
        String message = cause.getMessage() != null ? cause.getMessage() : cause.toString();
        if ((cause instanceof FileNotFoundException) && !message.contains("EISDIR")) {
            message = "File not found: ".concat(message);
        }
        c12187.f39188 = C18969.m44060(500, message);
        String message2 = cause.getMessage();
        if (message2 != null) {
            if (!C18978.m44079() && (message2.contains(C21576.m49088(R.string.MT_Protector)) || message2.contains(C21576.m49088(R.string.MT_Protector)))) {
                c12187.f39185 = true;
                return c12187;
            }
            if (!C18978.m44078() && message2.contains(C21576.m49088(R.string.MT_Protector))) {
                c12187.f39189 = true;
                return c12187;
            }
        }
        if (!(cause instanceof C4866) && !(cause instanceof C3090)) {
            if (cause instanceof C2148) {
                c12187.f39184 = C23618.m52858((C2148) cause);
                return c12187;
            }
            c12187.f39184 = C24216.m54208(exc);
        }
        return c12187;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m30474() {
        return this.f39186 == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m30472() {
        return this.f39186 == 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m30473() {
        return this.f39186 == 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30470() {
        return this.f39188;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30471(final AbstractActivityC17204 abstractActivityC17204) {
        if (m30472()) {
            if (TextUtils.isEmpty(this.f39188)) {
                return;
            }
            if (this.f39187) {
                C22673.m51154((CharSequence) this.f39188);
                return;
            }
            String str = this.f39184;
            if (str != null && str.startsWith("AndroidDataFileUnreadableException///")) {
                C23618.m52859(abstractActivityC17204, this.f39184);
                return;
            }
            C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(this.f39188);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
            C5416.m16143(dialogInterfaceC8327M8016);
            if (this.f39185) {
                dialogInterfaceC8327M8016.m22440().setText(R.string.MT_Protector);
                C7023.f23168.m40350(dialogInterfaceC8327M8016, new C15916(0, dialogInterfaceC8327M8016));
                dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩹ۜۧ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        new ViewOnClickListenerC16544(abstractActivityC17204);
                    }
                });
                return;
            } else if (this.f39189) {
                dialogInterfaceC8327M8016.m22440().setText(R.string.MT_Protector);
                dialogInterfaceC8327M8016.m22440().setOnClickListener(new ViewOnClickListenerC3238(0, abstractActivityC17204));
                return;
            } else if (this.f39184 != null) {
                dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۜۧ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C12187.m30467(this.f65374, abstractActivityC17204);
                    }
                });
                return;
            } else {
                dialogInterfaceC8327M8016.m22440().setVisibility(8);
                return;
            }
        }
        throw new RuntimeException("Not a failure result");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30467(C12187 c12187, AbstractActivityC17204 abstractActivityC17204) {
        ActivityC4300.m13685(abstractActivityC17204, c12187.f39184, C21576.m49088(R.string.MT_Protector), null, null);
    }
}
