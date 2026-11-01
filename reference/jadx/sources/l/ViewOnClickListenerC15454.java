package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܶ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15454 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f50362;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C19107 f50363;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f50364;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f50365;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50366;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f50367;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f50368;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC15454(AbstractActivityC12483 abstractActivityC12483, InterfaceC23215 interfaceC23215) {
        this.f50365 = abstractActivityC12483;
        this.f50367 = (AbstractActivityC12483) interfaceC23215;
        this.f50363 = (C19107) abstractActivityC12483.m31016(R.id.MT_Protector);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC12483.m31016(R.id.MT_Protector).setOnClickListener(this);
        View viewM31016 = abstractActivityC12483.m31016(R.id.MT_Protector);
        viewM31016.setOnClickListener(this);
        ViewOnTouchListenerC6986.m18766(viewM31016);
        View viewM31017 = abstractActivityC12483.m31016(R.id.MT_Protector);
        viewM31017.setOnClickListener(this);
        ViewOnTouchListenerC6986.m18766(viewM31017);
        View viewM31018 = abstractActivityC12483.m31016(R.id.MT_Protector);
        viewM31018.setOnClickListener(this);
        ViewOnTouchListenerC6986.m18766(viewM31018);
        View viewM31019 = abstractActivityC12483.m31016(R.id.MT_Protector);
        viewM31019.setOnClickListener(this);
        ViewOnTouchListenerC6986.m18766(viewM31019);
        this.f50362 = ((TextView) viewM31019).getTextColors().getDefaultColor();
        this.f50366 = C16135.m38193(abstractActivityC12483.getTheme(), R.attr.MT_Protector);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.۫ܶۘ, l.᩺᩶ۜ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            i = UMErrorCode.E_UM_BE_CREATE_FAILED;
        } else if (id == R.id.MT_Protector) {
            i = 61;
        } else {
            int i2 = this.f50362;
            int i3 = this.f50366;
            if (id == R.id.MT_Protector) {
                boolean z = this.f50364;
                this.f50364 = !z;
                if (!z) {
                    ApplicationC0716.m3134(false);
                }
                TextView textView = (TextView) view;
                if (this.f50364) {
                    i2 = i3;
                }
                textView.setTextColor(i2);
            } else if (id == R.id.MT_Protector) {
                boolean z2 = this.f50368;
                this.f50368 = !z2;
                if (!z2) {
                    ApplicationC0716.m3134(false);
                }
                TextView textView2 = (TextView) view;
                if (this.f50368) {
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
                ?? r3 = this.f50367;
                if (id == R.id.MT_Protector) {
                    r3.mo9926(view);
                    return;
                } else if (id == R.id.MT_Protector) {
                    r3.mo9928();
                    return;
                }
            }
            i = 0;
        }
        if (i != 0) {
            KeyEvent keyEvent = new KeyEvent(0, i);
            C19107 c19107 = this.f50363;
            c19107.dispatchKeyEvent(keyEvent);
            c19107.dispatchKeyEvent(new KeyEvent(1, i));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36982() {
        if (!this.f50364) {
            return false;
        }
        this.f50364 = false;
        ((TextView) this.f50365.m31016(R.id.MT_Protector)).setTextColor(this.f50362);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36981() {
        if (!this.f50368) {
            return false;
        }
        this.f50368 = false;
        ((TextView) this.f50365.m31016(R.id.MT_Protector)).setTextColor(this.f50362);
        return true;
    }
}
