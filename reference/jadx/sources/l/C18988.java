package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6A1 */
/* JADX INFO: loaded from: classes5.dex */
public class C18988 extends C4751 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final SeekBar.OnSeekBarChangeListener f61454;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public boolean f61455;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final View.OnKeyListener f61456;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public int f61457;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public boolean f61458;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f61459;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f61460;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f61461;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public boolean f61462;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public TextView f61463;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public SeekBar f61464;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f61465;

    public C18988(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f61454 = new C23222(this);
        this.f61456 = new ViewOnKeyListenerC15461(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23531, i, 0);
        this.f61465 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i3 = this.f61465;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.f61461) {
            this.f61461 = i2;
            mo8453();
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f61460) {
            this.f61460 = Math.min(this.f61461 - this.f61465, Math.abs(i4));
            mo8453();
        }
        this.f61459 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f61462 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f61458 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C18988(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo8452(C4170 c4170) {
        super.mo8452(c4170);
        c4170.itemView.setOnKeyListener(this.f61456);
        this.f61464 = (SeekBar) c4170.m11813(R.id.MT_Protector);
        TextView textView = (TextView) c4170.m11813(R.id.MT_Protector);
        this.f61463 = textView;
        if (this.f61462) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f61463 = null;
        }
        SeekBar seekBar = this.f61464;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f61454);
        this.f61464.setMax(this.f61461 - this.f61465);
        int i = this.f61460;
        if (i != 0) {
            this.f61464.setKeyProgressIncrement(i);
        } else {
            this.f61460 = this.f61464.getKeyProgressIncrement();
        }
        this.f61464.setProgress(this.f61457 - this.f61465);
        m43689(this.f61457);
        this.f61464.setEnabled(mo13125());
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13142(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m43687(m13132(((Integer) obj).intValue()), true);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13134(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43687(int i, boolean z) {
        int i2 = this.f61465;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f61461;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f61457) {
            this.f61457 = i;
            m43689(i);
            m13166(i);
            if (z) {
                mo8453();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43688(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f61465;
        if (progress != this.f61457) {
            m13140((Serializable) Integer.valueOf(progress));
            m43687(progress, false);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m43689(int i) {
        TextView textView = this.f61463;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ֫ */
    public final Parcelable mo13128() {
        super.mo13128();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m13175()) {
            return absSavedState;
        }
        C18282 c18282 = new C18282();
        c18282.f58330 = this.f61457;
        c18282.f58332 = this.f61465;
        c18282.f58331 = this.f61461;
        return c18282;
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo13139(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C18282.class)) {
            super.mo13139(parcelable);
            return;
        }
        C18282 c18282 = (C18282) parcelable;
        super.mo13139(c18282.getSuperState());
        this.f61457 = c18282.f58330;
        this.f61465 = c18282.f58332;
        this.f61461 = c18282.f58331;
        mo8453();
    }
}
