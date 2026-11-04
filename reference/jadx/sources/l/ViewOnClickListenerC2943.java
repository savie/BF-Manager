package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۖ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2943 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f9625;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f9626;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8580 f9627;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f9628;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f9629;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f9630;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f9631;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC2943(AbstractActivityC17204 abstractActivityC17204, InterfaceC9654 interfaceC9654) {
        this.f9628 = abstractActivityC17204;
        this.f9630 = (AbstractActivityC17204) interfaceC9654;
        this.f9627 = (C8580) abstractActivityC17204.m40418(R.id.MT_Protector);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204.m40418(R.id.MT_Protector).setOnClickListener(this);
        View viewM40418 = abstractActivityC17204.m40418(R.id.MT_Protector);
        viewM40418.setOnClickListener(this);
        ViewOnTouchListenerC1452.m5228(viewM40418);
        View viewM40419 = abstractActivityC17204.m40418(R.id.MT_Protector);
        viewM40419.setOnClickListener(this);
        ViewOnTouchListenerC1452.m5228(viewM40419);
        View viewM404110 = abstractActivityC17204.m40418(R.id.MT_Protector);
        viewM404110.setOnClickListener(this);
        ViewOnTouchListenerC1452.m5228(viewM404110);
        View viewM404111 = abstractActivityC17204.m40418(R.id.MT_Protector);
        viewM404111.setOnClickListener(this);
        ViewOnTouchListenerC1452.m5228(viewM404111);
        this.f9629 = ((TextView) viewM404111).getTextColors().getDefaultColor();
        this.f9625 = C23434.m52632(abstractActivityC17204.getTheme(), R.attr.MT_Protector);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۡ᩷᩻, l.ܽ֡֫] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            i = UMErrorCode.E_UM_BE_CREATE_FAILED;
        } else if (id == R.id.MT_Protector) {
            i = 61;
        } else {
            int i2 = this.f9629;
            int i3 = this.f9625;
            if (id == R.id.MT_Protector) {
                boolean z = this.f9626;
                this.f9626 = !z;
                if (!z) {
                    ApplicationC17729.m41518(false);
                }
                TextView textView = (TextView) view;
                if (this.f9626) {
                    i2 = i3;
                }
                textView.setTextColor(i2);
            } else if (id == R.id.MT_Protector) {
                boolean z2 = this.f9631;
                this.f9631 = !z2;
                if (!z2) {
                    ApplicationC17729.m41518(false);
                }
                TextView textView2 = (TextView) view;
                if (this.f9631) {
                    i2 = i3;
                }
                textView2.setTextColor(i2);
            } else if (id == R.id.MT_Protector) {
                i = 19;
            } else if (id == R.id.MT_Protector) {
                i = 20;
            } else if (id == R.id.MT_Protector) {
                i = 21;
            } else if (id == R.id.MT_Protector) {
                i = 22;
            } else if (id == R.id.MT_Protector) {
                i = 122;
            } else if (id == R.id.MT_Protector) {
                i = 123;
            } else if (id == R.id.MT_Protector) {
                i = 92;
            } else if (id == R.id.MT_Protector) {
                i = 93;
            } else {
                ?? r3 = this.f9630;
                if (id == R.id.MT_Protector) {
                    r3.mo18668(view);
                    return;
                } else if (id == R.id.MT_Protector) {
                    r3.mo18670();
                    return;
                }
            }
            i = 0;
        }
        if (i != 0) {
            KeyEvent keyEvent = new KeyEvent(0, i);
            C8580 c8580 = this.f9627;
            c8580.dispatchKeyEvent(keyEvent);
            c8580.dispatchKeyEvent(new KeyEvent(1, i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9622() {
        if (!this.f9626) {
            return false;
        }
        this.f9626 = false;
        ((TextView) this.f9628.m40418(R.id.MT_Protector)).setTextColor(this.f9629);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9621() {
        if (!this.f9631) {
            return false;
        }
        this.f9631 = false;
        ((TextView) this.f9628.m40418(R.id.MT_Protector)).setTextColor(this.f9629);
        return true;
    }
}
