package l;

import android.content.Context;
import android.os.Bundle;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11SZ */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC18275 extends AbstractActivityC4762 implements InterfaceC4056 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58311;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public C4751 f58312;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C4751 f58313;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58314;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "TerminalPreferences";
    }

    public ActivityC18275() {
        super(R.xml.MT_Protector);
    }

    @Override // l.AbstractActivityC4762, l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58314 = C12670.m31501() != ViewOnLayoutChangeListenerC3333.class;
    }

    @Override // l.AbstractActivityC4762
    /* JADX INFO: renamed from: ۙ */
    public final void mo13231(C2875 c2875, C13344 c13344) {
        C4751 c4751M31077 = c13344.m31077("term_start_path");
        C13638.requireNonNull(c4751M31077);
        C4751 c4751M31078 = c13344.m31077("term_create_session_as_root");
        C13638.requireNonNull(c4751M31078);
        C4751 c4751M31079 = c13344.m31077("term_double_confirm_to_exit");
        C13638.requireNonNull(c4751M31079);
        C4751 c4751M310710 = c13344.m31077("terminal_su2_help");
        C13638.requireNonNull(c4751M310710);
        this.f58313 = c4751M310710;
        C4751 c4751M310711 = c13344.m31077("term_ex");
        C13638.requireNonNull(c4751M310711);
        this.f58312 = c4751M310711;
        if (this.f58314) {
            c4751M31077.m13180(false);
            c4751M31078.m13180(false);
        } else {
            c4751M31077.mo13141((CharSequence) ApplicationC0716.f2988.getString("term_start_path", "/sdcard"));
            c4751M31079.m13180(false);
        }
        m42464();
    }

    @Override // l.AbstractActivityC4762
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13232(C2875 c2875, C4751 c4751, Object obj) {
        if (!(c4751 instanceof C13365)) {
            return false;
        }
        c4751.mo13141((CharSequence) obj.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m42464() {
        C3478 c3478M13121 = C4744.m13121();
        C21678 c21678M42274 = C18150.m42274();
        this.f58311 = true;
        if (c3478M13121 != null) {
            String str = c3478M13121.f12771;
            this.f58313.m13180(true);
            if (c21678M42274 == null) {
                this.f58312.mo13141((CharSequence) getString(R.string.MT_Protector, str, "unknown"));
                this.f58311 = false;
                return;
            } else if (c21678M42274.f70309 > c3478M13121.f12768) {
                this.f58312.mo13141((CharSequence) getString(R.string.MT_Protector, str, c21678M42274.f70311));
                return;
            } else {
                this.f58312.mo13141((CharSequence) getString(R.string.MT_Protector, str, c21678M42274.f70311));
                return;
            }
        }
        this.f58313.m13180(false);
        this.f58312.m13153(R.string.MT_Protector);
    }

    @Override // l.InterfaceC4056
    /* JADX INFO: renamed from: ۨ */
    public final void mo11560() {
        if (this.f58311) {
            C3478 c3478M13121 = C4744.m13121();
            C21678 c21678M42274 = C18150.m42274();
            if (c21678M42274 == null) {
                C15829.m37611(R.string.MT_Protector);
            } else if (c3478M13121 != null && c3478M13121.f12768 >= c21678M42274.f70309) {
                ActivityC14082.m34069((Context) this, C1355.m4775(), true);
            } else {
                C18150.m42278((AbstractActivityC12483) this, (Runnable) new RunnableC10098(5, this), true);
            }
        }
    }
}
