package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13511 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f42958;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f42959;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f42960;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f42961;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f42962;

    public C13511(AbstractActivityC17204 abstractActivityC17204) {
        this.f42958 = abstractActivityC17204;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        viewM40395.setKeepScreenOn(true);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f42960 = textView;
        textView.setText("...");
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        this.f42959 = c2361.m7999();
    }

    public C13511(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f42958 = abstractActivityC17204;
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        this.f42960 = textView;
        textView.setText(i);
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8012(false);
        this.f42959 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33188(Runnable runnable) {
        this.f42961 = false;
        this.f42959.m22427(new DialogInterfaceOnKeyListenerC6800(this, runnable));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m33196() {
        return this.f42961;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33191(int i) {
        this.f42962 = false;
        C21576.m49069(new Runnable() { // from class: l.֨֨ᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C13511.m33182(this.f3134);
            }
        }, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33182(C13511 c13511) {
        if (c13511.f42962) {
            return;
        }
        AbstractActivityC17204 abstractActivityC17204 = c13511.f42958;
        if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
            return;
        }
        c13511.f42959.m22432();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m33192() {
        AbstractActivityC17204 abstractActivityC17204 = this.f42958;
        if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
            return;
        }
        this.f42959.m22432();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33185() {
        this.f42962 = true;
        if (this.f42959.m22434()) {
            this.f42959.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33187(CharSequence charSequence) {
        this.f42960.setText(charSequence);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m33193() {
        this.f42960.setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33186(final int i) {
        this.f42958.runOnUiThread(new Runnable() { // from class: l.ۖ֨ᩴ
            @Override // java.lang.Runnable
            public final void run() {
                this.f7500.f42960.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33189(final String str) {
        this.f42958.runOnUiThread(new Runnable() { // from class: l.ۡ֨ᩴ
            @Override // java.lang.Runnable
            public final void run() {
                this.f29397.f42960.setText(str);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33195(final int i) {
        this.f42958.runOnUiThread(new Runnable() { // from class: l.۠֨ᩴ
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView = this.f27250.f42960;
                textView.setSingleLine(false);
                textView.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextView m33190() {
        return this.f42960;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 m33194() {
        return this.f42959;
    }
}
