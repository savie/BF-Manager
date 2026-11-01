package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17485 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f55631;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f55632;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TextView f55633;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f55634;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f55635;

    public C17485(AbstractActivityC12483 abstractActivityC12483) {
        this.f55632 = abstractActivityC12483;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        viewM30995.setKeepScreenOn(true);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f55633 = textView;
        textView.setText("...");
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        this.f55634 = c8067.m21252();
    }

    public C17485(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f55632 = abstractActivityC12483;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f55633 = textView;
        textView.setText(i);
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21265(false);
        this.f55634 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40697(Runnable runnable) {
        this.f55635 = false;
        this.f55634.m44368(new DialogInterfaceOnKeyListenerC12547(this, runnable));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m40693() {
        return this.f55635;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40701(int i) {
        this.f55631 = false;
        C16737.m39274(new RunnableC16075(0, this), i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40690(C17485 c17485) {
        if (c17485.f55631) {
            return;
        }
        AbstractActivityC12483 abstractActivityC12483 = c17485.f55632;
        if (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
            return;
        }
        c17485.f55634.m44362();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m40704() {
        AbstractActivityC12483 abstractActivityC12483 = this.f55632;
        if (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
            return;
        }
        this.f55634.m44362();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40694() {
        this.f55631 = true;
        if (this.f55634.m44375()) {
            this.f55634.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40696(CharSequence charSequence) {
        this.f55633.setText(charSequence);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40699() {
        this.f55633.setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40695(final int i) {
        this.f55632.runOnUiThread(new Runnable() { // from class: l.֡ܿۚ
            @Override // java.lang.Runnable
            public final void run() {
                this.f2311.f55633.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40698(final String str) {
        this.f55632.runOnUiThread(new Runnable() { // from class: l.᩶ܿۚ
            @Override // java.lang.Runnable
            public final void run() {
                this.f65788.f55633.setText(str);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40703(final int i) {
        this.f55632.runOnUiThread(new Runnable() { // from class: l.ܽܿۚ
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView = this.f53708.f55633;
                textView.setSingleLine(false);
                textView.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView m40700() {
        return this.f55633;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 m40702() {
        return this.f55634;
    }
}
